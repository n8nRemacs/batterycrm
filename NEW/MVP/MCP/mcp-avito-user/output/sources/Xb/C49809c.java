package xB;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: CategorizerItemModule_ProvideItemBinderFactory.java */
@e
@y
@x
/* renamed from: xB.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C49809c implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f442293a;

    public C49809c(A a12) {
        this.f442293a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f442293a.get();
        int i12 = C49807a.f442291a;
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
