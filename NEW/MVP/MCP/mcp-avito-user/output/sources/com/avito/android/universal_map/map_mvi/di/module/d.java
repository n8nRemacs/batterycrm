package com.avito.android.universal_map.map_mvi.di.module;

import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.yandex.YandexAvitoMapAttachHelper;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalMapMviModule_ProvideAvitoMapAttachHelper$_avito_universal_map_implFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<AvitoMapAttachHelper> {

    /* compiled from: UniversalMapMviModule_ProvideAvitoMapAttachHelper$_avito_universal_map_implFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f306124a = new d();
    }

    public static d a() {
        return a.f306124a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c.f306123a.getClass();
        return new YandexAvitoMapAttachHelper(false, 1, null);
    }
}
