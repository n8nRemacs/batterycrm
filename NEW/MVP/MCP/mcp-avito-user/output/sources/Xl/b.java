package Xl;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: DateUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_calendar-select_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Object f19053a = P0.g(new Q(1L, "Январь"), new Q(2L, "Февраль"), new Q(3L, "Март"), new Q(4L, "Апрель"), new Q(5L, "Май"), new Q(6L, "Июнь"), new Q(7L, "Июль"), new Q(8L, "Август"), new Q(9L, "Сентябрь"), new Q(10L, "Октябрь"), new Q(11L, "Ноябрь"), new Q(12L, "Декабрь"));

    @l
    public static final LocalDate a(@k String str) {
        try {
            return LocalDate.parse(str, DateTimeFormatter.ofPattern(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT));
        } catch (Exception unused) {
            return null;
        }
    }
}
