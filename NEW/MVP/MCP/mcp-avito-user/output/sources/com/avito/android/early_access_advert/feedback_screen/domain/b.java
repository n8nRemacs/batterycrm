package com.avito.android.early_access_advert.feedback_screen.domain;

import Tx.InterfaceC15421a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EarlyAccessAdvertFeedbackInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15421a> f145666a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f145667b;

    public b(Provider<InterfaceC15421a> provider, Provider<R0> provider2) {
        this.f145666a = provider;
        this.f145667b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f145666a.get(), this.f145667b.get());
    }
}
