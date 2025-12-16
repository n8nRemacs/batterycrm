package com.avito.android.advert.item.reviews.info;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsReviewsInfoItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/reviews/info/AdvertDetailsReviewsInfoItem;", "Lcom/avito/android/rating_ui/info/a;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsReviewsInfoItem implements com.avito.android.rating_ui.info.a, BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsReviewsInfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78710b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f78711c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f78712d;

    /* renamed from: e, reason: collision with root package name */
    public final int f78713e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final RatingItemsMarginHorizontal f78714f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public SerpDisplayType f78715g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78716h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SerpViewType f78717i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f78718j;

    /* compiled from: AdvertDetailsReviewsInfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsReviewsInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsReviewsInfoItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsReviewsInfoItem(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), (RatingItemsMarginHorizontal) parcel.readParcelable(AdvertDetailsReviewsInfoItem.class.getClassLoader()), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt(), SerpViewType.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsReviewsInfoItem[] newArray(int i12) {
            return new AdvertDetailsReviewsInfoItem[i12];
        }
    }

    public AdvertDetailsReviewsInfoItem(long j12, @l String str, @l String str2, int i12, @k RatingItemsMarginHorizontal ratingItemsMarginHorizontal, @k SerpDisplayType serpDisplayType, int i13, @k SerpViewType serpViewType, @k String str3) {
        this.f78710b = j12;
        this.f78711c = str;
        this.f78712d = str2;
        this.f78713e = i12;
        this.f78714f = ratingItemsMarginHorizontal;
        this.f78715g = serpDisplayType;
        this.f78716h = i13;
        this.f78717i = serpViewType;
        this.f78718j = str3;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsReviewsInfoItem(this.f78710b, this.f78711c, this.f78712d, this.f78713e, this.f78714f, this.f78715g, i12, this.f78717i, this.f78718j);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f78715g = serpDisplayType;
    }

    @Override // com.avito.android.rating_ui.info.a
    @k
    /* renamed from: c, reason: from getter */
    public final RatingItemsMarginHorizontal getF78714f() {
        return this.f78714f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsReviewsInfoItem)) {
            return false;
        }
        AdvertDetailsReviewsInfoItem advertDetailsReviewsInfoItem = (AdvertDetailsReviewsInfoItem) obj;
        return this.f78710b == advertDetailsReviewsInfoItem.f78710b && L.f(this.f78711c, advertDetailsReviewsInfoItem.f78711c) && L.f(this.f78712d, advertDetailsReviewsInfoItem.f78712d) && this.f78713e == advertDetailsReviewsInfoItem.f78713e && L.f(this.f78714f, advertDetailsReviewsInfoItem.f78714f) && this.f78715g == advertDetailsReviewsInfoItem.f78715g && this.f78716h == advertDetailsReviewsInfoItem.f78716h && this.f78717i == advertDetailsReviewsInfoItem.f78717i && L.f(this.f78718j, advertDetailsReviewsInfoItem.f78718j);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF268422b() {
        return this.f78710b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF268372C() {
        return this.f78716h;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF298989b() {
        return this.f78718j;
    }

    @Override // com.avito.android.rating_ui.info.a
    @l
    /* renamed from: getSubtitle, reason: from getter */
    public final String getF78712d() {
        return this.f78712d;
    }

    @Override // com.avito.android.rating_ui.info.a
    @l
    /* renamed from: getTitle, reason: from getter */
    public final String getF78711c() {
        return this.f78711c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF268374D() {
        return this.f78717i;
    }

    @Override // com.avito.android.rating_ui.info.a
    /* renamed from: h, reason: from getter */
    public final int getF78713e() {
        return this.f78713e;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f78710b) * 31;
        String str = this.f78711c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f78712d;
        return this.f78718j.hashCode() + com.avito.android.actions_sheet.a.j(this.f78717i, r.e(this.f78716h, com.avito.android.actions_sheet.a.h(this.f78715g, (this.f78714f.hashCode() + r.e(this.f78713e, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31)) * 31, 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsReviewsInfoItem(id=");
        sb2.append(this.f78710b);
        sb2.append(", title=");
        sb2.append(this.f78711c);
        sb2.append(", subtitle=");
        sb2.append(this.f78712d);
        sb2.append(", styleAttr=");
        sb2.append(this.f78713e);
        sb2.append(", marginHorizontal=");
        sb2.append(this.f78714f);
        sb2.append(", displayType=");
        sb2.append(this.f78715g);
        sb2.append(", spanCount=");
        sb2.append(this.f78716h);
        sb2.append(", viewType=");
        sb2.append(this.f78717i);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f78718j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f78710b);
        parcel.writeString(this.f78711c);
        parcel.writeString(this.f78712d);
        parcel.writeInt(this.f78713e);
        parcel.writeParcelable(this.f78714f, i12);
        parcel.writeString(this.f78715g.name());
        parcel.writeInt(this.f78716h);
        parcel.writeString(this.f78717i.name());
        parcel.writeString(this.f78718j);
    }

    public /* synthetic */ AdvertDetailsReviewsInfoItem(long j12, String str, String str2, int i12, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, SerpDisplayType serpDisplayType, int i13, SerpViewType serpViewType, String str3, int i14, C42822w c42822w) {
        this(j12, str, str2, i12, (i14 & 16) != 0 ? RatingItemsMarginHorizontal.MarginNormal.f249854b : ratingItemsMarginHorizontal, (i14 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, i13, (i14 & 128) != 0 ? SerpViewType.f268585e : serpViewType, (i14 & 256) != 0 ? String.valueOf(j12) : str3);
    }
}
