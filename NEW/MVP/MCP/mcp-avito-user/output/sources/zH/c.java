package ZH;

import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.e0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GsmRealtyTrxFlowAbTestsImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.gsm_realty_trx_flow.impl_module.splitter.features.d f20069a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f20070b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC27642e> f20071c;

    public c(com.avito.android.gsm_realty_trx_flow.impl_module.splitter.features.d dVar, e0 e0Var, Provider provider) {
        this.f20069a = dVar;
        this.f20070b = e0Var;
        this.f20071c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.gsm_realty_trx_flow.impl_module.splitter.features.a) this.f20069a.get(), (c0) this.f20070b.get(), this.f20071c.get());
    }
}
