package com.avito.beduin.v2.avito.component.map.state;

import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AvitoMapState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/a;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.avito.component.map.state.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C36217a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.map.state.style.a> f334673a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ET0.a<Pin> f334674b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final N f334675c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final E f334676d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final z f334677e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.l<x, G0> f334678f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Pin, G0> f334679g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334680h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Y41.l<MoveReason, G0> f334681i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Y41.r<MoveReason, u, x, Float, G0> f334682j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f334683k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f334684l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f334685m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334686n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334687o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final String f334688p;

    /* JADX WARN: Multi-variable type inference failed */
    public C36217a(@Y61.k com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.map.state.style.a> lVar, @Y61.k ET0.a<Pin> aVar, @Y61.l N n12, @Y61.l E e12, @Y61.l z zVar, @Y61.l Y41.l<? super x, G0> lVar2, @Y61.l Y41.l<? super Pin, G0> lVar3, @Y61.l Y41.a<G0> aVar2, @Y61.l Y41.l<? super MoveReason, G0> lVar4, @Y61.l Y41.r<? super MoveReason, ? super u, ? super x, ? super Float, G0> rVar, boolean z12, boolean z13, boolean z14, @Y61.l Y41.a<G0> aVar3, @Y61.l Y41.a<G0> aVar4, @Y61.l String str) {
        this.f334673a = lVar;
        this.f334674b = aVar;
        this.f334675c = n12;
        this.f334676d = e12;
        this.f334677e = zVar;
        this.f334678f = lVar2;
        this.f334679g = lVar3;
        this.f334680h = aVar2;
        this.f334681i = lVar4;
        this.f334682j = rVar;
        this.f334683k = z12;
        this.f334684l = z13;
        this.f334685m = z14;
        this.f334686n = aVar3;
        this.f334687o = aVar4;
        this.f334688p = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f334686n;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f334687o;
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
        if (!(obj instanceof C36217a)) {
            return false;
        }
        C36217a c36217a = (C36217a) obj;
        return kotlin.jvm.internal.L.f(this.f334673a, c36217a.f334673a) && kotlin.jvm.internal.L.f(this.f334674b, c36217a.f334674b) && kotlin.jvm.internal.L.f(this.f334675c, c36217a.f334675c) && kotlin.jvm.internal.L.f(this.f334676d, c36217a.f334676d) && kotlin.jvm.internal.L.f(this.f334677e, c36217a.f334677e) && kotlin.jvm.internal.L.f(this.f334678f, c36217a.f334678f) && kotlin.jvm.internal.L.f(this.f334679g, c36217a.f334679g) && kotlin.jvm.internal.L.f(this.f334680h, c36217a.f334680h) && kotlin.jvm.internal.L.f(this.f334681i, c36217a.f334681i) && kotlin.jvm.internal.L.f(this.f334682j, c36217a.f334682j) && this.f334683k == c36217a.f334683k && this.f334684l == c36217a.f334684l && this.f334685m == c36217a.f334685m && kotlin.jvm.internal.L.f(this.f334686n, c36217a.f334686n) && kotlin.jvm.internal.L.f(this.f334687o, c36217a.f334687o) && kotlin.jvm.internal.L.f(this.f334688p, c36217a.f334688p);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334014j() {
        return this.f334688p;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334011g() {
        return this.f334685m;
    }

    public final int hashCode() {
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f334674b.f4014b, this.f334673a.hashCode() * 31, 31);
        N n12 = this.f334675c;
        int iHashCode = (iG2 + (n12 == null ? 0 : n12.hashCode())) * 31;
        E e12 = this.f334676d;
        int iHashCode2 = (iHashCode + (e12 == null ? 0 : e12.hashCode())) * 31;
        z zVar = this.f334677e;
        int iHashCode3 = (iHashCode2 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        Y41.l<x, G0> lVar = this.f334678f;
        int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Y41.l<Pin, G0> lVar2 = this.f334679g;
        int iHashCode5 = (iHashCode4 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        Y41.a<G0> aVar = this.f334680h;
        int iHashCode6 = (iHashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.l<MoveReason, G0> lVar3 = this.f334681i;
        int iHashCode7 = (iHashCode6 + (lVar3 == null ? 0 : lVar3.hashCode())) * 31;
        Y41.r<MoveReason, u, x, Float, G0> rVar = this.f334682j;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode7 + (rVar == null ? 0 : rVar.hashCode())) * 31, 31, this.f334683k), 31, this.f334684l), 31, this.f334685m);
        Y41.a<G0> aVar2 = this.f334686n;
        int iHashCode8 = (i12 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.a<G0> aVar3 = this.f334687o;
        int iHashCode9 = (iHashCode8 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        String str = this.f334688p;
        return iHashCode9 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoMapState(style=");
        sb2.append(this.f334673a);
        sb2.append(", pins=");
        sb2.append(this.f334674b);
        sb2.append(", userLocation=");
        sb2.append(this.f334675c);
        sb2.append(", polygon=");
        sb2.append(this.f334676d);
        sb2.append(", moveToState=");
        sb2.append(this.f334677e);
        sb2.append(", onClick=");
        sb2.append(this.f334678f);
        sb2.append(", onPinClick=");
        sb2.append(this.f334679g);
        sb2.append(", onMovedTo=");
        sb2.append(this.f334680h);
        sb2.append(", onMoveStart=");
        sb2.append(this.f334681i);
        sb2.append(", onMoveEnd=");
        sb2.append(this.f334682j);
        sb2.append(", isMoveEnabled=");
        sb2.append(this.f334683k);
        sb2.append(", isZoomEnabled=");
        sb2.append(this.f334684l);
        sb2.append(", visible=");
        sb2.append(this.f334685m);
        sb2.append(", onShow=");
        sb2.append(this.f334686n);
        sb2.append(", onHide=");
        sb2.append(this.f334687o);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f334688p, ')');
    }
}
