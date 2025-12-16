package com.avito.android.email.email_update;

import com.avito.android.email.email_update.mvi.j;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmailUpdateViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final j f147203a;

    public i(j jVar) {
        this.f147203a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.email.email_update.mvi.i) this.f147203a.get(), null, 2, null);
    }
}
