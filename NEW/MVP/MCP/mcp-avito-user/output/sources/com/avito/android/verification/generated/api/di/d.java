package com.avito.android.verification.generated.api.di;

import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.avito.android.verification.generated.api.verification_view_disclaimer_api_v_4.a;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: VerificationJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes5.dex */
public final class d implements h<Set<r>> {

    /* compiled from: VerificationJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f323869a = new d();
    }

    public static d a() {
        return a.f323869a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.generated.api.di.a.f323866a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, com.avito.android.verification.generated.api.verification_view_disclaimer_api_v_4.a.class);
        optimalRuntimeTypeAdapterFactoryA.b(a.C10029a.class, "disclosureSection");
        optimalRuntimeTypeAdapterFactoryA.b(a.b.class, "iconText");
        optimalRuntimeTypeAdapterFactoryA.b(a.c.class, "listItem");
        optimalRuntimeTypeAdapterFactoryA.b(a.d.class, "plainText");
        return Collections.singleton(optimalRuntimeTypeAdapterFactoryA);
    }
}
