package com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls;

import com.avito.android.analytics.statsd.y;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvCallsExternalSignalingTransportImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class l extends N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f164557l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f164558m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f164559n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f164560o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(j jVar, String str, int i12, Y41.l<? super Throwable, G0> lVar) {
        super(1);
        this.f164557l = jVar;
        this.f164558m = str;
        this.f164559n = i12;
        this.f164560o = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        Throwable th3 = th2;
        j jVar = this.f164557l;
        jVar.f164552b.c(new NonFatalErrorEvent("Unhandled error in avcalls: " + th3.getLocalizedMessage(), new AvcallsExternalSignallingTransportError(th3), null, NonFatalErrorEvent.a.C4323a.f147930a, 4, null));
        jVar.f164552b.c(new y.a(jVar.f164553c.a("calls", "{{%app_ver%}}", "avcalls_external_signaling_transport_error").f91030a, 1L));
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("AvCallsPlatform", "ExternalSignalingTransport: Socket request failed: method=" + this.f164558m + ", requestIndex=" + this.f164559n, th3);
        this.f164560o.invoke(th3);
        return G0.f406611a;
    }
}
