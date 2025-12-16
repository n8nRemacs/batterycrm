package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: DeliveryUniversalCheckoutLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/DeliveryUniversalCheckoutLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class DeliveryUniversalCheckoutLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DeliveryUniversalCheckoutLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f133215b;

    /* compiled from: DeliveryUniversalCheckoutLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeliveryUniversalCheckoutLink> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryUniversalCheckoutLink createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new DeliveryUniversalCheckoutLink(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryUniversalCheckoutLink[] newArray(int i12) {
            return new DeliveryUniversalCheckoutLink[i12];
        }
    }

    public DeliveryUniversalCheckoutLink(@Y61.k Map<String, String> map) {
        this.f133215b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeliveryUniversalCheckoutLink) && kotlin.jvm.internal.L.f(this.f133215b, ((DeliveryUniversalCheckoutLink) obj).f133215b);
    }

    public final int hashCode() {
        return this.f133215b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.w(new StringBuilder("DeliveryUniversalCheckoutLink(extraRequestParams="), this.f133215b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itI = C0.i(parcel, this.f133215b);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
