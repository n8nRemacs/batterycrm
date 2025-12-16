package com.avito.android.str_seller_orders.orders_seller.items.widget;

import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/items/widget/i;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class i implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f289510b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f289511c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f289512d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final DeepLink f289513e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f289514f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f289515g;

    public i(@Y61.l DeepLink deepLink, @Y61.l UniversalImage universalImage, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.k String str, @Y61.l String str2) {
        this.f289510b = str;
        this.f289511c = attributedText;
        this.f289512d = attributedText2;
        this.f289513e = deepLink;
        this.f289514f = universalImage;
        this.f289515g = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f289510b, iVar.f289510b) && L.f(this.f289511c, iVar.f289511c) && L.f(this.f289512d, iVar.f289512d) && L.f(this.f289513e, iVar.f289513e) && L.f(this.f289514f, iVar.f289514f) && L.f(this.f289515g, iVar.f289515g);
    }

    @Override // TV0.a
    public final long getId() {
        return getF283227b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283227b() {
        return this.f289510b;
    }

    public final int hashCode() {
        int iHashCode = this.f289510b.hashCode() * 31;
        AttributedText attributedText = this.f289511c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f289512d;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        DeepLink deepLink = this.f289513e;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        UniversalImage universalImage = this.f289514f;
        int iHashCode5 = (iHashCode4 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str = this.f289515g;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WidgetItem(stringId=");
        sb2.append(this.f289510b);
        sb2.append(", title=");
        sb2.append(this.f289511c);
        sb2.append(", subtitle=");
        sb2.append(this.f289512d);
        sb2.append(", deepLink=");
        sb2.append(this.f289513e);
        sb2.append(", image=");
        sb2.append(this.f289514f);
        sb2.append(", iconName=");
        return C22026a.c(sb2, this.f289515g, ')');
    }
}
