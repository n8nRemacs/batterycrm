package com.avito.android.repair_calculator;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.RepairServicesCalculator;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsRepairCalculatorItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/repair_calculator/AdvertDetailsRepairCalculatorItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_repair-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AdvertDetailsRepairCalculatorItem implements BlockItem {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsRepairCalculatorItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RepairServicesCalculator f254465b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f254466c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f254467d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f254468e;

    /* renamed from: f, reason: collision with root package name */
    public final int f254469f;

    /* compiled from: AdvertDetailsRepairCalculatorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsRepairCalculatorItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsRepairCalculatorItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsRepairCalculatorItem((RepairServicesCalculator) parcel.readParcelable(AdvertDetailsRepairCalculatorItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsRepairCalculatorItem[] newArray(int i12) {
            return new AdvertDetailsRepairCalculatorItem[i12];
        }
    }

    public AdvertDetailsRepairCalculatorItem(@Y61.k RepairServicesCalculator repairServicesCalculator, @Y61.k String str, @l String str2, @Y61.k String str3, int i12) {
        this.f254465b = repairServicesCalculator;
        this.f254466c = str;
        this.f254467d = str2;
        this.f254468e = str3;
        this.f254469f = i12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsRepairCalculatorItem(this.f254465b, this.f254466c, this.f254467d, this.f254468e, i12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsRepairCalculatorItem)) {
            return false;
        }
        AdvertDetailsRepairCalculatorItem advertDetailsRepairCalculatorItem = (AdvertDetailsRepairCalculatorItem) obj;
        return L.f(this.f254465b, advertDetailsRepairCalculatorItem.f254465b) && L.f(this.f254466c, advertDetailsRepairCalculatorItem.f254466c) && L.f(this.f254467d, advertDetailsRepairCalculatorItem.f254467d) && L.f(this.f254468e, advertDetailsRepairCalculatorItem.f254468e) && this.f254469f == advertDetailsRepairCalculatorItem.f254469f;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85317p() {
        return this.f254469f;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF231743e() {
        return this.f254468e;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f254465b.hashCode() * 31, 31, this.f254466c);
        String str = this.f254467d;
        return Integer.hashCode(this.f254469f) + H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f254468e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsRepairCalculatorItem(itemModel=");
        sb2.append(this.f254465b);
        sb2.append(", iid=");
        sb2.append(this.f254466c);
        sb2.append(", xHash=");
        sb2.append(this.f254467d);
        sb2.append(", stringId=");
        sb2.append(this.f254468e);
        sb2.append(", spanCount=");
        return r.t(sb2, this.f254469f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f254465b, i12);
        parcel.writeString(this.f254466c);
        parcel.writeString(this.f254467d);
        parcel.writeString(this.f254468e);
        parcel.writeInt(this.f254469f);
    }
}
