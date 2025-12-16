package com.avito.beduin.v2.avito.component.radio.state;

import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoRadioState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/radio/state/a;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f334878a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f334879b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f334880c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Boolean, G0> f334881d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334882e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<l> f334883f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f334884g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334885h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334886i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f334887j;

    /* JADX WARN: Multi-variable type inference failed */
    public a(boolean z12, boolean z13, boolean z14, @Y61.l Y41.l<? super Boolean, G0> lVar, @Y61.l Y41.a<G0> aVar, @Y61.k com.avito.beduin.v2.theme.l<l> lVar2, boolean z15, @Y61.l Y41.a<G0> aVar2, @Y61.l Y41.a<G0> aVar3, @Y61.l String str) {
        this.f334878a = z12;
        this.f334879b = z13;
        this.f334880c = z14;
        this.f334881d = lVar;
        this.f334882e = aVar;
        this.f334883f = lVar2;
        this.f334884g = z15;
        this.f334885h = aVar2;
        this.f334886i = aVar3;
        this.f334887j = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f334885h;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f334886i;
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
        return this.f334878a == aVar.f334878a && this.f334879b == aVar.f334879b && this.f334880c == aVar.f334880c && L.f(this.f334881d, aVar.f334881d) && L.f(this.f334882e, aVar.f334882e) && L.f(this.f334883f, aVar.f334883f) && this.f334884g == aVar.f334884g && L.f(this.f334885h, aVar.f334885h) && L.f(this.f334886i, aVar.f334886i) && L.f(this.f334887j, aVar.f334887j);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334887j() {
        return this.f334887j;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334884g() {
        return this.f334884g;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(Boolean.hashCode(this.f334878a) * 31, 31, this.f334879b), 31, this.f334880c);
        Y41.l<Boolean, G0> lVar = this.f334881d;
        int iHashCode = (i12 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Y41.a<G0> aVar = this.f334882e;
        int i13 = androidx.appcompat.app.r.i(C31685o.g(this.f334883f, (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31, this.f334884g);
        Y41.a<G0> aVar2 = this.f334885h;
        int iHashCode2 = (i13 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.a<G0> aVar3 = this.f334886i;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        String str = this.f334887j;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoRadioState(checked=");
        sb2.append(this.f334878a);
        sb2.append(", enabled=");
        sb2.append(this.f334879b);
        sb2.append(", error=");
        sb2.append(this.f334880c);
        sb2.append(", onCheckedChange=");
        sb2.append(this.f334881d);
        sb2.append(", onClick=");
        sb2.append(this.f334882e);
        sb2.append(", style=");
        sb2.append(this.f334883f);
        sb2.append(", visible=");
        sb2.append(this.f334884g);
        sb2.append(", onShow=");
        sb2.append(this.f334885h);
        sb2.append(", onHide=");
        sb2.append(this.f334886i);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f334887j, ')');
    }
}
