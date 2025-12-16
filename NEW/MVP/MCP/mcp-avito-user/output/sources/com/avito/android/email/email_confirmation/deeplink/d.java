package com.avito.android.email.email_confirmation.deeplink;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmailAddConfirmationDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f147101a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f147102b;

    public d(C30102l3 c30102l3, dv.b bVar) {
        this.f147101a = bVar;
        this.f147102b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Context) this.f147102b.get(), (a.InterfaceC4053a) this.f147101a.get());
    }
}
