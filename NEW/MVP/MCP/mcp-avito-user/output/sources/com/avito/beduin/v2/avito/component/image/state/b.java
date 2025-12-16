package com.avito.beduin.v2.avito.component.image.state;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoImageState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/image/state/b;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final k f334410a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f334411b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f334412c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334413d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334414e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f334415f;

    public b(@Y61.l k kVar, @Y61.k String str, boolean z12, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.a<G0> aVar2, @Y61.l String str2) {
        this.f334410a = kVar;
        this.f334411b = str;
        this.f334412c = z12;
        this.f334413d = aVar;
        this.f334414e = aVar2;
        this.f334415f = str2;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f334413d;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f334414e;
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
        return L.f(this.f334410a, bVar.f334410a) && L.f(this.f334411b, bVar.f334411b) && this.f334412c == bVar.f334412c && L.f(this.f334413d, bVar.f334413d) && L.f(this.f334414e, bVar.f334414e) && L.f(this.f334415f, bVar.f334415f);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334378e() {
        return this.f334415f;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334375b() {
        return this.f334412c;
    }

    public final int hashCode() {
        k kVar = this.f334410a;
        int i12 = androidx.appcompat.app.r.i(H.d((kVar == null ? 0 : kVar.hashCode()) * 31, 31, this.f334411b), 31, this.f334412c);
        Y41.a<G0> aVar = this.f334413d;
        int iHashCode = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f334414e;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f334415f;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoImageState(content=");
        sb2.append(this.f334410a);
        sb2.append(", contentDescription=");
        sb2.append(this.f334411b);
        sb2.append(", visible=");
        sb2.append(this.f334412c);
        sb2.append(", onShow=");
        sb2.append(this.f334413d);
        sb2.append(", onHide=");
        sb2.append(this.f334414e);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f334415f, ')');
    }
}
