package com.avito.android.bbl.screens.configure.v2.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lh.InterfaceC43770a;
import oh.InterfaceC44774a;

/* compiled from: GetBblConfigureV2UseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44774a> f99343a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f99344b;

    /* renamed from: c, reason: collision with root package name */
    public final l f99345c;

    /* renamed from: d, reason: collision with root package name */
    public final u f99346d;

    public d(l lVar, u uVar, Provider provider, Provider provider2) {
        this.f99343a = provider;
        this.f99344b = provider2;
        this.f99345c = lVar;
        this.f99346d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f99343a.get(), this.f99344b.get(), (String) this.f99345c.f393949a, (InterfaceC43770a) this.f99346d.get());
    }
}
