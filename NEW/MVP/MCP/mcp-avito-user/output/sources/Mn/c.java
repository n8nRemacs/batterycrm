package MN;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.Date;
import kotlin.Metadata;

/* compiled from: FiltersCalendarPickerDateRestriction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMN/c;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Date f10662a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10663b;

    public c(@k Date date, int i12) {
        this.f10662a = date;
        this.f10663b = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f10662a.equals(cVar.f10662a) && this.f10663b == cVar.f10663b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10663b) + r.i(this.f10662a.hashCode() * 31, 31, true);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FiltersCalendarPickerDateRestriction(date=");
        sb2.append(this.f10662a);
        sb2.append(", available=true, minimalDuration=");
        return r.t(sb2, this.f10663b, ')');
    }
}
