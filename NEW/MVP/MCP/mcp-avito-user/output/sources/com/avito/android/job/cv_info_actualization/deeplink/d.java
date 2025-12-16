package com.avito.android.job.cv_info_actualization.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JsxCvInfoActualizationDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final SP.c f174043a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f174044b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f174045c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f174046d;

    public d(SP.c cVar, dv.b bVar, dv.b bVar2, Provider provider) {
        this.f174043a = cVar;
        this.f174044b = bVar;
        this.f174045c = bVar2;
        this.f174046d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((SP.a) this.f174043a.get(), (a.InterfaceC4053a) this.f174044b.get(), (a.b) this.f174045c.get(), this.f174046d.get());
    }
}
