package com.avito.android.cart_sheet_after_adding.ui;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: CartSheetAfterAddingScreen.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/ui/O;", "", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f115515a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f115516b;

    public O(@Y61.k String str, @Y61.k String str2) {
        this.f115515a = str;
        this.f115516b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o12 = (O) obj;
        return kotlin.jvm.internal.L.f(this.f115515a, o12.f115515a) && kotlin.jvm.internal.L.f(this.f115516b, o12.f115516b);
    }

    public final int hashCode() {
        return this.f115516b.hashCode() + (this.f115515a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Reviews(rating=");
        sb2.append(this.f115515a);
        sb2.append(", reviewsCount=");
        return C22026a.c(sb2, this.f115516b, ')');
    }
}
