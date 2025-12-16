package com.avito.android.blueprint.video.url;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: PublishVideoUrlBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f105787a;

    /* renamed from: b, reason: collision with root package name */
    public final u f105788b;

    /* renamed from: c, reason: collision with root package name */
    public final u f105789c;

    public b(u uVar, u uVar2, Provider provider) {
        this.f105787a = provider;
        this.f105788b = uVar;
        this.f105789c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f105787a.get(), (com.avito.android.util.text.a) this.f105788b.get(), (l) this.f105789c.get());
    }
}
