package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: DeliveryReturnCheckoutLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/DeliveryReturnCheckoutLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class DeliveryReturnCheckoutLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DeliveryReturnCheckoutLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133194b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f133195c;

    /* compiled from: DeliveryReturnCheckoutLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeliveryReturnCheckoutLink> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryReturnCheckoutLink createFromParcel(Parcel parcel) {
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
            return new DeliveryReturnCheckoutLink(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryReturnCheckoutLink[] newArray(int i12) {
            return new DeliveryReturnCheckoutLink[i12];
        }
    }

    public DeliveryReturnCheckoutLink(@Y61.k String str, @Y61.l Map<String, String> map) {
        this.f133194b = str;
        this.f133195c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryReturnCheckoutLink)) {
            return false;
        }
        DeliveryReturnCheckoutLink deliveryReturnCheckoutLink = (DeliveryReturnCheckoutLink) obj;
        return kotlin.jvm.internal.L.f(this.f133194b, deliveryReturnCheckoutLink.f133194b) && kotlin.jvm.internal.L.f(this.f133195c, deliveryReturnCheckoutLink.f133195c);
    }

    public final int hashCode() {
        int iHashCode = this.f133194b.hashCode() * 31;
        Map<String, String> map = this.f133195c;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryReturnCheckoutLink(orderId=");
        sb2.append(this.f133194b);
        sb2.append(", extraRequestParams=");
        return androidx.appcompat.app.r.w(sb2, this.f133195c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133194b);
        Map<String, String> map = this.f133195c;
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
