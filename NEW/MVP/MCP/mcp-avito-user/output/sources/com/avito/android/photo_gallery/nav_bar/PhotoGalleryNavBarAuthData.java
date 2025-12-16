package com.avito.android.photo_gallery.nav_bar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: PhotoGalleryNavBarAuthData.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBarAuthData;", "Landroid/os/Parcelable;", "ComparisonFeature", "Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBarAuthData$ComparisonFeature;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface PhotoGalleryNavBarAuthData extends Parcelable {

    /* compiled from: PhotoGalleryNavBarAuthData.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBarAuthData$ComparisonFeature;", "Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBarAuthData;", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ComparisonFeature implements PhotoGalleryNavBarAuthData {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final ComparisonFeature f217481b = new ComparisonFeature();

        @Y61.k
        public static final Parcelable.Creator<ComparisonFeature> CREATOR = new a();

        /* compiled from: PhotoGalleryNavBarAuthData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ComparisonFeature> {
            @Override // android.os.Parcelable.Creator
            public final ComparisonFeature createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ComparisonFeature.f217481b;
            }

            @Override // android.os.Parcelable.Creator
            public final ComparisonFeature[] newArray(int i12) {
                return new ComparisonFeature[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof ComparisonFeature);
        }

        public final int hashCode() {
            return 332908396;
        }

        @Y61.k
        public final String toString() {
            return "ComparisonFeature";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }
}
