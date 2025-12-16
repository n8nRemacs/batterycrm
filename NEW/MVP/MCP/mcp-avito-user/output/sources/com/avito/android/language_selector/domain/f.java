package com.avito.android.language_selector.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import jJ.InterfaceC42262b;
import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: LanguageSetUpUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC42262b> f174913a;

    /* renamed from: b, reason: collision with root package name */
    public final ur.e f174914b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f174915c;

    public f(Provider provider, ur.e eVar, Provider provider2) {
        this.f174913a = provider;
        this.f174914b = eVar;
        this.f174915c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f174913a.get(), (InterfaceC49101b) this.f174914b.get(), this.f174915c.get());
    }
}
