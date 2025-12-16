package com.avito.android.photo_gallery.nav_bar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhotoGalleryNavBarState.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBarState;", "Landroid/os/Parcelable;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PhotoGalleryNavBarState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PhotoGalleryNavBarState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f217512b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<PhotoGalleryNavBarDropdownMenuItem> f217513c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f217514d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f217515e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final PhotoGalleryNavBar f217516f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f217517g;

    /* renamed from: h, reason: collision with root package name */
    public final long f217518h;

    /* compiled from: PhotoGalleryNavBarState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhotoGalleryNavBarState> {
        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryNavBarState createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(PhotoGalleryNavBarDropdownMenuItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new PhotoGalleryNavBarState(string, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, (PhotoGalleryNavBar) parcel.readParcelable(PhotoGalleryNavBarState.class.getClassLoader()), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryNavBarState[] newArray(int i12) {
            return new PhotoGalleryNavBarState[i12];
        }
    }

    public PhotoGalleryNavBarState() {
        this(null, null, false, false, null, null, 0L, 127, null);
    }

    public static PhotoGalleryNavBarState a(PhotoGalleryNavBarState photoGalleryNavBarState, String str, List list, boolean z12, boolean z13, PhotoGalleryNavBar photoGalleryNavBar, String str2, long j12, int i12) {
        String str3 = (i12 & 1) != 0 ? photoGalleryNavBarState.f217512b : str;
        List list2 = (i12 & 2) != 0 ? photoGalleryNavBarState.f217513c : list;
        boolean z14 = (i12 & 4) != 0 ? photoGalleryNavBarState.f217514d : z12;
        boolean z15 = (i12 & 8) != 0 ? photoGalleryNavBarState.f217515e : z13;
        PhotoGalleryNavBar photoGalleryNavBar2 = (i12 & 16) != 0 ? photoGalleryNavBarState.f217516f : photoGalleryNavBar;
        String str4 = (i12 & 32) != 0 ? photoGalleryNavBarState.f217517g : str2;
        long j13 = (i12 & 64) != 0 ? photoGalleryNavBarState.f217518h : j12;
        photoGalleryNavBarState.getClass();
        return new PhotoGalleryNavBarState(str3, list2, z14, z15, photoGalleryNavBar2, str4, j13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoGalleryNavBarState)) {
            return false;
        }
        PhotoGalleryNavBarState photoGalleryNavBarState = (PhotoGalleryNavBarState) obj;
        return L.f(this.f217512b, photoGalleryNavBarState.f217512b) && L.f(this.f217513c, photoGalleryNavBarState.f217513c) && this.f217514d == photoGalleryNavBarState.f217514d && this.f217515e == photoGalleryNavBarState.f217515e && L.f(this.f217516f, photoGalleryNavBarState.f217516f) && L.f(this.f217517g, photoGalleryNavBarState.f217517g) && this.f217518h == photoGalleryNavBarState.f217518h;
    }

    public final int hashCode() {
        String str = this.f217512b;
        int i12 = r.i(r.i(H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f217513c), 31, this.f217514d), 31, this.f217515e);
        PhotoGalleryNavBar photoGalleryNavBar = this.f217516f;
        int iHashCode = (i12 + (photoGalleryNavBar == null ? 0 : photoGalleryNavBar.hashCode())) * 31;
        String str2 = this.f217517g;
        return Long.hashCode(this.f217518h) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoGalleryNavBarState(advertId=");
        sb2.append(this.f217512b);
        sb2.append(", dropdownMenuItems=");
        sb2.append(this.f217513c);
        sb2.append(", favorite=");
        sb2.append(this.f217514d);
        sb2.append(", inComparison=");
        sb2.append(this.f217515e);
        sb2.append(", navBarData=");
        sb2.append(this.f217516f);
        sb2.append(", searchContext=");
        sb2.append(this.f217517g);
        sb2.append(", stateId=");
        return r.u(sb2, this.f217518h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f217512b);
        Iterator itJ = C0.j(this.f217513c, parcel);
        while (itJ.hasNext()) {
            ((PhotoGalleryNavBarDropdownMenuItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f217514d ? 1 : 0);
        parcel.writeInt(this.f217515e ? 1 : 0);
        parcel.writeParcelable(this.f217516f, i12);
        parcel.writeString(this.f217517g);
        parcel.writeLong(this.f217518h);
    }

    public PhotoGalleryNavBarState(@Y61.l String str, @Y61.k List<PhotoGalleryNavBarDropdownMenuItem> list, boolean z12, boolean z13, @Y61.l PhotoGalleryNavBar photoGalleryNavBar, @Y61.l String str2, long j12) {
        this.f217512b = str;
        this.f217513c = list;
        this.f217514d = z12;
        this.f217515e = z13;
        this.f217516f = photoGalleryNavBar;
        this.f217517g = str2;
        this.f217518h = j12;
    }

    public PhotoGalleryNavBarState(String str, List list, boolean z12, boolean z13, PhotoGalleryNavBar photoGalleryNavBar, String str2, long j12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? null : photoGalleryNavBar, (i12 & 32) == 0 ? str2 : null, (i12 & 64) != 0 ? 0L : j12);
    }
}
