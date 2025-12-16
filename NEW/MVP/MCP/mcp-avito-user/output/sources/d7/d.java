package d7;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import d7.InterfaceC39522a;
import dagger.internal.A;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: AdvertDetailsShortTermRentModule_ProvidesModule_ProvideTravelPaymentTogglesItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC39522a.C11010a f393705a;

    /* renamed from: b, reason: collision with root package name */
    public final A f393706b;

    public d(InterfaceC39522a.C11010a c11010a, A a12) {
        this.f393705a = c11010a;
        this.f393706b = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f393706b.get();
        this.f393705a.getClass();
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
