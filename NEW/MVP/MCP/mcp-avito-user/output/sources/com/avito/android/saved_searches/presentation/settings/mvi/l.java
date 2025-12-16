package com.avito.android.saved_searches.presentation.settings.mvi;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SavedSearchSettingsViewStateBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f258788a;

    public l(Provider<InterfaceC35863o4> provider) {
        this.f258788a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f258788a.get());
    }
}
