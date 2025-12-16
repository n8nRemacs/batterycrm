package com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.iac_avcalls.public_module.analytics.AvCallsFunnelEventsObserver;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCallDirection;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCreateCallMetaInfo;
import com.avito.avcalls.android.a;
import com.avito.avcalls.android.call.models.CreateCallMetaInfo;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import vQ0.AbstractC49254b;

/* compiled from: AvCallsAnalyticsListener.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/a;", "Lcom/avito/avcalls/android/a$a;", "Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30832a implements a.InterfaceC10304a, AvCallsFunnelEventsObserver {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f164535a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F f164536b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.z f164537c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e2 f164538d = f2.b(16, 0, null, 6);

    /* compiled from: AvCallsAnalyticsListener.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/a$a;", "", "<init>", "()V", "", "PREFIX", "Ljava/lang/String;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.a$a, reason: collision with other inner class name */
    public static final class C4812a {
        public /* synthetic */ C4812a(C42822w c42822w) {
            this();
        }

        public C4812a() {
        }
    }

    static {
        new C4812a(null);
    }

    @Inject
    public C30832a(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k F f12, @Y61.k com.avito.android.permissions.z zVar) {
        this.f164535a = interfaceC28373a;
        this.f164536b = f12;
        this.f164537c = zVar;
    }

    @Override // com.avito.avcalls.android.a.InterfaceC10304a
    public final void a(@Y61.k AbstractC49254b abstractC49254b) {
        AvCallsCallDirection avCallsCallDirection;
        InterfaceC28464o aVar;
        boolean z12 = abstractC49254b instanceof AbstractC49254b.e;
        InterfaceC28373a interfaceC28373a = this.f164535a;
        if (z12) {
            AbstractC49254b.e eVar = (AbstractC49254b.e) abstractC49254b;
            if (eVar instanceof AbstractC49254b.e.f) {
                aVar = new y.a(AK.c.s(new StringBuilder("calls.sdk.method."), ((AbstractC49254b.e.f) eVar).f440779a, ".called"), 0L, 2, null);
            } else if (eVar instanceof AbstractC49254b.e.h) {
                AbstractC49254b.e.h hVar = (AbstractC49254b.e.h) eVar;
                aVar = new y.c(AK.c.s(new StringBuilder("calls.sdk.method."), hVar.f440783a, ".ok"), Long.valueOf(hVar.f440784b), null);
            } else if (eVar instanceof AbstractC49254b.e.g) {
                StringBuilder sb2 = new StringBuilder("calls.sdk.method.");
                AbstractC49254b.e.g gVar = (AbstractC49254b.e.g) eVar;
                sb2.append(gVar.f440780a);
                sb2.append(".error_");
                sb2.append(gVar.f440781b);
                aVar = new y.c(sb2.toString(), Long.valueOf(gVar.f440782c), null);
            } else if (L.f(eVar, AbstractC49254b.e.C12776e.f440778a)) {
                aVar = new y.a("calls.sdk.transport.send.ok", 0L, 2, null);
            } else if (L.f(eVar, AbstractC49254b.e.d.f440777a)) {
                aVar = new y.a("calls.sdk.transport.send.retry", 0L, 2, null);
            } else if (L.f(eVar, AbstractC49254b.e.c.f440776a)) {
                aVar = new y.a("calls.sdk.transport.send.error", 0L, 2, null);
            } else if (eVar instanceof AbstractC49254b.e.a) {
                aVar = new y.a("calls.sdk.transport.receive.ok", 0L, 2, null);
            } else {
                if (!L.f(eVar, AbstractC49254b.e.C12775b.f440775a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new y.a("calls.sdk.transport.receive.error_parsing", 0L, 2, null);
            }
            interfaceC28373a.c(aVar);
            return;
        }
        if (abstractC49254b instanceof AbstractC49254b.c.a) {
            interfaceC28373a.c(new NonFatalErrorEvent("IncomingDataMessageEmit error with callId " + ((AbstractC49254b.c.a) abstractC49254b).f440772a, null, null, NonFatalErrorEvent.a.C4323a.f147930a, 6, null));
            return;
        }
        if (abstractC49254b instanceof AbstractC49254b.a.C12772a) {
            return;
        }
        if (abstractC49254b instanceof AbstractC49254b.d.a) {
            interfaceC28373a.c(new y.a(this.f164536b.a("iac.sdk.message_sender.ExceptionOnCancellation", ((AbstractC49254b.d.a) abstractC49254b).f440773a).f91030a, 1L));
            return;
        }
        boolean z13 = abstractC49254b instanceof AbstractC49254b.AbstractC12773b.a;
        e2 e2Var = this.f164538d;
        if (z13) {
            AbstractC49254b.AbstractC12773b.a aVar2 = (AbstractC49254b.AbstractC12773b.a) abstractC49254b;
            int iOrdinal = aVar2.f440758c.ordinal();
            if (iOrdinal == 0) {
                avCallsCallDirection = AvCallsCallDirection.OUTGOING;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                avCallsCallDirection = AvCallsCallDirection.INCOMING;
            }
            e2Var.K5(new AvCallsFunnelEventsObserver.CallActiveAndConnectedEvent(aVar2.f440756a, aVar2.f440757b, avCallsCallDirection, DJ.b.a(aVar2.f440759d)));
            return;
        }
        if (abstractC49254b instanceof AbstractC49254b.AbstractC12773b.C12774b) {
            AbstractC49254b.AbstractC12773b.C12774b c12774b = (AbstractC49254b.AbstractC12773b.C12774b) abstractC49254b;
            e2Var.K5(new AvCallsFunnelEventsObserver.IncomingCallAllocatedEvent(c12774b.f440760a, c12774b.f440761b, DJ.b.a(c12774b.f440762c)));
            return;
        }
        if (abstractC49254b instanceof AbstractC49254b.AbstractC12773b.c) {
            AbstractC49254b.AbstractC12773b.c cVar = (AbstractC49254b.AbstractC12773b.c) abstractC49254b;
            e2Var.K5(new AvCallsFunnelEventsObserver.IncomingCallRingingEvent(cVar.f440763a, cVar.f440764b, DJ.b.a(cVar.f440765c)));
        } else {
            if (!(abstractC49254b instanceof AbstractC49254b.AbstractC12773b.d)) {
                if (abstractC49254b instanceof AbstractC49254b.AbstractC12773b.e) {
                    AbstractC49254b.AbstractC12773b.e eVar2 = (AbstractC49254b.AbstractC12773b.e) abstractC49254b;
                    e2Var.K5(new AvCallsFunnelEventsObserver.OutgoingCallRingingEvent(eVar2.f440769a, eVar2.f440770b, DJ.b.a(eVar2.f440771c)));
                    return;
                }
                return;
            }
            AbstractC49254b.AbstractC12773b.d dVar = (AbstractC49254b.AbstractC12773b.d) abstractC49254b;
            CreateCallMetaInfo createCallMetaInfo = dVar.f440768c;
            Map<String, String> mapC = createCallMetaInfo.f331570c;
            if (mapC == null) {
                mapC = P0.c();
            }
            e2Var.K5(new AvCallsFunnelEventsObserver.OutgoingCallAllocatingEvent(dVar.f440766a, dVar.f440767b, new AvCallsCreateCallMetaInfo(createCallMetaInfo.f331569b, createCallMetaInfo.f331568a, mapC)));
        }
    }

    @Override // com.avito.android.iac_avcalls.public_module.analytics.AvCallsFunnelEventsObserver
    public final InterfaceC43160i getEvents() {
        return this.f164538d;
    }
}
