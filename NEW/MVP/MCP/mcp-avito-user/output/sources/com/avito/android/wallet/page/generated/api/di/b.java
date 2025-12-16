package com.avito.android.wallet.page.generated.api.di;

import PO0.b;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: WalletPageJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes5.dex */
public final class b implements h<Set<r>> {

    /* compiled from: WalletPageJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f327823a = new b();
    }

    public static b a() {
        return a.f327823a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.wallet.page.generated.api.di.a.f327822a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, PO0.b.class);
        optimalRuntimeTypeAdapterFactoryA.b(b.a.class, RequestReviewResultKt.INFO_TYPE);
        optimalRuntimeTypeAdapterFactoryA.b(b.C0846b.class, "unavailable");
        return Collections.singleton(optimalRuntimeTypeAdapterFactoryA);
    }
}
