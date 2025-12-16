package com.avito.android.cart_similar_items.konveyor;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: EdgeDeterminer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/b;", "", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f115810a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f115811b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f115812c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f115813d;

    public b(boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f115810a = z12;
        this.f115811b = z13;
        this.f115812c = z14;
        this.f115813d = z15;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f115810a == bVar.f115810a && this.f115811b == bVar.f115811b && this.f115812c == bVar.f115812c && this.f115813d == bVar.f115813d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115813d) + r.i(r.i(Boolean.hashCode(this.f115810a) * 31, 31, this.f115811b), 31, this.f115812c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EdgesInfo(isLeftEdge=");
        sb2.append(this.f115810a);
        sb2.append(", isTopEdge=");
        sb2.append(this.f115811b);
        sb2.append(", isRightEdge=");
        sb2.append(this.f115812c);
        sb2.append(", isBottomEdge=");
        return r.x(sb2, this.f115813d, ')');
    }
}
