package com.avito.android.sbc.generated.api.di;

import com.avito.android.sbc.generated.api.api_create_dispatch_v_1.ApiCreateDispatchV1Response;
import com.avito.android.util.C35873q0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: SbcJsonModule_ProvideCustomTypeAdaptersFactory.java */
@e
@x
@y
/* loaded from: classes3.dex */
public final class b implements h<Set<C35873q0>> {

    /* compiled from: SbcJsonModule_ProvideCustomTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f260180a = new b();
    }

    public static b a() {
        return a.f260180a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.sbc.generated.api.di.a.f260179a.getClass();
        return Collections.singleton(new C35873q0(ApiCreateDispatchV1Response.class, P0.g(new Q("custom-error", ApiCreateDispatchV1Response.CustomApiErrorCustomError.class), new Q("success", ApiCreateDispatchV1Response.a.class))));
    }
}
