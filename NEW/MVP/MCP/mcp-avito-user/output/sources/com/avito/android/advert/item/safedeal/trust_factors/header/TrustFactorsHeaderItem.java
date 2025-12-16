package com.avito.android.advert.item.safedeal.trust_factors.header;

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

/* compiled from: TrustFactorsHeaderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/header/TrustFactorsHeaderItem;", "Lcom/avito/android/advert/item/safedeal/trust_factors/TrustFactorsItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TrustFactorsHeaderItem implements TrustFactorsItem {

    @k
    public static final Parcelable.Creator<TrustFactorsHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f79151b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TrustFactorsComponent.Header f79152c;

    /* renamed from: d, reason: collision with root package name */
    public final int f79153d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final SafeDeal.TooltipData f79154e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f79155f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f79156g;

    /* compiled from: TrustFactorsHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrustFactorsHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final TrustFactorsHeaderItem createFromParcel(Parcel parcel) {
            return new TrustFactorsHeaderItem(parcel.readString(), (TrustFactorsComponent.Header) parcel.readParcelable(TrustFactorsHeaderItem.class.getClassLoader()), parcel.readInt(), (SafeDeal.TooltipData) parcel.readParcelable(TrustFactorsHeaderItem.class.getClassLoader()), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final TrustFactorsHeaderItem[] newArray(int i12) {
            return new TrustFactorsHeaderItem[i12];
        }
    }

    public TrustFactorsHeaderItem(@k String str, @k TrustFactorsComponent.Header header, int i12, @l SafeDeal.TooltipData tooltipData, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f79151b = str;
        this.f79152c = header;
        this.f79153d = i12;
        this.f79154e = tooltipData;
        this.f79155f = serpDisplayType;
        this.f79156g = serpViewType;
    }

    public static TrustFactorsHeaderItem b(TrustFactorsHeaderItem trustFactorsHeaderItem, int i12, SafeDeal.TooltipData tooltipData, int i13) {
        String str = trustFactorsHeaderItem.f79151b;
        TrustFactorsComponent.Header header = trustFactorsHeaderItem.f79152c;
        if ((i13 & 4) != 0) {
            i12 = trustFactorsHeaderItem.f79153d;
        }
        int i14 = i12;
        if ((i13 & 8) != 0) {
            tooltipData = trustFactorsHeaderItem.f79154e;
        }
        SerpDisplayType serpDisplayType = trustFactorsHeaderItem.f79155f;
        SerpViewType serpViewType = trustFactorsHeaderItem.f79156g;
        trustFactorsHeaderItem.getClass();
        return new TrustFactorsHeaderItem(str, header, i14, tooltipData, serpDisplayType, serpViewType);
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
        this.f79155f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustFactorsHeaderItem)) {
            return false;
        }
        TrustFactorsHeaderItem trustFactorsHeaderItem = (TrustFactorsHeaderItem) obj;
        return L.f(this.f79151b, trustFactorsHeaderItem.f79151b) && L.f(this.f79152c, trustFactorsHeaderItem.f79152c) && this.f79153d == trustFactorsHeaderItem.f79153d && L.f(this.f79154e, trustFactorsHeaderItem.f79154e) && this.f79155f == trustFactorsHeaderItem.f79155f && this.f79156g == trustFactorsHeaderItem.f79156g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74201e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79070f() {
        return this.f79153d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79066b() {
        return this.f79151b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79072h() {
        return this.f79156g;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f79153d, (this.f79152c.hashCode() + (this.f79151b.hashCode() * 31)) * 31, 31);
        SafeDeal.TooltipData tooltipData = this.f79154e;
        return this.f79156g.hashCode() + com.avito.android.actions_sheet.a.h(this.f79155f, (iE2 + (tooltipData == null ? 0 : tooltipData.hashCode())) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrustFactorsHeaderItem(stringId=");
        sb2.append(this.f79151b);
        sb2.append(", data=");
        sb2.append(this.f79152c);
        sb2.append(", spanCount=");
        sb2.append(this.f79153d);
        sb2.append(", tooltip=");
        sb2.append(this.f79154e);
        sb2.append(", displayType=");
        sb2.append(this.f79155f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f79156g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f79151b);
        parcel.writeParcelable(this.f79152c, i12);
        parcel.writeInt(this.f79153d);
        parcel.writeParcelable(this.f79154e, i12);
        parcel.writeString(this.f79155f.name());
        parcel.writeString(this.f79156g.name());
    }

    public /* synthetic */ TrustFactorsHeaderItem(String str, TrustFactorsComponent.Header header, int i12, SafeDeal.TooltipData tooltipData, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(str, header, i12, (i13 & 8) != 0 ? null : tooltipData, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
