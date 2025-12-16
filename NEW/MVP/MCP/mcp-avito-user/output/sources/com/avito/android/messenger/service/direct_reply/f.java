package com.avito.android.messenger.service.direct_reply;

import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DirectReplyServiceDelegateImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f197234a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f197235b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f197236c;

    public f(u uVar, Provider provider, Provider provider2) {
        this.f197234a = uVar;
        this.f197235b = provider;
        this.f197236c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((h) this.f197234a.get(), this.f197235b.get(), this.f197236c.get());
    }
}
