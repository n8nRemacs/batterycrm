package com.avito.android.photo_gallery.grid_gallery.items.title;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GridGalleryTitleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/title/GridGalleryTitleItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GridGalleryTitleItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<GridGalleryTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f217303b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f217304c;

    /* compiled from: GridGalleryTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GridGalleryTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final GridGalleryTitleItem createFromParcel(Parcel parcel) {
            return new GridGalleryTitleItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GridGalleryTitleItem[] newArray(int i12) {
            return new GridGalleryTitleItem[i12];
        }
    }

    public GridGalleryTitleItem(@k String str, @k String str2) {
        this.f217303b = str;
        this.f217304c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridGalleryTitleItem)) {
            return false;
        }
        GridGalleryTitleItem gridGalleryTitleItem = (GridGalleryTitleItem) obj;
        return L.f(this.f217303b, gridGalleryTitleItem.f217303b) && L.f(this.f217304c, gridGalleryTitleItem.f217304c);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF217280b() {
        return this.f217303b;
    }

    public final int hashCode() {
        return this.f217304c.hashCode() + (this.f217303b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GridGalleryTitleItem(stringId=");
        sb2.append(this.f217303b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f217304c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f217303b);
        parcel.writeString(this.f217304c);
    }
}
