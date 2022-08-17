package classes;
import java.time.LocalDateTime; 

public class DateTimeService {
	private LocalDateTime _localDateTime;
	
	public LocalDateTime getDateTime() {
		return _localDateTime;
	}
	
	public void setDateTime(LocalDateTime locatDateTime) {
		this._localDateTime = locatDateTime;
	}

}
