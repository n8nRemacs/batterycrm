package com.avito.android.hotel_booking.enter_data;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.hotel_booking.Group;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EnterDataOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/EnterDataOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EnterDataOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<EnterDataOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f163497b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ParametrizedEvent f163498c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<Group> f163499d;

    /* compiled from: EnterDataOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EnterDataOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final EnterDataOpenParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            ParametrizedEvent parametrizedEvent = (ParametrizedEvent) parcel.readParcelable(EnterDataOpenParams.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(EnterDataOpenParams.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new EnterDataOpenParams(string, parametrizedEvent, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final EnterDataOpenParams[] newArray(int i12) {
            return new EnterDataOpenParams[i12];
        }
    }

    public EnterDataOpenParams(@l String str, @l ParametrizedEvent parametrizedEvent, @l List<Group> list) {
        this.f163497b = str;
        this.f163498c = parametrizedEvent;
        this.f163499d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterDataOpenParams)) {
            return false;
        }
        EnterDataOpenParams enterDataOpenParams = (EnterDataOpenParams) obj;
        return L.f(this.f163497b, enterDataOpenParams.f163497b) && L.f(this.f163498c, enterDataOpenParams.f163498c) && L.f(this.f163499d, enterDataOpenParams.f163499d);
    }

    public final int hashCode() {
        String str = this.f163497b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ParametrizedEvent parametrizedEvent = this.f163498c;
        int iHashCode2 = (iHashCode + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        List<Group> list = this.f163499d;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EnterDataOpenParams(title=");
        sb2.append(this.f163497b);
        sb2.append(", onTextChangeEvent=");
        sb2.append(this.f163498c);
        sb2.append(", groups=");
        return H.p(sb2, this.f163499d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f163497b);
        parcel.writeParcelable(this.f163498c, i12);
        List<Group> list = this.f163499d;
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
