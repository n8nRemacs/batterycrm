package com.avito.android.advert.item.marketplace_sales_banner_out_of_bound;

import Y41.p;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.sales_banner_image_out_of_bounds.SalesBannerImageOutOfBounds;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.konveyor.item_visibility_tracker.b;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.l;

/* compiled from: MarketplaceSalesBannerOutOfBoundsItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/marketplace_sales_banner_out_of_bound/MarketplaceSalesBannerOutOfBoundsItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes10.dex */
public final /* data */ class MarketplaceSalesBannerOutOfBoundsItem implements BlockItem, Q, l1, b.InterfaceC10495b {

    @k
    public static final Parcelable.Creator<MarketplaceSalesBannerOutOfBoundsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f77564b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f77565c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SalesBannerImageOutOfBounds f77566d;

    /* renamed from: e, reason: collision with root package name */
    public final int f77567e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f77568f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f77569g;

    /* renamed from: h, reason: collision with root package name */
    public final long f77570h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TreeMap f77571i;

    /* compiled from: MarketplaceSalesBannerOutOfBoundsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MarketplaceSalesBannerOutOfBoundsItem> {
        @Override // android.os.Parcelable.Creator
        public final MarketplaceSalesBannerOutOfBoundsItem createFromParcel(Parcel parcel) {
            return new MarketplaceSalesBannerOutOfBoundsItem(parcel.readLong(), parcel.readString(), (SalesBannerImageOutOfBounds) parcel.readParcelable(MarketplaceSalesBannerOutOfBoundsItem.class.getClassLoader()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketplaceSalesBannerOutOfBoundsItem[] newArray(int i12) {
            return new MarketplaceSalesBannerOutOfBoundsItem[i12];
        }
    }

    /* compiled from: MarketplaceSalesBannerOutOfBoundsItem.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/ranges/l;", "kotlin.jvm.PlatformType", "a", "b", "", "invoke", "(Lkotlin/ranges/l;Lkotlin/ranges/l;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<l, l, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f77572l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final Integer invoke(l lVar, l lVar2) {
            return Integer.valueOf(L.g(lVar.f406905b, lVar2.f406905b));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MarketplaceSalesBannerOutOfBoundsItem(long r2, @Y61.k java.lang.String r4, @Y61.k com.avito.android.remote.model.sales_banner_image_out_of_bounds.SalesBannerImageOutOfBounds r5, int r6, @Y61.k com.avito.android.remote.model.SerpDisplayType r7, @Y61.k com.avito.android.serp.adapter.SerpViewType r8) {
        /*
            r1 = this;
            r1.<init>()
            r1.f77564b = r2
            r1.f77565c = r4
            r1.f77566d = r5
            r1.f77567e = r6
            r1.f77568f = r7
            r1.f77569g = r8
            r1.f77570h = r2
            java.util.Map r2 = r5.getWidthVariants()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            int r4 = r2.size()
            int r4 = kotlin.collections.P0.f(r4)
            r3.<init>(r4)
            java.util.Set r2 = r2.entrySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L2c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L9a
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = ":"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            r7 = 6
            r8 = 0
            java.util.List r5 = kotlin.text.C43066x.f0(r5, r6, r8, r7)
            java.lang.Object r6 = kotlin.collections.C42745f0.G(r5)
            java.lang.String r6 = (java.lang.String) r6
            r7 = 0
            if (r6 == 0) goto L65
            int r8 = r6.length()
            if (r8 != 0) goto L5a
            r6 = r7
        L5a:
            if (r6 == 0) goto L65
            int r6 = java.lang.Integer.parseInt(r6)
            int r6 = com.akita.view.foundation.util.f.a(r6)
            goto L66
        L65:
            r6 = -1
        L66:
            int r8 = r5.size()
            r0 = 2
            if (r8 >= r0) goto L6f
            r5 = r7
            goto L74
        L6f:
            r8 = 1
            java.lang.Object r5 = r5.get(r8)
        L74:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L8b
            int r8 = r5.length()
            if (r8 != 0) goto L7f
            goto L80
        L7f:
            r7 = r5
        L80:
            if (r7 == 0) goto L8b
            int r5 = java.lang.Integer.parseInt(r7)
            int r5 = com.akita.view.foundation.util.f.a(r5)
            goto L8e
        L8b:
            r5 = 2147483647(0x7fffffff, float:NaN)
        L8e:
            kotlin.ranges.l r5 = kotlin.ranges.s.r(r6, r5)
            java.lang.Object r4 = r4.getValue()
            r3.put(r5, r4)
            goto L2c
        L9a:
            com.avito.android.advert.item.marketplace_sales_banner_out_of_bound.MarketplaceSalesBannerOutOfBoundsItem$b r2 = com.avito.android.advert.item.marketplace_sales_banner_out_of_bound.MarketplaceSalesBannerOutOfBoundsItem.b.f77572l
            androidx.compose.foundation.text.selection.W0 r4 = new androidx.compose.foundation.text.selection.W0
            r5 = 2
            r4.<init>(r5, r2)
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>(r4)
            r2.putAll(r3)
            r1.f77571i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.marketplace_sales_banner_out_of_bound.MarketplaceSalesBannerOutOfBoundsItem.<init>(long, java.lang.String, com.avito.android.remote.model.sales_banner_image_out_of_bounds.SalesBannerImageOutOfBounds, int, com.avito.android.remote.model.SerpDisplayType, com.avito.android.serp.adapter.SerpViewType):void");
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new MarketplaceSalesBannerOutOfBoundsItem(this.f77564b, this.f77565c, this.f77566d, i12, this.f77568f, this.f77569g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f77568f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceSalesBannerOutOfBoundsItem)) {
            return false;
        }
        MarketplaceSalesBannerOutOfBoundsItem marketplaceSalesBannerOutOfBoundsItem = (MarketplaceSalesBannerOutOfBoundsItem) obj;
        return this.f77564b == marketplaceSalesBannerOutOfBoundsItem.f77564b && L.f(this.f77565c, marketplaceSalesBannerOutOfBoundsItem.f77565c) && L.f(this.f77566d, marketplaceSalesBannerOutOfBoundsItem.f77566d) && this.f77567e == marketplaceSalesBannerOutOfBoundsItem.f77567e && this.f77568f == marketplaceSalesBannerOutOfBoundsItem.f77568f && this.f77569g == marketplaceSalesBannerOutOfBoundsItem.f77569g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75367b() {
        return this.f77564b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75369d() {
        return this.f77567e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75368c() {
        return this.f77565c;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF128563l() {
        return this.f77570h;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75370e() {
        return this.f77569g;
    }

    public final int hashCode() {
        return this.f77569g.hashCode() + com.avito.android.actions_sheet.a.h(this.f77568f, r.e(this.f77567e, (this.f77566d.hashCode() + H.d(Long.hashCode(this.f77564b) * 31, 31, this.f77565c)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MarketplaceSalesBannerOutOfBoundsItem(id=");
        sb2.append(this.f77564b);
        sb2.append(", stringId=");
        sb2.append(this.f77565c);
        sb2.append(", salesBanner=");
        sb2.append(this.f77566d);
        sb2.append(", spanCount=");
        sb2.append(this.f77567e);
        sb2.append(", displayType=");
        sb2.append(this.f77568f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f77569g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f77564b);
        parcel.writeString(this.f77565c);
        parcel.writeParcelable(this.f77566d, i12);
        parcel.writeInt(this.f77567e);
        parcel.writeString(this.f77568f.name());
        parcel.writeString(this.f77569g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MarketplaceSalesBannerOutOfBoundsItem(long j12, String str, SalesBannerImageOutOfBounds salesBannerImageOutOfBounds, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 84;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, salesBannerImageOutOfBounds, i12, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
