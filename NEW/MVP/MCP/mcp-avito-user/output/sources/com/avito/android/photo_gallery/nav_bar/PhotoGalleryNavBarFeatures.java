package com.avito.android.photo_gallery.nav_bar;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhotoGalleryNavBar.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBarFeatures;", "Landroid/os/Parcelable;", "_avito_photo-gallery_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PhotoGalleryNavBarFeatures implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PhotoGalleryNavBarFeatures> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PhotoGalleryNavBarFavoriteFeature f217496b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PhotoGalleryNavBarShareFeature f217497c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PhotoGalleryNavBarCompareFeature f217498d;

    /* compiled from: PhotoGalleryNavBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhotoGalleryNavBarFeatures> {
        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryNavBarFeatures createFromParcel(Parcel parcel) {
            return new PhotoGalleryNavBarFeatures(PhotoGalleryNavBarFavoriteFeature.CREATOR.createFromParcel(parcel), PhotoGalleryNavBarShareFeature.CREATOR.createFromParcel(parcel), PhotoGalleryNavBarCompareFeature.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryNavBarFeatures[] newArray(int i12) {
            return new PhotoGalleryNavBarFeatures[i12];
        }
    }

    public PhotoGalleryNavBarFeatures(@Y61.k PhotoGalleryNavBarFavoriteFeature photoGalleryNavBarFavoriteFeature, @Y61.k PhotoGalleryNavBarShareFeature photoGalleryNavBarShareFeature, @Y61.k PhotoGalleryNavBarCompareFeature photoGalleryNavBarCompareFeature) {
        this.f217496b = photoGalleryNavBarFavoriteFeature;
        this.f217497c = photoGalleryNavBarShareFeature;
        this.f217498d = photoGalleryNavBarCompareFeature;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoGalleryNavBarFeatures)) {
            return false;
        }
        PhotoGalleryNavBarFeatures photoGalleryNavBarFeatures = (PhotoGalleryNavBarFeatures) obj;
        return L.f(this.f217496b, photoGalleryNavBarFeatures.f217496b) && L.f(this.f217497c, photoGalleryNavBarFeatures.f217497c) && L.f(this.f217498d, photoGalleryNavBarFeatures.f217498d);
    }

    public final int hashCode() {
        return this.f217498d.hashCode() + ((this.f217497c.hashCode() + (this.f217496b.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "PhotoGalleryNavBarFeatures(favoriteFeature=" + this.f217496b + ", shareFeature=" + this.f217497c + ", compareFeature=" + this.f217498d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f217496b.writeToParcel(parcel, i12);
        this.f217497c.writeToParcel(parcel, i12);
        this.f217498d.writeToParcel(parcel, i12);
    }
}
