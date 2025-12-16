package com.avito.android.advertising.adapter.items.buzzoola.video;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advertising.CommercialItem;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.C;
import com.avito.android.advertising.loaders.InterfaceC28345a;
import com.avito.android.grid.GridElementType;
import com.avito.android.remote.model.SerpDisplayType;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import pb.InterfaceC47047c;

/* compiled from: CommercialVideoBannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005BL\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000b\u0010\f\u001a\u00070\n¢\u0006\u0002\b\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\f\u001a\u00070\n¢\u0006\u0002\b\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\b3\u00104R\u001d\u00105\u001a\u00020\u00068\u0006¢\u0006\u0012\n\u0004\b5\u0010\u001f\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010!R\u0011\u0010<\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/video/CommercialVideoBannerItem;", "Lcom/avito/android/advertising/CommercialItem;", "Lpb/e;", "Lpb/c;", "Lcom/avito/android/advertising/loaders/a;", "Lcom/avito/android/advertising/h;", "", "stringId", "", "id", "Lcom/avito/android/advertising/loaders/C;", "LK51/e;", AdFormat.BANNER, "", "spanCount", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "adViewType", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "Lcom/avito/android/advertising/loaders/BannerInfo;", "bannerInfo", "<init>", "(Ljava/lang/String;JLcom/avito/android/advertising/loaders/C;ILcom/avito/android/advertising/adapter/items/AdViewType;Lcom/avito/android/remote/model/SerpDisplayType;Lcom/avito/android/advertising/loaders/BannerInfo;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStringId", "()Ljava/lang/String;", "J", "getId", "()J", "Lcom/avito/android/advertising/loaders/C;", "getBanner", "()Lcom/avito/android/advertising/loaders/C;", "I", "getSpanCount", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "getAdViewType", "()Lcom/avito/android/advertising/adapter/items/AdViewType;", "Lcom/avito/android/remote/model/SerpDisplayType;", "getDisplayType", "()Lcom/avito/android/remote/model/SerpDisplayType;", "setDisplayType", "(Lcom/avito/android/remote/model/SerpDisplayType;)V", "Lcom/avito/android/advertising/loaders/BannerInfo;", "getBannerInfo", "()Lcom/avito/android/advertising/loaders/BannerInfo;", "videoUrlString", "getVideoUrlString", "getVideoUrlString$annotations", "()V", "Landroid/net/Uri;", "getVideo", "()Landroid/net/Uri;", "video", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class CommercialVideoBannerItem implements CommercialItem, pb.e, InterfaceC47047c, InterfaceC28345a, com.avito.android.advertising.h {

    @Y61.k
    public static final Parcelable.Creator<CommercialVideoBannerItem> CREATOR = new a();

    @Y61.k
    private final AdViewType adViewType;

    @Y61.k
    private final C banner;

    @Y61.k
    private final BannerInfo bannerInfo;

    @Y61.k
    private SerpDisplayType displayType;
    private final long id;
    private final int spanCount;

    @Y61.k
    private final String stringId;

    @Y61.k
    private final String videoUrlString;

    /* compiled from: CommercialVideoBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CommercialVideoBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final CommercialVideoBannerItem createFromParcel(Parcel parcel) {
            return new CommercialVideoBannerItem(parcel.readString(), parcel.readLong(), (C) parcel.readValue(CommercialVideoBannerItem.class.getClassLoader()), parcel.readInt(), AdViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), BannerInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CommercialVideoBannerItem[] newArray(int i12) {
            return new CommercialVideoBannerItem[i12];
        }
    }

    public CommercialVideoBannerItem(@Y61.k String str, long j12, @Y61.k C c12, int i12, @Y61.k AdViewType adViewType, @Y61.k SerpDisplayType serpDisplayType, @Y61.k BannerInfo bannerInfo) {
        this.stringId = str;
        this.id = j12;
        this.banner = c12;
        this.spanCount = i12;
        this.adViewType = adViewType;
        this.displayType = serpDisplayType;
        this.bannerInfo = bannerInfo;
        this.videoUrlString = getVideo().toString();
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

    @Override // QH.a
    @Y61.k
    /* renamed from: getGridType */
    public GridElementType getF154209c() {
        return GridElementType.FullWidth.f161209b;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public long getF83054c() {
        return this.id;
    }

    public int getSpanCount() {
        return this.spanCount;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public String getF79191b() {
        return this.stringId;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId */
    public long getF273038j() {
        return getBannerInfo().getF273038j();
    }

    @Y61.k
    public final Uri getVideo() {
        return getBanner().getF88021i();
    }

    @Y61.k
    public final String getVideoUrlString() {
        return this.videoUrlString;
    }

    @Override // com.avito.android.advertising.CommercialItem
    public boolean isContentEqualWith(@Y61.k Object obj) {
        return CommercialItem.a.a(this, obj);
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28345a
    public void setArea(int i12) {
        getBannerInfo().f87891v = i12;
    }

    public void setDisplayType(@Y61.k SerpDisplayType serpDisplayType) {
        this.displayType = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.stringId);
        parcel.writeLong(this.id);
        parcel.writeValue(this.banner);
        parcel.writeInt(this.spanCount);
        parcel.writeString(this.adViewType.name());
        parcel.writeString(this.displayType.name());
        this.bannerInfo.writeToParcel(parcel, flags);
    }

    @Override // com.avito.android.advertising.h
    @Y61.k
    public C getBanner() {
        return this.banner;
    }

    public /* synthetic */ CommercialVideoBannerItem(String str, long j12, C c12, int i12, AdViewType adViewType, SerpDisplayType serpDisplayType, BannerInfo bannerInfo, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? str.hashCode() : j12, c12, (i13 & 8) != 0 ? 1 : i12, (i13 & 16) != 0 ? AdViewType.f86910d : adViewType, (i13 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, bannerInfo);
    }

    public static /* synthetic */ void getVideoUrlString$annotations() {
    }
}
