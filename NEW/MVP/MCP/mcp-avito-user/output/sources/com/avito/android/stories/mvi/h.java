package com.avito.android.stories.mvi;

import Cx0.C13371c;
import Cx0.InterfaceC13369a;
import com.avito.android.stories.G;
import com.avito.android.stories.I;
import com.avito.android.stories.r;
import com.avito.android.stories.s;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StoriesActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C13371c f285276a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f285277b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f285278c;

    /* renamed from: d, reason: collision with root package name */
    public final I f285279d;

    /* renamed from: e, reason: collision with root package name */
    public final s f285280e;

    public h(C13371c c13371c, Provider provider, Provider provider2, I i12, s sVar) {
        this.f285276a = c13371c;
        this.f285277b = provider;
        this.f285278c = provider2;
        this.f285279d = i12;
        this.f285280e = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC13369a) this.f285276a.get(), this.f285277b.get(), this.f285278c.get(), (G) this.f285279d.get(), (r) this.f285280e.get());
    }
}
