package Oo0;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg;
import javax.inject.Provider;

/* compiled from: SbcClientMetricsLogger_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f12546a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f12547b;

    public m(dagger.internal.l lVar, Provider provider) {
        this.f12546a = provider;
        this.f12547b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f12546a.get(), (CreateDiscountDispatchArg) this.f12547b.f393949a);
    }
}
