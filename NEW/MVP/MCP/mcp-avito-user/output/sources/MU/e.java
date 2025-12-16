package mu;

import Y61.k;
import com.avito.android.date_time_picker.DateTimeWheel;
import com.avito.android.date_time_picker.a;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import kotlin.Metadata;
import lu.InterfaceC43831a;

/* compiled from: YearDelegateFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmu/e;", "Lmu/a;", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements InterfaceC44134a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a.c f414795a;

    public e(@k a.c cVar) {
        this.f414795a = cVar;
    }

    @Override // mu.InterfaceC44134a
    public final InterfaceC43831a a(DateTimeWheel dateTimeWheel) {
        a.c cVar = this.f414795a;
        long j12 = cVar.f132662d;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
        gregorianCalendar.setTimeInMillis(j12);
        int i12 = gregorianCalendar.get(1);
        Integer num = dateTimeWheel.f132590b;
        int iMax = Math.max(i12, num != null ? num.intValue() : i12);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(TimeZone.getDefault());
        gregorianCalendar2.setTimeInMillis(cVar.f132663e);
        int i13 = gregorianCalendar2.get(1);
        Integer num2 = dateTimeWheel.f132591c;
        return new lu.k(iMax, Math.min(i13, num2 != null ? num2.intValue() : i13));
    }
}
