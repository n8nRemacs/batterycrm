package com.avito.android.comparison.items.specification_header_item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SpecificationHeaderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/items/specification_header_item/c;", "LTV0/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f124070b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f124071c;

    /* renamed from: d, reason: collision with root package name */
    public final float f124072d;

    public c(@k String str, float f12, long j12) {
        this.f124070b = j12;
        this.f124071c = str;
        this.f124072d = f12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f124070b == cVar.f124070b && L.f(this.f124071c, cVar.f124071c) && Float.compare(this.f124072d, cVar.f124072d) == 0;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF78384b() {
        return this.f124070b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f124072d) + H.d(Long.hashCode(this.f124070b) * 31, 31, this.f124071c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpecificationHeaderItem(id=");
        sb2.append(this.f124070b);
        sb2.append(", text=");
        sb2.append(this.f124071c);
        sb2.append(", topPadding=");
        return r.k(')', this.f124072d, sb2);
    }
}
