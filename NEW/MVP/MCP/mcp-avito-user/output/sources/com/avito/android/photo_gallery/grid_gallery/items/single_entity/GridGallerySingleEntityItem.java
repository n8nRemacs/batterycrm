package com.avito.android.photo_gallery.grid_gallery.items.single_entity;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.photo_gallery.grid_gallery.items.GridGalleryItemEntity;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GridGallerySingleEntityItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/single_entity/GridGallerySingleEntityItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GridGallerySingleEntityItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<GridGallerySingleEntityItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f217280b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridGalleryItemEntity f217281c;

    /* compiled from: GridGallerySingleEntityItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GridGallerySingleEntityItem> {
        @Override // android.os.Parcelable.Creator
        public final GridGallerySingleEntityItem createFromParcel(Parcel parcel) {
            return new GridGallerySingleEntityItem(parcel.readString(), (GridGalleryItemEntity) parcel.readParcelable(GridGallerySingleEntityItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GridGallerySingleEntityItem[] newArray(int i12) {
            return new GridGallerySingleEntityItem[i12];
        }
    }

    public GridGallerySingleEntityItem(@k String str, @k GridGalleryItemEntity gridGalleryItemEntity) {
        this.f217280b = str;
        this.f217281c = gridGalleryItemEntity;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridGallerySingleEntityItem)) {
            return false;
        }
        GridGallerySingleEntityItem gridGallerySingleEntityItem = (GridGallerySingleEntityItem) obj;
        return L.f(this.f217280b, gridGallerySingleEntityItem.f217280b) && L.f(this.f217281c, gridGallerySingleEntityItem.f217281c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84801b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF200743b() {
        return this.f217280b;
    }

    public final int hashCode() {
        return this.f217281c.hashCode() + (this.f217280b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "GridGallerySingleEntityItem(stringId=" + this.f217280b + ", entity=" + this.f217281c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f217280b);
        parcel.writeParcelable(this.f217281c, i12);
    }
}
