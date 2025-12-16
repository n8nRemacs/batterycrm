package com.avito.android.iac_avcalls.impl_module.platform.avcalls;

import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.camera.camera2.internal.G;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.analytics.clickstream.D;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.iac_avcalls.public_module.analytics.AvCallsFunnelEventsObserver;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCallDirection;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCameraPosition;
import com.avito.android.iac_avcalls.public_module.models.AvCallsConnectionQuality;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCreateCallMetaInfo;
import com.avito.android.iac_avcalls.public_module.models.AvCallsEvent;
import com.avito.android.remote.model.RawJson;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.avcalls.a;
import com.avito.avcalls.call.C36199e;
import com.avito.avcalls.call.J;
import com.avito.avcalls.call.V;
import com.avito.avcalls.call.models.CallMetaInfo;
import com.avito.avcalls.call.models.CallState;
import com.avito.avcalls.call.models.CameraPosition;
import com.avito.avcalls.call.models.CreateCallMetaInfo;
import com.avito.avcalls.call.y;
import com.avito.avcalls.connection_quality.ConnectionQualityStatus;
import com.avito.avcalls.logger.AvCallsLogMessage;
import com.avito.avcalls.logger.LogSeverity;
import com.avito.avcalls.signaling.p;
import com.russhwolf.settings.C37852a;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.M;
import kotlinx.coroutines.S;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.t1;
import ru.avito.messenger.InterfaceC47842z;
import tJ.C48562a;
import tJ.C48563b;
import tJ.C48564c;
import tJ.d;
import uQ0.b;
import wJ.C49519a;

/* compiled from: AvCallsProvider.kt */
@Singleton
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/c;", "Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/a;", "Lcom/avito/avcalls/a$g;", "Lcom/avito/avcalls/a$e;", "Lcom/avito/avcalls/a$f;", "Lcom/avito/avcalls/a$d;", "Lcom/avito/avcalls/a$a;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ContributesBinding.b
/* loaded from: classes13.dex */
public final class c implements com.avito.android.iac_avcalls.impl_module.platform.avcalls.a, a.g, a.e, a.f, a.d, a.InterfaceC10303a {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final AtomicInteger f164380j;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f164381a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final FJ.a f164382b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC47842z f164383c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f164384d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final F f164385e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f164386f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Object f164387g = C42727D.b(LazyThreadSafetyMode.f406614b, new C4807c());

    /* renamed from: h, reason: collision with root package name */
    @k
    public final e2 f164388h = f2.b(0, 32, null, 5);

    /* renamed from: i, reason: collision with root package name */
    @k
    public final e2 f164389i = f2.b(32, 0, null, 6);

    /* compiled from: AvCallsProvider.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/c$a;", "", "<init>", "()V", "", "ANALYTICS_SIGNALLING_PREFIX", "Ljava/lang/String;", "TAG_EXCEPTION", "TAG_TRANSPORT", "Ljava/util/concurrent/atomic/AtomicInteger;", "requestCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AvCallsProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[AvCallsLogMessage.Kind.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AvCallsLogMessage.Kind kind = AvCallsLogMessage.Kind.f332932b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[LogSeverity.values().length];
            try {
                iArr2[4] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LogSeverity logSeverity = LogSeverity.f332936c;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LogSeverity logSeverity2 = LogSeverity.f332936c;
                iArr2[1] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                LogSeverity logSeverity3 = LogSeverity.f332936c;
                iArr2[2] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                LogSeverity logSeverity4 = LogSeverity.f332936c;
                iArr2[3] = 5;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: AvCallsProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/avcalls/a;", "invoke", "()Lcom/avito/avcalls/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.iac_avcalls.impl_module.platform.avcalls.c$c, reason: collision with other inner class name */
    public static final class C4807c extends N implements Y41.a<com.avito.avcalls.a> {
        public C4807c() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.avcalls.a invoke() {
            c cVar = c.this;
            Context context = cVar.f164381a;
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new D(2));
            LogSeverity logSeverity = LogSeverity.f332936c;
            cVar.f164382b.getClass();
            n<Object> nVar = FJ.a.f4664d[1];
            com.avito.avcalls.logger.a aVar = new com.avito.avcalls.logger.a(!((Boolean) r3.f4666c.a().invoke()).booleanValue());
            d dVar = new d(cVar);
            C49519a c49519a = new C49519a();
            com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.capturing.c cVar2 = new com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.capturing.c(cVar.f164381a);
            M mB2 = A0.b(executorServiceNewSingleThreadExecutor);
            kotlinx.coroutines.scheduling.c cVar3 = C43262l0.f411945a;
            com.avito.avcalls.utils.coroutines.c cVar4 = new com.avito.avcalls.utils.coroutines.c(mB2, K.f411877a, cVar);
            com.avito.avcalls.signaling.transport.external.a aVar2 = new com.avito.avcalls.signaling.transport.external.a();
            com.avito.avcalls.config.f fVar = new com.avito.avcalls.config.f(new C37852a.C10808a(context).a());
            com.avito.avcalls.connection_quality.b bVar = new com.avito.avcalls.connection_quality.b(cVar4);
            p pVar = new p(new com.avito.avcalls.signaling.transport.g(cVar4, aVar2, new com.avito.avcalls.signaling.transport.external.h(cVar), fVar.f332870b, bVar));
            com.avito.avcalls.utils.c cVar5 = new com.avito.avcalls.utils.c(context);
            com.avito.avcalls.rtc.peer_connection.e eVar = new com.avito.avcalls.rtc.peer_connection.e(dVar);
            J j12 = new J();
            com.avito.avcalls.rtc.media.k kVar = new com.avito.avcalls.rtc.media.k(eVar);
            com.avito.avcalls.rtc.device.video.capturing.i iVar = new com.avito.avcalls.rtc.device.video.capturing.i(new com.avito.android.str_seller_orders.orders_seller.d(j12, 17), fVar, cVar2, kVar, cVar4);
            CQ0.c cVar6 = new CQ0.c(new CQ0.d(c49519a));
            return new com.avito.avcalls.e(cVar4, new C36199e(cVar4, new y(new V(eVar, fVar, iVar, cVar6, kVar), pVar, cVar5, fVar), pVar, cVar, null, iVar, j12, cVar6, bVar, 16, null), aVar2, cVar, aVar, cVar, new com.avito.avcalls.config.d(pVar, U.a(cVar4.f333661d.plus(t1.b()).plus(new S("config_loader_coroutine"))), fVar), fVar);
        }
    }

    static {
        new a(null);
        f164380j = new AtomicInteger();
    }

    @Inject
    public c(@k Context context, @k FJ.a aVar, @k InterfaceC47842z interfaceC47842z, @k InterfaceC28373a interfaceC28373a, @k F f12, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f164381a = context;
        this.f164382b = aVar;
        this.f164383c = interfaceC47842z;
        this.f164384d = interfaceC28373a;
        this.f164385e = f12;
        this.f164386f = interfaceC35745a5;
    }

    @Override // com.avito.avcalls.a.d
    public final void a(@k Throwable th2) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("AvCallsPlatform", "ExceptionHandler: Unhandled exception in SDK", th2);
        this.f164384d.c(new y.a(this.f164385e.a("calls", "{{%app_ver%}}", "avcalls_exception_handler_error").f91030a, 1L));
    }

    @Override // com.avito.avcalls.a.g
    public final void b(@k String str, @k CallState callState) {
        this.f164388h.K5(new AvCallsEvent.StatsReportDelivered(str, C48564c.a(callState)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.iac_avcalls.impl_module.platform.avcalls.a
    @k
    public final com.avito.avcalls.a c() {
        return (com.avito.avcalls.a) this.f164387g.getValue();
    }

    @Override // com.avito.avcalls.a.g
    public final void d(@l CameraPosition cameraPosition) {
        AvCallsCameraPosition avCallsCameraPosition;
        e2 e2Var = this.f164388h;
        if (cameraPosition != null) {
            int i12 = d.a.f439224a[cameraPosition.ordinal()];
            if (i12 == 1) {
                avCallsCameraPosition = AvCallsCameraPosition.f164614b;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                avCallsCameraPosition = AvCallsCameraPosition.f164615c;
            }
        } else {
            avCallsCameraPosition = null;
        }
        e2Var.K5(new AvCallsEvent.CameraPositionChanged(avCallsCameraPosition));
    }

    @Override // com.avito.avcalls.a.InterfaceC10303a
    public final void e(@k uQ0.b bVar) {
        AvCallsCallDirection avCallsCallDirection;
        InterfaceC28464o aVar;
        boolean z12 = bVar instanceof b.e;
        InterfaceC28373a interfaceC28373a = this.f164384d;
        if (z12) {
            b.e eVar = (b.e) bVar;
            if (eVar instanceof b.e.f) {
                aVar = new y.a(AK.c.s(new StringBuilder("calls.sdk.method."), ((b.e.f) eVar).f439957a, ".called"), 0L, 2, null);
            } else if (eVar instanceof b.e.h) {
                b.e.h hVar = (b.e.h) eVar;
                aVar = new y.c(AK.c.s(new StringBuilder("calls.sdk.method."), hVar.f439961a, ".ok"), Long.valueOf(hVar.f439962b), null);
            } else if (eVar instanceof b.e.g) {
                StringBuilder sb2 = new StringBuilder("calls.sdk.method.");
                b.e.g gVar = (b.e.g) eVar;
                sb2.append(gVar.f439958a);
                sb2.append(".error_");
                sb2.append(gVar.f439959b);
                aVar = new y.c(sb2.toString(), Long.valueOf(gVar.f439960c), null);
            } else if (L.f(eVar, b.e.C12716e.f439956a)) {
                aVar = new y.a("calls.sdk.transport.send.ok", 0L, 2, null);
            } else if (L.f(eVar, b.e.d.f439955a)) {
                aVar = new y.a("calls.sdk.transport.send.retry", 0L, 2, null);
            } else if (L.f(eVar, b.e.c.f439954a)) {
                aVar = new y.a("calls.sdk.transport.send.error", 0L, 2, null);
            } else if (eVar instanceof b.e.a) {
                aVar = new y.a("calls.sdk.transport.receive.ok", 0L, 2, null);
            } else {
                if (!L.f(eVar, b.e.C12715b.f439953a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new y.a("calls.sdk.transport.receive.error_parsing", 0L, 2, null);
            }
            interfaceC28373a.c(aVar);
            return;
        }
        if (bVar instanceof b.c.a ? true : bVar instanceof b.a.C12712a) {
            return;
        }
        if (bVar instanceof b.d.a) {
            interfaceC28373a.c(new y.a(this.f164385e.a("iac.sdk.message_sender.ExceptionOnCancellation", ((b.d.a) bVar).f439951a).f91030a, 1L));
            return;
        }
        boolean z13 = bVar instanceof b.AbstractC12713b.a;
        e2 e2Var = this.f164389i;
        if (z13) {
            b.AbstractC12713b.a aVar2 = (b.AbstractC12713b.a) bVar;
            int i12 = C48562a.C12668a.f439223a[aVar2.f439936c.ordinal()];
            if (i12 == 1) {
                avCallsCallDirection = AvCallsCallDirection.OUTGOING;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                avCallsCallDirection = AvCallsCallDirection.INCOMING;
            }
            e2Var.K5(new AvCallsFunnelEventsObserver.CallActiveAndConnectedEvent(aVar2.f439934a, aVar2.f439935b, avCallsCallDirection, C48563b.a(aVar2.f439937d)));
            return;
        }
        if (bVar instanceof b.AbstractC12713b.C12714b) {
            b.AbstractC12713b.C12714b c12714b = (b.AbstractC12713b.C12714b) bVar;
            e2Var.K5(new AvCallsFunnelEventsObserver.IncomingCallAllocatedEvent(c12714b.f439938a, c12714b.f439939b, C48563b.a(c12714b.f439940c)));
            return;
        }
        if (bVar instanceof b.AbstractC12713b.c) {
            b.AbstractC12713b.c cVar = (b.AbstractC12713b.c) bVar;
            e2Var.K5(new AvCallsFunnelEventsObserver.IncomingCallRingingEvent(cVar.f439941a, cVar.f439942b, C48563b.a(cVar.f439943c)));
            return;
        }
        if (!(bVar instanceof b.AbstractC12713b.d)) {
            if (bVar instanceof b.AbstractC12713b.e) {
                b.AbstractC12713b.e eVar2 = (b.AbstractC12713b.e) bVar;
                e2Var.K5(new AvCallsFunnelEventsObserver.OutgoingCallRingingEvent(eVar2.f439947a, eVar2.f439948b, C48563b.a(eVar2.f439949c)));
                return;
            }
            return;
        }
        b.AbstractC12713b.d dVar = (b.AbstractC12713b.d) bVar;
        CreateCallMetaInfo createCallMetaInfo = dVar.f439946c;
        String scenario = createCallMetaInfo.getScenario();
        Long itemId = createCallMetaInfo.getItemId();
        Map<String, String> extraInfo = createCallMetaInfo.getExtraInfo();
        if (extraInfo == null) {
            extraInfo = P0.c();
        }
        e2Var.K5(new AvCallsFunnelEventsObserver.OutgoingCallAllocatingEvent(dVar.f439944a, dVar.f439945b, new AvCallsCreateCallMetaInfo(itemId, scenario, extraInfo)));
    }

    @Override // com.avito.android.iac_avcalls.impl_module.platform.avcalls.a
    /* renamed from: f, reason: from getter */
    public final e2 getF164388h() {
        return this.f164388h;
    }

    @Override // com.avito.avcalls.a.f
    public final void g(@k AvCallsLogMessage avCallsLogMessage) {
        String strF;
        int iOrdinal = avCallsLogMessage.f332927a.ordinal();
        String str = avCallsLogMessage.f332928b;
        if (iOrdinal == 0) {
            strF = G.f("AvCalls: ", str);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            strF = G.f("WebRtc: ", str);
        }
        int iOrdinal2 = avCallsLogMessage.f332929c.ordinal();
        Exception exc = avCallsLogMessage.f332931e;
        if (iOrdinal2 == 0 || iOrdinal2 == 1) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(strF, tJ.i.a(avCallsLogMessage), exc);
        } else if (iOrdinal2 == 2) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.d(strF, tJ.i.a(avCallsLogMessage), exc);
        } else if (iOrdinal2 == 3) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b(strF, tJ.i.a(avCallsLogMessage), exc);
        } else if (iOrdinal2 == 4) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(strF, tJ.i.a(avCallsLogMessage), exc);
        }
        if (exc != null) {
            this.f164384d.c(new y.a(this.f164385e.a("calls", "{{%app_ver%}}", "avcalls_log_listener_error").f91030a, 1L));
        }
    }

    @Override // com.avito.android.iac_avcalls.public_module.analytics.AvCallsFunnelEventsObserver
    @k
    public final InterfaceC43160i<AvCallsFunnelEventsObserver.Event> getEvents() {
        return this.f164389i;
    }

    @Override // com.avito.avcalls.a.g
    public final void h(@k CallState callState, @k String str, @k String str2, @k CallMetaInfo callMetaInfo) {
        this.f164388h.K5(new AvCallsEvent.NewIncomingCallReceived(C48564c.a(callState), str, str2, C48563b.a(callMetaInfo)));
    }

    @Override // com.avito.avcalls.a.g
    public final void i(@k ConnectionQualityStatus connectionQualityStatus) {
        AvCallsConnectionQuality avCallsConnectionQuality;
        e2 e2Var = this.f164388h;
        int iOrdinal = connectionQualityStatus.ordinal();
        if (iOrdinal == 0) {
            avCallsConnectionQuality = AvCallsConnectionQuality.NO_DATA;
        } else if (iOrdinal == 1) {
            avCallsConnectionQuality = AvCallsConnectionQuality.f164618OK;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            avCallsConnectionQuality = AvCallsConnectionQuality.UNSTABLE;
        }
        e2Var.K5(new AvCallsEvent.ConnectionQualityChanged(avCallsConnectionQuality));
    }

    @Override // com.avito.avcalls.a.e
    @k
    public final com.avito.android.iac_avcalls.impl_module.platform.avcalls.b j(@k String str, @k String str2, @k Y41.l lVar, @k Y41.l lVar2) {
        int andIncrement = f164380j.getAndIncrement();
        return new com.avito.android.iac_avcalls.impl_module.platform.avcalls.b(A1.e(this.f164383c.callMethod(str, new RawJson(str2)).j(new e(str, andIncrement)).z(this.f164386f.a()), new f(this, str, andIncrement, lVar2), new g(andIncrement, lVar, str)), 0);
    }

    @Override // com.avito.avcalls.a.g
    public final void k(@k CallState callState) {
        this.f164388h.K5(new AvCallsEvent.CallStateChanged(C48564c.a(callState)));
    }
}
