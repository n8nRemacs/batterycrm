package com.avito.android.str_seller_orders_important_to_note.generated.api.di;

import Zz0.e;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: StrSellerOrdersImportantToNoteJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes4.dex */
public final class b implements h<Set<r>> {

    /* compiled from: StrSellerOrdersImportantToNoteJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f291370a = new b();
    }

    public static b a() {
        return a.f291370a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.str_seller_orders_important_to_note.generated.api.di.a.f291369a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, Zz0.e.class);
        optimalRuntimeTypeAdapterFactoryA.b(e.a.class, "bookingInfo");
        return Collections.singleton(optimalRuntimeTypeAdapterFactoryA);
    }
}
