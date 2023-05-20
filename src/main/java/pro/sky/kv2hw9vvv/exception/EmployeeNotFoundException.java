package pro.sky.kv2hw9vvv.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException {
}
