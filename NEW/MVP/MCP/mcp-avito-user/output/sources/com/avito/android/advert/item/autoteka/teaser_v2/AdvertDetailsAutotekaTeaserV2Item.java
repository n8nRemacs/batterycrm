package com.avito.android.advert.item.autoteka.teaser_v2;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.autoteka.common.AdvertDetailsAutotekaTeaserItemCommon;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserItemResponse;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsAutotekaTeaserV2Item.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser_v2/AdvertDetailsAutotekaTeaserV2Item;", "Lcom/avito/android/advert/item/autoteka/common/AdvertDetailsAutotekaTeaserItemCommon;", "Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserItemResponse;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsAutotekaTeaserV2Item implements AdvertDetailsAutotekaTeaserItemCommon<AutotekaTeaserItemResponse>, b.InterfaceC10495b {

    @k
    public static final Parcelable.Creator<AdvertDetailsAutotekaTeaserV2Item> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f73103b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public SerpDisplayType f73104c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AutotekaTeaserItemResponse f73105d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f73106e;

    /* renamed from: f, reason: collision with root package name */
    public final long f73107f;

    /* compiled from: AdvertDetailsAutotekaTeaserV2Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsAutotekaTeaserV2Item> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAutotekaTeaserV2Item createFromParcel(Parcel parcel) {
            return new AdvertDetailsAutotekaTeaserV2Item(parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), (AutotekaTeaserItemResponse) parcel.readParcelable(AdvertDetailsAutotekaTeaserV2Item.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAutotekaTeaserV2Item[] newArray(int i12) {
            return new AdvertDetailsAutotekaTeaserV2Item[i12];
        }
    }

    public AdvertDetailsAutotekaTeaserV2Item(int i12, @k SerpDisplayType serpDisplayType, @l AutotekaTeaserItemResponse autotekaTeaserItemResponse, @l String str) {
        this.f73103b = i12;
        this.f73104c = serpDisplayType;
        this.f73105d = autotekaTeaserItemResponse;
        this.f73106e = str;
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        this.f73107f = 15;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsAutotekaTeaserV2Item(i12, this.f73104c, this.f73105d, this.f73106e);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f73104c = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsAutotekaTeaserV2Item)) {
            return false;
        }
        AdvertDetailsAutotekaTeaserV2Item advertDetailsAutotekaTeaserV2Item = (AdvertDetailsAutotekaTeaserV2Item) obj;
        return this.f73103b == advertDetailsAutotekaTeaserV2Item.f73103b && this.f73104c == advertDetailsAutotekaTeaserV2Item.f73104c && L.f(this.f73105d, advertDetailsAutotekaTeaserV2Item.f73105d) && L.f(this.f73106e, advertDetailsAutotekaTeaserV2Item.f73106e);
    }

    @Override // com.avito.android.advert.item.autoteka.common.AdvertDetailsAutotekaTeaserItemCommon
    /* renamed from: getData, reason: from getter */
    public final AutotekaTeaserItemResponse getF73157d() {
        return this.f73105d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268422b() {
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return 15;
    }

    @Override // com.avito.android.advert.item.autoteka.common.AdvertDetailsAutotekaTeaserItemCommon
    @l
    /* renamed from: getSearchContext, reason: from getter */
    public final String getF73158e() {
        return this.f73106e;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF268372C() {
        return this.f73103b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF298989b() {
        return String.valueOf(getF268422b());
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF77499h() {
        return this.f73107f;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType */
    public final SerpViewType getF268374D() {
        return SerpViewType.f268585e;
    }

    public final int hashCode() {
        int iH2 = com.avito.android.actions_sheet.a.h(this.f73104c, Integer.hashCode(this.f73103b) * 31, 31);
        AutotekaTeaserItemResponse autotekaTeaserItemResponse = this.f73105d;
        int iHashCode = (iH2 + (autotekaTeaserItemResponse == null ? 0 : autotekaTeaserItemResponse.hashCode())) * 31;
        String str = this.f73106e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsAutotekaTeaserV2Item(spanCount=");
        sb2.append(this.f73103b);
        sb2.append(", displayType=");
        sb2.append(this.f73104c);
        sb2.append(", data=");
        sb2.append(this.f73105d);
        sb2.append(", searchContext=");
        return C22026a.c(sb2, this.f73106e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f73103b);
        parcel.writeString(this.f73104c.name());
        parcel.writeParcelable(this.f73105d, i12);
        parcel.writeString(this.f73106e);
    }

    public /* synthetic */ AdvertDetailsAutotekaTeaserV2Item(int i12, SerpDisplayType serpDisplayType, AutotekaTeaserItemResponse autotekaTeaserItemResponse, String str, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 4) != 0 ? null : autotekaTeaserItemResponse, str);
    }
}
