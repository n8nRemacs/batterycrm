package com.avito.android.realty_agency.checkerboard.mvi;

import Xh0.C17011a;
import Xh0.C17012b;
import com.avito.android.realty_agency.checkerboard.model.CheckerboardArguments;
import javax.inject.Provider;
import ri0.InterfaceC47661a;

/* compiled from: CheckerboardActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class s implements dagger.internal.h<C34225a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<y> f251312a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47661a> f251313b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.realty_agency.use_case.d f251314c;

    /* renamed from: d, reason: collision with root package name */
    public final C17012b f251315d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f251316e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.realty_agency.checkerboard.mvi.use_case.c f251317f;

    public s(Provider provider, Provider provider2, com.avito.android.realty_agency.use_case.d dVar, C17012b c17012b, dagger.internal.l lVar, com.avito.android.realty_agency.checkerboard.mvi.use_case.c cVar) {
        this.f251312a = provider;
        this.f251313b = provider2;
        this.f251314c = dVar;
        this.f251315d = c17012b;
        this.f251316e = lVar;
        this.f251317f = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34225a(this.f251312a.get(), this.f251313b.get(), (com.avito.android.realty_agency.use_case.a) this.f251314c.get(), (C17011a) this.f251315d.get(), (CheckerboardArguments) this.f251316e.f393949a, (com.avito.android.realty_agency.checkerboard.mvi.use_case.b) this.f251317f.get());
    }
}
