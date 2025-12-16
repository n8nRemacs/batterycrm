package eB;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestItemModule_ProvideSuggestsAdapterPresenterFactory.java */
@e
@y
@x
/* renamed from: eB.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C39984c implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f395044a;

    public C39984c(u uVar) {
        this.f395044a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f395044a.get();
        C39982a.f395041a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
