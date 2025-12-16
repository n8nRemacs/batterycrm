package com.avito.android.di.module;

import android.app.Application;
import com.avito.android.di.C29972i;
import com.avito.android.di.component.N;
import com.avito.android.service.short_task.ShortTask;

/* compiled from: ShortTaskModule_ProvideSendStatsdEventsTaskFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class G9 implements dagger.internal.h<ShortTask> {

    /* renamed from: a, reason: collision with root package name */
    public final C30261z9 f143976a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f143977b;

    public G9(C30261z9 c30261z9, dagger.internal.l lVar) {
        this.f143976a = c30261z9;
        this.f143977b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f143977b.f393949a;
        this.f143976a.getClass();
        N.a aVarA = com.avito.android.di.component.A.a();
        aVarA.a((com.avito.android.di.X) C29972i.a(C29972i.b(application), com.avito.android.di.X.class));
        return aVarA.build().a();
    }
}
