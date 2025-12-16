package com.avito.android.photo_gallery.nav_bar;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhotoGalleryNavBar.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBar;", "Landroid/os/Parcelable;", "_avito_photo-gallery_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PhotoGalleryNavBar implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PhotoGalleryNavBar> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final ArrayList f217472b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ArrayList f217473c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PhotoGalleryNavBarFeatures f217474d;

    /* compiled from: PhotoGalleryNavBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhotoGalleryNavBar> {
        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryNavBar createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int iC2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(PhotoGalleryNavBarVisibleAction.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(PhotoGalleryNavBarDropdownAction.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new PhotoGalleryNavBar(arrayList, arrayList2, PhotoGalleryNavBarFeatures.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryNavBar[] newArray(int i12) {
            return new PhotoGalleryNavBar[i12];
        }
    }

    public PhotoGalleryNavBar(@Y61.l ArrayList arrayList, @Y61.l ArrayList arrayList2, @Y61.k PhotoGalleryNavBarFeatures photoGalleryNavBarFeatures) {
        this.f217472b = arrayList;
        this.f217473c = arrayList2;
        this.f217474d = photoGalleryNavBarFeatures;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoGalleryNavBar)) {
            return false;
        }
        PhotoGalleryNavBar photoGalleryNavBar = (PhotoGalleryNavBar) obj;
        return L.f(this.f217472b, photoGalleryNavBar.f217472b) && L.f(this.f217473c, photoGalleryNavBar.f217473c) && L.f(this.f217474d, photoGalleryNavBar.f217474d);
    }

    public final int hashCode() {
        ArrayList arrayList = this.f217472b;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList arrayList2 = this.f217473c;
        return this.f217474d.hashCode() + ((iHashCode + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "PhotoGalleryNavBar(visibleActions=" + this.f217472b + ", dropdownActions=" + this.f217473c + ", features=" + this.f217474d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        ArrayList arrayList = this.f217472b;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                ((PhotoGalleryNavBarVisibleAction) itY.next()).writeToParcel(parcel, i12);
            }
        }
        ArrayList arrayList2 = this.f217473c;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY2 = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList2);
            while (itY2.hasNext()) {
                ((PhotoGalleryNavBarDropdownAction) itY2.next()).writeToParcel(parcel, i12);
            }
        }
        this.f217474d.writeToParcel(parcel, i12);
    }
}
