package com.avito.android.advert.item.reviews.entries;

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
import com.avito.android.rating_ui.statistic.RatingStatisticRow;
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

/* compiled from: AdvertReviewsStatisticItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/reviews/entries/AdvertReviewsStatisticItem;", "Lcom/avito/android/rating_ui/statistic/a;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertReviewsStatisticItem implements com.avito.android.rating_ui.statistic.a, BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertReviewsStatisticItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78702b;

    /* renamed from: c, reason: collision with root package name */
    public final int f78703c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<RatingStatisticRow> f78704d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RatingItemsMarginHorizontal f78705e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f78706f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public SerpDisplayType f78707g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78708h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SerpViewType f78709i;

    /* compiled from: AdvertReviewsStatisticItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertReviewsStatisticItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertReviewsStatisticItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iL2 = 0;
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertReviewsStatisticItem.class, parcel, arrayList, iL2, 1);
            }
            return new AdvertReviewsStatisticItem(j12, i12, arrayList, (RatingItemsMarginHorizontal) parcel.readParcelable(AdvertReviewsStatisticItem.class.getClassLoader()), parcel.readString(), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt(), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertReviewsStatisticItem[] newArray(int i12) {
            return new AdvertReviewsStatisticItem[i12];
        }
    }

    public AdvertReviewsStatisticItem(long j12, int i12, @k List<RatingStatisticRow> list, @k RatingItemsMarginHorizontal ratingItemsMarginHorizontal, @k String str, @k SerpDisplayType serpDisplayType, int i13, @k SerpViewType serpViewType) {
        this.f78702b = j12;
        this.f78703c = i12;
        this.f78704d = list;
        this.f78705e = ratingItemsMarginHorizontal;
        this.f78706f = str;
        this.f78707g = serpDisplayType;
        this.f78708h = i13;
        this.f78709i = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertReviewsStatisticItem(this.f78702b, this.f78703c, this.f78704d, this.f78705e, this.f78706f, this.f78707g, i12, this.f78709i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f78707g = serpDisplayType;
    }

    @Override // com.avito.android.rating_ui.statistic.a
    @k
    /* renamed from: c, reason: from getter */
    public final RatingItemsMarginHorizontal getF250473e() {
        return this.f78705e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertReviewsStatisticItem)) {
            return false;
        }
        AdvertReviewsStatisticItem advertReviewsStatisticItem = (AdvertReviewsStatisticItem) obj;
        return this.f78702b == advertReviewsStatisticItem.f78702b && this.f78703c == advertReviewsStatisticItem.f78703c && L.f(this.f78704d, advertReviewsStatisticItem.f78704d) && L.f(this.f78705e, advertReviewsStatisticItem.f78705e) && L.f(this.f78706f, advertReviewsStatisticItem.f78706f) && this.f78707g == advertReviewsStatisticItem.f78707g && this.f78708h == advertReviewsStatisticItem.f78708h && this.f78709i == advertReviewsStatisticItem.f78709i;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75092b() {
        return this.f78702b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF264948c() {
        return this.f78708h;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF288411b() {
        return this.f78706f;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF264884g() {
        return this.f78709i;
    }

    public final int hashCode() {
        return this.f78709i.hashCode() + r.e(this.f78708h, com.avito.android.actions_sheet.a.h(this.f78707g, H.d((this.f78705e.hashCode() + H.e(r.e(this.f78703c, Long.hashCode(this.f78702b) * 31, 31), 31, this.f78704d)) * 31, 31, this.f78706f), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertReviewsStatisticItem(id=");
        sb2.append(this.f78702b);
        sb2.append(", reviewCount=");
        sb2.append(this.f78703c);
        sb2.append(", ratingStatistics=");
        sb2.append(this.f78704d);
        sb2.append(", marginHorizontal=");
        sb2.append(this.f78705e);
        sb2.append(", stringId=");
        sb2.append(this.f78706f);
        sb2.append(", displayType=");
        sb2.append(this.f78707g);
        sb2.append(", spanCount=");
        sb2.append(this.f78708h);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f78709i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f78702b);
        parcel.writeInt(this.f78703c);
        Iterator itJ = C0.j(this.f78704d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f78705e, i12);
        parcel.writeString(this.f78706f);
        parcel.writeString(this.f78707g.name());
        parcel.writeInt(this.f78708h);
        parcel.writeString(this.f78709i.name());
    }

    @Override // com.avito.android.rating_ui.statistic.a
    @k
    public final List<RatingStatisticRow> z() {
        return this.f78704d;
    }

    public /* synthetic */ AdvertReviewsStatisticItem(long j12, int i12, List list, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, String str, SerpDisplayType serpDisplayType, int i13, SerpViewType serpViewType, int i14, C42822w c42822w) {
        this(j12, i12, list, (i14 & 8) != 0 ? RatingItemsMarginHorizontal.MarginNormal.f249854b : ratingItemsMarginHorizontal, (i14 & 16) != 0 ? String.valueOf(j12) : str, (i14 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, i13, (i14 & 128) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
