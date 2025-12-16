package ru.avito.messenger.internal.di;

import com.avito.android.remote.model.messenger.MessengerTimestamp;
import com.avito.android.util.InterfaceC35745a5;
import i91.C41257b;
import javax.inject.Provider;

/* compiled from: MessengerConfigModule_ProvideMessengerConfigProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes9.dex */
public final class A implements dagger.internal.h<Y81.c> {

    /* renamed from: a, reason: collision with root package name */
    public final z f431544a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Y81.d> f431545b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f431546c;

    public A(z zVar, Provider<Y81.d> provider, Provider<InterfaceC35745a5> provider2) {
        this.f431544a = zVar;
        this.f431545b = provider;
        this.f431546c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y81.d dVar = this.f431545b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f431546c.get();
        this.f431544a.getClass();
        return new C41257b(dVar, interfaceC35745a5, new Y81.a(MessengerTimestamp.INSTANCE.fromMillis(3600000L)));
    }
}
