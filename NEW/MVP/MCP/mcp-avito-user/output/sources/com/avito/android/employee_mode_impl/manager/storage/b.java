package com.avito.android.employee_mode_impl.manager.storage;

import AK0.i;
import android.app.Application;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EmployeeModePreferenceStorage_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f147558a;

    /* renamed from: b, reason: collision with root package name */
    public final l f147559b;

    public b(l lVar, Provider provider) {
        this.f147558a = provider;
        this.f147559b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f147558a.get(), (Application) this.f147559b.f393949a);
    }
}
