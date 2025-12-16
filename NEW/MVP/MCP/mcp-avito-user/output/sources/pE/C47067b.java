package pe;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileItemModule_ProvideBlueprint$_avito_authorization_implFactory.java */
@e
@y
@x
/* renamed from: pe.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47067b implements h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final C47066a f428703a;

    /* renamed from: b, reason: collision with root package name */
    public final u f428704b;

    public C47067b(C47066a c47066a, u uVar) {
        this.f428703a = c47066a;
        this.f428704b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.authorization.select_profile.adapter.profile.b bVar = (com.avito.android.authorization.select_profile.adapter.profile.b) this.f428704b.get();
        this.f428703a.getClass();
        return new com.avito.android.authorization.select_profile.adapter.profile.a(bVar);
    }
}
