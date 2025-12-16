package com.avito.android.universal_map.map.di;

import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.yandex.YandexAvitoMapAttachHelper;

/* compiled from: UniversalMapModule_ProvideAvitoMapAttachHelper$_avito_universal_map_implFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes4.dex */
public final class J implements dagger.internal.h<AvitoMapAttachHelper> {

    /* compiled from: UniversalMapModule_ProvideAvitoMapAttachHelper$_avito_universal_map_implFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final J f305026a = new J();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I.f305025a.getClass();
        return new YandexAvitoMapAttachHelper(false, 1, null);
    }
}
