package com.avito.android.advert_core.aler_banner;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.BannerType;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AlertBannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/aler_banner/AlertBannerItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AlertBannerItem implements BlockItem, l1 {

    @k
    public static final Parcelable.Creator<AlertBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f82733b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f82734c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final BannerType f82735d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f82736e;

    /* renamed from: f, reason: collision with root package name */
    public final long f82737f;

    /* renamed from: g, reason: collision with root package name */
    public final int f82738g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpViewType f82739h;

    /* compiled from: AlertBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AlertBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final AlertBannerItem createFromParcel(Parcel parcel) {
            return new AlertBannerItem(parcel.readString(), parcel.readString(), BannerType.valueOf(parcel.readString()), parcel.readString(), parcel.readLong(), parcel.readInt(), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AlertBannerItem[] newArray(int i12) {
            return new AlertBannerItem[i12];
        }
    }

    public AlertBannerItem(@k String str, @k String str2, @k BannerType bannerType, @k String str3, long j12, int i12, @k SerpViewType serpViewType) {
        this.f82733b = str;
        this.f82734c = str2;
        this.f82735d = bannerType;
        this.f82736e = str3;
        this.f82737f = j12;
        this.f82738g = i12;
        this.f82739h = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AlertBannerItem(this.f82733b, this.f82734c, this.f82735d, this.f82736e, this.f82737f, i12, null, 64, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF79323b() {
        return this.f82737f;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75763b() {
        return this.f82738g;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF82073b() {
        return this.f82736e;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79327f() {
        return this.f82739h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f82733b);
        parcel.writeString(this.f82734c);
        parcel.writeString(this.f82735d.name());
        parcel.writeString(this.f82736e);
        parcel.writeLong(this.f82737f);
        parcel.writeInt(this.f82738g);
        parcel.writeString(this.f82739h.name());
    }

    public /* synthetic */ AlertBannerItem(String str, String str2, BannerType bannerType, String str3, long j12, int i12, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(str, str2, bannerType, str3, j12, i12, (i13 & 64) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
