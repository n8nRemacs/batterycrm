package com.avito.android.publish.objects;

import javax.inject.Provider;

/* compiled from: ObjectFillButtonHelperImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.objects.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33892d implements dagger.internal.h<C33890c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f237597a;

    public C33892d(Provider<com.avito.android.details.a> provider) {
        this.f237597a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33890c(this.f237597a.get());
    }
}
