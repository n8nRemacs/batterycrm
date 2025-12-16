package com.avito.android.extended_profile_adverts.adapter.error_snippet;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Y1;
import pA.InterfaceC46926a;

/* compiled from: ErrorSnippetItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Y1<InterfaceC46926a>> f150581a;

    public g(Provider<Y1<InterfaceC46926a>> provider) {
        this.f150581a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f150581a.get());
    }
}
