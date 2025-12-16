package com.avito.android.photo_gallery_carousel.items.beduin_teaser;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.beduin_teaser.BeduinItemTeaser;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GalleryBeduinItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/beduin_teaser/GalleryBeduinItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GalleryBeduinItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<GalleryBeduinItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f217884b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final BeduinItemTeaser f217885c;

    /* compiled from: GalleryBeduinItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GalleryBeduinItem> {
        @Override // android.os.Parcelable.Creator
        public final GalleryBeduinItem createFromParcel(Parcel parcel) {
            return new GalleryBeduinItem(parcel.readString(), (BeduinItemTeaser) parcel.readParcelable(GalleryBeduinItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryBeduinItem[] newArray(int i12) {
            return new GalleryBeduinItem[i12];
        }
    }

    public GalleryBeduinItem(@k String str, @k BeduinItemTeaser beduinItemTeaser) {
        this.f217884b = str;
        this.f217885c = beduinItemTeaser;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryBeduinItem)) {
            return false;
        }
        GalleryBeduinItem galleryBeduinItem = (GalleryBeduinItem) obj;
        return L.f(this.f217884b, galleryBeduinItem.f217884b) && L.f(this.f217885c, galleryBeduinItem.f217885c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF217870b() {
        return this.f217884b;
    }

    public final int hashCode() {
        return this.f217885c.hashCode() + (this.f217884b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "GalleryBeduinItem(stringId=" + this.f217884b + ", teaser=" + this.f217885c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f217884b);
        parcel.writeParcelable(this.f217885c, i12);
    }
}
