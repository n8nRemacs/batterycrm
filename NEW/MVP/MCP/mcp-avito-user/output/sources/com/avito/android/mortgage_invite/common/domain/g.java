package com.avito.android.mortgage_invite.common.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import e20.InterfaceC39928a;

/* compiled from: UpdateContactInfoUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f205521a;

    /* renamed from: b, reason: collision with root package name */
    public final u f205522b;

    /* renamed from: c, reason: collision with root package name */
    public final u f205523c;

    public g(u uVar, u uVar2, u uVar3) {
        this.f205521a = uVar;
        this.f205522b = uVar2;
        this.f205523c = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((InterfaceC39928a) this.f205521a.get(), (R0) this.f205522b.get(), (a) this.f205523c.get());
    }
}
