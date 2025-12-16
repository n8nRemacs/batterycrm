package com.avito.android.esia_webview.mvi;

import Oz.C14760d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfirmDocumentsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final i f148179a;

    /* renamed from: b, reason: collision with root package name */
    public final e f148180b;

    public c(i iVar, e eVar) {
        this.f148179a = iVar;
        this.f148180b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f148179a.get();
        this.f148180b.getClass();
        return new b("EsiaWebView", C14760d.f12747a, new a(hVar, new d()));
    }
}
