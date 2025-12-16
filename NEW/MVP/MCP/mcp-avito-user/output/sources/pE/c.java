package pe;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileItemModule_ProvidePresenter$_avito_authorization_implFactory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<com.avito.android.authorization.select_profile.adapter.profile.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C47066a f428705a;

    /* renamed from: b, reason: collision with root package name */
    public final u f428706b;

    public c(C47066a c47066a, u uVar) {
        this.f428705a = c47066a;
        this.f428706b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.jakewharton.rxrelay3.c cVar = (com.jakewharton.rxrelay3.c) this.f428706b.get();
        this.f428705a.getClass();
        return new com.avito.android.authorization.select_profile.adapter.profile.e(cVar);
    }
}
