package com.avito.android.comfortable_deal.select_agent.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: SelectAgentAdapterModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f122706a;

    public d(A a12) {
        this.f122706a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f122706a.get();
        int i12 = b.f122704a;
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
