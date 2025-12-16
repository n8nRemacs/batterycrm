package com.avito.android.user_stats;

import Hq0.C14020b;
import Y41.p;
import Y61.k;
import Y61.l;
import cW0.InterfaceC27112a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.user_stats.extended_user_stats.StatsConfig;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesTabInternalAction;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabInternalAction;
import com.avito.android.user_stats.generated.api.api_1_sellers_private_statistics_general_dynamics_locations_post.Split;
import com.avito.android.util.InterfaceC35745a5;
import com.facebook.imageutils.JfifUtil;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: UserStatsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/c;", "Lcom/avito/android/user_stats/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.android.user_stats.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC27112a> f316955a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<VJ0.a> f316956b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f316957c;

    /* compiled from: UserStatsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_stats.UserStatsInteractorImpl$getCategoriesSplit$1", f = "UserStatsInteractor.kt", i = {0, 1}, l = {179, 184, 200, 204}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ConstructorTabInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f316958q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f316959r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ StatsConfig f316960s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ c f316961t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StatsConfig statsConfig, c cVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f316960s = statsConfig;
            this.f316961t = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f316960s, this.f316961t, continuation);
            aVar.f316959r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ConstructorTabInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:82:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01ad  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 463
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: UserStatsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_stats.UserStatsInteractorImpl$getDynamicsChart$1", f = "UserStatsInteractor.kt", i = {0, 1, 2, 2}, l = {282, 284, 299, 301, 304}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "response"}, s = {"L$0", "L$0", "L$0", "L$1"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super ConstructorTabInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public TypedResult.Success f316962q;

        /* renamed from: r, reason: collision with root package name */
        public int f316963r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f316964s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ StatsConfig f316965t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ c f316966u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StatsConfig statsConfig, c cVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f316965t = statsConfig;
            this.f316966u = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(this.f316965t, this.f316966u, continuation);
            bVar.f316964s = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ConstructorTabInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x016f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0170  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 399
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: UserStatsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_stats.UserStatsInteractorImpl$getDynamicsChartV2$1", f = "UserStatsInteractor.kt", i = {0, 1, 2, 2}, l = {245, 249, 268, 270, 273}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "response"}, s = {"L$0", "L$0", "L$0", "L$1"})
    /* renamed from: com.avito.android.user_stats.c$c, reason: collision with other inner class name */
    public static final class C9842c extends SuspendLambda implements p<InterfaceC43172j<? super ConstructorTabInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public TypedResult.Success f316967q;

        /* renamed from: r, reason: collision with root package name */
        public int f316968r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f316969s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ StatsConfig f316970t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ c f316971u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9842c(StatsConfig statsConfig, c cVar, Continuation<? super C9842c> continuation) {
            super(2, continuation);
            this.f316970t = statsConfig;
            this.f316971u = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C9842c c9842c = new C9842c(this.f316970t, this.f316971u, continuation);
            c9842c.f316969s = obj;
            return c9842c;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ConstructorTabInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C9842c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x01f0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01f1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 528
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.c.C9842c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: UserStatsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_stats.UserStatsInteractorImpl$getDynamicsItems$1", f = "UserStatsInteractor.kt", i = {0, 1}, l = {152, 154, 171, 172}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super ConstructorTabInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f316972q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f316973r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ StatsConfig f316974s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ c f316975t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(StatsConfig statsConfig, c cVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f316974s = statsConfig;
            this.f316975t = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            d dVar = new d(this.f316974s, this.f316975t, continuation);
            dVar.f316973r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ConstructorTabInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0144  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 359
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: UserStatsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_stats.UserStatsInteractorImpl$getExpensesStats$1", f = "UserStatsInteractor.kt", i = {0, 1}, l = {WebSocketProtocol.PAYLOAD_SHORT, 128, 141, 145}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super ExpensesTabInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f316976q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f316977r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ fW0.p f316979t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ StatsConfig f316980u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(fW0.p pVar, StatsConfig statsConfig, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f316979t = pVar;
            this.f316980u = statsConfig;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            e eVar = c.this.new e(this.f316979t, this.f316980u, continuation);
            eVar.f316977r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExpensesTabInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 278
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: UserStatsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_stats.UserStatsInteractorImpl$getLocationsSplit$1", f = "UserStatsInteractor.kt", i = {0, 1}, l = {214, JfifUtil.MARKER_SOS, 234, 238}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class f extends SuspendLambda implements p<InterfaceC43172j<? super ConstructorTabInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f316981q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f316982r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ StatsConfig f316983s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ c f316984t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Split f316985u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(StatsConfig statsConfig, c cVar, Split split, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f316983s = statsConfig;
            this.f316984t = cVar;
            this.f316985u = split;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            f fVar = new f(this.f316983s, this.f316984t, this.f316985u, continuation);
            fVar.f316982r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ConstructorTabInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:82:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01b9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 476
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public c(@k InterfaceC35745a5 interfaceC35745a5, @k h31.e eVar, @k h31.e eVar2) {
        this.f316955a = eVar;
        this.f316956b = eVar2;
        this.f316957c = interfaceC35745a5;
    }

    @Override // com.avito.android.user_stats.b
    @k
    public final W a(@l List list) {
        return new C42007e(new C14020b(19, this, list)).z(this.f316957c.a());
    }

    @Override // com.avito.android.user_stats.b
    @k
    public final InterfaceC43160i b(@l ArrayList arrayList) {
        return C43175k.G(new com.avito.android.user_stats.d(this, arrayList, null));
    }

    @Override // com.avito.android.user_stats.b
    @k
    public final InterfaceC43160i<ConstructorTabInternalAction> c(@l StatsConfig statsConfig) {
        return C43175k.G(new d(statsConfig, this, null));
    }

    @Override // com.avito.android.user_stats.b
    @k
    public final InterfaceC43160i<ConstructorTabInternalAction> d(@l StatsConfig statsConfig) {
        return C43175k.G(new b(statsConfig, this, null));
    }

    @Override // com.avito.android.user_stats.b
    @k
    public final InterfaceC43160i<ExpensesTabInternalAction> e(@k fW0.p pVar, @l StatsConfig statsConfig) {
        return C43175k.G(new e(pVar, statsConfig, null));
    }

    @Override // com.avito.android.user_stats.b
    @k
    public final InterfaceC43160i<ConstructorTabInternalAction> f(@l StatsConfig statsConfig) {
        return C43175k.G(new a(statsConfig, this, null));
    }

    @Override // com.avito.android.user_stats.b
    @k
    public final W g(@k fW0.p pVar) {
        return new C42007e(new C14020b(20, this, pVar)).z(this.f316957c.a());
    }

    @Override // com.avito.android.user_stats.b
    @k
    public final InterfaceC43160i<ConstructorTabInternalAction> h(@l StatsConfig statsConfig) {
        return C43175k.G(new C9842c(statsConfig, this, null));
    }

    @Override // com.avito.android.user_stats.b
    @k
    public final InterfaceC43160i<ConstructorTabInternalAction> i(@l StatsConfig statsConfig, @k Split split) {
        return C43175k.G(new f(statsConfig, this, split, null));
    }
}
