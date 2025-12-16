package com.avito.android.publish.price_list.di;

import android.content.res.Resources;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.publish.price_list.di.a;
import com.avito.android.util.C35876q3;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectPriceListItemsModule_ProvideObjectsSummaryFormatterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<C35876q3> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f238507a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f238508b;

    public k(dagger.internal.u uVar, Provider provider) {
        this.f238507a = uVar;
        this.f238508b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f238507a.get();
        u3.l lVar = (u3.l) ((a.c.e) this.f238508b).get();
        e.f238492a.getClass();
        return new C35876q3(resources, ((SimpleTestGroupWithNone) lVar.f439745a.f439749b).b());
    }
}
