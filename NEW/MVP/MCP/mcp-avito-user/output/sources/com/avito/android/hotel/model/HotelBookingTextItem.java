package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.hotel.model.HotelBookingParameter;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingTextItem.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002BM\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingTextItem;", "Lcom/avito/android/hotel/model/HotelBookingFormItem;", "Lcom/avito/android/hotel/model/HotelBookingParameter;", "", "id", "value", "", "_updateForm", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "", "maxLines", "Lcom/avito/android/hotel/model/EllipsizeType;", "ellipsize", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Integer;Lcom/avito/android/hotel/model/EllipsizeType;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getValue", "Ljava/lang/Boolean;", "O2", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "Lcom/avito/android/hotel/model/EllipsizeType;", "c", "()Lcom/avito/android/hotel/model/EllipsizeType;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelBookingTextItem implements HotelBookingFormItem, HotelBookingParameter<String> {

    @k
    public static final Parcelable.Creator<HotelBookingTextItem> CREATOR = new a();

    @c("updateForm")
    @l
    private final Boolean _updateForm;

    @c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("ellipsize")
    @l
    private final EllipsizeType ellipsize;

    @c("id")
    @l
    private final String id;

    @c("maxLines")
    @l
    private final Integer maxLines;

    @c("text")
    @l
    private final AttributedText text;

    @c("value")
    @l
    private final String value;

    /* compiled from: HotelBookingTextItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingTextItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingTextItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new HotelBookingTextItem(string, string2, boolValueOf, (AttributedText) parcel.readParcelable(HotelBookingTextItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? EllipsizeType.CREATOR.createFromParcel(parcel) : null, (DeepLink) parcel.readParcelable(HotelBookingTextItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingTextItem[] newArray(int i12) {
            return new HotelBookingTextItem[i12];
        }
    }

    public HotelBookingTextItem(@l String str, @l String str2, @l Boolean bool, @l AttributedText attributedText, @l Integer num, @l EllipsizeType ellipsizeType, @l DeepLink deepLink) {
        this.id = str;
        this.value = str2;
        this._updateForm = bool;
        this.text = attributedText;
        this.maxLines = num;
        this.ellipsize = ellipsizeType;
        this.deeplink = deepLink;
    }

    public static HotelBookingTextItem a(HotelBookingTextItem hotelBookingTextItem, String str) {
        String str2 = hotelBookingTextItem.id;
        Boolean bool = hotelBookingTextItem._updateForm;
        AttributedText attributedText = hotelBookingTextItem.text;
        Integer num = hotelBookingTextItem.maxLines;
        EllipsizeType ellipsizeType = hotelBookingTextItem.ellipsize;
        DeepLink deepLink = hotelBookingTextItem.deeplink;
        hotelBookingTextItem.getClass();
        return new HotelBookingTextItem(str2, str, bool, attributedText, num, ellipsizeType, deepLink);
    }

    @Override // com.avito.android.hotel.model.HotelBookingParameter
    public final boolean C5() {
        return HotelBookingParameter.a.a(this);
    }

    @Override // com.avito.android.hotel.model.HotelBookingParameter
    @l
    /* renamed from: O2, reason: from getter */
    public final Boolean get_updateForm() {
        return this._updateForm;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final EllipsizeType getEllipsize() {
        return this.ellipsize;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Integer getMaxLines() {
        return this.maxLines;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelBookingTextItem)) {
            return false;
        }
        HotelBookingTextItem hotelBookingTextItem = (HotelBookingTextItem) obj;
        return L.f(this.id, hotelBookingTextItem.id) && L.f(this.value, hotelBookingTextItem.value) && L.f(this._updateForm, hotelBookingTextItem._updateForm) && L.f(this.text, hotelBookingTextItem.text) && L.f(this.maxLines, hotelBookingTextItem.maxLines) && this.ellipsize == hotelBookingTextItem.ellipsize && L.f(this.deeplink, hotelBookingTextItem.deeplink);
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @Override // com.avito.android.hotel.model.HotelBookingParameter
    @l
    public final String getId() {
        return this.id;
    }

    @Override // com.avito.android.hotel.model.HotelBookingParameter
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this._updateForm;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        AttributedText attributedText = this.text;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Integer num = this.maxLines;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        EllipsizeType ellipsizeType = this.ellipsize;
        int iHashCode6 = (iHashCode5 + (ellipsizeType == null ? 0 : ellipsizeType.hashCode())) * 31;
        DeepLink deepLink = this.deeplink;
        return iHashCode6 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelBookingTextItem(id=");
        sb2.append(this.id);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", _updateForm=");
        sb2.append(this._updateForm);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", maxLines=");
        sb2.append(this.maxLines);
        sb2.append(", ellipsize=");
        sb2.append(this.ellipsize);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.deeplink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.value);
        Boolean bool = this._updateForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.text, i12);
        Integer num = this.maxLines;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        EllipsizeType ellipsizeType = this.ellipsize;
        if (ellipsizeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ellipsizeType.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.deeplink, i12);
    }
}
