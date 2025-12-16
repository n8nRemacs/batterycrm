package com.avito.android.gallery.ui;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.provider.clickstream.ParcelableClickStreamEvent;
import com.avito.android.remote.model.Image;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhotoGalleryOpenParams.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gallery/ui/PhotoGalleryOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PhotoGalleryOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<PhotoGalleryOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<Image> f159244b;

    /* renamed from: c, reason: collision with root package name */
    public final int f159245c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ParcelableClickStreamEvent f159246d;

    /* compiled from: PhotoGalleryOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhotoGalleryOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryOpenParams createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(PhotoGalleryOpenParams.class, parcel, arrayList, iL2, 1);
            }
            return new PhotoGalleryOpenParams(arrayList, parcel.readInt(), (ParcelableClickStreamEvent) parcel.readParcelable(PhotoGalleryOpenParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoGalleryOpenParams[] newArray(int i12) {
            return new PhotoGalleryOpenParams[i12];
        }
    }

    public PhotoGalleryOpenParams(@k List<Image> list, int i12, @l ParcelableClickStreamEvent parcelableClickStreamEvent) {
        this.f159244b = list;
        this.f159245c = i12;
        this.f159246d = parcelableClickStreamEvent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoGalleryOpenParams)) {
            return false;
        }
        PhotoGalleryOpenParams photoGalleryOpenParams = (PhotoGalleryOpenParams) obj;
        return L.f(this.f159244b, photoGalleryOpenParams.f159244b) && this.f159245c == photoGalleryOpenParams.f159245c && L.f(this.f159246d, photoGalleryOpenParams.f159246d);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f159245c, this.f159244b.hashCode() * 31, 31);
        ParcelableClickStreamEvent parcelableClickStreamEvent = this.f159246d;
        return iE2 + (parcelableClickStreamEvent == null ? 0 : parcelableClickStreamEvent.hashCode());
    }

    @k
    public final String toString() {
        return "PhotoGalleryOpenParams(images=" + this.f159244b + ", initialPosition=" + this.f159245c + ", onImageChangeEvent=" + this.f159246d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f159244b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f159245c);
        parcel.writeParcelable(this.f159246d, i12);
    }

    public /* synthetic */ PhotoGalleryOpenParams(List list, int i12, ParcelableClickStreamEvent parcelableClickStreamEvent, int i13, C42822w c42822w) {
        this(list, (i13 & 2) != 0 ? 0 : i12, parcelableClickStreamEvent);
    }
}
