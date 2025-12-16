package com.avito.android.remote.notification;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: NotificationResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes17.dex */
public final class C implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f253958a;

    public C(C30102l3 c30102l3) {
        this.f253958a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new B((Context) this.f253958a.get());
    }
}
