package com.avito.android.feedback_adverts;

import android.content.res.Resources;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FeedbackAdvertsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f157891a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.feedback_adverts.di.h f157892b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f157893c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Resources> f157894d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f157895e;

    public q(Provider provider, com.avito.android.feedback_adverts.di.h hVar, Provider provider2, Provider provider3, dagger.internal.u uVar) {
        this.f157891a = provider;
        this.f157892b = hVar;
        this.f157893c = provider2;
        this.f157894d = provider3;
        this.f157895e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f157891a.get(), (g) this.f157892b.get(), this.f157893c.get(), this.f157894d.get(), (com.avito.android.mvi.rx3.with_monolithic_state.t) this.f157895e.get());
    }
}
