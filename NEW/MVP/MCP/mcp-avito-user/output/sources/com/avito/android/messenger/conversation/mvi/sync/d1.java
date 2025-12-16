package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: VoiceInfoSyncAgentImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class d1 implements dagger.internal.h<X0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f194768a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f194769b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.data.g0> f194770c;

    public d1(Provider<InterfaceC35745a5> provider, Provider<InterfaceC47842z> provider2, Provider<com.avito.android.messenger.conversation.mvi.data.g0> provider3) {
        this.f194768a = provider;
        this.f194769b = provider2;
        this.f194770c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new X0(this.f194768a.get(), this.f194769b.get(), this.f194770c.get());
    }
}
