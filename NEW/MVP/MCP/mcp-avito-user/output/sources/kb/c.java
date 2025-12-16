package KB;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PremiumBannerListItemModule_ProvideItemBinderFactory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f9357a;

    public c(A a12) {
        this.f9357a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f9357a.get();
        int i12 = a.f9355a;
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
