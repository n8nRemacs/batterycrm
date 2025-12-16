package com.avito.android.authorization.gorelkin;

import android.content.res.Resources;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zz.InterfaceC50647a;

/* compiled from: ParsingPermissionViewModelImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class q implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<h> f93951a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f93952b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Resources> f93953c;

    /* renamed from: d, reason: collision with root package name */
    public final u f93954d;

    public q(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f93951a = provider;
        this.f93952b = provider2;
        this.f93953c = provider3;
        this.f93954d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f93951a.get(), this.f93952b.get(), this.f93953c.get(), (InterfaceC50647a) this.f93954d.get());
    }
}
