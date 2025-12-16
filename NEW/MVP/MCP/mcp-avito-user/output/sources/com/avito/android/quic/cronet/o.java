package com.avito.android.quic.cronet;

import com.avito.android.I1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import j.InterfaceC42148d;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: CronetExceptionsConverter.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/o;", "", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f246220a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I1 f246221b;

    @Inject
    public o(@Y61.k I1 i12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f246220a = interfaceC28373a;
        this.f246221b = i12;
    }

    @Y61.l
    @InterfaceC42148d
    public final CronetException a(@Y61.k Throwable th2) {
        CronetException cronetException;
        CronetException cronetException2;
        n nVar = n.f246219l;
        Throwable cause = th2;
        while (true) {
            if (cause == null) {
                cronetException = null;
                break;
            }
            cronetException = (CronetException) nVar.invoke(cause);
            if (cronetException != null) {
                break;
            }
            cause = cause.getCause();
        }
        InterfaceC28373a interfaceC28373a = this.f246220a;
        if (cronetException != null) {
            interfaceC28373a.c(new y.a("cronet.errors-conversion.static", 0L, 2, null));
            return cronetException;
        }
        m mVar = new m(this, th2);
        while (true) {
            if (th2 == null) {
                cronetException2 = null;
                break;
            }
            cronetException2 = (CronetException) mVar.invoke(th2);
            if (cronetException2 != null) {
                break;
            }
            th2 = th2.getCause();
        }
        if (cronetException2 == null) {
            return null;
        }
        interfaceC28373a.c(new y.a("cronet.errors-conversion.dynamic", 0L, 2, null));
        return cronetException2;
    }
}
