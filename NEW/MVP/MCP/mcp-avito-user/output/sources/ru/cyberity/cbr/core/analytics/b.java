package ru.cyberity.cbr.core.analytics;

import Y41.p;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43315z0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import ru.cyberity.cbr.core.data.model.CBRTrackEvents;

/* compiled from: Analytics.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0003J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\f\u0010\u0016J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\f\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0003R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R$\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\b0\u001aj\b\u0012\u0004\u0012\u00020\b`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00140\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R0\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b$\u0010*\"\u0004\b\f\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010.R*\u00103\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00100\u001a\u0004\b(\u00101\"\u0004\b\f\u00102¨\u00064"}, d2 = {"Lru/cyberity/cbr/core/analytics/b;", "", "<init>", "()V", "Lkotlin/G0;", "i", "d", "e", "Lru/cyberity/cbr/core/data/model/CBRTrackEvents;", "event", "", "immediately", "a", "(Lru/cyberity/cbr/core/data/model/CBRTrackEvents;Z)V", "Lru/cyberity/cbr/core/data/source/analythic/a;", "analyticRepository", "(Lru/cyberity/cbr/core/data/source/analythic/a;)V", "j", "Lru/cyberity/cbr/core/analytics/GlobalStatePayload;", "key", "", "value", "(Lru/cyberity/cbr/core/analytics/GlobalStatePayload;Ljava/lang/String;)V", "(Lru/cyberity/cbr/core/analytics/GlobalStatePayload;)V", "c", "Lru/cyberity/cbr/core/data/source/analythic/a;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "inMemoryAnalyticEvents", "Ljava/util/concurrent/ConcurrentHashMap;", "f", "Ljava/util/concurrent/ConcurrentHashMap;", "()Ljava/util/concurrent/ConcurrentHashMap;", "analyticState", "Lkotlinx/coroutines/T;", "g", "Lkotlinx/coroutines/T;", "AnalyticSendScope", "Lkotlin/Function1;", "h", "LY41/l;", "()LY41/l;", "(LY41/l;)V", "onSendCallback", "Ljava/util/Timer;", "Ljava/util/Timer;", "timer", "Z", "()Z", "(Z)V", "isEnabled", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static ru.cyberity.cbr.core.data.source.analythic.a analyticRepository;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Y41.l<? super CBRTrackEvents, G0> onSendCallback;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Timer timer;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f432519a = new b();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private static final ArrayList<CBRTrackEvents> inMemoryAnalyticEvents = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private static final ConcurrentHashMap<GlobalStatePayload, String> analyticState = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private static final T AnalyticSendScope = U.a(new C43315z0(Executors.newSingleThreadExecutor()));

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static boolean isEnabled = true;

    /* compiled from: Analytics.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.analytics.Analytics$flush$1", f = "Analytics.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432527a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f432527a;
            if (i12 == 0) {
                C42729a0.b(obj);
                if (!b.inMemoryAnalyticEvents.isEmpty()) {
                    ArrayList arrayList = new ArrayList(b.inMemoryAnalyticEvents);
                    b.inMemoryAnalyticEvents.clear();
                    ru.cyberity.cbr.core.data.source.analythic.a aVar = b.analyticRepository;
                    if (aVar != null) {
                        this.f432527a = 1;
                        obj = aVar.a(arrayList, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                ru.cyberity.log.cacher.d.f436072a.b();
                return G0.f406611a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            ru.cyberity.log.cacher.d.f436072a.b();
            return G0.f406611a;
        }
    }

    /* compiled from: Analytics.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ru/cyberity/cbr/core/analytics/b$b", "Ljava/util/TimerTask;", "Lkotlin/G0;", "run", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.analytics.b$b, reason: collision with other inner class name */
    public static final class C12429b extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            b.f432519a.e();
        }
    }

    /* compiled from: Analytics.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.analytics.Analytics$send$1", f = "Analytics.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432528a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CBRTrackEvents f432529b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f432530c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CBRTrackEvents cBRTrackEvents, boolean z12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f432529b = cBRTrackEvents;
            this.f432530c = z12;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new c(this.f432529b, this.f432530c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f432528a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            try {
                Y41.l<CBRTrackEvents, G0> lVarG = b.f432519a.g();
                if (lVarG != null) {
                    lVarG.invoke(this.f432529b);
                }
            } catch (Throwable unused) {
            }
            b.inMemoryAnalyticEvents.add(this.f432529b);
            if (b.inMemoryAnalyticEvents.size() >= 50 || this.f432530c) {
                b.f432519a.e();
            } else {
                b.f432519a.i();
            }
            return G0.f406611a;
        }
    }

    private b() {
    }

    private final void d() {
        Timer timer2 = timer;
        if (timer2 != null) {
            timer2.cancel();
        }
        timer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        C43259k.d(AnalyticSendScope, null, null, new a(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        if (timer != null) {
            d();
        }
        Timer timer2 = new Timer();
        timer2.scheduleAtFixedRate(new C12429b(), 5000L, 5000L);
        timer = timer2;
    }

    public final void c() {
        analyticState.clear();
    }

    @Y61.k
    public final ConcurrentHashMap<GlobalStatePayload, String> f() {
        return analyticState;
    }

    @Y61.l
    public final Y41.l<CBRTrackEvents, G0> g() {
        return onSendCallback;
    }

    public final void j() {
        onSendCallback = null;
        d();
    }

    public final void a(@Y61.l Y41.l<? super CBRTrackEvents, G0> lVar) {
        onSendCallback = lVar;
    }

    public final void a(boolean z12) {
        if (!z12) {
            isEnabled = true;
            f.a(0L, 1, null).a(SdkEvent.TrackingDisabled).a(P0.c()).a(true);
        }
        isEnabled = z12;
    }

    public final void a(@Y61.k CBRTrackEvents event, boolean immediately) {
        if (isEnabled || C43066x.q(event.getActivity(), SdkEvent.TrackingDisabled.getText(), false)) {
            C43259k.d(AnalyticSendScope, null, null, new c(event, immediately, null), 3);
        }
    }

    public final void a(@Y61.k ru.cyberity.cbr.core.data.source.analythic.a analyticRepository2) {
        analyticRepository = analyticRepository2;
    }

    public final void a(@Y61.k GlobalStatePayload key, @Y61.k String value) {
        analyticState.put(key, value);
    }

    public final void a(@Y61.k GlobalStatePayload key) {
        analyticState.remove(key);
    }
}
