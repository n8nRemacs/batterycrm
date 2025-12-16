package Tl;

import AK.c;
import Y61.k;
import Y61.l;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarMonth.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTl/b;", "", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f15833a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LocalDate f15834b;

    public b(@k ArrayList arrayList, @k LocalDate localDate) {
        this.f15833a = arrayList;
        this.f15834b = localDate;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15833a.equals(bVar.f15833a) && L.f(this.f15834b, bVar.f15834b);
    }

    public final int hashCode() {
        return this.f15834b.hashCode() + (this.f15833a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarMonth(items=");
        sb2.append(this.f15833a);
        sb2.append(", date=");
        return c.t(sb2, this.f15834b, ')');
    }
}
