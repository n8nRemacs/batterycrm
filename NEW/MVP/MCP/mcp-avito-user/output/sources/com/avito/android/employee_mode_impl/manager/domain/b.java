package com.avito.android.employee_mode_impl.manager.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EmployeeInfoRemoteRepository_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f147365a;

    /* renamed from: b, reason: collision with root package name */
    public final u f147366b;

    public b(u uVar, Provider provider) {
        this.f147365a = provider;
        this.f147366b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f147365a.get(), dagger.internal.g.a(w.a(this.f147366b)));
    }
}
