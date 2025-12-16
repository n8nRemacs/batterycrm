package com.avito.android.bxcontent.beduin_v2.di;

import com.avito.android.lib.beduin_v2.component.exception.callback.b;
import com.avito.android.util.C;
import com.avito.beduin.v2.render.android_view.n;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BxContentBeduinLocalComponentsModule_ProvideExceptionComponentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<n<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f109516a;

    /* renamed from: b, reason: collision with root package name */
    public final l f109517b;

    public d(l lVar, Provider provider) {
        this.f109516a = provider;
        this.f109517b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f109516a.get();
        Y41.l lVar = (Y41.l) this.f109517b.f393949a;
        b.f109514a.getClass();
        c12.getF125491k().getClass();
        return new b.a(new AJ.b(8, lVar));
    }
}
