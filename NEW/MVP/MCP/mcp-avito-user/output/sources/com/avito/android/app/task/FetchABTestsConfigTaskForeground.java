package com.avito.android.app.task;

import com.avito.android.ab_tests.C27653p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.error_reporting.app_state.C30365d;
import com.avito.android.util.V2;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import u3.C48777a;

/* compiled from: FetchABTestsConfigTask.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/app/task/FetchABTestsConfigTaskForeground;", "Lcom/avito/android/app/task/ApplicationForegroundStartupTask;", "Lcom/avito/android/ab_tests/p;", "task", "Lcom/avito/android/account/E;", "accountState", "Lcom/avito/android/error_reporting/app_state/d;", "appStateCollector", "Lcom/avito/android/util/R0;", "coroutineDispatchers", "<init>", "(Lcom/avito/android/ab_tests/p;Lcom/avito/android/account/E;Lcom/avito/android/error_reporting/app_state/d;Lcom/avito/android/util/R0;)V", "Lkotlin/G0;", "execute", "()V", "Lcom/avito/android/ab_tests/p;", "Lcom/avito/android/account/E;", "Lcom/avito/android/error_reporting/app_state/d;", "Lkotlinx/coroutines/T;", "coroutinesScope", "Lkotlinx/coroutines/T;", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FetchABTestsConfigTaskForeground implements ApplicationForegroundStartupTask {

    @Y61.k
    private final com.avito.android.account.E accountState;

    @Y61.k
    private final C30365d appStateCollector;

    @Y61.k
    private final kotlinx.coroutines.T coroutinesScope;

    @Y61.k
    private final C27653p task;

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f91428b;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.app.task.FetchABTestsConfigTaskForeground$a$a, reason: collision with other inner class name */
        public static final class C2691a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f91429b;

            /* compiled from: Emitters.kt */
            @kotlin.jvm.internal.s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.app.task.FetchABTestsConfigTaskForeground$execute$$inlined$filter$1$2", f = "FetchABTestsConfigTask.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.app.task.FetchABTestsConfigTaskForeground$a$a$a, reason: collision with other inner class name */
            public static final class C2692a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f91430q;

                /* renamed from: r, reason: collision with root package name */
                public int f91431r;

                public C2692a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f91430q = obj;
                    this.f91431r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C2691a.this.emit(null, this);
                }
            }

            public C2691a(InterfaceC43172j interfaceC43172j) {
                this.f91429b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.app.task.FetchABTestsConfigTaskForeground.a.C2691a.C2692a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.app.task.FetchABTestsConfigTaskForeground$a$a$a r0 = (com.avito.android.app.task.FetchABTestsConfigTaskForeground.a.C2691a.C2692a) r0
                    int r1 = r0.f91431r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f91431r = r1
                    goto L18
                L13:
                    com.avito.android.app.task.FetchABTestsConfigTaskForeground$a$a$a r0 = new com.avito.android.app.task.FetchABTestsConfigTaskForeground$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f91430q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f91431r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L48
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L48
                    r0.f91431r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f91429b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.app.task.FetchABTestsConfigTaskForeground.a.C2691a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i) {
            this.f91428b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Boolean> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f91428b).collect(new C2691a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
        }
    }

    /* compiled from: Merge.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.app.task.FetchABTestsConfigTaskForeground$execute$$inlined$flatMapLatest$1", f = "FetchABTestsConfigTask.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Map<String, ? extends C48777a>>, kotlin.G0, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f91433q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f91434r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f91435s;

        public b(Continuation continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super Map<String, ? extends C48777a>> interfaceC43172j, kotlin.G0 g02, Continuation<? super kotlin.G0> continuation) {
            b bVar = FetchABTestsConfigTaskForeground.this.new b(continuation);
            bVar.f91434r = interfaceC43172j;
            bVar.f91435s = g02;
            return bVar.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f91433q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f91434r;
                FetchABTestsConfigTaskForeground fetchABTestsConfigTaskForeground = FetchABTestsConfigTaskForeground.this;
                kotlinx.coroutines.flow.X x12 = new kotlinx.coroutines.flow.X(new C43137a0(fetchABTestsConfigTaskForeground.new e(null), fetchABTestsConfigTaskForeground.task.a()), fetchABTestsConfigTaskForeground.new f(null));
                this.f91433q = 1;
                if (C43175k.u(this, x12, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<kotlin.G0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f91437b;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f91438b;

            /* compiled from: Emitters.kt */
            @kotlin.jvm.internal.s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.app.task.FetchABTestsConfigTaskForeground$execute$$inlined$map$1$2", f = "FetchABTestsConfigTask.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.app.task.FetchABTestsConfigTaskForeground$c$a$a, reason: collision with other inner class name */
            public static final class C2693a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f91439q;

                /* renamed from: r, reason: collision with root package name */
                public int f91440r;

                public C2693a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f91439q = obj;
                    this.f91440r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f91438b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.app.task.FetchABTestsConfigTaskForeground.c.a.C2693a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.app.task.FetchABTestsConfigTaskForeground$c$a$a r0 = (com.avito.android.app.task.FetchABTestsConfigTaskForeground.c.a.C2693a) r0
                    int r1 = r0.f91440r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f91440r = r1
                    goto L18
                L13:
                    com.avito.android.app.task.FetchABTestsConfigTaskForeground$c$a$a r0 = new com.avito.android.app.task.FetchABTestsConfigTaskForeground$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f91439q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f91440r
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
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    r5.getClass()
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    r0.f91440r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f91438b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.app.task.FetchABTestsConfigTaskForeground.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(a aVar) {
            this.f91437b = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super kotlin.G0> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f91437b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
        }
    }

    /* compiled from: FetchABTestsConfigTask.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.app.task.FetchABTestsConfigTaskForeground$execute$3", f = "FetchABTestsConfigTask.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super kotlin.G0>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f91442q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f91443r;

        public d() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(2, continuation);
            dVar.f91443r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super kotlin.G0> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f91442q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f91443r;
                kotlin.G0 g02 = kotlin.G0.f406611a;
                this.f91442q = 1;
                if (interfaceC43172j.emit(g02, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FetchABTestsConfigTask.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "Lu3/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.app.task.FetchABTestsConfigTaskForeground$execute$4$1", f = "FetchABTestsConfigTask.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Map<String, ? extends C48777a>>, Continuation<? super kotlin.G0>, Object> {
        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return FetchABTestsConfigTaskForeground.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Map<String, ? extends C48777a>> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            FetchABTestsConfigTaskForeground.this.appStateCollector.a();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FetchABTestsConfigTask.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "Lu3/a;", "", "exception", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.app.task.FetchABTestsConfigTaskForeground$execute$4$2", f = "FetchABTestsConfigTask.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Map<String, ? extends C48777a>>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f91445q;

        public f(Continuation<? super f> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super Map<String, ? extends C48777a>> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            f fVar = FetchABTestsConfigTaskForeground.this.new f(continuation);
            fVar.f91445q = th2;
            return fVar.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            if (this.f91445q == null) {
                FetchABTestsConfigTaskForeground.this.appStateCollector.a();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FetchABTestsConfigTask.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lu3/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/util/Map;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.app.task.FetchABTestsConfigTaskForeground$execute$5", f = "FetchABTestsConfigTask.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<Map<String, ? extends C48777a>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f91447q;

        public g() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(2, continuation);
            gVar.f91447q = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(Map<String, ? extends C48777a> map, Continuation<? super kotlin.G0> continuation) {
            return ((g) create(map, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Map map = (Map) this.f91447q;
            V2.f318762a.c("FetchABTestsConfigTask", "Loaded AB Test config + " + map, null);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FetchABTestsConfigTask.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "Lu3/a;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.app.task.FetchABTestsConfigTaskForeground$execute$6", f = "FetchABTestsConfigTask.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Map<String, ? extends C48777a>>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f91448q;

        public h() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super Map<String, ? extends C48777a>> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            h hVar = new h(3, continuation);
            hVar.f91448q = th2;
            return hVar.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.a("FetchABTestsConfigTask", "Failed to load AB test config", new RuntimeException(this.f91448q));
            return kotlin.G0.f406611a;
        }
    }

    @Inject
    public FetchABTestsConfigTaskForeground(@Y61.k C27653p c27653p, @Y61.k com.avito.android.account.E e12, @Y61.k C30365d c30365d, @Y61.k com.avito.android.util.R0 r02) {
        this.task = c27653p;
        this.accountState = e12;
        this.appStateCollector = c30365d;
        this.coroutinesScope = kotlinx.coroutines.U.a(r02.a());
    }

    @Override // com.avito.android.app.task.ApplicationForegroundStartupTask
    public void execute() {
        C43175k.K(new C43152f0(new C43197r1(new g(2, null), C43175k.Y(new C43137a0(new d(2, null), new c(new a(kotlinx.coroutines.rx3.y.a(this.accountState.g())))), new b(null))), new h(3, null)), this.coroutinesScope);
    }
}
