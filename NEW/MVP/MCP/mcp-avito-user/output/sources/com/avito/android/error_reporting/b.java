package com.avito.android.error_reporting;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import sc.InterfaceC48152a;

/* compiled from: AppMetricaErrorReporter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f147858a;

    public b(u uVar) {
        this.f147858a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC48152a) this.f147858a.get());
    }
}
