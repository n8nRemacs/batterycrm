package com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls;

import android.content.Context;
import com.avito.android.analytics.clickstream.D;
import com.avito.avcalls.android.a;
import com.avito.avcalls.android.logger.AvCallsLoggingConfiguration;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvCallsProviderImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/y;", "Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/x;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class y implements x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f164577a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a.e f164578b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final t f164579c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.f f164580d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.d f164581e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC10304a f164582f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Object f164583g = C42727D.b(LazyThreadSafetyMode.f406614b, new a());

    /* compiled from: AvCallsProviderImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/avcalls/android/a;", "invoke", "()Lcom/avito/avcalls/android/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.avito.avcalls.android.a> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.avcalls.android.a invoke() {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.d("AvCallsPlatform", "AvCalls instance is initialized", null);
            y yVar = y.this;
            Context applicationContext = yVar.f164577a.getApplicationContext();
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new D(3));
            AvCallsLoggingConfiguration.SdkSeverity sdkSeverity = AvCallsLoggingConfiguration.SdkSeverity.f331729b;
            AvCallsLoggingConfiguration.RtcSeverity rtcSeverity = AvCallsLoggingConfiguration.RtcSeverity.f331722b;
            return new com.avito.avcalls.android.e(applicationContext, executorServiceNewSingleThreadExecutor, yVar.f164578b, yVar.f164579c, yVar.f164580d, new AvCallsLoggingConfiguration(), yVar.f164581e, yVar.f164582f, true, true).a();
        }
    }

    @Inject
    public y(@Y61.k Context context, @Y61.k a.e eVar, @Y61.k t tVar, @Y61.k a.f fVar, @Y61.k a.d dVar, @Y61.k a.InterfaceC10304a interfaceC10304a) {
        this.f164577a = context;
        this.f164578b = eVar;
        this.f164579c = tVar;
        this.f164580d = fVar;
        this.f164581e = dVar;
        this.f164582f = interfaceC10304a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.x
    @Y61.k
    public final com.avito.avcalls.android.a a() {
        return (com.avito.avcalls.android.a) this.f164583g.getValue();
    }
}
