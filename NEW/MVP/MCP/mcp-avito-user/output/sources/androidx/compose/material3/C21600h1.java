package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BasicTooltip.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/K;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2", f = "BasicTooltip.android.kt", i = {}, l = {184}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21600h1 extends SuspendLambda implements Y41.p<androidx.compose.ui.input.pointer.K, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f36462q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f36463r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Q0 f36464s;

    /* compiled from: BasicTooltip.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2$1", f = "BasicTooltip.android.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.h1$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f36465q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f36466r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.input.pointer.K f36467s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Q0 f36468t;

        /* compiled from: BasicTooltip.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2$1$1", f = "BasicTooltip.android.kt", i = {0, 0}, l = {189}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "pass"}, s = {"L$0", "L$1"})
        /* renamed from: androidx.compose.material3.h1$a$a, reason: collision with other inner class name */
        public static final class C1645a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public PointerEventPass f36469q;

            /* renamed from: r, reason: collision with root package name */
            public int f36470r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f36471s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.T f36472t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Q0 f36473u;

            /* compiled from: BasicTooltip.android.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.h1$a$a$a, reason: collision with other inner class name */
            public static final class C1646a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f36474q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ Q0 f36475r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1646a(Q0 q02, Continuation<? super C1646a> continuation) {
                    super(2, continuation);
                    this.f36475r = q02;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C1646a(this.f36475r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((C1646a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f36474q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        MutatePriority mutatePriority = MutatePriority.f26798c;
                        this.f36474q = 1;
                        if (this.f36475r.a(mutatePriority, this) == coroutine_suspended) {
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
            public C1645a(kotlinx.coroutines.T t12, Q0 q02, Continuation<? super C1645a> continuation) {
                super(2, continuation);
                this.f36472t = t12;
                this.f36473u = q02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C1645a c1645a = new C1645a(this.f36472t, this.f36473u, continuation);
                c1645a.f36471s = obj;
                return c1645a;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
                return ((C1645a) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0031 -> B:12:0x0034). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r7.f36470r
                    r2 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L15
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = r7.f36469q
                    java.lang.Object r3 = r7.f36471s
                    androidx.compose.ui.input.pointer.c r3 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r3
                    kotlin.C42729a0.b(r8)
                    goto L34
                L15:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1d:
                    kotlin.C42729a0.b(r8)
                    java.lang.Object r8 = r7.f36471s
                    androidx.compose.ui.input.pointer.c r8 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r8
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.f40174c
                    r3 = r8
                L27:
                    r7.f36471s = r3
                    r7.f36469q = r1
                    r7.f36470r = r2
                    java.lang.Object r8 = r3.N1(r1, r7)
                    if (r8 != r0) goto L34
                    return r0
                L34:
                    androidx.compose.ui.input.pointer.s r8 = (androidx.compose.ui.input.pointer.C22340s) r8
                    java.lang.Object r4 = r8.f40278a
                    r5 = 0
                    java.lang.Object r4 = r4.get(r5)
                    androidx.compose.ui.input.pointer.C r4 = (androidx.compose.ui.input.pointer.C) r4
                    int r4 = r4.f40124i
                    androidx.compose.ui.input.pointer.U$a r5 = androidx.compose.ui.input.pointer.U.f40189b
                    r5.getClass()
                    int r5 = androidx.compose.ui.input.pointer.U.f40191d
                    boolean r4 = androidx.compose.ui.input.pointer.U.a(r4, r5)
                    if (r4 == 0) goto L27
                    int r8 = r8.f40282e
                    androidx.compose.ui.input.pointer.u$a r4 = androidx.compose.ui.input.pointer.C22342u.f40283b
                    r4.getClass()
                    int r4 = androidx.compose.ui.input.pointer.C22342u.f40287f
                    boolean r4 = androidx.compose.ui.input.pointer.C22342u.a(r8, r4)
                    androidx.compose.material3.Q0 r5 = r7.f36473u
                    if (r4 == 0) goto L6c
                    androidx.compose.material3.h1$a$a$a r8 = new androidx.compose.material3.h1$a$a$a
                    r4 = 0
                    r8.<init>(r5, r4)
                    r5 = 3
                    kotlinx.coroutines.T r6 = r7.f36472t
                    kotlinx.coroutines.C43259k.d(r6, r4, r4, r8, r5)
                    goto L27
                L6c:
                    int r4 = androidx.compose.ui.input.pointer.C22342u.f40288g
                    boolean r8 = androidx.compose.ui.input.pointer.C22342u.a(r8, r4)
                    if (r8 == 0) goto L27
                    r5.dismiss()
                    goto L27
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C21600h1.a.C1645a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.input.pointer.K k12, Q0 q02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f36467s = k12;
            this.f36468t = q02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f36467s, this.f36468t, continuation);
            aVar.f36466r = obj;
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
            int i12 = this.f36465q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C1645a c1645a = new C1645a((kotlinx.coroutines.T) this.f36466r, this.f36468t, null);
                this.f36465q = 1;
                if (this.f36467s.N0(c1645a, this) == coroutine_suspended) {
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
    public C21600h1(Q0 q02, Continuation<? super C21600h1> continuation) {
        super(2, continuation);
        this.f36464s = q02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C21600h1 c21600h1 = new C21600h1(this.f36464s, continuation);
        c21600h1.f36463r = obj;
        return c21600h1;
    }

    @Override // Y41.p
    public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
        return ((C21600h1) create(k12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f36462q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((androidx.compose.ui.input.pointer.K) this.f36463r, this.f36464s, null);
            this.f36462q = 1;
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
