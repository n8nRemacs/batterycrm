package com.avito.android.language_selector.presentation.mvi;

import dagger.internal.x;
import dagger.internal.y;
import jJ.InterfaceC42261a;
import jJ.InterfaceC42262b;
import javax.inject.Provider;

/* compiled from: LanguageSelectorBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC42262b> f174977a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC42261a> f174978b;

    public e(Provider<InterfaceC42262b> provider, Provider<InterfaceC42261a> provider2) {
        this.f174977a = provider;
        this.f174978b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f174977a.get(), this.f174978b.get());
    }
}
