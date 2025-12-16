package com.avito.beduin.v2.avito.component.map.state.style;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PolygonStyle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/style/k;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334748a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334749b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Float> f334750c;

    public k(@Y61.k com.avito.beduin.v2.theme.f<r.b> fVar, @Y61.k com.avito.beduin.v2.theme.f<r.b> fVar2, @Y61.k com.avito.beduin.v2.theme.f<Float> fVar3) {
        this.f334748a = fVar;
        this.f334749b = fVar2;
        this.f334750c = fVar3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f334748a, kVar.f334748a) && L.f(this.f334749b, kVar.f334749b) && L.f(this.f334750c, kVar.f334750c);
    }

    public final int hashCode() {
        return this.f334750c.hashCode() + C31685o.f(this.f334749b, this.f334748a.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PolygonStyle(fillColor=");
        sb2.append(this.f334748a);
        sb2.append(", polylineColor=");
        sb2.append(this.f334749b);
        sb2.append(", polylineWidth=");
        return C31685o.o(sb2, this.f334750c, ')');
    }
}
