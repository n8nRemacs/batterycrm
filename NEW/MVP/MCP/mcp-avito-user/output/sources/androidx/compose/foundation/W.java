package androidx.compose.foundation;

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
final class W implements PointerInputEventHandler {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f26884b;

    /* compiled from: BasicTooltip.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1", f = "BasicTooltip.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f26885q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f26886r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.input.pointer.K f26887s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y f26888t;

        /* compiled from: BasicTooltip.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1", f = "BasicTooltip.kt", i = {0, 0}, l = {190}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "pass"}, s = {"L$0", "L$1"})
        /* renamed from: androidx.compose.foundation.W$a$a, reason: collision with other inner class name */
        public static final class C1558a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public PointerEventPass f26889q;

            /* renamed from: r, reason: collision with root package name */
            public int f26890r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f26891s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.T f26892t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Y f26893u;

            /* compiled from: BasicTooltip.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1", f = "BasicTooltip.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.W$a$a$a, reason: collision with other inner class name */
            public static final class C1559a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f26894q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ Y f26895r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1559a(Y y12, Continuation<? super C1559a> continuation) {
                    super(2, continuation);
                    this.f26895r = y12;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new C1559a(this.f26895r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((C1559a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f26894q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        MutatePriority mutatePriority = MutatePriority.f26798c;
                        this.f26894q = 1;
                        if (((C20411b0) this.f26895r).a(mutatePriority, this) == coroutine_suspended) {
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
            public C1558a(kotlinx.coroutines.T t12, Y y12, Continuation<? super C1558a> continuation) {
                super(2, continuation);
                this.f26892t = t12;
                this.f26893u = y12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                C1558a c1558a = new C1558a(this.f26892t, this.f26893u, continuation);
                c1558a.f26891s = obj;
                return c1558a;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
                return ((C1558a) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
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
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r7.f26890r
                    r2 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L15
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = r7.f26889q
                    java.lang.Object r3 = r7.f26891s
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
                    java.lang.Object r8 = r7.f26891s
                    androidx.compose.ui.input.pointer.c r8 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r8
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.f40174c
                    r3 = r8
                L27:
                    r7.f26891s = r3
                    r7.f26889q = r1
                    r7.f26890r = r2
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
                    androidx.compose.foundation.Y r5 = r7.f26893u
                    if (r4 == 0) goto L6c
                    androidx.compose.foundation.W$a$a$a r8 = new androidx.compose.foundation.W$a$a$a
                    r4 = 0
                    r8.<init>(r5, r4)
                    r5 = 3
                    kotlinx.coroutines.T r6 = r7.f26892t
                    kotlinx.coroutines.C43259k.d(r6, r4, r4, r8, r5)
                    goto L27
                L6c:
                    int r4 = androidx.compose.ui.input.pointer.C22342u.f40288g
                    boolean r8 = androidx.compose.ui.input.pointer.C22342u.a(r8, r4)
                    if (r8 == 0) goto L27
                    androidx.compose.foundation.b0 r5 = (androidx.compose.foundation.C20411b0) r5
                    r5.dismiss()
                    goto L27
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.W.a.C1558a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.input.pointer.K k12, Y y12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f26887s = k12;
            this.f26888t = y12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f26887s, this.f26888t, continuation);
            aVar.f26886r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f26885q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C1558a c1558a = new C1558a((kotlinx.coroutines.T) this.f26886r, this.f26888t, null);
                this.f26885q = 1;
                if (this.f26887s.N0(c1558a, this) == coroutine_suspended) {
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

    public W(Y y12) {
        this.f26884b = y12;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
        Object objC = kotlinx.coroutines.U.c(new a(k12, this.f26884b, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
    }
}
