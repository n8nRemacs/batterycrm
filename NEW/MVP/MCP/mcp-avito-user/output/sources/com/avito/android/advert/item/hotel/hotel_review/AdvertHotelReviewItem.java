package com.avito.android.advert.item.hotel.hotel_review;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.hotel.hotel_review.badges.AdvertHotelRatingBadgeItem;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertHotelReviewItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_review/AdvertHotelReviewItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertHotelReviewItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertHotelReviewItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f76229b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f76230c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SerpViewType f76231d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f76232e;

    /* renamed from: f, reason: collision with root package name */
    public final int f76233f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f76234g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f76235h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final List<AdvertHotelRatingBadgeItem> f76236i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final ButtonAction f76237j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final ParametrizedEvent f76238k;

    /* compiled from: AdvertHotelReviewItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertHotelReviewItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertHotelReviewItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AdvertHotelReviewItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(AdvertHotelRatingBadgeItem.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new AdvertHotelReviewItem(j12, string, serpViewTypeValueOf, serpDisplayTypeValueOf, i12, string2, attributedText, arrayList, (ButtonAction) parcel.readParcelable(AdvertHotelReviewItem.class.getClassLoader()), (ParametrizedEvent) parcel.readParcelable(AdvertHotelReviewItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertHotelReviewItem[] newArray(int i12) {
            return new AdvertHotelReviewItem[i12];
        }
    }

    public AdvertHotelReviewItem(long j12, @k String str, @k SerpViewType serpViewType, @k SerpDisplayType serpDisplayType, int i12, @l String str2, @l AttributedText attributedText, @l List<AdvertHotelRatingBadgeItem> list, @l ButtonAction buttonAction, @l ParametrizedEvent parametrizedEvent) {
        this.f76229b = j12;
        this.f76230c = str;
        this.f76231d = serpViewType;
        this.f76232e = serpDisplayType;
        this.f76233f = i12;
        this.f76234g = str2;
        this.f76235h = attributedText;
        this.f76236i = list;
        this.f76237j = buttonAction;
        this.f76238k = parametrizedEvent;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertHotelReviewItem(this.f76229b, this.f76230c, this.f76231d, this.f76232e, i12, this.f76234g, this.f76235h, this.f76236i, this.f76237j, this.f76238k);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f76232e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertHotelReviewItem)) {
            return false;
        }
        AdvertHotelReviewItem advertHotelReviewItem = (AdvertHotelReviewItem) obj;
        return this.f76229b == advertHotelReviewItem.f76229b && L.f(this.f76230c, advertHotelReviewItem.f76230c) && this.f76231d == advertHotelReviewItem.f76231d && this.f76232e == advertHotelReviewItem.f76232e && this.f76233f == advertHotelReviewItem.f76233f && L.f(this.f76234g, advertHotelReviewItem.f76234g) && L.f(this.f76235h, advertHotelReviewItem.f76235h) && L.f(this.f76236i, advertHotelReviewItem.f76236i) && L.f(this.f76237j, advertHotelReviewItem.f76237j) && L.f(this.f76238k, advertHotelReviewItem.f76238k);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF78300d() {
        return this.f76229b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78298b() {
        return this.f76233f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF76243b() {
        return this.f76230c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78302f() {
        return this.f76231d;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f76233f, com.avito.android.actions_sheet.a.h(this.f76232e, com.avito.android.actions_sheet.a.j(this.f76231d, H.d(Long.hashCode(this.f76229b) * 31, 31, this.f76230c), 31), 31), 31);
        String str = this.f76234g;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f76235h;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        List<AdvertHotelRatingBadgeItem> list = this.f76236i;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ButtonAction buttonAction = this.f76237j;
        int iHashCode4 = (iHashCode3 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.f76238k;
        return iHashCode4 + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertHotelReviewItem(id=");
        sb2.append(this.f76229b);
        sb2.append(", stringId=");
        sb2.append(this.f76230c);
        sb2.append(", viewType=");
        sb2.append(this.f76231d);
        sb2.append(", displayType=");
        sb2.append(this.f76232e);
        sb2.append(", spanCount=");
        sb2.append(this.f76233f);
        sb2.append(", title=");
        sb2.append(this.f76234g);
        sb2.append(", description=");
        sb2.append(this.f76235h);
        sb2.append(", badges=");
        sb2.append(this.f76236i);
        sb2.append(", actionButton=");
        sb2.append(this.f76237j);
        sb2.append(", onShowEvent=");
        return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.f76238k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f76229b);
        parcel.writeString(this.f76230c);
        parcel.writeString(this.f76231d.name());
        parcel.writeString(this.f76232e.name());
        parcel.writeInt(this.f76233f);
        parcel.writeString(this.f76234g);
        parcel.writeParcelable(this.f76235h, i12);
        List<AdvertHotelRatingBadgeItem> list = this.f76236i;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AdvertHotelRatingBadgeItem) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.f76237j, i12);
        parcel.writeParcelable(this.f76238k, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertHotelReviewItem(long j12, String str, SerpViewType serpViewType, SerpDisplayType serpDisplayType, int i12, String str2, AttributedText attributedText, List list, ButtonAction buttonAction, ParametrizedEvent parametrizedEvent, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 175;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, (i13 & 4) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, i12, str2, attributedText, list, buttonAction, parametrizedEvent);
    }
}
