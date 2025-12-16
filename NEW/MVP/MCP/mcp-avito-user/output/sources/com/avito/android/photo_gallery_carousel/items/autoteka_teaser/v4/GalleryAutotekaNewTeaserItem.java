package com.avito.android.photo_gallery_carousel.items.autoteka_teaser.v4;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserGallery;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GalleryAutotekaNewTeaserItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/autoteka_teaser/v4/GalleryAutotekaNewTeaserItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GalleryAutotekaNewTeaserItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<GalleryAutotekaNewTeaserItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f217870b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AutotekaTeaserGallery f217871c;

    /* compiled from: GalleryAutotekaNewTeaserItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GalleryAutotekaNewTeaserItem> {
        @Override // android.os.Parcelable.Creator
        public final GalleryAutotekaNewTeaserItem createFromParcel(Parcel parcel) {
            return new GalleryAutotekaNewTeaserItem(parcel.readString(), (AutotekaTeaserGallery) parcel.readParcelable(GalleryAutotekaNewTeaserItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryAutotekaNewTeaserItem[] newArray(int i12) {
            return new GalleryAutotekaNewTeaserItem[i12];
        }
    }

    public GalleryAutotekaNewTeaserItem(@k String str, @k AutotekaTeaserGallery autotekaTeaserGallery) {
        this.f217870b = str;
        this.f217871c = autotekaTeaserGallery;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryAutotekaNewTeaserItem)) {
            return false;
        }
        GalleryAutotekaNewTeaserItem galleryAutotekaNewTeaserItem = (GalleryAutotekaNewTeaserItem) obj;
        return L.f(this.f217870b, galleryAutotekaNewTeaserItem.f217870b) && L.f(this.f217871c, galleryAutotekaNewTeaserItem.f217871c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF217870b() {
        return this.f217870b;
    }

    public final int hashCode() {
        return this.f217871c.hashCode() + (this.f217870b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "GalleryAutotekaNewTeaserItem(stringId=" + this.f217870b + ", teaserGallery=" + this.f217871c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f217870b);
        parcel.writeParcelable(this.f217871c, i12);
    }
}
