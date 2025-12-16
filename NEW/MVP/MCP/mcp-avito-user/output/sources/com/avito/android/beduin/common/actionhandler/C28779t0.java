package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15522a;
import com.avito.android.remote.model.SearchParamsConverter;
import hi.C40942b;
import hi.C40943c;
import javax.inject.Provider;

/* compiled from: BeduinOpenSearchFiltersActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.common.actionhandler.t0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28779t0 implements dagger.internal.h<C28775r0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15522a> f100409a;

    /* renamed from: b, reason: collision with root package name */
    public final C40943c f100410b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f100411c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f100412d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f100413e;

    public C28779t0(Provider provider, C40943c c40943c, Provider provider2, dagger.internal.u uVar, dagger.internal.f fVar) {
        this.f100409a = provider;
        this.f100410b = c40943c;
        this.f100411c = provider2;
        this.f100412d = uVar;
        this.f100413e = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28775r0(this.f100409a.get(), (C40942b) this.f100410b.get(), this.f100411c.get(), (SearchParamsConverter) this.f100412d.get(), dagger.internal.g.b(this.f100413e));
    }
}
