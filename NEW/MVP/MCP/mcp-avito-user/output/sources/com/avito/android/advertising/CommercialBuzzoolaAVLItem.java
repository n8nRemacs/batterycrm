package com.avito.android.advertising;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advertising.CommercialItem;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.InterfaceC28345a;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CommercialItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advertising/CommercialBuzzoolaAVLItem;", "Lcom/avito/android/advertising/CommercialItem;", "Lcom/avito/android/advertising/i;", "Lcom/avito/android/advertising/loaders/a;", "Lcom/avito/android/advertising/h;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CommercialBuzzoolaAVLItem implements CommercialItem, i, InterfaceC28345a, h {

    @Y61.k
    public static final Parcelable.Creator<CommercialBuzzoolaAVLItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f86893b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final BuzzoolaBanner.BuzzoolaAVL f86894c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final BannerInfo f86895d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f86896e;

    /* compiled from: CommercialItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CommercialBuzzoolaAVLItem> {
        @Override // android.os.Parcelable.Creator
        public final CommercialBuzzoolaAVLItem createFromParcel(Parcel parcel) {
            return new CommercialBuzzoolaAVLItem(parcel.readString(), BuzzoolaBanner.BuzzoolaAVL.CREATOR.createFromParcel(parcel), BannerInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CommercialBuzzoolaAVLItem[] newArray(int i12) {
            return new CommercialBuzzoolaAVLItem[i12];
        }
    }

    public CommercialBuzzoolaAVLItem(@Y61.k String str, @Y61.k BuzzoolaBanner.BuzzoolaAVL buzzoolaAVL, @Y61.k BannerInfo bannerInfo, boolean z12) {
        this.f86893b = str;
        this.f86894c = buzzoolaAVL;
        this.f86895d = bannerInfo;
        this.f86896e = z12;
    }

    @Override // com.avito.android.advertising.i
    public final i copyWithIsHidden(boolean z12) {
        return new CommercialBuzzoolaAVLItem(this.f86893b, this.f86894c, this.f86895d, true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommercialBuzzoolaAVLItem)) {
            return false;
        }
        CommercialBuzzoolaAVLItem commercialBuzzoolaAVLItem = (CommercialBuzzoolaAVLItem) obj;
        return L.f(this.f86893b, commercialBuzzoolaAVLItem.f86893b) && L.f(this.f86894c, commercialBuzzoolaAVLItem.f86894c) && L.f(this.f86895d, commercialBuzzoolaAVLItem.f86895d) && this.f86896e == commercialBuzzoolaAVLItem.f86896e;
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28345a
    public final int getArea() {
        return getBannerInfo().f87891v;
    }

    @Override // com.avito.android.advertising.h
    public final b getBanner() {
        return this.f86894c;
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28345a
    @Y61.k
    public final BannerInfo getBannerInfo() {
        return this.f86895d;
    }

    @Override // QH.a
    @Y61.k
    /* renamed from: getGridType */
    public final GridElementType getF152077c() {
        return GridElementType.FullWidth.f161209b;
    }

    @Override // com.avito.android.advertising.i
    @Y61.l
    public final Integer getHideId() {
        return null;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80368b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF80369c() {
        return this.f86893b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId */
    public final long getF270085i() {
        return getBannerInfo().getF270085i();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86896e) + ((this.f86895d.hashCode() + ((this.f86894c.hashCode() + (this.f86893b.hashCode() * 31)) * 31)) * 31);
    }

    @Override // com.avito.android.advertising.CommercialItem
    public final boolean isContentEqualWith(@Y61.k Object obj) {
        return CommercialItem.a.a(this, obj);
    }

    @Override // com.avito.android.advertising.i
    /* renamed from: isHidden, reason: from getter */
    public final boolean getIsHidden() {
        return this.f86896e;
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28345a
    public final void setArea(int i12) {
        getBannerInfo().f87891v = i12;
    }

    @Override // com.avito.android.advertising.i
    public final void setHidden(boolean z12) {
        this.f86896e = z12;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommercialBuzzoolaAVLItem(stringId=");
        sb2.append(this.f86893b);
        sb2.append(", banner=");
        sb2.append(this.f86894c);
        sb2.append(", bannerInfo=");
        sb2.append(this.f86895d);
        sb2.append(", isHidden=");
        return androidx.appcompat.app.r.x(sb2, this.f86896e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f86893b);
        this.f86894c.writeToParcel(parcel, i12);
        this.f86895d.writeToParcel(parcel, i12);
        parcel.writeInt(this.f86896e ? 1 : 0);
    }

    public /* synthetic */ CommercialBuzzoolaAVLItem(String str, BuzzoolaBanner.BuzzoolaAVL buzzoolaAVL, BannerInfo bannerInfo, boolean z12, int i12, C42822w c42822w) {
        this(str, buzzoolaAVL, bannerInfo, (i12 & 8) != 0 ? false : z12);
    }
}
