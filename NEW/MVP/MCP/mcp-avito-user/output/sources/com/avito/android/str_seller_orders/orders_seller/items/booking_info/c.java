package com.avito.android.str_seller_orders.orders_seller.items.booking_info;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingInfoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/items/booking_info/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f289404b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f289405c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f289406d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f289407e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f289408f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Image f289409g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Image f289410h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Boolean f289411i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final DeepLink f289412j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final String f289413k;

    public c(@k Image image, @l DeepLink deepLink, @k AttributedText attributedText, @l AttributedText attributedText2, @l Boolean bool, @k String str, @l Image image2, @l AttributedText attributedText3, @l AttributedText attributedText4) {
        this.f289404b = str;
        this.f289405c = attributedText;
        this.f289406d = attributedText2;
        this.f289407e = attributedText3;
        this.f289408f = attributedText4;
        this.f289409g = image;
        this.f289410h = image2;
        this.f289411i = bool;
        this.f289412j = deepLink;
        this.f289413k = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f289404b, cVar.f289404b) && L.f(this.f289405c, cVar.f289405c) && L.f(this.f289406d, cVar.f289406d) && L.f(this.f289407e, cVar.f289407e) && L.f(this.f289408f, cVar.f289408f) && L.f(this.f289409g, cVar.f289409g) && L.f(this.f289410h, cVar.f289410h) && L.f(this.f289411i, cVar.f289411i) && L.f(this.f289412j, cVar.f289412j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272342b() {
        return getF429430f().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF429430f() {
        return this.f289413k;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.f289404b.hashCode() * 31, 31, this.f289405c);
        AttributedText attributedText = this.f289406d;
        int iHashCode = (iB2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f289407e;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        AttributedText attributedText3 = this.f289408f;
        int iG2 = com.avito.android.actions_sheet.a.g(this.f289409g, (iHashCode2 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31, 31);
        Image image = this.f289410h;
        int iHashCode3 = (iG2 + (image == null ? 0 : image.hashCode())) * 31;
        Boolean bool = this.f289411i;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        DeepLink deepLink = this.f289412j;
        return iHashCode4 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingInfoItem(bookingId=");
        sb2.append(this.f289404b);
        sb2.append(", title=");
        sb2.append(this.f289405c);
        sb2.append(", subtitle=");
        sb2.append(this.f289406d);
        sb2.append(", details=");
        sb2.append(this.f289407e);
        sb2.append(", description=");
        sb2.append(this.f289408f);
        sb2.append(", image=");
        sb2.append(this.f289409g);
        sb2.append(", circleImage=");
        sb2.append(this.f289410h);
        sb2.append(", hasAction=");
        sb2.append(this.f289411i);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f289412j, ')');
    }
}
