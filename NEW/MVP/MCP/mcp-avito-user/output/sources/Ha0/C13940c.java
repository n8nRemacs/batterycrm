package Ha0;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ActiveServiceBookingsModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Ha0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13940c implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C13939b f7276a;

    /* renamed from: b, reason: collision with root package name */
    public final u f7277b;

    public C13940c(C13939b c13939b, u uVar) {
        this.f7276a = c13939b;
        this.f7277b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f7277b.get();
        this.f7276a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
