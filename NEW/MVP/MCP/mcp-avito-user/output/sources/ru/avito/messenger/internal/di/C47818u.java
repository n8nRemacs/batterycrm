package ru.avito.messenger.internal.di;

import Oq.InterfaceC14725a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import m91.InterfaceC43936c;
import ru.avito.messenger.C47838v;
import ru.avito.messenger.InterfaceC47832o;
import ru.avito.messenger.MessengerApiService;
import ru.avito.messenger.api.entity.MessengerResponse;
import ru.avito.messenger.internal.C47745a;
import ru.avito.messenger.internal.connection.C47754g;
import ru.avito.messenger.internal.connection.InterfaceC47751d;
import ru.avito.messenger.j0;
import ru.avito.messenger.u0;
import ru.avito.websocket.InterfaceC47843a;

/* compiled from: MessengerClientModule_ProvideConnectionHolder$_avito_discouraged_messengerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: ru.avito.messenger.internal.di.u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47818u implements dagger.internal.h<InterfaceC47751d> {

    /* renamed from: a, reason: collision with root package name */
    public final C47817t f431670a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47843a> f431671b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<MessengerApiService> f431672c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ru.avito.websocket.A<MessengerResponse>> f431673d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<u0> f431674e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C47745a> f431675f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f431676g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f431677h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC43936c> f431678i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC14725a> f431679j;

    public C47818u(C47817t c47817t, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, dagger.internal.u uVar, Provider provider6, Provider provider7, Provider provider8) {
        this.f431670a = c47817t;
        this.f431671b = provider;
        this.f431672c = provider2;
        this.f431673d = provider3;
        this.f431674e = provider4;
        this.f431675f = provider5;
        this.f431676g = uVar;
        this.f431677h = provider6;
        this.f431678i = provider7;
        this.f431679j = provider8;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47843a interfaceC47843a = this.f431671b.get();
        MessengerApiService messengerApiService = this.f431672c.get();
        ru.avito.websocket.A<MessengerResponse> a12 = this.f431673d.get();
        u0 u0Var = this.f431674e.get();
        C47745a c47745a = this.f431675f.get();
        Y81.d dVar = (Y81.d) this.f431676g.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f431677h.get();
        InterfaceC43936c interfaceC43936c = this.f431678i.get();
        InterfaceC14725a interfaceC14725a = this.f431679j.get();
        C47817t c47817t = this.f431670a;
        c47817t.getClass();
        ru.avito.messenger.internal.state_machine.e eVar = new ru.avito.messenger.internal.state_machine.e(new InterfaceC47751d.b.c(true, null, null, 6, null), interfaceC43936c, new hu.akarnokd.rxjava3.schedulers.c(interfaceC35745a5.a()), "MsgConnectionHolder");
        C47838v c47838v = new C47838v(messengerApiService);
        j0 j0Var = c47745a.f431222o;
        InterfaceC47832o interfaceC47832o = c47745a.f431225r;
        return new C47754g(eVar, interfaceC47843a, c47838v, a12, u0Var, interfaceC43936c, interfaceC35745a5, j0Var, c47745a.f431207A, dVar, interfaceC14725a, c47745a.f431210c, c47745a.f431228u, c47745a.f431229v, c47745a.f431216i, c47745a.f431213f, c47745a.f431231x, c47817t.f431669c, c47745a.f431232y, c47745a.f431227t, c47745a.f431221n, interfaceC47832o, 0L, 4194304, null);
    }
}
