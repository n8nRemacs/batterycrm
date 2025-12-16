package com.avito.android.advert_core.gap;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsGapItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/gap/AdvertDetailsGapItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertDetailsGapItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsGapItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f83668b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f83669c;

    /* renamed from: d, reason: collision with root package name */
    public final int f83670d;

    /* renamed from: e, reason: collision with root package name */
    public final int f83671e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f83672f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f83673g;

    /* compiled from: AdvertDetailsGapItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsGapItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsGapItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsGapItem(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsGapItem[] newArray(int i12) {
            return new AdvertDetailsGapItem[i12];
        }
    }

    public AdvertDetailsGapItem(long j12, @k String str, int i12, int i13, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f83668b = j12;
        this.f83669c = str;
        this.f83670d = i12;
        this.f83671e = i13;
        this.f83672f = serpDisplayType;
        this.f83673g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsGapItem(this.f83668b, this.f83669c, this.f83670d, i12, this.f83672f, this.f83673g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f83672f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF162200b() {
        return this.f83668b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF162202d() {
        return this.f83671e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF82028b() {
        return this.f83669c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF162205g() {
        return this.f83673g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f83668b);
        parcel.writeString(this.f83669c);
        parcel.writeInt(this.f83670d);
        parcel.writeInt(this.f83671e);
        parcel.writeString(this.f83672f.name());
        parcel.writeString(this.f83673g.name());
    }

    public /* synthetic */ AdvertDetailsGapItem(long j12, String str, int i12, int i13, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i14, C42822w c42822w) {
        this(j12, (i14 & 2) != 0 ? String.valueOf(j12) : str, (i14 & 4) != 0 ? 7 : i12, i13, (i14 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i14 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
