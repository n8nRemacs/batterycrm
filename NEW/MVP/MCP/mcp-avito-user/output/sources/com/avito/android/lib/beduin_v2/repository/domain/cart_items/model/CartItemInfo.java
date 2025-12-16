package com.avito.android.lib.beduin_v2.repository.domain.cart_items.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CartItemInfo.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/domain/cart_items/model/CartItemInfo;", "Landroid/os/Parcelable;", "_design-modules_beduin-v2_interactions_repository_domain_cart-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CartItemInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<CartItemInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f176568b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f176569c;

    /* compiled from: CartItemInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CartItemInfo> {
        @Override // android.os.Parcelable.Creator
        public final CartItemInfo createFromParcel(Parcel parcel) {
            return new CartItemInfo(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final CartItemInfo[] newArray(int i12) {
            return new CartItemInfo[i12];
        }
    }

    public CartItemInfo(int i12, @l Integer num) {
        this.f176568b = i12;
        this.f176569c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartItemInfo)) {
            return false;
        }
        CartItemInfo cartItemInfo = (CartItemInfo) obj;
        return this.f176568b == cartItemInfo.f176568b && L.f(this.f176569c, cartItemInfo.f176569c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f176568b) * 31;
        Integer num = this.f176569c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CartItemInfo(quantity=");
        sb2.append(this.f176568b);
        sb2.append(", maxQuantity=");
        return s.j(sb2, this.f176569c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f176568b);
        Integer num = this.f176569c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }

    public /* synthetic */ CartItemInfo(int i12, Integer num, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? null : num);
    }
}
