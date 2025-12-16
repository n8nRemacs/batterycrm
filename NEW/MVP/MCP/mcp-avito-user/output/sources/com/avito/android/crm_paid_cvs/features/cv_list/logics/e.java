package com.avito.android.crm_paid_cvs.features.cv_list.logics;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import dt.InterfaceC39801a;
import javax.inject.Provider;

/* compiled from: CvListBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f130562a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f130563b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f130564c;

    public e(u uVar, Provider provider, Provider provider2) {
        this.f130562a = uVar;
        this.f130563b = provider;
        this.f130564c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((InterfaceC39801a) this.f130562a.get(), this.f130563b.get(), this.f130564c.get());
    }
}
