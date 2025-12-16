package com.avito.android.photo_gallery.nav_bar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhotoGalleryNavBarMenuItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBarDropdownMenuItem;", "Landroid/os/Parcelable;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PhotoGalleryNavBarDropdownMenuItem implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PhotoGalleryNavBarDropdownMenuItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final PhotoGalleryNavBarMenuItemType f217489b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f217490c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final PrintableText f217491d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final DeepLink f217492e;

    /* compiled from: PhotoGalleryNavBarMenuItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhotoGalleryNavBarDropdownMenuItem> {
        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryNavBarDropdownMenuItem createFromParcel(Parcel parcel) {
            return new PhotoGalleryNavBarDropdownMenuItem(parcel.readInt() == 0 ? null : PhotoGalleryNavBarMenuItemType.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (PrintableText) parcel.readParcelable(PhotoGalleryNavBarDropdownMenuItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(PhotoGalleryNavBarDropdownMenuItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryNavBarDropdownMenuItem[] newArray(int i12) {
            return new PhotoGalleryNavBarDropdownMenuItem[i12];
        }
    }

    public PhotoGalleryNavBarDropdownMenuItem(@Y61.l PhotoGalleryNavBarMenuItemType photoGalleryNavBarMenuItemType, @Y61.l Integer num, @Y61.l PrintableText printableText, @Y61.l DeepLink deepLink) {
        this.f217489b = photoGalleryNavBarMenuItemType;
        this.f217490c = num;
        this.f217491d = printableText;
        this.f217492e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoGalleryNavBarDropdownMenuItem)) {
            return false;
        }
        PhotoGalleryNavBarDropdownMenuItem photoGalleryNavBarDropdownMenuItem = (PhotoGalleryNavBarDropdownMenuItem) obj;
        return this.f217489b == photoGalleryNavBarDropdownMenuItem.f217489b && L.f(this.f217490c, photoGalleryNavBarDropdownMenuItem.f217490c) && L.f(this.f217491d, photoGalleryNavBarDropdownMenuItem.f217491d) && L.f(this.f217492e, photoGalleryNavBarDropdownMenuItem.f217492e);
    }

    public final int hashCode() {
        PhotoGalleryNavBarMenuItemType photoGalleryNavBarMenuItemType = this.f217489b;
        int iHashCode = (photoGalleryNavBarMenuItemType == null ? 0 : photoGalleryNavBarMenuItemType.hashCode()) * 31;
        Integer num = this.f217490c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        PrintableText printableText = this.f217491d;
        int iHashCode3 = (iHashCode2 + (printableText == null ? 0 : printableText.hashCode())) * 31;
        DeepLink deepLink = this.f217492e;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoGalleryNavBarDropdownMenuItem(type=");
        sb2.append(this.f217489b);
        sb2.append(", iconAttr=");
        sb2.append(this.f217490c);
        sb2.append(", text=");
        sb2.append(this.f217491d);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f217492e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        PhotoGalleryNavBarMenuItemType photoGalleryNavBarMenuItemType = this.f217489b;
        if (photoGalleryNavBarMenuItemType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(photoGalleryNavBarMenuItemType.name());
        }
        Integer num = this.f217490c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f217491d, i12);
        parcel.writeParcelable(this.f217492e, i12);
    }

    public /* synthetic */ PhotoGalleryNavBarDropdownMenuItem(PhotoGalleryNavBarMenuItemType photoGalleryNavBarMenuItemType, Integer num, PrintableText printableText, DeepLink deepLink, int i12, C42822w c42822w) {
        this(photoGalleryNavBarMenuItemType, num, printableText, (i12 & 8) != 0 ? null : deepLink);
    }
}
