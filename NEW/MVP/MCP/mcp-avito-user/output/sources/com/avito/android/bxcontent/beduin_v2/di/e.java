package com.avito.android.bxcontent.beduin_v2.di;

import com.avito.android.lib.beduin_v2.component.exception.callback.c;
import com.avito.android.util.C;
import com.avito.beduin.v2.render.android_view.n;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BxContentBeduinLocalComponentsModule_ProvideUnregisteredComponentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<n<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f109518a;

    /* renamed from: b, reason: collision with root package name */
    public final l f109519b;

    public e(l lVar, Provider provider) {
        this.f109518a = provider;
        this.f109519b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f109518a.get();
        Y41.l lVar = (Y41.l) this.f109519b.f393949a;
        b.f109514a.getClass();
        c12.getF125491k().getClass();
        return new c.a(new AJ.b(7, lVar));
    }
}
