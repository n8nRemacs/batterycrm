package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: Transformable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2", f = "Transformable.kt", i = {0, 1}, l = {272, 284}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
final class w2 extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f28086q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f28087r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f28088s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20524z1 f28089t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C43108m f28090u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(CoroutineContext coroutineContext, InterfaceC20524z1 interfaceC20524z1, C43108m c43108m, Continuation continuation) {
        super(2, continuation);
        this.f28088s = coroutineContext;
        this.f28089t = interfaceC20524z1;
        this.f28090u = c43108m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        w2 w2Var = new w2(this.f28088s, this.f28089t, this.f28090u, continuation);
        w2Var.f28087r = obj;
        return w2Var;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
        return ((w2) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: all -> 0x001a, TRY_ENTER, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0016, B:26:0x0086, B:28:0x008a, B:23:0x0051, B:19:0x003d, B:22:0x0048, B:14:0x0029), top: B:35:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0016, B:26:0x0086, B:28:0x008a, B:23:0x0051, B:19:0x003d, B:22:0x0048, B:14:0x0029), top: B:35:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0083 -> B:26:0x0086). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.f28086q
            androidx.compose.foundation.gestures.z1 r2 = r14.f28089t
            r3 = 2
            r4 = 1
            kotlinx.coroutines.channels.m r5 = r14.f28090u
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 != r3) goto L1d
            java.lang.Object r1 = r14.f28087r
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
            kotlin.C42729a0.b(r15)     // Catch: java.lang.Throwable -> L1a
            goto L86
        L1a:
            r15 = move-exception
            goto L93
        L1d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L25:
            java.lang.Object r1 = r14.f28087r
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
            kotlin.C42729a0.b(r15)     // Catch: java.lang.Throwable -> L1a
            goto L48
        L2d:
            kotlin.C42729a0.b(r15)
            java.lang.Object r15 = r14.f28087r
            androidx.compose.ui.input.pointer.c r15 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r15
            r1 = r15
        L35:
            kotlin.coroutines.CoroutineContext r15 = r14.f28088s
            boolean r15 = kotlinx.coroutines.Q0.h(r15)
            if (r15 == 0) goto L99
            r14.f28087r = r1     // Catch: java.lang.Throwable -> L1a
            r14.f28086q = r4     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r15 = androidx.compose.foundation.gestures.y2.a(r1, r2, r14)     // Catch: java.lang.Throwable -> L1a
            if (r15 != r0) goto L48
            return r0
        L48:
            l0.g r15 = (l0.g) r15     // Catch: java.lang.Throwable -> L1a
            long r6 = r15.f413387a     // Catch: java.lang.Throwable -> L1a
            androidx.compose.foundation.gestures.p2$b r15 = androidx.compose.foundation.gestures.AbstractC20493p2.b.f27912a     // Catch: java.lang.Throwable -> L1a
            r5.w(r15)     // Catch: java.lang.Throwable -> L1a
        L51:
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            int r15 = (int) r6     // Catch: java.lang.Throwable -> L1a
            float r15 = java.lang.Float.intBitsToFloat(r15)     // Catch: java.lang.Throwable -> L1a
            r6 = 1141391360(0x44084000, float:545.0)
            float r15 = r15 / r6
            r6 = 1073741824(0x40000000, float:2.0)
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L1a
            double r8 = (double) r15     // Catch: java.lang.Throwable -> L1a
            double r6 = java.lang.Math.pow(r6, r8)     // Catch: java.lang.Throwable -> L1a
            float r9 = (float) r6     // Catch: java.lang.Throwable -> L1a
            androidx.compose.foundation.gestures.p2$a r15 = new androidx.compose.foundation.gestures.p2$a     // Catch: java.lang.Throwable -> L1a
            l0.g$a r6 = l0.g.f413384b     // Catch: java.lang.Throwable -> L1a
            r6.getClass()     // Catch: java.lang.Throwable -> L1a
            r13 = 0
            r10 = 0
            r12 = 0
            r8 = r15
            r8.<init>(r9, r10, r12, r13)     // Catch: java.lang.Throwable -> L1a
            r5.w(r15)     // Catch: java.lang.Throwable -> L1a
            r14.f28087r = r1     // Catch: java.lang.Throwable -> L1a
            r14.f28086q = r3     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r15 = androidx.compose.foundation.gestures.y2.c(r1, r2, r14)     // Catch: java.lang.Throwable -> L1a
            if (r15 != r0) goto L86
            return r0
        L86:
            l0.g r15 = (l0.g) r15     // Catch: java.lang.Throwable -> L1a
            if (r15 == 0) goto L8d
            long r6 = r15.f413387a     // Catch: java.lang.Throwable -> L1a
            goto L51
        L8d:
            androidx.compose.foundation.gestures.p2$c r15 = androidx.compose.foundation.gestures.AbstractC20493p2.c.f27913a
            r5.w(r15)
            goto L35
        L93:
            androidx.compose.foundation.gestures.p2$c r0 = androidx.compose.foundation.gestures.AbstractC20493p2.c.f27913a
            r5.w(r0)
            throw r15
        L99:
            kotlin.G0 r15 = kotlin.G0.f406611a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.w2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
