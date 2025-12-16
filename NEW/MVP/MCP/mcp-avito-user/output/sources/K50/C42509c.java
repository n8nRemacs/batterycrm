package k50;

import com.avito.android.beduin.v2.page.n;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import i50.AbstractC41226a;
import javax.inject.Provider;

/* compiled from: GeneralTabModule_ProvideServicesOrdersTabBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: k50.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C42509c implements h<com.avito.android.lib.deprecated_design.tab.b<? extends AbstractC41226a>> {

    /* renamed from: a, reason: collision with root package name */
    public final C42507a f406086a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<n> f406087b;

    public C42509c(C42507a c42507a, Provider<n> provider) {
        this.f406086a = c42507a;
        this.f406087b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n nVar = this.f406087b.get();
        this.f406086a.getClass();
        return new l50.b(nVar);
    }
}
