package com.avito.android.di.module;

import com.avito.android.lib.util.darkTheme.b;

/* compiled from: DarkThemeModule_ProvideDarkThemeStorageFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.f4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30037f4 implements dagger.internal.h<b.InterfaceC5330b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f144288a;

    public C30037f4(C30214v6 c30214v6) {
        this.f144288a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AK0.l lVar = (AK0.l) this.f144288a.get();
        int i12 = C30015d4.f144266a;
        return new C30004c4(lVar);
    }
}
