package iC0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptNavBarDomainV2.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiC0/d;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Float f398442a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C41267a f398443b;

    public d(@l Float f12, @l C41267a c41267a) {
        this.f398442a = f12;
        this.f398443b = c41267a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f398442a, dVar.f398442a) && L.f(this.f398443b, dVar.f398443b);
    }

    public final int hashCode() {
        Float f12 = this.f398442a;
        int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
        C41267a c41267a = this.f398443b;
        return iHashCode + (c41267a != null ? c41267a.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "TariffCptNavBarDomainV2(progress=" + this.f398442a + ", button=" + this.f398443b + ')';
    }
}
