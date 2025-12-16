package com.avito.android.recall_me.domain;

import Bi0.C13154c;
import com.avito.android.recall_me.presentation.C34240j;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wi0.InterfaceC49631b;

/* compiled from: RecallMeInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49631b> f251855a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f251856b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.recall_me.presentation.k f251857c;

    /* renamed from: d, reason: collision with root package name */
    public final b f251858d;

    /* renamed from: e, reason: collision with root package name */
    public final C13154c f251859e;

    public m(Provider provider, Provider provider2, com.avito.android.recall_me.presentation.k kVar, b bVar, C13154c c13154c) {
        this.f251855a = provider;
        this.f251856b = provider2;
        this.f251857c = kVar;
        this.f251858d = bVar;
        this.f251859e = c13154c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(dagger.internal.g.b(this.f251855a), this.f251856b.get(), (C34240j) this.f251857c.get(), (a) this.f251858d.get(), (com.avito.android.recall_me_core.b) this.f251859e.get());
    }
}
