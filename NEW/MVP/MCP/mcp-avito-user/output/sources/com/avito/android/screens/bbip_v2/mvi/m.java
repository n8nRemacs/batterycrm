package com.avito.android.screens.bbip_v2.mvi;

import dagger.internal.x;
import dagger.internal.y;
import up0.C49093e;
import up0.InterfaceC49091c;

/* compiled from: BbipV2Reducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final C49093e f261564a;

    public m(C49093e c49093e) {
        this.f261564a = c49093e;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((InterfaceC49091c) this.f261564a.get());
    }
}
