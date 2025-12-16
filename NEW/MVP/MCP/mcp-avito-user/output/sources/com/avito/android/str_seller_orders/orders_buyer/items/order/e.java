package com.avito.android.str_seller_orders.orders_buyer.items.order;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.str_seller_orders.orders_buyer.mvi.entity.SizeViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/items/order/e;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class e implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f289031b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SizeViewType f289032c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f289033d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f289034e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f289035f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f289036g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Boolean f289037h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final UniversalColor f289038i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f289039j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final String f289040k;

    public e(@l String str, @k SizeViewType sizeViewType, @l String str2, @l DeepLink deepLink, @l String str3, @l String str4, @l Boolean bool, @l UniversalColor universalColor, @l String str5, @k String str6) {
        this.f289031b = str;
        this.f289032c = sizeViewType;
        this.f289033d = str2;
        this.f289034e = deepLink;
        this.f289035f = str3;
        this.f289036g = str4;
        this.f289037h = bool;
        this.f289038i = universalColor;
        this.f289039j = str5;
        this.f289040k = str6;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f289031b, eVar.f289031b) && this.f289032c == eVar.f289032c && L.f(this.f289033d, eVar.f289033d) && L.f(this.f289034e, eVar.f289034e) && L.f(this.f289035f, eVar.f289035f) && L.f(this.f289036g, eVar.f289036g) && L.f(this.f289037h, eVar.f289037h) && L.f(this.f289038i, eVar.f289038i) && L.f(this.f289039j, eVar.f289039j) && L.f(this.f289040k, eVar.f289040k);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79005b() {
        return getF280528b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF280528b() {
        return this.f289040k;
    }

    public final int hashCode() {
        String str = this.f289031b;
        int iHashCode = (this.f289032c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f289033d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.f289034e;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str3 = this.f289035f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f289036g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f289037h;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        UniversalColor universalColor = this.f289038i;
        int iHashCode7 = (iHashCode6 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        String str5 = this.f289039j;
        return this.f289040k.hashCode() + ((iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrderItem(orderId=");
        sb2.append(this.f289031b);
        sb2.append(", size=");
        sb2.append(this.f289032c);
        sb2.append(", orderTitle=");
        sb2.append(this.f289033d);
        sb2.append(", orderLink=");
        sb2.append(this.f289034e);
        sb2.append(", itemTitle=");
        sb2.append(this.f289035f);
        sb2.append(", statusText=");
        sb2.append(this.f289036g);
        sb2.append(", statusCircleEnabled=");
        sb2.append(this.f289037h);
        sb2.append(", statusColor=");
        sb2.append(this.f289038i);
        sb2.append(", imageUrl=");
        sb2.append(this.f289039j);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f289040k, ')');
    }
}
