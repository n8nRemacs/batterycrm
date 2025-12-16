package Ba1;

import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/* loaded from: classes9.dex */
public abstract class p {
    public static final String a(String str) {
        try {
            DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT);
            return LocalDate.parse(str, dateTimeFormatterOfPattern).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (Exception unused) {
            return str;
        }
    }
}
