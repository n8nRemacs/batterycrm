package com.avito.android.safedeal_checkout.delivery_universal_checkout.model;

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

/* compiled from: DeliveryUniversalCheckoutData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/model/CheckoutData;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/model/DeliveryUniversalCheckoutData;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutData extends DeliveryUniversalCheckoutData {

    @k
    public static final Parcelable.Creator<CheckoutData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<String, String> f257081b;

    /* compiled from: DeliveryUniversalCheckoutData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CheckoutData> {
        @Override // android.os.Parcelable.Creator
        public final CheckoutData createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new CheckoutData(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckoutData[] newArray(int i12) {
            return new CheckoutData[i12];
        }
    }

    public CheckoutData(@k Map<String, String> map) {
        super(null);
        this.f257081b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutData) && L.f(this.f257081b, ((CheckoutData) obj).f257081b);
    }

    public final int hashCode() {
        return this.f257081b.hashCode();
    }

    @k
    public final String toString() {
        return r.w(new StringBuilder("CheckoutData(extraRequestParams="), this.f257081b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itI = C0.i(parcel, this.f257081b);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
