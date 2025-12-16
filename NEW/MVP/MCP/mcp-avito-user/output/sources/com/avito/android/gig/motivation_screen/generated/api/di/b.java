package com.avito.android.gig.motivation_screen.generated.api.di;

import com.avito.android.gig.motivation_screen.generated.api.get_gig_worker_motivation.ProgressDutyTypeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: MotivationScreenJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes13.dex */
public final class b implements h<Set<r>> {

    /* compiled from: MotivationScreenJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f159432a = new b();
    }

    public static b a() {
        return a.f159432a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.gig.motivation_screen.generated.api.di.a.f159431a.getClass();
        return Collections.singleton(new ProgressDutyTypeTypeAdapterFactory());
    }
}
