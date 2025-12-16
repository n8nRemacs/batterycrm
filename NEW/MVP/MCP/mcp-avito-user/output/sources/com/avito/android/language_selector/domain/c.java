package com.avito.android.language_selector.domain;

import aR.InterfaceC19809a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import jJ.InterfaceC42262b;
import javax.inject.Provider;

/* compiled from: LanguageSelectUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19809a> f174906a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC42262b> f174907b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f174908c;

    public c(Provider<InterfaceC19809a> provider, Provider<InterfaceC42262b> provider2, Provider<R0> provider3) {
        this.f174906a = provider;
        this.f174907b = provider2;
        this.f174908c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f174906a.get(), this.f174907b.get(), this.f174908c.get());
    }
}
