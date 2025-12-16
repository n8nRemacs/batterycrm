package com.avito.android.error_reporting;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SentryErrorReporter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f147917a;

    public l(dagger.internal.l lVar) {
        this.f147917a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((Application) this.f147917a.f393949a);
    }
}
