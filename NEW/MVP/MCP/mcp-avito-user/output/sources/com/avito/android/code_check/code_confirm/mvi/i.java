package com.avito.android.code_check.code_confirm.mvi;

import To.InterfaceC15383a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CodeConfirmBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f118757a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC43160i<InterfaceC15383a>> f118758b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.code_check_public.screen.c> f118759c;

    /* renamed from: d, reason: collision with root package name */
    public final u f118760d;

    public i(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f118757a = provider;
        this.f118758b = provider2;
        this.f118759c = provider3;
        this.f118760d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f118757a.get(), this.f118758b.get(), this.f118759c.get(), (com.avito.android.code_check.otp.a) this.f118760d.get());
    }
}
