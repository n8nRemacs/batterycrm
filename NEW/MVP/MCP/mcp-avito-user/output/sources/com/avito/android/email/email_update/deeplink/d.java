package com.avito.android.email.email_update.deeplink;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmailUpdateDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f147172a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f147173b;

    public d(C30102l3 c30102l3, dv.b bVar) {
        this.f147172a = bVar;
        this.f147173b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Context) this.f147173b.get(), (a.InterfaceC4053a) this.f147172a.get());
    }
}
