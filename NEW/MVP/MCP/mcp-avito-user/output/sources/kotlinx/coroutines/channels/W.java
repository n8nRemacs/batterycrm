package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {228, 229, 229}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
/* loaded from: classes8.dex */
final class W extends SuspendLambda implements Y41.p<I0<Object>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43125y f410849q;

    /* renamed from: r, reason: collision with root package name */
    public Object f410850r;

    /* renamed from: s, reason: collision with root package name */
    public int f410851s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f410852t;

    public W() {
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f410851s
            r2 = 0
            if (r1 == 0) goto L7b
            r3 = 2
            r4 = 1
            if (r1 == r4) goto L59
            r5 = 3
            if (r1 == r3) goto L24
            if (r1 != r5) goto L1c
            kotlinx.coroutines.channels.y r1 = r8.f410849q
            java.lang.Object r5 = r8.f410852t
            kotlinx.coroutines.channels.I0 r5 = (kotlinx.coroutines.channels.I0) r5
            kotlin.C42729a0.b(r9)
            goto L48
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            java.lang.Object r1 = r8.f410850r
            kotlinx.coroutines.channels.y r6 = r8.f410849q
            java.lang.Object r7 = r8.f410852t
            kotlinx.coroutines.channels.I0 r7 = (kotlinx.coroutines.channels.I0) r7
            kotlin.C42729a0.b(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L4a
            r8.f410852t = r7
            r8.f410849q = r6
            r8.f410850r = r2
            r8.f410851s = r5
            java.lang.Object r9 = r7.send(r1, r8)
            if (r9 != r0) goto L46
            return r0
        L46:
            r1 = r6
            r5 = r7
        L48:
            r6 = r1
            r7 = r5
        L4a:
            r8.f410852t = r7
            r8.f410849q = r6
            r8.f410850r = r2
            r8.f410851s = r4
            java.lang.Object r9 = r6.a(r8)
            if (r9 != r0) goto L63
            return r0
        L59:
            kotlinx.coroutines.channels.y r6 = r8.f410849q
            java.lang.Object r0 = r8.f410852t
            r7 = r0
            kotlinx.coroutines.channels.I0 r7 = (kotlinx.coroutines.channels.I0) r7
            kotlin.C42729a0.b(r9)
        L63:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L6e
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        L6e:
            java.lang.Object r9 = r6.next()
            r8.f410852t = r7
            r8.f410849q = r6
            r8.f410850r = r9
            r8.f410851s = r3
            throw r2
        L7b:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f410852t
            kotlinx.coroutines.channels.I0 r9 = (kotlinx.coroutines.channels.I0) r9
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.W.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
