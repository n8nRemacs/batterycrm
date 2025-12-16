package com.avito.android.edit_basic_info;

import androidx.fragment.app.Fragment;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditBasicInfoRouterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f146099a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Integer> f146100b;

    public j(dagger.internal.l lVar, Provider provider) {
        this.f146099a = lVar;
        this.f146100b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Fragment) this.f146099a.f393949a, this.f146100b.get().intValue());
    }
}
