package com.avito.android.di.module;

import com.avito.android.lib.util.darkTheme.b;

/* compiled from: DarkThemeModule_ProvideDarkThemeManagerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.e4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30026e4 implements dagger.internal.h<com.avito.android.lib.util.darkTheme.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f144278a;

    public C30026e4(dagger.internal.u uVar) {
        this.f144278a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b.InterfaceC5330b interfaceC5330b = (b.InterfaceC5330b) this.f144278a.get();
        int i12 = C30015d4.f144266a;
        return new com.avito.android.lib.util.darkTheme.b(interfaceC5330b);
    }
}
