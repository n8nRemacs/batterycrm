package com.avito.android.advertising.adapter.items.yandex;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advertising.CommercialItem;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.InterfaceC28345a;
import com.avito.android.grid.GridElementType;
import com.avito.android.remote.model.SerpDisplayType;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import pb.InterfaceC47046b;
import pb.InterfaceC47047c;

/* compiled from: YandexBannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006BZ\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000b\u0010\r\u001a\u00070\u000b¢\u0006\u0002\b\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\r\u001a\u00070\u000b¢\u0006\u0002\b\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103R\"\u0010\u0013\u001a\u00020\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0015\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\u0016\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u00109\u001a\u0004\b\u0016\u0010;\"\u0004\b>\u0010=R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010D\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lcom/avito/android/advertising/adapter/items/yandex/YandexBannerItem;", "Lcom/avito/android/advertising/CommercialItem;", "Lpb/b;", "Lpb/c;", "Lcom/avito/android/advertising/i;", "Lcom/avito/android/advertising/loaders/a;", "Lcom/avito/android/advertising/h;", "", "stringId", "", "id", "Lcom/avito/android/advertising/loaders/yandex/a;", "LK51/e;", AdFormat.BANNER, "", "spanCount", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "adViewType", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "", "fullSize", "isHidden", "Lcom/avito/android/advertising/loaders/BannerInfo;", "bannerInfo", "<init>", "(Ljava/lang/String;JLcom/avito/android/advertising/loaders/yandex/a;ILcom/avito/android/advertising/adapter/items/AdViewType;Lcom/avito/android/remote/model/SerpDisplayType;ZZLcom/avito/android/advertising/loaders/BannerInfo;)V", "newIsHidden", "copyWithIsHidden", "(Z)Lcom/avito/android/advertising/adapter/items/yandex/YandexBannerItem;", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStringId", "()Ljava/lang/String;", "J", "getId", "()J", "Lcom/avito/android/advertising/loaders/yandex/a;", "getBanner", "()Lcom/avito/android/advertising/loaders/yandex/a;", "I", "getSpanCount", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "getAdViewType", "()Lcom/avito/android/advertising/adapter/items/AdViewType;", "Lcom/avito/android/remote/model/SerpDisplayType;", "getDisplayType", "()Lcom/avito/android/remote/model/SerpDisplayType;", "setDisplayType", "(Lcom/avito/android/remote/model/SerpDisplayType;)V", "Z", "getFullSize", "()Z", "setFullSize", "(Z)V", "setHidden", "Lcom/avito/android/advertising/loaders/BannerInfo;", "getBannerInfo", "()Lcom/avito/android/advertising/loaders/BannerInfo;", "getHideId", "()Ljava/lang/Integer;", "hideId", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class YandexBannerItem implements CommercialItem, InterfaceC47046b, InterfaceC47047c, com.avito.android.advertising.i, InterfaceC28345a, com.avito.android.advertising.h {

    @Y61.k
    public static final Parcelable.Creator<YandexBannerItem> CREATOR = new a();

    @Y61.k
    private final AdViewType adViewType;

    @Y61.k
    private final com.avito.android.advertising.loaders.yandex.a banner;

    @Y61.k
    private final BannerInfo bannerInfo;

    @Y61.k
    private SerpDisplayType displayType;
    private boolean fullSize;
    private final long id;
    private boolean isHidden;
    private final int spanCount;

    @Y61.k
    private final String stringId;

    /* compiled from: YandexBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<YandexBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final YandexBannerItem createFromParcel(Parcel parcel) {
            return new YandexBannerItem(parcel.readString(), parcel.readLong(), (com.avito.android.advertising.loaders.yandex.a) parcel.readValue(YandexBannerItem.class.getClassLoader()), parcel.readInt(), AdViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, BannerInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final YandexBannerItem[] newArray(int i12) {
            return new YandexBannerItem[i12];
        }
    }

    public YandexBannerItem(@Y61.k String str, long j12, @Y61.k com.avito.android.advertising.loaders.yandex.a aVar, int i12, @Y61.k AdViewType adViewType, @Y61.k SerpDisplayType serpDisplayType, boolean z12, boolean z13, @Y61.k BannerInfo bannerInfo) {
        this.stringId = str;
        this.id = j12;
        this.banner = aVar;
        this.spanCount = i12;
        this.adViewType = adViewType;
        this.displayType = serpDisplayType;
        this.fullSize = z12;
        this.isHidden = z13;
        this.bannerInfo = bannerInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // pb.e
    @Y61.k
    public AdViewType getAdViewType() {
        return this.adViewType;
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28345a
    public int getArea() {
        return getBannerInfo().f87891v;
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28345a
    @Y61.k
    public BannerInfo getBannerInfo() {
        return this.bannerInfo;
    }

    @Y61.k
    public SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    public boolean getFullSize() {
        return this.fullSize;
    }

    @Override // QH.a
    @Y61.k
    /* renamed from: getGridType */
    public GridElementType getF154209c() {
        return GridElementType.FullWidth.f161209b;
    }

    @Override // com.avito.android.advertising.i
    @Y61.l
    public Integer getHideId() {
        getBanner().getClass();
        return null;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public long getF270893b() {
        return this.id;
    }

    public int getSpanCount() {
        return this.spanCount;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public String getF83350b() {
        return this.stringId;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId */
    public long getF272777l() {
        return getBannerInfo().getF272777l();
    }

    @Override // com.avito.android.advertising.CommercialItem
    public boolean isContentEqualWith(@Y61.k Object obj) {
        return CommercialItem.a.a(this, obj);
    }

    @Override // com.avito.android.advertising.i
    /* renamed from: isHidden, reason: from getter */
    public boolean getIsHidden() {
        return this.isHidden;
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28345a
    public void setArea(int i12) {
        getBannerInfo().f87891v = i12;
    }

    public void setDisplayType(@Y61.k SerpDisplayType serpDisplayType) {
        this.displayType = serpDisplayType;
    }

    public void setFullSize(boolean z12) {
        this.fullSize = z12;
    }

    @Override // com.avito.android.advertising.i
    public void setHidden(boolean z12) {
        this.isHidden = z12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.stringId);
        parcel.writeLong(this.id);
        parcel.writeValue(this.banner);
        parcel.writeInt(this.spanCount);
        parcel.writeString(this.adViewType.name());
        parcel.writeString(this.displayType.name());
        parcel.writeInt(this.fullSize ? 1 : 0);
        parcel.writeInt(this.isHidden ? 1 : 0);
        this.bannerInfo.writeToParcel(parcel, flags);
    }

    @Override // com.avito.android.advertising.i
    @Y61.k
    public YandexBannerItem copyWithIsHidden(boolean newIsHidden) {
        return new YandexBannerItem(getF83350b(), getF270893b(), getBanner(), getSpanCount(), getAdViewType(), getDisplayType(), getFullSize(), newIsHidden, getBannerInfo());
    }

    @Override // com.avito.android.advertising.h
    @Y61.k
    public com.avito.android.advertising.loaders.yandex.a getBanner() {
        return this.banner;
    }

    public /* synthetic */ YandexBannerItem(String str, long j12, com.avito.android.advertising.loaders.yandex.a aVar, int i12, AdViewType adViewType, SerpDisplayType serpDisplayType, boolean z12, boolean z13, BannerInfo bannerInfo, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? str.hashCode() : j12, aVar, i12, adViewType, serpDisplayType, (i13 & 64) != 0 ? false : z12, (i13 & 128) != 0 ? false : z13, bannerInfo);
    }
}
