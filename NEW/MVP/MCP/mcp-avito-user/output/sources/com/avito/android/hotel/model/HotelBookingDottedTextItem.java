package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.hotel.model.HotelBookingParameter;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingDottedTextItem.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B9\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingDottedTextItem;", "Lcom/avito/android/hotel/model/HotelBookingFormItem;", "Lcom/avito/android/hotel/model/HotelBookingParameter;", "", "id", "value", "", "_updateForm", "Lcom/avito/android/remote/model/text/AttributedText;", "leftText", "rightText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getValue", "Ljava/lang/Boolean;", "O2", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelBookingDottedTextItem implements HotelBookingFormItem, HotelBookingParameter<String> {

    @k
    public static final Parcelable.Creator<HotelBookingDottedTextItem> CREATOR = new a();

    @c("updateForm")
    @l
    private final Boolean _updateForm;

    @c("id")
    @l
    private final String id;

    @c("left")
    @l
    private final AttributedText leftText;

    @c("right")
    @l
    private final AttributedText rightText;

    @c("value")
    @l
    private final String value;

    /* compiled from: HotelBookingDottedTextItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingDottedTextItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingDottedTextItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new HotelBookingDottedTextItem(string, string2, boolValueOf, (AttributedText) parcel.readParcelable(HotelBookingDottedTextItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(HotelBookingDottedTextItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingDottedTextItem[] newArray(int i12) {
            return new HotelBookingDottedTextItem[i12];
        }
    }

    public HotelBookingDottedTextItem(@l String str, @l String str2, @l Boolean bool, @l AttributedText attributedText, @l AttributedText attributedText2) {
        this.id = str;
        this.value = str2;
        this._updateForm = bool;
        this.leftText = attributedText;
        this.rightText = attributedText2;
    }

    public static HotelBookingDottedTextItem a(HotelBookingDottedTextItem hotelBookingDottedTextItem, String str) {
        String str2 = hotelBookingDottedTextItem.id;
        Boolean bool = hotelBookingDottedTextItem._updateForm;
        AttributedText attributedText = hotelBookingDottedTextItem.leftText;
        AttributedText attributedText2 = hotelBookingDottedTextItem.rightText;
        hotelBookingDottedTextItem.getClass();
        return new HotelBookingDottedTextItem(str2, str, bool, attributedText, attributedText2);
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
    public final AttributedText getLeftText() {
        return this.leftText;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getRightText() {
        return this.rightText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelBookingDottedTextItem)) {
            return false;
        }
        HotelBookingDottedTextItem hotelBookingDottedTextItem = (HotelBookingDottedTextItem) obj;
        return L.f(this.id, hotelBookingDottedTextItem.id) && L.f(this.value, hotelBookingDottedTextItem.value) && L.f(this._updateForm, hotelBookingDottedTextItem._updateForm) && L.f(this.leftText, hotelBookingDottedTextItem.leftText) && L.f(this.rightText, hotelBookingDottedTextItem.rightText);
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
        AttributedText attributedText = this.leftText;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.rightText;
        return iHashCode4 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelBookingDottedTextItem(id=");
        sb2.append(this.id);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", _updateForm=");
        sb2.append(this._updateForm);
        sb2.append(", leftText=");
        sb2.append(this.leftText);
        sb2.append(", rightText=");
        return com.avito.android.actions_sheet.a.w(sb2, this.rightText, ')');
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
        parcel.writeParcelable(this.leftText, i12);
        parcel.writeParcelable(this.rightText, i12);
    }
}
