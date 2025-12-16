package com.avito.android.bbl.screens.configure.v2.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lh.InterfaceC43770a;

/* compiled from: BblConfigureV2Reducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43770a> f99386a;

    public m(Provider<InterfaceC43770a> provider) {
        this.f99386a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f99386a.get());
    }
}
