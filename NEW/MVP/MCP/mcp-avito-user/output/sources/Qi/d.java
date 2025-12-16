package QI;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EnterDataState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQI/d;", "", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final ArrayList f13670a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13671b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13672c;

    public d(@l ArrayList arrayList, boolean z12, boolean z13) {
        this.f13670a = arrayList;
        this.f13671b = z12;
        this.f13672c = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f13670a, dVar.f13670a) && this.f13671b == dVar.f13671b && this.f13672c == dVar.f13672c;
    }

    public final int hashCode() {
        ArrayList arrayList = this.f13670a;
        return Boolean.hashCode(this.f13672c) + r.i((arrayList == null ? 0 : arrayList.hashCode()) * 31, 31, this.f13671b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EnterDataViewState(items=");
        sb2.append(this.f13670a);
        sb2.append(", isApplyButtonEnabled=");
        sb2.append(this.f13671b);
        sb2.append(", isApplyButtonVisible=");
        return r.x(sb2, this.f13672c, ')');
    }
}
