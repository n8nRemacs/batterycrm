package com.avito.android.hotel_booking;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingSelectRadioDeeplink.kt */
@K51.d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/hotel_booking/RadioItem;", "Landroid/os/Parcelable;", "", "id", "", "analyticsParams", "", "Lcom/avito/android/hotel_booking/Insight;", "insights", "", "_isSelected", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/Boolean;", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RadioItem implements Parcelable {

    @k
    public static final Parcelable.Creator<RadioItem> CREATOR = new a();

    @com.google.gson.annotations.c("isSelected")
    @l
    private final Boolean _isSelected;

    @com.google.gson.annotations.c("analyticsParams")
    @l
    private final Map<String, String> analyticsParams;

    @com.google.gson.annotations.c("id")
    @l
    private final String id;

    @com.google.gson.annotations.c("insights")
    @l
    private final List<Insight> insights;

    /* compiled from: HotelBookingSelectRadioDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RadioItem> {
        @Override // android.os.Parcelable.Creator
        public final RadioItem createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            String string = parcel.readString();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(Insight.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RadioItem(string, linkedHashMap, arrayList, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final RadioItem[] newArray(int i12) {
            return new RadioItem[i12];
        }
    }

    public RadioItem(@l String str, @l Map<String, String> map, @l List<Insight> list, @l Boolean bool) {
        this.id = str;
        this.analyticsParams = map;
        this.insights = list;
        this._isSelected = bool;
    }

    public static RadioItem a(RadioItem radioItem, Boolean bool) {
        return new RadioItem(radioItem.id, radioItem.analyticsParams, radioItem.insights, bool);
    }

    @l
    public final Map<String, String> c() {
        return this.analyticsParams;
    }

    @l
    public final List<Insight> d() {
        return this.insights;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadioItem)) {
            return false;
        }
        RadioItem radioItem = (RadioItem) obj;
        return L.f(this.id, radioItem.id) && L.f(this.analyticsParams, radioItem.analyticsParams) && L.f(this.insights, radioItem.insights) && L.f(this._isSelected, radioItem._isSelected);
    }

    @l
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.analyticsParams;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<Insight> list = this.insights;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this._isSelected;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isSelected() {
        Boolean bool = this._isSelected;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RadioItem(id=");
        sb2.append(this.id);
        sb2.append(", analyticsParams=");
        sb2.append(this.analyticsParams);
        sb2.append(", insights=");
        sb2.append(this.insights);
        sb2.append(", _isSelected=");
        return C0.g(sb2, this._isSelected, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        Map<String, String> map = this.analyticsParams;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        List<Insight> list = this.insights;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Insight) itA.next()).writeToParcel(parcel, i12);
            }
        }
        Boolean bool = this._isSelected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ RadioItem(String str, Map map, List list, Boolean bool, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, map, list, bool);
    }
}
