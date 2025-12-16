package com.avito.android.verification.generated.api.di;

import com.avito.android.verification.generated.api.verification_view_disclaimer_api_v_4.DisclaimerItemsTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: VerificationJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes5.dex */
public final class c implements h<Set<r>> {

    /* compiled from: VerificationJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f323868a = new c();
    }

    public static c a() {
        return a.f323868a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.generated.api.di.a.f323866a.getClass();
        return Collections.singleton(new DisclaimerItemsTypeAdapterFactory());
    }
}
