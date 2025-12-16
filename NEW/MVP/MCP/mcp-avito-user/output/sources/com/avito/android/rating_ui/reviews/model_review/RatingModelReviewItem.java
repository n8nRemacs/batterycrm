package com.avito.android.rating_ui.reviews.model_review;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingModelReviewItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/reviews/model_review/RatingModelReviewItem;", "Lcom/avito/android/rating_ui/reviews/model_review/a;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingModelReviewItem implements com.avito.android.rating_ui.reviews.model_review.a, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RatingModelReviewItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f250146b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Long f250147c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f250148d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f250149e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final ReviewStatus f250150f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Float f250151g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f250152h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f250153i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Author f250154j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final List<BaseRatingReviewItem.ReviewTextSection> f250155k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f250156l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final List<TnsGalleryImage> f250157m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public Parcelable f250158n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final List<ModelAction> f250159o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final BaseRatingReviewItem.ReviewAnswer f250160p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final String f250161q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final String f250162r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final RatingItemsMarginHorizontal f250163s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f250164t;

    /* compiled from: RatingModelReviewItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingModelReviewItem> {
        @Override // android.os.Parcelable.Creator
        public final RatingModelReviewItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            boolean z12;
            ArrayList arrayList4;
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ReviewStatus reviewStatusValueOf = parcel.readInt() == 0 ? null : ReviewStatus.valueOf(parcel.readString());
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Author authorCreateFromParcel = parcel.readInt() == 0 ? null : Author.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(BaseRatingReviewItem.ReviewTextSection.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            boolean z13 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(RatingModelReviewItem.class, parcel, arrayList5, iL2, 1);
                    i13 = i13;
                }
                arrayList2 = arrayList5;
            }
            Parcelable parcelable = parcel.readParcelable(RatingModelReviewItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
                z12 = z13;
                arrayList4 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i14);
                arrayList3 = arrayList2;
                int iC3 = 0;
                while (iC3 != i14) {
                    iC3 = com.avito.android.actions_sheet.a.c(ModelAction.CREATOR, parcel, arrayList6, iC3, 1);
                    i14 = i14;
                    z13 = z13;
                }
                z12 = z13;
                arrayList4 = arrayList6;
            }
            return new RatingModelReviewItem(string, lValueOf, string2, string3, reviewStatusValueOf, fValueOf, string4, string5, authorCreateFromParcel, arrayList, z12, arrayList3, parcelable, arrayList4, parcel.readInt() == 0 ? null : BaseRatingReviewItem.ReviewAnswer.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (RatingItemsMarginHorizontal) parcel.readParcelable(RatingModelReviewItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingModelReviewItem[] newArray(int i12) {
            return new RatingModelReviewItem[i12];
        }
    }

    public RatingModelReviewItem(@Y61.k String str, @Y61.l Long l12, @Y61.l String str2, @Y61.l String str3, @Y61.l ReviewStatus reviewStatus, @Y61.l Float f12, @Y61.l String str4, @Y61.l String str5, @Y61.l Author author, @Y61.l List<BaseRatingReviewItem.ReviewTextSection> list, boolean z12, @Y61.l List<TnsGalleryImage> list2, @Y61.l Parcelable parcelable, @Y61.l List<ModelAction> list3, @Y61.l BaseRatingReviewItem.ReviewAnswer reviewAnswer, @Y61.l String str6, @Y61.l String str7, @Y61.k RatingItemsMarginHorizontal ratingItemsMarginHorizontal, boolean z13) {
        this.f250146b = str;
        this.f250147c = l12;
        this.f250148d = str2;
        this.f250149e = str3;
        this.f250150f = reviewStatus;
        this.f250151g = f12;
        this.f250152h = str4;
        this.f250153i = str5;
        this.f250154j = author;
        this.f250155k = list;
        this.f250156l = z12;
        this.f250157m = list2;
        this.f250158n = parcelable;
        this.f250159o = list3;
        this.f250160p = reviewAnswer;
        this.f250161q = str6;
        this.f250162r = str7;
        this.f250163s = ratingItemsMarginHorizontal;
        this.f250164t = z13;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @Y61.l
    /* renamed from: B0, reason: from getter */
    public final BaseRatingReviewItem.ReviewAnswer getF250160p() {
        return this.f250160p;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    public final void K(@Y61.l Parcelable parcelable) {
        this.f250158n = parcelable;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @Y61.l
    /* renamed from: Y0, reason: from getter */
    public final Parcelable getF250158n() {
        return this.f250158n;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final RatingItemsMarginHorizontal getF250163s() {
        return this.f250163s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingModelReviewItem)) {
            return false;
        }
        RatingModelReviewItem ratingModelReviewItem = (RatingModelReviewItem) obj;
        return L.f(this.f250146b, ratingModelReviewItem.f250146b) && L.f(this.f250147c, ratingModelReviewItem.f250147c) && L.f(this.f250148d, ratingModelReviewItem.f250148d) && L.f(this.f250149e, ratingModelReviewItem.f250149e) && this.f250150f == ratingModelReviewItem.f250150f && L.f(this.f250151g, ratingModelReviewItem.f250151g) && L.f(this.f250152h, ratingModelReviewItem.f250152h) && L.f(this.f250153i, ratingModelReviewItem.f250153i) && L.f(this.f250154j, ratingModelReviewItem.f250154j) && L.f(this.f250155k, ratingModelReviewItem.f250155k) && this.f250156l == ratingModelReviewItem.f250156l && L.f(this.f250157m, ratingModelReviewItem.f250157m) && L.f(this.f250158n, ratingModelReviewItem.f250158n) && L.f(this.f250159o, ratingModelReviewItem.f250159o) && L.f(this.f250160p, ratingModelReviewItem.f250160p) && L.f(this.f250161q, ratingModelReviewItem.f250161q) && L.f(this.f250162r, ratingModelReviewItem.f250162r) && L.f(this.f250163s, ratingModelReviewItem.f250163s) && this.f250164t == ratingModelReviewItem.f250164t;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @Y61.l
    public final List<ModelAction> getActions() {
        return this.f250159o;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @Y61.l
    /* renamed from: getAuthor, reason: from getter */
    public final Author getF250154j() {
        return this.f250154j;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @Y61.l
    public final List<TnsGalleryImage> getImages() {
        return this.f250157m;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @Y61.l
    /* renamed from: getModelTitle, reason: from getter */
    public final String getF250152h() {
        return this.f250152h;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @Y61.l
    /* renamed from: getRated, reason: from getter */
    public final String getF250149e() {
        return this.f250149e;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @Y61.l
    /* renamed from: getRejectMessage, reason: from getter */
    public final String getF250162r() {
        return this.f250162r;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @Y61.l
    /* renamed from: getReviewId, reason: from getter */
    public final Long getF250147c() {
        return this.f250147c;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @Y61.l
    /* renamed from: getScore, reason: from getter */
    public final Float getF250151g() {
        return this.f250151g;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @Y61.l
    /* renamed from: getScoreDescription, reason: from getter */
    public final String getF250148d() {
        return this.f250148d;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @Y61.l
    /* renamed from: getStatus, reason: from getter */
    public final ReviewStatus getF250150f() {
        return this.f250150f;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @Y61.l
    /* renamed from: getStatusText, reason: from getter */
    public final String getF250161q() {
        return this.f250161q;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229419b() {
        return this.f250146b;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @Y61.l
    public final List<BaseRatingReviewItem.ReviewTextSection> getTextSections() {
        return this.f250155k;
    }

    public final int hashCode() {
        int iHashCode = this.f250146b.hashCode() * 31;
        Long l12 = this.f250147c;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.f250148d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f250149e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ReviewStatus reviewStatus = this.f250150f;
        int iHashCode5 = (iHashCode4 + (reviewStatus == null ? 0 : reviewStatus.hashCode())) * 31;
        Float f12 = this.f250151g;
        int iHashCode6 = (iHashCode5 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str3 = this.f250152h;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f250153i;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Author author = this.f250154j;
        int iHashCode9 = (iHashCode8 + (author == null ? 0 : author.hashCode())) * 31;
        List<BaseRatingReviewItem.ReviewTextSection> list = this.f250155k;
        int i12 = r.i((iHashCode9 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f250156l);
        List<TnsGalleryImage> list2 = this.f250157m;
        int iHashCode10 = (i12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Parcelable parcelable = this.f250158n;
        int iHashCode11 = (iHashCode10 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        List<ModelAction> list3 = this.f250159o;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        BaseRatingReviewItem.ReviewAnswer reviewAnswer = this.f250160p;
        int iHashCode13 = (iHashCode12 + (reviewAnswer == null ? 0 : reviewAnswer.hashCode())) * 31;
        String str5 = this.f250161q;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f250162r;
        return Boolean.hashCode(this.f250164t) + ((this.f250163s.hashCode() + ((iHashCode14 + (str6 != null ? str6.hashCode() : 0)) * 31)) * 31);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    @Y61.l
    /* renamed from: l0, reason: from getter */
    public final String getF250153i() {
        return this.f250153i;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingModelReviewItem(stringId=");
        sb2.append(this.f250146b);
        sb2.append(", reviewId=");
        sb2.append(this.f250147c);
        sb2.append(", scoreDescription=");
        sb2.append(this.f250148d);
        sb2.append(", rated=");
        sb2.append(this.f250149e);
        sb2.append(", status=");
        sb2.append(this.f250150f);
        sb2.append(", score=");
        sb2.append(this.f250151g);
        sb2.append(", modelTitle=");
        sb2.append(this.f250152h);
        sb2.append(", reviewTitle=");
        sb2.append(this.f250153i);
        sb2.append(", author=");
        sb2.append(this.f250154j);
        sb2.append(", textSections=");
        sb2.append(this.f250155k);
        sb2.append(", shouldShowStatus=");
        sb2.append(this.f250156l);
        sb2.append(", images=");
        sb2.append(this.f250157m);
        sb2.append(", imagesGalleryState=");
        sb2.append(this.f250158n);
        sb2.append(", actions=");
        sb2.append(this.f250159o);
        sb2.append(", answer=");
        sb2.append(this.f250160p);
        sb2.append(", statusText=");
        sb2.append(this.f250161q);
        sb2.append(", rejectMessage=");
        sb2.append(this.f250162r);
        sb2.append(", marginHorizontal=");
        sb2.append(this.f250163s);
        sb2.append(", isStatusRedesign=");
        return r.x(sb2, this.f250164t, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f250146b);
        Long l12 = this.f250147c;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.f250148d);
        parcel.writeString(this.f250149e);
        ReviewStatus reviewStatus = this.f250150f;
        if (reviewStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(reviewStatus.name());
        }
        Float f12 = this.f250151g;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeString(this.f250152h);
        parcel.writeString(this.f250153i);
        Author author = this.f250154j;
        if (author == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            author.writeToParcel(parcel, i12);
        }
        List<BaseRatingReviewItem.ReviewTextSection> list = this.f250155k;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((BaseRatingReviewItem.ReviewTextSection) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeInt(this.f250156l ? 1 : 0);
        List<TnsGalleryImage> list2 = this.f250157m;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        parcel.writeParcelable(this.f250158n, i12);
        List<ModelAction> list3 = this.f250159o;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                ((ModelAction) itA3.next()).writeToParcel(parcel, i12);
            }
        }
        BaseRatingReviewItem.ReviewAnswer reviewAnswer = this.f250160p;
        if (reviewAnswer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reviewAnswer.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f250161q);
        parcel.writeString(this.f250162r);
        parcel.writeParcelable(this.f250163s, i12);
        parcel.writeInt(this.f250164t ? 1 : 0);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    /* renamed from: x, reason: from getter */
    public final boolean getF250156l() {
        return this.f250156l;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.a
    /* renamed from: y, reason: from getter */
    public final boolean getF250164t() {
        return this.f250164t;
    }

    public /* synthetic */ RatingModelReviewItem(String str, Long l12, String str2, String str3, ReviewStatus reviewStatus, Float f12, String str4, String str5, Author author, List list, boolean z12, List list2, Parcelable parcelable, List list3, BaseRatingReviewItem.ReviewAnswer reviewAnswer, String str6, String str7, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, boolean z13, int i12, C42822w c42822w) {
        this(str, l12, str2, str3, reviewStatus, f12, str4, str5, author, list, (i12 & 1024) != 0 ? true : z12, list2, (i12 & 4096) != 0 ? null : parcelable, list3, reviewAnswer, str6, str7, (i12 & 131072) != 0 ? RatingItemsMarginHorizontal.MarginLarge.f249853b : ratingItemsMarginHorizontal, z13);
    }
}
