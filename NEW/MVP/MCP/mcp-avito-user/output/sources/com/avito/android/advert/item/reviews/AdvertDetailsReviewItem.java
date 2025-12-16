package com.avito.android.advert.item.reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsReviewItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/reviews/AdvertDetailsReviewItem;", "Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsReviewItem extends BaseRatingReviewItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsReviewItem> CREATOR = new a();

    /* renamed from: A, reason: collision with root package name */
    @k
    public final String f78656A;

    /* renamed from: B, reason: collision with root package name */
    @k
    public final String f78657B;

    /* renamed from: C, reason: collision with root package name */
    @l
    public final Float f78658C;

    /* renamed from: D, reason: collision with root package name */
    @l
    public final String f78659D;

    /* renamed from: E, reason: collision with root package name */
    @l
    public final String f78660E;

    /* renamed from: F, reason: collision with root package name */
    @l
    public final List<BaseRatingReviewItem.ReviewTextSection> f78661F;

    /* renamed from: G, reason: collision with root package name */
    @k
    public final RatingItemsMarginHorizontal f78662G;

    /* renamed from: H, reason: collision with root package name */
    public final int f78663H;

    /* renamed from: I, reason: collision with root package name */
    @k
    public SerpDisplayType f78664I;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final SerpViewType f78665J;

    /* renamed from: x, reason: collision with root package name */
    public final long f78666x;

    /* renamed from: y, reason: collision with root package name */
    @k
    public final String f78667y;

    /* renamed from: z, reason: collision with root package name */
    @l
    public final Image f78668z;

    /* compiled from: AdvertDetailsReviewItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsReviewItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsReviewItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            Image image = (Image) parcel.readParcelable(AdvertDetailsReviewItem.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsReviewItem.class, parcel, arrayList, iL2, 1);
                }
            }
            return new AdvertDetailsReviewItem(j12, string, image, string2, string3, fValueOf, string4, string5, arrayList, (RatingItemsMarginHorizontal) parcel.readParcelable(AdvertDetailsReviewItem.class.getClassLoader()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsReviewItem[] newArray(int i12) {
            return new AdvertDetailsReviewItem[i12];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsReviewItem(long j12, String str, Image image, String str2, String str3, Float f12, String str4, String str5, List list, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 116;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, image, str2, str3, f12, str4, str5, list, (i13 & 512) != 0 ? RatingItemsMarginHorizontal.MarginNormal.f249854b : ratingItemsMarginHorizontal, i12, (i13 & 2048) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 4096) != 0 ? SerpViewType.f268585e : serpViewType);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsReviewItem(this.f78666x, this.f78667y, this.f78668z, this.f78656A, this.f78657B, this.f78658C, this.f78659D, this.f78660E, this.f78661F, this.f78662G, i12, this.f78664I, this.f78665J);
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: P1, reason: from getter */
    public final String getF302114H() {
        return this.f78659D;
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f78664I = serpDisplayType;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @k
    /* renamed from: c, reason: from getter */
    public final RatingItemsMarginHorizontal getF302121O() {
        return this.f78662G;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsReviewItem)) {
            return false;
        }
        AdvertDetailsReviewItem advertDetailsReviewItem = (AdvertDetailsReviewItem) obj;
        return this.f78666x == advertDetailsReviewItem.f78666x && L.f(this.f78667y, advertDetailsReviewItem.f78667y) && L.f(this.f78668z, advertDetailsReviewItem.f78668z) && L.f(this.f78656A, advertDetailsReviewItem.f78656A) && L.f(this.f78657B, advertDetailsReviewItem.f78657B) && L.f(this.f78658C, advertDetailsReviewItem.f78658C) && L.f(this.f78659D, advertDetailsReviewItem.f78659D) && L.f(this.f78660E, advertDetailsReviewItem.f78660E) && L.f(this.f78661F, advertDetailsReviewItem.f78661F) && L.f(this.f78662G, advertDetailsReviewItem.f78662G) && this.f78663H == advertDetailsReviewItem.f78663H && this.f78664I == advertDetailsReviewItem.f78664I && this.f78665J == advertDetailsReviewItem.f78665J;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: g0, reason: from getter */
    public final String getF302115I() {
        return this.f78660E;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: getAvatar, reason: from getter */
    public final Image getF302128z() {
        return this.f78668z;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem, TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF83283e() {
        return this.f78666x;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @k
    /* renamed from: getName, reason: from getter */
    public final String getF302107A() {
        return this.f78656A;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @k
    /* renamed from: getRated, reason: from getter */
    public final String getF302108B() {
        return this.f78657B;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    /* renamed from: getScore, reason: from getter */
    public final Float getF302113G() {
        return this.f78658C;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF83284f() {
        return this.f78663H;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF83282d() {
        return this.f78667y;
    }

    @Override // com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem
    @l
    public final List<BaseRatingReviewItem.ReviewTextSection> getTextSections() {
        return this.f78661F;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF83286h() {
        return this.f78665J;
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f78666x) * 31, 31, this.f78667y);
        Image image = this.f78668z;
        int iD3 = H.d(H.d((iD2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f78656A), 31, this.f78657B);
        Float f12 = this.f78658C;
        int iHashCode = (iD3 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str = this.f78659D;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f78660E;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseRatingReviewItem.ReviewTextSection> list = this.f78661F;
        return this.f78665J.hashCode() + com.avito.android.actions_sheet.a.h(this.f78664I, r.e(this.f78663H, (this.f78662G.hashCode() + ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsReviewItem(id=");
        sb2.append(this.f78666x);
        sb2.append(", stringId=");
        sb2.append(this.f78667y);
        sb2.append(", avatar=");
        sb2.append(this.f78668z);
        sb2.append(", name=");
        sb2.append(this.f78656A);
        sb2.append(", rated=");
        sb2.append(this.f78657B);
        sb2.append(", score=");
        sb2.append(this.f78658C);
        sb2.append(", stageTitle=");
        sb2.append(this.f78659D);
        sb2.append(", itemTitle=");
        sb2.append(this.f78660E);
        sb2.append(", textSections=");
        sb2.append(this.f78661F);
        sb2.append(", marginHorizontal=");
        sb2.append(this.f78662G);
        sb2.append(", spanCount=");
        sb2.append(this.f78663H);
        sb2.append(", displayType=");
        sb2.append(this.f78664I);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f78665J, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f78666x);
        parcel.writeString(this.f78667y);
        parcel.writeParcelable(this.f78668z, i12);
        parcel.writeString(this.f78656A);
        parcel.writeString(this.f78657B);
        Float f12 = this.f78658C;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeString(this.f78659D);
        parcel.writeString(this.f78660E);
        List<BaseRatingReviewItem.ReviewTextSection> list = this.f78661F;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f78662G, i12);
        parcel.writeInt(this.f78663H);
        parcel.writeString(this.f78664I.name());
        parcel.writeString(this.f78665J.name());
    }

    public AdvertDetailsReviewItem(long j12, @k String str, @l Image image, @k String str2, @k String str3, @l Float f12, @l String str4, @l String str5, @l List<BaseRatingReviewItem.ReviewTextSection> list, @k RatingItemsMarginHorizontal ratingItemsMarginHorizontal, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        super(null, image, str2, str3, null, BaseRatingReviewItem.ReviewStatus.f250323b, null, null, f12, str4, str5, null, null, list, null, null, null, ratingItemsMarginHorizontal, null, false, false, false, null, 6029328, null);
        this.f78666x = j12;
        this.f78667y = str;
        this.f78668z = image;
        this.f78656A = str2;
        this.f78657B = str3;
        this.f78658C = f12;
        this.f78659D = str4;
        this.f78660E = str5;
        this.f78661F = list;
        this.f78662G = ratingItemsMarginHorizontal;
        this.f78663H = i12;
        this.f78664I = serpDisplayType;
        this.f78665J = serpViewType;
    }
}
