package com.avito.beduin.v2.avito.component.graphic_element;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import com.avito.beduin.v2.theme.r;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoGraphicElementState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/graphic_element/a;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final GraphicElement f334389a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final r f334390b;

    /* renamed from: c, reason: collision with root package name */
    public final float f334391c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f334392d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Y41.a<G0> f334393e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Y41.a<G0> f334394f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f334395g;

    public a(@k GraphicElement graphicElement, @k r rVar, float f12, boolean z12, @l Y41.a<G0> aVar, @l Y41.a<G0> aVar2, @l String str) {
        this.f334389a = graphicElement;
        this.f334390b = rVar;
        this.f334391c = f12;
        this.f334392d = z12;
        this.f334393e = aVar;
        this.f334394f = aVar2;
        this.f334395g = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> b() {
        return this.f334393e;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> d() {
        return this.f334394f;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
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
        return this.f334389a == aVar.f334389a && L.f(this.f334390b, aVar.f334390b) && Float.compare(this.f334391c, aVar.f334391c) == 0 && this.f334392d == aVar.f334392d && L.f(this.f334393e, aVar.f334393e) && L.f(this.f334394f, aVar.f334394f) && L.f(this.f334395g, aVar.f334395g);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @l
    /* renamed from: getTag, reason: from getter */
    public final String getF336371l() {
        return this.f334395g;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF336368i() {
        return this.f334392d;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.d(this.f334391c, (this.f334390b.hashCode() + (this.f334389a.hashCode() * 31)) * 31, 31), 31, this.f334392d);
        Y41.a<G0> aVar = this.f334393e;
        int iHashCode = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f334394f;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f334395g;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoGraphicElementState(name=");
        sb2.append(this.f334389a);
        sb2.append(", color=");
        sb2.append(this.f334390b);
        sb2.append(", rotation=");
        sb2.append(this.f334391c);
        sb2.append(", visible=");
        sb2.append(this.f334392d);
        sb2.append(", onShow=");
        sb2.append(this.f334393e);
        sb2.append(", onHide=");
        sb2.append(this.f334394f);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f334395g, ')');
    }
}
