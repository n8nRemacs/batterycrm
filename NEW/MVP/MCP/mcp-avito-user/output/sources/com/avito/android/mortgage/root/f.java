package com.avito.android.mortgage.root;

import androidx.view.N0;
import com.avito.android.mortgage.root.mvi.domain.InterfaceC32687a;
import com.avito.android.mortgage.root.mvi.z;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MortgageRootViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final z f202297a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC32687a> f202298b;

    public f(z zVar, Provider provider) {
        this.f202297a = zVar;
        this.f202298b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.mortgage.root.mvi.y yVar = (com.avito.android.mortgage.root.mvi.y) this.f202297a.get();
        InterfaceC32687a interfaceC32687a = this.f202298b.get();
        e eVar = new e(yVar, null, 2, null);
        interfaceC32687a.b(N0.a(eVar));
        return eVar;
    }
}
