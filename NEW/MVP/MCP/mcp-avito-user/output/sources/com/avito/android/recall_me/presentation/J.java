package com.avito.android.recall_me.presentation;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: RecallMeViewModelImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class J implements dagger.internal.h<I> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f251891a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.recall_me.domain.g> f251892b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f251893c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f251894d;

    /* renamed from: e, reason: collision with root package name */
    public final k f251895e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f251896f;

    public J(dagger.internal.l lVar, Provider provider, dagger.internal.u uVar, Provider provider2, k kVar, Provider provider3) {
        this.f251891a = lVar;
        this.f251892b = provider;
        this.f251893c = uVar;
        this.f251894d = provider2;
        this.f251895e = kVar;
        this.f251896f = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new I((RecallMeParams) this.f251891a.f393949a, this.f251892b.get(), (InterfaceC34231a) this.f251893c.get(), this.f251894d.get(), (C34240j) this.f251895e.get(), this.f251896f.get());
    }
}
