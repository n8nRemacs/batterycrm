package com.avito.android.publish.premoderation.di;

import com.avito.android.publish.premoderation.di.c;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishAdvertDuplicateModule_ProvideAdvertDuplicatePresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<com.avito.android.publish.premoderation.d> {

    /* renamed from: a, reason: collision with root package name */
    public final f f238291a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f238292b;

    public g(f fVar, Provider<InterfaceC35745a5> provider) {
        this.f238291a = fVar;
        this.f238292b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.publish.premoderation.h((InterfaceC35745a5) ((c.C7159c.a) this.f238292b).get(), this.f238291a.f238290a);
    }
}
