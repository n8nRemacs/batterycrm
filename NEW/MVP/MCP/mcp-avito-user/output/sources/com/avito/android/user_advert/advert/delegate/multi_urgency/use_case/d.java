package com.avito.android.user_advert.advert.delegate.multi_urgency.use_case;

import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import oH0.C44645a;
import oH0.C44647c;

/* compiled from: MultiUrgencyToggleInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f308712a;

    /* renamed from: b, reason: collision with root package name */
    public final C44647c f308713b;

    public d(u uVar, C44647c c44647c) {
        this.f308712a = uVar;
        this.f308713b = c44647c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(dagger.internal.g.a(w.a(this.f308712a)), (C44645a) this.f308713b.get());
    }
}
