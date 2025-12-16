package com.avito.beduin.v2.avito.component.spinner.state;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import com.avito.beduin.v2.theme.l;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoSpinnerState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/spinner/state/a;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l<h> f335133a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f335134b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335135c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335136d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f335137e;

    public a(@Y61.k l<h> lVar, boolean z12, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.a<G0> aVar2, @Y61.l String str) {
        this.f335133a = lVar;
        this.f335134b = z12;
        this.f335135c = aVar;
        this.f335136d = aVar2;
        this.f335137e = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f335135c;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f335136d;
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
        return L.f(this.f335133a, aVar.f335133a) && this.f335134b == aVar.f335134b && L.f(this.f335135c, aVar.f335135c) && L.f(this.f335136d, aVar.f335136d) && L.f(this.f335137e, aVar.f335137e);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF336371l() {
        return this.f335137e;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF336368i() {
        return this.f335134b;
    }

    public final int hashCode() {
        int i12 = r.i(this.f335133a.hashCode() * 31, 31, this.f335134b);
        Y41.a<G0> aVar = this.f335135c;
        int iHashCode = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f335136d;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f335137e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoSpinnerState(style=");
        sb2.append(this.f335133a);
        sb2.append(", visible=");
        sb2.append(this.f335134b);
        sb2.append(", onShow=");
        sb2.append(this.f335135c);
        sb2.append(", onHide=");
        sb2.append(this.f335136d);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f335137e, ')');
    }
}
