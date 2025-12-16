package lu;

import com.avito.android.lib.design.picker.m;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import kotlin.Metadata;
import lu.InterfaceC43831a;

/* compiled from: MonthDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llu/j;", "Llu/a;", "<init>", "()V", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements InterfaceC43831a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final j f414233a = new j();

    @Override // lu.InterfaceC43831a
    @Y61.k
    public final com.avito.android.lib.design.picker.k a(@Y61.k GregorianCalendar gregorianCalendar) {
        com.avito.android.lib.design.picker.k.f180042c.getClass();
        return com.avito.android.lib.design.picker.k.f180043d.get(gregorianCalendar.get(2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lu.InterfaceC43831a
    public final void b(@Y61.k com.avito.android.lib.design.picker.k<?> kVar, @Y61.k Calendar calendar) {
        calendar.set(2, ((Integer) kVar.f180046a).intValue());
    }

    @Override // lu.InterfaceC43831a
    @Y61.k
    public final ArrayList<com.avito.android.lib.design.picker.k<?>> getData() {
        com.avito.android.lib.design.picker.k.f180042c.getClass();
        return com.avito.android.lib.design.picker.k.f180043d;
    }

    @Override // lu.InterfaceC43831a
    @Y61.k
    public final m getStyle() {
        return InterfaceC43831a.C11806a.a();
    }
}
