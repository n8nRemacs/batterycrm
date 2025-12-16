package com.avito.android.ab_tests;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TestExposureListenerImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/d0;", "Lcom/avito/android/ab_tests/c0;", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final B f67940a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f67941b;

    @Inject
    public d0(@Y61.k B b12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f67940a = b12;
        this.f67941b = interfaceC28373a;
    }

    @Override // com.avito.android.ab_tests.c0
    public final void a(@Y61.k u3.m<?> mVar) {
        String strValueOf;
        com.avito.android.analytics.events.h.a(mVar, this.f67941b);
        T t12 = mVar.f439749b;
        u3.j jVar = t12 instanceof u3.j ? (u3.j) t12 : null;
        if (jVar == null || (strValueOf = jVar.getF67810b()) == null) {
            strValueOf = String.valueOf(t12);
        }
        this.f67940a.a(mVar.f439751d, strValueOf);
    }
}
