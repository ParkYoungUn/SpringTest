<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="../includes/header.jsp"%>


<div class="row">
  <div class="col-lg-12">
    <h1 class="page-header">Board Read</h1>
  </div>
  <!-- /.col-lg-12 -->
</div>
<!-- /.row -->

<div class="row">
  <div class="col-lg-12">
    <div class="panel panel-default">

      <div class="panel-heading">Board Read Page</div>
      <!-- /.panel-heading -->
      <div class="panel-body">

          <div class="form-group">
          <label>mid</label> <input class="form-control" name='mid'
            value='<c:out value="${board.mid }"/>' readonly="readonly">
        </div>

        <div class="form-group">
          <label>name</label> <input class="form-control" name='name'
            value='<c:out value="${board.name }"/>' readonly="readonly">
        </div>

        <div class="form-group">
          <label>age</label>
          <textarea class="form-control" name='age' readonly="readonly"><c:out value="${board.age}" /></textarea>
        </div>
        
        <div class="form-group">
          <label>address</label>
          <textarea class="form-control" rows="3" name='address' readonly="readonly"><c:out value="${board.address}" /></textarea>
        </div>
        
        <div class="form-group">
          <label>cphone</label>
          <textarea class="form-control" name='cphone' readonly="readonly"><c:out value="${board.cphone}" /></textarea>
        </div>


<%-- 		<button data-oper='modify' class="btn btn-default">
        <a href="/board/modify?mid=<c:out value="${board.mid}"/>">Modify</a></button>
        <button data-oper='list' class="btn btn-info">
        <a href="/board/list">List</a></button> --%>


<button data-oper='modify' class="btn btn-default">Modify</button>
<button data-oper='list' class="btn btn-info">List</button>

<%-- <form id='operForm' action="/boad/modify" method="get">
  <input type='hidden' id='mid' name='mid' value='<c:out value="${board.mid}"/>'>
</form> --%>


<form id='operForm' action="/boad/modify" method="get">
  <input type='hidden' id='mid' name='mid' value='<c:out value="${board.mid}"/>'>
  <input type='hidden' name='currentPageNo' value='<c:out value="${cri.currentPageNo}"/>'>
  <input type='hidden' name='recordsPerPage' value='<c:out value="${cri.recordsPerPage}"/>'>
  <input type='hidden' name='keyword' value='<c:out value="${cri.keyword}"/>'>
  <input type='hidden' name='type' value='<c:out value="${cri.type}"/>'>  
 
</form>

      </div>
      <!--  end panel-body -->

    </div>
    <!--  end panel-body -->
  </div>
  <!-- end panel -->
</div>
<!-- /.row -->

<script type="text/javascript">
$(document).ready(function() {
  
  var operForm = $("#operForm"); 
  
  $("button[data-oper='modify']").on("click", function(e){
    
    operForm.attr("action","/board/modify").submit();
    
  });
  
    
  $("button[data-oper='list']").on("click", function(e){
    
    operForm.find("#mid").remove();
    operForm.attr("action","/board/list")
    operForm.submit();
    
  });  
});
</script>


<%@include file="../includes/footer.jsp"%>
