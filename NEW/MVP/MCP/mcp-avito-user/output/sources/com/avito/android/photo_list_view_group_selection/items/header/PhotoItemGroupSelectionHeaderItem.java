package com.avito.android.photo_list_view_group_selection.items.header;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhotoItemGroupSelectionHeaderItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/items/header/PhotoItemGroupSelectionHeaderItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PhotoItemGroupSelectionHeaderItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<PhotoItemGroupSelectionHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f218415b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f218416c;

    /* compiled from: PhotoItemGroupSelectionHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhotoItemGroupSelectionHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final PhotoItemGroupSelectionHeaderItem createFromParcel(Parcel parcel) {
            return new PhotoItemGroupSelectionHeaderItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoItemGroupSelectionHeaderItem[] newArray(int i12) {
            return new PhotoItemGroupSelectionHeaderItem[i12];
        }
    }

    public PhotoItemGroupSelectionHeaderItem(@k String str, @k String str2) {
        this.f218415b = str;
        this.f218416c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoItemGroupSelectionHeaderItem)) {
            return false;
        }
        PhotoItemGroupSelectionHeaderItem photoItemGroupSelectionHeaderItem = (PhotoItemGroupSelectionHeaderItem) obj;
        return L.f(this.f218415b, photoItemGroupSelectionHeaderItem.f218415b) && L.f(this.f218416c, photoItemGroupSelectionHeaderItem.f218416c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF202667b() {
        return this.f218415b;
    }

    public final int hashCode() {
        return this.f218416c.hashCode() + (this.f218415b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoItemGroupSelectionHeaderItem(stringId=");
        sb2.append(this.f218415b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f218416c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f218415b);
        parcel.writeString(this.f218416c);
    }
}
