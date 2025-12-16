package com.avito.android.comparison.items.nested_scrolling_item;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: NestedScrollingItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/items/nested_scrolling_item/e;", "LTV0/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class e implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f124012b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f124013c;

    public e(long j12, @k ArrayList arrayList) {
        this.f124012b = j12;
        this.f124013c = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f124012b == eVar.f124012b && this.f124013c.equals(eVar.f124013c);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF83624b() {
        return this.f124012b;
    }

    public final int hashCode() {
        return this.f124013c.hashCode() + (Long.hashCode(this.f124012b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NestedScrollingItem(id=");
        sb2.append(this.f124012b);
        sb2.append(", list=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f124013c, ')');
    }
}
