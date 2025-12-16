package com.avito.android.cart;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.v2.page.BeduinV2FragmentParams;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CartBeduinV2TabFragmentData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart/CartBeduinV2TabFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_cart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartBeduinV2TabFragmentData implements TabFragmentFactory.Data {

    @k
    public static final Parcelable.Creator<CartBeduinV2TabFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BeduinV2FragmentParams f115290b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f115291c;

    /* compiled from: CartBeduinV2TabFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CartBeduinV2TabFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final CartBeduinV2TabFragmentData createFromParcel(Parcel parcel) {
            return new CartBeduinV2TabFragmentData((BeduinV2FragmentParams) parcel.readParcelable(CartBeduinV2TabFragmentData.class.getClassLoader()), (NavigationTabSetItem) parcel.readParcelable(CartBeduinV2TabFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CartBeduinV2TabFragmentData[] newArray(int i12) {
            return new CartBeduinV2TabFragmentData[i12];
        }
    }

    public CartBeduinV2TabFragmentData(@k BeduinV2FragmentParams beduinV2FragmentParams, @k NavigationTabSetItem navigationTabSetItem) {
        this.f115290b = beduinV2FragmentParams;
        this.f115291c = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4 */
    public final NavigationScreenAction getF71588d() {
        return NavigationScreenAction.f107103e;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF115291c() {
        return this.f115291c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0 */
    public final boolean getF186714d() {
        return true;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartBeduinV2TabFragmentData)) {
            return false;
        }
        CartBeduinV2TabFragmentData cartBeduinV2TabFragmentData = (CartBeduinV2TabFragmentData) obj;
        return L.f(this.f115290b, cartBeduinV2TabFragmentData.f115290b) && L.f(this.f115291c, cartBeduinV2TabFragmentData.f115291c);
    }

    public final int hashCode() {
        return this.f115291c.hashCode() + (this.f115290b.hashCode() * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CartBeduinV2TabFragmentData(params=");
        sb2.append(this.f115290b);
        sb2.append(", navigationTab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f115291c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f115290b, i12);
        parcel.writeParcelable(this.f115291c, i12);
    }
}
