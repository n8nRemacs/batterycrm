package com.avito.android.messenger.blacklist.mvi;

import com.avito.android.messenger.w0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: BlacklistInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class E implements dagger.internal.h<C31686p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f186349a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<w0> f186350b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f186351c;

    public E(Provider<InterfaceC35745a5> provider, Provider<w0> provider2, Provider<InterfaceC47842z> provider3) {
        this.f186349a = provider;
        this.f186350b = provider2;
        this.f186351c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C31686p(this.f186349a.get(), this.f186350b.get(), this.f186351c.get());
    }
}
