package io.ktor.websocket;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.InterfaceC41649d1;
import java.nio.ByteBuffer;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.P0;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: WebSocketWriter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/websocket/c0;", "Lkotlinx/coroutines/T;", "a", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c0 implements kotlinx.coroutines.T {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41649d1 f401494b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f401495c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f401496d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.ktor.utils.io.pool.h<ByteBuffer> f401497e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C43108m f401498f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final B f401499g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final N0 f401500h;

    /* compiled from: WebSocketWriter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/websocket/c0$a;", "", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final P0 f401501a;

        public a(@Y61.l N0 n02) {
            this.f401501a = new P0(n02);
        }

        public final boolean a() {
            P0 p02 = this.f401501a;
            p02.getClass();
            return p02.p0(G0.f406611a);
        }
    }

    /* compiled from: WebSocketWriter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0, 0}, l = {155, 158, 163}, m = "flush", n = {"this", "it"}, s = {"L$0", "L$2"})
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Object f401502q;

        /* renamed from: r, reason: collision with root package name */
        public Object f401503r;

        /* renamed from: s, reason: collision with root package name */
        public Object f401504s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f401505t;

        /* renamed from: v, reason: collision with root package name */
        public int f401507v;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f401505t = obj;
            this.f401507v |= BeduinInputModel.MIN_TEXT_VERSION;
            return c0.this.G(this);
        }
    }

    /* compiled from: WebSocketWriter.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.websocket.WebSocketWriter$writeLoopJob$1", f = "WebSocketWriter.kt", i = {0, 0}, l = {40}, m = "invokeSuspend", n = {"$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1"})
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public io.ktor.utils.io.pool.h f401508q;

        /* renamed from: r, reason: collision with root package name */
        public Object f401509r;

        /* renamed from: s, reason: collision with root package name */
        public int f401510s;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return c0.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
            io.ktor.utils.io.pool.h hVar;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f401510s;
            if (i12 == 0) {
                C42729a0.b(obj);
                c0 c0Var = c0.this;
                hVar = c0Var.f401497e;
                Object objS2 = hVar.S2();
                try {
                    this.f401508q = hVar;
                    this.f401509r = objS2;
                    this.f401510s = 1;
                    if (c0.b(c0Var, (ByteBuffer) objS2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = objS2;
                } catch (Throwable th2) {
                    th = th2;
                    obj2 = objS2;
                    hVar.G4(obj2);
                    throw th;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f401509r;
                hVar = this.f401508q;
                try {
                    C42729a0.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    hVar.G4(obj2);
                    throw th;
                }
            }
            G0 g02 = G0.f406611a;
            hVar.G4(obj2);
            return G0.f406611a;
        }
    }

    public c0(InterfaceC41649d1 interfaceC41649d1, CoroutineContext coroutineContext, boolean z12, io.ktor.utils.io.pool.h hVar, int i12, C42822w c42822w) {
        this(interfaceC41649d1, coroutineContext, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? io.ktor.util.cio.b.f400431a : hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0151, code lost:
    
        throw new java.lang.IllegalArgumentException("unknown message " + r11);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082 A[Catch: all -> 0x00a8, ChannelWriteException -> 0x00ac, TryCatch #6 {ChannelWriteException -> 0x00ac, all -> 0x00a8, blocks: (B:38:0x009c, B:27:0x0066, B:31:0x007a, B:33:0x0082, B:35:0x008a, B:46:0x00b0, B:48:0x00b4, B:49:0x00ba, B:50:0x00ce, B:26:0x0060), top: B:90:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011a A[Catch: CancellationException -> 0x0152, TryCatch #1 {CancellationException -> 0x0152, blocks: (B:60:0x010f, B:63:0x011a, B:65:0x011e, B:70:0x0128, B:72:0x012c, B:73:0x0132, B:79:0x013d, B:80:0x0151, B:76:0x0138, B:68:0x0124), top: B:88:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [io.ktor.websocket.c0] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(io.ktor.websocket.c0 r10, java.nio.ByteBuffer r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.c0.b(io.ktor.websocket.c0, java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, io.ktor.websocket.c0$a] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof io.ktor.websocket.c0.b
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.websocket.c0$b r0 = (io.ktor.websocket.c0.b) r0
            int r1 = r0.f401507v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401507v = r1
            goto L1a
        L13:
            io.ktor.websocket.c0$b r0 = new io.ktor.websocket.c0$b
            kotlin.coroutines.jvm.internal.ContinuationImpl r9 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r9
            r0.<init>(r9)
        L1a:
            java.lang.Object r9 = r0.f401505t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401507v
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L55
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            kotlin.C42729a0.b(r9)
            goto Lb1
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            java.lang.Object r2 = r0.f401502q
            io.ktor.websocket.c0$a r2 = (io.ktor.websocket.c0.a) r2
            kotlin.C42729a0.b(r9)
            goto L96
        L43:
            java.lang.Object r2 = r0.f401504s
            io.ktor.websocket.c0$a r2 = (io.ktor.websocket.c0.a) r2
            java.lang.Object r5 = r0.f401503r
            io.ktor.websocket.c0$a r5 = (io.ktor.websocket.c0.a) r5
            java.lang.Object r7 = r0.f401502q
            io.ktor.websocket.c0 r7 = (io.ktor.websocket.c0) r7
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L53 kotlinx.coroutines.channels.ClosedSendChannelException -> L7f
            goto L97
        L53:
            r9 = move-exception
            goto L7b
        L55:
            kotlin.C42729a0.b(r9)
            io.ktor.websocket.c0$a r2 = new io.ktor.websocket.c0$a
            kotlinx.coroutines.N0$b r9 = kotlinx.coroutines.N0.f410716u2
            kotlin.coroutines.CoroutineContext r7 = r8.f401495c
            kotlin.coroutines.CoroutineContext$Element r9 = r7.get(r9)
            kotlinx.coroutines.N0 r9 = (kotlinx.coroutines.N0) r9
            r2.<init>(r9)
            kotlinx.coroutines.channels.m r9 = r8.f401498f     // Catch: java.lang.Throwable -> L53 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.f401502q = r8     // Catch: java.lang.Throwable -> L53 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.f401503r = r2     // Catch: java.lang.Throwable -> L53 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.f401504s = r2     // Catch: java.lang.Throwable -> L53 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.f401507v = r5     // Catch: java.lang.Throwable -> L53 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            java.lang.Object r9 = r9.send(r2, r0)     // Catch: java.lang.Throwable -> L53 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            if (r9 != r1) goto L96
            return r1
        L78:
            r7 = r8
            r5 = r2
            goto L7f
        L7b:
            r2.a()
            throw r9
        L7f:
            r2.a()
            kotlinx.coroutines.N0 r9 = r7.f401500h
            r0.f401502q = r5
            r0.f401503r = r6
            r0.f401504s = r6
            r0.f401507v = r4
            kotlinx.coroutines.V0 r9 = (kotlinx.coroutines.V0) r9
            java.lang.Object r9 = r9.A(r0)
            if (r9 != r1) goto L95
            return r1
        L95:
            r2 = r5
        L96:
            r5 = r2
        L97:
            r0.f401502q = r6
            r0.f401503r = r6
            r0.f401504s = r6
            r0.f401507v = r3
            kotlinx.coroutines.P0 r9 = r5.f401501a
            java.lang.Object r9 = r9.A(r0)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r9 != r0) goto Lac
            goto Lae
        Lac:
            kotlin.G0 r9 = kotlin.G0.f406611a
        Lae:
            if (r9 != r1) goto Lb1
            return r1
        Lb1:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.c0.G(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x016b, code lost:
    
        r6 = r6.f401426c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x016d, code lost:
    
        if (r7 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x016f, code lost:
    
        r7 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0172, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0175, code lost:
    
        if (r13.f401561e == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0177, code lost:
    
        r15 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x017a, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x017b, code lost:
    
        r7 = r7 | r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x017e, code lost:
    
        if (r13.f401562f == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0180, code lost:
    
        r15 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0183, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0184, code lost:
    
        r7 = r7 | r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0187, code lost:
    
        if (r13.f401563g == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0189, code lost:
    
        r13 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x018c, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x018d, code lost:
    
        r1.put((byte) (r6 | (r7 | r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0193, code lost:
    
        if (r14 == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0195, code lost:
    
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0198, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0199, code lost:
    
        r1.put((byte) (r15 | r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01a1, code lost:
    
        if (r12 == 126) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01a5, code lost:
    
        if (r12 == 127) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01a8, code lost:
    
        r1.putLong(r10.remaining());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01b1, code lost:
    
        r1.putShort((short) r10.remaining());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01b9, code lost:
    
        r6 = r11.f401382c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01bb, code lost:
    
        if (r6 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01bd, code lost:
    
        r6 = r6.duplicate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01c1, code lost:
    
        if (r6 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01c3, code lost:
    
        io.ktor.util.n0.a(r6, r1, Integer.MAX_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01c9, code lost:
    
        r9.remove();
        r6 = r11.f401382c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01ce, code lost:
    
        if (r6 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01d0, code lost:
    
        r7 = java.nio.ByteBuffer.allocate(r10.remaining());
        io.ktor.util.n0.a(r10.slice(), r7, Integer.MAX_VALUE);
        r7.clear();
        io.ktor.websocket.D.a(r7, r6);
        r10 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01e9, code lost:
    
        r11.f401381b = r10;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01f6, code lost:
    
        throw new java.lang.IllegalStateException("Can't continue with different data frame opcode");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01f7, code lost:
    
        r1.flip();
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (r2 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        r10.h(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
    
        if (r11.f401380a.isEmpty() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b1, code lost:
    
        if (r11.f401381b == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        if (r9 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bd, code lost:
    
        if (r1.position() == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c0, code lost:
    
        r8.f401494b.flush();
        r1 = (io.ktor.websocket.c0.a) r3.f406842b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
    
        if (r1 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        if (r2 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d5, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00da, code lost:
    
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r11.f401384e = r8.f401496d;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00df, code lost:
    
        r9 = r11.f401381b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e4, code lost:
    
        if (r9 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e7, code lost:
    
        io.ktor.util.n0.a(r9, r1, Integer.MAX_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ee, code lost:
    
        if (r9.hasRemaining() != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f0, code lost:
    
        r11.f401381b = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f2, code lost:
    
        r9 = r11.f401380a;
        r13 = r9.peek();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fa, code lost:
    
        if (r13 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fe, code lost:
    
        r14 = r11.f401384e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0101, code lost:
    
        if (r14 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0103, code lost:
    
        r10 = java.nio.ByteBuffer.allocate(4);
        kotlin.random.f.f406882b.getClass();
        r10.putInt(kotlin.random.f.f406883c.i());
        r10.clear();
        r11.f401382c = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011b, code lost:
    
        r11.f401382c = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011d, code lost:
    
        r10 = r13.f401564h;
        r15 = r10.remaining();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0125, code lost:
    
        if (r15 >= 126) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0127, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012b, code lost:
    
        if (r15 > 32767) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012d, code lost:
    
        r15 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012f, code lost:
    
        r15 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0131, code lost:
    
        if (r14 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0133, code lost:
    
        r12 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0135, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013b, code lost:
    
        if (r1.remaining() >= (r15 + r12)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x013f, code lost:
    
        r12 = r10.remaining();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0143, code lost:
    
        if (r12 >= 126) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0149, code lost:
    
        if (r12 > 65535) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014b, code lost:
    
        r12 = 126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014d, code lost:
    
        r12 = 127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x014f, code lost:
    
        r15 = r11.f401383d;
        r6 = r13.f401558b;
        r7 = r13.f401557a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0155, code lost:
    
        if (r15 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0157, code lost:
    
        if (r7 != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0159, code lost:
    
        r11.f401383d = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015b, code lost:
    
        r6 = r6.f401426c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015e, code lost:
    
        if (r15 != r6) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        if (r7 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0162, code lost:
    
        r11.f401383d = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0165, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0169, code lost:
    
        if (r6.f401425b == false) goto L176;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:144:0x0219, B:152:0x0236], limit reached: 169 */
    /* JADX WARN: Path cross not found for [B:156:0x023d, B:155:0x023b], limit reached: 169 */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00a2 A[ADDED_TO_REGION, EDGE_INSN: B:159:0x00a2->B:34:0x00a2 BREAK  A[LOOP:0: B:15:0x005b->B:168:0x005b], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r9v18, types: [T, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x020c -> B:142:0x020f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(io.ktor.websocket.AbstractC41723i r19, java.nio.ByteBuffer r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.c0.c(io.ktor.websocket.i, java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF401495c() {
        return this.f401495c;
    }

    public c0(@Y61.k InterfaceC41649d1 interfaceC41649d1, @Y61.k CoroutineContext coroutineContext, boolean z12, @Y61.k io.ktor.utils.io.pool.h<ByteBuffer> hVar) {
        this.f401494b = interfaceC41649d1;
        this.f401495c = coroutineContext;
        this.f401496d = z12;
        this.f401497e = hVar;
        this.f401498f = kotlinx.coroutines.channels.A.a(8, null, null, 6);
        this.f401499g = new B();
        this.f401500h = C43259k.c(this, new kotlinx.coroutines.S("ws-writer"), CoroutineStart.f410682d, new c(null));
    }
}
