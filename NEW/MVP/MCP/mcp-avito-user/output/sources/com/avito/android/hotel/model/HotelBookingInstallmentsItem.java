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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingInstallmentsItem.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingInstallmentsItem;", "Lcom/avito/android/hotel/model/HotelBookingParameter;", "", "id", "value", "", "_updateForm", "", "Lcom/avito/android/hotel/model/HotelLoanTerm;", "terms", "Lcom/avito/android/remote/model/ParametrizedEvent;", "onShowEvent", "onClickEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/remote/model/ParametrizedEvent;Lcom/avito/android/remote/model/ParametrizedEvent;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getValue", "Ljava/lang/Boolean;", "O2", "()Ljava/lang/Boolean;", "Ljava/util/List;", "e", "()Ljava/util/List;", "Lcom/avito/android/remote/model/ParametrizedEvent;", "d", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "c", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelBookingInstallmentsItem implements HotelBookingParameter<String> {

    @k
    public static final Parcelable.Creator<HotelBookingInstallmentsItem> CREATOR = new a();

    @c("updateForm")
    @l
    private final Boolean _updateForm;

    @c("id")
    @l
    private final String id;

    @c("onClickEvent")
    @l
    private final ParametrizedEvent onClickEvent;

    @c("onShowEvent")
    @l
    private final ParametrizedEvent onShowEvent;

    @c("terms")
    @l
    private final List<HotelLoanTerm> terms;

    @c("value")
    @l
    private final String value;

    /* compiled from: HotelBookingInstallmentsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingInstallmentsItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingInstallmentsItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iC2 = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(HotelLoanTerm.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new HotelBookingInstallmentsItem(string, string2, boolValueOf, arrayList, (ParametrizedEvent) parcel.readParcelable(HotelBookingInstallmentsItem.class.getClassLoader()), (ParametrizedEvent) parcel.readParcelable(HotelBookingInstallmentsItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingInstallmentsItem[] newArray(int i12) {
            return new HotelBookingInstallmentsItem[i12];
        }
    }

    public HotelBookingInstallmentsItem(@l String str, @l String str2, @l Boolean bool, @l List<HotelLoanTerm> list, @l ParametrizedEvent parametrizedEvent, @l ParametrizedEvent parametrizedEvent2) {
        this.id = str;
        this.value = str2;
        this._updateForm = bool;
        this.terms = list;
        this.onShowEvent = parametrizedEvent;
        this.onClickEvent = parametrizedEvent2;
    }

    public static HotelBookingInstallmentsItem a(HotelBookingInstallmentsItem hotelBookingInstallmentsItem, String str) {
        String str2 = hotelBookingInstallmentsItem.id;
        Boolean bool = hotelBookingInstallmentsItem._updateForm;
        List<HotelLoanTerm> list = hotelBookingInstallmentsItem.terms;
        ParametrizedEvent parametrizedEvent = hotelBookingInstallmentsItem.onShowEvent;
        ParametrizedEvent parametrizedEvent2 = hotelBookingInstallmentsItem.onClickEvent;
        hotelBookingInstallmentsItem.getClass();
        return new HotelBookingInstallmentsItem(str2, str, bool, list, parametrizedEvent, parametrizedEvent2);
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
    public final ParametrizedEvent getOnClickEvent() {
        return this.onClickEvent;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final ParametrizedEvent getOnShowEvent() {
        return this.onShowEvent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final List<HotelLoanTerm> e() {
        return this.terms;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelBookingInstallmentsItem)) {
            return false;
        }
        HotelBookingInstallmentsItem hotelBookingInstallmentsItem = (HotelBookingInstallmentsItem) obj;
        return L.f(this.id, hotelBookingInstallmentsItem.id) && L.f(this.value, hotelBookingInstallmentsItem.value) && L.f(this._updateForm, hotelBookingInstallmentsItem._updateForm) && L.f(this.terms, hotelBookingInstallmentsItem.terms) && L.f(this.onShowEvent, hotelBookingInstallmentsItem.onShowEvent) && L.f(this.onClickEvent, hotelBookingInstallmentsItem.onClickEvent);
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
        List<HotelLoanTerm> list = this.terms;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.onShowEvent;
        int iHashCode5 = (iHashCode4 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent2 = this.onClickEvent;
        return iHashCode5 + (parametrizedEvent2 != null ? parametrizedEvent2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelBookingInstallmentsItem(id=");
        sb2.append(this.id);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", _updateForm=");
        sb2.append(this._updateForm);
        sb2.append(", terms=");
        sb2.append(this.terms);
        sb2.append(", onShowEvent=");
        sb2.append(this.onShowEvent);
        sb2.append(", onClickEvent=");
        return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.onClickEvent, ')');
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
        List<HotelLoanTerm> list = this.terms;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((HotelLoanTerm) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.onShowEvent, i12);
        parcel.writeParcelable(this.onClickEvent, i12);
    }

    @Override // com.avito.android.hotel.model.HotelBookingParameter
    @l
    public final String getValue() {
        return this.value;
    }
}
