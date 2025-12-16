package com.avito.android.str_seller_orders.strsellerorders.mvi.items.banner;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/banner/a;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f289927b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f289928c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UniversalImage f289929d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UniversalColor f289930e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DeepLink f289931f;

    public a(@k PrintableText printableText, @k AttributedText attributedText, @k UniversalImage universalImage, @k UniversalColor universalColor, @k DeepLink deepLink) {
        this.f289927b = printableText;
        this.f289928c = attributedText;
        this.f289929d = universalImage;
        this.f289930e = universalColor;
        this.f289931f = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return this.f289927b.equals(aVar.f289927b) && L.f(this.f289928c, aVar.f289928c) && this.f289929d.equals(aVar.f289929d) && this.f289930e.equals(aVar.f289930e) && L.f(this.f289931f, aVar.f289931f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268775b() {
        return 961467519;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF268777c() {
        return "BannerItem";
    }

    public final int hashCode() {
        return this.f289931f.hashCode() + com.avito.android.actions_sheet.a.i(this.f289930e, com.avito.android.actions_sheet.a.a(com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.f(this.f289927b, -259277983, 31), 31, this.f289928c), 31, this.f289929d), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BannerItem(stringId=BannerItem, title=");
        sb2.append(this.f289927b);
        sb2.append(", subtitle=");
        sb2.append(this.f289928c);
        sb2.append(", image=");
        sb2.append(this.f289929d);
        sb2.append(", backgroundColor=");
        sb2.append(this.f289930e);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f289931f, ')');
    }
}
