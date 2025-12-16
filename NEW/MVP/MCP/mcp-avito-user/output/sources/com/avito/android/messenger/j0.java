package com.avito.android.messenger;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.util.InterfaceC35745a5;
import hz.InterfaceC41196a;
import javax.inject.Provider;

/* compiled from: MessengerUserIdInteractor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class j0 implements dagger.internal.h<g0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.account.G> f196418a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f196419b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f196420c;

    /* renamed from: d, reason: collision with root package name */
    public final C30713g1 f196421d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.account.O> f196422e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f196423f;

    public j0(Provider provider, dagger.internal.u uVar, Provider provider2, C30713g1 c30713g1, Provider provider3, Provider provider4) {
        this.f196418a = provider;
        this.f196419b = uVar;
        this.f196420c = provider2;
        this.f196421d = c30713g1;
        this.f196422e = provider3;
        this.f196423f = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g0(this.f196418a.get(), dagger.internal.g.a(dagger.internal.w.a(this.f196419b)), this.f196420c.get(), (C30277e1) this.f196421d.get(), this.f196422e.get(), this.f196423f.get());
    }
}
