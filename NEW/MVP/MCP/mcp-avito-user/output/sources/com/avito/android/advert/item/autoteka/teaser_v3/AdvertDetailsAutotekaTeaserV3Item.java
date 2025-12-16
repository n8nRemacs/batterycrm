package com.avito.android.advert.item.autoteka.teaser_v3;

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

/* compiled from: AdvertDetailsAutotekaTeaserV3Item.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser_v3/AdvertDetailsAutotekaTeaserV3Item;", "Lcom/avito/android/advert/item/autoteka/common/AdvertDetailsAutotekaTeaserItemCommon;", "Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserItemResponse;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsAutotekaTeaserV3Item implements AdvertDetailsAutotekaTeaserItemCommon<AutotekaTeaserItemResponse>, b.InterfaceC10495b {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsAutotekaTeaserV3Item> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f73121b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f73122c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AutotekaTeaserItemResponse f73123d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f73124e;

    /* renamed from: f, reason: collision with root package name */
    public final long f73125f;

    /* compiled from: AdvertDetailsAutotekaTeaserV3Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsAutotekaTeaserV3Item> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAutotekaTeaserV3Item createFromParcel(Parcel parcel) {
            return new AdvertDetailsAutotekaTeaserV3Item(parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), (AutotekaTeaserItemResponse) parcel.readParcelable(AdvertDetailsAutotekaTeaserV3Item.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAutotekaTeaserV3Item[] newArray(int i12) {
            return new AdvertDetailsAutotekaTeaserV3Item[i12];
        }
    }

    public AdvertDetailsAutotekaTeaserV3Item(int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.l AutotekaTeaserItemResponse autotekaTeaserItemResponse, @Y61.l String str) {
        this.f73121b = i12;
        this.f73122c = serpDisplayType;
        this.f73123d = autotekaTeaserItemResponse;
        this.f73124e = str;
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        this.f73125f = 15;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsAutotekaTeaserV3Item(i12, this.f73122c, this.f73123d, this.f73124e);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f73122c = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsAutotekaTeaserV3Item)) {
            return false;
        }
        AdvertDetailsAutotekaTeaserV3Item advertDetailsAutotekaTeaserV3Item = (AdvertDetailsAutotekaTeaserV3Item) obj;
        return this.f73121b == advertDetailsAutotekaTeaserV3Item.f73121b && this.f73122c == advertDetailsAutotekaTeaserV3Item.f73122c && L.f(this.f73123d, advertDetailsAutotekaTeaserV3Item.f73123d) && L.f(this.f73124e, advertDetailsAutotekaTeaserV3Item.f73124e);
    }

    @Override // com.avito.android.advert.item.autoteka.common.AdvertDetailsAutotekaTeaserItemCommon
    /* renamed from: getData, reason: from getter */
    public final AutotekaTeaserItemResponse getF73157d() {
        return this.f73123d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268422b() {
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return 15;
    }

    @Override // com.avito.android.advert.item.autoteka.common.AdvertDetailsAutotekaTeaserItemCommon
    @Y61.l
    /* renamed from: getSearchContext, reason: from getter */
    public final String getF73158e() {
        return this.f73124e;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF268372C() {
        return this.f73121b;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF298989b() {
        return String.valueOf(getF268422b());
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF77499h() {
        return this.f73125f;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType */
    public final SerpViewType getF268374D() {
        return SerpViewType.f268585e;
    }

    public final int hashCode() {
        int iH2 = com.avito.android.actions_sheet.a.h(this.f73122c, Integer.hashCode(this.f73121b) * 31, 31);
        AutotekaTeaserItemResponse autotekaTeaserItemResponse = this.f73123d;
        int iHashCode = (iH2 + (autotekaTeaserItemResponse == null ? 0 : autotekaTeaserItemResponse.hashCode())) * 31;
        String str = this.f73124e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsAutotekaTeaserV3Item(spanCount=");
        sb2.append(this.f73121b);
        sb2.append(", displayType=");
        sb2.append(this.f73122c);
        sb2.append(", data=");
        sb2.append(this.f73123d);
        sb2.append(", searchContext=");
        return C22026a.c(sb2, this.f73124e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f73121b);
        parcel.writeString(this.f73122c.name());
        parcel.writeParcelable(this.f73123d, i12);
        parcel.writeString(this.f73124e);
    }

    public /* synthetic */ AdvertDetailsAutotekaTeaserV3Item(int i12, SerpDisplayType serpDisplayType, AutotekaTeaserItemResponse autotekaTeaserItemResponse, String str, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 4) != 0 ? null : autotekaTeaserItemResponse, str);
    }
}
