package com.avito.android.cart_similar_items.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.cart_similar_items.ScreenStyle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: CartSimilarItemsArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/model/CartSimilarItemsArguments;", "Landroid/os/Parcelable;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartSimilarItemsArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<CartSimilarItemsArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ScreenStyle f115924b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f115925c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f115926d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Map<String, Object> f115927e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f115928f;

    /* compiled from: CartSimilarItemsArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CartSimilarItemsArguments> {
        @Override // android.os.Parcelable.Creator
        public final CartSimilarItemsArguments createFromParcel(Parcel parcel) {
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
                    iC2 = h.c(CartSimilarItemsArguments.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new CartSimilarItemsArguments(screenStyleValueOf, string, string2, linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CartSimilarItemsArguments[] newArray(int i12) {
            return new CartSimilarItemsArguments[i12];
        }
    }

    public CartSimilarItemsArguments(@k ScreenStyle screenStyle, @k String str, @k String str2, @l Map<String, ? extends Object> map, @l String str3) {
        this.f115924b = screenStyle;
        this.f115925c = str;
        this.f115926d = str2;
        this.f115927e = map;
        this.f115928f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartSimilarItemsArguments)) {
            return false;
        }
        CartSimilarItemsArguments cartSimilarItemsArguments = (CartSimilarItemsArguments) obj;
        return this.f115924b == cartSimilarItemsArguments.f115924b && L.f(this.f115925c, cartSimilarItemsArguments.f115925c) && L.f(this.f115926d, cartSimilarItemsArguments.f115926d) && L.f(this.f115927e, cartSimilarItemsArguments.f115927e) && L.f(this.f115928f, cartSimilarItemsArguments.f115928f);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f115924b.hashCode() * 31, 31, this.f115925c), 31, this.f115926d);
        Map<String, Object> map = this.f115927e;
        int iHashCode = (iD2 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f115928f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CartSimilarItemsArguments(style=");
        sb2.append(this.f115924b);
        sb2.append(", screenName=");
        sb2.append(this.f115925c);
        sb2.append(", initialRequest=");
        sb2.append(this.f115926d);
        sb2.append(", extraParameters=");
        sb2.append(this.f115927e);
        sb2.append(", context=");
        return C22026a.c(sb2, this.f115928f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f115924b.name());
        parcel.writeString(this.f115925c);
        parcel.writeString(this.f115926d);
        Map<String, Object> map = this.f115927e;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        parcel.writeString(this.f115928f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CartSimilarItemsArguments(ScreenStyle screenStyle, String str, String str2, Map map, String str3, int i12, C42822w c42822w) {
        if ((i12 & 16) != 0) {
            str3 = null;
            Object obj = map != null ? map.get("context") : null;
            if (obj instanceof String) {
                str3 = (String) obj;
            }
        }
        this(screenStyle, str, str2, map, str3);
    }
}
