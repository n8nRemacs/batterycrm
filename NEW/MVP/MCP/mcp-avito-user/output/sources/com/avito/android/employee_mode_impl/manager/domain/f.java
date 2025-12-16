package com.avito.android.employee_mode_impl.manager.domain;

import com.avito.android.employee_mode_impl.generated.api.EmployeeModeApi;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EmployeeMessengerInfoRemoteRepository_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f147372a;

    /* renamed from: b, reason: collision with root package name */
    public final u f147373b;

    public f(u uVar, Provider provider) {
        this.f147372a = provider;
        this.f147373b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f147372a.get(), (EmployeeModeApi) this.f147373b.get());
    }
}
