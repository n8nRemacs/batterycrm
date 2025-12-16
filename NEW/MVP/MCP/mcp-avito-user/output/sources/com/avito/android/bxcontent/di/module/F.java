package com.avito.android.bxcontent.di.module;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: BxContentModule_ProvideItemBinder$_avito_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class F implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.A f110885a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.A f110886b;

    public F(dagger.internal.A a12, dagger.internal.A a13) {
        this.f110885a = a12;
        this.f110886b = a13;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f110885a.get();
        Set set2 = (Set) this.f110886b.get();
        C29070s.f111022a.getClass();
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            c10493a.b((TV0.b) it2.next());
        }
        return c10493a.a();
    }
}
