package com.avito.android.str_cancellation_settings.deeplink;

import Ty0.InterfaceC15425a;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrCancellationSettingsLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Ty0.c f288299a;

    /* renamed from: b, reason: collision with root package name */
    public final C25721c f288300b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f288301c;

    public c(Ty0.c cVar, C25721c c25721c, dv.b bVar) {
        this.f288299a = cVar;
        this.f288300b = c25721c;
        this.f288301c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC15425a) this.f288299a.get(), (C25719a) this.f288300b.get(), (a.InterfaceC4053a) this.f288301c.get());
    }
}
