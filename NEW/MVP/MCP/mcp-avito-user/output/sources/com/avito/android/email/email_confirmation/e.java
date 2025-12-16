package com.avito.android.email.email_confirmation;

import com.avito.android.email.email_confirmation.mvi.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmailConfirmationViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.email.email_confirmation.mvi.h f147121a;

    public e(com.avito.android.email.email_confirmation.mvi.h hVar) {
        this.f147121a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((g) this.f147121a.get(), null, 2, null);
    }
}
