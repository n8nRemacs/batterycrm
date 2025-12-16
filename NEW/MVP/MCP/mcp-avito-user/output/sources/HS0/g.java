package hs0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: VerticalFilterModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f397433a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.chips.a> f397434b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f397435c;

    public g(A a12, Provider provider, dagger.internal.u uVar) {
        this.f397433a = a12;
        this.f397434b = provider;
        this.f397435c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f397433a.get();
        com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.chips.a aVar = this.f397434b.get();
        com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented.a aVar2 = (com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented.a) this.f397435c.get();
        C40977a c40977a = C40977a.f397427a;
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        c10493a.b(aVar2);
        c10493a.b(aVar);
        return c10493a.a();
    }
}
