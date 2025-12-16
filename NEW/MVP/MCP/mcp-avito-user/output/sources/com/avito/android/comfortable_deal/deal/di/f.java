package com.avito.android.comfortable_deal.deal.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: DealAdapterModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f121058a;

    public f(A a12) {
        this.f121058a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f121058a.get();
        int i12 = b.f121052a;
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
