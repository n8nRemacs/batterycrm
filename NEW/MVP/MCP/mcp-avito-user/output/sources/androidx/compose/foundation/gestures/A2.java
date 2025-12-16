package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.AbstractC20493p2;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: Transformable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class A2 implements PointerInputEventHandler {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f27165b;

    /* compiled from: Transformable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1", f = "Transformable.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27166q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27167r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.input.pointer.K f27168s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ z2 f27169t;

        /* compiled from: Transformable.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1", f = "Transformable.kt", i = {0, 0, 1}, l = {175, 178}, m = "invokeSuspend", n = {"$this$launch", "event", "$this$launch"}, s = {"L$0", "L$1", "L$0"})
        /* renamed from: androidx.compose.foundation.gestures.A2$a$a, reason: collision with other inner class name */
        public static final class C1567a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public l0.h f27170q;

            /* renamed from: r, reason: collision with root package name */
            public l0.h f27171r;

            /* renamed from: s, reason: collision with root package name */
            public int f27172s;

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f27173t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ z2 f27174u;

            /* compiled from: Transformable.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/s2;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/s2;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1", f = "Transformable.kt", i = {0}, l = {187}, m = "invokeSuspend", n = {"$this$transform"}, s = {"L$0"})
            /* renamed from: androidx.compose.foundation.gestures.A2$a$a$a, reason: collision with other inner class name */
            public static final class C1568a extends SuspendLambda implements Y41.p<s2, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public l0.h f27175q;

                /* renamed from: r, reason: collision with root package name */
                public int f27176r;

                /* renamed from: s, reason: collision with root package name */
                public /* synthetic */ Object f27177s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ l0.h<AbstractC20493p2> f27178t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ z2 f27179u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1568a(l0.h<AbstractC20493p2> hVar, z2 z2Var, Continuation<? super C1568a> continuation) {
                    super(2, continuation);
                    this.f27178t = hVar;
                    this.f27179u = z2Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    C1568a c1568a = new C1568a(this.f27178t, this.f27179u, continuation);
                    c1568a.f27177s = obj;
                    return c1568a;
                }

                @Override // Y41.p
                public final Object invoke(s2 s2Var, Continuation<? super kotlin.G0> continuation) {
                    return ((C1568a) create(s2Var, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0046 -> B:19:0x0049). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
                    /*
                        r6 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r6.f27176r
                        r2 = 1
                        if (r1 == 0) goto L1d
                        if (r1 != r2) goto L15
                        kotlin.jvm.internal.l0$h r1 = r6.f27175q
                        java.lang.Object r3 = r6.f27177s
                        androidx.compose.foundation.gestures.s2 r3 = (androidx.compose.foundation.gestures.s2) r3
                        kotlin.C42729a0.b(r7)
                        goto L49
                    L15:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1d:
                        kotlin.C42729a0.b(r7)
                        java.lang.Object r7 = r6.f27177s
                        androidx.compose.foundation.gestures.s2 r7 = (androidx.compose.foundation.gestures.s2) r7
                        r3 = r7
                    L25:
                        kotlin.jvm.internal.l0$h<androidx.compose.foundation.gestures.p2> r1 = r6.f27178t
                        T r7 = r1.f406842b
                        boolean r4 = r7 instanceof androidx.compose.foundation.gestures.AbstractC20493p2.c
                        if (r4 != 0) goto L50
                        boolean r4 = r7 instanceof androidx.compose.foundation.gestures.AbstractC20493p2.a
                        r5 = 0
                        if (r4 == 0) goto L35
                        androidx.compose.foundation.gestures.p2$a r7 = (androidx.compose.foundation.gestures.AbstractC20493p2.a) r7
                        goto L36
                    L35:
                        r7 = r5
                    L36:
                        if (r7 != 0) goto L4c
                        androidx.compose.foundation.gestures.z2 r7 = r6.f27179u
                        kotlinx.coroutines.channels.m r7 = r7.f28103s
                        r6.f27177s = r3
                        r6.f27175q = r1
                        r6.f27176r = r2
                        java.lang.Object r7 = r7.M(r6)
                        if (r7 != r0) goto L49
                        return r0
                    L49:
                        r1.f406842b = r7
                        goto L25
                    L4c:
                        r3.a()
                        throw r5
                    L50:
                        kotlin.G0 r7 = kotlin.G0.f406611a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.A2.a.C1567a.C1568a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1567a(z2 z2Var, Continuation<? super C1567a> continuation) {
                super(2, continuation);
                this.f27174u = z2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                C1567a c1567a = new C1567a(this.f27174u, continuation);
                c1567a.f27173t = obj;
                return c1567a;
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((C1567a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r7.f27172s
                    androidx.compose.foundation.gestures.z2 r2 = r7.f27174u
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r4) goto L20
                    if (r1 != r3) goto L18
                    java.lang.Object r1 = r7.f27173t
                    kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
                    kotlin.C42729a0.b(r8)     // Catch: java.util.concurrent.CancellationException -> L34
                    goto L34
                L18:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L20:
                    kotlin.jvm.internal.l0$h r1 = r7.f27171r
                    kotlin.jvm.internal.l0$h r5 = r7.f27170q
                    java.lang.Object r6 = r7.f27173t
                    kotlinx.coroutines.T r6 = (kotlinx.coroutines.T) r6
                    kotlin.C42729a0.b(r8)
                    goto L54
                L2c:
                    kotlin.C42729a0.b(r8)
                    java.lang.Object r8 = r7.f27173t
                    r1 = r8
                    kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
                L34:
                    boolean r8 = kotlinx.coroutines.U.e(r1)
                    if (r8 == 0) goto L72
                    kotlin.jvm.internal.l0$h r8 = new kotlin.jvm.internal.l0$h
                    r8.<init>()
                    kotlinx.coroutines.channels.m r5 = r2.f28103s
                    r7.f27173t = r1
                    r7.f27170q = r8
                    r7.f27171r = r8
                    r7.f27172s = r4
                    java.lang.Object r5 = r5.M(r7)
                    if (r5 != r0) goto L50
                    return r0
                L50:
                    r6 = r1
                    r1 = r8
                    r8 = r5
                    r5 = r1
                L54:
                    r1.f406842b = r8
                    T r8 = r5.f406842b
                    boolean r8 = r8 instanceof androidx.compose.foundation.gestures.AbstractC20493p2.b
                    if (r8 != 0) goto L5e
                L5c:
                    r1 = r6
                    goto L34
                L5e:
                    r2.getClass()     // Catch: java.util.concurrent.CancellationException -> L5c
                    androidx.compose.foundation.MutatePriority r8 = androidx.compose.foundation.MutatePriority.f26797b     // Catch: java.util.concurrent.CancellationException -> L5c
                    androidx.compose.foundation.gestures.A2$a$a$a r8 = new androidx.compose.foundation.gestures.A2$a$a$a     // Catch: java.util.concurrent.CancellationException -> L5c
                    r1 = 0
                    r8.<init>(r5, r2, r1)     // Catch: java.util.concurrent.CancellationException -> L5c
                    r7.f27173t = r6     // Catch: java.util.concurrent.CancellationException -> L5c
                    r7.f27170q = r1     // Catch: java.util.concurrent.CancellationException -> L5c
                    r7.f27171r = r1     // Catch: java.util.concurrent.CancellationException -> L5c
                    r7.f27172s = r3     // Catch: java.util.concurrent.CancellationException -> L5c
                    throw r1
                L72:
                    kotlin.G0 r8 = kotlin.G0.f406611a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.A2.a.C1567a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: Transformable.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2", f = "Transformable.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f27180q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f27181r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ z2 f27182s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.T f27183t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(z2 z2Var, kotlinx.coroutines.T t12, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f27182s = z2Var;
                this.f27183t = t12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f27182s, this.f27183t, continuation);
                bVar.f27181r = obj;
                return bVar;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
                return ((b) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f27180q;
                z2 z2Var = this.f27182s;
                try {
                    try {
                        if (i12 == 0) {
                            C42729a0.b(obj);
                            InterfaceC22325c interfaceC22325c = (InterfaceC22325c) this.f27181r;
                            z2Var.getClass();
                            C43108m c43108m = z2Var.f28103s;
                            Y41.l<l0.g, Boolean> lVar = z2Var.f28102r;
                            this.f27180q = 1;
                            if (y2.b(interfaceC22325c, c43108m, lVar, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C42729a0.b(obj);
                        }
                    } catch (CancellationException e12) {
                        if (!kotlinx.coroutines.U.e(this.f27183t)) {
                            throw e12;
                        }
                    }
                    return kotlin.G0.f406611a;
                } finally {
                    z2Var.f28103s.w(AbstractC20493p2.c.f27913a);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.input.pointer.K k12, z2 z2Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f27168s = k12;
            this.f27169t = z2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f27168s, this.f27169t, continuation);
            aVar.f27167r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27166q;
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f27167r;
                CoroutineStart coroutineStart = CoroutineStart.f410683e;
                z2 z2Var = this.f27169t;
                C43259k.d(t12, null, coroutineStart, new C1567a(z2Var, null), 1);
                b bVar = new b(z2Var, t12, null);
                this.f27166q = 1;
                if (C20444d1.c(this.f27168s, bVar, this) == coroutine_suspended) {
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

    public A2(z2 z2Var) {
        this.f27165b = z2Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
        this.f27165b.getClass();
        return kotlin.G0.f406611a;
    }
}
