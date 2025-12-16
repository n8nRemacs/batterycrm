package com.avito.android.di.module;

import com.avito.android.app.task.NoOpShortcutsTask;
import com.avito.android.app.task.ShortcutsTask;
import com.avito.android.app.task.ShortcutsTaskImpl;
import com.avito.android.util.InterfaceC35871p5;
import com.avito.android.util.InterfaceC35884r5;
import javax.inject.Provider;

/* compiled from: CoreTasksModule_ProvideShortcutsTaskFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class Z3 implements dagger.internal.h<ShortcutsTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f144214a;

    /* renamed from: b, reason: collision with root package name */
    public final Y3 f144215b;

    /* renamed from: c, reason: collision with root package name */
    public final X3 f144216c;

    public Z3(Provider provider, Y3 y32, X3 x32) {
        this.f144214a = provider;
        this.f144215b = y32;
        this.f144216c = x32;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.C c12 = this.f144214a.get();
        InterfaceC35884r5 interfaceC35884r5 = (InterfaceC35884r5) this.f144215b.get();
        InterfaceC35871p5 interfaceC35871p5 = (InterfaceC35871p5) this.f144216c.get();
        H3.f143982a.getClass();
        Object shortcutsTaskImpl = c12.getF125487g() < 25 ? NoOpShortcutsTask.INSTANCE : new ShortcutsTaskImpl(interfaceC35884r5.a(), interfaceC35871p5);
        dagger.internal.t.d(shortcutsTaskImpl);
        return shortcutsTaskImpl;
    }
}
