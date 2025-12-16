package com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvCallsAnalyticsListener_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/c;", "Ldagger/internal/h;", "Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/a;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<C30832a> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f164539d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f164540a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<F> f164541b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.permissions.z> f164542c;

    /* compiled from: AvCallsAnalyticsListener_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/c$a;", "", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@Y61.k dagger.internal.f fVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f164540a = fVar;
        this.f164541b = provider;
        this.f164542c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f164540a.get();
        F f12 = this.f164541b.get();
        com.avito.android.permissions.z zVar = this.f164542c.get();
        f164539d.getClass();
        return new C30832a(interfaceC28373a, f12, zVar);
    }
}
