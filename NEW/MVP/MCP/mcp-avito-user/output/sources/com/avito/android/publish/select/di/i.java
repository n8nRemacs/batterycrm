package com.avito.android.publish.select.di;

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
public final class i implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final c f242688a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.checkable.d> f242689b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.header.e> f242690c;

    public i(c cVar, Provider<com.avito.android.blueprints.publish.checkable.d> provider, Provider<com.avito.android.blueprints.publish.header.e> provider2) {
        this.f242688a = cVar;
        this.f242689b = provider;
        this.f242690c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.publish.checkable.d dVar = this.f242689b.get();
        com.avito.android.blueprints.publish.header.e eVar = this.f242690c.get();
        this.f242688a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{dVar, eVar});
        t.d(setL0);
        return setL0;
    }
}
