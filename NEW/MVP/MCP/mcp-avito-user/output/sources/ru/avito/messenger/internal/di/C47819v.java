package ru.avito.messenger.internal.di;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.internal.C47745a;
import ru.avito.messenger.internal.C47773d;

/* compiled from: MessengerClientModule_ProvideMessengerClient$_avito_discouraged_messengerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: ru.avito.messenger.internal.di.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47819v implements dagger.internal.h<InterfaceC47842z> {

    /* renamed from: a, reason: collision with root package name */
    public final C47817t f431680a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f431681b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f431682c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C47745a> f431683d;

    public C47819v(C47817t c47817t, Provider provider, dagger.internal.u uVar, Provider provider2) {
        this.f431680a = c47817t;
        this.f431681b = provider;
        this.f431682c = uVar;
        this.f431683d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = this.f431681b.get();
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f431682c));
        C47745a c47745a = this.f431683d.get();
        return new C47773d(eVarA, interfaceC35745a5, this.f431680a.f431668b, c47745a.f431231x, c47745a.f431232y);
    }
}
