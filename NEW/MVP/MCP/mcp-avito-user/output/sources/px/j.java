package PX;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MandatoryVerificationModule_ProvideAdapterPresenter$_avito_mandatory_verification_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f13114a;

    public j(u uVar) {
        this.f13114a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f13114a.get();
        i.f13113a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
