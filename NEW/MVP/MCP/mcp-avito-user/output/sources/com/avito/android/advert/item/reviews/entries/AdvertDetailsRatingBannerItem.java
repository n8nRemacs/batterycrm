package com.avito.android.advert.item.reviews.entries;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsRatingBannerItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/reviews/entries/AdvertDetailsRatingBannerItem;", "Lcom/avito/android/rating_ui/banner/a;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsRatingBannerItem implements com.avito.android.rating_ui.banner.a, BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsRatingBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78686b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public SerpDisplayType f78687c;

    /* renamed from: d, reason: collision with root package name */
    public final int f78688d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f78689e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f78690f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f78691g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final UniversalColor f78692h;

    /* compiled from: AdvertDetailsRatingBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsRatingBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsRatingBannerItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsRatingBannerItem(parcel.readLong(), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt(), SerpViewType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(AdvertDetailsRatingBannerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsRatingBannerItem[] newArray(int i12) {
            return new AdvertDetailsRatingBannerItem[i12];
        }
    }

    public AdvertDetailsRatingBannerItem(long j12, @k SerpDisplayType serpDisplayType, int i12, @k SerpViewType serpViewType, @k String str, @k String str2, @l UniversalColor universalColor) {
        this.f78686b = j12;
        this.f78687c = serpDisplayType;
        this.f78688d = i12;
        this.f78689e = serpViewType;
        this.f78690f = str;
        this.f78691g = str2;
        this.f78692h = universalColor;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsRatingBannerItem(this.f78686b, this.f78687c, i12, this.f78689e, this.f78690f, this.f78691g, this.f78692h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f78687c = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.rating_ui.banner.a
    @l
    /* renamed from: e, reason: from getter */
    public final UniversalColor getF78692h() {
        return this.f78692h;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsRatingBannerItem)) {
            return false;
        }
        AdvertDetailsRatingBannerItem advertDetailsRatingBannerItem = (AdvertDetailsRatingBannerItem) obj;
        return this.f78686b == advertDetailsRatingBannerItem.f78686b && this.f78687c == advertDetailsRatingBannerItem.f78687c && this.f78688d == advertDetailsRatingBannerItem.f78688d && this.f78689e == advertDetailsRatingBannerItem.f78689e && L.f(this.f78690f, advertDetailsRatingBannerItem.f78690f) && L.f(this.f78691g, advertDetailsRatingBannerItem.f78691g) && L.f(this.f78692h, advertDetailsRatingBannerItem.f78692h);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF79291b() {
        return this.f78686b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79295f() {
        return this.f78688d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79292c() {
        return this.f78690f;
    }

    @Override // com.avito.android.rating_ui.banner.a
    @k
    /* renamed from: getText, reason: from getter */
    public final String getF78691g() {
        return this.f78691g;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79293d() {
        return this.f78689e;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(com.avito.android.actions_sheet.a.j(this.f78689e, r.e(this.f78688d, com.avito.android.actions_sheet.a.h(this.f78687c, Long.hashCode(this.f78686b) * 31, 31), 31), 31), 31, this.f78690f), 31, this.f78691g);
        UniversalColor universalColor = this.f78692h;
        return iD2 + (universalColor == null ? 0 : universalColor.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsRatingBannerItem(id=");
        sb2.append(this.f78686b);
        sb2.append(", displayType=");
        sb2.append(this.f78687c);
        sb2.append(", spanCount=");
        sb2.append(this.f78688d);
        sb2.append(", viewType=");
        sb2.append(this.f78689e);
        sb2.append(", stringId=");
        sb2.append(this.f78690f);
        sb2.append(", text=");
        sb2.append(this.f78691g);
        sb2.append(", background=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f78692h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f78686b);
        parcel.writeString(this.f78687c.name());
        parcel.writeInt(this.f78688d);
        parcel.writeString(this.f78689e.name());
        parcel.writeString(this.f78690f);
        parcel.writeString(this.f78691g);
        parcel.writeParcelable(this.f78692h, i12);
    }

    public /* synthetic */ AdvertDetailsRatingBannerItem(long j12, SerpDisplayType serpDisplayType, int i12, SerpViewType serpViewType, String str, String str2, UniversalColor universalColor, int i13, C42822w c42822w) {
        this(j12, (i13 & 2) != 0 ? SerpDisplayType.Grid : serpDisplayType, i12, (i13 & 8) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 16) != 0 ? String.valueOf(j12) : str, str2, universalColor);
    }
}
