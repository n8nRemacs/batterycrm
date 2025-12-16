package com.avito.android.user_advert.advert.items.service_subscription_banner;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SubscriptionBannerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/service_subscription_banner/c;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f310197b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f310198c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f310199d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalColor f310200e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalImage f310201f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final DeepLink f310202g;

    public c(@k String str, @l AttributedText attributedText, @l AttributedText attributedText2, @l UniversalColor universalColor, @l UniversalImage universalImage, @k DeepLink deepLink) {
        this.f310197b = str;
        this.f310198c = attributedText;
        this.f310199d = attributedText2;
        this.f310200e = universalColor;
        this.f310201f = universalImage;
        this.f310202g = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f310197b, cVar.f310197b) && L.f(this.f310198c, cVar.f310198c) && L.f(this.f310199d, cVar.f310199d) && L.f(this.f310200e, cVar.f310200e) && L.f(this.f310201f, cVar.f310201f) && L.f(this.f310202g, cVar.f310202g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85702c() {
        return getF85703d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF85703d() {
        return this.f310197b;
    }

    public final int hashCode() {
        int iHashCode = this.f310197b.hashCode() * 31;
        AttributedText attributedText = this.f310198c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f310199d;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        UniversalColor universalColor = this.f310200e;
        int iHashCode4 = (iHashCode3 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalImage universalImage = this.f310201f;
        return this.f310202g.hashCode() + ((iHashCode4 + (universalImage != null ? universalImage.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubscriptionBannerItem(stringId=");
        sb2.append(this.f310197b);
        sb2.append(", title=");
        sb2.append(this.f310198c);
        sb2.append(", subtitle=");
        sb2.append(this.f310199d);
        sb2.append(", backgroundColor=");
        sb2.append(this.f310200e);
        sb2.append(", image=");
        sb2.append(this.f310201f);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f310202g, ')');
    }
}
