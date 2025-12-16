package MN;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FiltersCalendarPickerMonth.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMN/f;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f10666a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Date f10667b;

    public f(@k ArrayList arrayList, @k Date date) {
        this.f10666a = arrayList;
        this.f10667b = date;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f10666a.equals(fVar.f10666a) && L.f(this.f10667b, fVar.f10667b);
    }

    public final int hashCode() {
        return this.f10667b.hashCode() + (this.f10666a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FiltersCalendarPickerMonth(items=");
        sb2.append(this.f10666a);
        sb2.append(", date=");
        return com.avito.android.bxcontent.mvi.entity.f.n(sb2, this.f10667b, ')');
    }
}
