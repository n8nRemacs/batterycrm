package com.avito.android.error_reporting.app_state;

import android.app.Application;
import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import com.avito.android.util.InterfaceC35950u;
import javax.inject.Provider;

/* compiled from: AppStateCollectorRepeatedException_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class C implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35950u> f147779a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f147780b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC30362a.InterfaceC4322a> f147781c;

    public C(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f147779a = provider;
        this.f147780b = lVar;
        this.f147781c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new A(this.f147779a.get(), (Application) this.f147780b.f393949a, this.f147781c.get());
    }
}
