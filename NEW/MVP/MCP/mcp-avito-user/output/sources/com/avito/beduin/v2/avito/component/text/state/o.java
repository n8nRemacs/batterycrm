package com.avito.beduin.v2.avito.component.text.state;

import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import java.util.Arrays;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoWebViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/text/state/o;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class o implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f335363a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f335364b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final B f335365c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final F f335366d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final WebsiteDataStore f335367e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f335368f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335369g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Boolean, G0> f335370h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Map<String, String>, G0> f335371i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Y41.l<String, G0> f335372j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f335373k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335374l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335375m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> f335376n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final String f335377o;

    /* JADX WARN: Multi-variable type inference failed */
    public o(@Y61.k String str, boolean z12, @Y61.l B b12, @Y61.l F f12, @Y61.l WebsiteDataStore websiteDataStore, boolean z13, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.l<? super Boolean, G0> lVar, @Y61.l Y41.l<? super Map<String, String>, G0> lVar2, @Y61.l Y41.l<? super String, G0> lVar3, boolean z14, @Y61.l Y41.a<G0> aVar2, @Y61.l Y41.a<G0> aVar3, @Y61.l com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar, @Y61.l String str2) {
        this.f335363a = str;
        this.f335364b = z12;
        this.f335365c = b12;
        this.f335366d = f12;
        this.f335367e = websiteDataStore;
        this.f335368f = z13;
        this.f335369g = aVar;
        this.f335370h = lVar;
        this.f335371i = lVar2;
        this.f335372j = lVar3;
        this.f335373k = z14;
        this.f335374l = aVar2;
        this.f335375m = aVar3;
        this.f335376n = cVar;
        this.f335377o = str2;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f335374l;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f335375m;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @Y61.l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        return this.f335376n;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return L.f(this.f335363a, oVar.f335363a) && this.f335364b == oVar.f335364b && L.f(this.f335365c, oVar.f335365c) && L.f(this.f335366d, oVar.f335366d) && this.f335367e == oVar.f335367e && this.f335368f == oVar.f335368f && L.f(this.f335369g, oVar.f335369g) && L.f(this.f335370h, oVar.f335370h) && L.f(this.f335371i, oVar.f335371i) && L.f(this.f335372j, oVar.f335372j) && this.f335373k == oVar.f335373k && L.f(this.f335374l, oVar.f335374l) && L.f(this.f335375m, oVar.f335375m) && L.f(this.f335376n, oVar.f335376n) && L.f(this.f335377o, oVar.f335377o);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334378e() {
        return this.f335377o;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334375b() {
        return this.f335373k;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(this.f335363a.hashCode() * 31, 31, this.f335364b);
        B b12 = this.f335365c;
        int iHashCode = (i12 + (b12 == null ? 0 : b12.hashCode())) * 31;
        F f12 = this.f335366d;
        int iHashCode2 = (iHashCode + (f12 == null ? 0 : f12.f335324a.hashCode())) * 31;
        WebsiteDataStore websiteDataStore = this.f335367e;
        int i13 = androidx.appcompat.app.r.i((iHashCode2 + (websiteDataStore == null ? 0 : websiteDataStore.hashCode())) * 31, 31, this.f335368f);
        Y41.a<G0> aVar = this.f335369g;
        int iHashCode3 = (i13 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.l<Boolean, G0> lVar = this.f335370h;
        int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Y41.l<Map<String, String>, G0> lVar2 = this.f335371i;
        int iHashCode5 = (iHashCode4 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        Y41.l<String, G0> lVar3 = this.f335372j;
        int i14 = androidx.appcompat.app.r.i((iHashCode5 + (lVar3 == null ? 0 : lVar3.hashCode())) * 31, 31, this.f335373k);
        Y41.a<G0> aVar2 = this.f335374l;
        int iHashCode6 = (i14 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.a<G0> aVar3 = this.f335375m;
        int iHashCode7 = (iHashCode6 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar = this.f335376n;
        int iHashCode8 = (iHashCode7 + (cVar == null ? 0 : Arrays.hashCode(cVar.f336915a))) * 31;
        String str = this.f335377o;
        return iHashCode8 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoWebViewState(url=");
        sb2.append(this.f335363a);
        sb2.append(", enabled=");
        sb2.append(this.f335364b);
        sb2.append(", errorPlaceholder=");
        sb2.append(this.f335365c);
        sb2.append(", loadingPlaceholder=");
        sb2.append(this.f335366d);
        sb2.append(", websiteDataStore=");
        sb2.append(this.f335367e);
        sb2.append(", allowsContentJavaScript=");
        sb2.append(this.f335368f);
        sb2.append(", onSuccess=");
        sb2.append(this.f335369g);
        sb2.append(", onError=");
        sb2.append(this.f335370h);
        sb2.append(", onPostMessage=");
        sb2.append(this.f335371i);
        sb2.append(", onDeeplinkRedirect=");
        sb2.append(this.f335372j);
        sb2.append(", visible=");
        sb2.append(this.f335373k);
        sb2.append(", onShow=");
        sb2.append(this.f335374l);
        sb2.append(", onHide=");
        sb2.append(this.f335375m);
        sb2.append(", markers=");
        sb2.append(this.f335376n);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f335377o, ')');
    }
}
