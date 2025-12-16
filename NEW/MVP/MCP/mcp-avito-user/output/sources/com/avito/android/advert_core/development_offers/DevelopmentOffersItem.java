package com.avito.android.advert_core.development_offers;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.AnalyticsData;
import com.avito.android.remote.model.DevelopmentOffers;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DevelopmentOffersItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/development_offers/DevelopmentOffersItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DevelopmentOffersItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<DevelopmentOffersItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DevelopmentOffers f83280b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f83281c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f83282d;

    /* renamed from: e, reason: collision with root package name */
    public final long f83283e;

    /* renamed from: f, reason: collision with root package name */
    public final int f83284f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f83285g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f83286h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final AnalyticsData f83287i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f83288j;

    /* compiled from: DevelopmentOffersItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DevelopmentOffersItem> {
        @Override // android.os.Parcelable.Creator
        public final DevelopmentOffersItem createFromParcel(Parcel parcel) {
            return new DevelopmentOffersItem((DevelopmentOffers) parcel.readParcelable(DevelopmentOffersItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), (AnalyticsData) parcel.readParcelable(DevelopmentOffersItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final DevelopmentOffersItem[] newArray(int i12) {
            return new DevelopmentOffersItem[i12];
        }
    }

    public DevelopmentOffersItem(@Y61.k DevelopmentOffers developmentOffers, @l String str, @Y61.k String str2, long j12, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType, @Y61.k AnalyticsData analyticsData, boolean z12) {
        this.f83280b = developmentOffers;
        this.f83281c = str;
        this.f83282d = str2;
        this.f83283e = j12;
        this.f83284f = i12;
        this.f83285g = serpDisplayType;
        this.f83286h = serpViewType;
        this.f83287i = analyticsData;
        this.f83288j = z12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new DevelopmentOffersItem(this.f83280b, this.f83281c, this.f83282d, this.f83283e, this.f83284f, null, this.f83286h, this.f83287i, this.f83288j, 32, null);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f83285g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF189215e() {
        return this.f83283e;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270468o() {
        return this.f83284f;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF288414b() {
        return this.f83282d;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270467n() {
        return this.f83286h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f83280b, i12);
        parcel.writeString(this.f83281c);
        parcel.writeString(this.f83282d);
        parcel.writeLong(this.f83283e);
        parcel.writeInt(this.f83284f);
        parcel.writeString(this.f83285g.name());
        parcel.writeString(this.f83286h.name());
        parcel.writeParcelable(this.f83287i, i12);
        parcel.writeInt(this.f83288j ? 1 : 0);
    }

    public /* synthetic */ DevelopmentOffersItem(DevelopmentOffers developmentOffers, String str, String str2, long j12, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, AnalyticsData analyticsData, boolean z12, int i13, C42822w c42822w) {
        this(developmentOffers, str, str2, j12, i12, (i13 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 64) != 0 ? SerpViewType.f268585e : serpViewType, analyticsData, z12);
    }
}
