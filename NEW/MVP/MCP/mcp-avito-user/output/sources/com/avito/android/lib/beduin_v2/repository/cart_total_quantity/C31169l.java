package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import kotlin.Metadata;

/* compiled from: CartIconQuantityUpdate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/l;", "", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.repository.cart_total_quantity.l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C31169l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Integer f176504a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f176505b;

    public C31169l(@Y61.l Integer num, boolean z12) {
        this.f176504a = num;
        this.f176505b = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31169l)) {
            return false;
        }
        C31169l c31169l = (C31169l) obj;
        return kotlin.jvm.internal.L.f(this.f176504a, c31169l.f176504a) && this.f176505b == c31169l.f176505b;
    }

    public final int hashCode() {
        Integer num = this.f176504a;
        return Boolean.hashCode(this.f176505b) + ((num == null ? 0 : num.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CartIconQuantityUpdate(quantity=");
        sb2.append(this.f176504a);
        sb2.append(", isUpdated=");
        return androidx.appcompat.app.r.x(sb2, this.f176505b, ')');
    }
}
