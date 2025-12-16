package com.avito.android.advertising.adapter.items.buzzoola;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advertising.CommercialItem;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.loaders.B;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.InterfaceC28345a;
import com.avito.android.grid.GridElementType;
import com.avito.android.remote.model.SerpDisplayType;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import pb.InterfaceC47046b;
import pb.InterfaceC47047c;

/* compiled from: CommercialHtmlBannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005BV\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000b\u0010\u0016\u001a\u00070\u0014¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010\u001aR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\"\u0010\u000f\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u0011\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108R\u001f\u0010\u0016\u001a\u00070\u0014¢\u0006\u0002\b\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/CommercialHtmlBannerItem;", "Lcom/avito/android/advertising/CommercialItem;", "Lpb/b;", "Lpb/c;", "Lcom/avito/android/advertising/loaders/a;", "Lcom/avito/android/advertising/h;", "", "stringId", "", "id", "", "spanCount", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "adViewType", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "", "fullSize", "Lcom/avito/android/advertising/loaders/BannerInfo;", "bannerInfo", "Lcom/avito/android/advertising/loaders/B;", "LK51/e;", AdFormat.BANNER, "<init>", "(Ljava/lang/String;JILcom/avito/android/advertising/adapter/items/AdViewType;Lcom/avito/android/remote/model/SerpDisplayType;ZLcom/avito/android/advertising/loaders/BannerInfo;Lcom/avito/android/advertising/loaders/B;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStringId", "()Ljava/lang/String;", "J", "getId", "()J", "I", "getSpanCount", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "getAdViewType", "()Lcom/avito/android/advertising/adapter/items/AdViewType;", "Lcom/avito/android/remote/model/SerpDisplayType;", "getDisplayType", "()Lcom/avito/android/remote/model/SerpDisplayType;", "setDisplayType", "(Lcom/avito/android/remote/model/SerpDisplayType;)V", "Z", "getFullSize", "()Z", "setFullSize", "(Z)V", "Lcom/avito/android/advertising/loaders/BannerInfo;", "getBannerInfo", "()Lcom/avito/android/advertising/loaders/BannerInfo;", "Lcom/avito/android/advertising/loaders/B;", "getBanner", "()Lcom/avito/android/advertising/loaders/B;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class CommercialHtmlBannerItem implements CommercialItem, InterfaceC47046b, InterfaceC47047c, InterfaceC28345a, com.avito.android.advertising.h {

    @Y61.k
    public static final Parcelable.Creator<CommercialHtmlBannerItem> CREATOR = new a();

    @Y61.k
    private final AdViewType adViewType;

    @Y61.k
    private final B banner;

    @Y61.k
    private final BannerInfo bannerInfo;

    @Y61.k
    private SerpDisplayType displayType;
    private boolean fullSize;
    private final long id;
    private final int spanCount;

    @Y61.k
    private final String stringId;

    /* compiled from: CommercialHtmlBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CommercialHtmlBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final CommercialHtmlBannerItem createFromParcel(Parcel parcel) {
            return new CommercialHtmlBannerItem(parcel.readString(), parcel.readLong(), parcel.readInt(), AdViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt() != 0, BannerInfo.CREATOR.createFromParcel(parcel), (B) parcel.readValue(CommercialHtmlBannerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CommercialHtmlBannerItem[] newArray(int i12) {
            return new CommercialHtmlBannerItem[i12];
        }
    }

    public CommercialHtmlBannerItem(@Y61.k String str, long j12, int i12, @Y61.k AdViewType adViewType, @Y61.k SerpDisplayType serpDisplayType, boolean z12, @Y61.k BannerInfo bannerInfo, @Y61.k B b12) {
        this.stringId = str;
        this.id = j12;
        this.spanCount = i12;
        this.adViewType = adViewType;
        this.displayType = serpDisplayType;
        this.fullSize = z12;
        this.bannerInfo = bannerInfo;
        this.banner = b12;
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
        return getF74925c().f87891v;
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28345a
    @Y61.k
    /* renamed from: getBannerInfo, reason: from getter */
    public BannerInfo getF74925c() {
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

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public long getF77832b() {
        return this.id;
    }

    public int getSpanCount() {
        return this.spanCount;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public String getF77833c() {
        return this.stringId;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId */
    public long getF136232f() {
        return getF74925c().getF136232f();
    }

    @Override // com.avito.android.advertising.CommercialItem
    public boolean isContentEqualWith(@Y61.k Object obj) {
        return CommercialItem.a.a(this, obj);
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28345a
    public void setArea(int i12) {
        getF74925c().f87891v = i12;
    }

    public void setDisplayType(@Y61.k SerpDisplayType serpDisplayType) {
        this.displayType = serpDisplayType;
    }

    public void setFullSize(boolean z12) {
        this.fullSize = z12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.stringId);
        parcel.writeLong(this.id);
        parcel.writeInt(this.spanCount);
        parcel.writeString(this.adViewType.name());
        parcel.writeString(this.displayType.name());
        parcel.writeInt(this.fullSize ? 1 : 0);
        this.bannerInfo.writeToParcel(parcel, flags);
        parcel.writeValue(this.banner);
    }

    @Override // com.avito.android.advertising.h
    @Y61.k
    public B getBanner() {
        return this.banner;
    }

    public /* synthetic */ CommercialHtmlBannerItem(String str, long j12, int i12, AdViewType adViewType, SerpDisplayType serpDisplayType, boolean z12, BannerInfo bannerInfo, B b12, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? str.hashCode() : j12, (i13 & 4) != 0 ? 1 : i12, (i13 & 8) != 0 ? AdViewType.f86910d : adViewType, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? false : z12, bannerInfo, b12);
    }
}
