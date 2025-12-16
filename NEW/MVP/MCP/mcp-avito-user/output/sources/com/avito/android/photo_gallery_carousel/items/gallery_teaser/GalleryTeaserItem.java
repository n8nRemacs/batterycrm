package com.avito.android.photo_gallery_carousel.items.gallery_teaser;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GalleryTeaserItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/gallery_teaser/GalleryTeaserItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GalleryTeaserItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<GalleryTeaserItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f217914b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GalleryTeaser f217915c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final PinchToZoomSource f217916d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.d f217917e;

    /* compiled from: GalleryTeaserItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GalleryTeaserItem> {
        @Override // android.os.Parcelable.Creator
        public final GalleryTeaserItem createFromParcel(Parcel parcel) {
            return new GalleryTeaserItem(parcel.readString(), (GalleryTeaser) parcel.readParcelable(GalleryTeaserItem.class.getClassLoader()), parcel.readInt() == 0 ? null : PinchToZoomSource.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryTeaserItem[] newArray(int i12) {
            return new GalleryTeaserItem[i12];
        }
    }

    public GalleryTeaserItem(@k String str, @k GalleryTeaser galleryTeaser, @l PinchToZoomSource pinchToZoomSource) {
        this.f217914b = str;
        this.f217915c = galleryTeaser;
        this.f217916d = pinchToZoomSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryTeaserItem)) {
            return false;
        }
        GalleryTeaserItem galleryTeaserItem = (GalleryTeaserItem) obj;
        return L.f(this.f217914b, galleryTeaserItem.f217914b) && L.f(this.f217915c, galleryTeaserItem.f217915c) && this.f217916d == galleryTeaserItem.f217916d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83054c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF199668b() {
        return this.f217914b;
    }

    public final int hashCode() {
        int iHashCode = (this.f217915c.hashCode() + (this.f217914b.hashCode() * 31)) * 31;
        PinchToZoomSource pinchToZoomSource = this.f217916d;
        return iHashCode + (pinchToZoomSource == null ? 0 : pinchToZoomSource.hashCode());
    }

    @k
    public final String toString() {
        return "GalleryTeaserItem(stringId=" + this.f217914b + ", galleryTeaser=" + this.f217915c + ", pinchToZoomSource=" + this.f217916d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f217914b);
        parcel.writeParcelable(this.f217915c, i12);
        PinchToZoomSource pinchToZoomSource = this.f217916d;
        if (pinchToZoomSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(pinchToZoomSource.name());
        }
    }
}
