package com.avito.android.iac_dialer.impl_module.analytics;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.H;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.iac_analytics.public_module.clickstream_events.IacEvent4101;
import com.avito.android.iac_avcalls.public_module.analytics.AvCallsFunnelEventsObserver;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCallDirection;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCallMetaInfo;
import com.avito.android.iac_dialer.impl_module.analytics.tech_info.IacTechInfoStorage;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.permissions.z;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: IacEvent4101Tracker.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/analytics/j;", "Lcom/avito/android/iac_dialer/impl_module/analytics/i;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AvCallsFunnelEventsObserver f165671a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final H f165672b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final z f165673c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer.impl_module.device_status.connection_status.a f165674d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final UJ.a f165675e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer.impl_module.notifications.channels.g f165676f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final q f165677g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final R0 f165678h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f165679i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final F f165680j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final IacTechInfoStorage f165681k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public Map<String, ? extends Map<String, String>> f165682l = P0.c();

    /* compiled from: IacEvent4101Tracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165683a;

        static {
            int[] iArr = new int[IacCallDirection.values().length];
            try {
                iArr[IacCallDirection.OUTGOING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IacCallDirection.INCOMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f165683a = iArr;
        }
    }

    /* compiled from: IacEvent4101Tracker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.analytics.IacEvent4101TrackerImpl$startReceiving4101FromAvCalls$1", f = "IacEvent4101Tracker.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f165684q;

        /* compiled from: IacEvent4101Tracker.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver$Event;", "event", "Lkotlin/G0;", "emit", "(Lcom/avito/android/iac_avcalls/public_module/analytics/AvCallsFunnelEventsObserver$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f165686b;

            /* compiled from: IacEvent4101Tracker.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.iac_dialer.impl_module.analytics.j$b$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C4911a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f165687a;

                static {
                    int[] iArr = new int[AvCallsCallDirection.values().length];
                    try {
                        iArr[AvCallsCallDirection.OUTGOING.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AvCallsCallDirection.INCOMING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f165687a = iArr;
                }
            }

            public a(j jVar) {
                this.f165686b = jVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                IacCallDirection iacCallDirection;
                IacEvent4101 iacEvent4101C;
                AvCallsFunnelEventsObserver.Event event = (AvCallsFunnelEventsObserver.Event) obj;
                boolean z12 = event instanceof AvCallsFunnelEventsObserver.OutgoingCallAllocatingEvent;
                j jVar = this.f165686b;
                if (z12) {
                    AvCallsFunnelEventsObserver.OutgoingCallAllocatingEvent outgoingCallAllocatingEvent = (AvCallsFunnelEventsObserver.OutgoingCallAllocatingEvent) event;
                    String scenario = outgoingCallAllocatingEvent.getCreateCallMeta().getScenario();
                    String callId = outgoingCallAllocatingEvent.getCallId();
                    IacCallDirection iacCallDirection2 = IacCallDirection.OUTGOING;
                    boolean zIsVideo = outgoingCallAllocatingEvent.isVideo();
                    Long itemId = outgoingCallAllocatingEvent.getCreateCallMeta().getItemId();
                    iacEvent4101C = j.c(this.f165686b, scenario, callId, iacCallDirection2, zIsVideo, itemId != null ? itemId.toString() : null, jVar.f165682l.get(outgoingCallAllocatingEvent.getCallId()), 1);
                } else if (event instanceof AvCallsFunnelEventsObserver.OutgoingCallRingingEvent) {
                    AvCallsFunnelEventsObserver.OutgoingCallRingingEvent outgoingCallRingingEvent = (AvCallsFunnelEventsObserver.OutgoingCallRingingEvent) event;
                    String scenario2 = outgoingCallRingingEvent.getMeta().getScenario();
                    String callId2 = outgoingCallRingingEvent.getCallId();
                    IacCallDirection iacCallDirection3 = IacCallDirection.OUTGOING;
                    boolean zIsVideo2 = outgoingCallRingingEvent.isVideo();
                    AvCallsCallMetaInfo.Item item = outgoingCallRingingEvent.getMeta().getItem();
                    iacEvent4101C = j.c(this.f165686b, scenario2, callId2, iacCallDirection3, zIsVideo2, item != null ? Boxing.boxLong(item.getId()).toString() : null, jVar.f165682l.get(outgoingCallRingingEvent.getCallId()), 2);
                } else if (event instanceof AvCallsFunnelEventsObserver.IncomingCallAllocatedEvent) {
                    AvCallsFunnelEventsObserver.IncomingCallAllocatedEvent incomingCallAllocatedEvent = (AvCallsFunnelEventsObserver.IncomingCallAllocatedEvent) event;
                    String scenario3 = incomingCallAllocatedEvent.getMeta().getScenario();
                    String callId3 = incomingCallAllocatedEvent.getCallId();
                    IacCallDirection iacCallDirection4 = IacCallDirection.INCOMING;
                    boolean zIsVideo3 = incomingCallAllocatedEvent.isVideo();
                    AvCallsCallMetaInfo.Item item2 = incomingCallAllocatedEvent.getMeta().getItem();
                    iacEvent4101C = j.c(this.f165686b, scenario3, callId3, iacCallDirection4, zIsVideo3, item2 != null ? Boxing.boxLong(item2.getId()).toString() : null, jVar.f165682l.get(incomingCallAllocatedEvent.getCallId()), 1);
                } else if (event instanceof AvCallsFunnelEventsObserver.IncomingCallRingingEvent) {
                    AvCallsFunnelEventsObserver.IncomingCallRingingEvent incomingCallRingingEvent = (AvCallsFunnelEventsObserver.IncomingCallRingingEvent) event;
                    String scenario4 = incomingCallRingingEvent.getMeta().getScenario();
                    String callId4 = incomingCallRingingEvent.getCallId();
                    IacCallDirection iacCallDirection5 = IacCallDirection.INCOMING;
                    boolean zIsVideo4 = incomingCallRingingEvent.isVideo();
                    AvCallsCallMetaInfo.Item item3 = incomingCallRingingEvent.getMeta().getItem();
                    iacEvent4101C = j.c(this.f165686b, scenario4, callId4, iacCallDirection5, zIsVideo4, item3 != null ? Boxing.boxLong(item3.getId()).toString() : null, jVar.f165682l.get(incomingCallRingingEvent.getCallId()), 2);
                } else {
                    if (!(event instanceof AvCallsFunnelEventsObserver.CallActiveAndConnectedEvent)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AvCallsFunnelEventsObserver.CallActiveAndConnectedEvent callActiveAndConnectedEvent = (AvCallsFunnelEventsObserver.CallActiveAndConnectedEvent) event;
                    String scenario5 = callActiveAndConnectedEvent.getMeta().getScenario();
                    String callId5 = callActiveAndConnectedEvent.getCallId();
                    int i12 = C4911a.f165687a[callActiveAndConnectedEvent.getDirection().ordinal()];
                    if (i12 == 1) {
                        iacCallDirection = IacCallDirection.OUTGOING;
                    } else {
                        if (i12 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iacCallDirection = IacCallDirection.INCOMING;
                    }
                    IacCallDirection iacCallDirection6 = iacCallDirection;
                    boolean zIsVideo5 = callActiveAndConnectedEvent.isVideo();
                    AvCallsCallMetaInfo.Item item4 = callActiveAndConnectedEvent.getMeta().getItem();
                    iacEvent4101C = j.c(this.f165686b, scenario5, callId5, iacCallDirection6, zIsVideo5, item4 != null ? Boxing.boxLong(item4.getId()).toString() : null, jVar.f165682l.get(callActiveAndConnectedEvent.getCallId()), 3);
                }
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacEvent4101Tracker", "track: " + iacEvent4101C, null);
                jVar.f165679i.c(iacEvent4101C);
                if (!z12) {
                    boolean z13 = event instanceof AvCallsFunnelEventsObserver.OutgoingCallRingingEvent;
                    F f12 = jVar.f165680j;
                    InterfaceC28373a interfaceC28373a = jVar.f165679i;
                    if (z13) {
                        interfaceC28373a.c(new y.a(f12.a("calls", "outgoing_call_funnel", "{{%app_ver%}}", ((AvCallsFunnelEventsObserver.OutgoingCallRingingEvent) event).getMeta().getScenario(), "dialing").f91030a, 1L));
                    } else if (!(event instanceof AvCallsFunnelEventsObserver.IncomingCallAllocatedEvent)) {
                        if (event instanceof AvCallsFunnelEventsObserver.IncomingCallRingingEvent) {
                            interfaceC28373a.c(new y.a(f12.a("calls", "incoming_call_funnel", "{{%app_ver%}}", "call_initiated").f91030a, 1L));
                        } else if (event instanceof AvCallsFunnelEventsObserver.CallActiveAndConnectedEvent) {
                            AvCallsFunnelEventsObserver.CallActiveAndConnectedEvent callActiveAndConnectedEvent2 = (AvCallsFunnelEventsObserver.CallActiveAndConnectedEvent) event;
                            int i13 = C4911a.f165687a[callActiveAndConnectedEvent2.getDirection().ordinal()];
                            if (i13 == 1) {
                                interfaceC28373a.c(new y.a(f12.a("calls", "out", "connect").f91030a, 1L));
                                interfaceC28373a.c(new y.a(f12.a("calls", "outgoing_call_funnel", "{{%app_ver%}}", callActiveAndConnectedEvent2.getMeta().getScenario(), "active").f91030a, 1L));
                            } else if (i13 == 2) {
                                interfaceC28373a.c(new y.a(f12.a("calls", "in", "connect").f91030a, 1L));
                                interfaceC28373a.c(new y.a(f12.a("calls", "incoming_call_funnel", "{{%app_ver%}}", "active").f91030a, 1L));
                            }
                        }
                    }
                }
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return j.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f165684q;
            if (i12 == 0) {
                C42729a0.b(obj);
                j jVar = j.this;
                InterfaceC43160i<AvCallsFunnelEventsObserver.Event> events = jVar.f165671a.getEvents();
                a aVar = new a(jVar);
                this.f165684q = 1;
                if (events.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public j(@Y61.k AvCallsFunnelEventsObserver avCallsFunnelEventsObserver, @Y61.k H h12, @Y61.k z zVar, @Y61.k com.avito.android.iac_dialer.impl_module.device_status.connection_status.a aVar, @Y61.k UJ.a aVar2, @Y61.k com.avito.android.iac_dialer.impl_module.notifications.channels.g gVar, @Y61.k q qVar, @Y61.k R0 r02, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k F f12, @Y61.k IacTechInfoStorage iacTechInfoStorage) {
        this.f165671a = avCallsFunnelEventsObserver;
        this.f165672b = h12;
        this.f165673c = zVar;
        this.f165674d = aVar;
        this.f165675e = aVar2;
        this.f165676f = gVar;
        this.f165677g = qVar;
        this.f165678h = r02;
        this.f165679i = interfaceC28373a;
        this.f165680j = f12;
        this.f165681k = iacTechInfoStorage;
    }

    public static final IacEvent4101 c(j jVar, String str, String str2, IacCallDirection iacCallDirection, boolean z12, String str3, Map map, int i12) {
        String str4;
        jVar.getClass();
        int i13 = a.f165683a[iacCallDirection.ordinal()];
        if (i13 == 1) {
            str4 = str;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str4 = "incoming_call";
        }
        String strA = jVar.f165672b.a();
        boolean zA2 = jVar.f165676f.a();
        boolean zB2 = jVar.f165673c.b("android.permission.RECORD_AUDIO").b();
        Boolean boolIsVpnActive = jVar.f165674d.getStatus().isVpnActive();
        UJ.a aVar = jVar.f165675e;
        return new IacEvent4101(str4, str2, iacCallDirection, Boolean.valueOf(z12), str3, i12, null, strA, Boolean.valueOf(zA2), zB2, boolIsVpnActive, aVar.b(), aVar.c(), jVar.f165677g.c(), map, jVar.f165681k.b(str2));
    }

    @Override // com.avito.android.iac_dialer.impl_module.analytics.i
    public final void a(@Y61.k String str, @Y61.l Map<String, String> map) {
        this.f165682l = P0.l(this.f165682l, new Q(str, map));
    }

    @Override // com.avito.android.iac_dialer.impl_module.analytics.i
    public final void b() {
        C43259k.d(U.a(this.f165678h.a()), null, null, new b(null), 3);
    }
}
