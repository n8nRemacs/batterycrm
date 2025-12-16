package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelPromoWidget.kt */
@d
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/avito/android/hotel/model/HotelPromoWidget;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "Lcom/avito/android/remote/model/UniversalColor;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/ButtonAction;", "action", "Lcom/avito/android/hotel/model/HotelPromoWidgetPosition;", "position", "Lcom/avito/android/remote/model/ParametrizedEvent;", "onShowEvent", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/hotel/model/HotelPromoWidgetPosition;Lcom/avito/android/remote/model/ParametrizedEvent;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "g", "()Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Lcom/avito/android/remote/model/UniversalColor;", "d", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/ButtonAction;", "c", "()Lcom/avito/android/remote/model/ButtonAction;", "Lcom/avito/android/hotel/model/HotelPromoWidgetPosition;", "f", "()Lcom/avito/android/hotel/model/HotelPromoWidgetPosition;", "Lcom/avito/android/remote/model/ParametrizedEvent;", "e", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelPromoWidget implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelPromoWidget> CREATOR = new a();

    @c("action")
    @l
    private final ButtonAction action;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
    @l
    private final UniversalColor background;

    @c("description")
    @l
    private final AttributedText description;

    @c("image")
    @l
    private final UniversalImage image;

    @c("onShowEvent")
    @l
    private final ParametrizedEvent onShowEvent;

    @c("position")
    @l
    private final HotelPromoWidgetPosition position;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: HotelPromoWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelPromoWidget> {
        @Override // android.os.Parcelable.Creator
        public final HotelPromoWidget createFromParcel(Parcel parcel) {
            return new HotelPromoWidget((AttributedText) parcel.readParcelable(HotelPromoWidget.class.getClassLoader()), (AttributedText) parcel.readParcelable(HotelPromoWidget.class.getClassLoader()), (UniversalColor) parcel.readParcelable(HotelPromoWidget.class.getClassLoader()), (UniversalImage) parcel.readParcelable(HotelPromoWidget.class.getClassLoader()), (ButtonAction) parcel.readParcelable(HotelPromoWidget.class.getClassLoader()), parcel.readInt() == 0 ? null : HotelPromoWidgetPosition.CREATOR.createFromParcel(parcel), (ParametrizedEvent) parcel.readParcelable(HotelPromoWidget.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelPromoWidget[] newArray(int i12) {
            return new HotelPromoWidget[i12];
        }
    }

    public HotelPromoWidget(@l AttributedText attributedText, @l AttributedText attributedText2, @l UniversalColor universalColor, @l UniversalImage universalImage, @l ButtonAction buttonAction, @l HotelPromoWidgetPosition hotelPromoWidgetPosition, @l ParametrizedEvent parametrizedEvent) {
        this.title = attributedText;
        this.description = attributedText2;
        this.background = universalColor;
        this.image = universalImage;
        this.action = buttonAction;
        this.position = hotelPromoWidgetPosition;
        this.onShowEvent = parametrizedEvent;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ButtonAction getAction() {
        return this.action;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final UniversalColor getBackground() {
        return this.background;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final ParametrizedEvent getOnShowEvent() {
        return this.onShowEvent;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelPromoWidget)) {
            return false;
        }
        HotelPromoWidget hotelPromoWidget = (HotelPromoWidget) obj;
        return L.f(this.title, hotelPromoWidget.title) && L.f(this.description, hotelPromoWidget.description) && L.f(this.background, hotelPromoWidget.background) && L.f(this.image, hotelPromoWidget.image) && L.f(this.action, hotelPromoWidget.action) && this.position == hotelPromoWidget.position && L.f(this.onShowEvent, hotelPromoWidget.onShowEvent);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final HotelPromoWidgetPosition getPosition() {
        return this.position;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    public final int hashCode() {
        AttributedText attributedText = this.title;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.description;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        UniversalColor universalColor = this.background;
        int iHashCode3 = (iHashCode2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode4 = (iHashCode3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        ButtonAction buttonAction = this.action;
        int iHashCode5 = (iHashCode4 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        HotelPromoWidgetPosition hotelPromoWidgetPosition = this.position;
        int iHashCode6 = (iHashCode5 + (hotelPromoWidgetPosition == null ? 0 : hotelPromoWidgetPosition.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.onShowEvent;
        return iHashCode6 + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelPromoWidget(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", background=");
        sb2.append(this.background);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", position=");
        sb2.append(this.position);
        sb2.append(", onShowEvent=");
        return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.onShowEvent, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.description, i12);
        parcel.writeParcelable(this.background, i12);
        parcel.writeParcelable(this.image, i12);
        parcel.writeParcelable(this.action, i12);
        HotelPromoWidgetPosition hotelPromoWidgetPosition = this.position;
        if (hotelPromoWidgetPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hotelPromoWidgetPosition.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.onShowEvent, i12);
    }
}
