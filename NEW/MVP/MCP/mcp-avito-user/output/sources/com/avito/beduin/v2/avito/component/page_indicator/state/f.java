package com.avito.beduin.v2.avito.component.page_indicator.state;

import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoPageIndicatorState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/page_indicator/state/f;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class f implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    public final int f334783a;

    /* renamed from: b, reason: collision with root package name */
    public final int f334784b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f334785c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<m> f334786d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f334787e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334788f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334789g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f334790h;

    public f(int i12, int i13, boolean z12, @Y61.k com.avito.beduin.v2.theme.l<m> lVar, boolean z13, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.a<G0> aVar2, @Y61.l String str) {
        this.f334783a = i12;
        this.f334784b = i13;
        this.f334785c = z12;
        this.f334786d = lVar;
        this.f334787e = z13;
        this.f334788f = aVar;
        this.f334789g = aVar2;
        this.f334790h = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f334788f;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f334789g;
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
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f334783a == fVar.f334783a && this.f334784b == fVar.f334784b && this.f334785c == fVar.f334785c && L.f(this.f334786d, fVar.f334786d) && this.f334787e == fVar.f334787e && L.f(this.f334788f, fVar.f334788f) && L.f(this.f334789g, fVar.f334789g) && L.f(this.f334790h, fVar.f334790h);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334932k() {
        return this.f334790h;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334929h() {
        return this.f334787e;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(C31685o.g(this.f334786d, androidx.appcompat.app.r.i(androidx.appcompat.app.r.e(this.f334784b, Integer.hashCode(this.f334783a) * 31, 31), 31, this.f334785c), 31), 31, this.f334787e);
        Y41.a<G0> aVar = this.f334788f;
        int iHashCode = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f334789g;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f334790h;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoPageIndicatorState(currentPage=");
        sb2.append(this.f334783a);
        sb2.append(", count=");
        sb2.append(this.f334784b);
        sb2.append(", highlightVisitedDots=");
        sb2.append(this.f334785c);
        sb2.append(", style=");
        sb2.append(this.f334786d);
        sb2.append(", visible=");
        sb2.append(this.f334787e);
        sb2.append(", onShow=");
        sb2.append(this.f334788f);
        sb2.append(", onHide=");
        sb2.append(this.f334789g);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f334790h, ')');
    }
}
