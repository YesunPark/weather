package zerobase.weather.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // 전역 예외처리
public class GlobalExceptionHandler {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 서버에 문제가 있는 거니까(500) 이렇게 설정
    @ExceptionHandler(Exception.class) // 모든 예외에서 동작하기 위해 Exception.class 넣음
    public Exception handleAllException() {
        System.out.println("=== error from GlobalException ==="); // 예시라서 간단하게
        return new Exception();
    }
}
