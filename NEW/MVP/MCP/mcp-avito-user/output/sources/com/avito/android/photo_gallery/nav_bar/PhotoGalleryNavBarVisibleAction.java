package com.avito.android.photo_gallery.nav_bar;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhotoGalleryNavBar.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBarVisibleAction;", "Landroid/os/Parcelable;", "_avito_photo-gallery_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PhotoGalleryNavBarVisibleAction implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PhotoGalleryNavBarVisibleAction> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PhotoGalleryNavBarActionType f217519b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f217520c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final DeepLink f217521d;

    /* compiled from: PhotoGalleryNavBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhotoGalleryNavBarVisibleAction> {
        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryNavBarVisibleAction createFromParcel(Parcel parcel) {
            return new PhotoGalleryNavBarVisibleAction(PhotoGalleryNavBarActionType.valueOf(parcel.readString()), parcel.readString(), (DeepLink) parcel.readParcelable(PhotoGalleryNavBarVisibleAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryNavBarVisibleAction[] newArray(int i12) {
            return new PhotoGalleryNavBarVisibleAction[i12];
        }
    }

    public PhotoGalleryNavBarVisibleAction(@Y61.k PhotoGalleryNavBarActionType photoGalleryNavBarActionType, @Y61.l String str, @Y61.l DeepLink deepLink) {
        this.f217519b = photoGalleryNavBarActionType;
        this.f217520c = str;
        this.f217521d = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoGalleryNavBarVisibleAction)) {
            return false;
        }
        PhotoGalleryNavBarVisibleAction photoGalleryNavBarVisibleAction = (PhotoGalleryNavBarVisibleAction) obj;
        return this.f217519b == photoGalleryNavBarVisibleAction.f217519b && L.f(this.f217520c, photoGalleryNavBarVisibleAction.f217520c) && L.f(this.f217521d, photoGalleryNavBarVisibleAction.f217521d);
    }

    public final int hashCode() {
        int iHashCode = this.f217519b.hashCode() * 31;
        String str = this.f217520c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f217521d;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoGalleryNavBarVisibleAction(type=");
        sb2.append(this.f217519b);
        sb2.append(", icon=");
        sb2.append(this.f217520c);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f217521d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f217519b.name());
        parcel.writeString(this.f217520c);
        parcel.writeParcelable(this.f217521d, i12);
    }
}
