package com.avito.android.webview.deeplink;

import com.avito.android.deep_linking.links.WebViewLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: WebViewDeeplinkHandlerModule_ProvideWebViewAnyDomainDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f329551a;

    public d(f fVar) {
        this.f329551a = fVar;
    }

    public static d a(f fVar) {
        return new d(fVar);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c.f329550a.getClass();
        return new C43834a(WebViewLink.AnyDomain.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(WebViewLink.AnyDomain.class), this.f329551a));
    }
}
