package com.avito.android.webview.deeplink;

import com.avito.android.deep_linking.links.WebViewLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: WebViewDeeplinkHandlerModule_ProvideWebViewAvitoDomainDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f329552a;

    public e(f fVar) {
        this.f329552a = fVar;
    }

    public static e a(f fVar) {
        return new e(fVar);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = this.f329552a;
        c.f329550a.getClass();
        return new C43834a(WebViewLink.OnlyAvitoDomain.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(WebViewLink.OnlyAvitoDomain.class), fVar));
    }
}
