package com.avito.beduin.v2.avito.component.surface.state;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.avito.component.common.h;
import com.avito.beduin.v2.avito.component.common.n;
import com.avito.beduin.v2.theme.r;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoSurfaceState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/surface/state/a;", "Lcom/avito/beduin/v2/component/box/state/a;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.beduin.v2.component.box.state.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.component.box.state.b f335213a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final r f335214b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final com.avito.beduin.v2.avito.component.gradient.content.b f335215c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final h f335216d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final h f335217e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final n f335218f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final com.avito.beduin.v2.avito.component.common.a f335219g;

    public a(@k com.avito.beduin.v2.component.box.state.b bVar, @k r rVar, @l com.avito.beduin.v2.avito.component.gradient.content.b bVar2, @l h hVar, @l h hVar2, @l n nVar, @l com.avito.beduin.v2.avito.component.common.a aVar) {
        this.f335213a = bVar;
        this.f335214b = rVar;
        this.f335215c = bVar2;
        this.f335216d = hVar;
        this.f335217e = hVar2;
        this.f335218f = nVar;
        this.f335219g = aVar;
    }

    @Override // com.avito.beduin.v2.component.box.state.a
    @l
    /* renamed from: a */
    public final ET0.b getF335571d() {
        return this.f335213a.f335571d;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> b() {
        return this.f335213a.f335573f;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> d() {
        return this.f335213a.f335574g;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        this.f335213a.getClass();
        return null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f335213a, aVar.f335213a) && L.f(this.f335214b, aVar.f335214b) && L.f(this.f335215c, aVar.f335215c) && L.f(this.f335216d, aVar.f335216d) && L.f(this.f335217e, aVar.f335217e) && L.f(this.f335218f, aVar.f335218f) && L.f(this.f335219g, aVar.f335219g);
    }

    @Override // com.avito.beduin.v2.component.box.state.a
    @k
    /* renamed from: getBackgroundColor */
    public final r getF335569b() {
        return this.f335213a.f335569b;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36245e
    @k
    /* renamed from: getChildren */
    public final ET0.a getF335568a() {
        return this.f335213a.f335568a;
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @l
    /* renamed from: getTag */
    public final String getF335439m() {
        return this.f335213a.f335575h;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible */
    public final boolean getF335436j() {
        return this.f335213a.f335570c;
    }

    public final int hashCode() {
        int iHashCode = (this.f335214b.hashCode() + (this.f335213a.hashCode() * 31)) * 31;
        com.avito.beduin.v2.avito.component.gradient.content.b bVar = this.f335215c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        h hVar = this.f335216d;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        h hVar2 = this.f335217e;
        int iHashCode4 = (iHashCode3 + (hVar2 == null ? 0 : hVar2.hashCode())) * 31;
        n nVar = this.f335218f;
        int iHashCode5 = (iHashCode4 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        com.avito.beduin.v2.avito.component.common.a aVar = this.f335219g;
        return iHashCode5 + (aVar != null ? aVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AvitoSurfaceState(boxState=" + this.f335213a + ", highlightedBackgroundColor=" + this.f335214b + ", gradient=" + this.f335215c + ", upperShadow=" + this.f335216d + ", bottomShadow=" + this.f335217e + ", shape=" + this.f335218f + ", border=" + this.f335219g + ')';
    }

    @Override // com.avito.beduin.v2.component.box.state.a
    @l
    public final Y41.a<G0> u() {
        return this.f335213a.f335572e;
    }
}
