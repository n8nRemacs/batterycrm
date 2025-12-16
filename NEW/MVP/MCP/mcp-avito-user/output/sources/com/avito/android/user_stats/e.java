package com.avito.android.user_stats;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserStatsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f316997a;

    /* renamed from: b, reason: collision with root package name */
    public final u f316998b;

    /* renamed from: c, reason: collision with root package name */
    public final u f316999c;

    public e(u uVar, u uVar2, u uVar3) {
        this.f316997a = uVar;
        this.f316998b = uVar2;
        this.f316999c = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((InterfaceC35745a5) this.f316999c.get(), g.a(w.a(this.f316997a)), g.a(w.a(this.f316998b)));
    }
}
