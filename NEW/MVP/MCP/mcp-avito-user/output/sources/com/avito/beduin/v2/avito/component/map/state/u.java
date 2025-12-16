package com.avito.beduin.v2.avito.component.map.state;

import kotlin.Metadata;

/* compiled from: MapBounds.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/u;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final x f334754a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x f334755b;

    public u(@Y61.k x xVar, @Y61.k x xVar2) {
        this.f334754a = xVar;
        this.f334755b = xVar2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.L.f(this.f334754a, uVar.f334754a) && kotlin.jvm.internal.L.f(this.f334755b, uVar.f334755b);
    }

    public final int hashCode() {
        return this.f334755b.hashCode() + (this.f334754a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "MapBounds(topLeft=" + this.f334754a + ", bottomRight=" + this.f334755b + ')';
    }
}
