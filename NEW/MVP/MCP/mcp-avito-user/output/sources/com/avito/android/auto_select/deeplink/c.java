package com.avito.android.auto_select.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoSelectBookingCompletionLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f96040a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f96041b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f96042c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f96043d;

    public c(dv.b bVar, dv.b bVar2, dagger.internal.f fVar, C25721c c25721c) {
        this.f96040a = bVar;
        this.f96041b = bVar2;
        this.f96042c = fVar;
        this.f96043d = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.d) this.f96040a.get(), (a.f) this.f96041b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f96042c.get(), (C25719a) this.f96043d.get());
    }
}
