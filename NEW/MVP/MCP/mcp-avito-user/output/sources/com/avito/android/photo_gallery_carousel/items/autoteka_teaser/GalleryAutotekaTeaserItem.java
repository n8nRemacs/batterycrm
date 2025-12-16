package com.avito.android.photo_gallery_carousel.items.autoteka_teaser;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GalleryAutotekaTeaserItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/autoteka_teaser/GalleryAutotekaTeaserItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GalleryAutotekaTeaserItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<GalleryAutotekaTeaserItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f217853b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AutotekaTeaserResult f217854c;

    /* compiled from: GalleryAutotekaTeaserItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GalleryAutotekaTeaserItem> {
        @Override // android.os.Parcelable.Creator
        public final GalleryAutotekaTeaserItem createFromParcel(Parcel parcel) {
            return new GalleryAutotekaTeaserItem(parcel.readString(), (AutotekaTeaserResult) parcel.readParcelable(GalleryAutotekaTeaserItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryAutotekaTeaserItem[] newArray(int i12) {
            return new GalleryAutotekaTeaserItem[i12];
        }
    }

    public GalleryAutotekaTeaserItem(@k String str, @k AutotekaTeaserResult autotekaTeaserResult) {
        this.f217853b = str;
        this.f217854c = autotekaTeaserResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryAutotekaTeaserItem)) {
            return false;
        }
        GalleryAutotekaTeaserItem galleryAutotekaTeaserItem = (GalleryAutotekaTeaserItem) obj;
        return L.f(this.f217853b, galleryAutotekaTeaserItem.f217853b) && L.f(this.f217854c, galleryAutotekaTeaserItem.f217854c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78384b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF78385c() {
        return this.f217853b;
    }

    public final int hashCode() {
        return this.f217854c.hashCode() + (this.f217853b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "GalleryAutotekaTeaserItem(stringId=" + this.f217853b + ", teaser=" + this.f217854c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f217853b);
        parcel.writeParcelable(this.f217854c, i12);
    }
}
