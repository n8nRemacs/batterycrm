package com.avito.android.beduin.common.component.product_comparison.items;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: BeduinProductComparisonItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/product_comparison/items/b;", "LTV0/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class b implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f102153b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102154c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f102155d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f102156e;

    public b(long j12, int i12, @k a aVar, @k ArrayList arrayList) {
        this.f102153b = j12;
        this.f102154c = i12;
        this.f102155d = aVar;
        this.f102156e = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f102153b == bVar.f102153b && this.f102154c == bVar.f102154c && this.f102155d.equals(bVar.f102155d) && this.f102156e.equals(bVar.f102156e);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF102153b() {
        return this.f102153b;
    }

    public final int hashCode() {
        return this.f102156e.hashCode() + ((this.f102155d.hashCode() + r.e(this.f102154c, Long.hashCode(this.f102153b) * 31, 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinProductComparisonItem(id=");
        sb2.append(this.f102153b);
        sb2.append(", itemWidth=");
        sb2.append(this.f102154c);
        sb2.append(", header=");
        sb2.append(this.f102155d);
        sb2.append(", properties=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f102156e, ')');
    }
}
