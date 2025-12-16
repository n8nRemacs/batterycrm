package com.avito.android.beduin.common.actionhandler.countdown_text;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinCountdownTextHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f100220a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f100221b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f100222c;

    /* renamed from: d, reason: collision with root package name */
    public final l f100223d;

    public i(dagger.internal.f fVar, l lVar, Provider provider, Provider provider2) {
        this.f100220a = provider;
        this.f100221b = fVar;
        this.f100222c = provider2;
        this.f100223d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f100220a.get(), dagger.internal.g.b(this.f100221b), this.f100222c.get(), dagger.internal.g.b(this.f100223d));
    }
}
