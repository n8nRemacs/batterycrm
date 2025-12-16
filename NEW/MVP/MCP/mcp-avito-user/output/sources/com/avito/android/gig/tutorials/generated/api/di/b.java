package com.avito.android.gig.tutorials.generated.api.di;

import com.avito.android.gig.tutorials.generated.api.customer_rules_v_1.MaterialIconTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: TutorialsJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes13.dex */
public final class b implements h<Set<r>> {

    /* compiled from: TutorialsJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f159515a = new b();
    }

    public static b a() {
        return a.f159515a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.gig.tutorials.generated.api.di.a.f159514a.getClass();
        return Collections.singleton(new MaterialIconTypeAdapterFactory());
    }
}
