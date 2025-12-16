package com.avito.android.str_seller_orders.orders_seller.items.info_block;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InfoBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/items/info_block/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f289483b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f289484c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f289485d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f289486e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f289487f;

    public c(@k String str, @l String str2, @l AttributedText attributedText, @l AttributedText attributedText2, @l DeepLink deepLink) {
        this.f289483b = str;
        this.f289484c = str2;
        this.f289485d = attributedText;
        this.f289486e = attributedText2;
        this.f289487f = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f289483b, cVar.f289483b) && L.f(this.f289484c, cVar.f289484c) && L.f(this.f289485d, cVar.f289485d) && L.f(this.f289486e, cVar.f289486e) && L.f(this.f289487f, cVar.f289487f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123950b() {
        return getF2713d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF2713d() {
        return this.f289483b;
    }

    public final int hashCode() {
        int iHashCode = this.f289483b.hashCode() * 31;
        String str = this.f289484c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f289485d;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f289486e;
        int iHashCode4 = (iHashCode3 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        DeepLink deepLink = this.f289487f;
        return iHashCode4 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InfoBlockItem(stringId=");
        sb2.append(this.f289483b);
        sb2.append(", iconName=");
        sb2.append(this.f289484c);
        sb2.append(", title=");
        sb2.append(this.f289485d);
        sb2.append(", subtitle=");
        sb2.append(this.f289486e);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f289487f, ')');
    }
}
