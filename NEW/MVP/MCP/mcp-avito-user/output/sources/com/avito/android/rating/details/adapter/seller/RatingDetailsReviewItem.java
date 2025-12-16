package com.avito.android.rating.details.adapter.seller;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: RatingDetailsReviewItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/adapter/seller/RatingDetailsReviewItem;", "Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingDetailsReviewItem extends BaseRatingReviewItem {

    @k
    public static final Parcelable.Creator<RatingDetailsReviewItem> CREATOR = new a();

    /* renamed from: A, reason: collision with root package name */
    @l
    public final String f246516A;

    /* renamed from: B, reason: collision with root package name */
    @l
    public final String f246517B;

    /* renamed from: C, reason: collision with root package name */
    @l
    public final String f246518C;

    /* renamed from: D, reason: collision with root package name */
    @k
    public final BaseRatingReviewItem.ReviewStatus f246519D;

    /* renamed from: E, reason: collision with root package name */
    @l
    public final String f246520E;

    /* renamed from: F, reason: collision with root package name */
    @l
    public final AttributedText f246521F;

    /* renamed from: G, reason: collision with root package name */
    @l
    public final Float f246522G;

    /* renamed from: H, reason: collision with root package name */
    @l
    public final String f246523H;

    /* renamed from: I, reason: collision with root package name */
    @l
    public final String f246524I;

    /* renamed from: J, reason: collision with root package name */
    @l
    public final String f246525J;

    /* renamed from: K, reason: collision with root package name */
    @l
    public final List<TnsGalleryImage> f246526K;

    /* renamed from: L, reason: collision with root package name */
    @l
    public final List<BaseRatingReviewItem.ReviewTextSection> f246527L;

    /* renamed from: M, reason: collision with root package name */
    @l
    public final BaseRatingReviewItem.ReviewAnswer f246528M;

    /* renamed from: N, reason: collision with root package name */
    @l
    public final List<BaseRatingReviewItem.ReviewAction> f246529N;

    /* renamed from: O, reason: collision with root package name */
    @k
    public final RatingItemsMarginHorizontal f246530O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f246531P;

    /* renamed from: Q, reason: collision with root package name */
    public final boolean f246532Q;

    /* renamed from: R, reason: collision with root package name */
    public final boolean f246533R;

    /* renamed from: S, reason: collision with root package name */
    @l
    public final Map<String, Object> f246534S;

    /* renamed from: T, reason: collision with root package name */
    @l
    public final Boolean f246535T;

    /* renamed from: x, reason: collision with root package name */
    @k
    public final String f246536x;

    /* renamed from: y, reason: collision with root package name */
    @l
    public final Long f246537y;

    /* renamed from: z, reason: collision with root package name */
    @l
    public final Image f246538z;

    /* compiled from: RatingDetailsReviewItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingDetailsReviewItem> {
        @Override // android.os.Parcelable.Creator
        public final RatingDetailsReviewItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            LinkedHashMap linkedHashMap;
            Boolean boolValueOf;
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Image image = (Image) parcel.readParcelable(RatingDetailsReviewItem.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            BaseRatingReviewItem.ReviewStatus reviewStatusValueOf = BaseRatingReviewItem.ReviewStatus.valueOf(parcel.readString());
            String string5 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(RatingDetailsReviewItem.class.getClassLoader());
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(RatingDetailsReviewItem.class, parcel, arrayList4, iL2, 1);
                }
                arrayList = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(RatingDetailsReviewItem.class, parcel, arrayList5, iL3, 1);
                }
                arrayList2 = arrayList5;
            }
            BaseRatingReviewItem.ReviewAnswer reviewAnswer = (BaseRatingReviewItem.ReviewAnswer) parcel.readParcelable(RatingDetailsReviewItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i14);
                int iL4 = 0;
                while (iL4 != i14) {
                    iL4 = com.avito.android.actions_sheet.a.l(RatingDetailsReviewItem.class, parcel, arrayList6, iL4, 1);
                }
                arrayList3 = arrayList6;
            }
            RatingItemsMarginHorizontal ratingItemsMarginHorizontal = (RatingItemsMarginHorizontal) parcel.readParcelable(RatingDetailsReviewItem.class.getClassLoader());
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i15 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i15);
                int iC2 = 0;
                while (iC2 != i15) {
                    iC2 = h.c(RatingDetailsReviewItem.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                    linkedHashMap2 = linkedHashMap2;
                    i15 = i15;
                }
                linkedHashMap = linkedHashMap2;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RatingDetailsReviewItem(string, lValueOf, image, string2, string3, string4, reviewStatusValueOf, string5, attributedText, fValueOf, string6, string7, string8, arrayList, arrayList2, reviewAnswer, arrayList3, ratingItemsMarginHorizontal, z12, z13, z14, linkedHashMap, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingDetailsReviewItem[] newArray(int i12) {
            return new RatingDetailsReviewItem[i12];
        }
    }

    public /* synthetic */ RatingDetailsReviewItem(String str, Long l12, Image image, String str2, String str3, String str4, BaseRatingReviewItem.ReviewStatus reviewStatus, String str5, AttributedText attributedText, Float f12, String str6, String str7, String str8, List list, List list2, BaseRatingReviewItem.ReviewAnswer reviewAnswer, List list3, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, boolean z12, boolean z13, boolean z14, Map map, Boolean bool, int i12, C42822w c42822w) {
        this(str, l12, image, str2, str3, (i12 & 32) != 0 ? null : str4, reviewStatus, str5, attributedText, f12, str6, str7, str8, list, list2, reviewAnswer, list3, (i12 & 131072) != 0 ? RatingItemsMarginHorizontal.MarginLarge.f249853b : ratingItemsMarginHorizontal, (i12 & 262144) != 0 ? true : z12, (i12 & 524288) != 0 ? false : z13, z14, map, (i12 & 4194304) != 0 ? null : bool);
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    /* renamed from: A1, reason: from getter */
    public final boolean getF246531P() {
        return this.f246531P;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: B0, reason: from getter */
    public final BaseRatingReviewItem.ReviewAnswer getF246528M() {
        return this.f246528M;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: L, reason: from getter */
    public final AttributedText getF246521F() {
        return this.f246521F;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: P1, reason: from getter */
    public final String getF246523H() {
        return this.f246523H;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @k
    /* renamed from: Q1, reason: from getter */
    public final BaseRatingReviewItem.ReviewStatus getF246519D() {
        return this.f246519D;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: W, reason: from getter */
    public final String getF246525J() {
        return this.f246525J;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @k
    /* renamed from: c, reason: from getter */
    public final RatingItemsMarginHorizontal getF246530O() {
        return this.f246530O;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingDetailsReviewItem)) {
            return false;
        }
        RatingDetailsReviewItem ratingDetailsReviewItem = (RatingDetailsReviewItem) obj;
        return L.f(this.f246536x, ratingDetailsReviewItem.f246536x) && L.f(this.f246537y, ratingDetailsReviewItem.f246537y) && L.f(this.f246538z, ratingDetailsReviewItem.f246538z) && L.f(this.f246516A, ratingDetailsReviewItem.f246516A) && L.f(this.f246517B, ratingDetailsReviewItem.f246517B) && L.f(this.f246518C, ratingDetailsReviewItem.f246518C) && this.f246519D == ratingDetailsReviewItem.f246519D && L.f(this.f246520E, ratingDetailsReviewItem.f246520E) && L.f(this.f246521F, ratingDetailsReviewItem.f246521F) && L.f(this.f246522G, ratingDetailsReviewItem.f246522G) && L.f(this.f246523H, ratingDetailsReviewItem.f246523H) && L.f(this.f246524I, ratingDetailsReviewItem.f246524I) && L.f(this.f246525J, ratingDetailsReviewItem.f246525J) && L.f(this.f246526K, ratingDetailsReviewItem.f246526K) && L.f(this.f246527L, ratingDetailsReviewItem.f246527L) && L.f(this.f246528M, ratingDetailsReviewItem.f246528M) && L.f(this.f246529N, ratingDetailsReviewItem.f246529N) && L.f(this.f246530O, ratingDetailsReviewItem.f246530O) && this.f246531P == ratingDetailsReviewItem.f246531P && this.f246532Q == ratingDetailsReviewItem.f246532Q && this.f246533R == ratingDetailsReviewItem.f246533R && L.f(this.f246534S, ratingDetailsReviewItem.f246534S) && L.f(this.f246535T, ratingDetailsReviewItem.f246535T);
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    public final Map<String, Object> f() {
        return this.f246534S;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: g0, reason: from getter */
    public final String getF246524I() {
        return this.f246524I;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    public final List<BaseRatingReviewItem.ReviewAction> getActions() {
        return this.f246529N;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: getAvatar, reason: from getter */
    public final Image getF246538z() {
        return this.f246538z;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    public final List<TnsGalleryImage> getImages() {
        return this.f246526K;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: getName, reason: from getter */
    public final String getF246516A() {
        return this.f246516A;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: getRated, reason: from getter */
    public final String getF246517B() {
        return this.f246517B;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: getReviewId, reason: from getter */
    public final Long getF246537y() {
        return this.f246537y;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: getScore, reason: from getter */
    public final Float getF246522G() {
        return this.f246522G;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: getStatusText, reason: from getter */
    public final String getF246520E() {
        return this.f246520E;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF243099b() {
        return this.f246536x;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    public final List<BaseRatingReviewItem.ReviewTextSection> getTextSections() {
        return this.f246527L;
    }

    public final int hashCode() {
        int iHashCode = this.f246536x.hashCode() * 31;
        Long l12 = this.f246537y;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Image image = this.f246538z;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.f246516A;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f246517B;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f246518C;
        int iHashCode6 = (this.f246519D.hashCode() + ((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f246520E;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AttributedText attributedText = this.f246521F;
        int iHashCode8 = (iHashCode7 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Float f12 = this.f246522G;
        int iHashCode9 = (iHashCode8 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str5 = this.f246523H;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f246524I;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f246525J;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<TnsGalleryImage> list = this.f246526K;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseRatingReviewItem.ReviewTextSection> list2 = this.f246527L;
        int iHashCode14 = (iHashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BaseRatingReviewItem.ReviewAnswer reviewAnswer = this.f246528M;
        int iHashCode15 = (iHashCode14 + (reviewAnswer == null ? 0 : reviewAnswer.hashCode())) * 31;
        List<BaseRatingReviewItem.ReviewAction> list3 = this.f246529N;
        int i12 = r.i(r.i(r.i((this.f246530O.hashCode() + ((iHashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31)) * 31, 31, this.f246531P), 31, this.f246532Q), 31, this.f246533R);
        Map<String, Object> map = this.f246534S;
        int iHashCode16 = (i12 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.f246535T;
        return iHashCode16 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    /* renamed from: q1, reason: from getter */
    public final boolean getF246532Q() {
        return this.f246532Q;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingDetailsReviewItem(stringId=");
        sb2.append(this.f246536x);
        sb2.append(", reviewId=");
        sb2.append(this.f246537y);
        sb2.append(", avatar=");
        sb2.append(this.f246538z);
        sb2.append(", name=");
        sb2.append(this.f246516A);
        sb2.append(", rated=");
        sb2.append(this.f246517B);
        sb2.append(", caption=");
        sb2.append(this.f246518C);
        sb2.append(", status=");
        sb2.append(this.f246519D);
        sb2.append(", statusText=");
        sb2.append(this.f246520E);
        sb2.append(", attributedStatusText=");
        sb2.append(this.f246521F);
        sb2.append(", score=");
        sb2.append(this.f246522G);
        sb2.append(", stageTitle=");
        sb2.append(this.f246523H);
        sb2.append(", itemTitle=");
        sb2.append(this.f246524I);
        sb2.append(", deliveryTitle=");
        sb2.append(this.f246525J);
        sb2.append(", images=");
        sb2.append(this.f246526K);
        sb2.append(", textSections=");
        sb2.append(this.f246527L);
        sb2.append(", answer=");
        sb2.append(this.f246528M);
        sb2.append(", actions=");
        sb2.append(this.f246529N);
        sb2.append(", marginHorizontal=");
        sb2.append(this.f246530O);
        sb2.append(", shouldDarkenArbitrage=");
        sb2.append(this.f246531P);
        sb2.append(", itemTitleSingleLine=");
        sb2.append(this.f246532Q);
        sb2.append(", isStatusRedesign=");
        sb2.append(this.f246533R);
        sb2.append(", analyticsParams=");
        sb2.append(this.f246534S);
        sb2.append(", isSellerReview=");
        return C0.g(sb2, this.f246535T, ')');
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: w1, reason: from getter */
    public final String getF246518C() {
        return this.f246518C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f246536x);
        Long l12 = this.f246537y;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeParcelable(this.f246538z, i12);
        parcel.writeString(this.f246516A);
        parcel.writeString(this.f246517B);
        parcel.writeString(this.f246518C);
        parcel.writeString(this.f246519D.name());
        parcel.writeString(this.f246520E);
        parcel.writeParcelable(this.f246521F, i12);
        Float f12 = this.f246522G;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeString(this.f246523H);
        parcel.writeString(this.f246524I);
        parcel.writeString(this.f246525J);
        List<TnsGalleryImage> list = this.f246526K;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        List<BaseRatingReviewItem.ReviewTextSection> list2 = this.f246527L;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        parcel.writeParcelable(this.f246528M, i12);
        List<BaseRatingReviewItem.ReviewAction> list3 = this.f246529N;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), i12);
            }
        }
        parcel.writeParcelable(this.f246530O, i12);
        parcel.writeInt(this.f246531P ? 1 : 0);
        parcel.writeInt(this.f246532Q ? 1 : 0);
        parcel.writeInt(this.f246533R ? 1 : 0);
        Map<String, Object> map = this.f246534S;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        Boolean bool = this.f246535T;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    /* renamed from: y, reason: from getter */
    public final boolean getF246533R() {
        return this.f246533R;
    }

    public RatingDetailsReviewItem(@k String str, @l Long l12, @l Image image, @l String str2, @l String str3, @l String str4, @k BaseRatingReviewItem.ReviewStatus reviewStatus, @l String str5, @l AttributedText attributedText, @l Float f12, @l String str6, @l String str7, @l String str8, @l List<TnsGalleryImage> list, @l List<BaseRatingReviewItem.ReviewTextSection> list2, @l BaseRatingReviewItem.ReviewAnswer reviewAnswer, @l List<BaseRatingReviewItem.ReviewAction> list3, @k RatingItemsMarginHorizontal ratingItemsMarginHorizontal, boolean z12, boolean z13, boolean z14, @l Map<String, ? extends Object> map, @l Boolean bool) {
        super(l12, image, str2, str3, null, reviewStatus, str5, attributedText, f12, str6, str7, str8, list, list2, reviewAnswer, list3, null, ratingItemsMarginHorizontal, null, false, false, z14, null, 6029328, null);
        this.f246536x = str;
        this.f246537y = l12;
        this.f246538z = image;
        this.f246516A = str2;
        this.f246517B = str3;
        this.f246518C = str4;
        this.f246519D = reviewStatus;
        this.f246520E = str5;
        this.f246521F = attributedText;
        this.f246522G = f12;
        this.f246523H = str6;
        this.f246524I = str7;
        this.f246525J = str8;
        this.f246526K = list;
        this.f246527L = list2;
        this.f246528M = reviewAnswer;
        this.f246529N = list3;
        this.f246530O = ratingItemsMarginHorizontal;
        this.f246531P = z12;
        this.f246532Q = z13;
        this.f246533R = z14;
        this.f246534S = map;
        this.f246535T = bool;
    }
}
