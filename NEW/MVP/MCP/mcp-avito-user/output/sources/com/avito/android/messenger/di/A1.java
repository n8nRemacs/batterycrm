package com.avito.android.messenger.di;

import android.app.Application;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.C29972i;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.di.C32490p0;
import com.avito.android.service.short_task.ShortTask;

/* compiled from: MessengerModule_ProvideOpenErrorTrackerTaskFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class A1 implements dagger.internal.h<ShortTask> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f195600a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f195601b;

    public A1(U0 u02, dagger.internal.l lVar) {
        this.f195600a = u02;
        this.f195601b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f195601b.f393949a;
        this.f195600a.getClass();
        C32490p0.b bVar = new C32490p0.b();
        l2 l2Var = (l2) C29972i.a(C29972i.b(application), l2.class);
        bVar.f196172a = l2Var;
        C32490p0.c cVar = new C32490p0.c(l2Var, null);
        l2 l2Var2 = cVar.f196173a;
        com.avito.android.messenger.w0 w0VarK0 = l2Var2.k0();
        dagger.internal.t.c(w0VarK0);
        InterfaceC32024m interfaceC32024m = cVar.f196186n.get();
        InterfaceC28373a interfaceC28373aA = l2Var2.a();
        dagger.internal.t.c(interfaceC28373aA);
        return new com.avito.android.messenger.service.t(new com.avito.android.messenger.service.n(w0VarK0, interfaceC32024m, interfaceC28373aA));
    }
}
