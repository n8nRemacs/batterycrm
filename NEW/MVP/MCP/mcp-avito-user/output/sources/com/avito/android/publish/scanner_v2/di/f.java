package com.avito.android.publish.scanner_v2.di;

import com.avito.android.photo_camera_view.F;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VinScannerModule_Companion_ProvidePhotoSaver$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<F> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f239418a;

    public f(Provider<InterfaceC35745a5> provider) {
        this.f239418a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = this.f239418a.get();
        e.f239416a.getClass();
        return new com.avito.android.publish.scanner.h(interfaceC35745a5);
    }
}
