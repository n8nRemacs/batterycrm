package com.avito.android.cart_snippet_actions.utils;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItemInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemQuantityChanges.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/utils/Change;", "Landroid/os/Parcelable;", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Change implements Parcelable {

    @k
    public static final Parcelable.Creator<Change> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f116277b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CartItemInfo f116278c;

    /* compiled from: ItemQuantityChanges.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Change> {
        @Override // android.os.Parcelable.Creator
        public final Change createFromParcel(Parcel parcel) {
            return new Change(parcel.readInt(), (CartItemInfo) parcel.readParcelable(Change.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Change[] newArray(int i12) {
            return new Change[i12];
        }
    }

    public Change(int i12, @k CartItemInfo cartItemInfo) {
        this.f116277b = i12;
        this.f116278c = cartItemInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Change)) {
            return false;
        }
        Change change = (Change) obj;
        return this.f116277b == change.f116277b && L.f(this.f116278c, change.f116278c);
    }

    public final int hashCode() {
        return this.f116278c.hashCode() + (Integer.hashCode(this.f116277b) * 31);
    }

    @k
    public final String toString() {
        return "Change(initialQuantity=" + this.f116277b + ", actualItemInfo=" + this.f116278c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f116277b);
        parcel.writeParcelable(this.f116278c, i12);
    }
}
