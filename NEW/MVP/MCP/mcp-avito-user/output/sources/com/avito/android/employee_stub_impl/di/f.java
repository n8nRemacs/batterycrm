package com.avito.android.employee_stub_impl.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.employee_stub_impl.di.a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EmployeeStubTrackerModule_ProvidePerfTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f147594a;

    /* renamed from: b, reason: collision with root package name */
    public final u f147595b;

    public f(u uVar, Provider provider) {
        this.f147594a = provider;
        this.f147595b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.b.C4314a) this.f147594a).get();
        C28478k c28478k = (C28478k) this.f147595b.get();
        d.f147592a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
