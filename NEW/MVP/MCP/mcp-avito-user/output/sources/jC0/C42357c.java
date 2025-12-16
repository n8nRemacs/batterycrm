package jc0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: SelectionsItemModule_ProvideItemBinderFactory.java */
@e
@y
@x
/* renamed from: jc0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C42357c implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f405739a;

    public C42357c(A a12) {
        this.f405739a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f405739a.get();
        int i12 = C42355a.f405737a;
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
