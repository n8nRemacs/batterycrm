package com.avito.android.webview.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.webview.l;
import com.avito.android.webview.n;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WebViewDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f<D extends WebViewLink> implements h<b<D>> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f329553a;

    /* renamed from: b, reason: collision with root package name */
    public final n f329554b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f329555c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f329556d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f329557e;

    public f(dv.b bVar, n nVar, dv.b bVar2, C25721c c25721c, dagger.internal.f fVar) {
        this.f329553a = bVar;
        this.f329554b = nVar;
        this.f329555c = bVar2;
        this.f329556d = c25721c;
        this.f329557e = fVar;
    }

    public static f a(dv.b bVar, n nVar, dv.b bVar2, C25721c c25721c, dagger.internal.f fVar) {
        return new f(bVar, nVar, bVar2, c25721c, fVar);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.b) this.f329553a.get(), (l) this.f329554b.get(), (a.InterfaceC4053a) this.f329555c.get(), (C25719a) this.f329556d.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f329557e.get());
    }
}
