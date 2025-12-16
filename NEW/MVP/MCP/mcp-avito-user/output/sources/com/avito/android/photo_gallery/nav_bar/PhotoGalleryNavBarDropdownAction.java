package com.avito.android.photo_gallery.nav_bar;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhotoGalleryNavBar.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBarDropdownAction;", "Landroid/os/Parcelable;", "_avito_photo-gallery_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PhotoGalleryNavBarDropdownAction implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PhotoGalleryNavBarDropdownAction> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PhotoGalleryNavBarActionType f217485b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f217486c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f217487d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final DeepLink f217488e;

    /* compiled from: PhotoGalleryNavBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhotoGalleryNavBarDropdownAction> {
        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryNavBarDropdownAction createFromParcel(Parcel parcel) {
            return new PhotoGalleryNavBarDropdownAction(PhotoGalleryNavBarActionType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(PhotoGalleryNavBarDropdownAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryNavBarDropdownAction[] newArray(int i12) {
            return new PhotoGalleryNavBarDropdownAction[i12];
        }
    }

    public PhotoGalleryNavBarDropdownAction(@Y61.k PhotoGalleryNavBarActionType photoGalleryNavBarActionType, @Y61.l String str, @Y61.l String str2, @Y61.l DeepLink deepLink) {
        this.f217485b = photoGalleryNavBarActionType;
        this.f217486c = str;
        this.f217487d = str2;
        this.f217488e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoGalleryNavBarDropdownAction)) {
            return false;
        }
        PhotoGalleryNavBarDropdownAction photoGalleryNavBarDropdownAction = (PhotoGalleryNavBarDropdownAction) obj;
        return this.f217485b == photoGalleryNavBarDropdownAction.f217485b && L.f(this.f217486c, photoGalleryNavBarDropdownAction.f217486c) && L.f(this.f217487d, photoGalleryNavBarDropdownAction.f217487d) && L.f(this.f217488e, photoGalleryNavBarDropdownAction.f217488e);
    }

    public final int hashCode() {
        int iHashCode = this.f217485b.hashCode() * 31;
        String str = this.f217486c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f217487d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.f217488e;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoGalleryNavBarDropdownAction(type=");
        sb2.append(this.f217485b);
        sb2.append(", icon=");
        sb2.append(this.f217486c);
        sb2.append(", text=");
        sb2.append(this.f217487d);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f217488e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f217485b.name());
        parcel.writeString(this.f217486c);
        parcel.writeString(this.f217487d);
        parcel.writeParcelable(this.f217488e, i12);
    }
}
