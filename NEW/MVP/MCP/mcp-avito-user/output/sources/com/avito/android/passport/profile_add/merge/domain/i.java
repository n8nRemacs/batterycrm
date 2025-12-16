package com.avito.android.passport.profile_add.merge.domain;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import l60.InterfaceC43550a;

/* compiled from: PassportAccountsMergeInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f213042a;

    /* renamed from: b, reason: collision with root package name */
    public final u f213043b;

    /* renamed from: c, reason: collision with root package name */
    public final u f213044c;

    /* renamed from: d, reason: collision with root package name */
    public final u f213045d;

    /* renamed from: e, reason: collision with root package name */
    public final u f213046e;

    public i(u uVar, u uVar2, u uVar3, u uVar4, u uVar5) {
        this.f213042a = uVar;
        this.f213043b = uVar2;
        this.f213044c = uVar3;
        this.f213045d = uVar4;
        this.f213046e = uVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((I50.a) this.f213042a.get(), (InterfaceC43550a) this.f213043b.get(), (com.avito.android.server_time.a) this.f213044c.get(), (com.avito.android.passport_lib.h) this.f213045d.get(), (r60.d) this.f213046e.get());
    }
}
