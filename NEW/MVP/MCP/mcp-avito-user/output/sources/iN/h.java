package in;

import androidx.recyclerview.widget.C23424o;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CartSimilarItemsKonveyorModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f398760a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f398761b;

    /* renamed from: c, reason: collision with root package name */
    public final u f398762c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f398760a = provider;
        this.f398761b = provider2;
        this.f398762c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f398760a.get();
        com.avito.konveyor.a aVar2 = this.f398761b.get();
        C23424o.f fVar = (C23424o.f) this.f398762c.get();
        e.f398757a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, fVar);
    }
}
