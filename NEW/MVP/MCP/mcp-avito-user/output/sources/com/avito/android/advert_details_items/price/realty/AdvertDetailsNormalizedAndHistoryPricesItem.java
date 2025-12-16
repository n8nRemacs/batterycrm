package com.avito.android.advert_details_items.price.realty;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsPriceWithNormalizedPriceAndPriceHistoryItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_details_items/price/realty/AdvertDetailsNormalizedAndHistoryPricesItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "PriceHistory", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsNormalizedAndHistoryPricesItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsNormalizedAndHistoryPricesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f85216b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f85217c;

    /* renamed from: d, reason: collision with root package name */
    public final int f85218d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f85219e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f85220f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f85221g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f85222h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final PriceHistory f85223i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f85224j;

    /* compiled from: AdvertDetailsPriceWithNormalizedPriceAndPriceHistoryItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/price/realty/AdvertDetailsNormalizedAndHistoryPricesItem$PriceHistory;", "Landroid/os/Parcelable;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class PriceHistory implements Parcelable {

        @k
        public static final Parcelable.Creator<PriceHistory> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f85225b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f85226c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f85227d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final AttributedText f85228e;

        /* compiled from: AdvertDetailsPriceWithNormalizedPriceAndPriceHistoryItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PriceHistory> {
            @Override // android.os.Parcelable.Creator
            public final PriceHistory createFromParcel(Parcel parcel) {
                return new PriceHistory((DeepLink) parcel.readParcelable(PriceHistory.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, (AttributedText) parcel.readParcelable(PriceHistory.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final PriceHistory[] newArray(int i12) {
                return new PriceHistory[i12];
            }
        }

        public PriceHistory(@k DeepLink deepLink, @l String str, boolean z12, @k AttributedText attributedText) {
            this.f85225b = str;
            this.f85226c = deepLink;
            this.f85227d = z12;
            this.f85228e = attributedText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PriceHistory)) {
                return false;
            }
            PriceHistory priceHistory = (PriceHistory) obj;
            return L.f(this.f85225b, priceHistory.f85225b) && L.f(this.f85226c, priceHistory.f85226c) && this.f85227d == priceHistory.f85227d && L.f(this.f85228e, priceHistory.f85228e);
        }

        public final int hashCode() {
            String str = this.f85225b;
            return this.f85228e.hashCode() + r.i(com.avito.android.actions_sheet.a.e(this.f85226c, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.f85227d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PriceHistory(context=");
            sb2.append(this.f85225b);
            sb2.append(", deepLink=");
            sb2.append(this.f85226c);
            sb2.append(", isFavorite=");
            sb2.append(this.f85227d);
            sb2.append(", title=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f85228e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f85225b);
            parcel.writeParcelable(this.f85226c, i12);
            parcel.writeInt(this.f85227d ? 1 : 0);
            parcel.writeParcelable(this.f85228e, i12);
        }
    }

    /* compiled from: AdvertDetailsPriceWithNormalizedPriceAndPriceHistoryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsNormalizedAndHistoryPricesItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsNormalizedAndHistoryPricesItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsNormalizedAndHistoryPricesItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PriceHistory.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsNormalizedAndHistoryPricesItem[] newArray(int i12) {
            return new AdvertDetailsNormalizedAndHistoryPricesItem[i12];
        }
    }

    public AdvertDetailsNormalizedAndHistoryPricesItem(long j12, @k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @l String str2, @l String str3, @l PriceHistory priceHistory, boolean z12) {
        this.f85216b = j12;
        this.f85217c = str;
        this.f85218d = i12;
        this.f85219e = serpDisplayType;
        this.f85220f = serpViewType;
        this.f85221g = str2;
        this.f85222h = str3;
        this.f85223i = priceHistory;
        this.f85224j = z12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsNormalizedAndHistoryPricesItem(this.f85216b, this.f85217c, i12, this.f85219e, this.f85220f, this.f85221g, this.f85222h, this.f85223i, this.f85224j);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f85219e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsNormalizedAndHistoryPricesItem)) {
            return false;
        }
        AdvertDetailsNormalizedAndHistoryPricesItem advertDetailsNormalizedAndHistoryPricesItem = (AdvertDetailsNormalizedAndHistoryPricesItem) obj;
        return this.f85216b == advertDetailsNormalizedAndHistoryPricesItem.f85216b && L.f(this.f85217c, advertDetailsNormalizedAndHistoryPricesItem.f85217c) && this.f85218d == advertDetailsNormalizedAndHistoryPricesItem.f85218d && this.f85219e == advertDetailsNormalizedAndHistoryPricesItem.f85219e && this.f85220f == advertDetailsNormalizedAndHistoryPricesItem.f85220f && L.f(this.f85221g, advertDetailsNormalizedAndHistoryPricesItem.f85221g) && L.f(this.f85222h, advertDetailsNormalizedAndHistoryPricesItem.f85222h) && L.f(this.f85223i, advertDetailsNormalizedAndHistoryPricesItem.f85223i) && this.f85224j == advertDetailsNormalizedAndHistoryPricesItem.f85224j;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75467p() {
        return this.f85216b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75469r() {
        return this.f85218d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75468q() {
        return this.f85217c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75471t() {
        return this.f85220f;
    }

    public final int hashCode() {
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f85220f, com.avito.android.actions_sheet.a.h(this.f85219e, r.e(this.f85218d, H.d(Long.hashCode(this.f85216b) * 31, 31, this.f85217c), 31), 31), 31);
        String str = this.f85221g;
        int iHashCode = (iJ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f85222h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PriceHistory priceHistory = this.f85223i;
        return Boolean.hashCode(this.f85224j) + ((iHashCode2 + (priceHistory != null ? priceHistory.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsNormalizedAndHistoryPricesItem(id=");
        sb2.append(this.f85216b);
        sb2.append(", stringId=");
        sb2.append(this.f85217c);
        sb2.append(", spanCount=");
        sb2.append(this.f85218d);
        sb2.append(", displayType=");
        sb2.append(this.f85219e);
        sb2.append(", viewType=");
        sb2.append(this.f85220f);
        sb2.append(", price=");
        sb2.append(this.f85221g);
        sb2.append(", normalizedPrice=");
        sb2.append(this.f85222h);
        sb2.append(", priceHistory=");
        sb2.append(this.f85223i);
        sb2.append(", closedAdvert=");
        return r.x(sb2, this.f85224j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f85216b);
        parcel.writeString(this.f85217c);
        parcel.writeInt(this.f85218d);
        parcel.writeString(this.f85219e.name());
        parcel.writeString(this.f85220f.name());
        parcel.writeString(this.f85221g);
        parcel.writeString(this.f85222h);
        PriceHistory priceHistory = this.f85223i;
        if (priceHistory == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceHistory.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f85224j ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsNormalizedAndHistoryPricesItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, String str2, String str3, PriceHistory priceHistory, boolean z12, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 3;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, str2, str3, priceHistory, z12);
    }
}
