package com.avito.android.return_checkout.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryReturnCheckoutData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/return_checkout/model/DeliveryReturnCheckoutData;", "Landroid/os/Parcelable;", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DeliveryReturnCheckoutData implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliveryReturnCheckoutData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f255310b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Map<String, String> f255311c;

    /* compiled from: DeliveryReturnCheckoutData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeliveryReturnCheckoutData> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryReturnCheckoutData createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new DeliveryReturnCheckoutData(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryReturnCheckoutData[] newArray(int i12) {
            return new DeliveryReturnCheckoutData[i12];
        }
    }

    public DeliveryReturnCheckoutData(@k String str, @l Map<String, String> map) {
        this.f255310b = str;
        this.f255311c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryReturnCheckoutData)) {
            return false;
        }
        DeliveryReturnCheckoutData deliveryReturnCheckoutData = (DeliveryReturnCheckoutData) obj;
        return L.f(this.f255310b, deliveryReturnCheckoutData.f255310b) && L.f(this.f255311c, deliveryReturnCheckoutData.f255311c);
    }

    public final int hashCode() {
        int iHashCode = this.f255310b.hashCode() * 31;
        Map<String, String> map = this.f255311c;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryReturnCheckoutData(orderId=");
        sb2.append(this.f255310b);
        sb2.append(", extraRequestParams=");
        return r.w(sb2, this.f255311c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f255310b);
        Map<String, String> map = this.f255311c;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
