package com.avito.android.hotel_available_rooms.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: RoomsAdapterModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class E implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C f162671a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.A f162672b;

    public E(C c12, dagger.internal.A a12) {
        this.f162671a = c12;
        this.f162672b = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f162672b.get();
        this.f162671a.getClass();
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
