package gyan.sapient.footballleague.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class RestApiError {

  private HttpStatus status;
  private String message;

}
