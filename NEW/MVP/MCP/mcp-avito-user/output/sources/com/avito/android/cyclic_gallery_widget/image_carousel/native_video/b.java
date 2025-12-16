package com.avito.android.cyclic_gallery_widget.image_carousel.native_video;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.cyclic_gallery_widget.image_carousel.l;
import com.avito.android.remote.model.GalleryItemConfigModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CarouselNativeVideoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/native_video/b;", "Lcom/avito/conveyor_item/a;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f132047b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f132048c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final com.avito.android.image_loader.k f132049d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.cyclic_gallery_widget.image_carousel.l f132050e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final GalleryItemConfigModel f132051f;

    public b(@k String str, @k String str2, @l com.avito.android.image_loader.k kVar, @k com.avito.android.cyclic_gallery_widget.image_carousel.l lVar, @l GalleryItemConfigModel galleryItemConfigModel) {
        this.f132047b = str;
        this.f132048c = str2;
        this.f132049d = kVar;
        this.f132050e = lVar;
        this.f132051f = galleryItemConfigModel;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f132047b, bVar.f132047b) && L.f(this.f132048c, bVar.f132048c) && L.f(this.f132049d, bVar.f132049d) && L.f(this.f132050e, bVar.f132050e) && L.f(this.f132051f, bVar.f132051f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return getF73320d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF73320d() {
        return this.f132047b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f132047b.hashCode() * 31, 31, this.f132048c);
        com.avito.android.image_loader.k kVar = this.f132049d;
        int iHashCode = (this.f132050e.hashCode() + ((iD2 + (kVar == null ? 0 : kVar.hashCode())) * 31)) * 31;
        GalleryItemConfigModel galleryItemConfigModel = this.f132051f;
        return iHashCode + (galleryItemConfigModel != null ? galleryItemConfigModel.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CarouselNativeVideoItem(stringId=" + this.f132047b + ", videoUrl=" + this.f132048c + ", thumbnail=" + this.f132049d + ", itemStyle=" + this.f132050e + ", config=" + this.f132051f + ')';
    }

    public /* synthetic */ b(String str, String str2, com.avito.android.image_loader.k kVar, com.avito.android.cyclic_gallery_widget.image_carousel.l lVar, GalleryItemConfigModel galleryItemConfigModel, int i12, C42822w c42822w) {
        this(str, str2, kVar, (i12 & 8) != 0 ? l.a.f132035h : lVar, (i12 & 16) != 0 ? null : galleryItemConfigModel);
    }
}
