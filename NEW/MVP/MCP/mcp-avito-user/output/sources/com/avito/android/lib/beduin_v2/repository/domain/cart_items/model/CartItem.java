package com.avito.android.lib.beduin_v2.repository.domain.cart_items.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CartItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/domain/cart_items/model/CartItem;", "Landroid/os/Parcelable;", "_design-modules_beduin-v2_interactions_repository_domain_cart-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CartItem implements Parcelable {

    @k
    public static final Parcelable.Creator<CartItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f176566b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CartItemInfo f176567c;

    /* compiled from: CartItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CartItem> {
        @Override // android.os.Parcelable.Creator
        public final CartItem createFromParcel(Parcel parcel) {
            return new CartItem(parcel.readString(), CartItemInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CartItem[] newArray(int i12) {
            return new CartItem[i12];
        }
    }

    public CartItem(@k String str, @k CartItemInfo cartItemInfo) {
        this.f176566b = str;
        this.f176567c = cartItemInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartItem)) {
            return false;
        }
        CartItem cartItem = (CartItem) obj;
        return L.f(this.f176566b, cartItem.f176566b) && L.f(this.f176567c, cartItem.f176567c);
    }

    public final int hashCode() {
        return this.f176567c.hashCode() + (this.f176566b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "CartItem(itemId=" + this.f176566b + ", info=" + this.f176567c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f176566b);
        this.f176567c.writeToParcel(parcel, i12);
    }
}
