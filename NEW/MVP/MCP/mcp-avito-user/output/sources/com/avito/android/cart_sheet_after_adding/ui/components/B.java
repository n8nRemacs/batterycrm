package com.avito.android.cart_sheet_after_adding.ui.components;

import android.annotation.SuppressLint;
import kotlin.Metadata;

/* compiled from: Progress.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/ui/components/B;", "", "fraction", "", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"HardcodeStringDetector"})
/* loaded from: classes12.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final float f115523a;

    private /* synthetic */ B(float f12) {
        this.f115523a = f12;
    }

    public static final /* synthetic */ B a(float f12) {
        return new B(f12);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof B) {
            return Float.compare(this.f115523a, ((B) obj).f115523a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f115523a);
    }

    public final String toString() {
        return "Progress(fraction=" + this.f115523a + ')';
    }
}
