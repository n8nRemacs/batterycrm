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
import com.avito.android.rating_ui.lmm_summary.BaseRatingLLMSummaryItem;
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

/* compiled from: AdvertDetailsRatingLLMSummaryItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/reviews/AdvertDetailsRatingLLMSummaryItem;", "Lcom/avito/android/rating_ui/lmm_summary/BaseRatingLLMSummaryItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsRatingLLMSummaryItem extends BaseRatingLLMSummaryItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsRatingLLMSummaryItem> CREATOR = new a();

    /* renamed from: g, reason: collision with root package name */
    public final long f78646g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f78647h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final BaseRatingLLMSummaryItem.Title f78648i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final List<BaseRatingLLMSummaryItem.Section> f78649j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final List<BaseRatingLLMSummaryItem.Button> f78650k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final BaseRatingLLMSummaryItem.FeedbackSent f78651l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f78652m;

    /* renamed from: n, reason: collision with root package name */
    public final int f78653n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public SerpDisplayType f78654o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final SerpViewType f78655p;

    /* compiled from: AdvertDetailsRatingLLMSummaryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsRatingLLMSummaryItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsRatingLLMSummaryItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            BaseRatingLLMSummaryItem.Title title = (BaseRatingLLMSummaryItem.Title) parcel.readParcelable(AdvertDetailsRatingLLMSummaryItem.class.getClassLoader());
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsRatingLLMSummaryItem.class, parcel, arrayList3, iL2, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(AdvertDetailsRatingLLMSummaryItem.class, parcel, arrayList4, iL3, 1);
                }
                arrayList2 = arrayList4;
            }
            return new AdvertDetailsRatingLLMSummaryItem(j12, string, title, arrayList, arrayList2, (BaseRatingLLMSummaryItem.FeedbackSent) parcel.readParcelable(AdvertDetailsRatingLLMSummaryItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsRatingLLMSummaryItem[] newArray(int i12) {
            return new AdvertDetailsRatingLLMSummaryItem[i12];
        }
    }

    public /* synthetic */ AdvertDetailsRatingLLMSummaryItem(long j12, String str, BaseRatingLLMSummaryItem.Title title, List list, List list2, BaseRatingLLMSummaryItem.FeedbackSent feedbackSent, boolean z12, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(j12, (i13 & 2) != 0 ? String.valueOf(j12) : str, title, list, list2, feedbackSent, z12, i12, (i13 & 256) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 512) != 0 ? SerpViewType.f268585e : serpViewType);
    }

    @Override // com.avito.android.rating_ui.lmm_summary.BaseRatingLLMSummaryItem
    public final void A1() {
        this.f78652m = false;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsRatingLLMSummaryItem(this.f78646g, this.f78647h, this.f78648i, this.f78649j, this.f78650k, this.f78651l, this.f78652m, i12, this.f78654o, this.f78655p);
    }

    @Override // com.avito.android.rating_ui.lmm_summary.BaseRatingLLMSummaryItem
    @k
    /* renamed from: L, reason: from getter */
    public final BaseRatingLLMSummaryItem.FeedbackSent getF250070k() {
        return this.f78651l;
    }

    @Override // com.avito.android.rating_ui.lmm_summary.BaseRatingLLMSummaryItem
    @l
    public final List<BaseRatingLLMSummaryItem.Section> W() {
        return this.f78649j;
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f78654o = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsRatingLLMSummaryItem)) {
            return false;
        }
        AdvertDetailsRatingLLMSummaryItem advertDetailsRatingLLMSummaryItem = (AdvertDetailsRatingLLMSummaryItem) obj;
        return this.f78646g == advertDetailsRatingLLMSummaryItem.f78646g && L.f(this.f78647h, advertDetailsRatingLLMSummaryItem.f78647h) && L.f(this.f78648i, advertDetailsRatingLLMSummaryItem.f78648i) && L.f(this.f78649j, advertDetailsRatingLLMSummaryItem.f78649j) && L.f(this.f78650k, advertDetailsRatingLLMSummaryItem.f78650k) && L.f(this.f78651l, advertDetailsRatingLLMSummaryItem.f78651l) && this.f78652m == advertDetailsRatingLLMSummaryItem.f78652m && this.f78653n == advertDetailsRatingLLMSummaryItem.f78653n && this.f78654o == advertDetailsRatingLLMSummaryItem.f78654o && this.f78655p == advertDetailsRatingLLMSummaryItem.f78655p;
    }

    @Override // com.avito.android.rating_ui.lmm_summary.BaseRatingLLMSummaryItem
    @l
    public final List<BaseRatingLLMSummaryItem.Button> f() {
        return this.f78650k;
    }

    @Override // com.avito.android.rating_ui.lmm_summary.BaseRatingLLMSummaryItem
    /* renamed from: g0, reason: from getter */
    public final boolean getF250071l() {
        return this.f78652m;
    }

    @Override // com.avito.android.rating_ui.lmm_summary.BaseRatingLLMSummaryItem, TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF85216b() {
        return this.f78646g;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272456g() {
        return this.f78653n;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272451b() {
        return this.f78647h;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF272455f() {
        return this.f78655p;
    }

    public final int hashCode() {
        int iHashCode = (this.f78648i.hashCode() + H.d(Long.hashCode(this.f78646g) * 31, 31, this.f78647h)) * 31;
        List<BaseRatingLLMSummaryItem.Section> list = this.f78649j;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseRatingLLMSummaryItem.Button> list2 = this.f78650k;
        return this.f78655p.hashCode() + com.avito.android.actions_sheet.a.h(this.f78654o, r.e(this.f78653n, r.i((this.f78651l.hashCode() + ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31)) * 31, 31, this.f78652m), 31), 31);
    }

    @Override // com.avito.android.rating_ui.lmm_summary.BaseRatingLLMSummaryItem
    @k
    /* renamed from: q1, reason: from getter */
    public final BaseRatingLLMSummaryItem.Title getF250067h() {
        return this.f78648i;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsRatingLLMSummaryItem(id=");
        sb2.append(this.f78646g);
        sb2.append(", stringId=");
        sb2.append(this.f78647h);
        sb2.append(", title=");
        sb2.append(this.f78648i);
        sb2.append(", sections=");
        sb2.append(this.f78649j);
        sb2.append(", buttons=");
        sb2.append(this.f78650k);
        sb2.append(", feedbackSent=");
        sb2.append(this.f78651l);
        sb2.append(", shouldShowButtons=");
        sb2.append(this.f78652m);
        sb2.append(", spanCount=");
        sb2.append(this.f78653n);
        sb2.append(", displayType=");
        sb2.append(this.f78654o);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f78655p, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f78646g);
        parcel.writeString(this.f78647h);
        parcel.writeParcelable(this.f78648i, i12);
        List<BaseRatingLLMSummaryItem.Section> list = this.f78649j;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        List<BaseRatingLLMSummaryItem.Button> list2 = this.f78650k;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        parcel.writeParcelable(this.f78651l, i12);
        parcel.writeInt(this.f78652m ? 1 : 0);
        parcel.writeInt(this.f78653n);
        parcel.writeString(this.f78654o.name());
        parcel.writeString(this.f78655p.name());
    }

    public AdvertDetailsRatingLLMSummaryItem(long j12, @k String str, @k BaseRatingLLMSummaryItem.Title title, @l List<BaseRatingLLMSummaryItem.Section> list, @l List<BaseRatingLLMSummaryItem.Button> list2, @k BaseRatingLLMSummaryItem.FeedbackSent feedbackSent, boolean z12, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        super(title, list, list2, feedbackSent, z12);
        this.f78646g = j12;
        this.f78647h = str;
        this.f78648i = title;
        this.f78649j = list;
        this.f78650k = list2;
        this.f78651l = feedbackSent;
        this.f78652m = z12;
        this.f78653n = i12;
        this.f78654o = serpDisplayType;
        this.f78655p = serpViewType;
    }
}
