package com.avito.android.di.module;

import android.app.Application;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29893c;
import com.avito.android.di.component.InterfaceC29894a;
import com.avito.android.service.short_task.ShortTask;

/* compiled from: ShortTaskModule_ProvideAppUpdateTaskFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class A9 implements dagger.internal.h<ShortTask> {

    /* renamed from: a, reason: collision with root package name */
    public final C30261z9 f143840a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f143841b;

    public A9(C30261z9 c30261z9, dagger.internal.l lVar) {
        this.f143840a = c30261z9;
        this.f143841b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f143841b.f393949a;
        this.f143840a.getClass();
        InterfaceC29894a.InterfaceC4201a interfaceC4201aA = com.avito.android.di.component.o.a();
        interfaceC4201aA.a((InterfaceC29893c) C29972i.a(C29972i.b(application), InterfaceC29893c.class));
        return interfaceC4201aA.build().a();
    }
}
