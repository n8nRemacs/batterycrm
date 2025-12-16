package VI;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectSingleValueState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVI/d;", "", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final ArrayList f17062a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f17063b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17064c;

    public d(@l ArrayList arrayList, @l Integer num, boolean z12) {
        this.f17062a = arrayList;
        this.f17063b = num;
        this.f17064c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f17062a, dVar.f17062a) && L.f(this.f17063b, dVar.f17063b) && this.f17064c == dVar.f17064c;
    }

    public final int hashCode() {
        ArrayList arrayList = this.f17062a;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        Integer num = this.f17063b;
        return Boolean.hashCode(this.f17064c) + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectSingleValueViewState(items=");
        sb2.append(this.f17062a);
        sb2.append(", selectedPosition=");
        sb2.append(this.f17063b);
        sb2.append(", isApplyButtonEnabled=");
        return r.x(sb2, this.f17064c, ')');
    }
}
