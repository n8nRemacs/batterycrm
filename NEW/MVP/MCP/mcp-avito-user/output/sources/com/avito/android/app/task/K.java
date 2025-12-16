package com.avito.android.app.task;

import com.avito.android.messenger.InterfaceC32572u;
import javax.inject.Provider;

/* compiled from: HashIdChangesObservingTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class K implements dagger.internal.h<HashIdChangesObservingTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC32572u> f91476a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f91477b;

    public K(dagger.internal.u uVar, Provider provider) {
        this.f91476a = provider;
        this.f91477b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new HashIdChangesObservingTask(dagger.internal.g.b(this.f91476a), dagger.internal.g.a(dagger.internal.w.a(this.f91477b)));
    }
}
