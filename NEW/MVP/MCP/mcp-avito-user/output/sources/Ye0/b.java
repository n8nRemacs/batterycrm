package YE0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelOnboardingBlocksInfo.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYE0/b;", "", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final i f19387a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final h f19388b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final e f19389c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final c f19390d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a f19391e;

    public b(@l i iVar, @l h hVar, @l e eVar, @k c cVar, @k a aVar) {
        this.f19387a = iVar;
        this.f19388b = hVar;
        this.f19389c = eVar;
        this.f19390d = cVar;
        this.f19391e = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f19387a, bVar.f19387a) && L.f(this.f19388b, bVar.f19388b) && L.f(this.f19389c, bVar.f19389c) && L.f(this.f19390d, bVar.f19390d) && L.f(this.f19391e, bVar.f19391e);
    }

    public final int hashCode() {
        i iVar = this.f19387a;
        int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        h hVar = this.f19388b;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        e eVar = this.f19389c;
        return this.f19391e.hashCode() + ((this.f19390d.hashCode() + ((iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "TravelOnboardingBlocksInfo(headerBlock=" + this.f19387a + ", disclaimerBlock=" + this.f19388b + ", conditionsBlock=" + this.f19389c + ", buttonsBlock=" + this.f19390d + ", analyticsInfo=" + this.f19391e + ')';
    }
}
