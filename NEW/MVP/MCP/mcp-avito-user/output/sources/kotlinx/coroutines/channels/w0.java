package kotlinx.coroutines.channels;

import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "Lkotlinx/coroutines/channels/I0;", "Lkotlin/collections/H0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {Constants.MINIMAL_ERROR_STATUS_CODE, 401}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes8.dex */
final class w0 extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43125y f411029q;

    /* renamed from: r, reason: collision with root package name */
    public int f411030r;

    /* renamed from: s, reason: collision with root package name */
    public int f411031s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f411032t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((I0) obj, (Continuation) obj2)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004f -> B:17:0x0050). Please report as a decompilation issue!!! */
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
            int r1 = r8.f411031s
            if (r1 == 0) goto L62
            r2 = 1
            r3 = 2
            if (r1 == r2) goto L22
            if (r1 != r3) goto L1a
            int r1 = r8.f411030r
            kotlinx.coroutines.channels.y r4 = r8.f411029q
            java.lang.Object r5 = r8.f411032t
            kotlinx.coroutines.channels.I0 r5 = (kotlinx.coroutines.channels.I0) r5
            kotlin.C42729a0.b(r9)
            goto L50
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            int r1 = r8.f411030r
            kotlinx.coroutines.channels.y r4 = r8.f411029q
            java.lang.Object r5 = r8.f411032t
            kotlinx.coroutines.channels.I0 r5 = (kotlinx.coroutines.channels.I0) r5
            kotlin.C42729a0.b(r9)
        L2d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L5f
            java.lang.Object r9 = r4.next()
            kotlin.collections.H0 r6 = new kotlin.collections.H0
            int r7 = r1 + 1
            r6.<init>(r1, r9)
            r8.f411032t = r5
            r8.f411029q = r4
            r8.f411030r = r7
            r8.f411031s = r3
            java.lang.Object r9 = r5.send(r6, r8)
            if (r9 != r0) goto L4f
            return r0
        L4f:
            r1 = r7
        L50:
            r8.f411032t = r5
            r8.f411029q = r4
            r8.f411030r = r1
            r8.f411031s = r2
            java.lang.Object r9 = r4.a(r8)
            if (r9 != r0) goto L2d
            return r0
        L5f:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        L62:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f411032t
            kotlinx.coroutines.channels.I0 r9 = (kotlinx.coroutines.channels.I0) r9
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
