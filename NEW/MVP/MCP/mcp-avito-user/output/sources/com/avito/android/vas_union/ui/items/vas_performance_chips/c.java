package com.avito.android.vas_union.ui.items.vas_performance_chips;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.lib.design.chips.state.ItemChipable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasUnionV2PerformanceChipsItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_performance_chips/c;", "Lcom/avito/conveyor_item/a;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f323309b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<ItemChipable> f323310c;

    public c(@k String str, @k List<ItemChipable> list) {
        this.f323309b = str;
        this.f323310c = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f323309b, cVar.f323309b) && L.f(this.f323310c, cVar.f323310c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return getF323309b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF323309b() {
        return this.f323309b;
    }

    public final int hashCode() {
        return this.f323310c.hashCode() + (this.f323309b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasUnionV2PerformanceChipsItem(stringId=");
        sb2.append(this.f323309b);
        sb2.append(", options=");
        return H.p(sb2, this.f323310c, ')');
    }
}
