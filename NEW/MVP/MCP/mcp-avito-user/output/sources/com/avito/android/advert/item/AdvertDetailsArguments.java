package com.avito.android.advert.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advert_multi_items.AdvertDetailsMultiItemState;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.rec.ScreenSource;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsArguments.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/AdvertDetailsArguments;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f71312b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f71313c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f71314d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AdvertDetailsFastOpenParams f71315e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final TreeClickStreamParent f71316f;

    /* renamed from: g, reason: collision with root package name */
    public final long f71317g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Integer f71318h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ScreenSource f71319i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f71320j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsMultiItemState f71321k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f71322l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final Parcelable f71323m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final PreloadCacheKey f71324n;

    /* compiled from: AdvertDetailsArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsArguments> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsArguments createFromParcel(Parcel parcel) {
            return new AdvertDetailsArguments(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), AdvertDetailsFastOpenParams.CREATOR.createFromParcel(parcel), (TreeClickStreamParent) parcel.readParcelable(AdvertDetailsArguments.class.getClassLoader()), parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (ScreenSource) parcel.readParcelable(AdvertDetailsArguments.class.getClassLoader()), parcel.readString(), (AdvertDetailsMultiItemState) parcel.readParcelable(AdvertDetailsArguments.class.getClassLoader()), parcel.readString(), parcel.readParcelable(AdvertDetailsArguments.class.getClassLoader()), parcel.readInt() != 0 ? PreloadCacheKey.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsArguments[] newArray(int i12) {
            return new AdvertDetailsArguments[i12];
        }
    }

    public AdvertDetailsArguments(@Y61.k String str, @Y61.l Integer num, @Y61.l String str2, @Y61.k AdvertDetailsFastOpenParams advertDetailsFastOpenParams, @Y61.l TreeClickStreamParent treeClickStreamParent, long j12, @Y61.l Integer num2, @Y61.k ScreenSource screenSource, @Y61.l String str3, @Y61.l AdvertDetailsMultiItemState advertDetailsMultiItemState, @Y61.l String str4, @Y61.l Parcelable parcelable, @Y61.l PreloadCacheKey preloadCacheKey) {
        this.f71312b = str;
        this.f71313c = num;
        this.f71314d = str2;
        this.f71315e = advertDetailsFastOpenParams;
        this.f71316f = treeClickStreamParent;
        this.f71317g = j12;
        this.f71318h = num2;
        this.f71319i = screenSource;
        this.f71320j = str3;
        this.f71321k = advertDetailsMultiItemState;
        this.f71322l = str4;
        this.f71323m = parcelable;
        this.f71324n = preloadCacheKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsArguments)) {
            return false;
        }
        AdvertDetailsArguments advertDetailsArguments = (AdvertDetailsArguments) obj;
        return kotlin.jvm.internal.L.f(this.f71312b, advertDetailsArguments.f71312b) && kotlin.jvm.internal.L.f(this.f71313c, advertDetailsArguments.f71313c) && kotlin.jvm.internal.L.f(this.f71314d, advertDetailsArguments.f71314d) && kotlin.jvm.internal.L.f(this.f71315e, advertDetailsArguments.f71315e) && kotlin.jvm.internal.L.f(this.f71316f, advertDetailsArguments.f71316f) && this.f71317g == advertDetailsArguments.f71317g && kotlin.jvm.internal.L.f(this.f71318h, advertDetailsArguments.f71318h) && kotlin.jvm.internal.L.f(this.f71319i, advertDetailsArguments.f71319i) && kotlin.jvm.internal.L.f(this.f71320j, advertDetailsArguments.f71320j) && kotlin.jvm.internal.L.f(this.f71321k, advertDetailsArguments.f71321k) && kotlin.jvm.internal.L.f(this.f71322l, advertDetailsArguments.f71322l) && kotlin.jvm.internal.L.f(this.f71323m, advertDetailsArguments.f71323m) && kotlin.jvm.internal.L.f(this.f71324n, advertDetailsArguments.f71324n);
    }

    public final int hashCode() {
        int iHashCode = this.f71312b.hashCode() * 31;
        Integer num = this.f71313c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f71314d;
        int iHashCode3 = (this.f71315e.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        TreeClickStreamParent treeClickStreamParent = this.f71316f;
        int iG2 = androidx.appcompat.app.r.g((iHashCode3 + (treeClickStreamParent == null ? 0 : treeClickStreamParent.hashCode())) * 31, 31, this.f71317g);
        Integer num2 = this.f71318h;
        int iHashCode4 = (this.f71319i.hashCode() + ((iG2 + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31;
        String str2 = this.f71320j;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AdvertDetailsMultiItemState advertDetailsMultiItemState = this.f71321k;
        int iHashCode6 = (iHashCode5 + (advertDetailsMultiItemState == null ? 0 : advertDetailsMultiItemState.hashCode())) * 31;
        String str3 = this.f71322l;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Parcelable parcelable = this.f71323m;
        int iHashCode8 = (iHashCode7 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        PreloadCacheKey preloadCacheKey = this.f71324n;
        return iHashCode8 + (preloadCacheKey != null ? preloadCacheKey.f71789b.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "AdvertDetailsArguments(itemId=" + this.f71312b + ", addressItemId=" + this.f71313c + ", context=" + this.f71314d + ", fastOpenParams=" + this.f71315e + ", treeParent=" + this.f71316f + ", clickTime=" + this.f71317g + ", galleryPosition=" + this.f71318h + ", screenSource=" + this.f71319i + ", callIdForEmitCall=" + this.f71320j + ", multiItemState=" + this.f71321k + ", selectedPageFromStories=" + this.f71322l + ", beduinLayoutManagerState=" + this.f71323m + ", preloadCacheKey=" + this.f71324n + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f71312b);
        Integer num = this.f71313c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f71314d);
        this.f71315e.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f71316f, i12);
        parcel.writeLong(this.f71317g);
        Integer num2 = this.f71318h;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        parcel.writeParcelable(this.f71319i, i12);
        parcel.writeString(this.f71320j);
        parcel.writeParcelable(this.f71321k, i12);
        parcel.writeString(this.f71322l);
        parcel.writeParcelable(this.f71323m, i12);
        PreloadCacheKey preloadCacheKey = this.f71324n;
        if (preloadCacheKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            preloadCacheKey.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ AdvertDetailsArguments(String str, Integer num, String str2, AdvertDetailsFastOpenParams advertDetailsFastOpenParams, TreeClickStreamParent treeClickStreamParent, long j12, Integer num2, ScreenSource screenSource, String str3, AdvertDetailsMultiItemState advertDetailsMultiItemState, String str4, Parcelable parcelable, PreloadCacheKey preloadCacheKey, int i12, C42822w c42822w) {
        this(str, num, str2, advertDetailsFastOpenParams, treeClickStreamParent, (i12 & 32) != 0 ? 0L : j12, num2, screenSource, str3, (i12 & 512) != 0 ? null : advertDetailsMultiItemState, (i12 & 1024) != 0 ? null : str4, (i12 & 2048) != 0 ? null : parcelable, (i12 & 4096) != 0 ? null : preloadCacheKey);
    }
}
