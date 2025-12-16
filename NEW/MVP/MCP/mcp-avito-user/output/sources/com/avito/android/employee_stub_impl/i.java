package com.avito.android.employee_stub_impl;

import android.app.Application;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmployeeStubIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f147597a;

    public i(l lVar) {
        this.f147597a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Application) this.f147597a.f393949a);
    }
}
