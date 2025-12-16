package com.avito.android.cart_sheet_after_adding.domain;

import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: DiscountCalculator.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/domain/d;", "", "value", "", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f115340a;

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f115340a == ((d) obj).f115340a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f115340a);
    }

    public final String toString() {
        return r.t(new StringBuilder("DiscountPercents(value="), this.f115340a, ')');
    }
}
