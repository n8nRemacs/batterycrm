package com.avito.android.code_check.phone_request.mvi;

import com.avito.android.code_check_public.screen.d;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneRequestActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f119120a;

    /* renamed from: b, reason: collision with root package name */
    public final u f119121b;

    public g(u uVar, u uVar2) {
        this.f119120a = uVar;
        this.f119121b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((d.b) this.f119120a.get(), (com.avito.android.code_check.d) this.f119121b.get());
    }
}
