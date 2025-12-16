package com.avito.android.photo_gallery_carousel.items.image;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.photo_gallery_carousel.items.common.SizableGalleryItem;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.remote.model.CarouselGalleryGroup;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GalleryImageItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/image/GalleryImageItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Lcom/avito/android/photo_gallery_carousel/items/common/SizableGalleryItem;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GalleryImageItem implements ParcelableItem, SizableGalleryItem {

    @Y61.k
    public static final Parcelable.Creator<GalleryImageItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f217937b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SizableGalleryItem.Type f217938c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Image f217939d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f217940e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f217941f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final CarouselGalleryGroup f217942g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Image f217943h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final PinchToZoomSource f217944i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.d f217945j;

    /* compiled from: GalleryImageItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GalleryImageItem> {
        @Override // android.os.Parcelable.Creator
        public final GalleryImageItem createFromParcel(Parcel parcel) {
            return new GalleryImageItem(parcel.readString(), SizableGalleryItem.Type.valueOf(parcel.readString()), (Image) parcel.readParcelable(GalleryImageItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : CarouselGalleryGroup.valueOf(parcel.readString()), (Image) parcel.readParcelable(GalleryImageItem.class.getClassLoader()), parcel.readInt() == 0 ? null : PinchToZoomSource.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryImageItem[] newArray(int i12) {
            return new GalleryImageItem[i12];
        }
    }

    public GalleryImageItem(@Y61.k String str, @Y61.k SizableGalleryItem.Type type, @Y61.l Image image, @Y61.l String str2, boolean z12, @Y61.l CarouselGalleryGroup carouselGalleryGroup, @Y61.l Image image2, @Y61.l PinchToZoomSource pinchToZoomSource) {
        this.f217937b = str;
        this.f217938c = type;
        this.f217939d = image;
        this.f217940e = str2;
        this.f217941f = z12;
        this.f217942g = carouselGalleryGroup;
        this.f217943h = image2;
        this.f217944i = pinchToZoomSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryImageItem)) {
            return false;
        }
        GalleryImageItem galleryImageItem = (GalleryImageItem) obj;
        return L.f(this.f217937b, galleryImageItem.f217937b) && this.f217938c == galleryImageItem.f217938c && L.f(this.f217939d, galleryImageItem.f217939d) && L.f(this.f217940e, galleryImageItem.f217940e) && this.f217941f == galleryImageItem.f217941f && this.f217942g == galleryImageItem.f217942g && L.f(this.f217943h, galleryImageItem.f217943h) && this.f217944i == galleryImageItem.f217944i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF162835b() {
        return this.f217937b;
    }

    public final int hashCode() {
        int iHashCode = (this.f217938c.hashCode() + (this.f217937b.hashCode() * 31)) * 31;
        Image image = this.f217939d;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.f217940e;
        int i12 = r.i((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f217941f);
        CarouselGalleryGroup carouselGalleryGroup = this.f217942g;
        int iHashCode3 = (i12 + (carouselGalleryGroup == null ? 0 : carouselGalleryGroup.hashCode())) * 31;
        Image image2 = this.f217943h;
        int iHashCode4 = (iHashCode3 + (image2 == null ? 0 : image2.hashCode())) * 31;
        PinchToZoomSource pinchToZoomSource = this.f217944i;
        return iHashCode4 + (pinchToZoomSource != null ? pinchToZoomSource.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "GalleryImageItem(stringId=" + this.f217937b + ", type=" + this.f217938c + ", image=" + this.f217939d + ", advertId=" + this.f217940e + ", isRealtyImage=" + this.f217941f + ", carouselGalleryGroup=" + this.f217942g + ", aiDesignImage=" + this.f217943h + ", pinchToZoomSource=" + this.f217944i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f217937b);
        parcel.writeString(this.f217938c.name());
        parcel.writeParcelable(this.f217939d, i12);
        parcel.writeString(this.f217940e);
        parcel.writeInt(this.f217941f ? 1 : 0);
        CarouselGalleryGroup carouselGalleryGroup = this.f217942g;
        if (carouselGalleryGroup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(carouselGalleryGroup.name());
        }
        parcel.writeParcelable(this.f217943h, i12);
        PinchToZoomSource pinchToZoomSource = this.f217944i;
        if (pinchToZoomSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(pinchToZoomSource.name());
        }
    }

    public /* synthetic */ GalleryImageItem(String str, SizableGalleryItem.Type type, Image image, String str2, boolean z12, CarouselGalleryGroup carouselGalleryGroup, Image image2, PinchToZoomSource pinchToZoomSource, int i12, C42822w c42822w) {
        this(str, type, image, str2, z12, carouselGalleryGroup, (i12 & 64) != 0 ? null : image2, pinchToZoomSource);
    }
}
