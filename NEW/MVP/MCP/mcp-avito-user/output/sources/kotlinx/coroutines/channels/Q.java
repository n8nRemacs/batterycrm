package kotlinx.coroutines.channels;

import java.util.HashSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "K", "Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {417, 418, 420}, m = "invokeSuspend", n = {"$this$produce", "keys", "$this$produce", "keys", "e", "$this$produce", "keys", "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
/* loaded from: classes8.dex */
final class Q extends SuspendLambda implements Y41.p<I0<Object>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public HashSet f410831q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43125y f410832r;

    /* renamed from: s, reason: collision with root package name */
    public Object f410833s;

    /* renamed from: t, reason: collision with root package name */
    public int f410834t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f410835u;

    public Q() {
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f410834t
            r2 = 0
            if (r1 == 0) goto L8d
            r3 = 2
            r4 = 1
            if (r1 == r4) goto L67
            r5 = 3
            if (r1 == r3) goto L29
            if (r1 != r5) goto L21
            java.lang.Object r1 = r10.f410833s
            kotlinx.coroutines.channels.y r5 = r10.f410832r
            java.util.HashSet r6 = r10.f410831q
            java.lang.Object r7 = r10.f410835u
            kotlinx.coroutines.channels.I0 r7 = (kotlinx.coroutines.channels.I0) r7
            kotlin.C42729a0.b(r11)
            r11 = r1
            goto L50
        L21:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L29:
            java.lang.Object r1 = r10.f410833s
            kotlinx.coroutines.channels.y r6 = r10.f410832r
            java.util.HashSet r7 = r10.f410831q
            java.lang.Object r8 = r10.f410835u
            kotlinx.coroutines.channels.I0 r8 = (kotlinx.coroutines.channels.I0) r8
            kotlin.C42729a0.b(r11)
            boolean r9 = r7.contains(r11)
            if (r9 != 0) goto L56
            r10.f410835u = r8
            r10.f410831q = r7
            r10.f410832r = r6
            r10.f410833s = r11
            r10.f410834t = r5
            java.lang.Object r1 = r8.send(r1, r10)
            if (r1 != r0) goto L4d
            return r0
        L4d:
            r5 = r6
            r6 = r7
            r7 = r8
        L50:
            r6.add(r11)
            r8 = r7
            r7 = r6
            r6 = r5
        L56:
            r10.f410835u = r8
            r10.f410831q = r7
            r10.f410832r = r6
            r10.f410833s = r2
            r10.f410834t = r4
            java.lang.Object r11 = r6.a(r10)
            if (r11 != r0) goto L73
            return r0
        L67:
            kotlinx.coroutines.channels.y r6 = r10.f410832r
            java.util.HashSet r7 = r10.f410831q
            java.lang.Object r0 = r10.f410835u
            r8 = r0
            kotlinx.coroutines.channels.I0 r8 = (kotlinx.coroutines.channels.I0) r8
            kotlin.C42729a0.b(r11)
        L73:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L7e
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        L7e:
            java.lang.Object r11 = r6.next()
            r10.f410835u = r8
            r10.f410831q = r7
            r10.f410832r = r6
            r10.f410833s = r11
            r10.f410834t = r3
            throw r2
        L8d:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f410835u
            kotlinx.coroutines.channels.I0 r11 = (kotlinx.coroutines.channels.I0) r11
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.Q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
