package com.avito.android.iac_avcalls.impl_module.platform_v1;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.t;
import com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.x;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvCallsPlatformImplV1_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/h;", "Ldagger/internal/h;", "Lcom/avito/android/iac_avcalls/impl_module/platform_v1/d;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<d> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f164608e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f164609a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<t> f164610b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<F> f164611c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final dagger.internal.f f164612d;

    /* compiled from: AvCallsPlatformImplV1_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/h$a;", "", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@k dagger.internal.f fVar, @k u uVar, @k Provider provider, @k Provider provider2) {
        this.f164609a = uVar;
        this.f164610b = provider;
        this.f164611c = provider2;
        this.f164612d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        x xVar = (x) this.f164609a.get();
        t tVar = this.f164610b.get();
        F f12 = this.f164611c.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f164612d.get();
        f164608e.getClass();
        return new d(xVar, tVar, f12, interfaceC28373a);
    }
}
