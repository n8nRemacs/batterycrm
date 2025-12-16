package com.avito.android.cpt.pre_activation.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PreActivationLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f126692a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f126693b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f126694c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f126695d;

    public c(dv.b bVar, dv.b bVar2, dagger.internal.f fVar, Provider provider) {
        this.f126692a = bVar;
        this.f126693b = bVar2;
        this.f126694c = fVar;
        this.f126695d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.d) this.f126692a.get(), (a.f) this.f126693b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f126694c.get(), this.f126695d.get());
    }
}
