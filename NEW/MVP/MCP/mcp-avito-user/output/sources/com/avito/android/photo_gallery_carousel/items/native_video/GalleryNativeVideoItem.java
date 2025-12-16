package com.avito.android.photo_gallery_carousel.items.native_video;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.photo_gallery_carousel.items.common.SizableGalleryItem;
import com.avito.android.remote.model.CarouselGalleryGroup;
import com.avito.android.remote.model.NativeVideo;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GalleryNativeVideoItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/native_video/GalleryNativeVideoItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Lcom/avito/android/photo_gallery_carousel/items/common/SizableGalleryItem;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GalleryNativeVideoItem implements ParcelableItem, SizableGalleryItem {

    @Y61.k
    public static final Parcelable.Creator<GalleryNativeVideoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f217979b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SizableGalleryItem.Type f217980c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NativeVideo f217981d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f217982e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final CarouselGalleryGroup f217983f;

    /* compiled from: GalleryNativeVideoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GalleryNativeVideoItem> {
        @Override // android.os.Parcelable.Creator
        public final GalleryNativeVideoItem createFromParcel(Parcel parcel) {
            return new GalleryNativeVideoItem(parcel.readString(), SizableGalleryItem.Type.valueOf(parcel.readString()), (NativeVideo) parcel.readParcelable(GalleryNativeVideoItem.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : CarouselGalleryGroup.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryNativeVideoItem[] newArray(int i12) {
            return new GalleryNativeVideoItem[i12];
        }
    }

    public GalleryNativeVideoItem(@Y61.k String str, @Y61.k SizableGalleryItem.Type type, @Y61.k NativeVideo nativeVideo, @Y61.l String str2, @Y61.l CarouselGalleryGroup carouselGalleryGroup) {
        this.f217979b = str;
        this.f217980c = type;
        this.f217981d = nativeVideo;
        this.f217982e = str2;
        this.f217983f = carouselGalleryGroup;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryNativeVideoItem)) {
            return false;
        }
        GalleryNativeVideoItem galleryNativeVideoItem = (GalleryNativeVideoItem) obj;
        return L.f(this.f217979b, galleryNativeVideoItem.f217979b) && this.f217980c == galleryNativeVideoItem.f217980c && L.f(this.f217981d, galleryNativeVideoItem.f217981d) && L.f(this.f217982e, galleryNativeVideoItem.f217982e) && this.f217983f == galleryNativeVideoItem.f217983f;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF218012b() {
        return this.f217979b;
    }

    public final int hashCode() {
        int iHashCode = (this.f217981d.hashCode() + ((this.f217980c.hashCode() + (this.f217979b.hashCode() * 31)) * 31)) * 31;
        String str = this.f217982e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CarouselGalleryGroup carouselGalleryGroup = this.f217983f;
        return iHashCode2 + (carouselGalleryGroup != null ? carouselGalleryGroup.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "GalleryNativeVideoItem(stringId=" + this.f217979b + ", type=" + this.f217980c + ", nativeVideo=" + this.f217981d + ", advertId=" + this.f217982e + ", carouselGalleryGroup=" + this.f217983f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f217979b);
        parcel.writeString(this.f217980c.name());
        parcel.writeParcelable(this.f217981d, i12);
        parcel.writeString(this.f217982e);
        CarouselGalleryGroup carouselGalleryGroup = this.f217983f;
        if (carouselGalleryGroup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(carouselGalleryGroup.name());
        }
    }
}
