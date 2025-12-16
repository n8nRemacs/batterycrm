package com.avito.android.search;

import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: SearchDeepLinkInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V0> f263826a;

    /* renamed from: b, reason: collision with root package name */
    public final u f263827b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f263828c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f263829d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f263830e;

    public k(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f263826a = provider;
        this.f263827b = uVar;
        this.f263828c = provider2;
        this.f263829d = provider3;
        this.f263830e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(dagger.internal.g.b(this.f263826a), (SearchParamsConverter) this.f263827b.get(), this.f263828c.get(), this.f263829d.get(), this.f263830e.get());
    }
}
