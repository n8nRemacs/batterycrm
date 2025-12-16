package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Broadcast.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {52, 53}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
/* renamed from: kotlinx.coroutines.channels.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43104k extends SuspendLambda implements Y41.p<I0<Object>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43125y f410920q;

    /* renamed from: r, reason: collision with root package name */
    public int f410921r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f410922s;

    public C43104k() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(I0<Object> i02, Continuation<? super kotlin.G0> continuation) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003f -> B:16:0x0042). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f410921r
            if (r1 == 0) goto L52
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            kotlinx.coroutines.channels.y r1 = r5.f410920q
            java.lang.Object r4 = r5.f410922s
            kotlinx.coroutines.channels.I0 r4 = (kotlinx.coroutines.channels.I0) r4
            kotlin.C42729a0.b(r6)
            goto L42
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            kotlinx.coroutines.channels.y r1 = r5.f410920q
            java.lang.Object r4 = r5.f410922s
            kotlinx.coroutines.channels.I0 r4 = (kotlinx.coroutines.channels.I0) r4
            kotlin.C42729a0.b(r6)
        L29:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L4f
            java.lang.Object r6 = r1.next()
            r5.f410922s = r4
            r5.f410920q = r1
            r5.f410921r = r2
            java.lang.Object r6 = r4.send(r6, r5)
            if (r6 != r0) goto L42
            return r0
        L42:
            r5.f410922s = r4
            r5.f410920q = r1
            r5.f410921r = r3
            java.lang.Object r6 = r1.a(r5)
            if (r6 != r0) goto L29
            return r0
        L4f:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L52:
            kotlin.C42729a0.b(r6)
            java.lang.Object r6 = r5.f410922s
            kotlinx.coroutines.channels.I0 r6 = (kotlinx.coroutines.channels.I0) r6
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43104k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
