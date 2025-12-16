package com.avito.android.login_suggests_impl.di;

import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: LoginSuggestsModule_ProvideAcceptableSocialsFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<Set<String>> {

    /* compiled from: LoginSuggestsModule_ProvideAcceptableSocialsFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f182926a = new f();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f182925a.getClass();
        Set setL0 = C42756l.l0(new String[]{"ok", "vk", "vk-id", "avitofake"});
        t.d(setL0);
        return setL0;
    }
}
