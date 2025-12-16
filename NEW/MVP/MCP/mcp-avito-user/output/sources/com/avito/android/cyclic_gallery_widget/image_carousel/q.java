package com.avito.android.cyclic_gallery_widget.image_carousel;

import android.net.Uri;
import com.avito.android.cyclic_gallery_widget.image_carousel.l;
import com.avito.android.image_loader.From;
import com.avito.android.remote.model.GalleryItemConfigModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImageCarouselItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/q;", "Lcom/avito/conveyor_item/a;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class q implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f132087b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.image_loader.k f132088c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Uri f132089d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final From f132090e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final l f132091f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f132092g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f132093h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Integer f132094i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final GalleryItemConfigModel f132095j;

    public q(@Y61.k String str, @Y61.l com.avito.android.image_loader.k kVar, @Y61.l Uri uri, @Y61.k From from, @Y61.k l lVar, boolean z12, boolean z13, @Y61.l Integer num, @Y61.l GalleryItemConfigModel galleryItemConfigModel) {
        this.f132087b = str;
        this.f132088c = kVar;
        this.f132089d = uri;
        this.f132090e = from;
        this.f132091f = lVar;
        this.f132092g = z12;
        this.f132093h = z13;
        this.f132094i = num;
        this.f132095j = galleryItemConfigModel;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return L.f(this.f132087b, qVar.f132087b) && L.f(this.f132088c, qVar.f132088c) && L.f(this.f132089d, qVar.f132089d) && this.f132090e == qVar.f132090e && L.f(this.f132091f, qVar.f132091f) && this.f132092g == qVar.f132092g && this.f132093h == qVar.f132093h && L.f(this.f132094i, qVar.f132094i) && L.f(this.f132095j, qVar.f132095j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78384b() {
        return getF86898b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF86898b() {
        return this.f132087b;
    }

    public final int hashCode() {
        int iHashCode = this.f132087b.hashCode() * 31;
        com.avito.android.image_loader.k kVar = this.f132088c;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Uri uri = this.f132089d;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.f132091f.hashCode() + ((this.f132090e.hashCode() + ((iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31)) * 31)) * 31, 31, this.f132092g), 31, this.f132093h);
        Integer num = this.f132094i;
        int iHashCode3 = (i12 + (num == null ? 0 : num.hashCode())) * 31;
        GalleryItemConfigModel galleryItemConfigModel = this.f132095j;
        return iHashCode3 + (galleryItemConfigModel != null ? galleryItemConfigModel.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ImageCarouselItem(stringId=" + this.f132087b + ", picture=" + this.f132088c + ", videoLink=" + this.f132089d + ", from=" + this.f132090e + ", itemStyle=" + this.f132091f + ", zoomable=" + this.f132092g + ", onboardZoom=" + this.f132093h + ", position=" + this.f132094i + ", config=" + this.f132095j + ')';
    }

    public /* synthetic */ q(String str, com.avito.android.image_loader.k kVar, Uri uri, From from, l lVar, boolean z12, boolean z13, Integer num, GalleryItemConfigModel galleryItemConfigModel, int i12, C42822w c42822w) {
        this(str, kVar, (i12 & 4) != 0 ? null : uri, (i12 & 8) != 0 ? From.f169444d : from, (i12 & 16) != 0 ? l.a.f132035h : lVar, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? null : num, (i12 & 256) != 0 ? null : galleryItemConfigModel);
    }
}
