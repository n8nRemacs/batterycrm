package com.avito.android.user_advert.advert.items.auction_banner;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.user_adverts.auction.AuctionBannerBadge;
import com.avito.android.remote.model.user_adverts.auction.AuctionButton;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuctionBannerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/auction_banner/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309208b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f309209c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalColor f309210d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f309211e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalColor f309212f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AuctionBannerBadge f309213g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final UniversalImage f309214h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final UniversalColor f309215i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final AuctionButton f309216j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final DeepLink f309217k;

    public a(@k String str, @l String str2, @l UniversalColor universalColor, @l String str3, @l UniversalColor universalColor2, @l AuctionBannerBadge auctionBannerBadge, @l UniversalImage universalImage, @l UniversalColor universalColor3, @l AuctionButton auctionButton, @l DeepLink deepLink) {
        this.f309208b = str;
        this.f309209c = str2;
        this.f309210d = universalColor;
        this.f309211e = str3;
        this.f309212f = universalColor2;
        this.f309213g = auctionBannerBadge;
        this.f309214h = universalImage;
        this.f309215i = universalColor3;
        this.f309216j = auctionButton;
        this.f309217k = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309208b, aVar.f309208b) && L.f(this.f309209c, aVar.f309209c) && L.f(this.f309210d, aVar.f309210d) && L.f(this.f309211e, aVar.f309211e) && L.f(this.f309212f, aVar.f309212f) && L.f(this.f309213g, aVar.f309213g) && L.f(this.f309214h, aVar.f309214h) && L.f(this.f309215i, aVar.f309215i) && L.f(this.f309216j, aVar.f309216j) && L.f(this.f309217k, aVar.f309217k);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287660b() {
        return getF429649e().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF429649e() {
        return this.f309208b;
    }

    public final int hashCode() {
        int iHashCode = this.f309208b.hashCode() * 31;
        String str = this.f309209c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UniversalColor universalColor = this.f309210d;
        int iHashCode3 = (iHashCode2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        String str2 = this.f309211e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalColor universalColor2 = this.f309212f;
        int iHashCode5 = (iHashCode4 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
        AuctionBannerBadge auctionBannerBadge = this.f309213g;
        int iHashCode6 = (iHashCode5 + (auctionBannerBadge == null ? 0 : auctionBannerBadge.hashCode())) * 31;
        UniversalImage universalImage = this.f309214h;
        int iHashCode7 = (iHashCode6 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        UniversalColor universalColor3 = this.f309215i;
        int iHashCode8 = (iHashCode7 + (universalColor3 == null ? 0 : universalColor3.hashCode())) * 31;
        AuctionButton auctionButton = this.f309216j;
        int iHashCode9 = (iHashCode8 + (auctionButton == null ? 0 : auctionButton.hashCode())) * 31;
        DeepLink deepLink = this.f309217k;
        return iHashCode9 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AuctionBannerItem(stringId=");
        sb2.append(this.f309208b);
        sb2.append(", title=");
        sb2.append(this.f309209c);
        sb2.append(", titleColor=");
        sb2.append(this.f309210d);
        sb2.append(", description=");
        sb2.append(this.f309211e);
        sb2.append(", descriptionColor=");
        sb2.append(this.f309212f);
        sb2.append(", badge=");
        sb2.append(this.f309213g);
        sb2.append(", icon=");
        sb2.append(this.f309214h);
        sb2.append(", backgroundColor=");
        sb2.append(this.f309215i);
        sb2.append(", button=");
        sb2.append(this.f309216j);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f309217k, ')');
    }
}
