package com.avito.android.advert.item.fmp.offer;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.fmp.AnalyticsEvent;
import com.avito.android.remote.fmp.FmpOfferButton;
import com.avito.android.remote.fmp.FmpOfferCondition;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsFmpOfferItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/fmp/offer/AdvertDetailsFmpOfferItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsFmpOfferItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsFmpOfferItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f75530b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<FmpOfferCondition> f75531c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final FmpOfferButton f75532d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<AnalyticsEvent> f75533e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f75534f;

    /* renamed from: g, reason: collision with root package name */
    public final long f75535g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f75536h;

    /* renamed from: i, reason: collision with root package name */
    public final int f75537i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public SerpDisplayType f75538j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final SerpViewType f75539k;

    /* compiled from: AdvertDetailsFmpOfferItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsFmpOfferItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsFmpOfferItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AdvertDetailsFmpOfferItem.class.getClassLoader());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(AdvertDetailsFmpOfferItem.class, parcel, arrayList, iL3, 1);
                }
            }
            FmpOfferButton fmpOfferButton = (FmpOfferButton) parcel.readParcelable(AdvertDetailsFmpOfferItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsFmpOfferItem.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new AdvertDetailsFmpOfferItem(attributedText, arrayList, fmpOfferButton, arrayList2, (AttributedText) parcel.readParcelable(AdvertDetailsFmpOfferItem.class.getClassLoader()), parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsFmpOfferItem[] newArray(int i12) {
            return new AdvertDetailsFmpOfferItem[i12];
        }
    }

    public AdvertDetailsFmpOfferItem(@l AttributedText attributedText, @l List<FmpOfferCondition> list, @l FmpOfferButton fmpOfferButton, @l List<AnalyticsEvent> list2, @l AttributedText attributedText2, long j12, @k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f75530b = attributedText;
        this.f75531c = list;
        this.f75532d = fmpOfferButton;
        this.f75533e = list2;
        this.f75534f = attributedText2;
        this.f75535g = j12;
        this.f75536h = str;
        this.f75537i = i12;
        this.f75538j = serpDisplayType;
        this.f75539k = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsFmpOfferItem(this.f75530b, this.f75531c, this.f75532d, this.f75533e, this.f75534f, this.f75535g, this.f75536h, i12, this.f75538j, this.f75539k);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f75538j = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsFmpOfferItem)) {
            return false;
        }
        AdvertDetailsFmpOfferItem advertDetailsFmpOfferItem = (AdvertDetailsFmpOfferItem) obj;
        return L.f(this.f75530b, advertDetailsFmpOfferItem.f75530b) && L.f(this.f75531c, advertDetailsFmpOfferItem.f75531c) && L.f(this.f75532d, advertDetailsFmpOfferItem.f75532d) && L.f(this.f75533e, advertDetailsFmpOfferItem.f75533e) && L.f(this.f75534f, advertDetailsFmpOfferItem.f75534f) && this.f75535g == advertDetailsFmpOfferItem.f75535g && L.f(this.f75536h, advertDetailsFmpOfferItem.f75536h) && this.f75537i == advertDetailsFmpOfferItem.f75537i && this.f75538j == advertDetailsFmpOfferItem.f75538j && this.f75539k == advertDetailsFmpOfferItem.f75539k;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF74201e() {
        return this.f75535g;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79070f() {
        return this.f75537i;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF202883b() {
        return this.f75536h;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79072h() {
        return this.f75539k;
    }

    public final int hashCode() {
        AttributedText attributedText = this.f75530b;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        List<FmpOfferCondition> list = this.f75531c;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        FmpOfferButton fmpOfferButton = this.f75532d;
        int iHashCode3 = (iHashCode2 + (fmpOfferButton == null ? 0 : fmpOfferButton.hashCode())) * 31;
        List<AnalyticsEvent> list2 = this.f75533e;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AttributedText attributedText2 = this.f75534f;
        return this.f75539k.hashCode() + com.avito.android.actions_sheet.a.h(this.f75538j, r.e(this.f75537i, H.d(r.g((iHashCode4 + (attributedText2 != null ? attributedText2.hashCode() : 0)) * 31, 31, this.f75535g), 31, this.f75536h), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsFmpOfferItem(title=");
        sb2.append(this.f75530b);
        sb2.append(", conditions=");
        sb2.append(this.f75531c);
        sb2.append(", button=");
        sb2.append(this.f75532d);
        sb2.append(", onAppear=");
        sb2.append(this.f75533e);
        sb2.append(", legal=");
        sb2.append(this.f75534f);
        sb2.append(", id=");
        sb2.append(this.f75535g);
        sb2.append(", stringId=");
        sb2.append(this.f75536h);
        sb2.append(", spanCount=");
        sb2.append(this.f75537i);
        sb2.append(", displayType=");
        sb2.append(this.f75538j);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f75539k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f75530b, i12);
        List<FmpOfferCondition> list = this.f75531c;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f75532d, i12);
        List<AnalyticsEvent> list2 = this.f75533e;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        parcel.writeParcelable(this.f75534f, i12);
        parcel.writeLong(this.f75535g);
        parcel.writeString(this.f75536h);
        parcel.writeInt(this.f75537i);
        parcel.writeString(this.f75538j.name());
        parcel.writeString(this.f75539k.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsFmpOfferItem(AttributedText attributedText, List list, FmpOfferButton fmpOfferButton, List list2, AttributedText attributedText2, long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 32) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 182;
        } else {
            j13 = j12;
        }
        this(attributedText, list, fmpOfferButton, list2, attributedText2, j13, (i13 & 64) != 0 ? String.valueOf(j13) : str, i12, (i13 & 256) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 512) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
