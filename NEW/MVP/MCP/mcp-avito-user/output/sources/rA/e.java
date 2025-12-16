package ra;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;
import ra.InterfaceC47623b;

/* compiled from: AdvertDetailsNeighboringDatesModule_NeighboringDatesItemsModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC47623b.a f429874a;

    /* renamed from: b, reason: collision with root package name */
    public final A f429875b;

    public e(InterfaceC47623b.a aVar, A a12) {
        this.f429874a = aVar;
        this.f429875b = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f429875b.get();
        this.f429874a.getClass();
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
