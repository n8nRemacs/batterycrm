package com.avito.android.messenger_unread_counter.impl_module.short_task;

import com.avito.android.account.E;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pZ.InterfaceC47038c;
import rZ.InterfaceC47619a;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: UpdateUnreadMessagesCounterShortTask_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f197740a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47038c> f197741b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f197742c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f197743d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC47619a> f197744e;

    /* renamed from: f, reason: collision with root package name */
    public final u f197745f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<R0> f197746g;

    public e(dagger.internal.f fVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f197740a = fVar;
        this.f197741b = provider;
        this.f197742c = provider2;
        this.f197743d = provider3;
        this.f197744e = provider4;
        this.f197745f = uVar;
        this.f197746g = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC47842z) this.f197740a.get(), this.f197741b.get(), this.f197742c.get(), this.f197743d.get(), this.f197744e.get(), (JY.a) this.f197745f.get(), this.f197746g.get());
    }
}
