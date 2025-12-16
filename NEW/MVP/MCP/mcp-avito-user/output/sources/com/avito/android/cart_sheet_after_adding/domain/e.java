package com.avito.android.cart_sheet_after_adding.domain;

import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: DiscountCalculator.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/domain/e;", "", "value", "", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f115341a;

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f115341a == ((e) obj).f115341a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f115341a);
    }

    public final String toString() {
        return r.u(new StringBuilder("DiscountedPrice(value="), this.f115341a, ')');
    }
}
