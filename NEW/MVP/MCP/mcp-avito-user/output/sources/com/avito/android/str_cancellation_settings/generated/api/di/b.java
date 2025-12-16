package com.avito.android.str_cancellation_settings.generated.api.di;

import Py0.InterfaceC14857a;
import com.avito.android.util.C35873q0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: StrCancellationSettingsJsonModule_ProvideCustomTypeAdaptersFactory.java */
@e
@x
@y
/* loaded from: classes4.dex */
public final class b implements h<Set<C35873q0>> {

    /* compiled from: StrCancellationSettingsJsonModule_ProvideCustomTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f288384a = new b();
    }

    public static b a() {
        return a.f288384a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.str_cancellation_settings.generated.api.di.a.f288383a.getClass();
        return Collections.singleton(new C35873q0(InterfaceC14857a.class, P0.g(new Q("discount-value-error", InterfaceC14857a.C0875a.class), new Q("success", InterfaceC14857a.b.class))));
    }
}
