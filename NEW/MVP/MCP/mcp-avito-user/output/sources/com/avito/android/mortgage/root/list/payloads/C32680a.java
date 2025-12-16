package com.avito.android.mortgage.root.list.payloads;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: MortgageRootAddBorrowerPayload.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.root.list.payloads.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C32680a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f202893a;

    public C32680a(boolean z12) {
        this.f202893a = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32680a) && this.f202893a == ((C32680a) obj).f202893a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202893a);
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.x(new StringBuilder("MortgageRootAddBorrowerPayload(isLoading="), this.f202893a, ')');
    }
}
