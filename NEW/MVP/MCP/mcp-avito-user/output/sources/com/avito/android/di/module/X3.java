package com.avito.android.di.module;

import com.avito.android.util.C35878q5;
import com.avito.android.util.InterfaceC35871p5;

/* compiled from: CoreTasksModule_ProvideShortcutInfoFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class X3 implements dagger.internal.h<InterfaceC35871p5> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.deep_linking.C f144186a;

    public X3(com.avito.android.deep_linking.C c12) {
        this.f144186a = c12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deep_linking.z zVar = (com.avito.android.deep_linking.z) this.f144186a.get();
        H3.f143982a.getClass();
        return new C35878q5(zVar);
    }
}
