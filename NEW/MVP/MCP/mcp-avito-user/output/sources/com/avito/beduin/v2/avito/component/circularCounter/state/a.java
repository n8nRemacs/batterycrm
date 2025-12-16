package com.avito.beduin.v2.avito.component.circularCounter.state;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoCircularCounterState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/circularCounter/state/a;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f334089a;

    /* renamed from: b, reason: collision with root package name */
    public final float f334090b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<e> f334091c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f334092d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334093e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334094f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f334095g;

    public a(@Y61.k g gVar, float f12, @Y61.k com.avito.beduin.v2.theme.l<e> lVar, boolean z12, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.a<G0> aVar2, @Y61.l String str) {
        this.f334089a = gVar;
        this.f334090b = f12;
        this.f334091c = lVar;
        this.f334092d = z12;
        this.f334093e = aVar;
        this.f334094f = aVar2;
        this.f334095g = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f334093e;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f334094f;
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f334089a, aVar.f334089a) && Float.compare(this.f334090b, aVar.f334090b) == 0 && L.f(this.f334091c, aVar.f334091c) && this.f334092d == aVar.f334092d && L.f(this.f334093e, aVar.f334093e) && L.f(this.f334094f, aVar.f334094f) && L.f(this.f334095g, aVar.f334095g);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF335439m() {
        return this.f334095g;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF335436j() {
        return this.f334092d;
    }

    public final int hashCode() {
        int i12 = r.i(C31685o.g(this.f334091c, r.d(this.f334090b, this.f334089a.hashCode() * 31, 31), 31), 31, this.f334092d);
        Y41.a<G0> aVar = this.f334093e;
        int iHashCode = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f334094f;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f334095g;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoCircularCounterState(content=");
        sb2.append(this.f334089a);
        sb2.append(", progress=");
        sb2.append(this.f334090b);
        sb2.append(", style=");
        sb2.append(this.f334091c);
        sb2.append(", visible=");
        sb2.append(this.f334092d);
        sb2.append(", onShow=");
        sb2.append(this.f334093e);
        sb2.append(", onHide=");
        sb2.append(this.f334094f);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f334095g, ')');
    }
}
