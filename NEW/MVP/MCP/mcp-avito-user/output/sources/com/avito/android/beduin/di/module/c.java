package com.avito.android.beduin.di.module;

import com.avito.android.deep_linking.links.BeduinWebPaymentResultLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;
import lv.C43834a;

/* compiled from: BeduinDeeplinkHandlerModule_ProvideBeduinWebPaymentResultLinkMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* compiled from: BeduinDeeplinkHandlerModule_ProvideBeduinWebPaymentResultLinkMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f103944a = new c();
    }

    public static c a() {
        return a.f103944a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.beduin.di.module.a.f103942a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        kotlin.reflect.d dVarB = m0.f406844a.b(BeduinWebPaymentResultLink.class);
        com.avito.android.beduin.common.component.payment_webview.h hVar = new com.avito.android.beduin.common.component.payment_webview.h();
        c11807a.getClass();
        return C43834a.C11807a.a(dVarB, hVar);
    }
}
