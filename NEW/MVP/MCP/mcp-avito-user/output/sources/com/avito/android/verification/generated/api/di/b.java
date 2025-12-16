package com.avito.android.verification.generated.api.di;

import CM0.i;
import DM0.e;
import EM0.e;
import FM0.d;
import com.avito.android.util.C35873q0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.collections.P0;

/* compiled from: VerificationJsonModule_ProvideCustomTypeAdaptersFactory.java */
@e
@x
@y
/* loaded from: classes5.dex */
public final class b implements h<Set<C35873q0>> {

    /* compiled from: VerificationJsonModule_ProvideCustomTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f323867a = new b();
    }

    public static b a() {
        return a.f323867a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.generated.api.di.a.f323866a.getClass();
        Set setL0 = C42756l.l0(new C35873q0[]{new C35873q0(i.class, P0.g(new Q("errorDetails", i.b.class), new Q("success", i.a.class))), new C35873q0(DM0.e.class, P0.g(new Q("errorDetails", e.a.class), new Q("success", e.b.class))), new C35873q0(EM0.e.class, P0.g(new Q("errorDetails", e.a.class), new Q("success", e.b.class))), new C35873q0(FM0.d.class, P0.g(new Q("errorDetails", d.a.class), new Q("success", d.b.class)))});
        t.d(setL0);
        return setL0;
    }
}
