package kotlinx.coroutines.rx3;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.InterfaceC43125y;
import kotlinx.coroutines.channels.K0;
import kotlinx.coroutines.rx3.C43280c;

/* compiled from: RxScheduler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.rx3.DispatcherScheduler$DispatcherWorker$1", f = "RxScheduler.kt", i = {0, 1}, l = {186, 78}, m = "invokeSuspend", n = {"$this$consume$iv$iv", "$this$consume$iv$iv"}, s = {"L$0", "L$0"})
/* renamed from: kotlinx.coroutines.rx3.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43278a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public K0 f412073q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43125y f412074r;

    /* renamed from: s, reason: collision with root package name */
    public int f412075s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C43280c.a f412076t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43278a(C43280c.a aVar, Continuation<? super C43278a> continuation) {
        super(2, continuation);
        this.f412076t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C43278a(this.f412076t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C43278a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:18:0x0034, B:22:0x0044, B:24:0x004c, B:27:0x005f, B:14:0x0025, B:17:0x0030), top: B:34:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:18:0x0034, B:22:0x0044, B:24:0x004c, B:27:0x005f, B:14:0x0025, B:17:0x0030), top: B:34:0x0008 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005c -> B:8:0x0015). Please report as a decompilation issue!!! */
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
            int r1 = r6.f412075s
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            kotlinx.coroutines.channels.y r1 = r6.f412074r
            kotlinx.coroutines.channels.K0 r4 = r6.f412073q
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L17
        L15:
            r7 = r1
            goto L34
        L17:
            r7 = move-exception
            goto L68
        L19:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L21:
            kotlinx.coroutines.channels.y r1 = r6.f412074r
            kotlinx.coroutines.channels.K0 r4 = r6.f412073q
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L17
            goto L44
        L29:
            kotlin.C42729a0.b(r7)
            kotlinx.coroutines.rx3.c$a r7 = r6.f412076t
            kotlinx.coroutines.channels.m r4 = r7.f412083e
            kotlinx.coroutines.channels.y r7 = r4.iterator()     // Catch: java.lang.Throwable -> L17
        L34:
            r6.f412073q = r4     // Catch: java.lang.Throwable -> L17
            r6.f412074r = r7     // Catch: java.lang.Throwable -> L17
            r6.f412075s = r3     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r7.a(r6)     // Catch: java.lang.Throwable -> L17
            if (r1 != r0) goto L41
            return r0
        L41:
            r5 = r1
            r1 = r7
            r7 = r5
        L44:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L17
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L17
            if (r7 == 0) goto L5f
            java.lang.Object r7 = r1.next()     // Catch: java.lang.Throwable -> L17
            Y41.l r7 = (Y41.l) r7     // Catch: java.lang.Throwable -> L17
            r6.f412073q = r4     // Catch: java.lang.Throwable -> L17
            r6.f412074r = r1     // Catch: java.lang.Throwable -> L17
            r6.f412075s = r2     // Catch: java.lang.Throwable -> L17
            java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L17
            if (r7 != r0) goto L15
            return r0
        L5f:
            kotlin.G0 r7 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L17
            r7 = 0
            r4.c(r7)
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L68:
            throw r7     // Catch: java.lang.Throwable -> L69
        L69:
            r0 = move-exception
            kotlinx.coroutines.channels.D.a(r4, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx3.C43278a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
