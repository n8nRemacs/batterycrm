package com.avito.android.advertising.loaders.beduin;

import com.avito.android.util.InterfaceC35745a5;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: CommercialBDUIModule_ProvideInteractionHandlersFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class z implements dagger.internal.h<Set<com.avito.beduin.v2.handler.flow.j>> {

    /* renamed from: a, reason: collision with root package name */
    public final p f88189a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f88190b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f88191c;

    public z(p pVar, dagger.internal.l lVar, Provider provider) {
        this.f88189a = pVar;
        this.f88190b = lVar;
        this.f88191c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.a aVar = (Y41.a) this.f88190b.f393949a;
        InterfaceC35745a5 interfaceC35745a5 = this.f88191c.get();
        this.f88189a.getClass();
        q qVar = new q(aVar);
        r rVar = new r(aVar);
        Set setL0 = C42756l.l0(new com.avito.beduin.v2.handler.flow.i[]{new C28354h(qVar, rVar, new t(aVar), new u(aVar), interfaceC35745a5), new m(rVar), new o(rVar), new C(rVar, new s(aVar))});
        dagger.internal.t.d(setL0);
        return setL0;
    }
}
