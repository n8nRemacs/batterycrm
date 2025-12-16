package com.avito.android.passport.profile_add.domain.interactor;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PassportFinishMergeInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f212338a;

    /* renamed from: b, reason: collision with root package name */
    public final u f212339b;

    /* renamed from: c, reason: collision with root package name */
    public final u f212340c;

    public k(u uVar, u uVar2, u uVar3) {
        this.f212338a = uVar;
        this.f212339b = uVar2;
        this.f212340c = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(dagger.internal.g.b(this.f212338a), (com.avito.android.passport_lib.h) this.f212339b.get(), (r60.d) this.f212340c.get());
    }
}
