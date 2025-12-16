package com.avito.android.credits;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.credits.models.CreditCalculator;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.credit_broker.CalculatorPosition;
import com.avito.android.remote.model.credit_broker.IconName;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CreditCalculatorItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/credits/CreditCalculatorItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreditCalculatorItem implements BlockItem, Q, l1, b.InterfaceC10495b {

    @Y61.k
    public static final Parcelable.Creator<CreditCalculatorItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CreditCalculator.Type f128553b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CalculatorPosition f128554c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final IconName f128555d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f128556e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f128557f;

    /* renamed from: g, reason: collision with root package name */
    public final long f128558g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f128559h;

    /* renamed from: i, reason: collision with root package name */
    public final int f128560i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f128561j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f128562k;

    /* renamed from: l, reason: collision with root package name */
    public final long f128563l;

    /* compiled from: CreditCalculatorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreditCalculatorItem> {
        @Override // android.os.Parcelable.Creator
        public final CreditCalculatorItem createFromParcel(Parcel parcel) {
            return new CreditCalculatorItem(CreditCalculator.Type.valueOf(parcel.readString()), CalculatorPosition.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : IconName.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final CreditCalculatorItem[] newArray(int i12) {
            return new CreditCalculatorItem[i12];
        }
    }

    public CreditCalculatorItem(@Y61.k CreditCalculator.Type type, @Y61.k CalculatorPosition calculatorPosition, @Y61.l IconName iconName, boolean z12, @Y61.l Integer num, long j12, @Y61.k String str, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f128553b = type;
        this.f128554c = calculatorPosition;
        this.f128555d = iconName;
        this.f128556e = z12;
        this.f128557f = num;
        this.f128558g = j12;
        this.f128559h = str;
        this.f128560i = i12;
        this.f128561j = serpDisplayType;
        this.f128562k = serpViewType;
        this.f128563l = j12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new CreditCalculatorItem(this.f128553b, this.f128554c, this.f128555d, this.f128556e, this.f128557f, this.f128558g, this.f128559h, i12, this.f128561j, this.f128562k);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f128561j = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final CalculatorPosition getF128554c() {
        return this.f128554c;
    }

    @Override // TV0.a
    public final long getId() {
        return this.f128558g;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF269873e() {
        return this.f128560i;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    public final String getStringId() {
        return this.f128559h;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF269877i() {
        return this.f128563l;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF269878j() {
        return this.f128562k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f128553b.name());
        parcel.writeString(this.f128554c.name());
        IconName iconName = this.f128555d;
        if (iconName == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iconName.name());
        }
        parcel.writeInt(this.f128556e ? 1 : 0);
        Integer num = this.f128557f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeLong(this.f128558g);
        parcel.writeString(this.f128559h);
        parcel.writeInt(this.f128560i);
        parcel.writeString(this.f128561j.name());
        parcel.writeString(this.f128562k.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditCalculatorItem(CreditCalculator.Type type, CalculatorPosition calculatorPosition, IconName iconName, boolean z12, Integer num, long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        boolean z13 = (i13 & 8) != 0 ? true : z12;
        Integer num2 = (i13 & 16) != 0 ? null : num;
        if ((i13 & 32) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 19;
        } else {
            j13 = j12;
        }
        this(type, calculatorPosition, iconName, z13, num2, j13, (i13 & 64) != 0 ? String.valueOf(j13) : str, i12, (i13 & 256) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 512) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
