package com.avito.android.iac_avcalls_network_test.impl_module.interactor;

import Y61.k;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvCallsNetworkTestStartupTask_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls_network_test/impl_module/interactor/h;", "Ldagger/internal/h;", "Lcom/avito/android/iac_avcalls_network_test/impl_module/interactor/AvCallsNetworkTestStartupTask;", "a", "_avito_iac-avcalls-network-test_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<AvCallsNetworkTestStartupTask> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f164674b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<com.avito.android.iac_avcalls_network_test.impl_module.interactor.a> f164675a;

    /* compiled from: AvCallsNetworkTestStartupTask_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls_network_test/impl_module/interactor/h$a;", "", "<init>", "()V", "_avito_iac-avcalls-network-test_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@k Provider<com.avito.android.iac_avcalls_network_test.impl_module.interactor.a> provider) {
        this.f164675a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_avcalls_network_test.impl_module.interactor.a aVar = this.f164675a.get();
        f164674b.getClass();
        return new AvCallsNetworkTestStartupTask(aVar);
    }
}
