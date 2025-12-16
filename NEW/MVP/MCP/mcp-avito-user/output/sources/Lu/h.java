package lu;

import com.avito.android.lib.design.picker.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import kotlin.ranges.l;
import kotlin.ranges.s;
import lu.InterfaceC43831a;

/* compiled from: MinuteDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llu/h;", "Llu/a;", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements InterfaceC43831a {

    /* renamed from: a, reason: collision with root package name */
    public final int f414231a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.ranges.j f414232b;

    public h(int i12) {
        this.f414231a = i12;
        this.f414232b = s.p(new l(0, 59, 1), i12);
    }

    @Override // lu.InterfaceC43831a
    @Y61.k
    public final com.avito.android.lib.design.picker.k a(@Y61.k GregorianCalendar gregorianCalendar) {
        int i12 = gregorianCalendar.get(12);
        int i13 = this.f414231a;
        int iA2 = (kotlin.math.b.a((i12 % i13) / 10.0d) + (i12 / i13)) * i13;
        u0 u0Var = u0.f406856a;
        return new com.avito.android.lib.design.picker.k(Integer.valueOf(iA2), String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iA2)}, 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lu.InterfaceC43831a
    public final void b(@Y61.k com.avito.android.lib.design.picker.k<?> kVar, @Y61.k Calendar calendar) {
        calendar.set(12, ((Integer) kVar.f180046a).intValue());
    }

    @Override // lu.InterfaceC43831a
    @Y61.k
    public final ArrayList<com.avito.android.lib.design.picker.k<?>> getData() {
        kotlin.ranges.j jVar = this.f414232b;
        ArrayList<com.avito.android.lib.design.picker.k<?>> arrayList = new ArrayList<>(jVar.isEmpty() ? 0 : ((jVar.f406906c - jVar.f406905b) / jVar.f406907d) + 1);
        kotlin.ranges.k it = jVar.iterator();
        while (it.f406910d) {
            int iA2 = it.a();
            u0 u0Var = u0.f406856a;
            arrayList.add(new com.avito.android.lib.design.picker.k<>(Integer.valueOf(iA2), String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iA2)}, 1))));
        }
        return arrayList;
    }

    @Override // lu.InterfaceC43831a
    @Y61.k
    public final m getStyle() {
        return InterfaceC43831a.C11806a.a();
    }
}
