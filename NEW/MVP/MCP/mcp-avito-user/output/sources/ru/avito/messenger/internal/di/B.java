package ru.avito.messenger.internal.di;

import javax.inject.Provider;
import ru.avito.messenger.internal.C47745a;

/* compiled from: MessengerConfigModule_ProvideMessengerConfigStorageFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes9.dex */
public final class B implements dagger.internal.h<Y81.d> {

    /* renamed from: a, reason: collision with root package name */
    public final z f431547a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C47745a> f431548b;

    public B(z zVar, Provider<C47745a> provider) {
        this.f431547a = zVar;
        this.f431548b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C47745a c47745a = this.f431548b.get();
        this.f431547a.getClass();
        return c47745a.f431226s;
    }
}
