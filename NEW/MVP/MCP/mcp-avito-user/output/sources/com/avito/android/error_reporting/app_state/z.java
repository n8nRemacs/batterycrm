package com.avito.android.error_reporting.app_state;

import android.app.Application;
import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import javax.inject.Provider;

/* compiled from: AppStateCollectorOpenedScreens_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class z implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f147856a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC30362a.InterfaceC4322a> f147857b;

    public z(dagger.internal.l lVar, Provider provider) {
        this.f147856a = lVar;
        this.f147857b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new x((Application) this.f147856a.f393949a, this.f147857b.get());
    }
}
