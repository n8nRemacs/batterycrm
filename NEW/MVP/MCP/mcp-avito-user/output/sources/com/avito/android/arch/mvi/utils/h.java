package com.avito.android.arch.mvi.utils;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.LinkedHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.flow.n2;

/* compiled from: FlowExt.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_mvi-flow_util-common"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: FlowExt.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"K", "V", "Lkotlinx/coroutines/flow/j;", "Lkotlin/Q;", "Lkotlinx/coroutines/flow/i;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.arch.mvi.utils.FlowExtKt$groupBy$1", f = "FlowExt.kt", i = {0}, l = {38}, m = "invokeSuspend", n = {"storage"}, s = {"L$0"})
    public static final class a<K, V> extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Q<? extends K, ? extends InterfaceC43160i<? extends V>>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f92036q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f92037r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<V> f92038s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.l<V, K> f92039t;

        /* compiled from: FlowExt.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"K", "V", "action", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.arch.mvi.utils.h$a$a, reason: collision with other inner class name */
        public static final class C2714a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedHashMap f92040b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Y41.l<V, K> f92041c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<Q<? extends K, ? extends InterfaceC43160i<? extends V>>> f92042d;

            /* compiled from: FlowExt.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.arch.mvi.utils.FlowExtKt$groupBy$1$1", f = "FlowExt.kt", i = {0, 0, 0}, l = {41, 44}, m = "emit", n = {"action", "$this$getOrPut$iv", "key$iv"}, s = {"L$0", "L$1", "L$2"})
            /* renamed from: com.avito.android.arch.mvi.utils.h$a$a$a, reason: collision with other inner class name */
            public static final class C2715a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public Object f92043q;

                /* renamed from: r, reason: collision with root package name */
                public LinkedHashMap f92044r;

                /* renamed from: s, reason: collision with root package name */
                public Object f92045s;

                /* renamed from: t, reason: collision with root package name */
                public C43108m f92046t;

                /* renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f92047u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ C2714a<T> f92048v;

                /* renamed from: w, reason: collision with root package name */
                public int f92049w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C2715a(C2714a<? super T> c2714a, Continuation<? super C2715a> continuation) {
                    super(continuation);
                    this.f92048v = c2714a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f92047u = obj;
                    this.f92049w |= BeduinInputModel.MIN_TEXT_VERSION;
                    return this.f92048v.emit(null, this);
                }
            }

            public C2714a(LinkedHashMap linkedHashMap, Y41.l lVar, InterfaceC43172j interfaceC43172j) {
                this.f92040b = linkedHashMap;
                this.f92041c = lVar;
                this.f92042d = interfaceC43172j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0093 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(V r11, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof com.avito.android.arch.mvi.utils.h.a.C2714a.C2715a
                    if (r0 == 0) goto L13
                    r0 = r12
                    com.avito.android.arch.mvi.utils.h$a$a$a r0 = (com.avito.android.arch.mvi.utils.h.a.C2714a.C2715a) r0
                    int r1 = r0.f92049w
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f92049w = r1
                    goto L18
                L13:
                    com.avito.android.arch.mvi.utils.h$a$a$a r0 = new com.avito.android.arch.mvi.utils.h$a$a$a
                    r0.<init>(r10, r12)
                L18:
                    java.lang.Object r12 = r0.f92047u
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f92049w
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L41
                    if (r2 == r4) goto L35
                    if (r2 != r3) goto L2d
                    kotlin.C42729a0.b(r12)
                    goto L94
                L2d:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L35:
                    kotlinx.coroutines.channels.m r11 = r0.f92046t
                    java.lang.Object r2 = r0.f92045s
                    java.util.LinkedHashMap r4 = r0.f92044r
                    java.lang.Object r6 = r0.f92043q
                    kotlin.C42729a0.b(r12)
                    goto L7c
                L41:
                    kotlin.C42729a0.b(r12)
                    Y41.l<V, K> r12 = r10.f92041c
                    java.lang.Object r2 = r12.invoke(r11)
                    java.util.LinkedHashMap r6 = r10.f92040b
                    java.lang.Object r7 = r6.get(r2)
                    if (r7 != 0) goto L81
                    r7 = 32
                    r8 = 6
                    kotlinx.coroutines.channels.m r7 = kotlinx.coroutines.channels.A.a(r7, r5, r5, r8)
                    java.lang.Object r12 = r12.invoke(r11)
                    kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.C43175k.m(r7)
                    kotlin.Q r9 = new kotlin.Q
                    r9.<init>(r12, r8)
                    r0.f92043q = r11
                    r0.f92044r = r6
                    r0.f92045s = r2
                    r0.f92046t = r7
                    r0.f92049w = r4
                    kotlinx.coroutines.flow.j<kotlin.Q<? extends K, ? extends kotlinx.coroutines.flow.i<? extends V>>> r12 = r10.f92042d
                    java.lang.Object r12 = r12.emit(r9, r0)
                    if (r12 != r1) goto L79
                    return r1
                L79:
                    r4 = r6
                    r6 = r11
                    r11 = r7
                L7c:
                    r4.put(r2, r11)
                    r7 = r11
                    r11 = r6
                L81:
                    kotlinx.coroutines.channels.M0 r7 = (kotlinx.coroutines.channels.M0) r7
                    r0.f92043q = r5
                    r0.f92044r = r5
                    r0.f92045s = r5
                    r0.f92046t = r5
                    r0.f92049w = r3
                    java.lang.Object r11 = r7.send(r11, r0)
                    if (r11 != r1) goto L94
                    return r1
                L94:
                    kotlin.G0 r11 = kotlin.G0.f406611a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.arch.mvi.utils.h.a.C2714a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.l lVar, Continuation continuation, InterfaceC43160i interfaceC43160i) {
            super(2, continuation);
            this.f92038s = interfaceC43160i;
            this.f92039t = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f92039t, continuation, this.f92038s);
            aVar.f92037r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super G0> continuation) {
            return ((a) create((InterfaceC43172j) obj, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[LOOP:0: B:18:0x0049->B:20:0x004f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[LOOP:1: B:26:0x0068->B:28:0x006e, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f92036q
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 != r3) goto L16
                java.lang.Object r0 = r7.f92037r
                java.util.Map r0 = (java.util.Map) r0
                kotlin.C42729a0.b(r8)     // Catch: java.lang.Throwable -> L14
                goto L3f
            L14:
                r8 = move-exception
                goto L5e
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f92037r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                kotlinx.coroutines.flow.i<V> r4 = r7.f92038s     // Catch: java.lang.Throwable -> L5c
                com.avito.android.arch.mvi.utils.h$a$a r5 = new com.avito.android.arch.mvi.utils.h$a$a     // Catch: java.lang.Throwable -> L5c
                Y41.l<V, K> r6 = r7.f92039t     // Catch: java.lang.Throwable -> L5c
                r5.<init>(r1, r6, r8)     // Catch: java.lang.Throwable -> L5c
                r7.f92037r = r1     // Catch: java.lang.Throwable -> L5c
                r7.f92036q = r3     // Catch: java.lang.Throwable -> L5c
                java.lang.Object r8 = r4.collect(r5, r7)     // Catch: java.lang.Throwable -> L5c
                if (r8 != r0) goto L3e
                return r0
            L3e:
                r0 = r1
            L3f:
                java.util.Collection r8 = r0.values()
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.Iterator r8 = r8.iterator()
            L49:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L59
                java.lang.Object r0 = r8.next()
                kotlinx.coroutines.channels.M0 r0 = (kotlinx.coroutines.channels.M0) r0
                r0.h(r2)
                goto L49
            L59:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            L5c:
                r8 = move-exception
                r0 = r1
            L5e:
                java.util.Collection r0 = r0.values()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L68:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L78
                java.lang.Object r1 = r0.next()
                kotlinx.coroutines.channels.M0 r1 = (kotlinx.coroutines.channels.M0) r1
                r1.h(r2)
                goto L68
            L78:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.arch.mvi.utils.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowExt.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.arch.mvi.utils.FlowExtKt$throttleFirst$1", f = "FlowExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b<T> extends SuspendLambda implements Y41.q<InterfaceC43172j<? super T>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ l0.h<N0> f92050q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.h<N0> hVar, Continuation<? super b> continuation) {
            super(3, continuation);
            this.f92050q = hVar;
        }

        @Override // Y41.q
        public final Object invoke(Object obj, Throwable th2, Continuation<? super G0> continuation) {
            return new b(this.f92050q, continuation).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            this.f92050q.f406842b.c(null);
            return G0.f406611a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowExt.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.arch.mvi.utils.FlowExtKt$throttleFirst$2$1", f = "FlowExt.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    public static final class c<T> extends SuspendLambda implements Y41.p<InterfaceC43172j<? super T>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f92051q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f92052r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ X f92053s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ l0.h<N0> f92054t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f92055u;

        /* compiled from: FlowExt.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.arch.mvi.utils.FlowExtKt$throttleFirst$2$1$1", f = "FlowExt.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f92056q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f92057r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ X f92058s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ l0.h<N0> f92059t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<T> f92060u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ long f92061v;

            /* compiled from: FlowExt.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.arch.mvi.utils.h$c$a$a, reason: collision with other inner class name */
            public static final class C2716a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l0.h<N0> f92062b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j<T> f92063c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ T f92064d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f92065e;

                /* compiled from: FlowExt.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "com.avito.android.arch.mvi.utils.FlowExtKt$throttleFirst$2$1$1$1$1", f = "FlowExt.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.avito.android.arch.mvi.utils.h$c$a$a$a, reason: collision with other inner class name */
                public static final class C2717a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                    /* renamed from: q, reason: collision with root package name */
                    public int f92066q;

                    /* renamed from: r, reason: collision with root package name */
                    public final /* synthetic */ long f92067r;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C2717a(long j12, Continuation<? super C2717a> continuation) {
                        super(2, continuation);
                        this.f92067r = j12;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.k
                    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                        return new C2717a(this.f92067r, continuation);
                    }

                    @Override // Y41.p
                    public final Object invoke(T t12, Continuation<? super G0> continuation) {
                        return ((C2717a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i12 = this.f92066q;
                        if (i12 == 0) {
                            C42729a0.b(obj);
                            this.f92066q = 1;
                            if (C43131e0.b(this.f92067r, this) == coroutine_suspended) {
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

                /* compiled from: FlowExt.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.arch.mvi.utils.FlowExtKt$throttleFirst$2$1$1$1", f = "FlowExt.kt", i = {0}, l = {136}, m = "emit", n = {"this"}, s = {"L$0"})
                /* renamed from: com.avito.android.arch.mvi.utils.h$c$a$a$b */
                public static final class b extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public Object f92068q;

                    /* renamed from: r, reason: collision with root package name */
                    public /* synthetic */ Object f92069r;

                    /* renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ C2716a<T> f92070s;

                    /* renamed from: t, reason: collision with root package name */
                    public int f92071t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public b(C2716a<? super T> c2716a, Continuation<? super b> continuation) {
                        super(continuation);
                        this.f92070s = c2716a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f92069r = obj;
                        this.f92071t |= BeduinInputModel.MIN_TEXT_VERSION;
                        return this.f92070s.emit(null, this);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public C2716a(l0.h<N0> hVar, InterfaceC43172j<? super T> interfaceC43172j, T t12, long j12) {
                    this.f92062b = hVar;
                    this.f92063c = interfaceC43172j;
                    this.f92064d = t12;
                    this.f92065e = j12;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                @Y61.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.avito.android.arch.mvi.utils.h.c.a.C2716a.b
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.arch.mvi.utils.h$c$a$a$b r0 = (com.avito.android.arch.mvi.utils.h.c.a.C2716a.b) r0
                        int r1 = r0.f92071t
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f92071t = r1
                        goto L18
                    L13:
                        com.avito.android.arch.mvi.utils.h$c$a$a$b r0 = new com.avito.android.arch.mvi.utils.h$c$a$a$b
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f92069r
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f92071t
                        r3 = 1
                        if (r2 == 0) goto L35
                        if (r2 != r3) goto L2d
                        java.lang.Object r5 = r0.f92068q
                        com.avito.android.arch.mvi.utils.h$c$a$a r5 = (com.avito.android.arch.mvi.utils.h.c.a.C2716a) r5
                        kotlin.C42729a0.b(r6)
                        goto L52
                    L2d:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L35:
                        kotlin.C42729a0.b(r6)
                        kotlin.jvm.internal.l0$h<kotlinx.coroutines.N0> r6 = r4.f92062b
                        T r6 = r6.f406842b
                        kotlinx.coroutines.N0 r6 = (kotlinx.coroutines.N0) r6
                        boolean r6 = r6.isActive()
                        if (r6 != 0) goto L65
                        r0.f92068q = r4
                        r0.f92071t = r3
                        kotlinx.coroutines.flow.j<T> r6 = r4.f92063c
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L51
                        return r1
                    L51:
                        r5 = r4
                    L52:
                        kotlin.jvm.internal.l0$h<kotlinx.coroutines.N0> r6 = r5.f92062b
                        com.avito.android.arch.mvi.utils.h$c$a$a$a r0 = new com.avito.android.arch.mvi.utils.h$c$a$a$a
                        long r1 = r5.f92065e
                        r3 = 0
                        r0.<init>(r1, r3)
                        r1 = 3
                        kotlinx.coroutines.T r5 = r5.f92064d
                        kotlinx.coroutines.N0 r5 = kotlinx.coroutines.C43259k.d(r5, r3, r3, r0, r1)
                        r6.f406842b = r5
                    L65:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.arch.mvi.utils.h.c.a.C2716a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(X x12, l0.h hVar, InterfaceC43172j interfaceC43172j, long j12, Continuation continuation) {
                super(2, continuation);
                this.f92058s = x12;
                this.f92059t = hVar;
                this.f92060u = interfaceC43172j;
                this.f92061v = j12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f92058s, this.f92059t, this.f92060u, this.f92061v, continuation);
                aVar.f92057r = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f92056q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C2716a c2716a = new C2716a(this.f92059t, this.f92060u, (T) this.f92057r, this.f92061v);
                    this.f92056q = 1;
                    if (this.f92058s.collect(c2716a, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(X x12, l0.h hVar, long j12, Continuation continuation) {
            super(2, continuation);
            this.f92053s = x12;
            this.f92054t = hVar;
            this.f92055u = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f92053s, this.f92054t, this.f92055u, continuation);
            cVar.f92052r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super G0> continuation) {
            return ((c) create((InterfaceC43172j) obj, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f92051q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a(this.f92053s, this.f92054t, (InterfaceC43172j) this.f92052r, this.f92055u, null);
                this.f92051q = 1;
                if (U.c(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: Add missing generic type declarations: [A] */
    /* compiled from: FlowExt.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "A", "I", "value", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d<A> extends N implements Y41.l<A, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<A, Boolean> f92072l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Y41.l<? super A, Boolean> lVar) {
            super(1);
            this.f92072l = lVar;
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return this.f92072l.invoke(obj);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, I] */
    /* compiled from: FlowExt.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"A", "I", "Lkotlin/Q;", "", "Lkotlinx/coroutines/flow/i;", "<name for destructuring parameter 0>", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.arch.mvi.utils.FlowExtKt$throttleFirstBy$2", f = "FlowExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e<A, I> extends SuspendLambda implements Y41.p<Q<? extends Boolean, ? extends InterfaceC43160i<? extends A>>, Continuation<? super InterfaceC43160i<? extends I>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f92073q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ long f92074r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ N f92075s;

        /* compiled from: FlowExt.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {"A", "I", "value", "Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.arch.mvi.utils.FlowExtKt$throttleFirstBy$2$1", f = "FlowExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<A, Continuation<? super InterfaceC43160i<? extends I>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f92076q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ N f92077r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Y41.l<? super A, ? extends InterfaceC43160i<? extends I>> lVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f92077r = (N) lVar;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f92077r, continuation);
                aVar.f92076q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(Object obj, Object obj2) {
                return ((a) create(obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                return this.f92077r.invoke(this.f92076q);
            }
        }

        /* compiled from: FlowExt.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {"A", "I", "value", "Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.arch.mvi.utils.FlowExtKt$throttleFirstBy$2$2", f = "FlowExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<A, Continuation<? super InterfaceC43160i<? extends I>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f92078q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ N f92079r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Y41.l<? super A, ? extends InterfaceC43160i<? extends I>> lVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f92079r = (N) lVar;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                b bVar = new b(this.f92079r, continuation);
                bVar.f92078q = obj;
                return bVar;
            }

            @Override // Y41.p
            public final Object invoke(Object obj, Object obj2) {
                return ((b) create(obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                return this.f92079r.invoke(this.f92078q);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(long j12, Y41.l<? super A, ? extends InterfaceC43160i<? extends I>> lVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f92074r = j12;
            this.f92075s = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f92074r, this.f92075s, continuation);
            eVar.f92073q = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Object obj2) {
            return ((e) create((Q) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Q q12 = (Q) this.f92073q;
            boolean zBooleanValue = ((Boolean) q12.f406619b).booleanValue();
            InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
            ?? r12 = this.f92075s;
            if (!zBooleanValue) {
                return C43175k.C(new b(r12, null), interfaceC43160i);
            }
            return C43175k.C(new a(r12, null), h.d(interfaceC43160i, this.f92074r));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowExt.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.arch.mvi.utils.FlowExtKt$throttleLatest$1", f = "FlowExt.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    public static final class f<T> extends SuspendLambda implements Y41.p<InterfaceC43172j<? super T>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f92080q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f92081r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<T> f92082s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f92083t;

        /* compiled from: FlowExt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<T> f92084b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f92085c;

            /* compiled from: FlowExt.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.arch.mvi.utils.FlowExtKt$throttleLatest$1$1", f = "FlowExt.kt", i = {0}, l = {163, 164}, m = "emit", n = {"this"}, s = {"L$0"})
            /* renamed from: com.avito.android.arch.mvi.utils.h$f$a$a, reason: collision with other inner class name */
            public static final class C2718a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public Object f92086q;

                /* renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f92087r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ a<T> f92088s;

                /* renamed from: t, reason: collision with root package name */
                public int f92089t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C2718a(a<? super T> aVar, Continuation<? super C2718a> continuation) {
                    super(continuation);
                    this.f92088s = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f92087r = obj;
                    this.f92089t |= BeduinInputModel.MIN_TEXT_VERSION;
                    return this.f92088s.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC43172j<? super T> interfaceC43172j, long j12) {
                this.f92084b = interfaceC43172j;
                this.f92085c = j12;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.avito.android.arch.mvi.utils.h.f.a.C2718a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.arch.mvi.utils.h$f$a$a r0 = (com.avito.android.arch.mvi.utils.h.f.a.C2718a) r0
                    int r1 = r0.f92089t
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f92089t = r1
                    goto L18
                L13:
                    com.avito.android.arch.mvi.utils.h$f$a$a r0 = new com.avito.android.arch.mvi.utils.h$f$a$a
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.f92087r
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f92089t
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.C42729a0.b(r7)
                    goto L5b
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f92086q
                    com.avito.android.arch.mvi.utils.h$f$a r6 = (com.avito.android.arch.mvi.utils.h.f.a) r6
                    kotlin.C42729a0.b(r7)
                    goto L4d
                L3c:
                    kotlin.C42729a0.b(r7)
                    r0.f92086q = r5
                    r0.f92089t = r4
                    kotlinx.coroutines.flow.j<T> r7 = r5.f92084b
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L4c
                    return r1
                L4c:
                    r6 = r5
                L4d:
                    long r6 = r6.f92085c
                    r2 = 0
                    r0.f92086q = r2
                    r0.f92089t = r3
                    java.lang.Object r6 = kotlinx.coroutines.C43131e0.c(r6, r0)
                    if (r6 != r1) goto L5b
                    return r1
                L5b:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.arch.mvi.utils.h.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j12, Continuation continuation, InterfaceC43160i interfaceC43160i) {
            super(2, continuation);
            this.f92082s = interfaceC43160i;
            this.f92083t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f92083t, continuation, this.f92082s);
            fVar.f92081r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super G0> continuation) {
            return ((f) create((InterfaceC43172j) obj, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f92080q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f92081r;
                InterfaceC43160i interfaceC43160iC = C43175k.c(this.f92082s, -1, 2);
                a aVar = new a(interfaceC43172j, this.f92083t);
                this.f92080q = 1;
                if (interfaceC43160iC.collect(aVar, this) == coroutine_suspended) {
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

    @Y61.k
    public static final <K, V> InterfaceC43160i<Q<K, InterfaceC43160i<V>>> a(@Y61.k InterfaceC43160i<? extends V> interfaceC43160i, @Y61.k Y41.l<? super V, ? extends K> lVar) {
        return C43175k.G(new a(lVar, null, interfaceC43160i));
    }

    @Y61.k
    public static final C43152f0 b(@Y61.k X x12) {
        return new C43152f0(new i(x12), new j(3, null));
    }

    @Y61.k
    public static final InterfaceC43160i c(@Y61.k n2 n2Var) {
        return C43175k.G(new k(n2Var, null, new l0.h()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, kotlinx.coroutines.P0] */
    @Y61.k
    public static final <T> InterfaceC43160i<T> d(@Y61.k InterfaceC43160i<? extends T> interfaceC43160i, long j12) {
        l0.h hVar = new l0.h();
        ?? r02 = (T) Q0.a();
        r02.q3();
        hVar.f406842b = r02;
        return C43175k.G(new c(new X(interfaceC43160i, new b(hVar, null)), hVar, j12, null));
    }

    @Y61.k
    public static final <A, I> InterfaceC43160i<I> e(@Y61.k InterfaceC43160i<? extends A> interfaceC43160i, @Y61.k Y41.l<? super A, Boolean> lVar, @Y61.k Y41.l<? super A, ? extends InterfaceC43160i<? extends I>> lVar2, long j12) {
        return C43175k.C(new e(j12, lVar2, null), a(interfaceC43160i, new d(lVar)));
    }

    @Y61.k
    public static final <T> InterfaceC43160i<T> f(@Y61.k InterfaceC43160i<? extends T> interfaceC43160i, long j12) {
        return C43175k.G(new f(j12, null, interfaceC43160i));
    }
}
