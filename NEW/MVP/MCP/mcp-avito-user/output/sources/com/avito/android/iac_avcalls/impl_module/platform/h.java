package com.avito.android.iac_avcalls.impl_module.platform;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvCallsPlatformWithCoroutinesImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/h;", "Ldagger/internal/h;", "Lcom/avito/android/iac_avcalls/impl_module/platform/d;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<d> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f164489d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<com.avito.android.iac_avcalls.impl_module.platform.avcalls.a> f164490a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<F> f164491b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dagger.internal.f f164492c;

    /* compiled from: AvCallsPlatformWithCoroutinesImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/h$a;", "", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@k dagger.internal.f fVar, @k Provider provider, @k Provider provider2) {
        this.f164490a = provider;
        this.f164491b = provider2;
        this.f164492c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_avcalls.impl_module.platform.avcalls.a aVar = this.f164490a.get();
        F f12 = this.f164491b.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f164492c.get();
        f164489d.getClass();
        return new d(aVar, f12, interfaceC28373a);
    }
}
