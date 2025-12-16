package com.avito.android.advert.item.autoteka_select.teaser;

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
import com.avito.android.remote.model.autoteka_teaser_select.AutotekaTeaserSelectItemResponse;
import com.avito.android.serp.adapter.SerpViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsAutotekaSelectTeaserItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/autoteka_select/teaser/AdvertDetailsAutotekaSelectTeaserItem;", "Lcom/avito/android/advert/item/autoteka/common/AdvertDetailsAutotekaTeaserItemCommon;", "Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectItemResponse;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsAutotekaSelectTeaserItem implements AdvertDetailsAutotekaTeaserItemCommon<AutotekaTeaserSelectItemResponse> {

    @k
    public static final Parcelable.Creator<AdvertDetailsAutotekaSelectTeaserItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f73155b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public SerpDisplayType f73156c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AutotekaTeaserSelectItemResponse f73157d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f73158e;

    /* compiled from: AdvertDetailsAutotekaSelectTeaserItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsAutotekaSelectTeaserItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAutotekaSelectTeaserItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsAutotekaSelectTeaserItem(parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), (AutotekaTeaserSelectItemResponse) parcel.readParcelable(AdvertDetailsAutotekaSelectTeaserItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAutotekaSelectTeaserItem[] newArray(int i12) {
            return new AdvertDetailsAutotekaSelectTeaserItem[i12];
        }
    }

    public AdvertDetailsAutotekaSelectTeaserItem(int i12, @k SerpDisplayType serpDisplayType, @l AutotekaTeaserSelectItemResponse autotekaTeaserSelectItemResponse, @l String str) {
        this.f73155b = i12;
        this.f73156c = serpDisplayType;
        this.f73157d = autotekaTeaserSelectItemResponse;
        this.f73158e = str;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsAutotekaSelectTeaserItem(i12, this.f73156c, this.f73157d, this.f73158e);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f73156c = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsAutotekaSelectTeaserItem)) {
            return false;
        }
        AdvertDetailsAutotekaSelectTeaserItem advertDetailsAutotekaSelectTeaserItem = (AdvertDetailsAutotekaSelectTeaserItem) obj;
        return this.f73155b == advertDetailsAutotekaSelectTeaserItem.f73155b && this.f73156c == advertDetailsAutotekaSelectTeaserItem.f73156c && L.f(this.f73157d, advertDetailsAutotekaSelectTeaserItem.f73157d) && L.f(this.f73158e, advertDetailsAutotekaSelectTeaserItem.f73158e);
    }

    @Override // com.avito.android.advert.item.autoteka.common.AdvertDetailsAutotekaTeaserItemCommon
    /* renamed from: getData, reason: from getter */
    public final AutotekaTeaserSelectItemResponse getF73157d() {
        return this.f73157d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF76078b() {
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return 15;
    }

    @Override // com.avito.android.advert.item.autoteka.common.AdvertDetailsAutotekaTeaserItemCommon
    @l
    /* renamed from: getSearchContext, reason: from getter */
    public final String getF73158e() {
        return this.f73158e;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF76082f() {
        return this.f73155b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF279229b() {
        return String.valueOf(getF76078b());
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType */
    public final SerpViewType getF76080d() {
        return SerpViewType.f268585e;
    }

    public final int hashCode() {
        int iH2 = com.avito.android.actions_sheet.a.h(this.f73156c, Integer.hashCode(this.f73155b) * 31, 31);
        AutotekaTeaserSelectItemResponse autotekaTeaserSelectItemResponse = this.f73157d;
        int iHashCode = (iH2 + (autotekaTeaserSelectItemResponse == null ? 0 : autotekaTeaserSelectItemResponse.hashCode())) * 31;
        String str = this.f73158e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsAutotekaSelectTeaserItem(spanCount=");
        sb2.append(this.f73155b);
        sb2.append(", displayType=");
        sb2.append(this.f73156c);
        sb2.append(", data=");
        sb2.append(this.f73157d);
        sb2.append(", searchContext=");
        return C22026a.c(sb2, this.f73158e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f73155b);
        parcel.writeString(this.f73156c.name());
        parcel.writeParcelable(this.f73157d, i12);
        parcel.writeString(this.f73158e);
    }

    public /* synthetic */ AdvertDetailsAutotekaSelectTeaserItem(int i12, SerpDisplayType serpDisplayType, AutotekaTeaserSelectItemResponse autotekaTeaserSelectItemResponse, String str, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 4) != 0 ? null : autotekaTeaserSelectItemResponse, str);
    }
}
