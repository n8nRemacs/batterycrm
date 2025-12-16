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
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertAttributedTextItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/reviews/entries/AdvertAttributedTextItem;", "Lcom/avito/android/rating_ui/attributed_text/a;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertAttributedTextItem implements com.avito.android.rating_ui.attributed_text.a, BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertAttributedTextItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78679b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public SerpDisplayType f78680c;

    /* renamed from: d, reason: collision with root package name */
    public final int f78681d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f78682e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f78683f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AttributedText f78684g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final RatingItemsMarginHorizontal f78685h;

    /* compiled from: AdvertAttributedTextItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertAttributedTextItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertAttributedTextItem createFromParcel(Parcel parcel) {
            return new AdvertAttributedTextItem(parcel.readLong(), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt(), SerpViewType.valueOf(parcel.readString()), parcel.readString(), (AttributedText) parcel.readParcelable(AdvertAttributedTextItem.class.getClassLoader()), (RatingItemsMarginHorizontal) parcel.readParcelable(AdvertAttributedTextItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertAttributedTextItem[] newArray(int i12) {
            return new AdvertAttributedTextItem[i12];
        }
    }

    public AdvertAttributedTextItem(long j12, @k SerpDisplayType serpDisplayType, int i12, @k SerpViewType serpViewType, @k String str, @k AttributedText attributedText, @k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        this.f78679b = j12;
        this.f78680c = serpDisplayType;
        this.f78681d = i12;
        this.f78682e = serpViewType;
        this.f78683f = str;
        this.f78684g = attributedText;
        this.f78685h = ratingItemsMarginHorizontal;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertAttributedTextItem(this.f78679b, this.f78680c, i12, this.f78682e, this.f78683f, this.f78684g, this.f78685h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f78680c = serpDisplayType;
    }

    @Override // com.avito.android.rating_ui.attributed_text.a
    @k
    /* renamed from: c, reason: from getter */
    public final RatingItemsMarginHorizontal getF78685h() {
        return this.f78685h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertAttributedTextItem)) {
            return false;
        }
        AdvertAttributedTextItem advertAttributedTextItem = (AdvertAttributedTextItem) obj;
        return this.f78679b == advertAttributedTextItem.f78679b && this.f78680c == advertAttributedTextItem.f78680c && this.f78681d == advertAttributedTextItem.f78681d && this.f78682e == advertAttributedTextItem.f78682e && L.f(this.f78683f, advertAttributedTextItem.f78683f) && L.f(this.f78684g, advertAttributedTextItem.f78684g) && L.f(this.f78685h, advertAttributedTextItem.f78685h);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF77948b() {
        return this.f78679b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF77950d() {
        return this.f78681d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF77949c() {
        return this.f78683f;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF77952f() {
        return this.f78682e;
    }

    public final int hashCode() {
        return this.f78685h.hashCode() + com.avito.android.actions_sheet.a.b(H.d(com.avito.android.actions_sheet.a.j(this.f78682e, r.e(this.f78681d, com.avito.android.actions_sheet.a.h(this.f78680c, Long.hashCode(this.f78679b) * 31, 31), 31), 31), 31, this.f78683f), 31, this.f78684g);
    }

    @Override // com.avito.android.rating_ui.attributed_text.a
    @k
    /* renamed from: n2, reason: from getter */
    public final AttributedText getF78684g() {
        return this.f78684g;
    }

    @k
    public final String toString() {
        return "AdvertAttributedTextItem(id=" + this.f78679b + ", displayType=" + this.f78680c + ", spanCount=" + this.f78681d + ", viewType=" + this.f78682e + ", stringId=" + this.f78683f + ", attributedText=" + this.f78684g + ", marginHorizontal=" + this.f78685h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f78679b);
        parcel.writeString(this.f78680c.name());
        parcel.writeInt(this.f78681d);
        parcel.writeString(this.f78682e.name());
        parcel.writeString(this.f78683f);
        parcel.writeParcelable(this.f78684g, i12);
        parcel.writeParcelable(this.f78685h, i12);
    }

    public /* synthetic */ AdvertAttributedTextItem(long j12, SerpDisplayType serpDisplayType, int i12, SerpViewType serpViewType, String str, AttributedText attributedText, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, int i13, C42822w c42822w) {
        this(j12, (i13 & 2) != 0 ? SerpDisplayType.Grid : serpDisplayType, i12, (i13 & 8) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 16) != 0 ? String.valueOf(j12) : str, attributedText, (i13 & 64) != 0 ? RatingItemsMarginHorizontal.MarginNormal.f249854b : ratingItemsMarginHorizontal);
    }
}
