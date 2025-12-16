package Zr0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: VerticalPublishModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f20530a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented.a> f20531b;

    public g(A a12, Provider provider) {
        this.f20530a = a12;
        this.f20531b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f20530a.get();
        com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented.a aVar = this.f20531b.get();
        int i12 = d.f20527a;
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        c10493a.b(aVar);
        return c10493a.a();
    }
}
