package com.avito.android.advert.item.ownership_cost.dialogs.region_select.item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.OwnershipCostResponse;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RegionSelectItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/dialogs/region_select/item/RegionSelectItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RegionSelectItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<RegionSelectItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f77924b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region f77925c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f77926d;

    /* compiled from: RegionSelectItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RegionSelectItem> {
        @Override // android.os.Parcelable.Creator
        public final RegionSelectItem createFromParcel(Parcel parcel) {
            return new RegionSelectItem(parcel.readString(), (OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region) parcel.readParcelable(RegionSelectItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final RegionSelectItem[] newArray(int i12) {
            return new RegionSelectItem[i12];
        }
    }

    public RegionSelectItem(@k String str, @k OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region region, boolean z12) {
        this.f77924b = str;
        this.f77925c = region;
        this.f77926d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegionSelectItem)) {
            return false;
        }
        RegionSelectItem regionSelectItem = (RegionSelectItem) obj;
        return L.f(this.f77924b, regionSelectItem.f77924b) && L.f(this.f77925c, regionSelectItem.f77925c) && this.f77926d == regionSelectItem.f77926d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF73320d() {
        return this.f77924b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77926d) + ((this.f77925c.hashCode() + (this.f77924b.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RegionSelectItem(stringId=");
        sb2.append(this.f77924b);
        sb2.append(", region=");
        sb2.append(this.f77925c);
        sb2.append(", isChecked=");
        return r.x(sb2, this.f77926d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f77924b);
        parcel.writeParcelable(this.f77925c, i12);
        parcel.writeInt(this.f77926d ? 1 : 0);
    }

    public /* synthetic */ RegionSelectItem(String str, OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region region, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? RegionSelectItem.class.getName() : str, region, (i12 & 4) != 0 ? false : z12);
    }
}
