package com.avito.android.cv_actualization.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import ot.C44937c;
import ot.InterfaceC44935a;

/* compiled from: JsxCvActualizationDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f131097a;

    /* renamed from: b, reason: collision with root package name */
    public final C44937c f131098b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f131099c;

    public b(dv.b bVar, C44937c c44937c, dv.b bVar2) {
        this.f131097a = bVar;
        this.f131098b = c44937c;
        this.f131099c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.b) this.f131097a.get(), (InterfaceC44935a) this.f131098b.get(), (a.InterfaceC4053a) this.f131099c.get());
    }
}
