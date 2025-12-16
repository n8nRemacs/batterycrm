package com.avito.android.user_advert.advert.delegate.installments;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InstallmentsPresenterDelegateImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final i f308615a;

    /* renamed from: b, reason: collision with root package name */
    public final u f308616b;

    /* renamed from: c, reason: collision with root package name */
    public final u f308617c;

    /* renamed from: d, reason: collision with root package name */
    public final u f308618d;

    /* renamed from: e, reason: collision with root package name */
    public final k f308619e;

    /* renamed from: f, reason: collision with root package name */
    public final u f308620f;

    public g(i iVar, u uVar, u uVar2, u uVar3, k kVar, u uVar4) {
        this.f308615a = iVar;
        this.f308616b = uVar;
        this.f308617c = uVar2;
        this.f308618d = uVar3;
        this.f308619e = kVar;
        this.f308620f = uVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((h) this.f308615a.get(), (InterfaceC35745a5) this.f308616b.get(), (com.avito.android.remote.error.f) this.f308617c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f308618d.get(), (j) this.f308619e.get(), (InterfaceC28373a) this.f308620f.get());
    }
}
