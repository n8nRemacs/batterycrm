package com.avito.android.iac_dialer.impl_module.telecom;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacConnectionException.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/IacConnectionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacConnectionException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f166402b;

    public IacConnectionException(@k String str) {
        this.f166402b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IacConnectionException) && L.f(this.f166402b, ((IacConnectionException) obj).f166402b);
    }

    @Override // java.lang.Throwable
    @k
    public final String getMessage() {
        return this.f166402b;
    }

    public final int hashCode() {
        return this.f166402b.hashCode();
    }

    @Override // java.lang.Throwable
    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("IacConnectionException(message="), this.f166402b, ')');
    }
}
