package com.avito.android.publish.screen.step.request.mergedpretendpremoderation.mvi;

import com.avito.android.publish.C0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import nI0.InterfaceC44261b;

/* compiled from: MergedPretendPremoderationActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C0> f241818a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.publish.screen.step.request.mergedpretendpremoderation.di.e f241819b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC44261b> f241820c;

    public f(Provider provider, com.avito.android.publish.screen.step.request.mergedpretendpremoderation.di.e eVar, Provider provider2) {
        this.f241818a = provider;
        this.f241819b = eVar;
        this.f241820c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f241818a.get(), (com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.g) this.f241819b.get(), this.f241820c.get());
    }
}
