package com.avito.android.user_adverts.expired_count.di;

import android.app.Application;
import com.avito.android.account.G;
import com.avito.android.di.C29972i;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.user_adverts.expired_count.di.a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserAdvertsInfoUpdateRunnerModule_ProvideUserAdvertsInfoTaskFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<ShortTask> {

    /* renamed from: a, reason: collision with root package name */
    public final j f312140a;

    /* renamed from: b, reason: collision with root package name */
    public final l f312141b;

    public k(j jVar, l lVar) {
        this.f312140a = jVar;
        this.f312141b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f312141b.f393949a;
        this.f312140a.getClass();
        a.b bVar = new a.b();
        c cVar = (c) C29972i.a(C29972i.b(application), c.class);
        bVar.f312129a = cVar;
        a.c cVar2 = new a.c(cVar, null);
        h31.e eVarA = dagger.internal.g.a(cVar2.f312131b);
        c cVar3 = cVar2.f312130a;
        f90.y yVarK8 = cVar3.k8();
        G gW2 = cVar3.w();
        t.c(gW2);
        eH0.h hVarR8 = cVar3.r8();
        t.c(hVarR8);
        return new com.avito.android.user_adverts.expired_count.h(new com.avito.android.user_adverts.expired_count.b(eVarA, yVarK8, gW2, hVarR8));
    }
}
