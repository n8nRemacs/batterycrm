package k50;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import i50.AbstractC41226a;
import j50.C42200b;
import javax.inject.Provider;

/* compiled from: GeneralTabModule_ProvideTabBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: k50.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C42511e implements h<com.avito.android.lib.deprecated_design.tab.b<? extends AbstractC41226a>> {

    /* renamed from: a, reason: collision with root package name */
    public final C42507a f406089a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.orders_aggregation_core.h> f406090b;

    public C42511e(C42507a c42507a, Provider<com.avito.android.orders_aggregation_core.h> provider) {
        this.f406089a = c42507a;
        this.f406090b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.orders_aggregation_core.h hVar = this.f406090b.get();
        this.f406089a.getClass();
        return new C42200b(hVar);
    }
}
