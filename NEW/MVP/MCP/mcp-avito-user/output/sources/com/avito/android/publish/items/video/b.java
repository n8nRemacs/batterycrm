package com.avito.android.publish.items.video;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VideoItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f237204a;

    /* renamed from: b, reason: collision with root package name */
    public final u f237205b;

    public b(u uVar, Provider provider) {
        this.f237204a = provider;
        this.f237205b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f237204a.get(), (u3.l) this.f237205b.get());
    }
}
