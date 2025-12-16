package com.avito.android.passport.profile_add.domain.interactor;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PassportAddProfileInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f212326a;

    /* renamed from: b, reason: collision with root package name */
    public final u f212327b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.h f212328c;

    /* renamed from: d, reason: collision with root package name */
    public final u f212329d;

    /* renamed from: e, reason: collision with root package name */
    public final u f212330e;

    public g(u uVar, u uVar2, dagger.internal.h hVar, u uVar3, u uVar4) {
        this.f212326a = uVar;
        this.f212327b = uVar2;
        this.f212328c = hVar;
        this.f212329d = uVar3;
        this.f212330e = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f212326a);
        h31.e eVarB2 = dagger.internal.g.b(this.f212327b);
        return new f(eVarB, eVarB2, (com.avito.android.passport_lib.h) this.f212329d.get(), (r60.d) this.f212330e.get());
    }
}
