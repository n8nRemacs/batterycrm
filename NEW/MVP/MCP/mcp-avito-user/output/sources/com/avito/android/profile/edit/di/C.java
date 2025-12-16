package com.avito.android.profile.edit.di;

import com.avito.android.profile.edit.V;
import com.avito.android.profile.edit.di.C33316a;
import com.avito.android.profile.edit.i0;
import com.avito.android.profile.edit.t0;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: EditProfileModule_ProvideSaveProfileInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class C implements dagger.internal.h<i0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f222088a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f222089b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.account.G> f222090c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f222091d;

    public C(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f222088a = provider;
        this.f222089b = uVar;
        this.f222090c = provider2;
        this.f222091d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC34401z0 interfaceC34401z0 = (InterfaceC34401z0) ((C33316a.c.i) this.f222088a).get();
        V v12 = (V) this.f222089b.get();
        com.avito.android.account.G g12 = (com.avito.android.account.G) ((C33316a.c.C6719a) this.f222090c).get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((C33316a.c.k) this.f222091d).get();
        C33319d.f222158a.getClass();
        return new t0(interfaceC34401z0, g12, v12, interfaceC35745a5);
    }
}
