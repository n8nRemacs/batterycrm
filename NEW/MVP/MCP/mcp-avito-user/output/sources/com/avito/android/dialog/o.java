package com.avito.android.dialog;

import android.app.Activity;
import javax.inject.Provider;

/* compiled from: DialogPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Activity> f144791a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f144792b;

    public o(dagger.internal.u uVar, Provider provider) {
        this.f144791a = provider;
        this.f144792b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f144791a.get(), (com.avito.android.lib.deprecated_design.dialog.a) this.f144792b.get());
    }
}
