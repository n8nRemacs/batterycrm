package bu;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbu/a;", "", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bu.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C25712a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Date f57529a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f57530b;

    public C25712a(@k Date date, boolean z12) {
        this.f57529a = date;
        this.f57530b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25712a)) {
            return false;
        }
        C25712a c25712a = (C25712a) obj;
        return L.f(this.f57529a, c25712a.f57529a) && this.f57530b == c25712a.f57530b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57530b) + (this.f57529a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarItem(date=");
        sb2.append(this.f57529a);
        sb2.append(", isAvailable=");
        return r.x(sb2, this.f57530b, ')');
    }
}
