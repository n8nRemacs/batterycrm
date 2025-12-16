package com.avito.android.hotel_booking;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingSelectSingleValueDeeplink.kt */
@K51.d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/hotel_booking/SelectValueData;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/ParametrizedEvent;", "onClickEvent", "", "Lcom/avito/android/hotel_booking/Value;", "values", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/ParametrizedEvent;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/ParametrizedEvent;", "c", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "Ljava/util/List;", "d", "()Ljava/util/List;", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SelectValueData implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectValueData> CREATOR = new a();

    @com.google.gson.annotations.c("event")
    @l
    private final ParametrizedEvent onClickEvent;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    @com.google.gson.annotations.c("values")
    @l
    private final List<Value> values;

    /* compiled from: HotelBookingSelectSingleValueDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectValueData> {
        @Override // android.os.Parcelable.Creator
        public final SelectValueData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            ParametrizedEvent parametrizedEvent = (ParametrizedEvent) parcel.readParcelable(SelectValueData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Value.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new SelectValueData(string, parametrizedEvent, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectValueData[] newArray(int i12) {
            return new SelectValueData[i12];
        }
    }

    public SelectValueData(@l String str, @l ParametrizedEvent parametrizedEvent, @l List<Value> list) {
        this.title = str;
        this.onClickEvent = parametrizedEvent;
        this.values = list;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ParametrizedEvent getOnClickEvent() {
        return this.onClickEvent;
    }

    @l
    public final List<Value> d() {
        return this.values;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectValueData)) {
            return false;
        }
        SelectValueData selectValueData = (SelectValueData) obj;
        return L.f(this.title, selectValueData.title) && L.f(this.onClickEvent, selectValueData.onClickEvent) && L.f(this.values, selectValueData.values);
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ParametrizedEvent parametrizedEvent = this.onClickEvent;
        int iHashCode2 = (iHashCode + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        List<Value> list = this.values;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectValueData(title=");
        sb2.append(this.title);
        sb2.append(", onClickEvent=");
        sb2.append(this.onClickEvent);
        sb2.append(", values=");
        return H.p(sb2, this.values, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.onClickEvent, i12);
        List<Value> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((Value) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
