package com.avito.android.vas_performance.di.applied_services;

import androidx.view.P0;
import com.avito.android.vas_performance.ui.applied_services.j;
import com.avito.android.vas_performance.ui.applied_services.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AppliedServicesModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final c f319907a;

    /* renamed from: b, reason: collision with root package name */
    public final u f319908b;

    public f(c cVar, u uVar) {
        this.f319907a = cVar;
        this.f319908b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        P0.c cVar = (P0.c) this.f319908b.get();
        c cVar2 = this.f319907a;
        cVar2.getClass();
        return (j) new P0(cVar2.f319902a, cVar).a(t.class);
    }
}
