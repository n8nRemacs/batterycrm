package YE0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelOnboardingBlocksInfo.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYE0/c;", "", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f19392a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final j f19393b;

    public c(@k d dVar, @l j jVar) {
        this.f19392a = dVar;
        this.f19393b = jVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f19392a, cVar.f19392a) && L.f(this.f19393b, cVar.f19393b);
    }

    public final int hashCode() {
        int iHashCode = this.f19392a.hashCode() * 31;
        j jVar = this.f19393b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    @k
    public final String toString() {
        return "TravelOnboardingButtonsBlock(closeButton=" + this.f19392a + ", redirectButton=" + this.f19393b + ')';
    }
}
