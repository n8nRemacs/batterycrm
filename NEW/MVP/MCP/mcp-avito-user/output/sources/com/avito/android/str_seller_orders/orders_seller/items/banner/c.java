package com.avito.android.str_seller_orders.orders_seller.items.banner;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BannerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/items/banner/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f289386b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f289387c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f289388d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UniversalImage f289389e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final UniversalColor f289390f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final DeepLink f289391g;

    public c(@k String str, @k PrintableText printableText, @k AttributedText attributedText, @k UniversalImage universalImage, @k UniversalColor universalColor, @k DeepLink deepLink) {
        this.f289386b = str;
        this.f289387c = printableText;
        this.f289388d = attributedText;
        this.f289389e = universalImage;
        this.f289390f = universalColor;
        this.f289391g = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f289386b, cVar.f289386b) && L.f(this.f289387c, cVar.f289387c) && L.f(this.f289388d, cVar.f289388d) && L.f(this.f289389e, cVar.f289389e) && L.f(this.f289390f, cVar.f289390f) && L.f(this.f289391g, cVar.f289391g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return getF281722b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281699b() {
        return this.f289386b;
    }

    public final int hashCode() {
        return this.f289391g.hashCode() + com.avito.android.actions_sheet.a.i(this.f289390f, com.avito.android.actions_sheet.a.a(com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.f(this.f289387c, this.f289386b.hashCode() * 31, 31), 31, this.f289388d), 31, this.f289389e), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BannerItem(stringId=");
        sb2.append(this.f289386b);
        sb2.append(", title=");
        sb2.append(this.f289387c);
        sb2.append(", subtitle=");
        sb2.append(this.f289388d);
        sb2.append(", image=");
        sb2.append(this.f289389e);
        sb2.append(", backgroundColor=");
        sb2.append(this.f289390f);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f289391g, ')');
    }
}
