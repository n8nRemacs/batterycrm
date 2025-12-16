package com.avito.android.publish.scanner.di;

import com.avito.android.photo_camera_view.F;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ScannerModule_ProvidePhotoSaver$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<F> {

    /* renamed from: a, reason: collision with root package name */
    public final f f239194a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f239195b;

    public h(f fVar, Provider<InterfaceC35745a5> provider) {
        this.f239194a = fVar;
        this.f239195b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = this.f239195b.get();
        this.f239194a.getClass();
        return new com.avito.android.publish.scanner.h(interfaceC35745a5);
    }
}
