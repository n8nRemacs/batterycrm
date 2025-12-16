package com.avito.android.short_term_rent.generated.api.di;

import com.avito.android.util.C35873q0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;
import jw0.InterfaceC42434a;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ShortTermRentJsonModule_ProvideCustomTypeAdaptersFactory.java */
@e
@x
@y
/* loaded from: classes3.dex */
public final class b implements h<Set<C35873q0>> {

    /* compiled from: ShortTermRentJsonModule_ProvideCustomTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f282388a = new b();
    }

    public static b a() {
        return a.f282388a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.short_term_rent.generated.api.di.a.f282387a.getClass();
        return Collections.singleton(new C35873q0(InterfaceC42434a.class, P0.g(new Q("incorrect-data", InterfaceC42434a.C11590a.class), new Q("success", InterfaceC42434a.b.class))));
    }
}
