package com.avito.android.di.module;

import android.app.Application;
import com.avito.android.util.C35942s5;
import com.avito.android.util.InterfaceC35884r5;

/* compiled from: CoreTasksModule_ProvideShortcutManagerFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class Y3 implements dagger.internal.h<InterfaceC35884r5> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f144208a;

    public Y3(dagger.internal.l lVar) {
        this.f144208a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f144208a.f393949a;
        H3.f143982a.getClass();
        return new C35942s5(application);
    }
}
