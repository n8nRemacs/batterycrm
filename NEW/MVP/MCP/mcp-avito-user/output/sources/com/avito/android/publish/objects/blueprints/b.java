package com.avito.android.publish.objects.blueprints;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeleteObjectButtonBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f237580a;

    public b(Provider<c> provider) {
        this.f237580a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f237580a.get());
    }
}
