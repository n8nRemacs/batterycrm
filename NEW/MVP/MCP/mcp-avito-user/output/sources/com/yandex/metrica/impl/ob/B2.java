package com.yandex.metrica.impl.ob;

import android.app.WallpaperManager;

/* loaded from: classes7.dex */
final class B2<T, R> implements InterfaceC39036om<WallpaperManager, Integer> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f377806a;

    public B2(int i12) {
        this.f377806a = i12;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39036om
    public Integer a(WallpaperManager wallpaperManager) {
        return Integer.valueOf(wallpaperManager.getWallpaperId(this.f377806a));
    }
}
