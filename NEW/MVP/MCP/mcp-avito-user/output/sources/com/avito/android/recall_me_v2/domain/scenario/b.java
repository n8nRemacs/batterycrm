package com.avito.android.recall_me_v2.domain.scenario;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.code_check_public.screen.d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RecallMeCodeCheckScenarioBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f252056a;

    /* renamed from: b, reason: collision with root package name */
    public final f f252057b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f252058c;

    public b(h hVar, f fVar, dagger.internal.f fVar2) {
        this.f252056a = hVar;
        this.f252057b = fVar;
        this.f252058c = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d.b) this.f252056a.get(), (c.b) this.f252057b.get(), (InterfaceC28373a) this.f252058c.get());
    }
}
