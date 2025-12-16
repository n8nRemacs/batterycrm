package com.avito.android.vas_autoprolong.screens.autoprolong.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import eL0.InterfaceC40020a;
import fL0.InterfaceC40310a;
import javax.inject.Provider;

/* compiled from: AutoprolongInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f319518a;

    /* renamed from: b, reason: collision with root package name */
    public final l f319519b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC40310a> f319520c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f319521d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC40020a> f319522e;

    public c(l lVar, l lVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f319518a = lVar;
        this.f319519b = lVar2;
        this.f319520c = provider;
        this.f319521d = provider2;
        this.f319522e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(((Long) this.f319518a.f393949a).longValue(), (String) this.f319519b.f393949a, this.f319520c.get(), this.f319521d.get(), this.f319522e.get());
    }
}
