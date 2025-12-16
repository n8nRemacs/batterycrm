package com.avito.android.publish.input_imei.di;

import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: InputImeiModule_ProvideItemPresentersSetFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.input_imei.items.scan_button.d> f236335a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.input.d> f236336b;

    /* renamed from: c, reason: collision with root package name */
    public final u f236337c;

    public i(u uVar, Provider provider, Provider provider2) {
        this.f236335a = provider;
        this.f236336b = provider2;
        this.f236337c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.input_imei.items.scan_button.d dVar = this.f236335a.get();
        com.avito.android.blueprints.input.d dVar2 = this.f236336b.get();
        com.avito.android.blueprint.input.c cVar = (com.avito.android.blueprint.input.c) this.f236337c.get();
        d dVar3 = d.f236322a;
        Set setL0 = C42756l.l0(new TV0.d[]{dVar, dVar2, cVar});
        t.d(setL0);
        return setL0;
    }
}
