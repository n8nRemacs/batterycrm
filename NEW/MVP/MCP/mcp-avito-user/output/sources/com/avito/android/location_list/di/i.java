package com.avito.android.location_list.di;

import com.avito.android.location_list.C31521o;
import com.avito.android.location_list.C31523q;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LocationListModule_ProvideLocationItemSingleLineBluePrintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<C31523q> {

    /* renamed from: a, reason: collision with root package name */
    public final d f182026a;

    /* renamed from: b, reason: collision with root package name */
    public final u f182027b;

    public i(d dVar, u uVar) {
        this.f182026a = dVar;
        this.f182027b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C31521o c31521o = (C31521o) this.f182027b.get();
        this.f182026a.getClass();
        return new C31523q(c31521o);
    }
}
