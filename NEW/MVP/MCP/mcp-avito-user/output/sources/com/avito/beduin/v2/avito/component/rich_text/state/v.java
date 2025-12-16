package com.avito.beduin.v2.avito.component.rich_text.state;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Segment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/rich_text/state/v;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/q;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/l;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class v implements q, l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f334965a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334966b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final m f334967c;

    public v(@Y61.k String str, @Y61.l Y41.a<G0> aVar, @Y61.l m mVar) {
        this.f334965a = str;
        this.f334966b = aVar;
        this.f334967c = mVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return L.f(this.f334965a, vVar.f334965a) && L.f(this.f334966b, vVar.f334966b) && L.f(this.f334967c, vVar.f334967c);
    }

    public final int hashCode() {
        int iHashCode = this.f334965a.hashCode() * 31;
        Y41.a<G0> aVar = this.f334966b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        m mVar = this.f334967c;
        return iHashCode2 + (mVar != null ? mVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "StrikethroughText(text=" + this.f334965a + ", onClick=" + this.f334966b + ", style=" + this.f334967c + ')';
    }
}
