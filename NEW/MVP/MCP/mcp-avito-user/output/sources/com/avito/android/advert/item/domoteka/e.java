package com.avito.android.advert.item.domoteka;

import Gx.InterfaceC13925a;
import com.avito.android.C29640d;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DomotekaTeaserInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13925a> f75286a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f75287b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C29640d> f75288c;

    /* renamed from: d, reason: collision with root package name */
    public final l f75289d;

    public e(l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f75286a = provider;
        this.f75287b = provider2;
        this.f75288c = provider3;
        this.f75289d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f75286a);
        InterfaceC35745a5 interfaceC35745a5 = this.f75287b.get();
        this.f75288c.get();
        return new c(eVarB, interfaceC35745a5, (Kundle) this.f75289d.f393949a);
    }
}
