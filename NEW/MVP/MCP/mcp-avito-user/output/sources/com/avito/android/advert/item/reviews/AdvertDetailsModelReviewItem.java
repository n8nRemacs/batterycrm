package com.avito.android.advert.item.reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.reviews.model_review.Author;
import com.avito.android.rating_ui.reviews.model_review.ModelAction;
import com.avito.android.rating_ui.reviews.model_review.ReviewStatus;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: AdvertDetailsModelReviewItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/reviews/AdvertDetailsModelReviewItem;", "Lcom/avito/android/rating_ui/reviews/model_review/a;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsModelReviewItem implements com.avito.android.rating_ui.reviews.model_review.a, BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsModelReviewItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78623b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Long f78624c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f78625d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f78626e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ReviewStatus f78627f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Float f78628g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f78629h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f78630i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Author f78631j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final List<BaseRatingReviewItem.ReviewTextSection> f78632k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final List<ModelAction> f78633l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final BaseRatingReviewItem.ReviewAnswer f78634m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final String f78635n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public SerpDisplayType f78636o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final SerpViewType f78637p;

    /* renamed from: q, reason: collision with root package name */
    public final int f78638q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f78639r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final RatingItemsMarginHorizontal f78640s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final String f78641t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public final List<TnsGalleryImage> f78642u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public Parcelable f78643v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public final String f78644w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f78645x;

    /* compiled from: AdvertDetailsModelReviewItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsModelReviewItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsModelReviewItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            BaseRatingReviewItem.ReviewAnswer reviewAnswer;
            ArrayList arrayList3;
            ArrayList arrayList4;
            long j12 = parcel.readLong();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            ReviewStatus reviewStatusValueOf = parcel.readInt() == 0 ? null : ReviewStatus.valueOf(parcel.readString());
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Author author = (Author) parcel.readParcelable(AdvertDetailsModelReviewItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsModelReviewItem.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(AdvertDetailsModelReviewItem.class, parcel, arrayList2, iL3, 1);
                    i13 = i13;
                }
            }
            BaseRatingReviewItem.ReviewAnswer reviewAnswer2 = (BaseRatingReviewItem.ReviewAnswer) parcel.readParcelable(AdvertDetailsModelReviewItem.class.getClassLoader());
            String string5 = parcel.readString();
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            int i14 = parcel.readInt();
            boolean z12 = parcel.readInt() != 0;
            RatingItemsMarginHorizontal ratingItemsMarginHorizontal = (RatingItemsMarginHorizontal) parcel.readParcelable(AdvertDetailsModelReviewItem.class.getClassLoader());
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
                reviewAnswer = reviewAnswer2;
                arrayList4 = null;
            } else {
                int i15 = parcel.readInt();
                reviewAnswer = reviewAnswer2;
                ArrayList arrayList5 = new ArrayList(i15);
                arrayList3 = arrayList2;
                int iL4 = 0;
                while (iL4 != i15) {
                    iL4 = com.avito.android.actions_sheet.a.l(AdvertDetailsModelReviewItem.class, parcel, arrayList5, iL4, 1);
                    i15 = i15;
                }
                arrayList4 = arrayList5;
            }
            return new AdvertDetailsModelReviewItem(j12, lValueOf, string, string2, reviewStatusValueOf, fValueOf, string3, string4, author, arrayList, arrayList3, reviewAnswer, string5, serpDisplayTypeValueOf, serpViewTypeValueOf, i14, z12, ratingItemsMarginHorizontal, string6, arrayList4, parcel.readParcelable(AdvertDetailsModelReviewItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsModelReviewItem[] newArray(int i12) {
            return new AdvertDetailsModelReviewItem[i12];
        }
    }

    public AdvertDetailsModelReviewItem(long j12, @l Long l12, @l String str, @l String str2, @l ReviewStatus reviewStatus, @l Float f12, @l String str3, @l String str4, @l Author author, @l List<BaseRatingReviewItem.ReviewTextSection> list, @l List<ModelAction> list2, @l BaseRatingReviewItem.ReviewAnswer reviewAnswer, @k String str5, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, int i12, boolean z12, @k RatingItemsMarginHorizontal ratingItemsMarginHorizontal, @l String str6, @l List<TnsGalleryImage> list3, @l Parcelable parcelable, @l String str7, boolean z13) {
        this.f78623b = j12;
        this.f78624c = l12;
        this.f78625d = str;
        this.f78626e = str2;
        this.f78627f = reviewStatus;
        this.f78628g = f12;
        this.f78629h = str3;
        this.f78630i = str4;
        this.f78631j = author;
        this.f78632k = list;
        this.f78633l = list2;
        this.f78634m = reviewAnswer;
        this.f78635n = str5;
        this.f78636o = serpDisplayType;
        this.f78637p = serpViewType;
        this.f78638q = i12;
        this.f78639r = z12;
        this.f78640s = ratingItemsMarginHorizontal;
        this.f78641t = str6;
        this.f78642u = list3;
        this.f78643v = parcelable;
        this.f78644w = str7;
        this.f78645x = z13;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @l
    /* renamed from: B0, reason: from getter */
    public final BaseRatingReviewItem.ReviewAnswer getF78634m() {
        return this.f78634m;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    public final void K(@l Parcelable parcelable) {
        this.f78643v = parcelable;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsModelReviewItem(this.f78623b, this.f78624c, this.f78625d, this.f78626e, this.f78627f, this.f78628g, this.f78629h, this.f78630i, this.f78631j, this.f78632k, this.f78633l, this.f78634m, this.f78635n, this.f78636o, this.f78637p, i12, this.f78639r, this.f78640s, this.f78641t, this.f78642u, this.f78643v, this.f78644w, this.f78645x);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @l
    /* renamed from: Y0, reason: from getter */
    public final Parcelable getF78643v() {
        return this.f78643v;
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f78636o = serpDisplayType;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @k
    /* renamed from: c, reason: from getter */
    public final RatingItemsMarginHorizontal getF78640s() {
        return this.f78640s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsModelReviewItem)) {
            return false;
        }
        AdvertDetailsModelReviewItem advertDetailsModelReviewItem = (AdvertDetailsModelReviewItem) obj;
        return this.f78623b == advertDetailsModelReviewItem.f78623b && L.f(this.f78624c, advertDetailsModelReviewItem.f78624c) && L.f(this.f78625d, advertDetailsModelReviewItem.f78625d) && L.f(this.f78626e, advertDetailsModelReviewItem.f78626e) && this.f78627f == advertDetailsModelReviewItem.f78627f && L.f(this.f78628g, advertDetailsModelReviewItem.f78628g) && L.f(this.f78629h, advertDetailsModelReviewItem.f78629h) && L.f(this.f78630i, advertDetailsModelReviewItem.f78630i) && L.f(this.f78631j, advertDetailsModelReviewItem.f78631j) && L.f(this.f78632k, advertDetailsModelReviewItem.f78632k) && L.f(this.f78633l, advertDetailsModelReviewItem.f78633l) && L.f(this.f78634m, advertDetailsModelReviewItem.f78634m) && L.f(this.f78635n, advertDetailsModelReviewItem.f78635n) && this.f78636o == advertDetailsModelReviewItem.f78636o && this.f78637p == advertDetailsModelReviewItem.f78637p && this.f78638q == advertDetailsModelReviewItem.f78638q && this.f78639r == advertDetailsModelReviewItem.f78639r && L.f(this.f78640s, advertDetailsModelReviewItem.f78640s) && L.f(this.f78641t, advertDetailsModelReviewItem.f78641t) && L.f(this.f78642u, advertDetailsModelReviewItem.f78642u) && L.f(this.f78643v, advertDetailsModelReviewItem.f78643v) && L.f(this.f78644w, advertDetailsModelReviewItem.f78644w) && this.f78645x == advertDetailsModelReviewItem.f78645x;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @l
    public final List<ModelAction> getActions() {
        return this.f78633l;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @l
    /* renamed from: getAuthor, reason: from getter */
    public final Author getF78631j() {
        return this.f78631j;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF74395b() {
        return this.f78623b;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @l
    public final List<TnsGalleryImage> getImages() {
        return this.f78642u;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @l
    /* renamed from: getModelTitle, reason: from getter */
    public final String getF78630i() {
        return this.f78630i;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @l
    /* renamed from: getRated, reason: from getter */
    public final String getF78626e() {
        return this.f78626e;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @l
    /* renamed from: getRejectMessage, reason: from getter */
    public final String getF78644w() {
        return this.f78644w;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @l
    /* renamed from: getReviewId, reason: from getter */
    public final Long getF78624c() {
        return this.f78624c;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @l
    /* renamed from: getScore, reason: from getter */
    public final Float getF78628g() {
        return this.f78628g;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @l
    /* renamed from: getScoreDescription, reason: from getter */
    public final String getF78625d() {
        return this.f78625d;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF74400g() {
        return this.f78638q;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @l
    /* renamed from: getStatus, reason: from getter */
    public final ReviewStatus getF78627f() {
        return this.f78627f;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @l
    /* renamed from: getStatusText, reason: from getter */
    public final String getF78641t() {
        return this.f78641t;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF310119b() {
        return this.f78635n;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @l
    public final List<BaseRatingReviewItem.ReviewTextSection> getTextSections() {
        return this.f78632k;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF74402i() {
        return this.f78637p;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f78623b) * 31;
        Long l12 = this.f78624c;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.f78625d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f78626e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ReviewStatus reviewStatus = this.f78627f;
        int iHashCode5 = (iHashCode4 + (reviewStatus == null ? 0 : reviewStatus.hashCode())) * 31;
        Float f12 = this.f78628g;
        int iHashCode6 = (iHashCode5 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str3 = this.f78629h;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f78630i;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Author author = this.f78631j;
        int iHashCode9 = (iHashCode8 + (author == null ? 0 : author.hashCode())) * 31;
        List<BaseRatingReviewItem.ReviewTextSection> list = this.f78632k;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<ModelAction> list2 = this.f78633l;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BaseRatingReviewItem.ReviewAnswer reviewAnswer = this.f78634m;
        int iHashCode12 = (this.f78640s.hashCode() + r.i(r.e(this.f78638q, com.avito.android.actions_sheet.a.j(this.f78637p, com.avito.android.actions_sheet.a.h(this.f78636o, H.d((iHashCode11 + (reviewAnswer == null ? 0 : reviewAnswer.hashCode())) * 31, 31, this.f78635n), 31), 31), 31), 31, this.f78639r)) * 31;
        String str5 = this.f78641t;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<TnsGalleryImage> list3 = this.f78642u;
        int iHashCode14 = (iHashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Parcelable parcelable = this.f78643v;
        int iHashCode15 = (iHashCode14 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        String str6 = this.f78644w;
        return Boolean.hashCode(this.f78645x) + ((iHashCode15 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @l
    /* renamed from: l0, reason: from getter */
    public final String getF78629h() {
        return this.f78629h;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsModelReviewItem(id=");
        sb2.append(this.f78623b);
        sb2.append(", reviewId=");
        sb2.append(this.f78624c);
        sb2.append(", scoreDescription=");
        sb2.append(this.f78625d);
        sb2.append(", rated=");
        sb2.append(this.f78626e);
        sb2.append(", status=");
        sb2.append(this.f78627f);
        sb2.append(", score=");
        sb2.append(this.f78628g);
        sb2.append(", reviewTitle=");
        sb2.append(this.f78629h);
        sb2.append(", modelTitle=");
        sb2.append(this.f78630i);
        sb2.append(", author=");
        sb2.append(this.f78631j);
        sb2.append(", textSections=");
        sb2.append(this.f78632k);
        sb2.append(", actions=");
        sb2.append(this.f78633l);
        sb2.append(", answer=");
        sb2.append(this.f78634m);
        sb2.append(", stringId=");
        sb2.append(this.f78635n);
        sb2.append(", displayType=");
        sb2.append(this.f78636o);
        sb2.append(", viewType=");
        sb2.append(this.f78637p);
        sb2.append(", spanCount=");
        sb2.append(this.f78638q);
        sb2.append(", shouldShowStatus=");
        sb2.append(this.f78639r);
        sb2.append(", marginHorizontal=");
        sb2.append(this.f78640s);
        sb2.append(", statusText=");
        sb2.append(this.f78641t);
        sb2.append(", images=");
        sb2.append(this.f78642u);
        sb2.append(", imagesGalleryState=");
        sb2.append(this.f78643v);
        sb2.append(", rejectMessage=");
        sb2.append(this.f78644w);
        sb2.append(", isStatusRedesign=");
        return r.x(sb2, this.f78645x, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f78623b);
        Long l12 = this.f78624c;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.f78625d);
        parcel.writeString(this.f78626e);
        ReviewStatus reviewStatus = this.f78627f;
        if (reviewStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(reviewStatus.name());
        }
        Float f12 = this.f78628g;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeString(this.f78629h);
        parcel.writeString(this.f78630i);
        parcel.writeParcelable(this.f78631j, i12);
        List<BaseRatingReviewItem.ReviewTextSection> list = this.f78632k;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        List<ModelAction> list2 = this.f78633l;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        parcel.writeParcelable(this.f78634m, i12);
        parcel.writeString(this.f78635n);
        parcel.writeString(this.f78636o.name());
        parcel.writeString(this.f78637p.name());
        parcel.writeInt(this.f78638q);
        parcel.writeInt(this.f78639r ? 1 : 0);
        parcel.writeParcelable(this.f78640s, i12);
        parcel.writeString(this.f78641t);
        List<TnsGalleryImage> list3 = this.f78642u;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), i12);
            }
        }
        parcel.writeParcelable(this.f78643v, i12);
        parcel.writeString(this.f78644w);
        parcel.writeInt(this.f78645x ? 1 : 0);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    /* renamed from: x, reason: from getter */
    public final boolean getF78639r() {
        return this.f78639r;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    /* renamed from: y, reason: from getter */
    public final boolean getF78645x() {
        return this.f78645x;
    }

    public AdvertDetailsModelReviewItem(long j12, Long l12, String str, String str2, ReviewStatus reviewStatus, Float f12, String str3, String str4, Author author, List list, List list2, BaseRatingReviewItem.ReviewAnswer reviewAnswer, String str5, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i12, boolean z12, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, String str6, List list3, Parcelable parcelable, String str7, boolean z13, int i13, C42822w c42822w) {
        this(j12, l12, str, str2, reviewStatus, f12, str3, str4, author, list, list2, reviewAnswer, (i13 & 4096) != 0 ? String.valueOf(j12) : str5, (i13 & 8192) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? SerpViewType.f268585e : serpViewType, i12, (65536 & i13) != 0 ? false : z12, (131072 & i13) != 0 ? RatingItemsMarginHorizontal.MarginNormal.f249854b : ratingItemsMarginHorizontal, str6, (524288 & i13) != 0 ? C42784z0.f406748b : list3, (1048576 & i13) != 0 ? null : parcelable, str7, (i13 & 4194304) != 0 ? false : z13);
    }
}
