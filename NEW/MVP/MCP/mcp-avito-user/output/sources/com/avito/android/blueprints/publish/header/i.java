package com.avito.android.blueprints.publish.header;

import Jj.C14202a;
import Jj.C14204c;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HeaderItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final C14204c f106217a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f106218b;

    public i(C14204c c14204c, Provider provider) {
        this.f106217a = c14204c;
        this.f106218b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((C14202a) this.f106217a.get(), this.f106218b.get());
    }
}
