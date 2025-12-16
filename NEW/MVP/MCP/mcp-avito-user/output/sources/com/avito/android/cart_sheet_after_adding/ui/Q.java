package com.avito.android.cart_sheet_after_adding.ui;

import kotlin.Metadata;

/* compiled from: CartSheetAfterAddingScreen.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/ui/Q;", "", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f115517a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final O f115518b;

    public Q(@Y61.k String str, @Y61.l O o12) {
        this.f115517a = str;
        this.f115518b = o12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q12 = (Q) obj;
        return kotlin.jvm.internal.L.f(this.f115517a, q12.f115517a) && kotlin.jvm.internal.L.f(this.f115518b, q12.f115518b);
    }

    public final int hashCode() {
        int iHashCode = this.f115517a.hashCode() * 31;
        O o12 = this.f115518b;
        return iHashCode + (o12 == null ? 0 : o12.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "Seller(name=" + this.f115517a + ", reviews=" + this.f115518b + ')';
    }
}
