package com.avito.android.location_list.di;

import com.avito.android.location_list.C31526u;
import com.avito.android.location_list.C31528w;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LocationListModule_ProvideLocationItemTwoLinesBluePrintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<C31528w> {

    /* renamed from: a, reason: collision with root package name */
    public final d f182030a;

    /* renamed from: b, reason: collision with root package name */
    public final u f182031b;

    public k(d dVar, u uVar) {
        this.f182030a = dVar;
        this.f182031b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C31526u c31526u = (C31526u) this.f182031b.get();
        this.f182030a.getClass();
        return new C31528w(c31526u);
    }
}
