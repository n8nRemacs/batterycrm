package com.avito.android.photo_list_view_group_selection.items.imageGroup;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhotoItemGroupSelectionImageGroupItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/items/imageGroup/PhotoItemGroupSelectionImageGroupItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PhotoItemGroupSelectionImageGroupItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<PhotoItemGroupSelectionImageGroupItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f218424b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f218425c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f218426d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f218427e;

    /* compiled from: PhotoItemGroupSelectionImageGroupItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhotoItemGroupSelectionImageGroupItem> {
        @Override // android.os.Parcelable.Creator
        public final PhotoItemGroupSelectionImageGroupItem createFromParcel(Parcel parcel) {
            return new PhotoItemGroupSelectionImageGroupItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoItemGroupSelectionImageGroupItem[] newArray(int i12) {
            return new PhotoItemGroupSelectionImageGroupItem[i12];
        }
    }

    public PhotoItemGroupSelectionImageGroupItem(@k String str, @k String str2, @k String str3, boolean z12) {
        this.f218424b = str;
        this.f218425c = str2;
        this.f218426d = str3;
        this.f218427e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoItemGroupSelectionImageGroupItem)) {
            return false;
        }
        PhotoItemGroupSelectionImageGroupItem photoItemGroupSelectionImageGroupItem = (PhotoItemGroupSelectionImageGroupItem) obj;
        return L.f(this.f218424b, photoItemGroupSelectionImageGroupItem.f218424b) && L.f(this.f218425c, photoItemGroupSelectionImageGroupItem.f218425c) && L.f(this.f218426d, photoItemGroupSelectionImageGroupItem.f218426d) && this.f218427e == photoItemGroupSelectionImageGroupItem.f218427e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207600b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF214492b() {
        return this.f218424b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f218427e) + H.d(H.d(this.f218424b.hashCode() * 31, 31, this.f218425c), 31, this.f218426d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoItemGroupSelectionImageGroupItem(stringId=");
        sb2.append(this.f218424b);
        sb2.append(", groupId=");
        sb2.append(this.f218425c);
        sb2.append(", title=");
        sb2.append(this.f218426d);
        sb2.append(", checked=");
        return r.x(sb2, this.f218427e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f218424b);
        parcel.writeString(this.f218425c);
        parcel.writeString(this.f218426d);
        parcel.writeInt(this.f218427e ? 1 : 0);
    }
}
