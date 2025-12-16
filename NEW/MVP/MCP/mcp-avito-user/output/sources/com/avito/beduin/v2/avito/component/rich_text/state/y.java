package com.avito.beduin.v2.avito.component.rich_text.state;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Segment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/rich_text/state/y;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/q;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/w;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/l;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class y implements q, w, l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f334971a;

    /* renamed from: b, reason: collision with root package name */
    public final int f334972b;

    /* renamed from: c, reason: collision with root package name */
    public final int f334973c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334974d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final o f334975e;

    public y(@Y61.k String str, int i12, int i13, @Y61.l Y41.a<G0> aVar, @Y61.l o oVar) {
        this.f334971a = str;
        this.f334972b = i12;
        this.f334973c = i13;
        this.f334974d = aVar;
        this.f334975e = oVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return L.f(this.f334971a, yVar.f334971a) && this.f334972b == yVar.f334972b && this.f334973c == yVar.f334973c && L.f(this.f334974d, yVar.f334974d) && L.f(this.f334975e, yVar.f334975e);
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f334973c, androidx.appcompat.app.r.e(this.f334972b, this.f334971a.hashCode() * 31, 31), 31);
        Y41.a<G0> aVar = this.f334974d;
        int iHashCode = (iE2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        o oVar = this.f334975e;
        return iHashCode + (oVar != null ? oVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "TextIcon(key=" + this.f334971a + ", leftInset=" + this.f334972b + ", rightInset=" + this.f334973c + ", onClick=" + this.f334974d + ", style=" + this.f334975e + ')';
    }
}
