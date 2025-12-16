package com.avito.android.messenger.blacklist_reasons;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: BlockUserInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class C implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f186561a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f186562b;

    public C(dagger.internal.f fVar, Provider provider) {
        this.f186561a = fVar;
        this.f186562b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new z((InterfaceC47842z) this.f186561a.get(), this.f186562b.get());
    }
}
