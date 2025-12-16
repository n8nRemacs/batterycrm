package com.avito.android.employee_stub_impl.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.employee_stub_impl.tracker.EmployeeStubScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmployeeStubTrackerModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f147593a;

    public e(l lVar) {
        this.f147593a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f147593a.f393949a;
        d.f147592a.getClass();
        return new C28478k(EmployeeStubScreen.f147598d, rVar, null, 4, null);
    }
}
