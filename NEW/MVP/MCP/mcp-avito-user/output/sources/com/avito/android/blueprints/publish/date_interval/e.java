package com.avito.android.blueprints.publish.date_interval;

import com.avito.android.Q1;
import com.avito.android.util.D0;
import com.avito.android.util.InterfaceC35807h4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DateIntervalItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f106145a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f106146b;

    /* renamed from: c, reason: collision with root package name */
    public final u f106147c;

    public e(u uVar, Provider provider, Provider provider2) {
        this.f106145a = provider;
        this.f106146b = provider2;
        this.f106147c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f106145a.get(), this.f106146b.get(), (Q1) this.f106147c.get());
    }
}
