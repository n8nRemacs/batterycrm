package com.avito.android.safety.common;

import com.avito.android.account.G;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GetLoggedEmailUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f257197a;

    /* renamed from: b, reason: collision with root package name */
    public final u f257198b;

    /* renamed from: c, reason: collision with root package name */
    public final u f257199c;

    public d(u uVar, u uVar2, u uVar3) {
        this.f257197a = uVar;
        this.f257198b = uVar2;
        this.f257199c = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((G) this.f257197a.get(), (B3.c) this.f257198b.get(), (B3.a) this.f257199c.get());
    }
}
