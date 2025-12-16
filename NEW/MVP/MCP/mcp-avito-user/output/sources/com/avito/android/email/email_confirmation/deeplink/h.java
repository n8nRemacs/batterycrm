package com.avito.android.email.email_confirmation.deeplink;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmailChangeConfirmationDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f147105a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f147106b;

    public h(C30102l3 c30102l3, dv.b bVar) {
        this.f147105a = bVar;
        this.f147106b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Context) this.f147106b.get(), (a.InterfaceC4053a) this.f147105a.get());
    }
}
