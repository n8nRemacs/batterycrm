package com.avito.android.delivery_common;

import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: Milliseconds.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_common/a;", "", "value", "", "_avito_delivery-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f135004a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f135004a == ((a) obj).f135004a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f135004a);
    }

    public final String toString() {
        return r.u(new StringBuilder("Milliseconds(value="), this.f135004a, ')');
    }
}
