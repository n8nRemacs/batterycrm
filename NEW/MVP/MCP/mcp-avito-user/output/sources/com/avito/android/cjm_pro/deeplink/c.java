package com.avito.android.cjm_pro.deeplink;

import Bo.InterfaceC13170a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CjmProDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13170a> f118523a;

    /* renamed from: b, reason: collision with root package name */
    public final f f118524b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f118525c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f118526d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f118527e;

    public c(f fVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2) {
        this.f118523a = provider;
        this.f118524b = fVar;
        this.f118525c = bVar;
        this.f118526d = bVar2;
        this.f118527e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f118523a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f118524b.get(), (a.g) this.f118525c.get(), (a.i) this.f118526d.get(), this.f118527e.get());
    }
}
