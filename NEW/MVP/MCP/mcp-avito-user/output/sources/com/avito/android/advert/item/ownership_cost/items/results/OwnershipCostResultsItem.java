package com.avito.android.advert.item.ownership_cost.items.results;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.OwnershipCostResponse;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OwnershipCostResultsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/items/results/OwnershipCostResultsItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OwnershipCostResultsItem implements BlockItem {

    @Y61.k
    public static final Parcelable.Creator<OwnershipCostResultsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f78039b;

    /* renamed from: c, reason: collision with root package name */
    public final int f78040c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final OwnershipCostResponse f78041d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f78042e;

    /* compiled from: OwnershipCostResultsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OwnershipCostResultsItem> {
        @Override // android.os.Parcelable.Creator
        public final OwnershipCostResultsItem createFromParcel(Parcel parcel) {
            return new OwnershipCostResultsItem(parcel.readString(), parcel.readInt(), (OwnershipCostResponse) parcel.readParcelable(OwnershipCostResultsItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OwnershipCostResultsItem[] newArray(int i12) {
            return new OwnershipCostResultsItem[i12];
        }
    }

    public OwnershipCostResultsItem(@Y61.k String str, int i12, @Y61.k OwnershipCostResponse ownershipCostResponse, @Y61.k String str2) {
        this.f78039b = str;
        this.f78040c = i12;
        this.f78041d = ownershipCostResponse;
        this.f78042e = str2;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        return new OwnershipCostResultsItem(this.f78039b, this.f78040c, this.f78041d, this.f78042e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnershipCostResultsItem)) {
            return false;
        }
        OwnershipCostResultsItem ownershipCostResultsItem = (OwnershipCostResultsItem) obj;
        return L.f(this.f78039b, ownershipCostResultsItem.f78039b) && this.f78040c == ownershipCostResultsItem.f78040c && L.f(this.f78041d, ownershipCostResultsItem.f78041d) && L.f(this.f78042e, ownershipCostResultsItem.f78042e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78384b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79105c() {
        return this.f78040c;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79104b() {
        return this.f78039b;
    }

    public final int hashCode() {
        return this.f78042e.hashCode() + ((this.f78041d.hashCode() + r.e(this.f78040c, this.f78039b.hashCode() * 31, 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OwnershipCostResultsItem(stringId=");
        sb2.append(this.f78039b);
        sb2.append(", spanCount=");
        sb2.append(this.f78040c);
        sb2.append(", ownershipCost=");
        sb2.append(this.f78041d);
        sb2.append(", advertId=");
        return C22026a.c(sb2, this.f78042e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f78039b);
        parcel.writeInt(this.f78040c);
        parcel.writeParcelable(this.f78041d, i12);
        parcel.writeString(this.f78042e);
    }
}
