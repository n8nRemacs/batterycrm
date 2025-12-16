package com.avito.android.analytics.provider.api;

import Nc.InterfaceC14558a;
import ac.C19864a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zc.InterfaceC50545a;

/* compiled from: ApiEventTracker_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC50545a> f90242a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14558a> f90243b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f90244c;

    /* renamed from: d, reason: collision with root package name */
    public final u f90245d;

    public d(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f90242a = provider;
        this.f90243b = provider2;
        this.f90244c = provider3;
        this.f90245d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(g.b(this.f90242a), g.b(this.f90243b), this.f90244c.get(), (C19864a) this.f90245d.get());
    }
}
