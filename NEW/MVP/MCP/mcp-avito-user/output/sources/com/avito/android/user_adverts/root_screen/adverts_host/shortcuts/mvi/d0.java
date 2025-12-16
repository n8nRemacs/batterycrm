package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi;

import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: ShortcutsReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class d0 implements dagger.internal.h<c0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f314019a;

    public d0(Provider<InterfaceC35863o4> provider) {
        this.f314019a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c0(this.f314019a.get());
    }
}
