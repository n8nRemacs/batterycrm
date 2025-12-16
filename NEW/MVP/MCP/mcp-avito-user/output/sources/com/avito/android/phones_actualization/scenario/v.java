package com.avito.android.phones_actualization.scenario;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.code_check_public.screen.d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ActualizePhonesScreenBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class v implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final k f216284a;

    /* renamed from: b, reason: collision with root package name */
    public final d f216285b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f216286c;

    public v(k kVar, d dVar, dagger.internal.f fVar) {
        this.f216284a = kVar;
        this.f216285b = dVar;
        this.f216286c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s((d.b) this.f216284a.get(), (c.b) this.f216285b.get(), (InterfaceC28373a) this.f216286c.get());
    }
}
