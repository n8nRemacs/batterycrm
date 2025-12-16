package com.avito.android.blueprints.publish.select.inline;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckboxSelectItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f106481a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f106482b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Q1> f106483c;

    public g(Provider<com.avito.android.util.text.a> provider, Provider<InterfaceC35807h4> provider2, Provider<Q1> provider3) {
        this.f106481a = provider;
        this.f106482b = provider2;
        this.f106483c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f106481a.get(), this.f106482b.get(), this.f106483c.get());
    }
}
