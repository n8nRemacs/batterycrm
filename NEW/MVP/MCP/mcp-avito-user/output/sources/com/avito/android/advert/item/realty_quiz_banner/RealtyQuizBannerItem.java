package com.avito.android.advert.item.realty_quiz_banner;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RealtyQuizBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/realty_quiz_banner/RealtyQuizBannerItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RealtyQuizBannerItem implements BlockItem, l1 {

    @Y61.k
    public static final Parcelable.Creator<RealtyQuizBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f78348b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CharSequence f78349c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final CharSequence f78350d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CharSequence f78351e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final DeepLink f78352f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final CharSequence f78353g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final DeepLink f78354h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final DeepLink f78355i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f78356j = SerpViewType.f268585e;

    /* renamed from: k, reason: collision with root package name */
    public final long f78357k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final String f78358l;

    /* compiled from: RealtyQuizBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RealtyQuizBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final RealtyQuizBannerItem createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            return new RealtyQuizBannerItem(i12, (CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), (DeepLink) parcel.readParcelable(RealtyQuizBannerItem.class.getClassLoader()), (CharSequence) creator.createFromParcel(parcel), (DeepLink) parcel.readParcelable(RealtyQuizBannerItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(RealtyQuizBannerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RealtyQuizBannerItem[] newArray(int i12) {
            return new RealtyQuizBannerItem[i12];
        }
    }

    public RealtyQuizBannerItem(int i12, @Y61.k CharSequence charSequence, @Y61.k CharSequence charSequence2, @Y61.k CharSequence charSequence3, @Y61.k DeepLink deepLink, @Y61.k CharSequence charSequence4, @Y61.k DeepLink deepLink2, @Y61.k DeepLink deepLink3) {
        this.f78348b = i12;
        this.f78349c = charSequence;
        this.f78350d = charSequence2;
        this.f78351e = charSequence3;
        this.f78352f = deepLink;
        this.f78353g = charSequence4;
        this.f78354h = deepLink2;
        this.f78355i = deepLink3;
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        long j12 = 137;
        this.f78357k = j12;
        this.f78358l = String.valueOf(j12);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new RealtyQuizBannerItem(i12, this.f78349c, this.f78350d, this.f78351e, this.f78352f, this.f78353g, this.f78354h, this.f78355i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtyQuizBannerItem)) {
            return false;
        }
        RealtyQuizBannerItem realtyQuizBannerItem = (RealtyQuizBannerItem) obj;
        return this.f78348b == realtyQuizBannerItem.f78348b && L.f(this.f78349c, realtyQuizBannerItem.f78349c) && L.f(this.f78350d, realtyQuizBannerItem.f78350d) && L.f(this.f78351e, realtyQuizBannerItem.f78351e) && L.f(this.f78352f, realtyQuizBannerItem.f78352f) && L.f(this.f78353g, realtyQuizBannerItem.f78353g) && L.f(this.f78354h, realtyQuizBannerItem.f78354h) && L.f(this.f78355i, realtyQuizBannerItem.f78355i);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF78357k() {
        return this.f78357k;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78348b() {
        return this.f78348b;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF78358l() {
        return this.f78358l;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78356j() {
        return this.f78356j;
    }

    public final int hashCode() {
        return this.f78355i.hashCode() + com.avito.android.actions_sheet.a.e(this.f78354h, com.avito.android.advert.item.delivery_suggests.l.c(com.avito.android.actions_sheet.a.e(this.f78352f, com.avito.android.advert.item.delivery_suggests.l.c(com.avito.android.advert.item.delivery_suggests.l.c(com.avito.android.advert.item.delivery_suggests.l.c(Integer.hashCode(this.f78348b) * 31, 31, this.f78349c), 31, this.f78350d), 31, this.f78351e), 31), 31, this.f78353g), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RealtyQuizBannerItem(spanCount=");
        sb2.append(this.f78348b);
        sb2.append(", title=");
        sb2.append((Object) this.f78349c);
        sb2.append(", description=");
        sb2.append((Object) this.f78350d);
        sb2.append(", positiveTitle=");
        sb2.append((Object) this.f78351e);
        sb2.append(", positiveAction=");
        sb2.append(this.f78352f);
        sb2.append(", negativeTitle=");
        sb2.append((Object) this.f78353g);
        sb2.append(", negativeAction=");
        sb2.append(this.f78354h);
        sb2.append(", closeAction=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f78355i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f78348b);
        TextUtils.writeToParcel(this.f78349c, parcel, i12);
        TextUtils.writeToParcel(this.f78350d, parcel, i12);
        TextUtils.writeToParcel(this.f78351e, parcel, i12);
        parcel.writeParcelable(this.f78352f, i12);
        TextUtils.writeToParcel(this.f78353g, parcel, i12);
        parcel.writeParcelable(this.f78354h, i12);
        parcel.writeParcelable(this.f78355i, i12);
    }
}
