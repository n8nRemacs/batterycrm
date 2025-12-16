package com.avito.android.di.module;

import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.serp.adapter.C34755r0;
import com.avito.android.serp.adapter.InterfaceC34748n0;

/* compiled from: AdvertItemPresenterModule_ProvideRdsAdvertItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class L implements dagger.internal.h<InterfaceC34748n0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f144036a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f144037b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f144038c;

    public L(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3) {
        this.f144036a = uVar;
        this.f144037b = uVar2;
        this.f144038c = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f144036a);
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f144037b.get();
        C36135w2 c36135w2 = (C36135w2) this.f144038c.get();
        D d12 = D.f143878a;
        return new C34755r0(eVarB, interfaceC28373a, c36135w2, kotlin.collections.B0.f406639b);
    }
}
