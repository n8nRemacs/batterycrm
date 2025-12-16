package com.avito.android.advert_core.price_list.preview;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.price_list.AdvertPriceListPreviewResponse;
import com.avito.android.remote.model.price_list.PriceList;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertPriceListPreviewItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/price_list/preview/AdvertPriceListPreviewItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertPriceListPreviewItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertPriceListPreviewItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f84107b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f84108c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public SerpDisplayType f84109d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f84110e;

    /* renamed from: f, reason: collision with root package name */
    public final int f84111f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f84112g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f84113h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final List<PriceList.Value> f84114i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final PriceList f84115j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final AdvertPriceListPreviewResponse.Event f84116k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f84117l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f84118m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f84119n;

    /* compiled from: AdvertPriceListPreviewItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertPriceListPreviewItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertPriceListPreviewItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(AdvertPriceListPreviewItem.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new AdvertPriceListPreviewItem(j12, string, serpDisplayTypeValueOf, serpViewTypeValueOf, i12, string2, string3, arrayList, (PriceList) parcel.readParcelable(AdvertPriceListPreviewItem.class.getClassLoader()), (AdvertPriceListPreviewResponse.Event) parcel.readParcelable(AdvertPriceListPreviewItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertPriceListPreviewItem[] newArray(int i12) {
            return new AdvertPriceListPreviewItem[i12];
        }
    }

    public AdvertPriceListPreviewItem(long j12, @k String str, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, int i12, @l String str2, @l String str3, @l List<PriceList.Value> list, @l PriceList priceList, @l AdvertPriceListPreviewResponse.Event event, boolean z12, boolean z13, boolean z14) {
        this.f84107b = j12;
        this.f84108c = str;
        this.f84109d = serpDisplayType;
        this.f84110e = serpViewType;
        this.f84111f = i12;
        this.f84112g = str2;
        this.f84113h = str3;
        this.f84114i = list;
        this.f84115j = priceList;
        this.f84116k = event;
        this.f84117l = z12;
        this.f84118m = z13;
        this.f84119n = z14;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertPriceListPreviewItem(this.f84107b, this.f84108c, this.f84109d, this.f84110e, i12, this.f84112g, this.f84113h, this.f84114i, this.f84115j, this.f84116k, this.f84117l, this.f84118m, this.f84119n);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f84109d = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertPriceListPreviewItem)) {
            return false;
        }
        AdvertPriceListPreviewItem advertPriceListPreviewItem = (AdvertPriceListPreviewItem) obj;
        return this.f84107b == advertPriceListPreviewItem.f84107b && L.f(this.f84108c, advertPriceListPreviewItem.f84108c) && this.f84109d == advertPriceListPreviewItem.f84109d && this.f84110e == advertPriceListPreviewItem.f84110e && this.f84111f == advertPriceListPreviewItem.f84111f && L.f(this.f84112g, advertPriceListPreviewItem.f84112g) && L.f(this.f84113h, advertPriceListPreviewItem.f84113h) && L.f(this.f84114i, advertPriceListPreviewItem.f84114i) && L.f(this.f84115j, advertPriceListPreviewItem.f84115j) && L.f(this.f84116k, advertPriceListPreviewItem.f84116k) && this.f84117l == advertPriceListPreviewItem.f84117l && this.f84118m == advertPriceListPreviewItem.f84118m && this.f84119n == advertPriceListPreviewItem.f84119n;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF74201e() {
        return this.f84107b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79070f() {
        return this.f84111f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF302126x() {
        return this.f84108c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79072h() {
        return this.f84110e;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f84111f, com.avito.android.actions_sheet.a.j(this.f84110e, com.avito.android.actions_sheet.a.h(this.f84109d, H.d(Long.hashCode(this.f84107b) * 31, 31, this.f84108c), 31), 31), 31);
        String str = this.f84112g;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f84113h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PriceList.Value> list = this.f84114i;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        PriceList priceList = this.f84115j;
        int iHashCode4 = (iHashCode3 + (priceList == null ? 0 : priceList.hashCode())) * 31;
        AdvertPriceListPreviewResponse.Event event = this.f84116k;
        return Boolean.hashCode(this.f84119n) + r.i(r.i((iHashCode4 + (event != null ? event.hashCode() : 0)) * 31, 31, this.f84117l), 31, this.f84118m);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertPriceListPreviewItem(id=");
        sb2.append(this.f84107b);
        sb2.append(", stringId=");
        sb2.append(this.f84108c);
        sb2.append(", displayType=");
        sb2.append(this.f84109d);
        sb2.append(", viewType=");
        sb2.append(this.f84110e);
        sb2.append(", spanCount=");
        sb2.append(this.f84111f);
        sb2.append(", title=");
        sb2.append(this.f84112g);
        sb2.append(", buttonTitle=");
        sb2.append(this.f84113h);
        sb2.append(", values=");
        sb2.append(this.f84114i);
        sb2.append(", priceList=");
        sb2.append(this.f84115j);
        sb2.append(", buttonClickedEvent=");
        sb2.append(this.f84116k);
        sb2.append(", isRestyle=");
        sb2.append(this.f84117l);
        sb2.append(", isBusinessServicesRedesign=");
        sb2.append(this.f84118m);
        sb2.append(", isServicesRedesign=");
        return r.x(sb2, this.f84119n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f84107b);
        parcel.writeString(this.f84108c);
        parcel.writeString(this.f84109d.name());
        parcel.writeString(this.f84110e.name());
        parcel.writeInt(this.f84111f);
        parcel.writeString(this.f84112g);
        parcel.writeString(this.f84113h);
        List<PriceList.Value> list = this.f84114i;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f84115j, i12);
        parcel.writeParcelable(this.f84116k, i12);
        parcel.writeInt(this.f84117l ? 1 : 0);
        parcel.writeInt(this.f84118m ? 1 : 0);
        parcel.writeInt(this.f84119n ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertPriceListPreviewItem(long j12, String str, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i12, String str2, String str3, List list, PriceList priceList, AdvertPriceListPreviewResponse.Event event, boolean z12, boolean z13, boolean z14, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 142;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, (i13 & 4) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 8) != 0 ? SerpViewType.f268585e : serpViewType, i12, (i13 & 32) != 0 ? null : str2, (i13 & 64) != 0 ? null : str3, (i13 & 128) != 0 ? null : list, (i13 & 256) != 0 ? null : priceList, (i13 & 512) != 0 ? null : event, (i13 & 1024) != 0 ? false : z12, (i13 & 2048) != 0 ? false : z13, (i13 & 4096) != 0 ? false : z14);
    }
}
