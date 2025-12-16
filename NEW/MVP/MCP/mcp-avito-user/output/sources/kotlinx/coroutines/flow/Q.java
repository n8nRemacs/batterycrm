package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okhttp3.internal.http.StatusLine;

/* compiled from: Delay.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", i = {0, 1, 2}, l = {StatusLine.HTTP_TEMP_REDIRECT, 309, 310}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes8.dex */
final class Q extends SuspendLambda implements Y41.p<kotlinx.coroutines.channels.I0<? super kotlin.G0>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f411217q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f411218r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f411219s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(long j12, Continuation<? super Q> continuation) {
        super(2, continuation);
        this.f411219s = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        Q q12 = new Q(this.f411219s, continuation);
        q12.f411218r = obj;
        return q12;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.channels.I0<? super kotlin.G0> i02, Continuation<? super kotlin.G0> continuation) {
        return ((Q) create(i02, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0058 -> B:15:0x003f). Please report as a decompilation issue!!! */
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
            int r1 = r7.f411217q
            long r2 = r7.f411219s
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2c
            if (r1 == r6) goto L24
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            goto L24
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            java.lang.Object r1 = r7.f411218r
            kotlinx.coroutines.channels.I0 r1 = (kotlinx.coroutines.channels.I0) r1
            kotlin.C42729a0.b(r8)
            goto L50
        L24:
            java.lang.Object r1 = r7.f411218r
            kotlinx.coroutines.channels.I0 r1 = (kotlinx.coroutines.channels.I0) r1
            kotlin.C42729a0.b(r8)
            goto L3f
        L2c:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f411218r
            r1 = r8
            kotlinx.coroutines.channels.I0 r1 = (kotlinx.coroutines.channels.I0) r1
            r7.f411218r = r1
            r7.f411217q = r6
            java.lang.Object r8 = kotlinx.coroutines.C43131e0.b(r2, r7)
            if (r8 != r0) goto L3f
            return r0
        L3f:
            kotlinx.coroutines.channels.M0 r8 = r1.r()
            kotlin.G0 r6 = kotlin.G0.f406611a
            r7.f411218r = r1
            r7.f411217q = r5
            java.lang.Object r8 = r8.send(r6, r7)
            if (r8 != r0) goto L50
            return r0
        L50:
            r7.f411218r = r1
            r7.f411217q = r4
            java.lang.Object r8 = kotlinx.coroutines.C43131e0.b(r2, r7)
            if (r8 != r0) goto L3f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.Q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
