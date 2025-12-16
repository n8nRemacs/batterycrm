package com.avito.android.verification.verification_form_builder.mvi;

import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FormBuilderReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f325477a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.verification.inn.q f325478b;

    public q(Provider provider, com.avito.android.verification.inn.q qVar) {
        this.f325477a = provider;
        this.f325478b = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f325477a.get(), (com.avito.android.verification.inn.p) this.f325478b.get());
    }
}
