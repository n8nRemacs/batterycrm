package com.avito.android.freemium.screens.rules.di;

import com.avito.android.freemium.screens.rules.deeplink.FreemiumRulesLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: FreemiumRulesDeeplinkMappingsModule_ProvideFreemiumRulesMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.freemium.screens.rules.deeplink.b f159095a;

    public d(com.avito.android.freemium.screens.rules.deeplink.b bVar) {
        this.f159095a = bVar;
    }

    public static C43834a a(com.avito.android.freemium.screens.rules.deeplink.b bVar) {
        c.f159094a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(FreemiumRulesLink.class, new com.avito.android.freemium.screens.rules.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(FreemiumRulesLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f159095a);
    }
}
