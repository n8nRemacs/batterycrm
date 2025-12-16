package com.avito.android.freemium.screens.contact_history.di;

import com.avito.android.freemium.screens.contact_history.deeplink.FreemiumContactHistoryLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: FreemiumContactHistoryFragmentMappingsModule_ProvideFreemiumContactHistoryMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<A50.a> {

    /* compiled from: FreemiumContactHistoryFragmentMappingsModule_ProvideFreemiumContactHistoryMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f158970a = new f();
    }

    public static f a() {
        return a.f158970a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e.f158969a.getClass();
        return new A50.a(m0.f406844a.b(FreemiumContactHistoryLink.class), new com.avito.android.freemium.screens.contact_history.f());
    }
}
