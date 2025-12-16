package com.avito.android.payment.di.module;

import com.avito.android.payment.webview.model.WebPaymentPostMessageTypeAdapter;
import com.avito.android.util.X5;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: WebPaymentJsonModule_ProvideTypeAdaptersFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes15.dex */
public final class V implements dagger.internal.h<Set<X5>> {

    /* compiled from: WebPaymentJsonModule_ProvideTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final V f214235a = new V();
    }

    public static V a() {
        return a.f214235a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        U.f214234a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(com.avito.android.payment.webview.model.a.class, new WebPaymentPostMessageTypeAdapter()));
        return linkedHashSet;
    }
}
