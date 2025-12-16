package com.avito.android.iac_avcalls.impl_module.platform.avcalls;

import Y41.l;
import com.avito.android.analytics.statsd.y;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvCallsProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class f extends N implements l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f164394l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f164395m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f164396n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f164397o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(c cVar, String str, int i12, l<? super Throwable, G0> lVar) {
        super(1);
        this.f164394l = cVar;
        this.f164395m = str;
        this.f164396n = i12;
        this.f164397o = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        Throwable th3 = th2;
        c cVar = this.f164394l;
        cVar.f164384d.c(new y.a(cVar.f164385e.a("calls", "{{%app_ver%}}", "avcalls_external_signaling_transport_error").f91030a, 1L));
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("AvCallsPlatform", "ExternalSignalingTransport: Socket request failed: method=" + this.f164395m + ", requestIndex=" + this.f164396n, th3);
        this.f164397o.invoke(th3);
        return G0.f406611a;
    }
}
