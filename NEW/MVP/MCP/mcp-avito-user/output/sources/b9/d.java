package B9;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: CommonFeatureTeaserModule_ProvideItemBinder$_avito_advert_core_implFactory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f915a;

    public d(A a12) {
        this.f915a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f915a.get();
        int i12 = b.f913a;
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
