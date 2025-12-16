package com.avito.android.advert.item.leasing_calculator;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsLeasingCalculatorItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/leasing_calculator/AdvertDetailsLeasingCalculatorItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsLeasingCalculatorItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsLeasingCalculatorItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f77354b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f77355c;

    /* renamed from: d, reason: collision with root package name */
    public final int f77356d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f77357e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f77358f;

    /* compiled from: AdvertDetailsLeasingCalculatorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsLeasingCalculatorItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsLeasingCalculatorItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsLeasingCalculatorItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsLeasingCalculatorItem[] newArray(int i12) {
            return new AdvertDetailsLeasingCalculatorItem[i12];
        }
    }

    public AdvertDetailsLeasingCalculatorItem(long j12, @Y61.k String str, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f77354b = j12;
        this.f77355c = str;
        this.f77356d = i12;
        this.f77357e = serpDisplayType;
        this.f77358f = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsLeasingCalculatorItem(this.f77354b, this.f77355c, i12, this.f77357e, this.f77358f);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f77357e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsLeasingCalculatorItem)) {
            return false;
        }
        AdvertDetailsLeasingCalculatorItem advertDetailsLeasingCalculatorItem = (AdvertDetailsLeasingCalculatorItem) obj;
        return this.f77354b == advertDetailsLeasingCalculatorItem.f77354b && L.f(this.f77355c, advertDetailsLeasingCalculatorItem.f77355c) && this.f77356d == advertDetailsLeasingCalculatorItem.f77356d && this.f77357e == advertDetailsLeasingCalculatorItem.f77357e && this.f77358f == advertDetailsLeasingCalculatorItem.f77358f;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75840b() {
        return this.f77354b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75844f() {
        return this.f77356d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283243b() {
        return this.f77355c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75842d() {
        return this.f77358f;
    }

    public final int hashCode() {
        return this.f77358f.hashCode() + com.avito.android.actions_sheet.a.h(this.f77357e, r.e(this.f77356d, H.d(Long.hashCode(this.f77354b) * 31, 31, this.f77355c), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsLeasingCalculatorItem(id=");
        sb2.append(this.f77354b);
        sb2.append(", stringId=");
        sb2.append(this.f77355c);
        sb2.append(", spanCount=");
        sb2.append(this.f77356d);
        sb2.append(", displayType=");
        sb2.append(this.f77357e);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f77358f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f77354b);
        parcel.writeString(this.f77355c);
        parcel.writeInt(this.f77356d);
        parcel.writeString(this.f77357e.name());
        parcel.writeString(this.f77358f.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsLeasingCalculatorItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j12 = 120;
        }
        long j13 = j12;
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
