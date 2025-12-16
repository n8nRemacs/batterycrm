package com.avito.android.publish.price_list.items.selected;

import androidx.compose.runtime.internal.P;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectedPriceListItems.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/items/selected/d;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f238719b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f238720c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238721d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Set<a> f238722e;

    public d() {
        throw null;
    }

    public d(String str, Integer num, boolean z12, Set set, int i12, C42822w c42822w) {
        z12 = (i12 & 4) != 0 ? false : z12;
        set = (i12 & 8) != 0 ? B0.f406639b : set;
        this.f238719b = str;
        this.f238720c = num;
        this.f238721d = z12;
        this.f238722e = set;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f238719b, dVar.f238719b) && L.f(this.f238720c, dVar.f238720c) && this.f238721d == dVar.f238721d && L.f(this.f238722e, dVar.f238722e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF121506b() {
        return getF8961b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF8961b() {
        return this.f238719b;
    }

    public final int hashCode() {
        int iHashCode = this.f238719b.hashCode() * 31;
        Integer num = this.f238720c;
        return this.f238722e.hashCode() + androidx.appcompat.app.r.i((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f238721d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectedPriceListItems(stringId=");
        sb2.append(this.f238719b);
        sb2.append(", minimumShowedItems=");
        sb2.append(this.f238720c);
        sb2.append(", isExpanded=");
        sb2.append(this.f238721d);
        sb2.append(", items=");
        return AK.c.u(sb2, this.f238722e, ')');
    }
}
