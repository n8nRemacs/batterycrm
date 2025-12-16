package com.avito.android.rating_form.activity;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ActivityIntentProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f247947a;

    public b(C30102l3 c30102l3) {
        this.f247947a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Context) this.f247947a.get());
    }
}
