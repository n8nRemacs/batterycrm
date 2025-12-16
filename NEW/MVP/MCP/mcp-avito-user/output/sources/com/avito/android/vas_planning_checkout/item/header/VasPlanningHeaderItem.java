package com.avito.android.vas_planning_checkout.item.header;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasPlanningHeaderItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/item/header/VasPlanningHeaderItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VasPlanningHeaderItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<VasPlanningHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f322965b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f322966c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f322967d;

    /* compiled from: VasPlanningHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasPlanningHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final VasPlanningHeaderItem createFromParcel(Parcel parcel) {
            return new VasPlanningHeaderItem(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(VasPlanningHeaderItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VasPlanningHeaderItem[] newArray(int i12) {
            return new VasPlanningHeaderItem[i12];
        }
    }

    public VasPlanningHeaderItem(@k String str, @k String str2, @l AttributedText attributedText) {
        this.f322965b = str;
        this.f322966c = str2;
        this.f322967d = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VasPlanningHeaderItem)) {
            return false;
        }
        VasPlanningHeaderItem vasPlanningHeaderItem = (VasPlanningHeaderItem) obj;
        return L.f(this.f322965b, vasPlanningHeaderItem.f322965b) && L.f(this.f322966c, vasPlanningHeaderItem.f322966c) && L.f(this.f322967d, vasPlanningHeaderItem.f322967d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85138b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF85139c() {
        return this.f322965b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f322965b.hashCode() * 31, 31, this.f322966c);
        AttributedText attributedText = this.f322967d;
        return iD2 + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasPlanningHeaderItem(stringId=");
        sb2.append(this.f322965b);
        sb2.append(", title=");
        sb2.append(this.f322966c);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f322967d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f322965b);
        parcel.writeString(this.f322966c);
        parcel.writeParcelable(this.f322967d, i12);
    }
}
