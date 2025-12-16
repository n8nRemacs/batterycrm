package com.avito.android.advert.item.hotel.hotel_promo_widget;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.hotel.model.HotelPromoWidgetPosition;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertHotelPromoWidgetItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_promo_widget/AdvertHotelPromoWidgetItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertHotelPromoWidgetItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertHotelPromoWidgetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f76203b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f76204c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SerpViewType f76205d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f76206e;

    /* renamed from: f, reason: collision with root package name */
    public final int f76207f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ParametrizedEvent f76208g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f76209h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final AttributedText f76210i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final UniversalImage f76211j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final ButtonAction f76212k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final HotelPromoWidgetPosition f76213l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final UniversalColor f76214m;

    /* compiled from: AdvertHotelPromoWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertHotelPromoWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertHotelPromoWidgetItem createFromParcel(Parcel parcel) {
            return new AdvertHotelPromoWidgetItem(parcel.readLong(), parcel.readString(), SerpViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt(), (ParametrizedEvent) parcel.readParcelable(AdvertHotelPromoWidgetItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(AdvertHotelPromoWidgetItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(AdvertHotelPromoWidgetItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(AdvertHotelPromoWidgetItem.class.getClassLoader()), (ButtonAction) parcel.readParcelable(AdvertHotelPromoWidgetItem.class.getClassLoader()), (HotelPromoWidgetPosition) parcel.readParcelable(AdvertHotelPromoWidgetItem.class.getClassLoader()), (UniversalColor) parcel.readParcelable(AdvertHotelPromoWidgetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertHotelPromoWidgetItem[] newArray(int i12) {
            return new AdvertHotelPromoWidgetItem[i12];
        }
    }

    public AdvertHotelPromoWidgetItem(long j12, @k String str, @k SerpViewType serpViewType, @k SerpDisplayType serpDisplayType, int i12, @l ParametrizedEvent parametrizedEvent, @l AttributedText attributedText, @l AttributedText attributedText2, @l UniversalImage universalImage, @l ButtonAction buttonAction, @k HotelPromoWidgetPosition hotelPromoWidgetPosition, @l UniversalColor universalColor) {
        this.f76203b = j12;
        this.f76204c = str;
        this.f76205d = serpViewType;
        this.f76206e = serpDisplayType;
        this.f76207f = i12;
        this.f76208g = parametrizedEvent;
        this.f76209h = attributedText;
        this.f76210i = attributedText2;
        this.f76211j = universalImage;
        this.f76212k = buttonAction;
        this.f76213l = hotelPromoWidgetPosition;
        this.f76214m = universalColor;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertHotelPromoWidgetItem(this.f76203b, this.f76204c, this.f76205d, this.f76206e, i12, this.f76208g, this.f76209h, this.f76210i, this.f76211j, this.f76212k, this.f76213l, this.f76214m);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f76206e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertHotelPromoWidgetItem)) {
            return false;
        }
        AdvertHotelPromoWidgetItem advertHotelPromoWidgetItem = (AdvertHotelPromoWidgetItem) obj;
        return this.f76203b == advertHotelPromoWidgetItem.f76203b && L.f(this.f76204c, advertHotelPromoWidgetItem.f76204c) && this.f76205d == advertHotelPromoWidgetItem.f76205d && this.f76206e == advertHotelPromoWidgetItem.f76206e && this.f76207f == advertHotelPromoWidgetItem.f76207f && L.f(this.f76208g, advertHotelPromoWidgetItem.f76208g) && L.f(this.f76209h, advertHotelPromoWidgetItem.f76209h) && L.f(this.f76210i, advertHotelPromoWidgetItem.f76210i) && L.f(this.f76211j, advertHotelPromoWidgetItem.f76211j) && L.f(this.f76212k, advertHotelPromoWidgetItem.f76212k) && this.f76213l == advertHotelPromoWidgetItem.f76213l && L.f(this.f76214m, advertHotelPromoWidgetItem.f76214m);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final HotelPromoWidgetPosition getF76213l() {
        return this.f76213l;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF79989b() {
        return this.f76203b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF268904i() {
        return this.f76207f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283214b() {
        return this.f76204c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF268903h() {
        return this.f76205d;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f76207f, com.avito.android.actions_sheet.a.h(this.f76206e, com.avito.android.actions_sheet.a.j(this.f76205d, H.d(Long.hashCode(this.f76203b) * 31, 31, this.f76204c), 31), 31), 31);
        ParametrizedEvent parametrizedEvent = this.f76208g;
        int iHashCode = (iE2 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        AttributedText attributedText = this.f76209h;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f76210i;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        UniversalImage universalImage = this.f76211j;
        int iHashCode4 = (iHashCode3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        ButtonAction buttonAction = this.f76212k;
        int iHashCode5 = (this.f76213l.hashCode() + ((iHashCode4 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31)) * 31;
        UniversalColor universalColor = this.f76214m;
        return iHashCode5 + (universalColor != null ? universalColor.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertHotelPromoWidgetItem(id=");
        sb2.append(this.f76203b);
        sb2.append(", stringId=");
        sb2.append(this.f76204c);
        sb2.append(", viewType=");
        sb2.append(this.f76205d);
        sb2.append(", displayType=");
        sb2.append(this.f76206e);
        sb2.append(", spanCount=");
        sb2.append(this.f76207f);
        sb2.append(", onShowEvent=");
        sb2.append(this.f76208g);
        sb2.append(", title=");
        sb2.append(this.f76209h);
        sb2.append(", description=");
        sb2.append(this.f76210i);
        sb2.append(", image=");
        sb2.append(this.f76211j);
        sb2.append(", action=");
        sb2.append(this.f76212k);
        sb2.append(", position=");
        sb2.append(this.f76213l);
        sb2.append(", background=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f76214m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f76203b);
        parcel.writeString(this.f76204c);
        parcel.writeString(this.f76205d.name());
        parcel.writeString(this.f76206e.name());
        parcel.writeInt(this.f76207f);
        parcel.writeParcelable(this.f76208g, i12);
        parcel.writeParcelable(this.f76209h, i12);
        parcel.writeParcelable(this.f76210i, i12);
        parcel.writeParcelable(this.f76211j, i12);
        parcel.writeParcelable(this.f76212k, i12);
        parcel.writeParcelable(this.f76213l, i12);
        parcel.writeParcelable(this.f76214m, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertHotelPromoWidgetItem(long j12, String str, SerpViewType serpViewType, SerpDisplayType serpDisplayType, int i12, ParametrizedEvent parametrizedEvent, AttributedText attributedText, AttributedText attributedText2, UniversalImage universalImage, ButtonAction buttonAction, HotelPromoWidgetPosition hotelPromoWidgetPosition, UniversalColor universalColor, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 174;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, (i13 & 4) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, i12, parametrizedEvent, attributedText, attributedText2, universalImage, buttonAction, hotelPromoWidgetPosition, universalColor);
    }
}
