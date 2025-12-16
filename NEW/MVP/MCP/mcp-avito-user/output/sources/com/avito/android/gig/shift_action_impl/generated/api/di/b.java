package com.avito.android.gig.shift_action_impl.generated.api.di;

import com.avito.android.gig.shift_action_impl.generated.api.qr_scan_v_2.ActionV2ActionNameTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: ShiftActionJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes13.dex */
public final class b implements h<Set<r>> {

    /* compiled from: ShiftActionJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f159446a = new b();
    }

    public static b a() {
        return a.f159446a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.gig.shift_action_impl.generated.api.di.a.f159445a.getClass();
        return Collections.singleton(new ActionV2ActionNameTypeAdapterFactory());
    }
}
