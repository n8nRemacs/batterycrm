package com.avito.android.messenger.blacklist_reasons;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: BlacklistReasonsProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class s implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f186649a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f186650b;

    public s(dagger.internal.f fVar, Provider provider) {
        this.f186649a = fVar;
        this.f186650b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q((InterfaceC47842z) this.f186649a.get(), this.f186650b.get());
    }
}
