package com.avito.android.cart_snippet_actions.models.api;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CartSnippetActionsStepper.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/cart_snippet_actions/models/api/CartSnippetActionsStepper;", "Landroid/os/Parcelable;", "", "value", "maxValue", "", "isStocksVisible", "<init>", "(ILjava/lang/Integer;Ljava/lang/Boolean;)V", "I", "d", "()I", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "_avito_cart-snippet-actions_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartSnippetActionsStepper implements Parcelable {

    @k
    public static final Parcelable.Creator<CartSnippetActionsStepper> CREATOR = new a();

    @c("isStocksVisible")
    @l
    private final Boolean isStocksVisible;

    @c("maxValue")
    @l
    private final Integer maxValue;

    @c("value")
    private final int value;

    /* compiled from: CartSnippetActionsStepper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CartSnippetActionsStepper> {
        @Override // android.os.Parcelable.Creator
        public final CartSnippetActionsStepper createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CartSnippetActionsStepper(i12, numValueOf, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final CartSnippetActionsStepper[] newArray(int i12) {
            return new CartSnippetActionsStepper[i12];
        }
    }

    public CartSnippetActionsStepper(int i12, @l Integer num, @l Boolean bool) {
        this.value = i12;
        this.maxValue = num;
        this.isStocksVisible = bool;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Integer getMaxValue() {
        return this.maxValue;
    }

    /* renamed from: d, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Boolean getIsStocksVisible() {
        return this.isStocksVisible;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartSnippetActionsStepper)) {
            return false;
        }
        CartSnippetActionsStepper cartSnippetActionsStepper = (CartSnippetActionsStepper) obj;
        return this.value == cartSnippetActionsStepper.value && L.f(this.maxValue, cartSnippetActionsStepper.maxValue) && L.f(this.isStocksVisible, cartSnippetActionsStepper.isStocksVisible);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.value) * 31;
        Integer num = this.maxValue;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isStocksVisible;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CartSnippetActionsStepper(value=");
        sb2.append(this.value);
        sb2.append(", maxValue=");
        sb2.append(this.maxValue);
        sb2.append(", isStocksVisible=");
        return C0.g(sb2, this.isStocksVisible, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.value);
        Integer num = this.maxValue;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Boolean bool = this.isStocksVisible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
