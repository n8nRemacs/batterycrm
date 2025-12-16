package com.avito.android.advertising.adapter.items.avito;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advertising.CommercialItem;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.InterfaceC28345a;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.grid.GridElementType;
import com.avito.android.remote.model.SerpDisplayType;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import pb.InterfaceC47046b;
import pb.InterfaceC47047c;

/* compiled from: AvitoNetworkImageBannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005BQ\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010\u0019R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\"\u0010\u000f\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102R\"\u0010\u0013\u001a\u00020\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/AvitoNetworkImageBannerItem;", "Lcom/avito/android/advertising/CommercialItem;", "Lpb/b;", "Lpb/c;", "Lcom/avito/android/advertising/loaders/a;", "Lcom/avito/android/advertising/h;", "", "stringId", "", "id", "", "spanCount", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "adViewType", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "Lcom/avito/android/advertising/loaders/BannerInfo;", "bannerInfo", "", "fullSize", "Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$Image;", AdFormat.BANNER, "<init>", "(Ljava/lang/String;JILcom/avito/android/advertising/adapter/items/AdViewType;Lcom/avito/android/remote/model/SerpDisplayType;Lcom/avito/android/advertising/loaders/BannerInfo;ZLcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$Image;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStringId", "()Ljava/lang/String;", "J", "getId", "()J", "I", "getSpanCount", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "getAdViewType", "()Lcom/avito/android/advertising/adapter/items/AdViewType;", "Lcom/avito/android/remote/model/SerpDisplayType;", "getDisplayType", "()Lcom/avito/android/remote/model/SerpDisplayType;", "setDisplayType", "(Lcom/avito/android/remote/model/SerpDisplayType;)V", "Lcom/avito/android/advertising/loaders/BannerInfo;", "getBannerInfo", "()Lcom/avito/android/advertising/loaders/BannerInfo;", "Z", "getFullSize", "()Z", "setFullSize", "(Z)V", "Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$Image;", "getBanner", "()Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$Image;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class AvitoNetworkImageBannerItem implements CommercialItem, InterfaceC47046b, InterfaceC47047c, InterfaceC28345a, com.avito.android.advertising.h {

    @k
    public static final Parcelable.Creator<AvitoNetworkImageBannerItem> CREATOR = new a();

    @k
    private final AdViewType adViewType;

    @k
    private final AvitoNetworkBanner.Image banner;

    @k
    private final BannerInfo bannerInfo;

    @k
    private SerpDisplayType displayType;
    private boolean fullSize;
    private final long id;
    private final int spanCount;

    @k
    private final String stringId;

    /* compiled from: AvitoNetworkImageBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AvitoNetworkImageBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final AvitoNetworkImageBannerItem createFromParcel(Parcel parcel) {
            return new AvitoNetworkImageBannerItem(parcel.readString(), parcel.readLong(), parcel.readInt(), AdViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), BannerInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, AvitoNetworkBanner.Image.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AvitoNetworkImageBannerItem[] newArray(int i12) {
            return new AvitoNetworkImageBannerItem[i12];
        }
    }

    public AvitoNetworkImageBannerItem(@k String str, long j12, int i12, @k AdViewType adViewType, @k SerpDisplayType serpDisplayType, @k BannerInfo bannerInfo, boolean z12, @k AvitoNetworkBanner.Image image) {
        this.stringId = str;
        this.id = j12;
        this.spanCount = i12;
        this.adViewType = adViewType;
        this.displayType = serpDisplayType;
        this.bannerInfo = bannerInfo;
        this.fullSize = z12;
        this.banner = image;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // pb.e
    @k
    public AdViewType getAdViewType() {
        return this.adViewType;
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28345a
    public int getArea() {
        return getBannerInfo().f87891v;
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28345a
    @k
    public BannerInfo getBannerInfo() {
        return this.bannerInfo;
    }

    @k
    public SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    public boolean getFullSize() {
        return this.fullSize;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public GridElementType getF152077c() {
        return GridElementType.FullWidth.f161209b;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public long getF75840b() {
        return this.id;
    }

    public int getSpanCount() {
        return this.spanCount;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public String getF270078b() {
        return this.stringId;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId */
    public long getF270085i() {
        return getBannerInfo().getF270085i();
    }

    @Override // com.avito.android.advertising.CommercialItem
    public boolean isContentEqualWith(@k Object obj) {
        return CommercialItem.a.a(this, obj);
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28345a
    public void setArea(int i12) {
        getBannerInfo().f87891v = i12;
    }

    public void setDisplayType(@k SerpDisplayType serpDisplayType) {
        this.displayType = serpDisplayType;
    }

    public void setFullSize(boolean z12) {
        this.fullSize = z12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.stringId);
        parcel.writeLong(this.id);
        parcel.writeInt(this.spanCount);
        parcel.writeString(this.adViewType.name());
        parcel.writeString(this.displayType.name());
        this.bannerInfo.writeToParcel(parcel, flags);
        parcel.writeInt(this.fullSize ? 1 : 0);
        this.banner.writeToParcel(parcel, flags);
    }

    @Override // com.avito.android.advertising.h
    @k
    public AvitoNetworkBanner.Image getBanner() {
        return this.banner;
    }

    public /* synthetic */ AvitoNetworkImageBannerItem(String str, long j12, int i12, AdViewType adViewType, SerpDisplayType serpDisplayType, BannerInfo bannerInfo, boolean z12, AvitoNetworkBanner.Image image, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? str.hashCode() : j12, (i13 & 4) != 0 ? 1 : i12, (i13 & 8) != 0 ? AdViewType.f86910d : adViewType, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, bannerInfo, (i13 & 64) != 0 ? false : z12, image);
    }
}
