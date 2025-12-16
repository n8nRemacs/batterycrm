package com.avito.android.rating_ui.lmm_summary;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.rating_ui.lmm_summary.BaseRatingLLMSummaryItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingLLMSummaryItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/lmm_summary/RatingLLMSummaryItem;", "Lcom/avito/android/rating_ui/lmm_summary/BaseRatingLLMSummaryItem;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingLLMSummaryItem extends BaseRatingLLMSummaryItem {

    @k
    public static final Parcelable.Creator<RatingLLMSummaryItem> CREATOR = new a();

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f250066g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final BaseRatingLLMSummaryItem.Title f250067h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final ArrayList f250068i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final ArrayList f250069j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final BaseRatingLLMSummaryItem.FeedbackSent f250070k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f250071l;

    /* compiled from: RatingLLMSummaryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingLLMSummaryItem> {
        @Override // android.os.Parcelable.Creator
        public final RatingLLMSummaryItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            BaseRatingLLMSummaryItem.Title titleCreateFromParcel = BaseRatingLLMSummaryItem.Title.CREATOR.createFromParcel(parcel);
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(BaseRatingLLMSummaryItem.Section.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = com.avito.android.actions_sheet.a.c(BaseRatingLLMSummaryItem.Button.CREATOR, parcel, arrayList2, iC3, 1);
                }
            }
            return new RatingLLMSummaryItem(string, titleCreateFromParcel, arrayList, arrayList2, BaseRatingLLMSummaryItem.FeedbackSent.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingLLMSummaryItem[] newArray(int i12) {
            return new RatingLLMSummaryItem[i12];
        }
    }

    public RatingLLMSummaryItem(@k String str, @k BaseRatingLLMSummaryItem.Title title, @l ArrayList arrayList, @l ArrayList arrayList2, @k BaseRatingLLMSummaryItem.FeedbackSent feedbackSent, boolean z12) {
        super(title, arrayList, arrayList2, feedbackSent, z12);
        this.f250066g = str;
        this.f250067h = title;
        this.f250068i = arrayList;
        this.f250069j = arrayList2;
        this.f250070k = feedbackSent;
        this.f250071l = z12;
    }

    @Override // com.avito.android.rating_ui.lmm_summary.BaseRatingLLMSummaryItem
    public final void A1() {
        this.f250071l = false;
    }

    @Override // com.avito.android.rating_ui.lmm_summary.BaseRatingLLMSummaryItem
    @k
    /* renamed from: L, reason: from getter */
    public final BaseRatingLLMSummaryItem.FeedbackSent getF250056e() {
        return this.f250070k;
    }

    @Override // com.avito.android.rating_ui.lmm_summary.BaseRatingLLMSummaryItem
    @l
    public final List<BaseRatingLLMSummaryItem.Section> W() {
        return this.f250068i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingLLMSummaryItem)) {
            return false;
        }
        RatingLLMSummaryItem ratingLLMSummaryItem = (RatingLLMSummaryItem) obj;
        return L.f(this.f250066g, ratingLLMSummaryItem.f250066g) && L.f(this.f250067h, ratingLLMSummaryItem.f250067h) && L.f(this.f250068i, ratingLLMSummaryItem.f250068i) && L.f(this.f250069j, ratingLLMSummaryItem.f250069j) && L.f(this.f250070k, ratingLLMSummaryItem.f250070k) && this.f250071l == ratingLLMSummaryItem.f250071l;
    }

    @Override // com.avito.android.rating_ui.lmm_summary.BaseRatingLLMSummaryItem
    @l
    public final List<BaseRatingLLMSummaryItem.Button> f() {
        return this.f250069j;
    }

    @Override // com.avito.android.rating_ui.lmm_summary.BaseRatingLLMSummaryItem
    /* renamed from: g0, reason: from getter */
    public final boolean getF250057f() {
        return this.f250071l;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF251943b() {
        return this.f250066g;
    }

    public final int hashCode() {
        int iHashCode = (this.f250067h.hashCode() + (this.f250066g.hashCode() * 31)) * 31;
        ArrayList arrayList = this.f250068i;
        int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f250069j;
        return Boolean.hashCode(this.f250071l) + ((this.f250070k.hashCode() + ((iHashCode2 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31)) * 31);
    }

    @Override // com.avito.android.rating_ui.lmm_summary.BaseRatingLLMSummaryItem
    @k
    /* renamed from: q1, reason: from getter */
    public final BaseRatingLLMSummaryItem.Title getF250053b() {
        return this.f250067h;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingLLMSummaryItem(stringId=");
        sb2.append(this.f250066g);
        sb2.append(", title=");
        sb2.append(this.f250067h);
        sb2.append(", sections=");
        sb2.append(this.f250068i);
        sb2.append(", buttons=");
        sb2.append(this.f250069j);
        sb2.append(", feedbackSent=");
        sb2.append(this.f250070k);
        sb2.append(", shouldShowButtons=");
        return r.x(sb2, this.f250071l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f250066g);
        this.f250067h.writeToParcel(parcel, i12);
        ArrayList arrayList = this.f250068i;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                ((BaseRatingLLMSummaryItem.Section) itY.next()).writeToParcel(parcel, i12);
            }
        }
        ArrayList arrayList2 = this.f250069j;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY2 = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList2);
            while (itY2.hasNext()) {
                ((BaseRatingLLMSummaryItem.Button) itY2.next()).writeToParcel(parcel, i12);
            }
        }
        this.f250070k.writeToParcel(parcel, i12);
        parcel.writeInt(this.f250071l ? 1 : 0);
    }
}
