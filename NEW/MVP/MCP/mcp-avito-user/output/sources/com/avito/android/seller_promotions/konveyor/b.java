package com.avito.android.seller_promotions.konveyor;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: EdgeDeterminer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/konveyor/b;", "", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f267771a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f267772b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f267773c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f267774d;

    public b(boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f267771a = z12;
        this.f267772b = z13;
        this.f267773c = z14;
        this.f267774d = z15;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f267771a == bVar.f267771a && this.f267772b == bVar.f267772b && this.f267773c == bVar.f267773c && this.f267774d == bVar.f267774d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f267774d) + r.i(r.i(Boolean.hashCode(this.f267771a) * 31, 31, this.f267772b), 31, this.f267773c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EdgesInfo(isLeftEdge=");
        sb2.append(this.f267771a);
        sb2.append(", isTopEdge=");
        sb2.append(this.f267772b);
        sb2.append(", isRightEdge=");
        sb2.append(this.f267773c);
        sb2.append(", isBottomEdge=");
        return r.x(sb2, this.f267774d, ')');
    }
}
