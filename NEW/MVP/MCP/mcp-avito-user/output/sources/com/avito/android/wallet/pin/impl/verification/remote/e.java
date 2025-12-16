package com.avito.android.wallet.pin.impl.verification.remote;

import com.avito.android.util.C35866p0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.P0;
import rP0.i;

/* compiled from: WalletPinVerificationJsonModule_ProvideCustomTypeAdaptersFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes5.dex */
public final class e implements h<Set<C35866p0>> {

    /* compiled from: WalletPinVerificationJsonModule_ProvideCustomTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f329346a = new e();
    }

    public static e a() {
        return a.f329346a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f329345a.getClass();
        return Collections.singleton(new C35866p0(i.class, P0.g(new Q("ok", i.b.class), new Q("incorrect-pin", i.a.class))));
    }
}
