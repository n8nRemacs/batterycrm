package com.avito.android.photo_gallery_carousel.items.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.photo_gallery_carousel.items.common.SizableGalleryItem;
import com.avito.android.remote.model.CarouselGalleryGroup;
import com.avito.android.remote.model.Video;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GalleryVideoItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/video/GalleryVideoItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Lcom/avito/android/photo_gallery_carousel/items/common/SizableGalleryItem;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GalleryVideoItem implements ParcelableItem, SizableGalleryItem {

    @Y61.k
    public static final Parcelable.Creator<GalleryVideoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f218012b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SizableGalleryItem.Type f218013c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Video f218014d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f218015e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final CarouselGalleryGroup f218016f;

    /* compiled from: GalleryVideoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GalleryVideoItem> {
        @Override // android.os.Parcelable.Creator
        public final GalleryVideoItem createFromParcel(Parcel parcel) {
            return new GalleryVideoItem(parcel.readString(), SizableGalleryItem.Type.valueOf(parcel.readString()), (Video) parcel.readParcelable(GalleryVideoItem.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : CarouselGalleryGroup.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryVideoItem[] newArray(int i12) {
            return new GalleryVideoItem[i12];
        }
    }

    public GalleryVideoItem(@Y61.k String str, @Y61.k SizableGalleryItem.Type type, @Y61.k Video video, @Y61.l String str2, @Y61.l CarouselGalleryGroup carouselGalleryGroup) {
        this.f218012b = str;
        this.f218013c = type;
        this.f218014d = video;
        this.f218015e = str2;
        this.f218016f = carouselGalleryGroup;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryVideoItem)) {
            return false;
        }
        GalleryVideoItem galleryVideoItem = (GalleryVideoItem) obj;
        return L.f(this.f218012b, galleryVideoItem.f218012b) && this.f218013c == galleryVideoItem.f218013c && L.f(this.f218014d, galleryVideoItem.f218014d) && L.f(this.f218015e, galleryVideoItem.f218015e) && this.f218016f == galleryVideoItem.f218016f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF77715b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154542b() {
        return this.f218012b;
    }

    public final int hashCode() {
        int iHashCode = (this.f218014d.hashCode() + ((this.f218013c.hashCode() + (this.f218012b.hashCode() * 31)) * 31)) * 31;
        String str = this.f218015e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CarouselGalleryGroup carouselGalleryGroup = this.f218016f;
        return iHashCode2 + (carouselGalleryGroup != null ? carouselGalleryGroup.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "GalleryVideoItem(stringId=" + this.f218012b + ", type=" + this.f218013c + ", video=" + this.f218014d + ", advertId=" + this.f218015e + ", carouselGalleryGroup=" + this.f218016f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f218012b);
        parcel.writeString(this.f218013c.name());
        parcel.writeParcelable(this.f218014d, i12);
        parcel.writeString(this.f218015e);
        CarouselGalleryGroup carouselGalleryGroup = this.f218016f;
        if (carouselGalleryGroup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(carouselGalleryGroup.name());
        }
    }
}
