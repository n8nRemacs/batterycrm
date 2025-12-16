package com.avito.android.extended_profile.di;

import com.avito.android.analytics.screens.Screen;

/* compiled from: ExtendedProfileModule_BindAdvertsTabScreenFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class w implements dagger.internal.h<Screen> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f149950a;

    public w(dagger.internal.l lVar) {
        this.f149950a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Screen screen = (Screen) this.f149950a.f393949a;
        r.f149945a.getClass();
        return screen;
    }
}
