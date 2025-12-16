package K3;

import com.avito.android.active_orders_common.items.diff.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ActiveOrdersModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final c f9230a;

    /* renamed from: b, reason: collision with root package name */
    public final u f9231b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f9232c;

    /* renamed from: d, reason: collision with root package name */
    public final j f9233d;

    public g(c cVar, u uVar, Provider provider, j jVar) {
        this.f9230a = cVar;
        this.f9231b = uVar;
        this.f9232c = provider;
        this.f9233d = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f9231b.get();
        com.avito.konveyor.a aVar2 = this.f9232c.get();
        this.f9233d.getClass();
        com.avito.android.active_orders_common.items.diff.a aVar3 = new com.avito.android.active_orders_common.items.diff.a();
        this.f9230a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, aVar3);
    }
}
