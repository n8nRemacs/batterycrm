package com.avito.android.screens.bbip_private.mvi;

import Zx.C19616a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BbipPrivateReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final qp0.e f260623a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C19616a> f260624b;

    public m(qp0.e eVar, Provider provider) {
        this.f260623a = eVar;
        this.f260624b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((qp0.c) this.f260623a.get(), this.f260624b.get());
    }
}
