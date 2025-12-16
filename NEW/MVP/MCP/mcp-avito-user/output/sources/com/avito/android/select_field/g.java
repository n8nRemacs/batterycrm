package com.avito.android.select_field;

import androidx.fragment.app.Fragment;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectFieldRouterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f267152a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Integer> f267153b;

    public g(dagger.internal.l lVar, Provider provider) {
        this.f267152a = lVar;
        this.f267153b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Fragment) this.f267152a.f393949a, this.f267153b.get().intValue());
    }
}
