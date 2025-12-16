package com.avito.android.bbl.screens.configure.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BblConfigureSaveDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f99141a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f99142b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f99143c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.bbl.screens.configure.mvi.domain.f f99144d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f99145e;

    public h(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, com.avito.android.bbl.screens.configure.mvi.domain.f fVar2, Provider provider) {
        this.f99141a = fVar;
        this.f99142b = bVar;
        this.f99143c = bVar2;
        this.f99144d = fVar2;
        this.f99145e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.deeplink_handler.handler.composite.a) this.f99141a.get(), (a.g) this.f99142b.get(), (a.i) this.f99143c.get(), (com.avito.android.bbl.screens.configure.mvi.domain.d) this.f99144d.get(), this.f99145e.get());
    }
}
