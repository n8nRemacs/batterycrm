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
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.button.BaseRatingButtonItem;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsReviewsButtonItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/reviews/entries/AdvertDetailsReviewsButtonItem;", "Lcom/avito/android/rating_ui/button/BaseRatingButtonItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsReviewsButtonItem implements BaseRatingButtonItem, BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsReviewsButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78693b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public SerpDisplayType f78694c;

    /* renamed from: d, reason: collision with root package name */
    public final int f78695d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f78696e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f78697f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final BaseRatingButtonItem.FillType f78698g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final DeeplinkAction f78699h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final RatingItemsMarginHorizontal f78700i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f78701j;

    /* compiled from: AdvertDetailsReviewsButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsReviewsButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsReviewsButtonItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsReviewsButtonItem(parcel.readLong(), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt(), SerpViewType.valueOf(parcel.readString()), parcel.readString(), BaseRatingButtonItem.FillType.valueOf(parcel.readString()), (DeeplinkAction) parcel.readParcelable(AdvertDetailsReviewsButtonItem.class.getClassLoader()), (RatingItemsMarginHorizontal) parcel.readParcelable(AdvertDetailsReviewsButtonItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsReviewsButtonItem[] newArray(int i12) {
            return new AdvertDetailsReviewsButtonItem[i12];
        }
    }

    public AdvertDetailsReviewsButtonItem(long j12, @k SerpDisplayType serpDisplayType, int i12, @k SerpViewType serpViewType, @k String str, @k BaseRatingButtonItem.FillType fillType, @k DeeplinkAction deeplinkAction, @k RatingItemsMarginHorizontal ratingItemsMarginHorizontal, boolean z12) {
        this.f78693b = j12;
        this.f78694c = serpDisplayType;
        this.f78695d = i12;
        this.f78696e = serpViewType;
        this.f78697f = str;
        this.f78698g = fillType;
        this.f78699h = deeplinkAction;
        this.f78700i = ratingItemsMarginHorizontal;
        this.f78701j = z12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsReviewsButtonItem(this.f78693b, this.f78694c, i12, this.f78696e, this.f78697f, this.f78698g, this.f78699h, this.f78700i, this.f78701j);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f78694c = serpDisplayType;
    }

    @Override // com.avito.android.rating_ui.button.BaseRatingButtonItem
    @k
    /* renamed from: c, reason: from getter */
    public final RatingItemsMarginHorizontal getF78700i() {
        return this.f78700i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsReviewsButtonItem)) {
            return false;
        }
        AdvertDetailsReviewsButtonItem advertDetailsReviewsButtonItem = (AdvertDetailsReviewsButtonItem) obj;
        return this.f78693b == advertDetailsReviewsButtonItem.f78693b && this.f78694c == advertDetailsReviewsButtonItem.f78694c && this.f78695d == advertDetailsReviewsButtonItem.f78695d && this.f78696e == advertDetailsReviewsButtonItem.f78696e && L.f(this.f78697f, advertDetailsReviewsButtonItem.f78697f) && this.f78698g == advertDetailsReviewsButtonItem.f78698g && L.f(this.f78699h, advertDetailsReviewsButtonItem.f78699h) && L.f(this.f78700i, advertDetailsReviewsButtonItem.f78700i) && this.f78701j == advertDetailsReviewsButtonItem.f78701j;
    }

    @Override // com.avito.android.rating_ui.button.BaseRatingButtonItem
    @k
    /* renamed from: getAction, reason: from getter */
    public final DeeplinkAction getF78699h() {
        return this.f78699h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF74201e() {
        return this.f78693b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79070f() {
        return this.f78695d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF302126x() {
        return this.f78697f;
    }

    @Override // com.avito.android.rating_ui.button.BaseRatingButtonItem
    @k
    /* renamed from: getType, reason: from getter */
    public final BaseRatingButtonItem.FillType getF78698g() {
        return this.f78698g;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79072h() {
        return this.f78696e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f78701j) + ((this.f78700i.hashCode() + ((this.f78699h.hashCode() + ((this.f78698g.hashCode() + H.d(com.avito.android.actions_sheet.a.j(this.f78696e, r.e(this.f78695d, com.avito.android.actions_sheet.a.h(this.f78694c, Long.hashCode(this.f78693b) * 31, 31), 31), 31), 31, this.f78697f)) * 31)) * 31)) * 31);
    }

    @Override // com.avito.android.rating_ui.button.BaseRatingButtonItem
    /* renamed from: j0, reason: from getter */
    public final boolean getF78701j() {
        return this.f78701j;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsReviewsButtonItem(id=");
        sb2.append(this.f78693b);
        sb2.append(", displayType=");
        sb2.append(this.f78694c);
        sb2.append(", spanCount=");
        sb2.append(this.f78695d);
        sb2.append(", viewType=");
        sb2.append(this.f78696e);
        sb2.append(", stringId=");
        sb2.append(this.f78697f);
        sb2.append(", type=");
        sb2.append(this.f78698g);
        sb2.append(", action=");
        sb2.append(this.f78699h);
        sb2.append(", marginHorizontal=");
        sb2.append(this.f78700i);
        sb2.append(", isServicesRedesign=");
        return r.x(sb2, this.f78701j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f78693b);
        parcel.writeString(this.f78694c.name());
        parcel.writeInt(this.f78695d);
        parcel.writeString(this.f78696e.name());
        parcel.writeString(this.f78697f);
        parcel.writeString(this.f78698g.name());
        parcel.writeParcelable(this.f78699h, i12);
        parcel.writeParcelable(this.f78700i, i12);
        parcel.writeInt(this.f78701j ? 1 : 0);
    }

    public /* synthetic */ AdvertDetailsReviewsButtonItem(long j12, SerpDisplayType serpDisplayType, int i12, SerpViewType serpViewType, String str, BaseRatingButtonItem.FillType fillType, DeeplinkAction deeplinkAction, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, boolean z12, int i13, C42822w c42822w) {
        this(j12, (i13 & 2) != 0 ? SerpDisplayType.Grid : serpDisplayType, i12, (i13 & 8) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 16) != 0 ? String.valueOf(j12) : str, fillType, deeplinkAction, (i13 & 128) != 0 ? RatingItemsMarginHorizontal.MarginNormal.f249854b : ratingItemsMarginHorizontal, (i13 & 256) != 0 ? false : z12);
    }
}
