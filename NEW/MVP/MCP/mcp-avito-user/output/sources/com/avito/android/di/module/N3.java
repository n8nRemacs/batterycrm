package com.avito.android.di.module;

import com.avito.android.app.task.ApplicationBlockingStartupTask;
import java.util.Set;

/* compiled from: CoreTasksModule_ProvideBlockingTasksFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes13.dex */
public final class N3 implements dagger.internal.h<Set<ApplicationBlockingStartupTask>> {

    /* compiled from: CoreTasksModule_ProvideBlockingTasksFactory.java */
    public static final class a {
        static {
            new N3();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H3.f143982a.getClass();
        kotlin.collections.B0 b02 = kotlin.collections.B0.f406639b;
        dagger.internal.t.d(b02);
        return b02;
    }
}
