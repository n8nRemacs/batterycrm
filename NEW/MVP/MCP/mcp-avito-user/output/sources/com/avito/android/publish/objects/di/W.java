package com.avito.android.publish.objects.di;

import com.avito.android.publish.objects.InterfaceC33955k;
import javax.inject.Provider;

/* compiled from: ObjectFillFormModule_ProvidePublishResultMediatorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class W implements dagger.internal.h<com.avito.android.publish.view.result_handler.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC33955k> f237676a;

    public W(Provider<InterfaceC33955k> provider) {
        this.f237676a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC33955k interfaceC33955k = this.f237676a.get();
        C33939w.f238031a.getClass();
        return new com.avito.android.publish.view.result_handler.e(new A(interfaceC33955k));
    }
}
