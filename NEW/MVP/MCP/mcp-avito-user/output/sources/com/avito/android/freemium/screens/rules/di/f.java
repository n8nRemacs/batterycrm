package com.avito.android.freemium.screens.rules.di;

import com.avito.android.freemium.screens.rules.deeplink.FreemiumRulesLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: FreemiumRulesFragmentMappingsModule_ProvideFreemiumRulesMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<A50.a> {

    /* compiled from: FreemiumRulesFragmentMappingsModule_ProvideFreemiumRulesMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f159097a = new f();
    }

    public static f a() {
        return a.f159097a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e.f159096a.getClass();
        return new A50.a(m0.f406844a.b(FreemiumRulesLink.class), new com.avito.android.freemium.screens.rules.g());
    }
}
