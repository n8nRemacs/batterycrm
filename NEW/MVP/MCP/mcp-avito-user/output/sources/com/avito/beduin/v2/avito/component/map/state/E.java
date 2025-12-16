package com.avito.beduin.v2.avito.component.map.state;

import kotlin.Metadata;

/* compiled from: Polygon.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/E;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ET0.a<x> f334619a;

    public E(@Y61.k ET0.a<x> aVar) {
        this.f334619a = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E) && kotlin.jvm.internal.L.f(this.f334619a, ((E) obj).f334619a);
    }

    public final int hashCode() {
        return this.f334619a.f4014b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "Polygon(points=" + this.f334619a + ')';
    }
}
