package com.avito.android.str_calendar.generated.api.di;

import com.avito.android.util.C35873q0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.P0;
import zy0.InterfaceC50643a;

/* compiled from: StrCalendarJsonModule_ProvideCustomTypeAdaptersFactory.java */
@e
@x
@y
/* loaded from: classes4.dex */
public final class b implements h<Set<C35873q0>> {

    /* compiled from: StrCalendarJsonModule_ProvideCustomTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f286659a = new b();
    }

    public static b a() {
        return a.f286659a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.str_calendar.generated.api.di.a.f286658a.getClass();
        return Collections.singleton(new C35873q0(InterfaceC50643a.class, P0.g(new Q("incorrect-data", InterfaceC50643a.b.class), new Q("success", InterfaceC50643a.C12982a.class))));
    }
}
