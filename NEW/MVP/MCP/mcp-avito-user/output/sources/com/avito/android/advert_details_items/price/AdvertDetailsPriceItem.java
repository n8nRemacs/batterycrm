package com.avito.android.advert_details_items.price;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_details_items.buyer_bonuses.BuyerBonusesItem;
import com.avito.android.advert_details_items.price_hint.PriceHintItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: AdvertDetailsPriceItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_details_items/price/AdvertDetailsPriceItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "OldPriceHintBottomSheet", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsPriceItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsPriceItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f85138b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f85139c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f85140d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final AttributedText f85141e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f85142f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f85143g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f85144h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final OldPriceHintBottomSheet f85145i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f85146j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final PriceHintItem f85147k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final BuyerBonusesItem f85148l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f85149m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f85150n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f85151o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f85152p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f85153q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f85154r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final String f85155s;

    /* renamed from: t, reason: collision with root package name */
    public final int f85156t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f85157u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f85158v;

    /* compiled from: AdvertDetailsPriceItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsPriceItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsPriceItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsPriceItem(parcel.readLong(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(AdvertDetailsPriceItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : OldPriceHintBottomSheet.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : PriceHintItem.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BuyerBonusesItem.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsPriceItem[] newArray(int i12) {
            return new AdvertDetailsPriceItem[i12];
        }
    }

    public AdvertDetailsPriceItem(long j12, @Y61.k String str, @Y61.l String str2, @Y61.l AttributedText attributedText, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l OldPriceHintBottomSheet oldPriceHintBottomSheet, boolean z12, @Y61.l PriceHintItem priceHintItem, @Y61.l BuyerBonusesItem buyerBonusesItem, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, @Y61.l String str6, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f85138b = j12;
        this.f85139c = str;
        this.f85140d = str2;
        this.f85141e = attributedText;
        this.f85142f = str3;
        this.f85143g = str4;
        this.f85144h = str5;
        this.f85145i = oldPriceHintBottomSheet;
        this.f85146j = z12;
        this.f85147k = priceHintItem;
        this.f85148l = buyerBonusesItem;
        this.f85149m = z13;
        this.f85150n = z14;
        this.f85151o = z15;
        this.f85152p = z16;
        this.f85153q = z17;
        this.f85154r = z18;
        this.f85155s = str6;
        this.f85156t = i12;
        this.f85157u = serpDisplayType;
        this.f85158v = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsPriceItem(this.f85138b, this.f85139c, this.f85140d, this.f85141e, this.f85142f, this.f85143g, this.f85144h, this.f85145i, this.f85146j, this.f85147k, this.f85148l, this.f85149m, this.f85150n, this.f85151o, this.f85152p, this.f85153q, this.f85154r, this.f85155s, i12, this.f85157u, this.f85158v);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f85157u = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsPriceItem)) {
            return false;
        }
        AdvertDetailsPriceItem advertDetailsPriceItem = (AdvertDetailsPriceItem) obj;
        return this.f85138b == advertDetailsPriceItem.f85138b && L.f(this.f85139c, advertDetailsPriceItem.f85139c) && L.f(this.f85140d, advertDetailsPriceItem.f85140d) && L.f(this.f85141e, advertDetailsPriceItem.f85141e) && L.f(this.f85142f, advertDetailsPriceItem.f85142f) && L.f(this.f85143g, advertDetailsPriceItem.f85143g) && L.f(this.f85144h, advertDetailsPriceItem.f85144h) && L.f(this.f85145i, advertDetailsPriceItem.f85145i) && this.f85146j == advertDetailsPriceItem.f85146j && L.f(this.f85147k, advertDetailsPriceItem.f85147k) && L.f(this.f85148l, advertDetailsPriceItem.f85148l) && this.f85149m == advertDetailsPriceItem.f85149m && this.f85150n == advertDetailsPriceItem.f85150n && this.f85151o == advertDetailsPriceItem.f85151o && this.f85152p == advertDetailsPriceItem.f85152p && this.f85153q == advertDetailsPriceItem.f85153q && this.f85154r == advertDetailsPriceItem.f85154r && L.f(this.f85155s, advertDetailsPriceItem.f85155s) && this.f85156t == advertDetailsPriceItem.f85156t && this.f85157u == advertDetailsPriceItem.f85157u && this.f85158v == advertDetailsPriceItem.f85158v;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF77493b() {
        return this.f85138b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF77496e() {
        return this.f85156t;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF321549b() {
        return this.f85139c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF77498g() {
        return this.f85158v;
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f85138b) * 31, 31, this.f85139c);
        String str = this.f85140d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f85141e;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str2 = this.f85142f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f85143g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f85144h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        OldPriceHintBottomSheet oldPriceHintBottomSheet = this.f85145i;
        int i12 = r.i((iHashCode5 + (oldPriceHintBottomSheet == null ? 0 : oldPriceHintBottomSheet.hashCode())) * 31, 31, this.f85146j);
        PriceHintItem priceHintItem = this.f85147k;
        int iHashCode6 = (i12 + (priceHintItem == null ? 0 : priceHintItem.hashCode())) * 31;
        BuyerBonusesItem buyerBonusesItem = this.f85148l;
        int i13 = r.i(r.i(r.i(r.i(r.i(r.i((iHashCode6 + (buyerBonusesItem == null ? 0 : buyerBonusesItem.hashCode())) * 31, 31, this.f85149m), 31, this.f85150n), 31, this.f85151o), 31, this.f85152p), 31, this.f85153q), 31, this.f85154r);
        String str5 = this.f85155s;
        return this.f85158v.hashCode() + com.avito.android.actions_sheet.a.h(this.f85157u, r.e(this.f85156t, (i13 + (str5 != null ? str5.hashCode() : 0)) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsPriceItem(id=");
        sb2.append(this.f85138b);
        sb2.append(", stringId=");
        sb2.append(this.f85139c);
        sb2.append(", price=");
        sb2.append(this.f85140d);
        sb2.append(", attributedPrice=");
        sb2.append(this.f85141e);
        sb2.append(", normalizedPrice=");
        sb2.append(this.f85142f);
        sb2.append(", oldPrice=");
        sb2.append(this.f85143g);
        sb2.append(", oldPriceHint=");
        sb2.append(this.f85144h);
        sb2.append(", oldPriceHintBottomSheet=");
        sb2.append(this.f85145i);
        sb2.append(", closedAdvert=");
        sb2.append(this.f85146j);
        sb2.append(", priceHintItem=");
        sb2.append(this.f85147k);
        sb2.append(", buyerBonuses=");
        sb2.append(this.f85148l);
        sb2.append(", isRedesign=");
        sb2.append(this.f85149m);
        sb2.append(", isRestyle=");
        sb2.append(this.f85150n);
        sb2.append(", isJobRedesign=");
        sb2.append(this.f85151o);
        sb2.append(", isGigRedesign=");
        sb2.append(this.f85152p);
        sb2.append(", isGoodsPriceRedesign=");
        sb2.append(this.f85153q);
        sb2.append(", isServicesRedesign=");
        sb2.append(this.f85154r);
        sb2.append(", presentationStyle=");
        sb2.append(this.f85155s);
        sb2.append(", spanCount=");
        sb2.append(this.f85156t);
        sb2.append(", displayType=");
        sb2.append(this.f85157u);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f85158v, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f85138b);
        parcel.writeString(this.f85139c);
        parcel.writeString(this.f85140d);
        parcel.writeParcelable(this.f85141e, i12);
        parcel.writeString(this.f85142f);
        parcel.writeString(this.f85143g);
        parcel.writeString(this.f85144h);
        OldPriceHintBottomSheet oldPriceHintBottomSheet = this.f85145i;
        if (oldPriceHintBottomSheet == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oldPriceHintBottomSheet.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f85146j ? 1 : 0);
        PriceHintItem priceHintItem = this.f85147k;
        if (priceHintItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceHintItem.writeToParcel(parcel, i12);
        }
        BuyerBonusesItem buyerBonusesItem = this.f85148l;
        if (buyerBonusesItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buyerBonusesItem.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f85149m ? 1 : 0);
        parcel.writeInt(this.f85150n ? 1 : 0);
        parcel.writeInt(this.f85151o ? 1 : 0);
        parcel.writeInt(this.f85152p ? 1 : 0);
        parcel.writeInt(this.f85153q ? 1 : 0);
        parcel.writeInt(this.f85154r ? 1 : 0);
        parcel.writeString(this.f85155s);
        parcel.writeInt(this.f85156t);
        parcel.writeString(this.f85157u.name());
        parcel.writeString(this.f85158v.name());
    }

    /* compiled from: AdvertDetailsPriceItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/price/AdvertDetailsPriceItem$OldPriceHintBottomSheet;", "Landroid/os/Parcelable;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class OldPriceHintBottomSheet implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<OldPriceHintBottomSheet> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f85159b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f85160c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f85161d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final DeepLink f85162e;

        /* compiled from: AdvertDetailsPriceItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OldPriceHintBottomSheet> {
            @Override // android.os.Parcelable.Creator
            public final OldPriceHintBottomSheet createFromParcel(Parcel parcel) {
                return new OldPriceHintBottomSheet(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(OldPriceHintBottomSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OldPriceHintBottomSheet[] newArray(int i12) {
                return new OldPriceHintBottomSheet[i12];
            }
        }

        public OldPriceHintBottomSheet(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l DeepLink deepLink) {
            this.f85159b = str;
            this.f85160c = str2;
            this.f85161d = str3;
            this.f85162e = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OldPriceHintBottomSheet)) {
                return false;
            }
            OldPriceHintBottomSheet oldPriceHintBottomSheet = (OldPriceHintBottomSheet) obj;
            return L.f(this.f85159b, oldPriceHintBottomSheet.f85159b) && L.f(this.f85160c, oldPriceHintBottomSheet.f85160c) && L.f(this.f85161d, oldPriceHintBottomSheet.f85161d) && L.f(this.f85162e, oldPriceHintBottomSheet.f85162e);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f85159b.hashCode() * 31, 31, this.f85160c), 31, this.f85161d);
            DeepLink deepLink = this.f85162e;
            return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OldPriceHintBottomSheet(title=");
            sb2.append(this.f85159b);
            sb2.append(", description=");
            sb2.append(this.f85160c);
            sb2.append(", buttonTitle=");
            sb2.append(this.f85161d);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f85162e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f85159b);
            parcel.writeString(this.f85160c);
            parcel.writeString(this.f85161d);
            parcel.writeParcelable(this.f85162e, i12);
        }

        public /* synthetic */ OldPriceHintBottomSheet(String str, String str2, String str3, DeepLink deepLink, int i12, C42822w c42822w) {
            this(str, str2, str3, (i12 & 8) != 0 ? null : deepLink);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsPriceItem(long j12, String str, String str2, AttributedText attributedText, String str3, String str4, String str5, OldPriceHintBottomSheet oldPriceHintBottomSheet, boolean z12, PriceHintItem priceHintItem, BuyerBonusesItem buyerBonusesItem, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, String str6, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 2;
        } else {
            j13 = j12;
        }
        this(j13, (2 & i13) != 0 ? String.valueOf(j13) : str, str2, attributedText, str3, str4, str5, (i13 & 128) != 0 ? null : oldPriceHintBottomSheet, z12, priceHintItem, buyerBonusesItem, (i13 & 2048) != 0 ? false : z13, (i13 & 4096) != 0 ? false : z14, (i13 & 8192) != 0 ? false : z15, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z16, (32768 & i13) != 0 ? false : z17, (65536 & i13) != 0 ? false : z18, (131072 & i13) != 0 ? null : str6, i12, (524288 & i13) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 1048576) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
