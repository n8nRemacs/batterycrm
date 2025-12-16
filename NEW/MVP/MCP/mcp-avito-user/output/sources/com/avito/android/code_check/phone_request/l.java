package com.avito.android.code_check.phone_request;

import com.avito.android.code_check_public.screen.d;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneRequestModule_ProvideInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<d.b> {

    /* renamed from: a, reason: collision with root package name */
    public final k f119086a;

    /* renamed from: b, reason: collision with root package name */
    public final u f119087b;

    public l(k kVar, u uVar) {
        this.f119086a = kVar;
        this.f119087b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.code_check_public.screen.d dVar = (com.avito.android.code_check_public.screen.d) this.f119087b.get();
        this.f119086a.getClass();
        d.b bVar = dVar.f119363d;
        t.d(bVar);
        return bVar;
    }
}
