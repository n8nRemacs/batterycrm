package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.C20444d1;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LazyLayoutPager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.pager.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20813g implements PointerInputEventHandler {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f29924b;

    /* compiled from: LazyLayoutPager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", i = {}, l = {287}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.pager.g$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f29925q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.input.pointer.K f29926r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ m0 f29927s;

        /* compiled from: LazyLayoutPager.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", i = {0, 1, 1, 1}, l = {289, 293}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "downEvent", "upEventOrCancellation"}, s = {"L$0", "L$0", "L$1", "L$2"})
        /* renamed from: androidx.compose.foundation.pager.g$a$a, reason: collision with other inner class name */
        public static final class C1598a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public androidx.compose.ui.input.pointer.C f29928q;

            /* renamed from: r, reason: collision with root package name */
            public androidx.compose.ui.input.pointer.C f29929r;

            /* renamed from: s, reason: collision with root package name */
            public int f29930s;

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f29931t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ m0 f29932u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1598a(m0 m0Var, Continuation<? super C1598a> continuation) {
                super(2, continuation);
                this.f29932u = m0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
                C1598a c1598a = new C1598a(this.f29932u, continuation);
                c1598a.f29931t = obj;
                return c1598a;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super G0> continuation) {
                return ((C1598a) create(interfaceC22325c, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:18:0x006e). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r11.f29930s
                    androidx.compose.foundation.pager.m0 r2 = r11.f29932u
                    r3 = 1
                    androidx.compose.runtime.y1 r2 = r2.f29966c
                    r4 = 2
                    r5 = 0
                    if (r1 == 0) goto L2f
                    if (r1 == r3) goto L27
                    if (r1 != r4) goto L1f
                    androidx.compose.ui.input.pointer.C r1 = r11.f29929r
                    androidx.compose.ui.input.pointer.C r3 = r11.f29928q
                    java.lang.Object r6 = r11.f29931t
                    androidx.compose.ui.input.pointer.c r6 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r6
                    kotlin.C42729a0.b(r12)
                    goto L6e
                L1f:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L27:
                    java.lang.Object r1 = r11.f29931t
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
                    kotlin.C42729a0.b(r12)
                    goto L44
                L2f:
                    kotlin.C42729a0.b(r12)
                    java.lang.Object r12 = r11.f29931t
                    r1 = r12
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
                    androidx.compose.ui.input.pointer.PointerEventPass r12 = androidx.compose.ui.input.pointer.PointerEventPass.f40173b
                    r11.f29931t = r1
                    r11.f29930s = r3
                    java.lang.Object r12 = androidx.compose.foundation.gestures.C20445d2.b(r1, r5, r12, r11)
                    if (r12 != r0) goto L44
                    return r0
                L44:
                    androidx.compose.ui.input.pointer.C r12 = (androidx.compose.ui.input.pointer.C) r12
                    l0.g$a r3 = l0.g.f413384b
                    r3.getClass()
                    r6 = 0
                    l0.g r3 = l0.g.a(r6)
                    r6 = r2
                    androidx.compose.runtime.i3 r6 = (androidx.compose.runtime.C22082i3) r6
                    r6.setValue(r3)
                    r3 = 0
                    r6 = r1
                    r1 = r3
                    r3 = r12
                L5b:
                    if (r1 != 0) goto L96
                    androidx.compose.ui.input.pointer.PointerEventPass r12 = androidx.compose.ui.input.pointer.PointerEventPass.f40173b
                    r11.f29931t = r6
                    r11.f29928q = r3
                    r11.f29929r = r1
                    r11.f29930s = r4
                    java.lang.Object r12 = r6.N1(r12, r11)
                    if (r12 != r0) goto L6e
                    return r0
                L6e:
                    androidx.compose.ui.input.pointer.s r12 = (androidx.compose.ui.input.pointer.C22340s) r12
                    java.lang.Object r7 = r12.f40278a
                    r8 = r7
                    java.util.Collection r8 = (java.util.Collection) r8
                    int r8 = r8.size()
                    r9 = r5
                L7a:
                    if (r9 >= r8) goto L8c
                    java.lang.Object r10 = r7.get(r9)
                    androidx.compose.ui.input.pointer.C r10 = (androidx.compose.ui.input.pointer.C) r10
                    boolean r10 = androidx.compose.ui.input.pointer.C22341t.b(r10)
                    if (r10 != 0) goto L89
                    goto L5b
                L89:
                    int r9 = r9 + 1
                    goto L7a
                L8c:
                    java.lang.Object r12 = r12.f40278a
                    java.lang.Object r12 = r12.get(r5)
                    r1 = r12
                    androidx.compose.ui.input.pointer.C r1 = (androidx.compose.ui.input.pointer.C) r1
                    goto L5b
                L96:
                    long r3 = r3.f40118c
                    long r0 = r1.f40118c
                    long r0 = l0.g.i(r0, r3)
                    l0.g r12 = l0.g.a(r0)
                    androidx.compose.runtime.i3 r2 = (androidx.compose.runtime.C22082i3) r2
                    r2.setValue(r12)
                    kotlin.G0 r12 = kotlin.G0.f406611a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.C20813g.a.C1598a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.input.pointer.K k12, m0 m0Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f29926r = k12;
            this.f29927s = m0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f29926r, this.f29927s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f29925q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C1598a c1598a = new C1598a(this.f29927s, null);
                this.f29925q = 1;
                if (C20444d1.c(this.f29926r, c1598a, this) == coroutine_suspended) {
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

    public C20813g(m0 m0Var) {
        this.f29924b = m0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super G0> continuation) {
        Object objC = kotlinx.coroutines.U.c(new a(k12, this.f29924b, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : G0.f406611a;
    }
}
