package Kq0;

import androidx.recyclerview.widget.C23424o;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SellerPromotionsKonveyorModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f9667a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f9668b;

    /* renamed from: c, reason: collision with root package name */
    public final u f9669c;

    public g(u uVar, Provider provider, Provider provider2) {
        this.f9667a = provider;
        this.f9668b = provider2;
        this.f9669c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f9667a.get();
        com.avito.konveyor.a aVar2 = this.f9668b.get();
        C23424o.f fVar = (C23424o.f) this.f9669c.get();
        d.f9664a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, fVar);
    }
}
