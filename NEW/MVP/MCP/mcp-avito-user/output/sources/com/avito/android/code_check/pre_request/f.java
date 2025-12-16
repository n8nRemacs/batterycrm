package com.avito.android.code_check.pre_request;

import com.avito.android.code_check_public.screen.g;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PreRequestModule_ProvideInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<g.a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f119180a;

    /* renamed from: b, reason: collision with root package name */
    public final u f119181b;

    public f(e eVar, u uVar) {
        this.f119180a = eVar;
        this.f119181b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.code_check_public.screen.g gVar = (com.avito.android.code_check_public.screen.g) this.f119181b.get();
        this.f119180a.getClass();
        g.a aVar = gVar.f119383d;
        t.d(aVar);
        return aVar;
    }
}
