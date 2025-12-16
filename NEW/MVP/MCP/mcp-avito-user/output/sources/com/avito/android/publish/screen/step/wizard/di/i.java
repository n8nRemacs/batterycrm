package com.avito.android.publish.screen.step.wizard.di;

import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: WizardModule_ProvideItemPresentersSetFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final e f242503a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.wizard.d> f242504b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.checkable.d> f242505c;

    public i(e eVar, Provider<com.avito.android.blueprints.publish.wizard.d> provider, Provider<com.avito.android.blueprints.publish.checkable.d> provider2) {
        this.f242503a = eVar;
        this.f242504b = provider;
        this.f242505c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.publish.wizard.d dVar = this.f242504b.get();
        com.avito.android.blueprints.publish.checkable.d dVar2 = this.f242505c.get();
        this.f242503a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{dVar, dVar2});
        t.d(setL0);
        return setL0;
    }
}
