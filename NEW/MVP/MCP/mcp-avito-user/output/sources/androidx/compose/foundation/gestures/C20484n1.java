package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MouseWheelScrollable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", f = "MouseWheelScrollable.kt", i = {0, 1}, l = {107, 110}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
/* renamed from: androidx.compose.foundation.gestures.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20484n1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27876q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27877r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C20456g1 f27878s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20484n1(C20456g1 c20456g1, Continuation<? super C20484n1> continuation) {
        super(2, continuation);
        this.f27878s = c20456g1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C20484n1 c20484n1 = new C20484n1(this.f27878s, continuation);
        c20484n1.f27877r = obj;
        return c20484n1;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C20484n1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0015, B:17:0x0033, B:19:0x003d, B:23:0x004d, B:14:0x0028), top: B:30:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006c -> B:8:0x0018). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r13.f27876q
            androidx.compose.foundation.gestures.g1 r8 = r13.f27878s
            r9 = 0
            r10 = 2
            r11 = 1
            if (r1 == 0) goto L2c
            if (r1 == r11) goto L24
            if (r1 != r10) goto L1c
            java.lang.Object r1 = r13.f27877r
            kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
            kotlin.C42729a0.b(r14)     // Catch: java.lang.Throwable -> L1a
        L18:
            r14 = r1
            goto L33
        L1a:
            r14 = move-exception
            goto L74
        L1c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L24:
            java.lang.Object r1 = r13.f27877r
            kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
            kotlin.C42729a0.b(r14)     // Catch: java.lang.Throwable -> L1a
            goto L4d
        L2c:
            kotlin.C42729a0.b(r14)
            java.lang.Object r14 = r13.f27877r
            kotlinx.coroutines.T r14 = (kotlinx.coroutines.T) r14
        L33:
            kotlin.coroutines.CoroutineContext r1 = r14.getF401596i()     // Catch: java.lang.Throwable -> L1a
            boolean r1 = kotlinx.coroutines.Q0.h(r1)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L6f
            kotlinx.coroutines.channels.m r1 = r8.f27717e     // Catch: java.lang.Throwable -> L1a
            r13.f27877r = r14     // Catch: java.lang.Throwable -> L1a
            r13.f27876q = r11     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.M(r13)     // Catch: java.lang.Throwable -> L1a
            if (r1 != r0) goto L4a
            return r0
        L4a:
            r12 = r1
            r1 = r14
            r14 = r12
        L4d:
            r4 = r14
            androidx.compose.foundation.gestures.g1$a r4 = (androidx.compose.foundation.gestures.C20456g1.a) r4     // Catch: java.lang.Throwable -> L1a
            androidx.compose.ui.unit.d r14 = r8.f27716d     // Catch: java.lang.Throwable -> L1a
            float r2 = androidx.compose.foundation.gestures.C20452f1.f27701a     // Catch: java.lang.Throwable -> L1a
            float r5 = r14.M0(r2)     // Catch: java.lang.Throwable -> L1a
            androidx.compose.ui.unit.d r14 = r8.f27716d     // Catch: java.lang.Throwable -> L1a
            float r2 = androidx.compose.foundation.gestures.C20452f1.f27702b     // Catch: java.lang.Throwable -> L1a
            float r6 = r14.M0(r2)     // Catch: java.lang.Throwable -> L1a
            androidx.compose.foundation.gestures.a2 r3 = r8.f27713a     // Catch: java.lang.Throwable -> L1a
            r13.f27877r = r1     // Catch: java.lang.Throwable -> L1a
            r13.f27876q = r10     // Catch: java.lang.Throwable -> L1a
            r2 = r8
            r7 = r13
            java.lang.Object r14 = androidx.compose.foundation.gestures.C20456g1.b(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1a
            if (r14 != r0) goto L18
            return r0
        L6f:
            r8.f27719g = r9
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        L74:
            r8.f27719g = r9
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20484n1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
