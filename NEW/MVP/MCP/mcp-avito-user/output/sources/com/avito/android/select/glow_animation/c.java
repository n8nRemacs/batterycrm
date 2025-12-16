package com.avito.android.select.glow_animation;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GlowAnimationItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f265395a;

    public c(Provider<f> provider) {
        this.f265395a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f265395a.get());
    }
}
