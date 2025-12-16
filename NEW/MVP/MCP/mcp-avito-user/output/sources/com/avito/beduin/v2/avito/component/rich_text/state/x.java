package com.avito.beduin.v2.avito.component.rich_text.state;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Segment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/rich_text/state/x;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/q;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/w;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/l;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class x implements q, w, l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f334968a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334969b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final o f334970c;

    public x(@Y61.k String str, @Y61.l Y41.a<G0> aVar, @Y61.l o oVar) {
        this.f334968a = str;
        this.f334969b = aVar;
        this.f334970c = oVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return L.f(this.f334968a, xVar.f334968a) && L.f(this.f334969b, xVar.f334969b) && L.f(this.f334970c, xVar.f334970c);
    }

    public final int hashCode() {
        int iHashCode = this.f334968a.hashCode() * 31;
        Y41.a<G0> aVar = this.f334969b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        o oVar = this.f334970c;
        return iHashCode2 + (oVar != null ? oVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "Text(text=" + this.f334968a + ", onClick=" + this.f334969b + ", style=" + this.f334970c + ')';
    }
}
