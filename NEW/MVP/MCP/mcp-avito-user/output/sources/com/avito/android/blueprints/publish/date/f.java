package com.avito.android.blueprints.publish.date;

import com.avito.android.Q1;
import com.avito.android.util.D0;
import com.avito.android.util.InterfaceC35807h4;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DateItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f106117a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f106118b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Q1> f106119c;

    public f(Provider<D0> provider, Provider<InterfaceC35807h4> provider2, Provider<Q1> provider3) {
        this.f106117a = provider;
        this.f106118b = provider2;
        this.f106119c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f106117a.get(), this.f106118b.get(), this.f106119c.get());
    }
}
