package com.avito.android.iac_avcalls.impl_module.network_test;

import com.avito.avcalls.a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvCallsNetworkTestImplV2_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/network_test/k;", "Ldagger/internal/h;", "Lcom/avito/android/iac_avcalls/impl_module/network_test/h;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<h> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f164347b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<a.e> f164348a;

    /* compiled from: AvCallsNetworkTestImplV2_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/network_test/k$a;", "", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k Provider<a.e> provider) {
        this.f164348a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.e eVar = this.f164348a.get();
        f164347b.getClass();
        return new h(eVar);
    }
}
