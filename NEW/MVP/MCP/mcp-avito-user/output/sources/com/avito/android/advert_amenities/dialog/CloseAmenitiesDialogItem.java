package com.avito.android.advert_amenities.dialog;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CloseAmenitiesDialogItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_amenities/dialog/CloseAmenitiesDialogItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-amenities_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CloseAmenitiesDialogItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<CloseAmenitiesDialogItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f81163b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f81164c;

    /* compiled from: CloseAmenitiesDialogItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CloseAmenitiesDialogItem> {
        @Override // android.os.Parcelable.Creator
        public final CloseAmenitiesDialogItem createFromParcel(Parcel parcel) {
            return new CloseAmenitiesDialogItem(parcel.readString(), (AttributedText) parcel.readParcelable(CloseAmenitiesDialogItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CloseAmenitiesDialogItem[] newArray(int i12) {
            return new CloseAmenitiesDialogItem[i12];
        }
    }

    public CloseAmenitiesDialogItem(@k String str, @k AttributedText attributedText) {
        this.f81163b = str;
        this.f81164c = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseAmenitiesDialogItem)) {
            return false;
        }
        CloseAmenitiesDialogItem closeAmenitiesDialogItem = (CloseAmenitiesDialogItem) obj;
        return L.f(this.f81163b, closeAmenitiesDialogItem.f81163b) && L.f(this.f81164c, closeAmenitiesDialogItem.f81164c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79389b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283255b() {
        return this.f81163b;
    }

    public final int hashCode() {
        return this.f81164c.hashCode() + (this.f81163b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CloseAmenitiesDialogItem(stringId=");
        sb2.append(this.f81163b);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f81164c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f81163b);
        parcel.writeParcelable(this.f81164c, i12);
    }
}
