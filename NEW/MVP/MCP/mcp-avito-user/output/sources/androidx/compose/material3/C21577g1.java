package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C20444d1;
import androidx.compose.foundation.gestures.C20445d2;
import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: BasicTooltip.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/K;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$1", f = "BasicTooltip.android.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21577g1 extends SuspendLambda implements Y41.p<androidx.compose.ui.input.pointer.K, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f36359q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f36360r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Q0 f36361s;

    /* compiled from: BasicTooltip.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$1$1", f = "BasicTooltip.android.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.g1$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f36362q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f36363r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.input.pointer.K f36364s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Q0 f36365t;

        /* compiled from: BasicTooltip.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$1$1$1", f = "BasicTooltip.android.kt", i = {0, 0, 0, 1, 1}, l = {162, 168, 176}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "pass", "longPressTimeout", "$this$awaitEachGesture", "pass"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1"})
        /* renamed from: androidx.compose.material3.g1$a$a, reason: collision with other inner class name */
        public static final class C1643a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public PointerEventPass f36366q;

            /* renamed from: r, reason: collision with root package name */
            public long f36367r;

            /* renamed from: s, reason: collision with root package name */
            public int f36368s;

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f36369t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.T f36370u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Q0 f36371v;

            /* compiled from: BasicTooltip.android.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/input/pointer/C;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)Landroidx/compose/ui/input/pointer/C;"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$1$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.g1$a$a$a, reason: collision with other inner class name */
            public static final class C1644a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super androidx.compose.ui.input.pointer.C>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f36372q;

                /* renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f36373r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ PointerEventPass f36374s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1644a(PointerEventPass pointerEventPass, Continuation<? super C1644a> continuation) {
                    super(2, continuation);
                    this.f36374s = pointerEventPass;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    C1644a c1644a = new C1644a(this.f36374s, continuation);
                    c1644a.f36373r = obj;
                    return c1644a;
                }

                @Override // Y41.p
                public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super androidx.compose.ui.input.pointer.C> continuation) {
                    return ((C1644a) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f36372q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        InterfaceC22325c interfaceC22325c = (InterfaceC22325c) this.f36373r;
                        this.f36372q = 1;
                        obj = C20445d2.l(interfaceC22325c, this.f36374s, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return obj;
                }
            }

            /* compiled from: BasicTooltip.android.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$1$1$1$2", f = "BasicTooltip.android.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.g1$a$a$b */
            public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f36375q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ Q0 f36376r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Q0 q02, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f36376r = q02;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f36376r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f36375q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        MutatePriority mutatePriority = MutatePriority.f26798c;
                        this.f36375q = 1;
                        if (this.f36376r.a(mutatePriority, this) == coroutine_suspended) {
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
            public C1643a(kotlinx.coroutines.T t12, Q0 q02, Continuation<? super C1643a> continuation) {
                super(2, continuation);
                this.f36370u = t12;
                this.f36371v = q02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C1643a c1643a = new C1643a(this.f36370u, this.f36371v, continuation);
                c1643a.f36369t = obj;
                return c1643a;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
                return ((C1643a) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.input.pointer.PointerEventPass] */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v8 */
            /* JADX WARN: Type inference failed for: r4v0 */
            /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.input.pointer.c] */
            /* JADX WARN: Type inference failed for: r4v10 */
            /* JADX WARN: Type inference failed for: r4v11 */
            /* JADX WARN: Type inference failed for: r4v5 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                long jC2;
                InterfaceC22325c interfaceC22325c;
                PointerEventPass pointerEventPass;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ?? r12 = this.f36368s;
                ?? r42 = 1;
                try {
                } catch (PointerEventTimeoutCancellationException unused) {
                    C43259k.d(this.f36370u, null, null, new b(this.f36371v, null), 3);
                    this.f36369t = null;
                    this.f36366q = null;
                    this.f36368s = 3;
                    obj = r42.N1(r12, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (r12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC22325c interfaceC22325c2 = (InterfaceC22325c) this.f36369t;
                    jC2 = interfaceC22325c2.getViewConfiguration().c();
                    PointerEventPass pointerEventPass2 = PointerEventPass.f40173b;
                    this.f36369t = interfaceC22325c2;
                    this.f36366q = pointerEventPass2;
                    this.f36367r = jC2;
                    this.f36368s = 1;
                    Object objC = C20445d2.c(interfaceC22325c2, this, 1);
                    if (objC == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    interfaceC22325c = interfaceC22325c2;
                    obj = objC;
                    pointerEventPass = pointerEventPass2;
                } else {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            PointerEventPass pointerEventPass3 = this.f36366q;
                            InterfaceC22325c interfaceC22325c3 = (InterfaceC22325c) this.f36369t;
                            C42729a0.b(obj);
                            r12 = pointerEventPass3;
                            r42 = interfaceC22325c3;
                            return kotlin.G0.f406611a;
                        }
                        if (r12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                        ?? r112 = ((C22340s) obj).f40278a;
                        int size = r112.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            ((androidx.compose.ui.input.pointer.C) r112.get(i12)).a();
                        }
                        return kotlin.G0.f406611a;
                    }
                    jC2 = this.f36367r;
                    PointerEventPass pointerEventPass4 = this.f36366q;
                    InterfaceC22325c interfaceC22325c4 = (InterfaceC22325c) this.f36369t;
                    C42729a0.b(obj);
                    pointerEventPass = pointerEventPass4;
                    interfaceC22325c = interfaceC22325c4;
                }
                int i13 = ((androidx.compose.ui.input.pointer.C) obj).f40124i;
                androidx.compose.ui.input.pointer.U.f40189b.getClass();
                if (androidx.compose.ui.input.pointer.U.a(i13, androidx.compose.ui.input.pointer.U.f40190c) || androidx.compose.ui.input.pointer.U.a(i13, androidx.compose.ui.input.pointer.U.f40192e)) {
                    C1644a c1644a = new C1644a(pointerEventPass, null);
                    this.f36369t = interfaceC22325c;
                    this.f36366q = pointerEventPass;
                    this.f36368s = 2;
                    Object objU1 = interfaceC22325c.U1(jC2, c1644a, this);
                    r12 = pointerEventPass;
                    r42 = interfaceC22325c;
                    if (objU1 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.input.pointer.K k12, Q0 q02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f36364s = k12;
            this.f36365t = q02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f36364s, this.f36365t, continuation);
            aVar.f36363r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f36362q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C1643a c1643a = new C1643a((kotlinx.coroutines.T) this.f36363r, this.f36365t, null);
                this.f36362q = 1;
                if (C20444d1.c(this.f36364s, c1643a, this) == coroutine_suspended) {
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
    public C21577g1(Q0 q02, Continuation<? super C21577g1> continuation) {
        super(2, continuation);
        this.f36361s = q02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C21577g1 c21577g1 = new C21577g1(this.f36361s, continuation);
        c21577g1.f36360r = obj;
        return c21577g1;
    }

    @Override // Y41.p
    public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
        return ((C21577g1) create(k12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f36359q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((androidx.compose.ui.input.pointer.K) this.f36360r, this.f36361s, null);
            this.f36359q = 1;
            if (kotlinx.coroutines.U.c(aVar, this) == coroutine_suspended) {
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
