package com.avito.beduin.v2.avito.component.docking_badge.state;

import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoDockingBadgeState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/docking_badge/state/n;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class n implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f334337a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final EdgeType f334338b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final EdgeType f334339c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<v> f334340d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f334341e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334342f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334343g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f334344h;

    public n(@Y61.k String str, @Y61.k EdgeType edgeType, @Y61.l EdgeType edgeType2, @Y61.k com.avito.beduin.v2.theme.l<v> lVar, boolean z12, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.a<G0> aVar2, @Y61.l String str2) {
        this.f334337a = str;
        this.f334338b = edgeType;
        this.f334339c = edgeType2;
        this.f334340d = lVar;
        this.f334341e = z12;
        this.f334342f = aVar;
        this.f334343g = aVar2;
        this.f334344h = str2;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f334342f;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f334343g;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @Y61.l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        return null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.f334337a, nVar.f334337a) && this.f334338b == nVar.f334338b && this.f334339c == nVar.f334339c && L.f(this.f334340d, nVar.f334340d) && this.f334341e == nVar.f334341e && L.f(this.f334342f, nVar.f334342f) && L.f(this.f334343g, nVar.f334343g) && L.f(this.f334344h, nVar.f334344h);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334995q() {
        return this.f334344h;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334992n() {
        return this.f334341e;
    }

    public final int hashCode() {
        int iHashCode = (this.f334338b.hashCode() + (this.f334337a.hashCode() * 31)) * 31;
        EdgeType edgeType = this.f334339c;
        int i12 = androidx.appcompat.app.r.i(C31685o.g(this.f334340d, (iHashCode + (edgeType == null ? 0 : edgeType.hashCode())) * 31, 31), 31, this.f334341e);
        Y41.a<G0> aVar = this.f334342f;
        int iHashCode2 = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f334343g;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f334344h;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoDockingBadgeState(text=");
        sb2.append(this.f334337a);
        sb2.append(", endEdge=");
        sb2.append(this.f334338b);
        sb2.append(", startEdge=");
        sb2.append(this.f334339c);
        sb2.append(", style=");
        sb2.append(this.f334340d);
        sb2.append(", visible=");
        sb2.append(this.f334341e);
        sb2.append(", onShow=");
        sb2.append(this.f334342f);
        sb2.append(", onHide=");
        sb2.append(this.f334343g);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f334344h, ')');
    }
}
