package com.avito.android.cart_similar_items.deep_link;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.cart_similar_items.ScreenStyle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: CartSimilarItemsLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/deep_link/CartSimilarItemsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CartSimilarItemsLink extends DeepLink {

    @k
    public static final Parcelable.Creator<CartSimilarItemsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ScreenStyle f115713b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f115714c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f115715d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Map<String, Object> f115716e;

    /* compiled from: CartSimilarItemsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CartSimilarItemsLink> {
        @Override // android.os.Parcelable.Creator
        public final CartSimilarItemsLink createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ScreenStyle screenStyleValueOf = ScreenStyle.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = org.webrtc.h.c(CartSimilarItemsLink.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new CartSimilarItemsLink(screenStyleValueOf, string, string2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final CartSimilarItemsLink[] newArray(int i12) {
            return new CartSimilarItemsLink[i12];
        }
    }

    public CartSimilarItemsLink(@k ScreenStyle screenStyle, @k String str, @k String str2, @l Map<String, ? extends Object> map) {
        this.f115713b = screenStyle;
        this.f115714c = str;
        this.f115715d = str2;
        this.f115716e = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartSimilarItemsLink)) {
            return false;
        }
        CartSimilarItemsLink cartSimilarItemsLink = (CartSimilarItemsLink) obj;
        return this.f115713b == cartSimilarItemsLink.f115713b && L.f(this.f115714c, cartSimilarItemsLink.f115714c) && L.f(this.f115715d, cartSimilarItemsLink.f115715d) && L.f(this.f115716e, cartSimilarItemsLink.f115716e);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f115713b.hashCode() * 31, 31, this.f115714c), 31, this.f115715d);
        Map<String, Object> map = this.f115716e;
        return iD2 + (map == null ? 0 : map.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CartSimilarItemsLink(style=");
        sb2.append(this.f115713b);
        sb2.append(", screenName=");
        sb2.append(this.f115714c);
        sb2.append(", initialRequest=");
        sb2.append(this.f115715d);
        sb2.append(", extraParameters=");
        return r.w(sb2, this.f115716e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f115713b.name());
        parcel.writeString(this.f115714c);
        parcel.writeString(this.f115715d);
        Map<String, Object> map = this.f115716e;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
        }
    }
}
