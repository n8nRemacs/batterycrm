package com.avito.android.hotel_available_rooms.domain.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoWidget.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/domain/models/PromoWidget;", "Lcom/avito/android/hotel_available_rooms/domain/models/HotelItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PromoWidget implements HotelItem {

    @k
    public static final Parcelable.Creator<PromoWidget> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final UniversalColor f162810b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f162811c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalImage f162812d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f162813e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ButtonAction f162814f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ParametrizedEvent f162815g;

    /* compiled from: PromoWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromoWidget> {
        @Override // android.os.Parcelable.Creator
        public final PromoWidget createFromParcel(Parcel parcel) {
            return new PromoWidget((UniversalColor) parcel.readParcelable(PromoWidget.class.getClassLoader()), (AttributedText) parcel.readParcelable(PromoWidget.class.getClassLoader()), (UniversalImage) parcel.readParcelable(PromoWidget.class.getClassLoader()), (AttributedText) parcel.readParcelable(PromoWidget.class.getClassLoader()), (ButtonAction) parcel.readParcelable(PromoWidget.class.getClassLoader()), (ParametrizedEvent) parcel.readParcelable(PromoWidget.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PromoWidget[] newArray(int i12) {
            return new PromoWidget[i12];
        }
    }

    public PromoWidget(@l UniversalColor universalColor, @l AttributedText attributedText, @l UniversalImage universalImage, @l AttributedText attributedText2, @l ButtonAction buttonAction, @l ParametrizedEvent parametrizedEvent) {
        this.f162810b = universalColor;
        this.f162811c = attributedText;
        this.f162812d = universalImage;
        this.f162813e = attributedText2;
        this.f162814f = buttonAction;
        this.f162815g = parametrizedEvent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoWidget)) {
            return false;
        }
        PromoWidget promoWidget = (PromoWidget) obj;
        return L.f(this.f162810b, promoWidget.f162810b) && L.f(this.f162811c, promoWidget.f162811c) && L.f(this.f162812d, promoWidget.f162812d) && L.f(this.f162813e, promoWidget.f162813e) && L.f(this.f162814f, promoWidget.f162814f) && L.f(this.f162815g, promoWidget.f162815g);
    }

    public final int hashCode() {
        UniversalColor universalColor = this.f162810b;
        int iHashCode = (universalColor == null ? 0 : universalColor.hashCode()) * 31;
        AttributedText attributedText = this.f162811c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.f162812d;
        int iHashCode3 = (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        AttributedText attributedText2 = this.f162813e;
        int iHashCode4 = (iHashCode3 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        ButtonAction buttonAction = this.f162814f;
        int iHashCode5 = (iHashCode4 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.f162815g;
        return iHashCode5 + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PromoWidget(background=");
        sb2.append(this.f162810b);
        sb2.append(", description=");
        sb2.append(this.f162811c);
        sb2.append(", image=");
        sb2.append(this.f162812d);
        sb2.append(", title=");
        sb2.append(this.f162813e);
        sb2.append(", action=");
        sb2.append(this.f162814f);
        sb2.append(", onShowEvent=");
        return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.f162815g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f162810b, i12);
        parcel.writeParcelable(this.f162811c, i12);
        parcel.writeParcelable(this.f162812d, i12);
        parcel.writeParcelable(this.f162813e, i12);
        parcel.writeParcelable(this.f162814f, i12);
        parcel.writeParcelable(this.f162815g, i12);
    }
}
