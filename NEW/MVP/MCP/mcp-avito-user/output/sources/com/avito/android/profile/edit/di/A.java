package com.avito.android.profile.edit.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile.edit.EditProfilePresenterImpl;
import com.avito.android.profile.edit.InterfaceC33315d;
import com.avito.android.profile.edit.InterfaceC33343x;
import com.avito.android.profile.edit.di.C33316a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import javax.inject.Provider;

/* compiled from: EditProfileModule_ProvidePresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class A implements dagger.internal.h<InterfaceC33343x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC33315d> f222080a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f222081b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f222082c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f222083d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f222084e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f222085f;

    public A(Provider provider, Provider provider2, dagger.internal.f fVar, Provider provider3, Provider provider4, dagger.internal.l lVar) {
        this.f222080a = provider;
        this.f222081b = provider2;
        this.f222082c = fVar;
        this.f222083d = provider3;
        this.f222084e = provider4;
        this.f222085f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC33315d interfaceC33315d = this.f222080a.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((C33316a.c.b) this.f222081b).get();
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f222082c.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((C33316a.c.k) this.f222083d).get();
        InterfaceC35741a1 interfaceC35741a1 = (InterfaceC35741a1) ((C33316a.c.e) this.f222084e).get();
        Kundle kundle = (Kundle) this.f222085f.f393949a;
        C33319d.f222158a.getClass();
        return new EditProfilePresenterImpl(interfaceC28373a, interfaceC33315d, C33319d.f222159b, C33319d.f222160c, aVar, interfaceC35741a1, interfaceC35745a5, kundle);
    }
}
