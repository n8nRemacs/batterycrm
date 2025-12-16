package com.avito.android.review_gallery.router;

import com.avito.android.async_phone.InterfaceC28616b;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CallDeeplinkRouterImpl_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final cv.e f255570a;

    /* renamed from: b, reason: collision with root package name */
    public final u f255571b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Pv0.b> f255572c;

    /* renamed from: d, reason: collision with root package name */
    public final l f255573d;

    public c(cv.e eVar, u uVar, Provider provider, l lVar) {
        this.f255570a = eVar;
        this.f255571b = uVar;
        this.f255572c = provider;
        this.f255573d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.deeplink_handler.handler.composite.a) this.f255570a.get(), (InterfaceC28616b) this.f255571b.get(), this.f255572c.get(), (String) this.f255573d.f393949a);
    }
}
