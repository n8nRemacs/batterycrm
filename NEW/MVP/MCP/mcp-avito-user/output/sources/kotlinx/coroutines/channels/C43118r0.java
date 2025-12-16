package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Deprecated.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {284, 285}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* renamed from: kotlinx.coroutines.channels.r0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43118r0 extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43125y f410983q;

    /* renamed from: r, reason: collision with root package name */
    public int f410984r;

    /* renamed from: s, reason: collision with root package name */
    public int f410985s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f410986t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C43118r0) create((I0) obj, (Continuation) obj2)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0045 -> B:16:0x0048). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f410985s
            if (r1 == 0) goto L61
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            int r1 = r6.f410984r
            kotlinx.coroutines.channels.y r4 = r6.f410983q
            java.lang.Object r5 = r6.f410986t
            kotlinx.coroutines.channels.I0 r5 = (kotlinx.coroutines.channels.I0) r5
            kotlin.C42729a0.b(r7)
            goto L48
        L1a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L22:
            int r1 = r6.f410984r
            kotlinx.coroutines.channels.y r4 = r6.f410983q
            java.lang.Object r5 = r6.f410986t
            kotlinx.coroutines.channels.I0 r5 = (kotlinx.coroutines.channels.I0) r5
            kotlin.C42729a0.b(r7)
        L2d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5e
            java.lang.Object r7 = r4.next()
            r6.f410986t = r5
            r6.f410983q = r4
            r6.f410984r = r1
            r6.f410985s = r2
            java.lang.Object r7 = r5.send(r7, r6)
            if (r7 != r0) goto L48
            return r0
        L48:
            int r1 = r1 + (-1)
            if (r1 != 0) goto L4f
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L4f:
            r6.f410986t = r5
            r6.f410983q = r4
            r6.f410984r = r1
            r6.f410985s = r3
            java.lang.Object r7 = r4.a(r6)
            if (r7 != r0) goto L2d
            return r0
        L5e:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L61:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f410986t
            kotlinx.coroutines.channels.I0 r7 = (kotlinx.coroutines.channels.I0) r7
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43118r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
