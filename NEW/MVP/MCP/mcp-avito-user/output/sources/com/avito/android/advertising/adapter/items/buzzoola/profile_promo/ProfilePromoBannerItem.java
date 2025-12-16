package com.avito.android.advertising.adapter.items.buzzoola.profile_promo;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advertising.CommercialItem;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.h;
import com.avito.android.advertising.i;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.D;
import com.avito.android.advertising.loaders.InterfaceC28345a;
import com.avito.android.grid.GridElementType;
import com.avito.android.remote.model.SerpDisplayType;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import pb.InterfaceC47047c;
import pb.e;

/* compiled from: ProfilePromoBannerItem.kt */
@d
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006BP\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000b\u0010\r\u001a\u00070\u000b¢\u0006\u0002\b\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u001f\u0010\r\u001a\u00070\u000b¢\u0006\u0002\b\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u0010\u001eR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102R\"\u0010\u0013\u001a\u00020\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u0015\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u00108\u001a\u0004\b\u0015\u00109\"\u0004\b:\u0010;R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010C\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bB\u0010\u001e¨\u0006D"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/profile_promo/ProfilePromoBannerItem;", "Lcom/avito/android/advertising/CommercialItem;", "Lpb/e;", "Lpb/c;", "Lcom/avito/android/advertising/loaders/a;", "Lcom/avito/android/advertising/i;", "Lcom/avito/android/advertising/h;", "", "stringId", "", "id", "Lcom/avito/android/advertising/loaders/D;", "LK51/e;", AdFormat.BANNER, "", "spanCount", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "adViewType", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "", "isHidden", "Lcom/avito/android/advertising/loaders/BannerInfo;", "bannerInfo", "<init>", "(Ljava/lang/String;JLcom/avito/android/advertising/loaders/D;ILcom/avito/android/advertising/adapter/items/AdViewType;Lcom/avito/android/remote/model/SerpDisplayType;ZLcom/avito/android/advertising/loaders/BannerInfo;)V", "newIsHidden", "copyWithIsHidden", "(Z)Lcom/avito/android/advertising/adapter/items/buzzoola/profile_promo/ProfilePromoBannerItem;", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStringId", "()Ljava/lang/String;", "J", "getId", "()J", "Lcom/avito/android/advertising/loaders/D;", "getBanner", "()Lcom/avito/android/advertising/loaders/D;", "I", "getSpanCount", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "getAdViewType", "()Lcom/avito/android/advertising/adapter/items/AdViewType;", "Lcom/avito/android/remote/model/SerpDisplayType;", "getDisplayType", "()Lcom/avito/android/remote/model/SerpDisplayType;", "setDisplayType", "(Lcom/avito/android/remote/model/SerpDisplayType;)V", "Z", "()Z", "setHidden", "(Z)V", "Lcom/avito/android/advertising/loaders/BannerInfo;", "getBannerInfo", "()Lcom/avito/android/advertising/loaders/BannerInfo;", "getHideId", "()Ljava/lang/Integer;", "hideId", "getCreativeId", "creativeId", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class ProfilePromoBannerItem implements CommercialItem, e, InterfaceC47047c, InterfaceC28345a, i, h {

    @k
    public static final Parcelable.Creator<ProfilePromoBannerItem> CREATOR = new a();

    @k
    private final AdViewType adViewType;

    @k
    private final D banner;

    @k
    private final BannerInfo bannerInfo;

    @k
    private SerpDisplayType displayType;
    private final long id;
    private boolean isHidden;
    private final int spanCount;

    @k
    private final String stringId;

    /* compiled from: ProfilePromoBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfilePromoBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfilePromoBannerItem createFromParcel(Parcel parcel) {
            return new ProfilePromoBannerItem(parcel.readString(), parcel.readLong(), (D) parcel.readValue(ProfilePromoBannerItem.class.getClassLoader()), parcel.readInt(), AdViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt() != 0, BannerInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ProfilePromoBannerItem[] newArray(int i12) {
            return new ProfilePromoBannerItem[i12];
        }
    }

    public ProfilePromoBannerItem(@k String str, long j12, @k D d12, int i12, @k AdViewType adViewType, @k SerpDisplayType serpDisplayType, boolean z12, @k BannerInfo bannerInfo) {
        this.stringId = str;
        this.id = j12;
        this.banner = d12;
        this.spanCount = i12;
        this.adViewType = adViewType;
        this.displayType = serpDisplayType;
        this.isHidden = z12;
        this.bannerInfo = bannerInfo;
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

    public final int getCreativeId() {
        return getBanner().T().intValue();
    }

    @k
    public SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public GridElementType getF154284c() {
        return GridElementType.FullWidth.f161209b;
    }

    @Override // com.avito.android.advertising.i
    @k
    public Integer getHideId() {
        return Integer.valueOf(getCreativeId());
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public long getF78903b() {
        return this.id;
    }

    public int getSpanCount() {
        return this.spanCount;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public String getF78904c() {
        return this.stringId;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId */
    public long getF285041o() {
        return getBannerInfo().getF285041o();
    }

    @Override // com.avito.android.advertising.CommercialItem
    public boolean isContentEqualWith(@k Object obj) {
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

    public void setDisplayType(@k SerpDisplayType serpDisplayType) {
        this.displayType = serpDisplayType;
    }

    @Override // com.avito.android.advertising.i
    public void setHidden(boolean z12) {
        this.isHidden = z12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.stringId);
        parcel.writeLong(this.id);
        parcel.writeValue(this.banner);
        parcel.writeInt(this.spanCount);
        parcel.writeString(this.adViewType.name());
        parcel.writeString(this.displayType.name());
        parcel.writeInt(this.isHidden ? 1 : 0);
        this.bannerInfo.writeToParcel(parcel, flags);
    }

    @Override // com.avito.android.advertising.i
    @k
    public ProfilePromoBannerItem copyWithIsHidden(boolean newIsHidden) {
        return new ProfilePromoBannerItem(getF78904c(), getF78903b(), getBanner(), getSpanCount(), getAdViewType(), getDisplayType(), newIsHidden, getBannerInfo());
    }

    @Override // com.avito.android.advertising.h
    @k
    public D getBanner() {
        return this.banner;
    }

    public /* synthetic */ ProfilePromoBannerItem(String str, long j12, D d12, int i12, AdViewType adViewType, SerpDisplayType serpDisplayType, boolean z12, BannerInfo bannerInfo, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? str.hashCode() : j12, d12, i12, adViewType, serpDisplayType, (i13 & 64) != 0 ? false : z12, bannerInfo);
    }
}
