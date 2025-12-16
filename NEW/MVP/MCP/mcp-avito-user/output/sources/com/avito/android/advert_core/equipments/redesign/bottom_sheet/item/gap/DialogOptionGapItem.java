package com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.gap;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: DialogOptionGapItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/equipments/redesign/bottom_sheet/item/gap/DialogOptionGapItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DialogOptionGapItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<DialogOptionGapItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f83496b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83497c;

    /* compiled from: DialogOptionGapItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DialogOptionGapItem> {
        @Override // android.os.Parcelable.Creator
        public final DialogOptionGapItem createFromParcel(Parcel parcel) {
            return new DialogOptionGapItem(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DialogOptionGapItem[] newArray(int i12) {
            return new DialogOptionGapItem[i12];
        }
    }

    public DialogOptionGapItem(@k String str, int i12) {
        this.f83496b = str;
        this.f83497c = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF75179b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75180c() {
        return this.f83496b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f83496b);
        parcel.writeInt(this.f83497c);
    }
}
