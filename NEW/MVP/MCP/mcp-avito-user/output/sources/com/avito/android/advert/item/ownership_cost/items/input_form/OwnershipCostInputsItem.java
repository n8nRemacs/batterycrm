package com.avito.android.advert.item.ownership_cost.items.input_form;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.OwnershipCostResponse;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: OwnershipCostInputsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/items/input_form/OwnershipCostInputsItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OwnershipCostInputsItem implements BlockItem {

    @Y61.k
    public static final Parcelable.Creator<OwnershipCostInputsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f77975b;

    /* renamed from: c, reason: collision with root package name */
    public final int f77976c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f77977d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f77978e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final OwnershipCostResponse f77979f;

    /* compiled from: OwnershipCostInputsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OwnershipCostInputsItem> {
        @Override // android.os.Parcelable.Creator
        public final OwnershipCostInputsItem createFromParcel(Parcel parcel) {
            return new OwnershipCostInputsItem(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, (OwnershipCostResponse) parcel.readParcelable(OwnershipCostInputsItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OwnershipCostInputsItem[] newArray(int i12) {
            return new OwnershipCostInputsItem[i12];
        }
    }

    public OwnershipCostInputsItem(@Y61.k String str, int i12, @Y61.k String str2, boolean z12, @Y61.k OwnershipCostResponse ownershipCostResponse) {
        this.f77975b = str;
        this.f77976c = i12;
        this.f77977d = str2;
        this.f77978e = z12;
        this.f77979f = ownershipCostResponse;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        return new OwnershipCostInputsItem(this.f77975b, this.f77976c, this.f77977d, this.f77978e, this.f77979f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnershipCostInputsItem)) {
            return false;
        }
        OwnershipCostInputsItem ownershipCostInputsItem = (OwnershipCostInputsItem) obj;
        return L.f(this.f77975b, ownershipCostInputsItem.f77975b) && this.f77976c == ownershipCostInputsItem.f77976c && L.f(this.f77977d, ownershipCostInputsItem.f77977d) && this.f77978e == ownershipCostInputsItem.f77978e && L.f(this.f77979f, ownershipCostInputsItem.f77979f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78384b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79105c() {
        return this.f77976c;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79104b() {
        return this.f77975b;
    }

    public final int hashCode() {
        return this.f77979f.hashCode() + r.i(H.d(r.e(this.f77976c, this.f77975b.hashCode() * 31, 31), 31, this.f77977d), 31, this.f77978e);
    }

    @Y61.k
    public final String toString() {
        return "OwnershipCostInputsItem(stringId=" + this.f77975b + ", spanCount=" + this.f77976c + ", advertId=" + this.f77977d + ", isModal=" + this.f77978e + ", ownershipCost=" + this.f77979f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f77975b);
        parcel.writeInt(this.f77976c);
        parcel.writeString(this.f77977d);
        parcel.writeInt(this.f77978e ? 1 : 0);
        parcel.writeParcelable(this.f77979f, i12);
    }

    public /* synthetic */ OwnershipCostInputsItem(String str, int i12, String str2, boolean z12, OwnershipCostResponse ownershipCostResponse, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? OwnershipCostInputsItem.class.getName() : str, (i13 & 2) != 0 ? 0 : i12, str2, z12, ownershipCostResponse);
    }
}
