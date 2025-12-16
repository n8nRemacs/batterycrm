package ru.avito.messenger.internal.di;

import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import n91.C44220a;
import n91.C44221b;
import ru.avito.messenger.internal.C47745a;
import ru.avito.messenger.u0;
import ru.avito.messenger.v0;

/* compiled from: MessengerClientModule_ProvideReconnectIntervalGenerator$_avito_discouraged_messengerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes9.dex */
public final class x implements dagger.internal.h<u0> {

    /* renamed from: a, reason: collision with root package name */
    public final C47817t f431686a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C47745a> f431687b;

    public x(C47817t c47817t, Provider<C47745a> provider) {
        this.f431686a = c47817t;
        this.f431687b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C47745a c47745a = this.f431687b.get();
        this.f431686a.getClass();
        v0 v0Var = c47745a.f431215h;
        if (!(v0Var instanceof v0.a)) {
            if (v0Var instanceof v0.b) {
                return new C44221b(((v0.b) v0Var).f431869a);
            }
            throw new NoWhenBranchMatchedException();
        }
        v0.a aVar = (v0.a) v0Var;
        return new C44220a(kotlin.random.g.a(System.currentTimeMillis()), aVar.f431868b, aVar.f431867a);
    }
}
