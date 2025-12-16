package com.avito.android.publish.uxfeedback_helper;

import AK0.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishUxFeedbackStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f245522a;

    public h(Provider<l> provider) {
        this.f245522a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f245522a.get());
    }
}
