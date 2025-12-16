package com.avito.android.mortgage.root.list.payloads;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: MortgageRootEnablingPayload.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/m;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f202915a;

    public m(boolean z12) {
        this.f202915a = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f202915a == ((m) obj).f202915a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202915a);
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.x(new StringBuilder("MortgageRootEnablingPayload(isEnable="), this.f202915a, ')');
    }
}
