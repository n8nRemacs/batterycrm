package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacDialerLogger.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/q;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/o;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class q implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f165635a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Throwable f165636b;

    public q(@Y61.k String str, @Y61.l Throwable th2) {
        this.f165635a = str;
        this.f165636b = th2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return L.f(this.f165635a, qVar.f165635a) && L.f(this.f165636b, qVar.f165636b);
    }

    public final int hashCode() {
        int iHashCode = this.f165635a.hashCode() * 31;
        Throwable th2 = this.f165636b;
        return iHashCode + (th2 == null ? 0 : th2.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LogE(message=");
        sb2.append(this.f165635a);
        sb2.append(", t=");
        return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f165636b, ')');
    }
}
