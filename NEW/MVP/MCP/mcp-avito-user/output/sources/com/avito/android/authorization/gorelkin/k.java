package com.avito.android.authorization.gorelkin;

import Yd.InterfaceC18254a;
import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ParsingPermissionInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34258d> f93928a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f93929b;

    /* renamed from: c, reason: collision with root package name */
    public final Yd.c f93930c;

    public k(Provider provider, Provider provider2, Yd.c cVar) {
        this.f93928a = provider;
        this.f93929b = provider2;
        this.f93930c = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f93928a.get(), this.f93929b.get(), (InterfaceC18254a) this.f93930c.get());
    }
}
