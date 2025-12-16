package com.avito.android.user_advert.advert.delegate.auto_publish;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoPublishPresenterDelegateImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final d f308540a;

    /* renamed from: b, reason: collision with root package name */
    public final u f308541b;

    /* renamed from: c, reason: collision with root package name */
    public final u f308542c;

    /* renamed from: d, reason: collision with root package name */
    public final b f308543d;

    /* renamed from: e, reason: collision with root package name */
    public final u f308544e;

    public h(d dVar, u uVar, u uVar2, b bVar, u uVar3) {
        this.f308540a = dVar;
        this.f308541b = uVar;
        this.f308542c = uVar2;
        this.f308543d = bVar;
        this.f308544e = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((c) this.f308540a.get(), (InterfaceC35745a5) this.f308541b.get(), (com.avito.android.remote.error.f) this.f308542c.get(), (a) this.f308543d.get(), (InterfaceC28373a) this.f308544e.get());
    }
}
