package com.avito.android.shift_list.ui.list.load_more_item;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ShiftListLoadMoreItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/shift_list/ui/list/load_more_item/ShiftListLoadMoreItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShiftListLoadMoreItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<ShiftListLoadMoreItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f281109b;

    /* compiled from: ShiftListLoadMoreItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ShiftListLoadMoreItem> {
        @Override // android.os.Parcelable.Creator
        public final ShiftListLoadMoreItem createFromParcel(Parcel parcel) {
            return new ShiftListLoadMoreItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShiftListLoadMoreItem[] newArray(int i12) {
            return new ShiftListLoadMoreItem[i12];
        }
    }

    public ShiftListLoadMoreItem(@k String str) {
        this.f281109b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272437b() {
        return getF279300b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF279300b() {
        return this.f281109b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f281109b);
    }
}
