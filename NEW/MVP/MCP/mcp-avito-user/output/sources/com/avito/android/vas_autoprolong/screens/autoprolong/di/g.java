package com.avito.android.vas_autoprolong.screens.autoprolong.di;

import com.avito.android.vas_autoprolong.screens.autoprolong.deeplink.AutoprolongDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: AutoprolongFragmentMappingsModule_ProvideAutoprolongFragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<A50.a> {

    /* compiled from: AutoprolongFragmentMappingsModule_ProvideAutoprolongFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f319483a = new g();
    }

    public static g a() {
        return a.f319483a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f.f319482a.getClass();
        return new A50.a(m0.f406844a.b(AutoprolongDeepLink.class), new com.avito.android.vas_autoprolong.screens.autoprolong.f());
    }
}
