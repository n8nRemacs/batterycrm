package com.avito.android.verification.verification_finish.mvi;

import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FinishReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.verification_finish.e f325303a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f325304b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f325305c;

    public m(com.avito.android.verification.verification_finish.e eVar, Provider provider, Provider provider2) {
        this.f325303a = eVar;
        this.f325304b = provider;
        this.f325305c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.verification.verification_finish.d) this.f325303a.get(), this.f325304b.get(), this.f325305c.get());
    }
}
