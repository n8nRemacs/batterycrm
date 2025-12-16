package WI0;

import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAdvertsActionsModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f17849a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f17850b;

    public e(u uVar, Provider provider) {
        this.f17849a = uVar;
        this.f17850b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.h hVar = (com.avito.konveyor.adapter.h) this.f17849a.get();
        com.avito.konveyor.a aVar = this.f17850b.get();
        b.f17845a.getClass();
        j jVar = new j(hVar, aVar);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
