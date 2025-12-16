package com.avito.android.advertising.adapter.items.buzzoola;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advertising.CommercialItem;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.InterfaceC28345a;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.grid.GridElementType;
import com.avito.android.remote.model.SerpDisplayType;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import pb.InterfaceC47046b;
import pb.InterfaceC47047c;

/* compiled from: BuzzoolaDirectBannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006BU\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u0014\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0015\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u00108\u001a\u0004\b\u0015\u0010:\"\u0004\b=\u0010<R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010C\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/BuzzoolaDirectBannerItem;", "Lcom/avito/android/advertising/CommercialItem;", "Lpb/b;", "Lpb/c;", "Lcom/avito/android/advertising/loaders/a;", "Lcom/avito/android/advertising/h;", "Lcom/avito/android/advertising/i;", "", "stringId", "", "id", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaDirect;", AdFormat.BANNER, "", "spanCount", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "adViewType", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "", "fullSize", "isHidden", "Lcom/avito/android/advertising/loaders/BannerInfo;", "bannerInfo", "<init>", "(Ljava/lang/String;JLcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaDirect;ILcom/avito/android/advertising/adapter/items/AdViewType;Lcom/avito/android/remote/model/SerpDisplayType;ZZLcom/avito/android/advertising/loaders/BannerInfo;)V", "newIsHidden", "copyWithIsHidden", "(Z)Lcom/avito/android/advertising/adapter/items/buzzoola/BuzzoolaDirectBannerItem;", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStringId", "()Ljava/lang/String;", "J", "getId", "()J", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaDirect;", "getBanner", "()Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaDirect;", "I", "getSpanCount", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "getAdViewType", "()Lcom/avito/android/advertising/adapter/items/AdViewType;", "Lcom/avito/android/remote/model/SerpDisplayType;", "getDisplayType", "()Lcom/avito/android/remote/model/SerpDisplayType;", "setDisplayType", "(Lcom/avito/android/remote/model/SerpDisplayType;)V", "Z", "getFullSize", "()Z", "setFullSize", "(Z)V", "setHidden", "Lcom/avito/android/advertising/loaders/BannerInfo;", "getBannerInfo", "()Lcom/avito/android/advertising/loaders/BannerInfo;", "getHideId", "()Ljava/lang/Integer;", "hideId", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class BuzzoolaDirectBannerItem implements CommercialItem, InterfaceC47046b, InterfaceC47047c, InterfaceC28345a, com.avito.android.advertising.h, com.avito.android.advertising.i {

    @Y61.k
    public static final Parcelable.Creator<BuzzoolaDirectBannerItem> CREATOR = new a();

    @Y61.k
    private final AdViewType adViewType;

    @Y61.k
    private final BuzzoolaBanner.BuzzoolaDirect banner;

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

    /* compiled from: BuzzoolaDirectBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BuzzoolaDirectBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final BuzzoolaDirectBannerItem createFromParcel(Parcel parcel) {
            return new BuzzoolaDirectBannerItem(parcel.readString(), parcel.readLong(), BuzzoolaBanner.BuzzoolaDirect.CREATOR.createFromParcel(parcel), parcel.readInt(), AdViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, BannerInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BuzzoolaDirectBannerItem[] newArray(int i12) {
            return new BuzzoolaDirectBannerItem[i12];
        }
    }

    public BuzzoolaDirectBannerItem(@Y61.k String str, long j12, @Y61.k BuzzoolaBanner.BuzzoolaDirect buzzoolaDirect, int i12, @Y61.k AdViewType adViewType, @Y61.k SerpDisplayType serpDisplayType, boolean z12, boolean z13, @Y61.k BannerInfo bannerInfo) {
        this.stringId = str;
        this.id = j12;
        this.banner = buzzoolaDirect;
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
    public GridElementType getF152077c() {
        return GridElementType.FullWidth.f161209b;
    }

    @Override // com.avito.android.advertising.i
    @Y61.l
    public Integer getHideId() {
        return getBanner().T();
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public long getF269870b() {
        return this.id;
    }

    public int getSpanCount() {
        return this.spanCount;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public String getF269871c() {
        return this.stringId;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId */
    public long getF269877i() {
        return getBannerInfo().getF269877i();
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
        this.banner.writeToParcel(parcel, flags);
        parcel.writeInt(this.spanCount);
        parcel.writeString(this.adViewType.name());
        parcel.writeString(this.displayType.name());
        parcel.writeInt(this.fullSize ? 1 : 0);
        parcel.writeInt(this.isHidden ? 1 : 0);
        this.bannerInfo.writeToParcel(parcel, flags);
    }

    @Override // com.avito.android.advertising.i
    @Y61.k
    public BuzzoolaDirectBannerItem copyWithIsHidden(boolean newIsHidden) {
        return new BuzzoolaDirectBannerItem(getF269871c(), getF269870b(), getBanner(), getSpanCount(), getAdViewType(), getDisplayType(), getFullSize(), newIsHidden, getBannerInfo());
    }

    @Override // com.avito.android.advertising.h
    @Y61.k
    public BuzzoolaBanner.BuzzoolaDirect getBanner() {
        return this.banner;
    }

    public /* synthetic */ BuzzoolaDirectBannerItem(String str, long j12, BuzzoolaBanner.BuzzoolaDirect buzzoolaDirect, int i12, AdViewType adViewType, SerpDisplayType serpDisplayType, boolean z12, boolean z13, BannerInfo bannerInfo, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? str.hashCode() : j12, buzzoolaDirect, i12, adViewType, serpDisplayType, (i13 & 64) != 0 ? false : z12, (i13 & 128) != 0 ? false : z13, bannerInfo);
    }
}
