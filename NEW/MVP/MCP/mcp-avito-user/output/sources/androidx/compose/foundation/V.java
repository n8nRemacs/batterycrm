package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C20444d1;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BasicTooltip.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class V implements PointerInputEventHandler {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f26872b;

    /* compiled from: BasicTooltip.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f26873q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f26874r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.input.pointer.K f26875s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y f26876t;

        /* compiled from: BasicTooltip.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", i = {0, 0, 1, 1}, l = {166, 169, 175}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "pass", "$this$awaitEachGesture", "pass"}, s = {"L$0", "L$1", "L$0", "L$1"})
        /* renamed from: androidx.compose.foundation.V$a$a, reason: collision with other inner class name */
        public static final class C1556a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public PointerEventPass f26877q;

            /* renamed from: r, reason: collision with root package name */
            public int f26878r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f26879s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.T f26880t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Y f26881u;

            /* compiled from: BasicTooltip.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.V$a$a$a, reason: collision with other inner class name */
            public static final class C1557a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f26882q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ Y f26883r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1557a(Y y12, Continuation<? super C1557a> continuation) {
                    super(2, continuation);
                    this.f26883r = y12;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new C1557a(this.f26883r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((C1557a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f26882q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        MutatePriority mutatePriority = MutatePriority.f26798c;
                        this.f26882q = 1;
                        if (((C20411b0) this.f26883r).a(mutatePriority, this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1556a(kotlinx.coroutines.T t12, Y y12, Continuation<? super C1556a> continuation) {
                super(2, continuation);
                this.f26880t = t12;
                this.f26881u = y12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                C1556a c1556a = new C1556a(this.f26880t, this.f26881u, continuation);
                c1556a.f26879s = obj;
                return c1556a;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
                return ((C1556a) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x009c A[LOOP:0: B:29:0x009a->B:30:0x009c, LOOP_END] */
            /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.List] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r7.f26878r
                    r2 = 3
                    r3 = 1
                    r4 = 2
                    if (r1 == 0) goto L32
                    if (r1 == r3) goto L28
                    if (r1 == r4) goto L1e
                    if (r1 != r2) goto L16
                    kotlin.C42729a0.b(r8)
                    goto L91
                L16:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1e:
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = r7.f26877q
                    java.lang.Object r3 = r7.f26879s
                    androidx.compose.ui.input.pointer.c r3 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r3
                    kotlin.C42729a0.b(r8)
                    goto L71
                L28:
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = r7.f26877q
                    java.lang.Object r3 = r7.f26879s
                    androidx.compose.ui.input.pointer.c r3 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r3
                    kotlin.C42729a0.b(r8)
                    goto L4b
                L32:
                    kotlin.C42729a0.b(r8)
                    java.lang.Object r8 = r7.f26879s
                    androidx.compose.ui.input.pointer.c r8 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r8
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.f40173b
                    r7.f26879s = r8
                    r7.f26877q = r1
                    r7.f26878r = r3
                    java.lang.Object r3 = androidx.compose.foundation.gestures.C20445d2.c(r8, r7, r3)
                    if (r3 != r0) goto L48
                    return r0
                L48:
                    r6 = r3
                    r3 = r8
                    r8 = r6
                L4b:
                    androidx.compose.ui.input.pointer.C r8 = (androidx.compose.ui.input.pointer.C) r8
                    int r8 = r8.f40124i
                    androidx.compose.ui.input.pointer.U$a r5 = androidx.compose.ui.input.pointer.U.f40189b
                    r5.getClass()
                    int r5 = androidx.compose.ui.input.pointer.U.f40190c
                    boolean r5 = androidx.compose.ui.input.pointer.U.a(r8, r5)
                    if (r5 != 0) goto L64
                    int r5 = androidx.compose.ui.input.pointer.U.f40192e
                    boolean r8 = androidx.compose.ui.input.pointer.U.a(r8, r5)
                    if (r8 == 0) goto La8
                L64:
                    r7.f26879s = r3
                    r7.f26877q = r1
                    r7.f26878r = r4
                    java.lang.Object r8 = androidx.compose.foundation.gestures.C20445d2.k(r3, r1, r7)
                    if (r8 != r0) goto L71
                    return r0
                L71:
                    androidx.compose.foundation.gestures.e1 r8 = (androidx.compose.foundation.gestures.AbstractC20448e1) r8
                    boolean r8 = r8 instanceof androidx.compose.foundation.gestures.AbstractC20448e1.c
                    if (r8 == 0) goto La8
                    androidx.compose.foundation.V$a$a$a r8 = new androidx.compose.foundation.V$a$a$a
                    androidx.compose.foundation.Y r4 = r7.f26881u
                    r5 = 0
                    r8.<init>(r4, r5)
                    kotlinx.coroutines.T r4 = r7.f26880t
                    kotlinx.coroutines.C43259k.d(r4, r5, r5, r8, r2)
                    r7.f26879s = r5
                    r7.f26877q = r5
                    r7.f26878r = r2
                    java.lang.Object r8 = r3.N1(r1, r7)
                    if (r8 != r0) goto L91
                    return r0
                L91:
                    androidx.compose.ui.input.pointer.s r8 = (androidx.compose.ui.input.pointer.C22340s) r8
                    java.lang.Object r8 = r8.f40278a
                    int r0 = r8.size()
                    r1 = 0
                L9a:
                    if (r1 >= r0) goto La8
                    java.lang.Object r2 = r8.get(r1)
                    androidx.compose.ui.input.pointer.C r2 = (androidx.compose.ui.input.pointer.C) r2
                    r2.a()
                    int r1 = r1 + 1
                    goto L9a
                La8:
                    kotlin.G0 r8 = kotlin.G0.f406611a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.V.a.C1556a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.input.pointer.K k12, Y y12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f26875s = k12;
            this.f26876t = y12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f26875s, this.f26876t, continuation);
            aVar.f26874r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f26873q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C1556a c1556a = new C1556a((kotlinx.coroutines.T) this.f26874r, this.f26876t, null);
                this.f26873q = 1;
                if (C20444d1.c(this.f26875s, c1556a, this) == coroutine_suspended) {
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

    public V(Y y12) {
        this.f26872b = y12;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
        Object objC = kotlinx.coroutines.U.c(new a(k12, this.f26872b, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
    }
}
