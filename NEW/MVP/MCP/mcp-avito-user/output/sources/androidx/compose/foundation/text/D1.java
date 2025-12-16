package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: LongPressTextDragObserver.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {0, 1, 1}, l = {87, 91}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes.dex */
final class D1 extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public androidx.compose.ui.input.pointer.C f30209q;

    /* renamed from: r, reason: collision with root package name */
    public int f30210r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f30211s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ W1 f30212t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(W1 w12, Continuation<? super D1> continuation) {
        super(2, continuation);
        this.f30212t = w12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        D1 d12 = new D1(this.f30212t, continuation);
        d12.f30211s = obj;
        return d12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
        return ((D1) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0052 -> B:17:0x0055). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.f30210r
            r2 = 1
            r3 = 2
            androidx.compose.foundation.text.W1 r4 = r12.f30212t
            if (r1 == 0) goto L2a
            if (r1 == r2) goto L22
            if (r1 != r3) goto L1a
            androidx.compose.ui.input.pointer.C r1 = r12.f30209q
            java.lang.Object r2 = r12.f30211s
            androidx.compose.ui.input.pointer.c r2 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r2
            kotlin.C42729a0.b(r13)
            goto L55
        L1a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L22:
            java.lang.Object r1 = r12.f30211s
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
            kotlin.C42729a0.b(r13)
            goto L3d
        L2a:
            kotlin.C42729a0.b(r13)
            java.lang.Object r13 = r12.f30211s
            r1 = r13
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
            r12.f30211s = r1
            r12.f30210r = r2
            java.lang.Object r13 = androidx.compose.foundation.gestures.C20445d2.c(r1, r12, r3)
            if (r13 != r0) goto L3d
            return r0
        L3d:
            androidx.compose.ui.input.pointer.C r13 = (androidx.compose.ui.input.pointer.C) r13
            long r5 = r13.f40118c
            r4.c()
            r2 = r1
            r1 = r13
        L46:
            r12.f30211s = r2
            r12.f30209q = r1
            r12.f30210r = r3
            androidx.compose.ui.input.pointer.PointerEventPass r13 = androidx.compose.ui.input.pointer.PointerEventPass.f40174c
            java.lang.Object r13 = r2.N1(r13, r12)
            if (r13 != r0) goto L55
            return r0
        L55:
            androidx.compose.ui.input.pointer.s r13 = (androidx.compose.ui.input.pointer.C22340s) r13
            java.lang.Object r13 = r13.f40278a
            r5 = r13
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r6 = 0
        L61:
            if (r6 >= r5) goto L7b
            java.lang.Object r7 = r13.get(r6)
            androidx.compose.ui.input.pointer.C r7 = (androidx.compose.ui.input.pointer.C) r7
            long r8 = r7.f40116a
            long r10 = r1.f40116a
            boolean r8 = androidx.compose.ui.input.pointer.B.a(r8, r10)
            if (r8 == 0) goto L78
            boolean r7 = r7.f40119d
            if (r7 == 0) goto L78
            goto L46
        L78:
            int r6 = r6 + 1
            goto L61
        L7b:
            r4.b()
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.D1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
