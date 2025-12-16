package com.avito.android.analytics.events;

import com.avito.android.analytics.InterfaceC28373a;
import kotlin.Metadata;
import u3.C48781e;

/* compiled from: ExposureEvent.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_ab-tests_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {
    public static final void a(@Y61.k u3.m mVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        C48781e c48781e = mVar.f439748a;
        if (c48781e == null || !c48781e.getClientExposure()) {
            return;
        }
        interfaceC28373a.c(new g(mVar));
    }
}
