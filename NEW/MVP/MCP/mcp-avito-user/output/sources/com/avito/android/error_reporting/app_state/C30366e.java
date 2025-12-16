package com.avito.android.error_reporting.app_state;

import com.avito.android.error_reporting.app_state.C30365d;
import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import javax.inject.Provider;

/* compiled from: AppStateCollectorAllAbTests_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.error_reporting.app_state.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30366e implements dagger.internal.h<C30365d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30362a.InterfaceC4322a> f147805a;

    /* renamed from: b, reason: collision with root package name */
    public final v3.c f147806b;

    public C30366e(Provider provider, v3.c cVar) {
        this.f147805a = provider;
        this.f147806b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30365d(this.f147805a.get(), (C30365d.a) this.f147806b.get());
    }
}
