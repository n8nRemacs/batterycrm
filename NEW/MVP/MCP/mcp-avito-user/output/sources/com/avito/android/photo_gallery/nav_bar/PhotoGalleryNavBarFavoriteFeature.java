package com.avito.android.photo_gallery.nav_bar;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhotoGalleryNavBar.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBarFavoriteFeature;", "Landroid/os/Parcelable;", "_avito_photo-gallery_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PhotoGalleryNavBarFavoriteFeature implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PhotoGalleryNavBarFavoriteFeature> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f217493b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AdvertisementVerticalAlias f217494c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Double f217495d;

    /* compiled from: PhotoGalleryNavBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhotoGalleryNavBarFavoriteFeature> {
        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryNavBarFavoriteFeature createFromParcel(Parcel parcel) {
            return new PhotoGalleryNavBarFavoriteFeature(parcel.readInt() != 0, parcel.readInt() == 0 ? null : AdvertisementVerticalAlias.valueOf(parcel.readString()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryNavBarFavoriteFeature[] newArray(int i12) {
            return new PhotoGalleryNavBarFavoriteFeature[i12];
        }
    }

    public PhotoGalleryNavBarFavoriteFeature(boolean z12, @Y61.l AdvertisementVerticalAlias advertisementVerticalAlias, @Y61.l Double d12) {
        this.f217493b = z12;
        this.f217494c = advertisementVerticalAlias;
        this.f217495d = d12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoGalleryNavBarFavoriteFeature)) {
            return false;
        }
        PhotoGalleryNavBarFavoriteFeature photoGalleryNavBarFavoriteFeature = (PhotoGalleryNavBarFavoriteFeature) obj;
        return this.f217493b == photoGalleryNavBarFavoriteFeature.f217493b && this.f217494c == photoGalleryNavBarFavoriteFeature.f217494c && L.f(this.f217495d, photoGalleryNavBarFavoriteFeature.f217495d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f217493b) * 31;
        AdvertisementVerticalAlias advertisementVerticalAlias = this.f217494c;
        int iHashCode2 = (iHashCode + (advertisementVerticalAlias == null ? 0 : advertisementVerticalAlias.hashCode())) * 31;
        Double d12 = this.f217495d;
        return iHashCode2 + (d12 != null ? d12.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoGalleryNavBarFavoriteFeature(favorite=");
        sb2.append(this.f217493b);
        sb2.append(", verticalAlias=");
        sb2.append(this.f217494c);
        sb2.append(", customerValue=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f217495d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f217493b ? 1 : 0);
        AdvertisementVerticalAlias advertisementVerticalAlias = this.f217494c;
        if (advertisementVerticalAlias == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(advertisementVerticalAlias.name());
        }
        Double d12 = this.f217495d;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
    }

    public /* synthetic */ PhotoGalleryNavBarFavoriteFeature(boolean z12, AdvertisementVerticalAlias advertisementVerticalAlias, Double d12, int i12, C42822w c42822w) {
        this(z12, (i12 & 2) != 0 ? null : advertisementVerticalAlias, (i12 & 4) != 0 ? null : d12);
    }
}
