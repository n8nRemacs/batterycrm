package com.avito.android.user_advert.advert.delegate.multi_urgency.use_case;

import dagger.internal.x;
import dagger.internal.y;
import nH0.C44258c;
import nH0.InterfaceC44256a;

/* compiled from: MultiUrgencyTypeChangeUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_advert.advert.delegate.multi_urgency.c f308746a;

    /* renamed from: b, reason: collision with root package name */
    public final d f308747b;

    /* renamed from: c, reason: collision with root package name */
    public final C44258c f308748c;

    public p(com.avito.android.user_advert.advert.delegate.multi_urgency.c cVar, d dVar, C44258c c44258c) {
        this.f308746a = cVar;
        this.f308747b = dVar;
        this.f308748c = c44258c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((q) this.f308746a.get(), (c) this.f308747b.get(), (InterfaceC44256a) this.f308748c.get());
    }
}
