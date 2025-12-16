package com.avito.android.di.module;

import android.app.Application;
import com.avito.android.di.C29972i;
import com.avito.android.service.short_task.ShortTask;
import vx.InterfaceC49390a;

/* compiled from: ShortTaskModule_ProvideFetchRemoteTogglesTaskFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class C9 implements dagger.internal.h<ShortTask> {

    /* renamed from: a, reason: collision with root package name */
    public final C30261z9 f143876a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f143877b;

    public C9(C30261z9 c30261z9, dagger.internal.l lVar) {
        this.f143876a = c30261z9;
        this.f143877b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f143877b.f393949a;
        this.f143876a.getClass();
        return com.avito.android.di.component.x.a().a((InterfaceC49390a) C29972i.a(C29972i.b(application), InterfaceC49390a.class)).a();
    }
}
