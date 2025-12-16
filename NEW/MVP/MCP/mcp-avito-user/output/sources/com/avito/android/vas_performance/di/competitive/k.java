package com.avito.android.vas_performance.di.competitive;

import Zx.C19616a;
import ay.C24193b;
import com.avito.android.vas_performance.C36055i;
import com.avito.android.vas_performance.deeplink.CompetitiveVasLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: CompetitiveVasFragmentMappingsModule_ProvideCompetitiveVasFragmentMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<A50.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C24193b f319953a;

    public k(C24193b c24193b) {
        this.f319953a = c24193b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C19616a c19616a = (C19616a) this.f319953a.get();
        j.f319952a.getClass();
        return new A50.a(m0.f406844a.b(CompetitiveVasLink.class), new C36055i(c19616a));
    }
}
