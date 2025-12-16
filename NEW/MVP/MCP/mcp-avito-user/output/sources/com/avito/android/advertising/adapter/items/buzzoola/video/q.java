package com.avito.android.advertising.adapter.items.buzzoola.video;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CommercialVideoRichBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<j> f87605a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.player_holder.a> f87606b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f87607c;

    public q(Provider<j> provider, Provider<com.avito.android.player_holder.a> provider2, Provider<InterfaceC35745a5> provider3) {
        this.f87605a = provider;
        this.f87606b = provider2;
        this.f87607c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f87605a.get(), this.f87606b.get(), this.f87607c.get());
    }
}
