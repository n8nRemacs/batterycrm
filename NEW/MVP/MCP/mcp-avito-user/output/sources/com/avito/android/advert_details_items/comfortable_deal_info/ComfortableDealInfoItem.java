package com.avito.android.advert_details_items.comfortable_deal_info;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.ComfortableDealInfo;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealInfoItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/comfortable_deal_info/ComfortableDealInfoItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ComfortableDealInfoItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<ComfortableDealInfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f84571b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84572c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public SerpDisplayType f84573d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f84574e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ComfortableDealInfo f84575f;

    /* compiled from: ComfortableDealInfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ComfortableDealInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final ComfortableDealInfoItem createFromParcel(Parcel parcel) {
            return new ComfortableDealInfoItem(parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), (ComfortableDealInfo) parcel.readParcelable(ComfortableDealInfoItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ComfortableDealInfoItem[] newArray(int i12) {
            return new ComfortableDealInfoItem[i12];
        }
    }

    public ComfortableDealInfoItem(@k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k ComfortableDealInfo comfortableDealInfo) {
        this.f84571b = str;
        this.f84572c = i12;
        this.f84573d = serpDisplayType;
        this.f84574e = serpViewType;
        this.f84575f = comfortableDealInfo;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new ComfortableDealInfoItem(this.f84571b, i12, this.f84573d, this.f84574e, this.f84575f);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f84573d = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComfortableDealInfoItem)) {
            return false;
        }
        ComfortableDealInfoItem comfortableDealInfoItem = (ComfortableDealInfoItem) obj;
        return L.f(this.f84571b, comfortableDealInfoItem.f84571b) && this.f84572c == comfortableDealInfoItem.f84572c && this.f84573d == comfortableDealInfoItem.f84573d && this.f84574e == comfortableDealInfoItem.f84574e && L.f(this.f84575f, comfortableDealInfoItem.f84575f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268422b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF268372C() {
        return this.f84572c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF298989b() {
        return this.f84571b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF268374D() {
        return this.f84574e;
    }

    public final int hashCode() {
        return this.f84575f.hashCode() + com.avito.android.actions_sheet.a.j(this.f84574e, com.avito.android.actions_sheet.a.h(this.f84573d, r.e(this.f84572c, this.f84571b.hashCode() * 31, 31), 31), 31);
    }

    @k
    public final String toString() {
        return "ComfortableDealInfoItem(stringId=" + this.f84571b + ", spanCount=" + this.f84572c + ", displayType=" + this.f84573d + ", viewType=" + this.f84574e + ", data=" + this.f84575f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f84571b);
        parcel.writeInt(this.f84572c);
        parcel.writeString(this.f84573d.name());
        parcel.writeString(this.f84574e.name());
        parcel.writeParcelable(this.f84575f, i12);
    }

    public /* synthetic */ ComfortableDealInfoItem(String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, ComfortableDealInfo comfortableDealInfo, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? ComfortableDealInfoItem.class.getName() : str, i12, (i13 & 4) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 8) != 0 ? SerpViewType.f268585e : serpViewType, comfortableDealInfo);
    }
}
