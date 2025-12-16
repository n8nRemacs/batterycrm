package eB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CprConfigureAdvanceManualDomainModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeB0/d;", "", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f395055a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C39987c f395056b;

    public d(float f12, @l C39987c c39987c) {
        this.f395055a = f12;
        this.f395056b = c39987c;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f395055a, dVar.f395055a) == 0 && L.f(this.f395056b, dVar.f395056b);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f395055a) * 31;
        C39987c c39987c = this.f395056b;
        return iHashCode + (c39987c == null ? 0 : c39987c.hashCode());
    }

    @k
    public final String toString() {
        return "ReviewsDomainModel(price=" + this.f395055a + ", messagePatternPlurals=" + this.f395056b + ')';
    }
}
