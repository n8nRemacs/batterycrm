package com.avito.android.photo_gallery.nav_bar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.AdvertSharing;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhotoGalleryNavBar.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBarShareFeature;", "Landroid/os/Parcelable;", "_avito_photo-gallery_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PhotoGalleryNavBarShareFeature implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PhotoGalleryNavBarShareFeature> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AdvertSharing f217506b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f217507c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f217508d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f217509e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f217510f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f217511g;

    /* compiled from: PhotoGalleryNavBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhotoGalleryNavBarShareFeature> {
        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryNavBarShareFeature createFromParcel(Parcel parcel) {
            return new PhotoGalleryNavBarShareFeature((AdvertSharing) parcel.readParcelable(PhotoGalleryNavBarShareFeature.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryNavBarShareFeature[] newArray(int i12) {
            return new PhotoGalleryNavBarShareFeature[i12];
        }
    }

    public PhotoGalleryNavBarShareFeature(@Y61.l AdvertSharing advertSharing, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k String str5) {
        this.f217506b = advertSharing;
        this.f217507c = str;
        this.f217508d = str2;
        this.f217509e = str3;
        this.f217510f = str4;
        this.f217511g = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoGalleryNavBarShareFeature)) {
            return false;
        }
        PhotoGalleryNavBarShareFeature photoGalleryNavBarShareFeature = (PhotoGalleryNavBarShareFeature) obj;
        return L.f(this.f217506b, photoGalleryNavBarShareFeature.f217506b) && L.f(this.f217507c, photoGalleryNavBarShareFeature.f217507c) && L.f(this.f217508d, photoGalleryNavBarShareFeature.f217508d) && L.f(this.f217509e, photoGalleryNavBarShareFeature.f217509e) && L.f(this.f217510f, photoGalleryNavBarShareFeature.f217510f) && L.f(this.f217511g, photoGalleryNavBarShareFeature.f217511g);
    }

    public final int hashCode() {
        AdvertSharing advertSharing = this.f217506b;
        int iD2 = H.d((advertSharing == null ? 0 : advertSharing.hashCode()) * 31, 31, this.f217507c);
        String str = this.f217508d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f217509e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f217510f;
        return this.f217511g.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoGalleryNavBarShareFeature(sharing=");
        sb2.append(this.f217506b);
        sb2.append(", itemId=");
        sb2.append(this.f217507c);
        sb2.append(", categoryId=");
        sb2.append(this.f217508d);
        sb2.append(", microCategoryId=");
        sb2.append(this.f217509e);
        sb2.append(", locationId=");
        sb2.append(this.f217510f);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f217511g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f217506b, i12);
        parcel.writeString(this.f217507c);
        parcel.writeString(this.f217508d);
        parcel.writeString(this.f217509e);
        parcel.writeString(this.f217510f);
        parcel.writeString(this.f217511g);
    }
}
