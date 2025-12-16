package eB;

import com.avito.konveyor.adapter.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestItemModule_ProvideSuggestsAdapterFactory.java */
@e
@y
@x
/* renamed from: eB.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C39983b implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f395042a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f395043b;

    public C39983b(u uVar, Provider provider) {
        this.f395042a = uVar;
        this.f395043b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f395042a.get();
        com.avito.konveyor.a aVar2 = this.f395043b.get();
        C39982a.f395041a.getClass();
        return new j(aVar, aVar2);
    }
}
