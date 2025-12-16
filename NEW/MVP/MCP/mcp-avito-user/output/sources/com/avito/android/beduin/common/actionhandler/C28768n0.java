package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15522a;
import javax.inject.Provider;

/* compiled from: BeduinOpenMasterPlanActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.common.actionhandler.n0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28768n0 implements dagger.internal.h<C28766m0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.master_plan.c> f100286a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC15522a> f100287b;

    public C28768n0(Provider<com.avito.android.master_plan.c> provider, Provider<InterfaceC15522a> provider2) {
        this.f100286a = provider;
        this.f100287b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28766m0(this.f100286a.get(), this.f100287b.get());
    }
}
