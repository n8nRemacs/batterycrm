package com.avito.android.map.di;

import dagger.internal.x;
import dagger.internal.y;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: AdvertsInPinModule_ProvideKonveyorItemBlueprintsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<Set<TV0.b<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WQ.c> f184842a;

    public g(Provider<WQ.c> provider) {
        this.f184842a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        WQ.c cVar = this.f184842a.get();
        d.f184841a.getClass();
        HashSet hashSetB = cVar.b();
        dagger.internal.t.d(hashSetB);
        return hashSetB;
    }
}
