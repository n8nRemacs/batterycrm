package com.avito.android.str_seller_orders.strsellerorders;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: StrOrdersSellerDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/StrOrdersSellerDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_str-seller-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class StrOrdersSellerDeeplink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<StrOrdersSellerDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f289649b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f289650c;

    /* compiled from: StrOrdersSellerDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrOrdersSellerDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final StrOrdersSellerDeeplink createFromParcel(Parcel parcel) {
            int iA2 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new StrOrdersSellerDeeplink(z12, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final StrOrdersSellerDeeplink[] newArray(int i12) {
            return new StrOrdersSellerDeeplink[i12];
        }
    }

    public StrOrdersSellerDeeplink(boolean z12, @Y61.k Map<String, String> map) {
        this.f289649b = z12;
        this.f289650c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f289649b ? 1 : 0);
        Iterator itI = C0.i(parcel, this.f289650c);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
