package com.avito.android.publish.price_list.items.group;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectPriceListGroupItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/items/group/a;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f238629b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f238630c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f238631d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.android.publish.price_list.items.selectable.d> f238632e;

    public a(@Y61.k String str, @Y61.k String str2, boolean z12, @Y61.k List<com.avito.android.publish.price_list.items.selectable.d> list) {
        this.f238629b = str;
        this.f238630c = str2;
        this.f238631d = z12;
        this.f238632e = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f238629b, aVar.f238629b) && L.f(this.f238630c, aVar.f238630c) && this.f238631d == aVar.f238631d && L.f(this.f238632e, aVar.f238632e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80342e() {
        return getF238671b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF238671b() {
        return this.f238629b;
    }

    public final int hashCode() {
        return this.f238632e.hashCode() + r.i(H.d(this.f238629b.hashCode() * 31, 31, this.f238630c), 31, this.f238631d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectPriceListGroupItem(stringId=");
        sb2.append(this.f238629b);
        sb2.append(", title=");
        sb2.append(this.f238630c);
        sb2.append(", isExpanded=");
        sb2.append(this.f238631d);
        sb2.append(", items=");
        return H.p(sb2, this.f238632e, ')');
    }
}
