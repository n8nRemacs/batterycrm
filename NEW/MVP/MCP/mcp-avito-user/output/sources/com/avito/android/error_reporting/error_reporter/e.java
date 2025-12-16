package com.avito.android.error_reporting.error_reporter;

import com.avito.android.di.module.C30214v6;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CrashRecorderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f147866a;

    /* renamed from: b, reason: collision with root package name */
    public final C30214v6 f147867b;

    public e(C30214v6 c30214v6, Provider provider) {
        this.f147866a = provider;
        this.f147867b = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f147866a.get(), (AK0.l) this.f147867b.get());
    }
}
