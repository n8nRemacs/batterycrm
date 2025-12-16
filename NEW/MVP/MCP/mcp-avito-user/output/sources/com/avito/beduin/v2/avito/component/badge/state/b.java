package com.avito.beduin.v2.avito.component.badge.state;

import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoBadgeState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/badge/state/b;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f333794a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f333795b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final a f333796c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f333797d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f333798e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<l> f333799f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f333800g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f333801h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f333802i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f333803j;

    public b(@Y61.l String str, @Y61.l Integer num, @Y61.l a aVar, boolean z12, boolean z13, @Y61.k com.avito.beduin.v2.theme.l<l> lVar, boolean z14, @Y61.l Y41.a<G0> aVar2, @Y61.l Y41.a<G0> aVar3, @Y61.l String str2) {
        this.f333794a = str;
        this.f333795b = num;
        this.f333796c = aVar;
        this.f333797d = z12;
        this.f333798e = z13;
        this.f333799f = lVar;
        this.f333800g = z14;
        this.f333801h = aVar2;
        this.f333802i = aVar3;
        this.f333803j = str2;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f333801h;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f333802i;
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
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f333794a, bVar.f333794a) && L.f(this.f333795b, bVar.f333795b) && L.f(this.f333796c, bVar.f333796c) && this.f333797d == bVar.f333797d && this.f333798e == bVar.f333798e && L.f(this.f333799f, bVar.f333799f) && this.f333800g == bVar.f333800g && L.f(this.f333801h, bVar.f333801h) && L.f(this.f333802i, bVar.f333802i) && L.f(this.f333803j, bVar.f333803j);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF335439m() {
        return this.f333803j;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF335436j() {
        return this.f333800g;
    }

    public final int hashCode() {
        String str = this.f333794a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f333795b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        a aVar = this.f333796c;
        int i12 = androidx.appcompat.app.r.i(C31685o.g(this.f333799f, androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f333797d), 31, this.f333798e), 31), 31, this.f333800g);
        Y41.a<G0> aVar2 = this.f333801h;
        int iHashCode3 = (i12 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.a<G0> aVar3 = this.f333802i;
        int iHashCode4 = (iHashCode3 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        String str2 = this.f333803j;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoBadgeState(text=");
        sb2.append(this.f333794a);
        sb2.append(", maxNumber=");
        sb2.append(this.f333795b);
        sb2.append(", border=");
        sb2.append(this.f333796c);
        sb2.append(", shouldShowAnimated=");
        sb2.append(this.f333797d);
        sb2.append(", isPulsating=");
        sb2.append(this.f333798e);
        sb2.append(", style=");
        sb2.append(this.f333799f);
        sb2.append(", visible=");
        sb2.append(this.f333800g);
        sb2.append(", onShow=");
        sb2.append(this.f333801h);
        sb2.append(", onHide=");
        sb2.append(this.f333802i);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f333803j, ')');
    }
}
