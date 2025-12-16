package com.avito.android.travel_guest_profile.items.review;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
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
import org.webrtc.h;

/* compiled from: TravelGuestProfileReviewItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_guest_profile/items/review/TravelGuestProfileReviewItem;", "Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelGuestProfileReviewItem extends BaseRatingReviewItem {

    @k
    public static final Parcelable.Creator<TravelGuestProfileReviewItem> CREATOR = new a();

    /* renamed from: A, reason: collision with root package name */
    @l
    public final String f302107A;

    /* renamed from: B, reason: collision with root package name */
    @l
    public final String f302108B;

    /* renamed from: C, reason: collision with root package name */
    @l
    public final String f302109C;

    /* renamed from: D, reason: collision with root package name */
    @k
    public final BaseRatingReviewItem.ReviewStatus f302110D;

    /* renamed from: E, reason: collision with root package name */
    @l
    public final String f302111E;

    /* renamed from: F, reason: collision with root package name */
    @l
    public final AttributedText f302112F;

    /* renamed from: G, reason: collision with root package name */
    @l
    public final Float f302113G;

    /* renamed from: H, reason: collision with root package name */
    @l
    public final String f302114H;

    /* renamed from: I, reason: collision with root package name */
    @l
    public final String f302115I;

    /* renamed from: J, reason: collision with root package name */
    @l
    public final String f302116J;

    /* renamed from: K, reason: collision with root package name */
    @l
    public final List<TnsGalleryImage> f302117K;

    /* renamed from: L, reason: collision with root package name */
    @l
    public final List<BaseRatingReviewItem.ReviewTextSection> f302118L;

    /* renamed from: M, reason: collision with root package name */
    @l
    public final BaseRatingReviewItem.ReviewAnswer f302119M;

    /* renamed from: N, reason: collision with root package name */
    @l
    public final List<BaseRatingReviewItem.ReviewAction> f302120N;

    /* renamed from: O, reason: collision with root package name */
    @k
    public final RatingItemsMarginHorizontal f302121O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f302122P;

    /* renamed from: Q, reason: collision with root package name */
    public final boolean f302123Q;

    /* renamed from: R, reason: collision with root package name */
    public final boolean f302124R;

    /* renamed from: S, reason: collision with root package name */
    @l
    public final Map<String, Object> f302125S;

    /* renamed from: x, reason: collision with root package name */
    @k
    public final String f302126x;

    /* renamed from: y, reason: collision with root package name */
    @l
    public final Long f302127y;

    /* renamed from: z, reason: collision with root package name */
    @l
    public final Image f302128z;

    /* compiled from: TravelGuestProfileReviewItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TravelGuestProfileReviewItem> {
        @Override // android.os.Parcelable.Creator
        public final TravelGuestProfileReviewItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Image image = (Image) parcel.readParcelable(TravelGuestProfileReviewItem.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            BaseRatingReviewItem.ReviewStatus reviewStatusValueOf = BaseRatingReviewItem.ReviewStatus.valueOf(parcel.readString());
            String string5 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(TravelGuestProfileReviewItem.class.getClassLoader());
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
                    iL2 = com.avito.android.actions_sheet.a.l(TravelGuestProfileReviewItem.class, parcel, arrayList4, iL2, 1);
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
                    iL3 = com.avito.android.actions_sheet.a.l(TravelGuestProfileReviewItem.class, parcel, arrayList5, iL3, 1);
                }
                arrayList2 = arrayList5;
            }
            BaseRatingReviewItem.ReviewAnswer reviewAnswer = (BaseRatingReviewItem.ReviewAnswer) parcel.readParcelable(TravelGuestProfileReviewItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i14);
                int iL4 = 0;
                while (iL4 != i14) {
                    iL4 = com.avito.android.actions_sheet.a.l(TravelGuestProfileReviewItem.class, parcel, arrayList6, iL4, 1);
                }
                arrayList3 = arrayList6;
            }
            RatingItemsMarginHorizontal ratingItemsMarginHorizontal = (RatingItemsMarginHorizontal) parcel.readParcelable(TravelGuestProfileReviewItem.class.getClassLoader());
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
                    iC2 = h.c(TravelGuestProfileReviewItem.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                    linkedHashMap2 = linkedHashMap2;
                    i15 = i15;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new TravelGuestProfileReviewItem(string, lValueOf, image, string2, string3, string4, reviewStatusValueOf, string5, attributedText, fValueOf, string6, string7, string8, arrayList, arrayList2, reviewAnswer, arrayList3, ratingItemsMarginHorizontal, z12, z13, z14, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final TravelGuestProfileReviewItem[] newArray(int i12) {
            return new TravelGuestProfileReviewItem[i12];
        }
    }

    public /* synthetic */ TravelGuestProfileReviewItem(String str, Long l12, Image image, String str2, String str3, String str4, BaseRatingReviewItem.ReviewStatus reviewStatus, String str5, AttributedText attributedText, Float f12, String str6, String str7, String str8, List list, List list2, BaseRatingReviewItem.ReviewAnswer reviewAnswer, List list3, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, boolean z12, boolean z13, boolean z14, Map map, int i12, C42822w c42822w) {
        this(str, l12, image, str2, str3, (i12 & 32) != 0 ? null : str4, reviewStatus, str5, attributedText, f12, str6, str7, str8, list, list2, reviewAnswer, list3, (i12 & 131072) != 0 ? RatingItemsMarginHorizontal.MarginLarge.f249853b : ratingItemsMarginHorizontal, (i12 & 262144) != 0 ? true : z12, (i12 & 524288) != 0 ? false : z13, z14, map);
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    /* renamed from: A1, reason: from getter */
    public final boolean getF302122P() {
        return this.f302122P;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: B0, reason: from getter */
    public final BaseRatingReviewItem.ReviewAnswer getF302119M() {
        return this.f302119M;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: L, reason: from getter */
    public final AttributedText getF302112F() {
        return this.f302112F;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: P1, reason: from getter */
    public final String getF302114H() {
        return this.f302114H;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @k
    /* renamed from: Q1, reason: from getter */
    public final BaseRatingReviewItem.ReviewStatus getF302110D() {
        return this.f302110D;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: W, reason: from getter */
    public final String getF302116J() {
        return this.f302116J;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @k
    /* renamed from: c, reason: from getter */
    public final RatingItemsMarginHorizontal getF302121O() {
        return this.f302121O;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    public final Map<String, Object> f() {
        return this.f302125S;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: g0, reason: from getter */
    public final String getF302115I() {
        return this.f302115I;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    public final List<BaseRatingReviewItem.ReviewAction> getActions() {
        return this.f302120N;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: getAvatar, reason: from getter */
    public final Image getF302128z() {
        return this.f302128z;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    public final List<TnsGalleryImage> getImages() {
        return this.f302117K;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: getName, reason: from getter */
    public final String getF302107A() {
        return this.f302107A;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: getRated, reason: from getter */
    public final String getF302108B() {
        return this.f302108B;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: getReviewId, reason: from getter */
    public final Long getF302127y() {
        return this.f302127y;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: getScore, reason: from getter */
    public final Float getF302113G() {
        return this.f302113G;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: getStatusText, reason: from getter */
    public final String getF302111E() {
        return this.f302111E;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154219b() {
        return this.f302126x;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    public final List<BaseRatingReviewItem.ReviewTextSection> getTextSections() {
        return this.f302118L;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    /* renamed from: q1, reason: from getter */
    public final boolean getF302123Q() {
        return this.f302123Q;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: w1, reason: from getter */
    public final String getF302109C() {
        return this.f302109C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f302126x);
        Long l12 = this.f302127y;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeParcelable(this.f302128z, i12);
        parcel.writeString(this.f302107A);
        parcel.writeString(this.f302108B);
        parcel.writeString(this.f302109C);
        parcel.writeString(this.f302110D.name());
        parcel.writeString(this.f302111E);
        parcel.writeParcelable(this.f302112F, i12);
        Float f12 = this.f302113G;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeString(this.f302114H);
        parcel.writeString(this.f302115I);
        parcel.writeString(this.f302116J);
        List<TnsGalleryImage> list = this.f302117K;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        List<BaseRatingReviewItem.ReviewTextSection> list2 = this.f302118L;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        parcel.writeParcelable(this.f302119M, i12);
        List<BaseRatingReviewItem.ReviewAction> list3 = this.f302120N;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), i12);
            }
        }
        parcel.writeParcelable(this.f302121O, i12);
        parcel.writeInt(this.f302122P ? 1 : 0);
        parcel.writeInt(this.f302123Q ? 1 : 0);
        parcel.writeInt(this.f302124R ? 1 : 0);
        Map<String, Object> map = this.f302125S;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            h.h(parcel, (String) entry.getKey(), entry);
        }
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    /* renamed from: y, reason: from getter */
    public final boolean getF302124R() {
        return this.f302124R;
    }

    public TravelGuestProfileReviewItem(@k String str, @l Long l12, @l Image image, @l String str2, @l String str3, @l String str4, @k BaseRatingReviewItem.ReviewStatus reviewStatus, @l String str5, @l AttributedText attributedText, @l Float f12, @l String str6, @l String str7, @l String str8, @l List<TnsGalleryImage> list, @l List<BaseRatingReviewItem.ReviewTextSection> list2, @l BaseRatingReviewItem.ReviewAnswer reviewAnswer, @l List<BaseRatingReviewItem.ReviewAction> list3, @k RatingItemsMarginHorizontal ratingItemsMarginHorizontal, boolean z12, boolean z13, boolean z14, @l Map<String, ? extends Object> map) {
        super(l12, image, str2, str3, null, reviewStatus, str5, attributedText, f12, str6, str7, str8, list, list2, reviewAnswer, list3, null, ratingItemsMarginHorizontal, null, false, false, z14, null, 6029328, null);
        this.f302126x = str;
        this.f302127y = l12;
        this.f302128z = image;
        this.f302107A = str2;
        this.f302108B = str3;
        this.f302109C = str4;
        this.f302110D = reviewStatus;
        this.f302111E = str5;
        this.f302112F = attributedText;
        this.f302113G = f12;
        this.f302114H = str6;
        this.f302115I = str7;
        this.f302116J = str8;
        this.f302117K = list;
        this.f302118L = list2;
        this.f302119M = reviewAnswer;
        this.f302120N = list3;
        this.f302121O = ratingItemsMarginHorizontal;
        this.f302122P = z12;
        this.f302123Q = z13;
        this.f302124R = z14;
        this.f302125S = map;
    }
}
