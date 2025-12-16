package com.avito.android.email.email_update.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmailUpdateReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.email.email_update.d f147251a;

    public n(com.avito.android.email.email_update.d dVar) {
        this.f147251a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((com.avito.android.email.email_update.c) this.f147251a.get());
    }
}
