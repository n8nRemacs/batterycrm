package com.avito.android.profile.edit.di;

import com.avito.android.profile.edit.C33339t;
import com.avito.android.profile.edit.InterfaceC33315d;
import com.avito.android.profile.edit.M;
import com.avito.android.profile.edit.V;
import com.avito.android.profile.edit.di.C33316a;
import com.avito.android.profile.edit.i0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import javax.inject.Provider;

/* compiled from: EditProfileModule_ProvideInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<InterfaceC33315d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V> f222179a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f222180b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<i0> f222181c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.profile.edit.avatar.a> f222182d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<M> f222183e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f222184f;

    public r(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f222179a = provider;
        this.f222180b = provider2;
        this.f222181c = provider3;
        this.f222182d = provider4;
        this.f222183e = provider5;
        this.f222184f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        V v12 = this.f222179a.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((C33316a.c.k) this.f222180b).get();
        i0 i0Var = this.f222181c.get();
        com.avito.android.profile.edit.avatar.a aVar = this.f222182d.get();
        M m12 = this.f222183e.get();
        Kundle kundle = (Kundle) this.f222184f.f393949a;
        C33319d.f222158a.getClass();
        return new C33339t(v12, aVar, i0Var, m12, interfaceC35745a5, kundle);
    }
}
