package com.codewithhim.fullstack_backend.exception;

public class UserNotFoundExceptions extends RuntimeException{
   public UserNotFoundExceptions(Long id){
       super("Could not found the user wiht id"+id);
   }

}
