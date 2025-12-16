package com.avito.android.authorization.confirm_3fa.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConfirmEmailListActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f93601a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f93602b;

    public d(u uVar, Provider provider) {
        this.f93601a = uVar;
        this.f93602b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((j) this.f93601a.get(), this.f93602b.get());
    }
}
