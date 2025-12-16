package com.avito.android.publish.start_publish.di;

import com.avito.android.publish.start_publish.C34129d;
import com.avito.android.publish.start_publish.InterfaceC34126a;
import com.avito.android.remote.H0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AddAdvertModule_ProvideAddAdvertInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<InterfaceC34126a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H0> f245365a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f245366b;

    public b(Provider<H0> provider, Provider<InterfaceC35745a5> provider2) {
        this.f245365a = provider;
        this.f245366b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f245365a);
        InterfaceC35745a5 interfaceC35745a5 = this.f245366b.get();
        int i12 = a.f245364a;
        return new C34129d(interfaceC35745a5, eVarB);
    }
}
