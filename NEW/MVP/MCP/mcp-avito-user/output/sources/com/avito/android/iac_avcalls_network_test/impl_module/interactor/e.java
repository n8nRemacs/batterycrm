package com.avito.android.iac_avcalls_network_test.impl_module.interactor;

import Y61.k;
import com.avito.android.analytics.H;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvCallsNetworkTestInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls_network_test/impl_module/interactor/e;", "Ldagger/internal/h;", "Lcom/avito/android/iac_avcalls_network_test/impl_module/interactor/b;", "a", "_avito_iac-avcalls-network-test_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<b> {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f164662k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<R0> f164663a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<KJ.a> f164664b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dagger.internal.f f164665c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Provider<UJ.a> f164666d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Provider<com.avito.android.server_time.f> f164667e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final u f164668f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final RJ.e f164669g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Provider<com.avito.android.app_foreground_provider.util_module.a> f164670h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Provider<BL.a> f164671i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Provider<H> f164672j;

    /* compiled from: AvCallsNetworkTestInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls_network_test/impl_module/interactor/e$a;", "", "<init>", "()V", "_avito_iac-avcalls-network-test_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k Provider provider, @k Provider provider2, @k dagger.internal.f fVar, @k Provider provider3, @k Provider provider4, @k u uVar, @k RJ.e eVar, @k Provider provider5, @k Provider provider6, @k Provider provider7) {
        this.f164663a = provider;
        this.f164664b = provider2;
        this.f164665c = fVar;
        this.f164666d = provider3;
        this.f164667e = provider4;
        this.f164668f = uVar;
        this.f164669g = eVar;
        this.f164670h = provider5;
        this.f164671i = provider6;
        this.f164672j = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = this.f164663a.get();
        KJ.a aVar = this.f164664b.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f164665c.get();
        UJ.a aVar2 = this.f164666d.get();
        com.avito.android.server_time.f fVar = this.f164667e.get();
        PJ.a aVar3 = (PJ.a) this.f164668f.get();
        RJ.a aVar4 = (RJ.a) this.f164669g.get();
        com.avito.android.app_foreground_provider.util_module.a aVar5 = this.f164670h.get();
        BL.a aVar6 = this.f164671i.get();
        H h12 = this.f164672j.get();
        f164662k.getClass();
        return new b(r02, aVar, interfaceC28373a, aVar2, fVar, aVar3, aVar4, aVar5, aVar6, h12);
    }
}
