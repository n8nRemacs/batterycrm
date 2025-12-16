package com.avito.android.beduin.common.component.pixel;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinPixelComponentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f102113a;

    public d(Provider<InterfaceC35745a5> provider) {
        this.f102113a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f102113a.get());
    }
}
