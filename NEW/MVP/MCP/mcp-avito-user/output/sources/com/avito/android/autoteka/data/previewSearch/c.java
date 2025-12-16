package com.avito.android.autoteka.data.previewSearch;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import xj0.InterfaceC49957a;

/* compiled from: AutotekaPreviewSearchInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49957a> f96202a;

    public c(Provider<InterfaceC49957a> provider) {
        this.f96202a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f96202a.get());
    }
}
