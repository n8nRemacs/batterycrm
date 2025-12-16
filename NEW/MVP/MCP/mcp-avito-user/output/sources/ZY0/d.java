package Zy0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrInsuranceState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZy0/d;", "", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f20613a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20614b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k List<? extends com.avito.conveyor_item.a> list, boolean z12) {
        this.f20613a = list;
        this.f20614b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f20613a, dVar.f20613a) && this.f20614b == dVar.f20614b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20614b) + (this.f20613a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrInsuranceViewState(items=");
        sb2.append(this.f20613a);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f20614b, ')');
    }
}
