package lu;

import com.avito.android.lib.design.picker.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.u0;
import lu.InterfaceC43831a;

/* compiled from: HourMinuteDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llu/f;", "Llu/a;", "<init>", "()V", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements InterfaceC43831a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final f f414230a = new f();

    public static com.avito.android.lib.design.picker.k c(int i12, int i13) {
        long seconds = TimeUnit.MINUTES.toSeconds(i13) + TimeUnit.HOURS.toSeconds(i12);
        u0 u0Var = u0.f406856a;
        String str = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1));
        return new com.avito.android.lib.design.picker.k(Long.valueOf(seconds), i12 + ':' + str);
    }

    @Override // lu.InterfaceC43831a
    @Y61.k
    public final com.avito.android.lib.design.picker.k a(@Y61.k GregorianCalendar gregorianCalendar) {
        return c(gregorianCalendar.get(11), gregorianCalendar.get(12) < 30 ? 0 : 30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lu.InterfaceC43831a
    public final void b(@Y61.k com.avito.android.lib.design.picker.k<?> kVar, @Y61.k Calendar calendar) {
        T t12 = kVar.f180046a;
        Long l12 = t12 instanceof Long ? (Long) t12 : null;
        if (l12 != null) {
            long jLongValue = l12.longValue();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long hours = timeUnit.toHours(jLongValue);
            calendar.set(11, (int) hours);
            calendar.set(12, (int) timeUnit.toMinutes(jLongValue - TimeUnit.HOURS.toSeconds(hours)));
        }
    }

    @Override // lu.InterfaceC43831a
    @Y61.k
    public final ArrayList<com.avito.android.lib.design.picker.k<?>> getData() {
        ArrayList<com.avito.android.lib.design.picker.k<?>> arrayList = new ArrayList<>(48);
        for (int i12 = 0; i12 < 24; i12++) {
            arrayList.add(c(i12, 0));
            arrayList.add(c(i12, 30));
        }
        return arrayList;
    }

    @Override // lu.InterfaceC43831a
    @Y61.k
    public final m getStyle() {
        return InterfaceC43831a.C11806a.a();
    }
}
