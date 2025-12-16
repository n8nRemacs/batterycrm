package com.avito.android.user_advert.advert.delegate.multi_urgency.use_case;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import nH0.C44258c;
import nH0.InterfaceC44256a;

/* compiled from: MultiUrgencyToggleUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_advert.advert.delegate.multi_urgency.c f308730a;

    /* renamed from: b, reason: collision with root package name */
    public final d f308731b;

    /* renamed from: c, reason: collision with root package name */
    public final u f308732c;

    /* renamed from: d, reason: collision with root package name */
    public final u f308733d;

    /* renamed from: e, reason: collision with root package name */
    public final C44258c f308734e;

    public i(com.avito.android.user_advert.advert.delegate.multi_urgency.c cVar, d dVar, u uVar, u uVar2, C44258c c44258c) {
        this.f308730a = cVar;
        this.f308731b = dVar;
        this.f308732c = uVar;
        this.f308733d = uVar2;
        this.f308734e = c44258c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((k) this.f308730a.get(), (c) this.f308731b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f308732c.get(), (R0) this.f308733d.get(), (InterfaceC44256a) this.f308734e.get());
    }
}
