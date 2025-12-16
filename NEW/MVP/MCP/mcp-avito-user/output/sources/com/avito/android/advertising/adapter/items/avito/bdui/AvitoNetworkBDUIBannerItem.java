package com.avito.android.advertising.adapter.items.avito.bdui;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advertising.CommercialItem;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.InterfaceC28345a;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.grid.GridElementType;
import com.avito.android.remote.model.SerpDisplayType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import pb.InterfaceC47046b;
import pb.InterfaceC47047c;

/* compiled from: AvitoNetworkBDUIBannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/bdui/AvitoNetworkBDUIBannerItem;", "Lcom/avito/android/advertising/CommercialItem;", "Lpb/b;", "Lpb/c;", "Lcom/avito/android/advertising/loaders/a;", "Lcom/avito/android/advertising/h;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class AvitoNetworkBDUIBannerItem implements CommercialItem, InterfaceC47046b, InterfaceC47047c, InterfaceC28345a, com.avito.android.advertising.h {

    @Y61.k
    public static final Parcelable.Creator<AvitoNetworkBDUIBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f87007b;

    /* renamed from: c, reason: collision with root package name */
    public final long f87008c;

    /* renamed from: d, reason: collision with root package name */
    public final int f87009d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AdViewType f87010e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SerpDisplayType f87011f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f87012g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final BannerInfo f87013h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final AvitoNetworkBanner.BDUI f87014i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f87015j;

    /* compiled from: AvitoNetworkBDUIBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AvitoNetworkBDUIBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final AvitoNetworkBDUIBannerItem createFromParcel(Parcel parcel) {
            return new AvitoNetworkBDUIBannerItem(parcel.readString(), parcel.readLong(), parcel.readInt(), AdViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt() != 0, BannerInfo.CREATOR.createFromParcel(parcel), AvitoNetworkBanner.BDUI.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AvitoNetworkBDUIBannerItem[] newArray(int i12) {
            return new AvitoNetworkBDUIBannerItem[i12];
        }
    }

    public AvitoNetworkBDUIBannerItem(@Y61.k String str, long j12, int i12, @Y61.k AdViewType adViewType, @Y61.k SerpDisplayType serpDisplayType, boolean z12, @Y61.k BannerInfo bannerInfo, @Y61.k AvitoNetworkBanner.BDUI bdui, boolean z13) {
        this.f87007b = str;
        this.f87008c = j12;
        this.f87009d = i12;
        this.f87010e = adViewType;
        this.f87011f = serpDisplayType;
        this.f87012g = z12;
        this.f87013h = bannerInfo;
        this.f87014i = bdui;
        this.f87015j = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // pb.e
    @Y61.k
    /* renamed from: getAdViewType, reason: from getter */
    public final AdViewType getF87010e() {
        return this.f87010e;
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28345a
    public final int getArea() {
        return getF87013h().f87891v;
    }

    @Override // com.avito.android.advertising.h
    public final com.avito.android.advertising.b getBanner() {
        return this.f87014i;
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28345a
    @Y61.k
    /* renamed from: getBannerInfo, reason: from getter */
    public final BannerInfo getF87013h() {
        return this.f87013h;
    }

    @Override // QH.a
    @Y61.k
    /* renamed from: getGridType */
    public final GridElementType getF154809c() {
        return GridElementType.FullWidth.f161209b;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF87008c() {
        return this.f87008c;
    }

    /* renamed from: getSpanCount, reason: from getter */
    public final int getF87009d() {
        return this.f87009d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF87007b() {
        return this.f87007b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId */
    public final long getF272383m() {
        return getF87013h().getF272383m();
    }

    @Override // com.avito.android.advertising.CommercialItem
    public final boolean isContentEqualWith(@Y61.k Object obj) {
        return CommercialItem.a.a(this, obj);
    }

    /* renamed from: isEmbedded, reason: from getter */
    public final boolean getF87015j() {
        return this.f87015j;
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28345a
    public final void setArea(int i12) {
        getF87013h().f87891v = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f87007b);
        parcel.writeLong(this.f87008c);
        parcel.writeInt(this.f87009d);
        parcel.writeString(this.f87010e.name());
        parcel.writeString(this.f87011f.name());
        parcel.writeInt(this.f87012g ? 1 : 0);
        this.f87013h.writeToParcel(parcel, i12);
        this.f87014i.writeToParcel(parcel, i12);
        parcel.writeInt(this.f87015j ? 1 : 0);
    }

    public /* synthetic */ AvitoNetworkBDUIBannerItem(String str, long j12, int i12, AdViewType adViewType, SerpDisplayType serpDisplayType, boolean z12, BannerInfo bannerInfo, AvitoNetworkBanner.BDUI bdui, boolean z13, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? str.hashCode() : j12, (i13 & 4) != 0 ? 1 : i12, (i13 & 8) != 0 ? AdViewType.f86910d : adViewType, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? false : z12, bannerInfo, bdui, (i13 & 256) != 0 ? false : z13);
    }
}
