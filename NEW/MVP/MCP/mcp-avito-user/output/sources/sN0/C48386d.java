package sn0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: SerpVerticalRubricatorModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: sn0.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C48386d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f438849a;

    public C48386d(A a12) {
        this.f438849a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f438849a.get();
        C48385c.f438848a.getClass();
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
