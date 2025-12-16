package com.avito.android.hotel_available_rooms.konveyor.promo_widget;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelPromoWidgetItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/promo_widget/HotelPromoWidgetItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelPromoWidgetItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<HotelPromoWidgetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f163044b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalColor f163045c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f163046d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalImage f163047e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f163048f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ButtonAction f163049g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ParametrizedEvent f163050h;

    /* compiled from: HotelPromoWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelPromoWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelPromoWidgetItem createFromParcel(Parcel parcel) {
            return new HotelPromoWidgetItem(parcel.readString(), (UniversalColor) parcel.readParcelable(HotelPromoWidgetItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(HotelPromoWidgetItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(HotelPromoWidgetItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(HotelPromoWidgetItem.class.getClassLoader()), (ButtonAction) parcel.readParcelable(HotelPromoWidgetItem.class.getClassLoader()), (ParametrizedEvent) parcel.readParcelable(HotelPromoWidgetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelPromoWidgetItem[] newArray(int i12) {
            return new HotelPromoWidgetItem[i12];
        }
    }

    public HotelPromoWidgetItem(@k String str, @l UniversalColor universalColor, @l AttributedText attributedText, @l UniversalImage universalImage, @l AttributedText attributedText2, @l ButtonAction buttonAction, @l ParametrizedEvent parametrizedEvent) {
        this.f163044b = str;
        this.f163045c = universalColor;
        this.f163046d = attributedText;
        this.f163047e = universalImage;
        this.f163048f = attributedText2;
        this.f163049g = buttonAction;
        this.f163050h = parametrizedEvent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelPromoWidgetItem)) {
            return false;
        }
        HotelPromoWidgetItem hotelPromoWidgetItem = (HotelPromoWidgetItem) obj;
        return L.f(this.f163044b, hotelPromoWidgetItem.f163044b) && L.f(this.f163045c, hotelPromoWidgetItem.f163045c) && L.f(this.f163046d, hotelPromoWidgetItem.f163046d) && L.f(this.f163047e, hotelPromoWidgetItem.f163047e) && L.f(this.f163048f, hotelPromoWidgetItem.f163048f) && L.f(this.f163049g, hotelPromoWidgetItem.f163049g) && L.f(this.f163050h, hotelPromoWidgetItem.f163050h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF161026d() {
        return this.f163044b;
    }

    public final int hashCode() {
        int iHashCode = this.f163044b.hashCode() * 31;
        UniversalColor universalColor = this.f163045c;
        int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        AttributedText attributedText = this.f163046d;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.f163047e;
        int iHashCode4 = (iHashCode3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        AttributedText attributedText2 = this.f163048f;
        int iHashCode5 = (iHashCode4 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        ButtonAction buttonAction = this.f163049g;
        int iHashCode6 = (iHashCode5 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.f163050h;
        return iHashCode6 + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelPromoWidgetItem(stringId=");
        sb2.append(this.f163044b);
        sb2.append(", background=");
        sb2.append(this.f163045c);
        sb2.append(", description=");
        sb2.append(this.f163046d);
        sb2.append(", image=");
        sb2.append(this.f163047e);
        sb2.append(", title=");
        sb2.append(this.f163048f);
        sb2.append(", action=");
        sb2.append(this.f163049g);
        sb2.append(", onShowEvent=");
        return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.f163050h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f163044b);
        parcel.writeParcelable(this.f163045c, i12);
        parcel.writeParcelable(this.f163046d, i12);
        parcel.writeParcelable(this.f163047e, i12);
        parcel.writeParcelable(this.f163048f, i12);
        parcel.writeParcelable(this.f163049g, i12);
        parcel.writeParcelable(this.f163050h, i12);
    }
}
