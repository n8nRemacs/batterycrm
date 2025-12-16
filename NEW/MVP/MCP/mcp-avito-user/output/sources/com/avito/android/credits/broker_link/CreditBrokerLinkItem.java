package com.avito.android.credits.broker_link;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.credits.models.CreditCalculator;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.credit_broker.EntryPoint;
import com.avito.android.remote.model.credit_broker.IconName;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CreditBrokerLinkItem.kt */
@d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/credits/broker_link/CreditBrokerLinkItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CreditBrokerLinkItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<CreditBrokerLinkItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CreditCalculator.Type f128572b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final EntryPoint.CreditBrokerLinkType f128573c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f128574d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final EntryPoint f128575e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final IconName f128576f;

    /* renamed from: g, reason: collision with root package name */
    public final long f128577g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f128578h;

    /* renamed from: i, reason: collision with root package name */
    public final int f128579i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public SerpDisplayType f128580j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final SerpViewType f128581k;

    /* compiled from: CreditBrokerLinkItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreditBrokerLinkItem> {
        @Override // android.os.Parcelable.Creator
        public final CreditBrokerLinkItem createFromParcel(Parcel parcel) {
            return new CreditBrokerLinkItem(CreditCalculator.Type.valueOf(parcel.readString()), EntryPoint.CreditBrokerLinkType.valueOf(parcel.readString()), parcel.readString(), (EntryPoint) parcel.readParcelable(CreditBrokerLinkItem.class.getClassLoader()), parcel.readInt() == 0 ? null : IconName.valueOf(parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final CreditBrokerLinkItem[] newArray(int i12) {
            return new CreditBrokerLinkItem[i12];
        }
    }

    public CreditBrokerLinkItem(@k CreditCalculator.Type type, @k EntryPoint.CreditBrokerLinkType creditBrokerLinkType, @k String str, @l EntryPoint entryPoint, @l IconName iconName, long j12, @k String str2, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f128572b = type;
        this.f128573c = creditBrokerLinkType;
        this.f128574d = str;
        this.f128575e = entryPoint;
        this.f128576f = iconName;
        this.f128577g = j12;
        this.f128578h = str2;
        this.f128579i = i12;
        this.f128580j = serpDisplayType;
        this.f128581k = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new CreditBrokerLinkItem(this.f128572b, this.f128573c, this.f128574d, this.f128575e, this.f128576f, this.f128577g, this.f128578h, i12, this.f128580j, this.f128581k);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f128580j = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditBrokerLinkItem)) {
            return false;
        }
        CreditBrokerLinkItem creditBrokerLinkItem = (CreditBrokerLinkItem) obj;
        return this.f128572b == creditBrokerLinkItem.f128572b && this.f128573c == creditBrokerLinkItem.f128573c && L.f(this.f128574d, creditBrokerLinkItem.f128574d) && L.f(this.f128575e, creditBrokerLinkItem.f128575e) && this.f128576f == creditBrokerLinkItem.f128576f && this.f128577g == creditBrokerLinkItem.f128577g && L.f(this.f128578h, creditBrokerLinkItem.f128578h) && this.f128579i == creditBrokerLinkItem.f128579i && this.f128580j == creditBrokerLinkItem.f128580j && this.f128581k == creditBrokerLinkItem.f128581k;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final CreditCalculator.Type getF128572b() {
        return this.f128572b;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF83624b() {
        return this.f128577g;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF264948c() {
        return this.f128579i;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF324032b() {
        return this.f128578h;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF264884g() {
        return this.f128581k;
    }

    public final int hashCode() {
        int iD2 = H.d((this.f128573c.hashCode() + (this.f128572b.hashCode() * 31)) * 31, 31, this.f128574d);
        EntryPoint entryPoint = this.f128575e;
        int iHashCode = (iD2 + (entryPoint == null ? 0 : entryPoint.hashCode())) * 31;
        IconName iconName = this.f128576f;
        return this.f128581k.hashCode() + com.avito.android.actions_sheet.a.h(this.f128580j, r.e(this.f128579i, H.d(r.g((iHashCode + (iconName != null ? iconName.hashCode() : 0)) * 31, 31, this.f128577g), 31, this.f128578h), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreditBrokerLinkItem(calculatorType=");
        sb2.append(this.f128572b);
        sb2.append(", linkType=");
        sb2.append(this.f128573c);
        sb2.append(", payment=");
        sb2.append(this.f128574d);
        sb2.append(", data=");
        sb2.append(this.f128575e);
        sb2.append(", iconName=");
        sb2.append(this.f128576f);
        sb2.append(", id=");
        sb2.append(this.f128577g);
        sb2.append(", stringId=");
        sb2.append(this.f128578h);
        sb2.append(", spanCount=");
        sb2.append(this.f128579i);
        sb2.append(", displayType=");
        sb2.append(this.f128580j);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f128581k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f128572b.name());
        parcel.writeString(this.f128573c.name());
        parcel.writeString(this.f128574d);
        parcel.writeParcelable(this.f128575e, i12);
        IconName iconName = this.f128576f;
        if (iconName == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iconName.name());
        }
        parcel.writeLong(this.f128577g);
        parcel.writeString(this.f128578h);
        parcel.writeInt(this.f128579i);
        parcel.writeString(this.f128580j.name());
        parcel.writeString(this.f128581k.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditBrokerLinkItem(CreditCalculator.Type type, EntryPoint.CreditBrokerLinkType creditBrokerLinkType, String str, EntryPoint entryPoint, IconName iconName, long j12, String str2, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 32) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 20;
        } else {
            j13 = j12;
        }
        this(type, creditBrokerLinkType, str, entryPoint, iconName, j13, (i13 & 64) != 0 ? String.valueOf(j13) : str2, i12, (i13 & 256) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 512) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
