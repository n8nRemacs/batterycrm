package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.hotel.model.HotelBookingParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingCheckBoxItem.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003BC\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingCheckBoxItem;", "Lcom/avito/android/hotel/model/HotelBookingFormItem;", "Lcom/avito/android/hotel/model/EnableableItem;", "Lcom/avito/android/hotel/model/HotelBookingParameter;", "", "", "id", "value", "_updateForm", "_isEnabled", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getValue", "()Ljava/lang/Boolean;", "O2", "c", "getTitle", "getSubtitle", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelBookingCheckBoxItem implements HotelBookingFormItem, EnableableItem, HotelBookingParameter<Boolean> {

    @k
    public static final Parcelable.Creator<HotelBookingCheckBoxItem> CREATOR = new a();

    @c("isEnabled")
    @l
    private final Boolean _isEnabled;

    @c("updateForm")
    @l
    private final Boolean _updateForm;

    @c("id")
    @l
    private final String id;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    @c("value")
    @l
    private final Boolean value;

    /* compiled from: HotelBookingCheckBoxItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingCheckBoxItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingCheckBoxItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            Boolean boolValueOf3 = null;
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
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new HotelBookingCheckBoxItem(string, boolValueOf, boolValueOf2, boolValueOf3, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingCheckBoxItem[] newArray(int i12) {
            return new HotelBookingCheckBoxItem[i12];
        }
    }

    public HotelBookingCheckBoxItem(@l String str, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l String str2, @l String str3) {
        this.id = str;
        this.value = bool;
        this._updateForm = bool2;
        this._isEnabled = bool3;
        this.title = str2;
        this.subtitle = str3;
    }

    public static HotelBookingCheckBoxItem a(HotelBookingCheckBoxItem hotelBookingCheckBoxItem, Boolean bool) {
        String str = hotelBookingCheckBoxItem.id;
        Boolean bool2 = hotelBookingCheckBoxItem._updateForm;
        Boolean bool3 = hotelBookingCheckBoxItem._isEnabled;
        String str2 = hotelBookingCheckBoxItem.title;
        String str3 = hotelBookingCheckBoxItem.subtitle;
        hotelBookingCheckBoxItem.getClass();
        return new HotelBookingCheckBoxItem(str, bool, bool2, bool3, str2, str3);
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
    public final Boolean get_isEnabled() {
        return this._isEnabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelBookingCheckBoxItem)) {
            return false;
        }
        HotelBookingCheckBoxItem hotelBookingCheckBoxItem = (HotelBookingCheckBoxItem) obj;
        return L.f(this.id, hotelBookingCheckBoxItem.id) && L.f(this.value, hotelBookingCheckBoxItem.value) && L.f(this._updateForm, hotelBookingCheckBoxItem._updateForm) && L.f(this._isEnabled, hotelBookingCheckBoxItem._isEnabled) && L.f(this.title, hotelBookingCheckBoxItem.title) && L.f(this.subtitle, hotelBookingCheckBoxItem.subtitle);
    }

    @Override // com.avito.android.hotel.model.HotelBookingParameter
    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.avito.android.hotel.model.HotelBookingParameter
    @l
    public final Boolean getValue() {
        return this.value;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.value;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this._updateForm;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this._isEnabled;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelBookingCheckBoxItem(id=");
        sb2.append(this.id);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", _updateForm=");
        sb2.append(this._updateForm);
        sb2.append(", _isEnabled=");
        sb2.append(this._isEnabled);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.subtitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        Boolean bool = this.value;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this._updateForm;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this._isEnabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
    }

    @Override // com.avito.android.hotel.model.HotelBookingParameter
    public final Boolean getValue() {
        return this.value;
    }
}
