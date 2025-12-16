package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: VideoInfoSyncAgentImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class V0 implements dagger.internal.h<R0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<String> f194715a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f194716b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f194717c;

    public V0(Provider<String> provider, Provider<InterfaceC35745a5> provider2, Provider<InterfaceC47842z> provider3) {
        this.f194715a = provider;
        this.f194716b = provider2;
        this.f194717c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new R0(this.f194715a.get(), this.f194716b.get(), this.f194717c.get());
    }
}
