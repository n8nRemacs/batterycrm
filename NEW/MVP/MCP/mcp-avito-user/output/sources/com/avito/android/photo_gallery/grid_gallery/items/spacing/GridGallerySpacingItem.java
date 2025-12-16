package com.avito.android.photo_gallery.grid_gallery.items.spacing;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GridGallerySpacingItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/spacing/GridGallerySpacingItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GridGallerySpacingItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<GridGallerySpacingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f217296b;

    /* renamed from: c, reason: collision with root package name */
    public final int f217297c;

    /* compiled from: GridGallerySpacingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GridGallerySpacingItem> {
        @Override // android.os.Parcelable.Creator
        public final GridGallerySpacingItem createFromParcel(Parcel parcel) {
            return new GridGallerySpacingItem(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final GridGallerySpacingItem[] newArray(int i12) {
            return new GridGallerySpacingItem[i12];
        }
    }

    public GridGallerySpacingItem(@k String str, int i12) {
        this.f217296b = str;
        this.f217297c = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridGallerySpacingItem)) {
            return false;
        }
        GridGallerySpacingItem gridGallerySpacingItem = (GridGallerySpacingItem) obj;
        return L.f(this.f217296b, gridGallerySpacingItem.f217296b) && this.f217297c == gridGallerySpacingItem.f217297c;
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
        return this.f217296b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f217297c) + (this.f217296b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GridGallerySpacingItem(stringId=");
        sb2.append(this.f217296b);
        sb2.append(", height=");
        return r.t(sb2, this.f217297c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f217296b);
        parcel.writeInt(this.f217297c);
    }
}
