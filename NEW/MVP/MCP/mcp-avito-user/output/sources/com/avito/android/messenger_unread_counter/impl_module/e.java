package com.avito.android.messenger_unread_counter.impl_module;

import com.avito.android.messenger.w0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: UnreadChatsCounterSyncAgentImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f197725a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<w0> f197726b;

    /* renamed from: c, reason: collision with root package name */
    public final u f197727c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f197728d;

    public e(dagger.internal.f fVar, u uVar, Provider provider, Provider provider2) {
        this.f197725a = fVar;
        this.f197726b = provider;
        this.f197727c = uVar;
        this.f197728d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((InterfaceC47842z) this.f197725a.get(), this.f197726b.get(), (com.avito.android.messenger_unread_counter.impl_module.short_task.g) this.f197727c.get(), this.f197728d.get());
    }
}
