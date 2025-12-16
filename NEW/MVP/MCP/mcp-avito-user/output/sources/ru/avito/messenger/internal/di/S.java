package ru.avito.messenger.internal.di;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47839w;
import ru.avito.messenger.internal.C47745a;
import ru.avito.websocket.InterfaceC47843a;

/* compiled from: WebSocketMessengerTransportModule_ProvideRxWebSocketFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes9.dex */
public final class S implements dagger.internal.h<InterfaceC47843a> {

    /* renamed from: a, reason: collision with root package name */
    public final J f431563a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f431564b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C47745a> f431565c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f431566d;

    public S(J j12, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f431563a = j12;
        this.f431564b = uVar;
        this.f431565c = provider;
        this.f431566d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47843a interfaceC47843aA;
        ru.avito.websocket.n nVarM275a;
        ru.avito.websocket.z zVar = (ru.avito.websocket.z) this.f431564b.get();
        C47745a c47745a = this.f431565c.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f431566d.get();
        this.f431563a.getClass();
        InterfaceC47839w interfaceC47839w = c47745a.f431220m;
        if (!c47745a.f431219l) {
            return (interfaceC47839w == null || (interfaceC47843aA = interfaceC47839w.a()) == null) ? new ru.avito.websocket.e(zVar, M.f431556l, c47745a.f431218k, N.f431557l) : interfaceC47843aA;
        }
        ru.avito.websocket.n rVar = new ru.avito.websocket.r(zVar, K.f431554l, c47745a.f431218k, L.f431555l, interfaceC35745a5.a());
        if (interfaceC47839w != null && (nVarM275a = interfaceC47839w.m275a()) != null) {
            rVar = nVarM275a;
        }
        return new ru.avito.websocket.w(rVar);
    }
}
