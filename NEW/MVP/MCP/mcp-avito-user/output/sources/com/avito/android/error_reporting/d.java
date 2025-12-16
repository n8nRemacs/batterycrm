package com.avito.android.error_reporting;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FirebaseCrashlyticsInstanceProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f147862a;

    public d(dagger.internal.l lVar) {
        this.f147862a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Application) this.f147862a.f393949a);
    }
}
