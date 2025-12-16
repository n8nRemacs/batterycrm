package com.avito.beduin.v2.avito.component.map.state;

import kotlin.Metadata;

/* compiled from: MapPoint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/x;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class x {

    /* renamed from: a, reason: collision with root package name */
    public final float f334759a;

    /* renamed from: b, reason: collision with root package name */
    public final float f334760b;

    public x(float f12, float f13) {
        this.f334759a = f12;
        this.f334760b = f13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f334759a, xVar.f334759a) == 0 && Float.compare(this.f334760b, xVar.f334760b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f334760b) + (Float.hashCode(this.f334759a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MapPoint(latitude=");
        sb2.append(this.f334759a);
        sb2.append(", longitude=");
        return androidx.appcompat.app.r.k(')', this.f334760b, sb2);
    }
}
