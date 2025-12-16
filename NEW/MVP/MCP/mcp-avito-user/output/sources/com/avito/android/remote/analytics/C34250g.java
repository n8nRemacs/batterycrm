package com.avito.android.remote.analytics;

import com.avito.android.quic.cronet.CronetTcpRstReporter;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lj0.C43784d;
import lj0.InterfaceC43782b;

/* compiled from: NetworkErrorsModule_ProvideCronetMobileNetworkOperatorProviderFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/g;", "Ldagger/internal/h;", "Lcom/avito/android/quic/cronet/CronetTcpRstReporter$b;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.analytics.g, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34250g implements dagger.internal.h<CronetTcpRstReporter.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253119b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43784d f253120a;

    /* compiled from: NetworkErrorsModule_ProvideCronetMobileNetworkOperatorProviderFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/g$a;", "", "<init>", "()V", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.analytics.g$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C34250g(@Y61.k C43784d c43784d) {
        this.f253120a = c43784d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC43782b interfaceC43782b = (InterfaceC43782b) this.f253120a.get();
        f253119b.getClass();
        C34249f c34249f = C34249f.f253118a;
        return new C34247d(interfaceC43782b);
    }
}
