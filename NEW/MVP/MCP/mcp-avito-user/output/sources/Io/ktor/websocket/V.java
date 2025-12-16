package io.ktor.websocket;

import io.ktor.util.cio.ChannelIOException;
import io.ktor.utils.io.W0;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: WebSocketReader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/websocket/V;", "Lkotlinx/coroutines/T;", "a", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class V implements kotlinx.coroutines.T {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final W0 f401440b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f401441c;

    /* renamed from: d, reason: collision with root package name */
    public long f401442d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public a f401443e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FrameParser f401444f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C f401445g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C43108m f401446h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final N0 f401447i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebSocketReader.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/websocket/V$a;", "", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f401448b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f401449c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f401450d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f401451e;

        static {
            a aVar = new a("HEADER", 0);
            f401448b = aVar;
            a aVar2 = new a("BODY", 1);
            f401449c = aVar2;
            a aVar3 = new a("CLOSED", 2);
            f401450d = aVar3;
            f401451e = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f401451e.clone();
        }
    }

    /* compiled from: WebSocketReader.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: WebSocketReader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.websocket.WebSocketReader$readerJob$1", f = "WebSocketReader.kt", i = {0}, l = {40}, m = "invokeSuspend", n = {"buffer"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public ByteBuffer f401452q;

        /* renamed from: r, reason: collision with root package name */
        public int f401453r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.pool.h<ByteBuffer> f401454s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ V f401455t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.ktor.utils.io.pool.h<ByteBuffer> hVar, V v12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f401454s = hVar;
            this.f401455t = v12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new c(this.f401454s, this.f401455t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Throwable th2;
            ByteBuffer byteBuffer;
            ProtocolViolationException e12;
            FrameTooBigException e13;
            C43108m c43108m;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f401453r;
            io.ktor.utils.io.pool.h<ByteBuffer> hVar = this.f401454s;
            V v12 = this.f401455t;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ByteBuffer byteBuffer2 = (ByteBuffer) hVar.S2();
                    try {
                        this.f401452q = byteBuffer2;
                        this.f401453r = 1;
                    } catch (ChannelIOException unused) {
                        byteBuffer = byteBuffer2;
                        v12.f401446h.c(null);
                        hVar.G4(byteBuffer);
                        c43108m = v12.f401446h;
                        c43108m.h(null);
                        return G0.f406611a;
                    } catch (FrameTooBigException e14) {
                        byteBuffer = byteBuffer2;
                        e13 = e14;
                        v12.f401446h.h(e13);
                        hVar.G4(byteBuffer);
                        c43108m = v12.f401446h;
                        c43108m.h(null);
                        return G0.f406611a;
                    } catch (ProtocolViolationException e15) {
                        byteBuffer = byteBuffer2;
                        e12 = e15;
                        v12.f401446h.h(e12);
                        hVar.G4(byteBuffer);
                        c43108m = v12.f401446h;
                        c43108m.h(null);
                        return G0.f406611a;
                    } catch (ClosedChannelException unused2) {
                        byteBuffer = byteBuffer2;
                        hVar.G4(byteBuffer);
                        c43108m = v12.f401446h;
                        c43108m.h(null);
                        return G0.f406611a;
                    } catch (CancellationException unused3) {
                        byteBuffer = byteBuffer2;
                        hVar.G4(byteBuffer);
                        c43108m = v12.f401446h;
                        c43108m.h(null);
                        return G0.f406611a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                    if (V.b(v12, byteBuffer2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    byteBuffer = byteBuffer2;
                    hVar.G4(byteBuffer);
                    c43108m = v12.f401446h;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteBuffer = this.f401452q;
                    try {
                        C42729a0.b(obj);
                        hVar.G4(byteBuffer);
                    } catch (ChannelIOException unused4) {
                        v12.f401446h.c(null);
                        hVar.G4(byteBuffer);
                        c43108m = v12.f401446h;
                        c43108m.h(null);
                        return G0.f406611a;
                    } catch (FrameTooBigException e16) {
                        e13 = e16;
                        v12.f401446h.h(e13);
                        hVar.G4(byteBuffer);
                        c43108m = v12.f401446h;
                        c43108m.h(null);
                        return G0.f406611a;
                    } catch (ProtocolViolationException e17) {
                        e12 = e17;
                        v12.f401446h.h(e12);
                        hVar.G4(byteBuffer);
                        c43108m = v12.f401446h;
                        c43108m.h(null);
                        return G0.f406611a;
                    } catch (ClosedChannelException unused5) {
                        hVar.G4(byteBuffer);
                        c43108m = v12.f401446h;
                        c43108m.h(null);
                        return G0.f406611a;
                    } catch (CancellationException unused6) {
                        hVar.G4(byteBuffer);
                        c43108m = v12.f401446h;
                        c43108m.h(null);
                        return G0.f406611a;
                    } catch (Throwable th4) {
                        th2 = th4;
                        throw th2;
                    }
                    c43108m = v12.f401446h;
                }
                c43108m.h(null);
                return G0.f406611a;
            } catch (Throwable th5) {
                hVar.G4(coroutine_suspended);
                v12.f401446h.h(null);
                throw th5;
            }
        }
    }

    public V(W0 w02, CoroutineContext coroutineContext, long j12, io.ktor.utils.io.pool.h hVar, int i12, C42822w c42822w) {
        this(w02, coroutineContext, j12, (i12 & 8) != 0 ? io.ktor.util.cio.b.f400431a : hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x007d -> B:13:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(io.ktor.websocket.V r7, java.nio.ByteBuffer r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof io.ktor.websocket.Y
            if (r0 == 0) goto L16
            r0 = r9
            io.ktor.websocket.Y r0 = (io.ktor.websocket.Y) r0
            int r1 = r0.f401469u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f401469u = r1
            goto L1b
        L16:
            io.ktor.websocket.Y r0 = new io.ktor.websocket.Y
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.f401467s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401469u
            io.ktor.websocket.V$a r3 = io.ktor.websocket.V.a.f401450d
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            java.nio.ByteBuffer r7 = r0.f401466r
            io.ktor.websocket.V r8 = r0.f401465q
            kotlin.C42729a0.b(r9)
        L34:
            r6 = r8
            r8 = r7
            r7 = r6
            goto L80
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.nio.ByteBuffer r7 = r0.f401466r
            io.ktor.websocket.V r8 = r0.f401465q
            kotlin.C42729a0.b(r9)
            goto L64
        L48:
            kotlin.C42729a0.b(r9)
            r8.clear()
        L4e:
            io.ktor.websocket.V$a r9 = r7.f401443e
            if (r9 == r3) goto L84
            r0.f401465q = r7
            r0.f401466r = r8
            r0.f401469u = r5
            io.ktor.utils.io.W0 r9 = r7.f401440b
            java.lang.Object r9 = r9.w(r8, r0)
            if (r9 != r1) goto L61
            goto L86
        L61:
            r6 = r8
            r8 = r7
            r7 = r6
        L64:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r2 = -1
            if (r9 != r2) goto L70
            r8.f401443e = r3
            goto L84
        L70:
            r7.flip()
            r0.f401465q = r8
            r0.f401466r = r7
            r0.f401469u = r4
            java.lang.Object r9 = r8.e(r7, r0)
            if (r9 != r1) goto L34
            goto L86
        L80:
            r8.compact()
            goto L4e
        L84:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.V.b(io.ktor.websocket.V, java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof io.ktor.websocket.W
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.websocket.W r0 = (io.ktor.websocket.W) r0
            int r1 = r0.f401459t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401459t = r1
            goto L18
        L13:
            io.ktor.websocket.W r0 = new io.ktor.websocket.W
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.f401457r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401459t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            io.ktor.websocket.V r0 = r0.f401456q
            kotlin.C42729a0.b(r13)
            goto La6
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L35:
            kotlin.C42729a0.b(r13)
            io.ktor.websocket.C r13 = r12.f401445g
            int r2 = r13.f401385a
            if (r2 <= 0) goto L40
            goto Lbf
        L40:
            io.ktor.websocket.FrameParser r2 = r12.f401444f
            io.ktor.websocket.FrameType r5 = r2.a()
            io.ktor.websocket.FrameType r6 = io.ktor.websocket.FrameType.f401421i
            if (r5 != r6) goto L4d
            io.ktor.websocket.V$a r5 = io.ktor.websocket.V.a.f401450d
            goto L4f
        L4d:
            io.ktor.websocket.V$a r5 = io.ktor.websocket.V.a.f401448b
        L4f:
            r12.f401443e = r5
            io.ktor.websocket.i$c r5 = io.ktor.websocket.AbstractC41723i.f401555i
            boolean r6 = r2.f401400b
            io.ktor.websocket.FrameType r7 = r2.a()
            java.lang.Integer r8 = r2.f401409k
            java.nio.ByteBuffer r9 = r13.f401386b
            r9.flip()
            java.nio.ByteBuffer r9 = r9.slice()
            if (r8 == 0) goto L7c
            java.nio.ByteBuffer r10 = r13.f401387c
            r10.clear()
            java.nio.IntBuffer r11 = r10.asIntBuffer()
            int r8 = r8.intValue()
            r11.put(r8)
            r10.clear()
            io.ktor.websocket.D.a(r9, r10)
        L7c:
            r13.f401386b = r3
            java.nio.ByteBuffer r13 = r9.asReadOnlyBuffer()
            int r8 = r13.remaining()
            byte[] r8 = new byte[r8]
            r13.get(r8)
            boolean r9 = r2.f401401c
            boolean r10 = r2.f401402d
            boolean r11 = r2.f401403e
            r5.getClass()
            io.ktor.websocket.i r13 = io.ktor.websocket.AbstractC41723i.c.a(r6, r7, r8, r9, r10, r11)
            r0.f401456q = r12
            r0.f401459t = r4
            kotlinx.coroutines.channels.m r2 = r12.f401446h
            java.lang.Object r13 = r2.send(r13, r0)
            if (r13 != r1) goto La5
            return r1
        La5:
            r0 = r12
        La6:
            io.ktor.websocket.FrameParser r13 = r0.f401444f
            java.util.concurrent.atomic.AtomicReference<io.ktor.websocket.FrameParser$State> r0 = r13.f401399a
            io.ktor.websocket.FrameParser$State r1 = io.ktor.websocket.FrameParser.State.f401413e
            io.ktor.websocket.FrameParser$State r2 = io.ktor.websocket.FrameParser.State.f401410b
        Lae:
            boolean r4 = r0.compareAndSet(r1, r2)
            if (r4 == 0) goto Lc2
            r0 = 0
            r13.f401405g = r0
            r1 = 0
            r13.f401408j = r1
            r13.f401407i = r0
            r13.f401409k = r3
        Lbf:
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        Lc2:
            java.lang.Object r4 = r0.get()
            if (r4 != r1) goto Lc9
            goto Lae
        Lc9:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "It should be state BODY but it is "
            r1.<init>(r2)
            java.lang.Object r0 = r0.get()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.V.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f5, code lost:
    
        if (r9.get() != r12) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f7, code lost:
    
        r7.f401443e = io.ktor.websocket.V.a.f401449c;
        r9 = r4.f401408j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0102, code lost:
    
        if (r9 > 2147483647L) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0108, code lost:
    
        if (r9 > r7.f401442d) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010a, code lost:
    
        r4 = (int) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010d, code lost:
    
        if (r8.f401385a != 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010f, code lost:
    
        r8.f401385a = r4;
        r9 = r8.f401386b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0113, code lost:
    
        if (r9 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0119, code lost:
    
        if (r9.capacity() >= r4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011b, code lost:
    
        r8.f401386b = java.nio.ByteBuffer.allocate(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0121, code lost:
    
        r8.f401386b.clear();
        r4 = r8.f401385a;
        r8.f401385a = r4 - io.ktor.util.n0.a(r0, r8.f401386b, r4);
        r1.f401460q = r7;
        r1.f401461r = r0;
        r1.f401464u = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013b, code lost:
    
        if (r7.c(r1) != r3) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0145, code lost:
    
        throw new java.lang.IllegalStateException("remaining should be 0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014d, code lost:
    
        throw new io.ktor.websocket.FrameTooBigException(r4.f401408j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0150, code lost:
    
        return kotlin.G0.f406611a;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.nio.ByteBuffer r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) throws io.ktor.websocket.FrameTooBigException, io.ktor.websocket.ProtocolViolationException {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.V.e(java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF401441c() {
        return this.f401441c;
    }

    public V(@Y61.k W0 w02, @Y61.k CoroutineContext coroutineContext, long j12, @Y61.k io.ktor.utils.io.pool.h<ByteBuffer> hVar) {
        this.f401440b = w02;
        this.f401441c = coroutineContext;
        this.f401442d = j12;
        this.f401443e = a.f401448b;
        this.f401444f = new FrameParser();
        this.f401445g = new C();
        this.f401446h = kotlinx.coroutines.channels.A.a(8, null, null, 6);
        this.f401447i = C43259k.c(this, new kotlinx.coroutines.S("ws-reader"), CoroutineStart.f410682d, new c(hVar, this, null));
    }
}
