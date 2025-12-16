package com.avito.android.wallet.webview.mvi.components;

import com.avito.android.wallet.webview.mvi.entity.WalletWebViewState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletWebViewFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f329421a;

    /* renamed from: b, reason: collision with root package name */
    public final b f329422b;

    /* renamed from: c, reason: collision with root package name */
    public final i f329423c;

    /* renamed from: d, reason: collision with root package name */
    public final k f329424d;

    public g(d dVar, b bVar, i iVar, k kVar) {
        this.f329421a = dVar;
        this.f329422b = bVar;
        this.f329423c = iVar;
        this.f329424d = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f329421a.get();
        a aVar = (a) this.f329422b.get();
        this.f329423c.getClass();
        h hVar = new h();
        this.f329424d.getClass();
        j jVar = new j();
        WalletWebViewState.f329433b.getClass();
        return new f("WalletWebView", WalletWebViewState.f329434c, new e(cVar, aVar, jVar, hVar));
    }
}
