package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.analytics.tech_info.IacTechInfoStorage;
import com.avito.android.util.R0;
import java.util.Arrays;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.d2;
import nJ.C44264C;
import nJ.C44267b;

/* compiled from: AnalyticsBootstrap.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$¨\u0006%"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/bootstraps/AnalyticsBootstrap;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap;", "Lcom/avito/android/iac_dialer/impl_module/analytics/a;", "iacDialerAnalyticsHelper", "Lcom/avito/android/analytics/statsd/F;", "statsdKeyFactory", "Lcom/avito/android/util/R0;", "dispatchersFactory", "Lcom/avito/android/analytics/a;", "analytics", "Lcom/avito/android/iac_dialer/impl_module/analytics/i;", "event4101Tracker", "Lcom/avito/android/permissions/z;", "permissionStateProvider", "Lcom/avito/android/iac_dialer/impl_module/analytics/tech_info/IacTechInfoStorage;", "techInfoStorage", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/analytics/a;Lcom/avito/android/analytics/statsd/F;Lcom/avito/android/util/R0;Lcom/avito/android/analytics/a;Lcom/avito/android/iac_dialer/impl_module/analytics/i;Lcom/avito/android/permissions/z;Lcom/avito/android/iac_dialer/impl_module/analytics/tech_info/IacTechInfoStorage;)V", "Lkotlinx/coroutines/flow/d2;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "eventsFlow", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "initialState", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$a;", "actionCollector", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$d;", "waiter", "Lkotlin/G0;", "process", "(Lkotlinx/coroutines/flow/d2;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$a;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$d;)V", "Lcom/avito/android/iac_dialer/impl_module/analytics/a;", "Lcom/avito/android/analytics/statsd/F;", "Lcom/avito/android/util/R0;", "Lcom/avito/android/analytics/a;", "Lcom/avito/android/iac_dialer/impl_module/analytics/i;", "Lcom/avito/android/permissions/z;", "Lcom/avito/android/iac_dialer/impl_module/analytics/tech_info/IacTechInfoStorage;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@C11.a
/* loaded from: classes14.dex */
public final class AnalyticsBootstrap implements IacBootstrap {
    public static final int $stable = 8;

    @Y61.k
    private final InterfaceC28373a analytics;

    @Y61.k
    private final R0 dispatchersFactory;

    @Y61.k
    private final com.avito.android.iac_dialer.impl_module.analytics.i event4101Tracker;

    @Y61.k
    private final com.avito.android.iac_dialer.impl_module.analytics.a iacDialerAnalyticsHelper;

    @Y61.k
    private final com.avito.android.permissions.z permissionStateProvider;

    @Y61.k
    private final com.avito.android.analytics.statsd.F statsdKeyFactory;

    @Y61.k
    private final IacTechInfoStorage techInfoStorage;

    /* compiled from: AnalyticsBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AnalyticsBootstrap$process$1", f = "AnalyticsBootstrap.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164991q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ d2<IacEvent> f164992r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IacBootstrap.d f164993s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AnalyticsBootstrap f164994t;

        /* compiled from: AnalyticsBootstrap.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics;", "event", "Lkotlin/G0;", "emit", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent$Analytics;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AnalyticsBootstrap$a$a, reason: collision with other inner class name */
        public static final class C4831a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalyticsBootstrap f164995b;

            public C4831a(AnalyticsBootstrap analyticsBootstrap) {
                this.f164995b = analyticsBootstrap;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                IacEvent.Analytics analytics = (IacEvent.Analytics) obj;
                boolean z12 = analytics instanceof IacEvent.Analytics.TrackStatsdCount;
                AnalyticsBootstrap analyticsBootstrap = this.f164995b;
                if (z12) {
                    InterfaceC28373a interfaceC28373a = analyticsBootstrap.analytics;
                    com.avito.android.analytics.statsd.F f12 = analyticsBootstrap.statsdKeyFactory;
                    IacEvent.Analytics.TrackStatsdCount trackStatsdCount = (IacEvent.Analytics.TrackStatsdCount) analytics;
                    String[] strArr = (String[]) trackStatsdCount.getK().toArray(new String[0]);
                    F.b bVarA = f12.a((String[]) Arrays.copyOf(strArr, strArr.length));
                    interfaceC28373a.c(new y.a(bVarA.f91030a, trackStatsdCount.getV()));
                } else if (analytics instanceof IacEvent.Analytics.Track) {
                    analyticsBootstrap.analytics.c(((IacEvent.Analytics.Track) analytics).getEvent());
                } else if (analytics instanceof IacEvent.Analytics.TrackOnce) {
                    analyticsBootstrap.iacDialerAnalyticsHelper.a(((IacEvent.Analytics.TrackOnce) analytics).getEvent(), new C30835c(1, analyticsBootstrap.analytics, InterfaceC28373a.class, "track", "track(Lcom/avito/android/analytics/Event;)V", 0));
                } else if (analytics instanceof IacEvent.Analytics.TrackNonFatal) {
                    analyticsBootstrap.analytics.c(((IacEvent.Analytics.TrackNonFatal) analytics).getEvent());
                } else if (analytics instanceof IacEvent.Analytics.TrackGreenButtonClickedEvent4682) {
                    IacEvent.Analytics.TrackGreenButtonClickedEvent4682 trackGreenButtonClickedEvent4682 = (IacEvent.Analytics.TrackGreenButtonClickedEvent4682) analytics;
                    analyticsBootstrap.analytics.c(new nJ.w(trackGreenButtonClickedEvent4682.getCallId(), analyticsBootstrap.techInfoStorage.b(trackGreenButtonClickedEvent4682.getCallId()), trackGreenButtonClickedEvent4682.isFromAppUi(), Boxing.boxBoolean(analyticsBootstrap.permissionStateProvider.b("android.permission.RECORD_AUDIO").b()), analyticsBootstrap.permissionStateProvider.b("android.permission.RECORD_AUDIO").a()));
                } else if (analytics instanceof IacEvent.Analytics.TrackRedButtonClickedEvent4683) {
                    IacEvent.Analytics.TrackRedButtonClickedEvent4683 trackRedButtonClickedEvent4683 = (IacEvent.Analytics.TrackRedButtonClickedEvent4683) analytics;
                    analyticsBootstrap.analytics.c(new C44264C(trackRedButtonClickedEvent4683.getCallId(), trackRedButtonClickedEvent4683.getScenario(), trackRedButtonClickedEvent4683.getIacDialerScenario(), Boxing.boxBoolean(analyticsBootstrap.permissionStateProvider.b("android.permission.RECORD_AUDIO").b()), analyticsBootstrap.permissionStateProvider.b("android.permission.RECORD_AUDIO").a(), analyticsBootstrap.techInfoStorage.b(trackRedButtonClickedEvent4683.getCallId())));
                } else if (analytics instanceof IacEvent.Analytics.TrackCallFetchedEvent5446) {
                    IacEvent.Analytics.TrackCallFetchedEvent5446 trackCallFetchedEvent5446 = (IacEvent.Analytics.TrackCallFetchedEvent5446) analytics;
                    analyticsBootstrap.analytics.c(new C44267b(trackCallFetchedEvent5446.getCallId(), analyticsBootstrap.techInfoStorage.b(trackCallFetchedEvent5446.getCallId())));
                }
                return G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "eK/a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements InterfaceC43160i<Object> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f164996b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eK/a$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AnalyticsBootstrap$a$b$a, reason: collision with other inner class name */
            public static final class C4832a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f164997b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AnalyticsBootstrap$process$1$invokeSuspend$$inlined$releaseWaiterOnSubscriptionTo$1$2", f = "AnalyticsBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AnalyticsBootstrap$a$b$a$a, reason: collision with other inner class name */
                public static final class C4833a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f164998q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f164999r;

                    public C4833a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f164998q = obj;
                        this.f164999r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C4832a.this.emit(null, this);
                    }
                }

                public C4832a(InterfaceC43172j interfaceC43172j) {
                    this.f164997b = interfaceC43172j;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                @Y61.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AnalyticsBootstrap.a.b.C4832a.C4833a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AnalyticsBootstrap$a$b$a$a r0 = (com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AnalyticsBootstrap.a.b.C4832a.C4833a) r0
                        int r1 = r0.f164999r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f164999r = r1
                        goto L18
                    L13:
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AnalyticsBootstrap$a$b$a$a r0 = new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AnalyticsBootstrap$a$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f164998q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f164999r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        boolean r6 = r5 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent.Analytics
                        if (r6 == 0) goto L43
                        r0.f164999r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f164997b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.AnalyticsBootstrap.a.b.C4832a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(InterfaceC43160i interfaceC43160i) {
                this.f164996b = interfaceC43160i;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f164996b.collect(new C4832a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(d2<? extends IacEvent> d2Var, IacBootstrap.d dVar, AnalyticsBootstrap analyticsBootstrap, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f164992r = d2Var;
            this.f164993s = dVar;
            this.f164994t = analyticsBootstrap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f164992r, this.f164993s, this.f164994t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164991q;
            if (i12 == 0) {
                C42729a0.b(obj);
                IacBootstrap.Companion companion = IacBootstrap.INSTANCE;
                b bVar = new b(C43175k.P(this.f164992r, new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.a(this.f164993s, null)));
                C4831a c4831a = new C4831a(this.f164994t);
                this.f164991q = 1;
                if (bVar.collect(c4831a, this) == coroutine_suspended) {
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
    public AnalyticsBootstrap(@Y61.k com.avito.android.iac_dialer.impl_module.analytics.a aVar, @Y61.k com.avito.android.analytics.statsd.F f12, @Y61.k R0 r02, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.iac_dialer.impl_module.analytics.i iVar, @Y61.k com.avito.android.permissions.z zVar, @Y61.k IacTechInfoStorage iacTechInfoStorage) {
        this.iacDialerAnalyticsHelper = aVar;
        this.statsdKeyFactory = f12;
        this.dispatchersFactory = r02;
        this.analytics = interfaceC28373a;
        this.event4101Tracker = iVar;
        this.permissionStateProvider = zVar;
        this.techInfoStorage = iacTechInfoStorage;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap
    @Y61.k
    public String getName() {
        return b.a.a(this);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap
    public void process(@Y61.k d2<? extends IacEvent> eventsFlow, @Y61.k IacState initialState, @Y61.k IacBootstrap.a actionCollector, @Y61.k IacBootstrap.d waiter) throws InterruptedException {
        this.event4101Tracker.b();
        C43259k.d(kotlinx.coroutines.U.a(this.dispatchersFactory.a()), null, null, new a(eventsFlow, waiter, this, null), 3);
        waiter.a("IacEvent.Analytics");
    }
}
