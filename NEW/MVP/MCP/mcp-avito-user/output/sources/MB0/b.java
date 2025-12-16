package mB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureAdvanceState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmB0/b;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Float f414373a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final c f414374b;

    public b(@l Float f12, @l c cVar) {
        this.f414373a = f12;
        this.f414374b = cVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f414373a, bVar.f414373a) && L.f(this.f414374b, bVar.f414374b);
    }

    public final int hashCode() {
        Float f12 = this.f414373a;
        int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
        c cVar = this.f414374b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CpxConfigureAdvanceNavBar(progress=" + this.f414373a + ", button=" + this.f414374b + ')';
    }
}
