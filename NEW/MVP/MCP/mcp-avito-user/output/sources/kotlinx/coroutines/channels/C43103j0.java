package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Deprecated.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {517, 363, 363}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
/* renamed from: kotlinx.coroutines.channels.j0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43103j0 extends SuspendLambda implements Y41.p<I0<Object>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Y41.p f410914q;

    /* renamed from: r, reason: collision with root package name */
    public K0 f410915r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC43125y f410916s;

    /* renamed from: t, reason: collision with root package name */
    public I0 f410917t;

    /* renamed from: u, reason: collision with root package name */
    public int f410918u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f410919v;

    public C43103j0() {
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #2 {all -> 0x0023, blocks: (B:9:0x001e, B:32:0x0094, B:22:0x0053, B:24:0x005b, B:35:0x00a8, B:21:0x0050), top: B:48:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #2 {all -> 0x0023, blocks: (B:9:0x001e, B:32:0x0094, B:22:0x0053, B:24:0x005b, B:35:0x00a8, B:21:0x0050), top: B:48:0x000c }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0090 -> B:32:0x0094). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f410918u
            r2 = 0
            if (r1 == 0) goto Lb6
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == r5) goto L44
            if (r1 == r4) goto L2e
            if (r1 != r3) goto L26
            kotlinx.coroutines.channels.y r1 = r11.f410916s
            kotlinx.coroutines.channels.K0 r6 = r11.f410915r
            Y41.p r7 = r11.f410914q
            Y41.p r7 = (Y41.p) r7
            java.lang.Object r8 = r11.f410919v
            kotlinx.coroutines.channels.I0 r8 = (kotlinx.coroutines.channels.I0) r8
            kotlin.C42729a0.b(r12)     // Catch: java.lang.Throwable -> L23
            goto L94
        L23:
            r12 = move-exception
            goto Lb0
        L26:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2e:
            kotlinx.coroutines.channels.I0 r1 = r11.f410917t
            kotlinx.coroutines.channels.y r6 = r11.f410916s
            kotlinx.coroutines.channels.K0 r7 = r11.f410915r
            Y41.p r8 = r11.f410914q
            Y41.p r8 = (Y41.p) r8
            java.lang.Object r9 = r11.f410919v
            kotlinx.coroutines.channels.I0 r9 = (kotlinx.coroutines.channels.I0) r9
            kotlin.C42729a0.b(r12)     // Catch: java.lang.Throwable -> L40
            goto L7a
        L40:
            r12 = move-exception
            r6 = r7
            goto Lb0
        L44:
            kotlinx.coroutines.channels.y r1 = r11.f410916s
            kotlinx.coroutines.channels.K0 r6 = r11.f410915r
            Y41.p r7 = r11.f410914q
            Y41.p r7 = (Y41.p) r7
            java.lang.Object r8 = r11.f410919v
            kotlinx.coroutines.channels.I0 r8 = (kotlinx.coroutines.channels.I0) r8
            kotlin.C42729a0.b(r12)     // Catch: java.lang.Throwable -> L23
        L53:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L23
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L23
            if (r12 == 0) goto La8
            java.lang.Object r12 = r1.next()     // Catch: java.lang.Throwable -> L23
            r11.f410919v = r8     // Catch: java.lang.Throwable -> L23
            r9 = r7
            Y41.p r9 = (Y41.p) r9     // Catch: java.lang.Throwable -> L23
            r11.f410914q = r9     // Catch: java.lang.Throwable -> L23
            r11.f410915r = r6     // Catch: java.lang.Throwable -> L23
            r11.f410916s = r1     // Catch: java.lang.Throwable -> L23
            r11.f410917t = r8     // Catch: java.lang.Throwable -> L23
            r11.f410918u = r4     // Catch: java.lang.Throwable -> L23
            java.lang.Object r12 = r7.invoke(r12, r11)     // Catch: java.lang.Throwable -> L23
            if (r12 != r0) goto L75
            return r0
        L75:
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r1
            r1 = r9
        L7a:
            r11.f410919v = r9     // Catch: java.lang.Throwable -> L40
            r10 = r8
            Y41.p r10 = (Y41.p) r10     // Catch: java.lang.Throwable -> L40
            r11.f410914q = r10     // Catch: java.lang.Throwable -> L40
            r11.f410915r = r7     // Catch: java.lang.Throwable -> L40
            r11.f410916s = r6     // Catch: java.lang.Throwable -> L40
            r11.f410917t = r2     // Catch: java.lang.Throwable -> L40
            r11.f410918u = r3     // Catch: java.lang.Throwable -> L40
            java.lang.Object r12 = r1.send(r12, r11)     // Catch: java.lang.Throwable -> L40
            if (r12 != r0) goto L90
            return r0
        L90:
            r1 = r6
            r6 = r7
            r7 = r8
            r8 = r9
        L94:
            r11.f410919v = r8     // Catch: java.lang.Throwable -> L23
            r12 = r7
            Y41.p r12 = (Y41.p) r12     // Catch: java.lang.Throwable -> L23
            r11.f410914q = r12     // Catch: java.lang.Throwable -> L23
            r11.f410915r = r6     // Catch: java.lang.Throwable -> L23
            r11.f410916s = r1     // Catch: java.lang.Throwable -> L23
            r11.f410918u = r5     // Catch: java.lang.Throwable -> L23
            java.lang.Object r12 = r1.a(r11)     // Catch: java.lang.Throwable -> L23
            if (r12 != r0) goto L53
            return r0
        La8:
            kotlin.G0 r12 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L23
            r6.c(r2)
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        Lb0:
            throw r12     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r0 = move-exception
            kotlinx.coroutines.channels.D.a(r6, r12)
            throw r0
        Lb6:
            kotlin.C42729a0.b(r12)
            java.lang.Object r12 = r11.f410919v
            kotlinx.coroutines.channels.I0 r12 = (kotlinx.coroutines.channels.I0) r12
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43103j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
