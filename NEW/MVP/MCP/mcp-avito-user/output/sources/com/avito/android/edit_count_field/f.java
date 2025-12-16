package com.avito.android.edit_count_field;

import androidx.fragment.app.Fragment;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditCountFieldRouterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f146598a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Integer> f146599b;

    public f(dagger.internal.l lVar, Provider provider) {
        this.f146598a = lVar;
        this.f146599b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Fragment) this.f146598a.f393949a, this.f146599b.get().intValue());
    }
}
