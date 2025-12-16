package com.avito.android.cyclic_gallery_widget.image_carousel.seller_info;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.cyclic_gallery_widget.image_carousel.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.GalleryItemConfigModel;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CarouselSellerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/seller_info/b;", "Lcom/avito/conveyor_item/a;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f132117b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f132118c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Float f132119d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f132120e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f132121f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Image f132122g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f132123h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f132124i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final DeepLink f132125j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final List<SerpBadge> f132126k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final com.avito.android.cyclic_gallery_widget.image_carousel.l f132127l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final GalleryItemConfigModel f132128m;

    public b(@k String str, @k String str2, @l Float f12, @l String str3, @l String str4, @l Image image, boolean z12, boolean z13, @l DeepLink deepLink, @l List<SerpBadge> list, @k com.avito.android.cyclic_gallery_widget.image_carousel.l lVar, @l GalleryItemConfigModel galleryItemConfigModel) {
        this.f132117b = str;
        this.f132118c = str2;
        this.f132119d = f12;
        this.f132120e = str3;
        this.f132121f = str4;
        this.f132122g = image;
        this.f132123h = z12;
        this.f132124i = z13;
        this.f132125j = deepLink;
        this.f132126k = list;
        this.f132127l = lVar;
        this.f132128m = galleryItemConfigModel;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f132117b, bVar.f132117b) && L.f(this.f132118c, bVar.f132118c) && L.f(this.f132119d, bVar.f132119d) && L.f(this.f132120e, bVar.f132120e) && L.f(this.f132121f, bVar.f132121f) && L.f(this.f132122g, bVar.f132122g) && this.f132123h == bVar.f132123h && this.f132124i == bVar.f132124i && L.f(this.f132125j, bVar.f132125j) && L.f(this.f132126k, bVar.f132126k) && L.f(this.f132127l, bVar.f132127l) && L.f(this.f132128m, bVar.f132128m);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return getF80597c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF80597c() {
        return this.f132117b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f132117b.hashCode() * 31, 31, this.f132118c);
        Float f12 = this.f132119d;
        int iHashCode = (iD2 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str = this.f132120e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132121f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.f132122g;
        int i12 = r.i(r.i((iHashCode3 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f132123h), 31, this.f132124i);
        DeepLink deepLink = this.f132125j;
        int iHashCode4 = (i12 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        List<SerpBadge> list = this.f132126k;
        int iHashCode5 = (this.f132127l.hashCode() + ((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        GalleryItemConfigModel galleryItemConfigModel = this.f132128m;
        return iHashCode5 + (galleryItemConfigModel != null ? galleryItemConfigModel.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CarouselSellerItem(stringId=" + this.f132117b + ", sellerName=" + this.f132118c + ", rating=" + this.f132119d + ", reviewCount=" + this.f132120e + ", sellerTypeName=" + this.f132121f + ", logo=" + this.f132122g + ", isShop=" + this.f132123h + ", isBrandSpace=" + this.f132124i + ", deeplink=" + this.f132125j + ", badges=" + this.f132126k + ", itemStyle=" + this.f132127l + ", config=" + this.f132128m + ')';
    }

    public /* synthetic */ b(String str, String str2, Float f12, String str3, String str4, Image image, boolean z12, boolean z13, DeepLink deepLink, List list, com.avito.android.cyclic_gallery_widget.image_carousel.l lVar, GalleryItemConfigModel galleryItemConfigModel, int i12, C42822w c42822w) {
        this(str, str2, f12, str3, str4, image, z12, z13, (i12 & 256) != 0 ? null : deepLink, (i12 & 512) != 0 ? null : list, (i12 & 1024) != 0 ? l.a.f132035h : lVar, (i12 & 2048) != 0 ? null : galleryItemConfigModel);
    }
}
