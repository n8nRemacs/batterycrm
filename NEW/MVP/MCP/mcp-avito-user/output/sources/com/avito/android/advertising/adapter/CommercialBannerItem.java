package com.avito.android.advertising.adapter;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.remote.model.AdSize;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpElement;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ob.C44744h;
import pb.InterfaceC47045a;
import pb.InterfaceC47047c;
import pb.e;

/* compiled from: CommercialBannerItem.kt */
@d
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BM\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\"\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b9\u0010(R\u0016\u0010;\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010(R$\u0010?\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b=\u0010#\"\u0004\b>\u0010%R\u0014\u0010A\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010BR\u0014\u0010E\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0011\u0010F\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bF\u0010BR\u0011\u0010G\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bG\u0010BR\u0011\u0010H\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bH\u0010BR\u0011\u0010I\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bI\u0010B¨\u0006J"}, d2 = {"Lcom/avito/android/advertising/adapter/CommercialBannerItem;", "Lcom/avito/android/remote/model/SerpElement;", "Lpb/c;", "Lpb/e;", "Lpb/a;", "", "id", "", "stringId", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "adViewType", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "", "spanCount", "Lcom/avito/android/remote/model/AdSize;", "adSize", "Lcom/avito/android/advertising/CommercialBanner;", "commercialBanner", "bannerCode", "<init>", "(JLjava/lang/String;Lcom/avito/android/advertising/adapter/items/AdViewType;Lcom/avito/android/remote/model/SerpDisplayType;ILcom/avito/android/remote/model/AdSize;Lcom/avito/android/advertising/CommercialBanner;Ljava/lang/String;)V", AdFormat.BANNER, "copyWithCommercialBanner", "(Lcom/avito/android/advertising/CommercialBanner;)Lcom/avito/android/advertising/adapter/CommercialBannerItem;", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "()J", "setId", "(J)V", "Ljava/lang/String;", "getStringId", "()Ljava/lang/String;", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "getAdViewType", "()Lcom/avito/android/advertising/adapter/items/AdViewType;", "Lcom/avito/android/remote/model/SerpDisplayType;", "getDisplayType", "()Lcom/avito/android/remote/model/SerpDisplayType;", "setDisplayType", "(Lcom/avito/android/remote/model/SerpDisplayType;)V", "I", "getSpanCount", "Lcom/avito/android/remote/model/AdSize;", "getAdSize", "()Lcom/avito/android/remote/model/AdSize;", "Lcom/avito/android/advertising/CommercialBanner;", "getCommercialBanner", "()Lcom/avito/android/advertising/CommercialBanner;", "getBannerCode", "getResultBannerCode", "resultBannerCode", "value", "getUniqueId", "setUniqueId", "uniqueId", "", "isLoaded", "()Z", "isEmpty", "getHasNotLoadedAd", "hasNotLoadedAd", "isProfilePromo", "isRootPosition", "isProfilePromoGallery", "isMediaX2", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class CommercialBannerItem implements SerpElement, InterfaceC47047c, e, InterfaceC47045a {

    @k
    public static final Parcelable.Creator<CommercialBannerItem> CREATOR = new a();

    @k
    private final AdSize adSize;

    @k
    private final AdViewType adViewType;

    @l
    private final String bannerCode;

    @l
    private final CommercialBanner commercialBanner;

    @k
    private SerpDisplayType displayType;
    private long id;
    private final int spanCount;

    @k
    private final String stringId;

    /* compiled from: CommercialBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CommercialBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final CommercialBannerItem createFromParcel(Parcel parcel) {
            return new CommercialBannerItem(parcel.readLong(), parcel.readString(), AdViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt(), AdSize.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CommercialBanner.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommercialBannerItem[] newArray(int i12) {
            return new CommercialBannerItem[i12];
        }
    }

    public CommercialBannerItem(long j12, @k String str, @k AdViewType adViewType, @k SerpDisplayType serpDisplayType, int i12, @k AdSize adSize, @l CommercialBanner commercialBanner, @l String str2) {
        this.id = j12;
        this.stringId = str;
        this.adViewType = adViewType;
        this.displayType = serpDisplayType;
        this.spanCount = i12;
        this.adSize = adSize;
        this.commercialBanner = commercialBanner;
        this.bannerCode = str2;
    }

    private final String getResultBannerCode() {
        String strA;
        CommercialBanner commercialBanner = this.commercialBanner;
        return (commercialBanner == null || (strA = C44744h.a(commercialBanner)) == null) ? this.bannerCode : strA;
    }

    @k
    public final CommercialBannerItem copyWithCommercialBanner(@l CommercialBanner banner) {
        return new CommercialBannerItem(getF84654b(), getF87487b(), getAdViewType(), getDisplayType(), getSpanCount(), this.adSize, banner, null, 128, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final AdSize getAdSize() {
        return this.adSize;
    }

    @Override // pb.e
    @k
    public AdViewType getAdViewType() {
        return this.adViewType;
    }

    @l
    public final String getBannerCode() {
        return this.bannerCode;
    }

    @l
    public final CommercialBanner getCommercialBanner() {
        return this.commercialBanner;
    }

    @k
    public SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    @Override // pb.InterfaceC47045a
    public boolean getHasNotLoadedAd() {
        CommercialBanner commercialBanner;
        return (isEmpty() || (commercialBanner = this.commercialBanner) == null || commercialBanner.d()) ? false : true;
    }

    @Override // TV0.a
    public long getId() {
        return this.id;
    }

    public int getSpanCount() {
        return this.spanCount;
    }

    @Override // com.avito.conveyor_item.a
    @k
    public String getStringId() {
        return this.stringId;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return getId();
    }

    public boolean isEmpty() {
        return this.commercialBanner == null;
    }

    public boolean isLoaded() {
        CommercialBanner commercialBanner = this.commercialBanner;
        return commercialBanner != null && commercialBanner.d();
    }

    public final boolean isMediaX2() {
        return L.f(getResultBannerCode(), "root_widget_android") || L.f(getResultBannerCode(), "top_main_widget_android");
    }

    public final boolean isProfilePromo() {
        return L.f(getResultBannerCode(), "promo_root_poster_android");
    }

    public final boolean isProfilePromoGallery() {
        return L.f(getResultBannerCode(), "promo_item_gallery_android");
    }

    public final boolean isRootPosition() {
        return L.f(getResultBannerCode(), "root_rnd_android") || L.f(getResultBannerCode(), "root_top_android");
    }

    public void setDisplayType(@k SerpDisplayType serpDisplayType) {
        this.displayType = serpDisplayType;
    }

    public void setId(long j12) {
        this.id = j12;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        setId(j12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeLong(this.id);
        parcel.writeString(this.stringId);
        parcel.writeString(this.adViewType.name());
        parcel.writeString(this.displayType.name());
        parcel.writeInt(this.spanCount);
        parcel.writeString(this.adSize.name());
        CommercialBanner commercialBanner = this.commercialBanner;
        if (commercialBanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commercialBanner.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.bannerCode);
    }

    public /* synthetic */ CommercialBannerItem(long j12, String str, AdViewType adViewType, SerpDisplayType serpDisplayType, int i12, AdSize adSize, CommercialBanner commercialBanner, String str2, int i13, C42822w c42822w) {
        this(j12, str, adViewType, serpDisplayType, i12, adSize, commercialBanner, (i13 & 128) != 0 ? null : str2);
    }
}
