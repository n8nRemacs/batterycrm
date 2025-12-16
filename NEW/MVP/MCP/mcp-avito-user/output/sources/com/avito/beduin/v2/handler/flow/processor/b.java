package com.avito.beduin.v2.handler.flow.processor;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.exception.BeduinExceptionType;
import com.avito.beduin.v2.engine.exception.EngineBeduinException;
import com.avito.beduin.v2.engine.n;
import com.avito.beduin.v2.handler.flow.j;
import com.avito.beduin.v2.handler.flow.m;
import com.avito.beduin.v2.handler.flow.processor.a;
import com.avito.beduin.v2.logger.LogLevel;
import eU0.AbstractC40054c;
import eU0.C40052a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.AbstractC43136a;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.F0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: InteractionsProcessor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/handler/flow/processor/b;", "Lkotlinx/coroutines/flow/a;", "Lcom/avito/beduin/v2/handler/flow/processor/a;", "a", "b", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends AbstractC43136a<com.avito.beduin.v2.handler.flow.processor.a> {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f337171q = 0;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.handler.flow.f f337172d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC36274k f337173e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f337174f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC42726C f337175g = C42727D.c(new c());

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC42726C f337176h = C42727D.c(new i());

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC42726C f337177i = C42727D.c(new g());

    /* renamed from: j, reason: collision with root package name */
    @k
    public final LinkedHashMap f337178j = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    @k
    public final LinkedHashMap f337179k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final e2 f337180l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final e2 f337181m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final e2 f337182n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final kotlinx.coroutines.sync.d f337183o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final InterfaceC43160i<dU0.f> f337184p;

    /* compiled from: InteractionsProcessor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/beduin/v2/handler/flow/processor/b$a;", "", "<init>", "()V", "", "GROUP_CHANNEL_CAPACITY", "I", "", "TAG", "Ljava/lang/String;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: InteractionsProcessor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/handler/flow/processor/b$b;", "", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.handler.flow.processor.b$b, reason: collision with other inner class name */
    public interface InterfaceC10445b {
        @l
        com.avito.beduin.v2.handler.flow.processor.a a(@k com.avito.beduin.v2.handler.flow.processor.a aVar);
    }

    /* compiled from: InteractionsProcessor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/beduin/v2/handler/flow/b;", "invoke", "()Lcom/avito/beduin/v2/handler/flow/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<com.avito.beduin.v2.handler.flow.b> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.beduin.v2.handler.flow.b invoke() {
            return new com.avito.beduin.v2.handler.flow.b(b.this.f337172d);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<a.b> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2 f337186b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f337187b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.beduin.v2.handler.flow.processor.InteractionsProcessor$collectSafely$$inlined$map$1$2", f = "InteractionsProcessor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.beduin.v2.handler.flow.processor.b$d$a$a, reason: collision with other inner class name */
            public static final class C10446a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f337188q;

                /* renamed from: r, reason: collision with root package name */
                public int f337189r;

                public C10446a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f337188q = obj;
                    this.f337189r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f337187b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.beduin.v2.handler.flow.processor.b.d.a.C10446a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.beduin.v2.handler.flow.processor.b$d$a$a r0 = (com.avito.beduin.v2.handler.flow.processor.b.d.a.C10446a) r0
                    int r1 = r0.f337189r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f337189r = r1
                    goto L18
                L13:
                    com.avito.beduin.v2.handler.flow.processor.b$d$a$a r0 = new com.avito.beduin.v2.handler.flow.processor.b$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f337188q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f337189r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L46
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.beduin.v2.handler.flow.m r5 = (com.avito.beduin.v2.handler.flow.m) r5
                    com.avito.beduin.v2.handler.flow.processor.a$b r6 = new com.avito.beduin.v2.handler.flow.processor.a$b
                    r6.<init>(r5)
                    r0.f337189r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f337187b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.handler.flow.processor.b.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(e2 e2Var) {
            this.f337186b = e2Var;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super a.b> interfaceC43172j, @k Continuation continuation) throws Throwable {
            a aVar = new a(interfaceC43172j);
            e2 e2Var = this.f337186b;
            e2Var.getClass();
            Object objG = e2.g(e2Var, aVar, continuation);
            return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements InterfaceC43160i<a.C10444a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f337191b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f337192b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.beduin.v2.handler.flow.processor.InteractionsProcessor$collectSafely$$inlined$map$2$2", f = "InteractionsProcessor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.beduin.v2.handler.flow.processor.b$e$a$a, reason: collision with other inner class name */
            public static final class C10447a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f337193q;

                /* renamed from: r, reason: collision with root package name */
                public int f337194r;

                public C10447a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f337193q = obj;
                    this.f337194r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f337192b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.beduin.v2.handler.flow.processor.b.e.a.C10447a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.beduin.v2.handler.flow.processor.b$e$a$a r0 = (com.avito.beduin.v2.handler.flow.processor.b.e.a.C10447a) r0
                    int r1 = r0.f337194r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f337194r = r1
                    goto L18
                L13:
                    com.avito.beduin.v2.handler.flow.processor.b$e$a$a r0 = new com.avito.beduin.v2.handler.flow.processor.b$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f337193q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f337194r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L46
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    dU0.f r5 = (dU0.f) r5
                    com.avito.beduin.v2.handler.flow.processor.a$a r6 = new com.avito.beduin.v2.handler.flow.processor.a$a
                    r6.<init>(r5)
                    r0.f337194r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f337192b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.handler.flow.processor.b.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public e(InterfaceC43160i interfaceC43160i) {
            this.f337191b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super a.C10444a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f337191b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: InteractionsProcessor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/beduin/v2/handler/flow/processor/a;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.beduin.v2.handler.flow.processor.InteractionsProcessor$collectSafely$4", f = "InteractionsProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements q<InterfaceC43172j<? super com.avito.beduin.v2.handler.flow.processor.a>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f337196q;

        public f() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super com.avito.beduin.v2.handler.flow.processor.a> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            f fVar = new f(3, continuation);
            fVar.f337196q = th2;
            return fVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f337196q;
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (1 >= RU0.b.f14469c) {
                RU0.c cVar = RU0.b.f14468b;
                String strS = AK.c.s(new StringBuilder(), RU0.b.f14470d, ":InteractionsProcessor");
                StringBuilder sb2 = new StringBuilder("processor is disposed: ");
                sb2.append(th2 != null ? th2.getMessage() : null);
                cVar.d(strS, sb2.toString());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InteractionsProcessor.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/beduin/v2/handler/flow/j;", "invoke", "()Lcom/avito/beduin/v2/handler/flow/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<j> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final j invoke() throws EngineBeduinException.UnregisteredInteractionHandlerException {
            Object next;
            b bVar = b.this;
            Iterator<T> it = bVar.f337172d.f337162a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((j) next) instanceof com.avito.beduin.v2.handler.flow.e) {
                    break;
                }
            }
            j jVar = (j) next;
            if (jVar != null) {
                return jVar;
            }
            EngineBeduinException.UnregisteredInteractionHandlerException unregisteredInteractionHandlerException = new EngineBeduinException.UnregisteredInteractionHandlerException(BeduinExceptionType.f336707e, "InteractionException", "InteractionHandler for \"InteractionException\" isn't registered in EngineContext", null, null);
            com.avito.beduin.v2.engine.utils.e.b(unregisteredInteractionHandlerException, "InteractionsProcessor", null);
            bVar.f337173e.y(unregisteredInteractionHandlerException);
            throw unregisteredInteractionHandlerException;
        }
    }

    /* compiled from: InteractionsProcessor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022 \u0010\u0004\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "LeU0/a;", "Lkotlinx/coroutines/flow/i;", "LdU0/f;", "<name for destructuring parameter 0>", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.beduin.v2.handler.flow.processor.InteractionsProcessor$platformInteractions$1", f = "InteractionsProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements p<Q<? extends C40052a, ? extends InterfaceC43160i<? extends InterfaceC43160i<? extends dU0.f>>>, Continuation<? super InterfaceC43160i<? extends dU0.f>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f337198q;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            h hVar = b.this.new h(continuation);
            hVar.f337198q = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(Q<? extends C40052a, ? extends InterfaceC43160i<? extends InterfaceC43160i<? extends dU0.f>>> q12, Continuation<? super InterfaceC43160i<? extends dU0.f>> continuation) {
            return ((h) create(q12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Q q12 = (Q) this.f337198q;
            C40052a c40052a = (C40052a) q12.f406619b;
            InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
            AbstractC40054c abstractC40054c = c40052a != null ? c40052a.f395223c : null;
            boolean z12 = abstractC40054c instanceof AbstractC40054c.b;
            b bVar = b.this;
            if (z12) {
                int i12 = b.f337171q;
                bVar.getClass();
                return C43175k.E(new C43197r1(new com.avito.beduin.v2.handler.flow.processor.e(c40052a, null), C43175k.n(new C43197r1(new com.avito.beduin.v2.handler.flow.processor.d(c40052a, null), interfaceC43160i), ((AbstractC40054c.b) abstractC40054c).f395226a)), F0.f411136a);
            }
            if (abstractC40054c instanceof AbstractC40054c.a) {
                int i13 = b.f337171q;
                bVar.getClass();
                return C43175k.B(new com.avito.beduin.v2.handler.flow.processor.c(bVar, c40052a, null), interfaceC43160i);
            }
            if (!(abstractC40054c instanceof AbstractC40054c.C11086c) && abstractC40054c != null) {
                throw new NoWhenBranchMatchedException();
            }
            int i14 = b.f337171q;
            bVar.getClass();
            return C43175k.E(interfaceC43160i, F0.f411136a);
        }
    }

    /* compiled from: InteractionsProcessor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/beduin/v2/handler/flow/d;", "invoke", "()Lcom/avito/beduin/v2/handler/flow/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.beduin.v2.handler.flow.d> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.beduin.v2.handler.flow.d invoke() {
            return new com.avito.beduin.v2.handler.flow.d(b.this.f337172d);
        }
    }

    static {
        new a(null);
    }

    public b(@k com.avito.beduin.v2.handler.flow.f fVar, @k InterfaceC36238a interfaceC36238a, @k InterfaceC36274k interfaceC36274k, boolean z12) {
        this.f337172d = fVar;
        this.f337173e = interfaceC36274k;
        this.f337174f = z12;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f337179k = linkedHashMap;
        e2 e2VarB = f2.b(1, 0, null, 6);
        this.f337180l = e2VarB;
        e2 e2VarB2 = f2.b(1, 0, null, 6);
        this.f337181m = e2VarB2;
        this.f337182n = f2.b(1, 0, null, 6);
        this.f337183o = new kotlinx.coroutines.sync.d();
        this.f337184p = C43175k.G(new com.avito.beduin.v2.handler.flow.processor.g(C43175k.N(e2VarB, C43175k.C(new h(null), C43175k.G(new com.avito.beduin.v2.handler.flow.processor.f(e2VarB2, linkedHashMap, null)))), this, interfaceC36238a, null));
    }

    @l
    public final Object a(@k dU0.f fVar, @k ContinuationImpl continuationImpl) {
        if (((com.avito.beduin.v2.handler.flow.b) this.f337175g.getValue()).f337160b.f337162a.get(fVar.f393890a) instanceof com.avito.beduin.v2.handler.flow.a) {
            Object objEmit = this.f337180l.emit(fVar, continuationImpl);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
        }
        Object objEmit2 = this.f337181m.emit(new Q(fVar.f393892c, new C43210w(fVar)), continuationImpl);
        return objEmit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit2 : G0.f406611a;
    }

    public final void b(@k InterfaceC36238a interfaceC36238a, @k m mVar) {
        n nVar = mVar.f337166a;
        if (!this.f337174f) {
            interfaceC36238a.e(nVar);
            return;
        }
        RU0.b.f14467a.f("InteractionsProcessor", "consume state; unlock mutex");
        interfaceC36238a.e(nVar);
        try {
            this.f337183o.d(null);
        } catch (IllegalStateException e12) {
            RU0.b bVar = RU0.b.f14467a;
            IllegalStateException illegalStateException = new IllegalStateException(e12.getMessage());
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (4 >= RU0.b.f14469c) {
                RU0.c cVar = RU0.b.f14468b;
                String strS = AK.c.s(new StringBuilder(), RU0.b.f14470d, ":InteractionsProcessor");
                String message = e12.getMessage();
                if (message == null) {
                    message = "Failed to unlock mutex";
                }
                cVar.e(strS, message, illegalStateException);
            }
        }
    }

    @Override // kotlinx.coroutines.flow.AbstractC43136a
    @l
    public final Object collectSafely(@k InterfaceC43172j<? super com.avito.beduin.v2.handler.flow.processor.a> interfaceC43172j, @k Continuation<? super G0> continuation) throws Throwable {
        Object objCollect = new X(C43175k.N(new d(this.f337182n), new e(this.f337184p)), new f(3, null)).collect(interfaceC43172j, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
