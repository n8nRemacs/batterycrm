package com.avito.android.avl_entry.impl.domain;

import Mg.InterfaceC14486a;
import com.avito.android.remote.error.i;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ShortVideosInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14486a> f98493a;

    /* renamed from: b, reason: collision with root package name */
    public final i f98494b;

    public f(Provider provider, i iVar) {
        this.f98493a = provider;
        this.f98494b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f98493a.get(), (com.avito.android.remote.error.f) this.f98494b.get());
    }
}
