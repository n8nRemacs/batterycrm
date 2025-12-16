package com.avito.android.bbl.screens.configure.v4.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import oh.InterfaceC44774a;

/* compiled from: GetBblConfigureV4UseCase_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44774a> f99488a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f99489b;

    /* renamed from: c, reason: collision with root package name */
    public final l f99490c;

    public b(l lVar, Provider provider, Provider provider2) {
        this.f99488a = provider;
        this.f99489b = provider2;
        this.f99490c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f99488a.get(), this.f99489b.get(), (String) this.f99490c.f393949a);
    }
}
