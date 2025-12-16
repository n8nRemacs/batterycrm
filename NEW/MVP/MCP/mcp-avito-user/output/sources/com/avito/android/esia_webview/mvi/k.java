package com.avito.android.esia_webview.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EsiaWebViewViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final c f148192a;

    public k(c cVar) {
        this.f148192a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((b) this.f148192a.get(), null, 2, null);
    }
}
