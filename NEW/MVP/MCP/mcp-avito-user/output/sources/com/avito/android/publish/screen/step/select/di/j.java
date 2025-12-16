package com.avito.android.publish.screen.step.select.di;

import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: SelectModule_ProvideItemPresentersSetFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final d f242159a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.checkable.d> f242160b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.header.e> f242161c;

    public j(d dVar, Provider<com.avito.android.blueprints.publish.checkable.d> provider, Provider<com.avito.android.blueprints.publish.header.e> provider2) {
        this.f242159a = dVar;
        this.f242160b = provider;
        this.f242161c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.publish.checkable.d dVar = this.f242160b.get();
        com.avito.android.blueprints.publish.header.e eVar = this.f242161c.get();
        this.f242159a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{dVar, eVar});
        t.d(setL0);
        return setL0;
    }
}
