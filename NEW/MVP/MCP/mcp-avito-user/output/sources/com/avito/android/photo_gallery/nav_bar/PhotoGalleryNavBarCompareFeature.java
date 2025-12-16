package com.avito.android.photo_gallery.nav_bar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhotoGalleryNavBar.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBarCompareFeature;", "Landroid/os/Parcelable;", "_avito_photo-gallery_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PhotoGalleryNavBarCompareFeature implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PhotoGalleryNavBarCompareFeature> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f217482b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f217483c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f217484d;

    /* compiled from: PhotoGalleryNavBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhotoGalleryNavBarCompareFeature> {
        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryNavBarCompareFeature createFromParcel(Parcel parcel) {
            return new PhotoGalleryNavBarCompareFeature(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryNavBarCompareFeature[] newArray(int i12) {
            return new PhotoGalleryNavBarCompareFeature[i12];
        }
    }

    public PhotoGalleryNavBarCompareFeature(@Y61.k String str, @Y61.l String str2, boolean z12) {
        this.f217482b = str;
        this.f217483c = str2;
        this.f217484d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoGalleryNavBarCompareFeature)) {
            return false;
        }
        PhotoGalleryNavBarCompareFeature photoGalleryNavBarCompareFeature = (PhotoGalleryNavBarCompareFeature) obj;
        return L.f(this.f217482b, photoGalleryNavBarCompareFeature.f217482b) && L.f(this.f217483c, photoGalleryNavBarCompareFeature.f217483c) && this.f217484d == photoGalleryNavBarCompareFeature.f217484d;
    }

    public final int hashCode() {
        int iHashCode = this.f217482b.hashCode() * 31;
        String str = this.f217483c;
        return Boolean.hashCode(this.f217484d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoGalleryNavBarCompareFeature(itemId=");
        sb2.append(this.f217482b);
        sb2.append(", categoryId=");
        sb2.append(this.f217483c);
        sb2.append(", isAdded=");
        return r.x(sb2, this.f217484d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f217482b);
        parcel.writeString(this.f217483c);
        parcel.writeInt(this.f217484d ? 1 : 0);
    }

    public /* synthetic */ PhotoGalleryNavBarCompareFeature(String str, String str2, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? false : z12);
    }
}
