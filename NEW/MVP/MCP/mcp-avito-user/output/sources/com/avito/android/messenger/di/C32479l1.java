package com.avito.android.messenger.di;

import com.avito.android.messenger.channels.mvi.sync.InterfaceC31860t;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32012a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47832o;
import ru.avito.messenger.internal.connection.InterfaceC47748a;

/* compiled from: MessengerModule_ProvideKeepConnectionProvider$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.l1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32479l1 implements dagger.internal.h<InterfaceC47832o> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f196105a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47748a> f196106b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.w0> f196107c;

    /* renamed from: d, reason: collision with root package name */
    public final S1 f196108d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f196109e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC31860t> f196110f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f196111g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC32012a> f196112h;

    public C32479l1(U0 u02, Provider provider, Provider provider2, S1 s12, Provider provider3, Provider provider4, dagger.internal.u uVar, Provider provider5) {
        this.f196105a = u02;
        this.f196106b = provider;
        this.f196107c = provider2;
        this.f196108d = s12;
        this.f196109e = provider3;
        this.f196110f = provider4;
        this.f196111g = uVar;
        this.f196112h = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47748a interfaceC47748a = this.f196106b.get();
        com.avito.android.messenger.w0 w0Var = this.f196107c.get();
        com.avito.android.persistence.messenger.Y0 y02 = (com.avito.android.persistence.messenger.Y0) this.f196108d.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f196109e.get();
        InterfaceC31860t interfaceC31860t = this.f196110f.get();
        AL.b bVar = (AL.b) this.f196111g.get();
        InterfaceC32012a interfaceC32012a = this.f196112h.get();
        this.f196105a.getClass();
        return new com.avito.android.messenger.connection.j(interfaceC47748a, w0Var, y02, interfaceC35745a5, interfaceC31860t, bVar, interfaceC32012a);
    }
}
