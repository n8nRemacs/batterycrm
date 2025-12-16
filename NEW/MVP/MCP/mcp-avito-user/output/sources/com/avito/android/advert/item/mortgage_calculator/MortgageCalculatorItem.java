package com.avito.android.advert.item.mortgage_calculator;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.mortgage_calculator.model.MortgageCalculatorConfig;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MortgageCalculatorItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/mortgage_calculator/MortgageCalculatorItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MortgageCalculatorItem implements BlockItem, Q, l1, b.InterfaceC10495b {

    @k
    public static final Parcelable.Creator<MortgageCalculatorItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final MortgageCalculatorConfig f77659b;

    /* renamed from: c, reason: collision with root package name */
    public final int f77660c;

    /* renamed from: d, reason: collision with root package name */
    public final long f77661d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f77662e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f77663f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f77664g;

    /* renamed from: h, reason: collision with root package name */
    public final long f77665h;

    /* compiled from: MortgageCalculatorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageCalculatorItem> {
        @Override // android.os.Parcelable.Creator
        public final MortgageCalculatorItem createFromParcel(Parcel parcel) {
            return new MortgageCalculatorItem((MortgageCalculatorConfig) parcel.readParcelable(MortgageCalculatorItem.class.getClassLoader()), parcel.readInt(), parcel.readLong(), parcel.readString(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageCalculatorItem[] newArray(int i12) {
            return new MortgageCalculatorItem[i12];
        }
    }

    public MortgageCalculatorItem(@k MortgageCalculatorConfig mortgageCalculatorConfig, int i12, long j12, @k String str, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f77659b = mortgageCalculatorConfig;
        this.f77660c = i12;
        this.f77661d = j12;
        this.f77662e = str;
        this.f77663f = serpDisplayType;
        this.f77664g = serpViewType;
        this.f77665h = j12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new MortgageCalculatorItem(this.f77659b, i12, this.f77661d, this.f77662e, this.f77663f, this.f77664g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f77663f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageCalculatorItem)) {
            return false;
        }
        MortgageCalculatorItem mortgageCalculatorItem = (MortgageCalculatorItem) obj;
        return L.f(this.f77659b, mortgageCalculatorItem.f77659b) && this.f77660c == mortgageCalculatorItem.f77660c && this.f77661d == mortgageCalculatorItem.f77661d && L.f(this.f77662e, mortgageCalculatorItem.f77662e) && this.f77663f == mortgageCalculatorItem.f77663f && this.f77664g == mortgageCalculatorItem.f77664g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF74201e() {
        return this.f77661d;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79070f() {
        return this.f77660c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF202883b() {
        return this.f77662e;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF77570h() {
        return this.f77665h;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79072h() {
        return this.f77664g;
    }

    public final int hashCode() {
        return this.f77664g.hashCode() + com.avito.android.actions_sheet.a.h(this.f77663f, H.d(r.g(r.e(this.f77660c, this.f77659b.hashCode() * 31, 31), 31, this.f77661d), 31, this.f77662e), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageCalculatorItem(config=");
        sb2.append(this.f77659b);
        sb2.append(", spanCount=");
        sb2.append(this.f77660c);
        sb2.append(", id=");
        sb2.append(this.f77661d);
        sb2.append(", stringId=");
        sb2.append(this.f77662e);
        sb2.append(", displayType=");
        sb2.append(this.f77663f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f77664g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f77659b, i12);
        parcel.writeInt(this.f77660c);
        parcel.writeLong(this.f77661d);
        parcel.writeString(this.f77662e);
        parcel.writeString(this.f77663f.name());
        parcel.writeString(this.f77664g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MortgageCalculatorItem(MortgageCalculatorConfig mortgageCalculatorConfig, int i12, long j12, String str, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 4) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 22;
        } else {
            j13 = j12;
        }
        this(mortgageCalculatorConfig, i12, j13, (i13 & 8) != 0 ? String.valueOf(j13) : str, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
