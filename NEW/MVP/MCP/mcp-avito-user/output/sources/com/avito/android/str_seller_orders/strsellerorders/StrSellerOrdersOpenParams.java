package com.avito.android.str_seller_orders.strsellerorders;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.util.OpenParams;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StrSellerOrdersOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<StrSellerOrdersOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f289700b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f289701c;

    /* compiled from: StrSellerOrdersOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrSellerOrdersOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final StrSellerOrdersOpenParams createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new StrSellerOrdersOpenParams(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final StrSellerOrdersOpenParams[] newArray(int i12) {
            return new StrSellerOrdersOpenParams[i12];
        }
    }

    public StrSellerOrdersOpenParams(@Y61.k String str, @Y61.k Map<String, String> map) {
        this.f289700b = str;
        this.f289701c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrSellerOrdersOpenParams)) {
            return false;
        }
        StrSellerOrdersOpenParams strSellerOrdersOpenParams = (StrSellerOrdersOpenParams) obj;
        return L.f(this.f289700b, strSellerOrdersOpenParams.f289700b) && L.f(this.f289701c, strSellerOrdersOpenParams.f289701c);
    }

    public final int hashCode() {
        return this.f289701c.hashCode() + (this.f289700b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrSellerOrdersOpenParams(screenState=");
        sb2.append(this.f289700b);
        sb2.append(", sellerFilters=");
        return r.w(sb2, this.f289701c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f289700b);
        Iterator itI = C0.i(parcel, this.f289701c);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
