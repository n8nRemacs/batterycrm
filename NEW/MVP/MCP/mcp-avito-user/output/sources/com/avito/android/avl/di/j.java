package com.avito.android.avl.di;

import Ab.C13005a;
import android.os.Bundle;
import com.avito.konveyor.item_visibility_tracker.d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvlPlayerModule_ProvideItemVisibilityTracker$_avito_avl_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.item_visibility_tracker.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Ab.c> f98080a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C13005a> f98081b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f98082c;

    public j(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f98080a = provider;
        this.f98081b = provider2;
        this.f98082c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Ab.c cVar = this.f98080a.get();
        C13005a c13005a = this.f98081b.get();
        Bundle bundle = (Bundle) this.f98082c.f393949a;
        f fVar = f.f98077a;
        d.a aVar = new d.a(bundle, false);
        aVar.a(cVar);
        aVar.a(c13005a);
        return aVar.b();
    }
}
