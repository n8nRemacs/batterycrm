package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.hotel.model.HotelBookingParameter;
import com.avito.android.remote.model.ParametrizedEvent;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingInputItem.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003Bk\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b!\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b%\u0010$R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingInputItem;", "Lcom/avito/android/hotel/model/HotelBookingFormItem;", "Lcom/avito/android/hotel/model/EnableableItem;", "Lcom/avito/android/hotel/model/HotelBookingParameter;", "", "id", "value", "", "_updateForm", "_isEnabled", "hint", "Lcom/avito/android/hotel/model/HotelBookingInputType;", "inputType", "errorMessage", "", "minLines", "maxLines", "Lcom/avito/android/remote/model/ParametrizedEvent;", "onChangeEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/hotel/model/HotelBookingInputType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/ParametrizedEvent;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getValue", "Ljava/lang/Boolean;", "O2", "()Ljava/lang/Boolean;", "i", "d", "Lcom/avito/android/hotel/model/HotelBookingInputType;", "e", "()Lcom/avito/android/hotel/model/HotelBookingInputType;", "c", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "f", "Lcom/avito/android/remote/model/ParametrizedEvent;", "h", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelBookingInputItem implements HotelBookingFormItem, EnableableItem, HotelBookingParameter<String> {

    @k
    public static final Parcelable.Creator<HotelBookingInputItem> CREATOR = new a();

    @c("isEnabled")
    @l
    private final Boolean _isEnabled;

    @c("updateForm")
    @l
    private final Boolean _updateForm;

    @c("errorMessage")
    @l
    private final String errorMessage;

    @c("hint")
    @l
    private final String hint;

    @c("id")
    @l
    private final String id;

    @c("inputType")
    @l
    private final HotelBookingInputType inputType;

    @c("maxLines")
    @l
    private final Integer maxLines;

    @c("minLines")
    @l
    private final Integer minLines;

    @c("onChangeEvent")
    @l
    private final ParametrizedEvent onChangeEvent;

    @c("value")
    @l
    private final String value;

    /* compiled from: HotelBookingInputItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingInputItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingInputItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new HotelBookingInputItem(string, string2, boolValueOf, boolValueOf2, parcel.readString(), parcel.readInt() == 0 ? null : HotelBookingInputType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (ParametrizedEvent) parcel.readParcelable(HotelBookingInputItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingInputItem[] newArray(int i12) {
            return new HotelBookingInputItem[i12];
        }
    }

    public HotelBookingInputItem(@l String str, @l String str2, @l Boolean bool, @l Boolean bool2, @l String str3, @l HotelBookingInputType hotelBookingInputType, @l String str4, @l Integer num, @l Integer num2, @l ParametrizedEvent parametrizedEvent) {
        this.id = str;
        this.value = str2;
        this._updateForm = bool;
        this._isEnabled = bool2;
        this.hint = str3;
        this.inputType = hotelBookingInputType;
        this.errorMessage = str4;
        this.minLines = num;
        this.maxLines = num2;
        this.onChangeEvent = parametrizedEvent;
    }

    public static HotelBookingInputItem a(HotelBookingInputItem hotelBookingInputItem, String str, String str2, int i12) {
        String str3 = hotelBookingInputItem.id;
        if ((i12 & 2) != 0) {
            str = hotelBookingInputItem.value;
        }
        Boolean bool = hotelBookingInputItem._updateForm;
        Boolean bool2 = hotelBookingInputItem._isEnabled;
        String str4 = hotelBookingInputItem.hint;
        HotelBookingInputType hotelBookingInputType = hotelBookingInputItem.inputType;
        Integer num = hotelBookingInputItem.minLines;
        Integer num2 = hotelBookingInputItem.maxLines;
        ParametrizedEvent parametrizedEvent = hotelBookingInputItem.onChangeEvent;
        hotelBookingInputItem.getClass();
        return new HotelBookingInputItem(str3, str, bool, bool2, str4, hotelBookingInputType, str2, num, num2, parametrizedEvent);
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
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final HotelBookingInputType getInputType() {
        return this.inputType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelBookingInputItem)) {
            return false;
        }
        HotelBookingInputItem hotelBookingInputItem = (HotelBookingInputItem) obj;
        return L.f(this.id, hotelBookingInputItem.id) && L.f(this.value, hotelBookingInputItem.value) && L.f(this._updateForm, hotelBookingInputItem._updateForm) && L.f(this._isEnabled, hotelBookingInputItem._isEnabled) && L.f(this.hint, hotelBookingInputItem.hint) && this.inputType == hotelBookingInputItem.inputType && L.f(this.errorMessage, hotelBookingInputItem.errorMessage) && L.f(this.minLines, hotelBookingInputItem.minLines) && L.f(this.maxLines, hotelBookingInputItem.maxLines) && L.f(this.onChangeEvent, hotelBookingInputItem.onChangeEvent);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Integer getMaxLines() {
        return this.maxLines;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Integer getMinLines() {
        return this.minLines;
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

    @l
    /* renamed from: h, reason: from getter */
    public final ParametrizedEvent getOnChangeEvent() {
        return this.onChangeEvent;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this._updateForm;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this._isEnabled;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.hint;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        HotelBookingInputType hotelBookingInputType = this.inputType;
        int iHashCode6 = (iHashCode5 + (hotelBookingInputType == null ? 0 : hotelBookingInputType.hashCode())) * 31;
        String str4 = this.errorMessage;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.minLines;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxLines;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.onChangeEvent;
        return iHashCode9 + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final Boolean get_isEnabled() {
        return this._isEnabled;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelBookingInputItem(id=");
        sb2.append(this.id);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", _updateForm=");
        sb2.append(this._updateForm);
        sb2.append(", _isEnabled=");
        sb2.append(this._isEnabled);
        sb2.append(", hint=");
        sb2.append(this.hint);
        sb2.append(", inputType=");
        sb2.append(this.inputType);
        sb2.append(", errorMessage=");
        sb2.append(this.errorMessage);
        sb2.append(", minLines=");
        sb2.append(this.minLines);
        sb2.append(", maxLines=");
        sb2.append(this.maxLines);
        sb2.append(", onChangeEvent=");
        return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.onChangeEvent, ')');
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
        Boolean bool2 = this._isEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeString(this.hint);
        HotelBookingInputType hotelBookingInputType = this.inputType;
        if (hotelBookingInputType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hotelBookingInputType.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.errorMessage);
        Integer num = this.minLines;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.maxLines;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        parcel.writeParcelable(this.onChangeEvent, i12);
    }

    @Override // com.avito.android.hotel.model.HotelBookingParameter
    @l
    public final String getValue() {
        return this.value;
    }
}
