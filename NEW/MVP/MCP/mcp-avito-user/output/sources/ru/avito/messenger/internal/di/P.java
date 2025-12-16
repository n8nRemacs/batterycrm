package ru.avito.messenger.internal.di;

import java.util.LinkedHashMap;
import javax.inject.Provider;
import ru.avito.messenger.C0;
import ru.avito.messenger.internal.C47745a;
import ru.avito.messenger.y0;

/* compiled from: WebSocketMessengerTransportModule_ProvideRequestBuilderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes9.dex */
public final class P implements dagger.internal.h<ru.avito.websocket.l> {

    /* renamed from: a, reason: collision with root package name */
    public final J f431559a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C47745a> f431560b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f431561c;

    public P(J j12, Provider provider, dagger.internal.u uVar) {
        this.f431559a = j12;
        this.f431560b = provider;
        this.f431561c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C47745a c47745a = this.f431560b.get();
        y0 y0Var = (y0) this.f431561c.get();
        this.f431559a.getClass();
        C0 c02 = c47745a.f431221n;
        LinkedHashMap linkedHashMap = c47745a.f431211d;
        return new ru.avito.messenger.internal.F(c02, c47745a.f431223p, c47745a.f431224q, c47745a.f431208a, c47745a.f431229v, y0Var, c47745a.f431209b, c47745a.f431217j, linkedHashMap, c47745a.f431232y);
    }
}
