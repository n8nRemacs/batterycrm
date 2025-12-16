package com.avito.android.beduin.common.component.video;

import com.google.android.exoplayer2.source.C36548k;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinVideoComponentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C36548k> f102897a;

    public d(Provider<C36548k> provider) {
        this.f102897a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f102897a.get());
    }
}
