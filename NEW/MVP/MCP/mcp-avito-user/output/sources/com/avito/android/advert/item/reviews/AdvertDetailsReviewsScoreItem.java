package com.avito.android.advert.item.reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsReviewsScoreItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/reviews/AdvertDetailsReviewsScoreItem;", "Lcom/avito/android/rating_ui/badge_score/a;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsReviewsScoreItem implements com.avito.android.rating_ui.badge_score.a, BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsReviewsScoreItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78669b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f78670c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Float f78671d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f78672e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f78673f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f78674g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final RatingItemsMarginHorizontal f78675h;

    /* renamed from: i, reason: collision with root package name */
    public final int f78676i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public SerpDisplayType f78677j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final SerpViewType f78678k;

    /* compiled from: AdvertDetailsReviewsScoreItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsReviewsScoreItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsReviewsScoreItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsReviewsScoreItem(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AdvertDetailsReviewsScoreItem.class.getClassLoader()), (RatingItemsMarginHorizontal) parcel.readParcelable(AdvertDetailsReviewsScoreItem.class.getClassLoader()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsReviewsScoreItem[] newArray(int i12) {
            return new AdvertDetailsReviewsScoreItem[i12];
        }
    }

    public AdvertDetailsReviewsScoreItem(long j12, @k String str, @l Float f12, @k String str2, @k String str3, @l DeepLink deepLink, @k RatingItemsMarginHorizontal ratingItemsMarginHorizontal, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f78669b = j12;
        this.f78670c = str;
        this.f78671d = f12;
        this.f78672e = str2;
        this.f78673f = str3;
        this.f78674g = deepLink;
        this.f78675h = ratingItemsMarginHorizontal;
        this.f78676i = i12;
        this.f78677j = serpDisplayType;
        this.f78678k = serpViewType;
    }

    @Override // com.avito.android.rating_ui.badge_score.a
    @l
    /* renamed from: A, reason: from getter */
    public final Float getF249954c() {
        return this.f78671d;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsReviewsScoreItem(this.f78669b, this.f78670c, this.f78671d, this.f78672e, this.f78673f, this.f78674g, this.f78675h, i12, this.f78677j, this.f78678k);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f78677j = serpDisplayType;
    }

    @Override // com.avito.android.rating_ui.badge_score.a
    @k
    /* renamed from: c, reason: from getter */
    public final RatingItemsMarginHorizontal getF249958g() {
        return this.f78675h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsReviewsScoreItem)) {
            return false;
        }
        AdvertDetailsReviewsScoreItem advertDetailsReviewsScoreItem = (AdvertDetailsReviewsScoreItem) obj;
        return this.f78669b == advertDetailsReviewsScoreItem.f78669b && L.f(this.f78670c, advertDetailsReviewsScoreItem.f78670c) && L.f(this.f78671d, advertDetailsReviewsScoreItem.f78671d) && L.f(this.f78672e, advertDetailsReviewsScoreItem.f78672e) && L.f(this.f78673f, advertDetailsReviewsScoreItem.f78673f) && L.f(this.f78674g, advertDetailsReviewsScoreItem.f78674g) && L.f(this.f78675h, advertDetailsReviewsScoreItem.f78675h) && this.f78676i == advertDetailsReviewsScoreItem.f78676i && this.f78677j == advertDetailsReviewsScoreItem.f78677j && this.f78678k == advertDetailsReviewsScoreItem.f78678k;
    }

    @Override // com.avito.android.rating_ui.badge_score.a
    @l
    /* renamed from: getDeeplink, reason: from getter */
    public final DeepLink getF249957f() {
        return this.f78674g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF74201e() {
        return this.f78669b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79070f() {
        return this.f78676i;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF302126x() {
        return this.f78670c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79072h() {
        return this.f78678k;
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f78669b) * 31, 31, this.f78670c);
        Float f12 = this.f78671d;
        int iD3 = H.d(H.d((iD2 + (f12 == null ? 0 : f12.hashCode())) * 31, 31, this.f78672e), 31, this.f78673f);
        DeepLink deepLink = this.f78674g;
        return this.f78678k.hashCode() + com.avito.android.actions_sheet.a.h(this.f78677j, r.e(this.f78676i, (this.f78675h.hashCode() + ((iD3 + (deepLink != null ? deepLink.hashCode() : 0)) * 31)) * 31, 31), 31);
    }

    @Override // com.avito.android.rating_ui.badge_score.a
    @k
    /* renamed from: s0, reason: from getter */
    public final String getF249955d() {
        return this.f78672e;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsReviewsScoreItem(id=");
        sb2.append(this.f78669b);
        sb2.append(", stringId=");
        sb2.append(this.f78670c);
        sb2.append(", scoreValue=");
        sb2.append(this.f78671d);
        sb2.append(", scoreText=");
        sb2.append(this.f78672e);
        sb2.append(", caption=");
        sb2.append(this.f78673f);
        sb2.append(", deeplink=");
        sb2.append(this.f78674g);
        sb2.append(", marginHorizontal=");
        sb2.append(this.f78675h);
        sb2.append(", spanCount=");
        sb2.append(this.f78676i);
        sb2.append(", displayType=");
        sb2.append(this.f78677j);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f78678k, ')');
    }

    @Override // com.avito.android.rating_ui.badge_score.a
    @k
    /* renamed from: w1, reason: from getter */
    public final String getF249956e() {
        return this.f78673f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f78669b);
        parcel.writeString(this.f78670c);
        Float f12 = this.f78671d;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeString(this.f78672e);
        parcel.writeString(this.f78673f);
        parcel.writeParcelable(this.f78674g, i12);
        parcel.writeParcelable(this.f78675h, i12);
        parcel.writeInt(this.f78676i);
        parcel.writeString(this.f78677j.name());
        parcel.writeString(this.f78678k.name());
    }

    public /* synthetic */ AdvertDetailsReviewsScoreItem(long j12, String str, Float f12, String str2, String str3, DeepLink deepLink, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(j12, (i13 & 2) != 0 ? String.valueOf(j12) : str, f12, str2, str3, (i13 & 32) != 0 ? null : deepLink, (i13 & 64) != 0 ? RatingItemsMarginHorizontal.MarginNormal.f249854b : ratingItemsMarginHorizontal, i12, (i13 & 256) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 512) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
