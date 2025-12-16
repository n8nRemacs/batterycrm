package com.avito.android.advert.item.fmp.calculator;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.fmp.AnalyticsEvent;
import com.avito.android.remote.fmp.FmpCalculatorButton;
import com.avito.android.remote.fmp.FmpLoanPeriod;
import com.avito.android.remote.fmp.FmpPaymentTitle;
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
import okhttp3.internal.http2.Http2;

/* compiled from: AdvertDetailsFmpCalculatorItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/fmp/calculator/AdvertDetailsFmpCalculatorItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsFmpCalculatorItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsFmpCalculatorItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AttributedText f75453b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f75454c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f75455d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f75456e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f75457f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f75458g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final List<FmpLoanPeriod> f75459h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final FmpPaymentTitle f75460i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final FmpCalculatorButton f75461j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final List<AnalyticsEvent> f75462k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final List<AnalyticsEvent> f75463l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final AttributedText f75464m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final Double f75465n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final Integer f75466o;

    /* renamed from: p, reason: collision with root package name */
    public final long f75467p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final String f75468q;

    /* renamed from: r, reason: collision with root package name */
    public final int f75469r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f75470s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f75471t;

    /* compiled from: AdvertDetailsFmpCalculatorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsFmpCalculatorItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsFmpCalculatorItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AdvertDetailsFmpCalculatorItem.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(AdvertDetailsFmpCalculatorItem.class.getClassLoader());
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(AdvertDetailsFmpCalculatorItem.class, parcel, arrayList, iL3, 1);
                }
            }
            FmpPaymentTitle fmpPaymentTitle = (FmpPaymentTitle) parcel.readParcelable(AdvertDetailsFmpCalculatorItem.class.getClassLoader());
            FmpCalculatorButton fmpCalculatorButton = (FmpCalculatorButton) parcel.readParcelable(AdvertDetailsFmpCalculatorItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                int iL4 = 0;
                while (iL4 != i13) {
                    iL4 = com.avito.android.actions_sheet.a.l(AdvertDetailsFmpCalculatorItem.class, parcel, arrayList4, iL4, 1);
                }
                arrayList2 = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                arrayList3 = new ArrayList(i14);
                while (iL2 != i14) {
                    iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsFmpCalculatorItem.class, parcel, arrayList3, iL2, 1);
                }
            }
            return new AdvertDetailsFmpCalculatorItem(attributedText, attributedText2, string, numValueOf, numValueOf2, string2, arrayList, fmpPaymentTitle, fmpCalculatorButton, arrayList2, arrayList3, (AttributedText) parcel.readParcelable(AdvertDetailsFmpCalculatorItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsFmpCalculatorItem[] newArray(int i12) {
            return new AdvertDetailsFmpCalculatorItem[i12];
        }
    }

    public AdvertDetailsFmpCalculatorItem(@Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l String str, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l String str2, @Y61.l List<FmpLoanPeriod> list, @Y61.l FmpPaymentTitle fmpPaymentTitle, @Y61.l FmpCalculatorButton fmpCalculatorButton, @Y61.l List<AnalyticsEvent> list2, @Y61.l List<AnalyticsEvent> list3, @Y61.l AttributedText attributedText3, @Y61.l Double d12, @Y61.l Integer num3, long j12, @Y61.k String str3, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f75453b = attributedText;
        this.f75454c = attributedText2;
        this.f75455d = str;
        this.f75456e = num;
        this.f75457f = num2;
        this.f75458g = str2;
        this.f75459h = list;
        this.f75460i = fmpPaymentTitle;
        this.f75461j = fmpCalculatorButton;
        this.f75462k = list2;
        this.f75463l = list3;
        this.f75464m = attributedText3;
        this.f75465n = d12;
        this.f75466o = num3;
        this.f75467p = j12;
        this.f75468q = str3;
        this.f75469r = i12;
        this.f75470s = serpDisplayType;
        this.f75471t = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsFmpCalculatorItem(this.f75453b, this.f75454c, this.f75455d, this.f75456e, this.f75457f, this.f75458g, this.f75459h, this.f75460i, this.f75461j, this.f75462k, this.f75463l, this.f75464m, this.f75465n, this.f75466o, this.f75467p, this.f75468q, i12, this.f75470s, this.f75471t);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f75470s = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsFmpCalculatorItem)) {
            return false;
        }
        AdvertDetailsFmpCalculatorItem advertDetailsFmpCalculatorItem = (AdvertDetailsFmpCalculatorItem) obj;
        return L.f(this.f75453b, advertDetailsFmpCalculatorItem.f75453b) && L.f(this.f75454c, advertDetailsFmpCalculatorItem.f75454c) && L.f(this.f75455d, advertDetailsFmpCalculatorItem.f75455d) && L.f(this.f75456e, advertDetailsFmpCalculatorItem.f75456e) && L.f(this.f75457f, advertDetailsFmpCalculatorItem.f75457f) && L.f(this.f75458g, advertDetailsFmpCalculatorItem.f75458g) && L.f(this.f75459h, advertDetailsFmpCalculatorItem.f75459h) && L.f(this.f75460i, advertDetailsFmpCalculatorItem.f75460i) && L.f(this.f75461j, advertDetailsFmpCalculatorItem.f75461j) && L.f(this.f75462k, advertDetailsFmpCalculatorItem.f75462k) && L.f(this.f75463l, advertDetailsFmpCalculatorItem.f75463l) && L.f(this.f75464m, advertDetailsFmpCalculatorItem.f75464m) && L.f(this.f75465n, advertDetailsFmpCalculatorItem.f75465n) && L.f(this.f75466o, advertDetailsFmpCalculatorItem.f75466o) && this.f75467p == advertDetailsFmpCalculatorItem.f75467p && L.f(this.f75468q, advertDetailsFmpCalculatorItem.f75468q) && this.f75469r == advertDetailsFmpCalculatorItem.f75469r && this.f75470s == advertDetailsFmpCalculatorItem.f75470s && this.f75471t == advertDetailsFmpCalculatorItem.f75471t;
    }

    @Override // TV0.a
    public final long getId() {
        return this.f75467p;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270732f() {
        return this.f75469r;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF318498b() {
        return this.f75468q;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270731e() {
        return this.f75471t;
    }

    public final int hashCode() {
        AttributedText attributedText = this.f75453b;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.f75454c;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str = this.f75455d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f75456e;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f75457f;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f75458g;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<FmpLoanPeriod> list = this.f75459h;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        FmpPaymentTitle fmpPaymentTitle = this.f75460i;
        int iHashCode8 = (iHashCode7 + (fmpPaymentTitle == null ? 0 : fmpPaymentTitle.hashCode())) * 31;
        FmpCalculatorButton fmpCalculatorButton = this.f75461j;
        int iHashCode9 = (iHashCode8 + (fmpCalculatorButton == null ? 0 : fmpCalculatorButton.hashCode())) * 31;
        List<AnalyticsEvent> list2 = this.f75462k;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<AnalyticsEvent> list3 = this.f75463l;
        int iHashCode11 = (iHashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        AttributedText attributedText3 = this.f75464m;
        int iHashCode12 = (iHashCode11 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31;
        Double d12 = this.f75465n;
        int iHashCode13 = (iHashCode12 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Integer num3 = this.f75466o;
        return this.f75471t.hashCode() + com.avito.android.actions_sheet.a.h(this.f75470s, r.e(this.f75469r, H.d(r.g((iHashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31, 31, this.f75467p), 31, this.f75468q), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsFmpCalculatorItem(title=");
        sb2.append(this.f75453b);
        sb2.append(", promoTitle=");
        sb2.append(this.f75454c);
        sb2.append(", inputValue=");
        sb2.append(this.f75455d);
        sb2.append(", minValue=");
        sb2.append(this.f75456e);
        sb2.append(", maxValue=");
        sb2.append(this.f75457f);
        sb2.append(", inputDescription=");
        sb2.append(this.f75458g);
        sb2.append(", loanPeriods=");
        sb2.append(this.f75459h);
        sb2.append(", paymentTitle=");
        sb2.append(this.f75460i);
        sb2.append(", button=");
        sb2.append(this.f75461j);
        sb2.append(", onAppear=");
        sb2.append(this.f75462k);
        sb2.append(", onChipsClicked=");
        sb2.append(this.f75463l);
        sb2.append(", legal=");
        sb2.append(this.f75464m);
        sb2.append(", dailyRate=");
        sb2.append(this.f75465n);
        sb2.append(", promoPeriod=");
        sb2.append(this.f75466o);
        sb2.append(", id=");
        sb2.append(this.f75467p);
        sb2.append(", stringId=");
        sb2.append(this.f75468q);
        sb2.append(", spanCount=");
        sb2.append(this.f75469r);
        sb2.append(", displayType=");
        sb2.append(this.f75470s);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f75471t, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f75453b, i12);
        parcel.writeParcelable(this.f75454c, i12);
        parcel.writeString(this.f75455d);
        Integer num = this.f75456e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f75457f;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        parcel.writeString(this.f75458g);
        List<FmpLoanPeriod> list = this.f75459h;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f75460i, i12);
        parcel.writeParcelable(this.f75461j, i12);
        List<AnalyticsEvent> list2 = this.f75462k;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        List<AnalyticsEvent> list3 = this.f75463l;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), i12);
            }
        }
        parcel.writeParcelable(this.f75464m, i12);
        Double d12 = this.f75465n;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
        Integer num3 = this.f75466o;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        parcel.writeLong(this.f75467p);
        parcel.writeString(this.f75468q);
        parcel.writeInt(this.f75469r);
        parcel.writeString(this.f75470s.name());
        parcel.writeString(this.f75471t.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsFmpCalculatorItem(AttributedText attributedText, AttributedText attributedText2, String str, Integer num, Integer num2, String str2, List list, FmpPaymentTitle fmpPaymentTitle, FmpCalculatorButton fmpCalculatorButton, List list2, List list3, AttributedText attributedText3, Double d12, Integer num3, long j12, String str3, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 183;
        } else {
            j13 = j12;
        }
        this(attributedText, attributedText2, str, num, num2, str2, list, fmpPaymentTitle, fmpCalculatorButton, list2, list3, attributedText3, d12, num3, j13, (32768 & i13) != 0 ? String.valueOf(j13) : str3, i12, (131072 & i13) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 262144) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
