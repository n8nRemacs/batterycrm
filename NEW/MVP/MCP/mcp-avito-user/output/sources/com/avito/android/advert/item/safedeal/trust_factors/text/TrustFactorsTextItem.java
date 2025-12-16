package com.avito.android.advert.item.safedeal.trust_factors.text;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.safedeal.trust_factors.TrustFactorsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrustFactorsTextItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/text/TrustFactorsTextItem;", "Lcom/avito/android/advert/item/safedeal/trust_factors/TrustFactorsItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TrustFactorsTextItem implements TrustFactorsItem {

    @k
    public static final Parcelable.Creator<TrustFactorsTextItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f79230b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TrustFactorsComponent.Text f79231c;

    /* renamed from: d, reason: collision with root package name */
    public final int f79232d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final SafeDeal.TooltipData f79233e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f79234f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f79235g;

    /* compiled from: TrustFactorsTextItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrustFactorsTextItem> {
        @Override // android.os.Parcelable.Creator
        public final TrustFactorsTextItem createFromParcel(Parcel parcel) {
            return new TrustFactorsTextItem(parcel.readString(), (TrustFactorsComponent.Text) parcel.readParcelable(TrustFactorsTextItem.class.getClassLoader()), parcel.readInt(), (SafeDeal.TooltipData) parcel.readParcelable(TrustFactorsTextItem.class.getClassLoader()), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final TrustFactorsTextItem[] newArray(int i12) {
            return new TrustFactorsTextItem[i12];
        }
    }

    public TrustFactorsTextItem(@k String str, @k TrustFactorsComponent.Text text, int i12, @l SafeDeal.TooltipData tooltipData, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f79230b = str;
        this.f79231c = text;
        this.f79232d = i12;
        this.f79233e = tooltipData;
        this.f79234f = serpDisplayType;
        this.f79235g = serpViewType;
    }

    public static TrustFactorsTextItem b(TrustFactorsTextItem trustFactorsTextItem, int i12, SafeDeal.TooltipData tooltipData, int i13) {
        String str = trustFactorsTextItem.f79230b;
        TrustFactorsComponent.Text text = trustFactorsTextItem.f79231c;
        if ((i13 & 4) != 0) {
            i12 = trustFactorsTextItem.f79232d;
        }
        int i14 = i12;
        if ((i13 & 8) != 0) {
            tooltipData = trustFactorsTextItem.f79233e;
        }
        SerpDisplayType serpDisplayType = trustFactorsTextItem.f79234f;
        SerpViewType serpViewType = trustFactorsTextItem.f79235g;
        trustFactorsTextItem.getClass();
        return new TrustFactorsTextItem(str, text, i14, tooltipData, serpDisplayType, serpViewType);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return b(this, i12, null, 59);
    }

    @Override // com.avito.android.advert.item.safedeal.trust_factors.TrustFactorsItem
    @k
    public final TrustFactorsItem S3(@l SafeDeal.TooltipData tooltipData) {
        return b(this, 0, tooltipData, 55);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f79234f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustFactorsTextItem)) {
            return false;
        }
        TrustFactorsTextItem trustFactorsTextItem = (TrustFactorsTextItem) obj;
        return L.f(this.f79230b, trustFactorsTextItem.f79230b) && L.f(this.f79231c, trustFactorsTextItem.f79231c) && this.f79232d == trustFactorsTextItem.f79232d && L.f(this.f79233e, trustFactorsTextItem.f79233e) && this.f79234f == trustFactorsTextItem.f79234f && this.f79235g == trustFactorsTextItem.f79235g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74201e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79070f() {
        return this.f79232d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79066b() {
        return this.f79230b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79072h() {
        return this.f79235g;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f79232d, (this.f79231c.hashCode() + (this.f79230b.hashCode() * 31)) * 31, 31);
        SafeDeal.TooltipData tooltipData = this.f79233e;
        return this.f79235g.hashCode() + com.avito.android.actions_sheet.a.h(this.f79234f, (iE2 + (tooltipData == null ? 0 : tooltipData.hashCode())) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrustFactorsTextItem(stringId=");
        sb2.append(this.f79230b);
        sb2.append(", data=");
        sb2.append(this.f79231c);
        sb2.append(", spanCount=");
        sb2.append(this.f79232d);
        sb2.append(", tooltip=");
        sb2.append(this.f79233e);
        sb2.append(", displayType=");
        sb2.append(this.f79234f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f79235g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f79230b);
        parcel.writeParcelable(this.f79231c, i12);
        parcel.writeInt(this.f79232d);
        parcel.writeParcelable(this.f79233e, i12);
        parcel.writeString(this.f79234f.name());
        parcel.writeString(this.f79235g.name());
    }

    public /* synthetic */ TrustFactorsTextItem(String str, TrustFactorsComponent.Text text, int i12, SafeDeal.TooltipData tooltipData, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(str, text, i12, (i13 & 8) != 0 ? null : tooltipData, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
