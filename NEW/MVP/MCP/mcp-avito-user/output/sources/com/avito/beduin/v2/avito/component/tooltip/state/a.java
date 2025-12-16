package com.avito.beduin.v2.avito.component.tooltip.state;

import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoTooltipState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/tooltip/state/a;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TooltipPosition f335427a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f335428b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f335429c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final p f335430d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335431e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final r f335432f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<n> f335433g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f335434h;

    /* renamed from: i, reason: collision with root package name */
    public final int f335435i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f335436j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335437k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335438l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f335439m;

    public a(@Y61.k TooltipPosition tooltipPosition, boolean z12, boolean z13, @Y61.k p pVar, @Y61.l Y41.a aVar, @Y61.k r rVar, @Y61.k com.avito.beduin.v2.theme.l lVar, boolean z14, int i12, boolean z15, @Y61.l Y41.a aVar2, @Y61.l Y41.a aVar3, @Y61.l String str) {
        this.f335427a = tooltipPosition;
        this.f335428b = z12;
        this.f335429c = z13;
        this.f335430d = pVar;
        this.f335431e = aVar;
        this.f335432f = rVar;
        this.f335433g = lVar;
        this.f335434h = z14;
        this.f335435i = i12;
        this.f335436j = z15;
        this.f335437k = aVar2;
        this.f335438l = aVar3;
        this.f335439m = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f335437k;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f335438l;
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
        return this.f335427a == aVar.f335427a && this.f335428b == aVar.f335428b && this.f335429c == aVar.f335429c && this.f335430d.equals(aVar.f335430d) && L.f(this.f335431e, aVar.f335431e) && this.f335432f.equals(aVar.f335432f) && this.f335433g.equals(aVar.f335433g) && this.f335434h == aVar.f335434h && this.f335435i == aVar.f335435i && this.f335436j == aVar.f335436j && L.f(this.f335437k, aVar.f335437k) && L.f(this.f335438l, aVar.f335438l) && L.f(this.f335439m, aVar.f335439m);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334790h() {
        return this.f335439m;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334787e() {
        return this.f335436j;
    }

    public final int hashCode() {
        int iHashCode = (this.f335430d.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(this.f335427a.hashCode() * 31, 31, this.f335428b), 31, this.f335429c)) * 31;
        Y41.a<G0> aVar = this.f335431e;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.e(this.f335435i, androidx.appcompat.app.r.i(C31685o.g(this.f335433g, (this.f335432f.f335460a.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31, 31), 31, this.f335434h), 31), 31, this.f335436j);
        Y41.a<G0> aVar2 = this.f335437k;
        int iHashCode2 = (i12 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.a<G0> aVar3 = this.f335438l;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        String str = this.f335439m;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoTooltipState(position=");
        sb2.append(this.f335427a);
        sb2.append(", tailVisible=");
        sb2.append(this.f335428b);
        sb2.append(", closeOnClick=");
        sb2.append(this.f335429c);
        sb2.append(", content=");
        sb2.append(this.f335430d);
        sb2.append(", onClose=");
        sb2.append(this.f335431e);
        sb2.append(", child=");
        sb2.append(this.f335432f);
        sb2.append(", style=");
        sb2.append(this.f335433g);
        sb2.append(", show=");
        sb2.append(this.f335434h);
        sb2.append(", contentWidth=");
        sb2.append(this.f335435i);
        sb2.append(", visible=");
        sb2.append(this.f335436j);
        sb2.append(", onShow=");
        sb2.append(this.f335437k);
        sb2.append(", onHide=");
        sb2.append(this.f335438l);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f335439m, ')');
    }
}
