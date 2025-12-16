package com.avito.android.verification.verification_form_builder.mvi;

import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FormBuilderActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f325457a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f325458b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f325459c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.verification.inn.o f325460d;

    public h(u uVar, Provider provider, Provider provider2, com.avito.android.verification.inn.o oVar) {
        this.f325457a = uVar;
        this.f325458b = provider;
        this.f325459c = provider2;
        this.f325460d = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.verification_form_builder.h hVar = (com.avito.android.verification.verification_form_builder.h) this.f325457a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f325458b.get();
        InterfaceC35741a1 interfaceC35741a1 = this.f325459c.get();
        this.f325460d.getClass();
        return new g(hVar, aVar, interfaceC35741a1, new com.avito.android.verification.inn.n());
    }
}
