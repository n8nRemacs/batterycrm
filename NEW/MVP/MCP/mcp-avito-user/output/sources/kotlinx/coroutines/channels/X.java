package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {241, 242, 242}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "e", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
/* loaded from: classes8.dex */
final class X extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43125y f410853q;

    /* renamed from: r, reason: collision with root package name */
    public Object f410854r;

    /* renamed from: s, reason: collision with root package name */
    public int f410855s;

    /* renamed from: t, reason: collision with root package name */
    public int f410856t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f410857u;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((X) create((I0) obj, (Continuation) obj2)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f410856t
            r2 = 0
            if (r1 == 0) goto L8c
            r3 = 1
            r4 = 2
            if (r1 == r3) goto L61
            r5 = 3
            if (r1 == r4) goto L26
            if (r1 != r5) goto L1e
            int r1 = r9.f410855s
            kotlinx.coroutines.channels.y r5 = r9.f410853q
            java.lang.Object r6 = r9.f410857u
            kotlinx.coroutines.channels.I0 r6 = (kotlinx.coroutines.channels.I0) r6
            kotlin.C42729a0.b(r10)
            goto L4e
        L1e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L26:
            int r1 = r9.f410855s
            java.lang.Object r6 = r9.f410854r
            kotlinx.coroutines.channels.y r7 = r9.f410853q
            java.lang.Object r8 = r9.f410857u
            kotlinx.coroutines.channels.I0 r8 = (kotlinx.coroutines.channels.I0) r8
            kotlin.C42729a0.b(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L50
            r9.f410857u = r8
            r9.f410853q = r7
            r9.f410854r = r2
            r9.f410855s = r1
            r9.f410856t = r5
            java.lang.Object r10 = r8.send(r6, r9)
            if (r10 != r0) goto L4c
            return r0
        L4c:
            r5 = r7
            r6 = r8
        L4e:
            r7 = r5
            r8 = r6
        L50:
            r9.f410857u = r8
            r9.f410853q = r7
            r9.f410854r = r2
            r9.f410855s = r1
            r9.f410856t = r3
            java.lang.Object r10 = r7.a(r9)
            if (r10 != r0) goto L6d
            return r0
        L61:
            int r1 = r9.f410855s
            kotlinx.coroutines.channels.y r7 = r9.f410853q
            java.lang.Object r0 = r9.f410857u
            r8 = r0
            kotlinx.coroutines.channels.I0 r8 = (kotlinx.coroutines.channels.I0) r8
            kotlin.C42729a0.b(r10)
        L6d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L78
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        L78:
            java.lang.Object r10 = r7.next()
            int r0 = r1 + 1
            kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            r9.f410857u = r8
            r9.f410853q = r7
            r9.f410854r = r10
            r9.f410855s = r0
            r9.f410856t = r4
            throw r2
        L8c:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f410857u
            kotlinx.coroutines.channels.I0 r10 = (kotlinx.coroutines.channels.I0) r10
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.X.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
