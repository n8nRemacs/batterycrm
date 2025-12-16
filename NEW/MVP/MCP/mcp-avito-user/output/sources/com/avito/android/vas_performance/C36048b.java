package com.avito.android.vas_performance;

import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: AppliedServiceConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.vas_performance.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36048b implements dagger.internal.h<C36047a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f319855a;

    public C36048b(Provider<InterfaceC35863o4> provider) {
        this.f319855a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C36047a(this.f319855a.get());
    }
}
