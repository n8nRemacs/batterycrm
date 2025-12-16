package com.avito.android.advert_core.offers;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_core.offers.items.OfferItem;
import com.avito.android.remote.model.Offers;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: OffersItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/offers/OffersItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OffersItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<OffersItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Offers f83794b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<OfferItem> f83795c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f83796d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f83797e;

    /* renamed from: f, reason: collision with root package name */
    public final long f83798f;

    /* renamed from: g, reason: collision with root package name */
    public final int f83799g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public SerpDisplayType f83800h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SerpViewType f83801i;

    /* compiled from: OffersItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OffersItem> {
        @Override // android.os.Parcelable.Creator
        public final OffersItem createFromParcel(Parcel parcel) {
            Offers offers = (Offers) parcel.readParcelable(OffersItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(OffersItem.class, parcel, arrayList, iL2, 1);
            }
            return new OffersItem(offers, arrayList, parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final OffersItem[] newArray(int i12) {
            return new OffersItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OffersItem(@k Offers offers, @k List<? extends OfferItem> list, @l String str, @k String str2, long j12, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f83794b = offers;
        this.f83795c = list;
        this.f83796d = str;
        this.f83797e = str2;
        this.f83798f = j12;
        this.f83799g = i12;
        this.f83800h = serpDisplayType;
        this.f83801i = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new OffersItem(this.f83794b, this.f83795c, this.f83796d, this.f83797e, this.f83798f, i12, this.f83800h, this.f83801i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f83800h = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersItem)) {
            return false;
        }
        OffersItem offersItem = (OffersItem) obj;
        return L.f(this.f83794b, offersItem.f83794b) && L.f(this.f83795c, offersItem.f83795c) && L.f(this.f83796d, offersItem.f83796d) && L.f(this.f83797e, offersItem.f83797e) && this.f83798f == offersItem.f83798f && this.f83799g == offersItem.f83799g && this.f83800h == offersItem.f83800h && this.f83801i == offersItem.f83801i;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75092b() {
        return this.f83798f;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79047d() {
        return this.f83799g;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79045b() {
        return this.f83797e;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79050g() {
        return this.f83801i;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f83794b.hashCode() * 31, 31, this.f83795c);
        String str = this.f83796d;
        return this.f83801i.hashCode() + com.avito.android.actions_sheet.a.h(this.f83800h, r.e(this.f83799g, r.g(H.d((iE2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f83797e), 31, this.f83798f), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OffersItem(offers=");
        sb2.append(this.f83794b);
        sb2.append(", listOffers=");
        sb2.append(this.f83795c);
        sb2.append(", developmentsAdviceTitle=");
        sb2.append(this.f83796d);
        sb2.append(", stringId=");
        sb2.append(this.f83797e);
        sb2.append(", id=");
        sb2.append(this.f83798f);
        sb2.append(", spanCount=");
        sb2.append(this.f83799g);
        sb2.append(", displayType=");
        sb2.append(this.f83800h);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f83801i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f83794b, i12);
        Iterator itJ = C0.j(this.f83795c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f83796d);
        parcel.writeString(this.f83797e);
        parcel.writeLong(this.f83798f);
        parcel.writeInt(this.f83799g);
        parcel.writeString(this.f83800h.name());
        parcel.writeString(this.f83801i.name());
    }

    public /* synthetic */ OffersItem(Offers offers, List list, String str, String str2, long j12, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(offers, list, str, str2, j12, i12, (i13 & 64) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 128) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
