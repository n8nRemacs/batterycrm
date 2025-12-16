package com.avito.android.delivery_combined_buttons_public;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.delivery_combined_buttons_public.CartButton;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CombinedButtons.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_combined_buttons_public/CombinedButtonsData;", "Landroid/os/Parcelable;", "_avito_delivery-combined-buttons_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CombinedButtonsData implements Parcelable {

    @k
    public static final Parcelable.Creator<CombinedButtonsData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f134954b;

    /* renamed from: c, reason: collision with root package name */
    public final int f134955c;

    /* renamed from: d, reason: collision with root package name */
    public final int f134956d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f134957e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final WidthStrategy f134958f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final BuyButton f134959g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final CartButton.AddToCartButton f134960h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final CartButton.GoToCartButton f134961i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Map<String, String> f134962j;

    /* compiled from: CombinedButtons.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CombinedButtonsData> {
        @Override // android.os.Parcelable.Creator
        public final CombinedButtonsData createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int iA2 = 0;
            boolean z12 = parcel.readInt() != 0;
            LinkedHashMap linkedHashMap = null;
            WidthStrategy widthStrategyValueOf = parcel.readInt() == 0 ? null : WidthStrategy.valueOf(parcel.readString());
            BuyButton buyButtonCreateFromParcel = BuyButton.CREATOR.createFromParcel(parcel);
            CartButton.AddToCartButton addToCartButtonCreateFromParcel = CartButton.AddToCartButton.CREATOR.createFromParcel(parcel);
            CartButton.GoToCartButton goToCartButtonCreateFromParcel = CartButton.GoToCartButton.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i14);
                while (iA2 != i14) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            return new CombinedButtonsData(string, i12, i13, z12, widthStrategyValueOf, buyButtonCreateFromParcel, addToCartButtonCreateFromParcel, goToCartButtonCreateFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final CombinedButtonsData[] newArray(int i12) {
            return new CombinedButtonsData[i12];
        }
    }

    public CombinedButtonsData(@l String str, int i12, int i13, boolean z12, @l WidthStrategy widthStrategy, @k BuyButton buyButton, @k CartButton.AddToCartButton addToCartButton, @k CartButton.GoToCartButton goToCartButton, @l Map<String, String> map) {
        this.f134954b = str;
        this.f134955c = i12;
        this.f134956d = i13;
        this.f134957e = z12;
        this.f134958f = widthStrategy;
        this.f134959g = buyButton;
        this.f134960h = addToCartButton;
        this.f134961i = goToCartButton;
        this.f134962j = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinedButtonsData)) {
            return false;
        }
        CombinedButtonsData combinedButtonsData = (CombinedButtonsData) obj;
        return L.f(this.f134954b, combinedButtonsData.f134954b) && this.f134955c == combinedButtonsData.f134955c && this.f134956d == combinedButtonsData.f134956d && this.f134957e == combinedButtonsData.f134957e && this.f134958f == combinedButtonsData.f134958f && L.f(this.f134959g, combinedButtonsData.f134959g) && L.f(this.f134960h, combinedButtonsData.f134960h) && L.f(this.f134961i, combinedButtonsData.f134961i) && L.f(this.f134962j, combinedButtonsData.f134962j);
    }

    public final int hashCode() {
        String str = this.f134954b;
        int i12 = r.i(r.e(this.f134956d, r.e(this.f134955c, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31, this.f134957e);
        WidthStrategy widthStrategy = this.f134958f;
        int iHashCode = (this.f134961i.hashCode() + ((this.f134960h.hashCode() + ((this.f134959g.hashCode() + ((i12 + (widthStrategy == null ? 0 : widthStrategy.hashCode())) * 31)) * 31)) * 31)) * 31;
        Map<String, String> map = this.f134962j;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CombinedButtonsData(id=");
        sb2.append(this.f134954b);
        sb2.append(", quantity=");
        sb2.append(this.f134955c);
        sb2.append(", maxQuantity=");
        sb2.append(this.f134956d);
        sb2.append(", isCartButtonOnLeft=");
        sb2.append(this.f134957e);
        sb2.append(", widthStrategy=");
        sb2.append(this.f134958f);
        sb2.append(", buyButton=");
        sb2.append(this.f134959g);
        sb2.append(", addToCartButton=");
        sb2.append(this.f134960h);
        sb2.append(", goToCartButton=");
        sb2.append(this.f134961i);
        sb2.append(", cartUpdateRequestParams=");
        return r.w(sb2, this.f134962j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f134954b);
        parcel.writeInt(this.f134955c);
        parcel.writeInt(this.f134956d);
        parcel.writeInt(this.f134957e ? 1 : 0);
        WidthStrategy widthStrategy = this.f134958f;
        if (widthStrategy == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(widthStrategy.name());
        }
        this.f134959g.writeToParcel(parcel, i12);
        this.f134960h.writeToParcel(parcel, i12);
        this.f134961i.writeToParcel(parcel, i12);
        Map<String, String> map = this.f134962j;
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
