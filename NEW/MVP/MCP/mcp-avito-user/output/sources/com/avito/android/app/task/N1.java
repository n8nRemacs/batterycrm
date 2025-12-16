package com.avito.android.app.task;

import com.avito.android.InterfaceC34159q1;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: SendPendingMessagesTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class N1 implements dagger.internal.h<SendPendingMessagesTask> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f91483a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34159q1> f91484b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f91485c;

    public N1(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f91483a = uVar;
        this.f91484b = provider;
        this.f91485c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SendPendingMessagesTask(dagger.internal.g.b(this.f91483a), this.f91484b.get(), this.f91485c.get());
    }
}
