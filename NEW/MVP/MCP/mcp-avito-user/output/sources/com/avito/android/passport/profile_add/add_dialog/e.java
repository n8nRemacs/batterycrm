package com.avito.android.passport.profile_add.add_dialog;

import android.content.res.Resources;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import k60.C42524a;
import k60.C42526c;

/* compiled from: PassportAddProfileDialogAsyncLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f211202a;

    /* renamed from: b, reason: collision with root package name */
    public final C25721c f211203b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f211204c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f211205d;

    /* renamed from: e, reason: collision with root package name */
    public final Xu.c f211206e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f211207f;

    /* renamed from: g, reason: collision with root package name */
    public final C42526c f211208g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<G50.a> f211209h;

    public e(dv.b bVar, C25721c c25721c, dv.b bVar2, dagger.internal.f fVar, Xu.c cVar, dv.b bVar3, C42526c c42526c, Provider provider) {
        this.f211202a = bVar;
        this.f211203b = c25721c;
        this.f211204c = bVar2;
        this.f211205d = fVar;
        this.f211206e = cVar;
        this.f211207f = bVar3;
        this.f211208g = c42526c;
        this.f211209h = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((a.InterfaceC4053a) this.f211202a.get(), (C25719a) this.f211203b.get(), (a.b) this.f211204c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f211205d.get(), (Resources) this.f211206e.get(), (a.i) this.f211207f.get(), (C42524a) this.f211208g.get(), this.f211209h.get());
    }
}
