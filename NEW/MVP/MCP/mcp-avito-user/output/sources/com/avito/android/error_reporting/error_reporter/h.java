package com.avito.android.error_reporting.error_reporter;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ErrorAppStateConsumer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f147870a;

    public h(dagger.internal.u uVar) {
        this.f147870a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((n) this.f147870a.get());
    }
}
