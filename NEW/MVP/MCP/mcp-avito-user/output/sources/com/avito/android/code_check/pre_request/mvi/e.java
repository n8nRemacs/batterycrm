package com.avito.android.code_check.pre_request.mvi;

import com.avito.android.code_check_public.screen.g;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PreRequestBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.code_check.pre_request.f f119206a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.code_check.d> f119207b;

    public e(com.avito.android.code_check.pre_request.f fVar, Provider provider) {
        this.f119206a = fVar;
        this.f119207b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((g.a) this.f119206a.get(), this.f119207b.get());
    }
}
