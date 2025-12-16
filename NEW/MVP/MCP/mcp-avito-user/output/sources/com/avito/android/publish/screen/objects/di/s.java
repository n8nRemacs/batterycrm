package com.avito.android.publish.screen.objects.di;

import com.avito.android.Q1;
import com.avito.android.publish.screen.objects.di.C33986a;
import javax.inject.Provider;

/* compiled from: ObjectFillFormModule_ProvideObjectBottomButtonHelperFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class s implements dagger.internal.h<com.avito.android.publish.screen.objects.view.actions.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C34019j f239933a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.publish.screen.objects.view.actions.c f239934b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.publish.screen.objects.view.actions.j f239935c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Q1> f239936d;

    public s(C34019j c34019j, com.avito.android.publish.screen.objects.view.actions.c cVar, com.avito.android.publish.screen.objects.view.actions.j jVar, Provider provider) {
        this.f239933a = c34019j;
        this.f239934b = cVar;
        this.f239935c = jVar;
        this.f239936d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f239934b));
        h31.e eVarA2 = dagger.internal.g.a(dagger.internal.w.a(this.f239935c));
        Q1 q1Z0 = ((C33986a.c.P) this.f239936d).f239825a.z0();
        this.f239933a.getClass();
        return q1Z0.B().invoke().booleanValue() ? (com.avito.android.publish.screen.objects.view.actions.a) eVarA2.get() : (com.avito.android.publish.screen.objects.view.actions.a) eVarA.get();
    }
}
