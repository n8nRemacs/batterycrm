package com.avito.android.hotel_booking.select_single_value;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.hotel_booking.Value;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectSingleValueOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/select_single_value/SelectSingleValueOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SelectSingleValueOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<SelectSingleValueOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f164070b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ParametrizedEvent f164071c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<Value> f164072d;

    /* compiled from: SelectSingleValueOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectSingleValueOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final SelectSingleValueOpenParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            ParametrizedEvent parametrizedEvent = (ParametrizedEvent) parcel.readParcelable(SelectSingleValueOpenParams.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(SelectSingleValueOpenParams.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new SelectSingleValueOpenParams(string, parametrizedEvent, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectSingleValueOpenParams[] newArray(int i12) {
            return new SelectSingleValueOpenParams[i12];
        }
    }

    public SelectSingleValueOpenParams(@l String str, @l ParametrizedEvent parametrizedEvent, @l List<Value> list) {
        this.f164070b = str;
        this.f164071c = parametrizedEvent;
        this.f164072d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectSingleValueOpenParams)) {
            return false;
        }
        SelectSingleValueOpenParams selectSingleValueOpenParams = (SelectSingleValueOpenParams) obj;
        return L.f(this.f164070b, selectSingleValueOpenParams.f164070b) && L.f(this.f164071c, selectSingleValueOpenParams.f164071c) && L.f(this.f164072d, selectSingleValueOpenParams.f164072d);
    }

    public final int hashCode() {
        String str = this.f164070b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ParametrizedEvent parametrizedEvent = this.f164071c;
        int iHashCode2 = (iHashCode + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        List<Value> list = this.f164072d;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectSingleValueOpenParams(title=");
        sb2.append(this.f164070b);
        sb2.append(", onClickEvent=");
        sb2.append(this.f164071c);
        sb2.append(", values=");
        return H.p(sb2, this.f164072d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f164070b);
        parcel.writeParcelable(this.f164071c, i12);
        List<Value> list = this.f164072d;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), i12);
        }
    }
}
