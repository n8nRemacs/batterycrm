package bu;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DasCalendarData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbu/d;", "", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bu.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C25715d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Date f57535a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f57536b;

    public C25715d(@k ArrayList arrayList, @k Date date) {
        this.f57535a = date;
        this.f57536b = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25715d)) {
            return false;
        }
        C25715d c25715d = (C25715d) obj;
        return L.f(this.f57535a, c25715d.f57535a) && this.f57536b.equals(c25715d.f57536b);
    }

    public final int hashCode() {
        return this.f57536b.hashCode() + (this.f57535a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DasCalendarMonthInfo(firstDayDate=");
        sb2.append(this.f57535a);
        sb2.append(", days=");
        return e.p(sb2, this.f57536b, ')');
    }
}
