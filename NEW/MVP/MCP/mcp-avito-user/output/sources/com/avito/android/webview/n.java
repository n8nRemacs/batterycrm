package com.avito.android.webview;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: WebViewIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f329637a;

    public n(C30102l3 c30102l3) {
        this.f329637a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((Context) this.f329637a.get());
    }
}
