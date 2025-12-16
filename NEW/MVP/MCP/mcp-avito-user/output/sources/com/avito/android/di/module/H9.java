package com.avito.android.di.module;

import android.app.Application;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29968e;
import com.avito.android.di.component.InterfaceC29906m;
import com.avito.android.service.short_task.ShortTask;

/* compiled from: ShortTaskModule_ProvideTimeRequestTaskFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class H9 implements dagger.internal.h<ShortTask> {

    /* renamed from: a, reason: collision with root package name */
    public final C30261z9 f143994a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f143995b;

    public H9(C30261z9 c30261z9, dagger.internal.l lVar) {
        this.f143994a = c30261z9;
        this.f143995b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f143995b.f393949a;
        this.f143994a.getClass();
        InterfaceC29906m.a aVarA = com.avito.android.di.component.r.a();
        aVarA.a((InterfaceC29968e) C29972i.a(C29972i.b(application), InterfaceC29968e.class));
        return aVarA.build().a();
    }
}
