package com.avito.android.photo_gallery.grid_gallery.items.double_entity;

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

/* compiled from: GridGalleryDoubleEntityItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/double_entity/GridGalleryDoubleEntityItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GridGalleryDoubleEntityItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<GridGalleryDoubleEntityItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f217245b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridGalleryItemEntity f217246c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final GridGalleryItemEntity f217247d;

    /* compiled from: GridGalleryDoubleEntityItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GridGalleryDoubleEntityItem> {
        @Override // android.os.Parcelable.Creator
        public final GridGalleryDoubleEntityItem createFromParcel(Parcel parcel) {
            return new GridGalleryDoubleEntityItem(parcel.readString(), (GridGalleryItemEntity) parcel.readParcelable(GridGalleryDoubleEntityItem.class.getClassLoader()), (GridGalleryItemEntity) parcel.readParcelable(GridGalleryDoubleEntityItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GridGalleryDoubleEntityItem[] newArray(int i12) {
            return new GridGalleryDoubleEntityItem[i12];
        }
    }

    public GridGalleryDoubleEntityItem(@k String str, @k GridGalleryItemEntity gridGalleryItemEntity, @k GridGalleryItemEntity gridGalleryItemEntity2) {
        this.f217245b = str;
        this.f217246c = gridGalleryItemEntity;
        this.f217247d = gridGalleryItemEntity2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridGalleryDoubleEntityItem)) {
            return false;
        }
        GridGalleryDoubleEntityItem gridGalleryDoubleEntityItem = (GridGalleryDoubleEntityItem) obj;
        return L.f(this.f217245b, gridGalleryDoubleEntityItem.f217245b) && L.f(this.f217246c, gridGalleryDoubleEntityItem.f217246c) && L.f(this.f217247d, gridGalleryDoubleEntityItem.f217247d);
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
        return this.f217245b;
    }

    public final int hashCode() {
        return this.f217247d.hashCode() + ((this.f217246c.hashCode() + (this.f217245b.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        return "GridGalleryDoubleEntityItem(stringId=" + this.f217245b + ", left=" + this.f217246c + ", right=" + this.f217247d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f217245b);
        parcel.writeParcelable(this.f217246c, i12);
        parcel.writeParcelable(this.f217247d, i12);
    }
}
