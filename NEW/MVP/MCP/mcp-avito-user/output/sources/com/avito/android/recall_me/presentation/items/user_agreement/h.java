package com.avito.android.recall_me.presentation.items.user_agreement;

import com.avito.android.recall_me.di.k;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RecallMeAgreementPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final k f252002a;

    /* renamed from: b, reason: collision with root package name */
    public final e f252003b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f252004c;

    public h(k kVar, e eVar, Provider provider) {
        this.f252002a = kVar;
        this.f252003b = eVar;
        this.f252004c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.jakewharton.rxrelay3.c) this.f252002a.get(), (d) this.f252003b.get(), this.f252004c.get());
    }
}
