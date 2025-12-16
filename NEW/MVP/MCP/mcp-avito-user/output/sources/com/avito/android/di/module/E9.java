package com.avito.android.di.module;

import android.app.Application;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29969f;
import com.avito.android.di.component.InterfaceC29907n;
import com.avito.android.service.short_task.ShortTask;

/* compiled from: ShortTaskModule_ProvideSendClickStreamEventsTaskFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class E9 implements dagger.internal.h<ShortTask> {

    /* renamed from: a, reason: collision with root package name */
    public final C30261z9 f143913a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f143914b;

    public E9(C30261z9 c30261z9, dagger.internal.l lVar) {
        this.f143913a = c30261z9;
        this.f143914b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f143914b.f393949a;
        this.f143913a.getClass();
        InterfaceC29907n.a aVarA = com.avito.android.di.component.s.a();
        aVarA.a((InterfaceC29969f) C29972i.a(C29972i.b(application), InterfaceC29969f.class));
        return aVarA.build().a();
    }
}
