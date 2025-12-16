package io.ktor.client.engine.okhttp;

import com.avito.android.remote.model.SearchParamsConverterKt;
import io.ktor.client.request.e0;
import io.ktor.utils.io.e2;
import java.io.Closeable;
import java.nio.ByteBuffer;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import okio.InterfaceC44804n;

/* compiled from: OkHttpEngine.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/e2;", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/utils/io/e2;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1", f = "OkHttpEngine.kt", i = {0, 0, 0, 0}, l = {155}, m = "invokeSuspend", n = {"$this$writer", "$this$use$iv", SearchParamsConverterKt.SOURCE, "lastRead"}, s = {"L$0", "L$1", "L$4", "L$5"})
/* loaded from: classes8.dex */
final class p extends SuspendLambda implements Y41.p<e2, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Closeable f398957q;

    /* renamed from: r, reason: collision with root package name */
    public CoroutineContext f398958r;

    /* renamed from: s, reason: collision with root package name */
    public e0 f398959s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC44804n f398960t;

    /* renamed from: u, reason: collision with root package name */
    public l0.f f398961u;

    /* renamed from: v, reason: collision with root package name */
    public int f398962v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f398963w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC44804n f398964x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f398965y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e0 f398966z;

    /* compiled from: OkHttpEngine.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/nio/ByteBuffer;", "buffer", "Lkotlin/G0;", "invoke", "(Ljava/nio/ByteBuffer;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements Y41.l<ByteBuffer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.f f398967l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC44804n f398968m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ e0 f398969n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0.f fVar, InterfaceC44804n interfaceC44804n, e0 e0Var) {
            super(1);
            this.f398967l = fVar;
            this.f398968m = interfaceC44804n;
            this.f398969n = e0Var;
        }

        @Override // Y41.l
        public final G0 invoke(ByteBuffer byteBuffer) {
            try {
                this.f398967l.f406840b = this.f398968m.read(byteBuffer);
                return G0.f406611a;
            } finally {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(InterfaceC44804n interfaceC44804n, CoroutineContext coroutineContext, e0 e0Var, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f398964x = interfaceC44804n;
        this.f398965y = coroutineContext;
        this.f398966z = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f398964x, this.f398965y, this.f398966z, continuation);
        pVar.f398963w = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(e2 e2Var, Continuation<? super G0> continuation) {
        return ((p) create(e2Var, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[Catch: all -> 0x001f, TryCatch #2 {all -> 0x001f, blocks: (B:6:0x001b, B:24:0x006f, B:15:0x003e, B:17:0x0044, B:19:0x004a, B:21:0x004e, B:25:0x0077, B:13:0x0032), top: B:45:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006c -> B:24:0x006f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f398962v
            r2 = 1
            if (r1 == 0) goto L29
            if (r1 != r2) goto L21
            kotlin.jvm.internal.l0$f r1 = r10.f398961u
            okio.n r3 = r10.f398960t
            io.ktor.client.request.e0 r4 = r10.f398959s
            kotlin.coroutines.CoroutineContext r5 = r10.f398958r
            java.io.Closeable r6 = r10.f398957q
            java.io.Closeable r6 = (java.io.Closeable) r6
            java.lang.Object r7 = r10.f398963w
            io.ktor.utils.io.e2 r7 = (io.ktor.utils.io.e2) r7
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L1f
            goto L6f
        L1f:
            r11 = move-exception
            goto L83
        L21:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L29:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f398963w
            io.ktor.utils.io.e2 r11 = (io.ktor.utils.io.e2) r11
            okio.n r6 = r10.f398964x
            kotlin.jvm.internal.l0$f r1 = new kotlin.jvm.internal.l0$f     // Catch: java.lang.Throwable -> L1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1f
            kotlin.coroutines.CoroutineContext r3 = r10.f398965y
            io.ktor.client.request.e0 r4 = r10.f398966z
            r7 = r11
            r5 = r3
            r3 = r6
        L3e:
            boolean r11 = r3.isOpen()     // Catch: java.lang.Throwable -> L1f
            if (r11 == 0) goto L77
            boolean r11 = kotlinx.coroutines.Q0.h(r5)     // Catch: java.lang.Throwable -> L1f
            if (r11 == 0) goto L77
            int r11 = r1.f406840b     // Catch: java.lang.Throwable -> L1f
            if (r11 < 0) goto L77
            io.ktor.utils.io.X r11 = r7.a()     // Catch: java.lang.Throwable -> L1f
            io.ktor.client.engine.okhttp.p$a r8 = new io.ktor.client.engine.okhttp.p$a     // Catch: java.lang.Throwable -> L1f
            r8.<init>(r1, r3, r4)     // Catch: java.lang.Throwable -> L1f
            r10.f398963w = r7     // Catch: java.lang.Throwable -> L1f
            r9 = r6
            java.io.Closeable r9 = (java.io.Closeable) r9     // Catch: java.lang.Throwable -> L1f
            r10.f398957q = r9     // Catch: java.lang.Throwable -> L1f
            r10.f398958r = r5     // Catch: java.lang.Throwable -> L1f
            r10.f398959s = r4     // Catch: java.lang.Throwable -> L1f
            r10.f398960t = r3     // Catch: java.lang.Throwable -> L1f
            r10.f398961u = r1     // Catch: java.lang.Throwable -> L1f
            r10.f398962v = r2     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r11 = r11.G(r2, r8, r10)     // Catch: java.lang.Throwable -> L1f
            if (r11 != r0) goto L6f
            return r0
        L6f:
            io.ktor.utils.io.X r11 = r7.a()     // Catch: java.lang.Throwable -> L1f
            r11.flush()     // Catch: java.lang.Throwable -> L1f
            goto L3e
        L77:
            kotlin.G0 r11 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L1f
            if (r6 == 0) goto L81
            r6.close()     // Catch: java.lang.Throwable -> L7f
            goto L81
        L7f:
            r11 = move-exception
            goto L8d
        L81:
            r11 = 0
            goto L8d
        L83:
            if (r6 == 0) goto L8d
            r6.close()     // Catch: java.lang.Throwable -> L89
            goto L8d
        L89:
            r0 = move-exception
            kotlin.C42833p.a(r11, r0)
        L8d:
            if (r11 != 0) goto L92
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        L92:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
