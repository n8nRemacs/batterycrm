package com.avito.android.player_holder;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PlayerHolderImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f220329a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f220330b;

    public c(C30102l3 c30102l3, Provider provider) {
        this.f220329a = c30102l3;
        this.f220330b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Context) this.f220329a.get(), this.f220330b.get());
    }
}
