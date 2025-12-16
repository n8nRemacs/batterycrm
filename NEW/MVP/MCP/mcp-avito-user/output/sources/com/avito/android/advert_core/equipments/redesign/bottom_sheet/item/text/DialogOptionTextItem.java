package com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.text;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: DialogOptionTextItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/equipments/redesign/bottom_sheet/item/text/DialogOptionTextItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DialogOptionTextItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<DialogOptionTextItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f83504b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f83505c;

    /* compiled from: DialogOptionTextItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DialogOptionTextItem> {
        @Override // android.os.Parcelable.Creator
        public final DialogOptionTextItem createFromParcel(Parcel parcel) {
            return new DialogOptionTextItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DialogOptionTextItem[] newArray(int i12) {
            return new DialogOptionTextItem[i12];
        }
    }

    public DialogOptionTextItem(@k String str, @k String str2) {
        this.f83504b = str;
        this.f83505c = str2;
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
        return this.f83504b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f83504b);
        parcel.writeString(this.f83505c);
    }
}
