package io.ktor.utils.io;

import androidx.compose.foundation.text.selection.C21030p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.core.C41628a;
import io.ktor.utils.io.core.C41635h;
import io.ktor.utils.io.core.C41638k;
import io.ktor.utils.io.core.C41640m;
import io.ktor.utils.io.core.C41641n;
import io.ktor.utils.io.core.InsufficientSpaceException;
import io.ktor.utils.io.internal.j;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C42729a0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.C42822w;

/* compiled from: ByteBufferChannel.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\u001bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR*\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lio/ktor/utils/io/a;", "Lio/ktor/utils/io/X;", "Lio/ktor/utils/io/W0;", "Lio/ktor/utils/io/d1;", "Lio/ktor/utils/io/T1;", "Lio/ktor/utils/io/O1;", "Lio/ktor/utils/io/P1;", "Lio/ktor/utils/io/internal/g;", "joining", "Lio/ktor/utils/io/internal/g;", "Lkotlinx/coroutines/N0;", "attachedJob", "Lkotlinx/coroutines/N0;", "", "<set-?>", "totalBytesRead", "J", "getTotalBytesRead", "()J", "setTotalBytesRead$ktor_io", "(J)V", "totalBytesWritten", "getTotalBytesWritten", "setTotalBytesWritten$ktor_io", "", "writeSuspensionSize", "I", "a", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.utils.io.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41619a implements X, W0, InterfaceC41649d1, T1, O1, P1 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f400817l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f400818m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f400819n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f400820o;

    @Y61.k
    private volatile /* synthetic */ Object _closed;

    @Y61.k
    private volatile /* synthetic */ Object _readOp;

    @Y61.k
    private volatile /* synthetic */ Object _state;

    @Y61.k
    volatile /* synthetic */ Object _writeOp;

    @Y61.l
    private volatile kotlinx.coroutines.N0 attachedJob;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f400821b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.ktor.utils.io.pool.h<j.c> f400822c;

    /* renamed from: d, reason: collision with root package name */
    public final int f400823d;

    /* renamed from: e, reason: collision with root package name */
    public int f400824e;

    /* renamed from: f, reason: collision with root package name */
    public int f400825f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.ktor.utils.io.internal.i f400826g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.ktor.utils.io.internal.u f400827h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.ktor.utils.io.internal.d<Boolean> f400828i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.ktor.utils.io.internal.d<kotlin.G0> f400829j;

    @Y61.l
    private volatile io.ktor.utils.io.internal.g joining;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Continuation<? super kotlin.G0>, Object> f400830k;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    private volatile int writeSuspensionSize;

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/a$a;", "", "<init>", "()V", "", "ReservedLongIndex", "I", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.a$a, reason: collision with other inner class name */
    public static final class C11423a {
        public /* synthetic */ C11423a(C42822w c42822w) {
            this();
        }

        public C11423a() {
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: io.ktor.utils.io.a$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            C41619a c41619a = C41619a.this;
            c41619a.attachedJob = null;
            if (th3 != null) {
                Throwable th4 = th3;
                while (th4 instanceof CancellationException) {
                    if (th4.equals(th4.getCause())) {
                        break;
                    }
                    Throwable cause = th4.getCause();
                    if (cause == null) {
                        break;
                    }
                    th4 = cause;
                }
                th3 = th4;
                c41619a.h(th3);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {2437}, m = "readByte", n = {"this_$iv", "size$iv"}, s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.a$c */
    public static final class c extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public C41619a f400832q;

        /* renamed from: r, reason: collision with root package name */
        public int f400833r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f400834s;

        /* renamed from: u, reason: collision with root package name */
        public int f400836u;

        public c(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f400834s = obj;
            this.f400836u |= BeduinInputModel.MIN_TEXT_VERSION;
            return C41619a.this.n(this);
        }
    }

    /* compiled from: ByteBufferChannel.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/Continuation;", "Lkotlin/G0;", "ucont", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: io.ktor.utils.io.a$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Continuation<? super kotlin.G0>, Object> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super kotlin.G0> continuation) throws Throwable {
            Continuation<? super kotlin.G0> continuation2 = continuation;
            int i12 = C41619a.this.writeSuspensionSize;
            loop0: while (true) {
                io.ktor.utils.io.internal.e eVarM = C41619a.M(C41619a.this);
                if (eVarM != null) {
                    W.a(eVarM.a());
                    throw null;
                }
                if (!C41619a.this.f1(i12)) {
                    int i13 = kotlin.Z.f406624c;
                    continuation2.resumeWith(kotlin.G0.f406611a);
                    break;
                }
                C41619a c41619a = C41619a.this;
                Continuation continuationIntercepted = IntrinsicsKt.intercepted(continuation2);
                C41619a c41619a2 = C41619a.this;
                while (((Continuation) c41619a._writeOp) == null) {
                    if (!c41619a2.f1(i12)) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41619a.f400820o;
                    while (!atomicReferenceFieldUpdater.compareAndSet(c41619a, null, continuationIntercepted)) {
                        if (atomicReferenceFieldUpdater.get(c41619a) != null) {
                            break;
                        }
                    }
                    if (c41619a2.f1(i12)) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C41619a.f400820o;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(c41619a, continuationIntercepted, null)) {
                        if (atomicReferenceFieldUpdater2.get(c41619a) != continuationIntercepted) {
                            break loop0;
                        }
                    }
                }
                throw new IllegalStateException("Operation is already in progress");
            }
            C41619a.this.a0(i12);
            if (C41619a.this.I0()) {
                C41619a.this.D0();
            }
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
    }

    static {
        new C11423a(null);
        f400817l = AtomicReferenceFieldUpdater.newUpdater(C41619a.class, Object.class, "_state");
        f400818m = AtomicReferenceFieldUpdater.newUpdater(C41619a.class, Object.class, "_closed");
        f400819n = AtomicReferenceFieldUpdater.newUpdater(C41619a.class, Object.class, "_readOp");
        f400820o = AtomicReferenceFieldUpdater.newUpdater(C41619a.class, Object.class, "_writeOp");
    }

    public C41619a(boolean z12, io.ktor.utils.io.pool.h hVar, int i12, int i13, C42822w c42822w) {
        this(z12, (i13 & 2) != 0 ? io.ktor.utils.io.internal.h.f401034c : hVar, (i13 & 4) != 0 ? 8 : i12);
    }

    public static void A0(C41619a c41619a, io.ktor.utils.io.internal.g gVar) {
        if (((io.ktor.utils.io.internal.j) c41619a._state) != j.f.f401051c) {
            return;
        }
        gVar.getClass();
        throw null;
    }

    public static void F0(int i12, ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        byteBuffer.limit(byteBuffer.position() + i12);
        int i13 = i12 - iRemaining;
        for (int i14 = 0; i14 < i13; i14++) {
            byteBuffer.put((byteBuffer.capacity() - 8) + i14, byteBuffer.get(i14));
        }
    }

    public static final io.ktor.utils.io.internal.e M(C41619a c41619a) {
        return (io.ktor.utils.io.internal.e) c41619a._closed;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object P0(io.ktor.utils.io.C41619a r12, int r13, Y41.l r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.P0(io.ktor.utils.io.a, int, Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c8 -> B:43:0x00cb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object V0(io.ktor.utils.io.C41619a r8, byte r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.V0(io.ktor.utils.io.a, byte, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c6 -> B:43:0x00c9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object Z0(io.ktor.utils.io.C41619a r8, int r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.Z0(io.ktor.utils.io.a, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ca -> B:43:0x00cd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a1(io.ktor.utils.io.C41619a r10, long r11, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.a1(io.ktor.utils.io.a, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0166  */
    @kotlin.InterfaceC42830m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c0(io.ktor.utils.io.C41619a r7, Y41.p r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.c0(io.ktor.utils.io.a, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c5 -> B:43:0x00c8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c1(io.ktor.utils.io.C41619a r8, short r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.c1(io.ktor.utils.io.a, short, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object d0(io.ktor.utils.io.C41619a r14, java.nio.ByteBuffer r15, long r16, long r18, long r20, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            r0 = r14
            r1 = r22
            boolean r2 = r1 instanceof io.ktor.utils.io.C41659h
            if (r2 == 0) goto L16
            r2 = r1
            io.ktor.utils.io.h r2 = (io.ktor.utils.io.C41659h) r2
            int r3 = r2.f400972t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f400972t = r3
            goto L1b
        L16:
            io.ktor.utils.io.h r2 = new io.ktor.utils.io.h
            r2.<init>(r14, r1)
        L1b:
            java.lang.Object r1 = r2.f400970r
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f400972t
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2e
            kotlin.jvm.internal.l0$f r0 = r2.f400969q
            kotlin.C42729a0.b(r1)     // Catch: java.io.EOFException -> L5f
            goto L5f
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            kotlin.C42729a0.b(r1)
            kotlin.jvm.internal.l0$f r1 = new kotlin.jvm.internal.l0$f
            r1.<init>()
            r6 = 4088(0xff8, double:2.0197E-320)
            r8 = r18
            long r6 = kotlin.ranges.s.d(r8, r6)
            int r4 = (int) r6
            io.ktor.utils.io.i r13 = new io.ktor.utils.io.i     // Catch: java.io.EOFException -> L5e
            r6 = r13
            r7 = r20
            r9 = r15
            r10 = r16
            r12 = r1
            r6.<init>(r7, r9, r10, r12)     // Catch: java.io.EOFException -> L5e
            r2.f400969q = r1     // Catch: java.io.EOFException -> L5e
            r2.f400972t = r5     // Catch: java.io.EOFException -> L5e
            java.lang.Object r0 = r14.E(r4, r13, r2)     // Catch: java.io.EOFException -> L5e
            if (r0 != r3) goto L5e
            return r3
        L5e:
            r0 = r1
        L5f:
            int r0 = r0.f406840b
            long r0 = (long) r0
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.d0(io.ktor.utils.io.a, java.nio.ByteBuffer, long, long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.G0] */
    @kotlin.InterfaceC42830m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object g1(io.ktor.utils.io.C41619a r4, Y41.p r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.U
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.U r0 = (io.ktor.utils.io.U) r0
            int r1 = r0.f400770t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400770t = r1
            goto L18
        L13:
            io.ktor.utils.io.U r0 = new io.ktor.utils.io.U
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f400768r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400770t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            io.ktor.utils.io.internal.u r4 = r0.f400767q
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L48
        L2b:
            r5 = move-exception
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C42729a0.b(r6)
            io.ktor.utils.io.internal.u r4 = r4.f400827h
            r4.d()
            r0.f400767q = r4     // Catch: java.lang.Throwable -> L2b
            r0.f400770t = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = r5.invoke(r4, r0)     // Catch: java.lang.Throwable -> L2b
            if (r5 != r1) goto L48
            return r1
        L48:
            r4.e()
            kotlin.G0 r4 = kotlin.G0.f406611a
            return r4
        L4e:
            r4.e()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.g1(io.ktor.utils.io.a, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static int i0(C41619a c41619a, io.ktor.utils.io.core.internal.b bVar, int i12, int i13) throws Throwable {
        int iH2;
        boolean z12;
        if ((i13 & 4) != 0) {
            i12 = bVar.f400878e - bVar.f400876c;
        }
        int i14 = 0;
        do {
            ByteBuffer byteBufferG0 = c41619a.G0();
            if (byteBufferG0 == null) {
                z12 = false;
                iH2 = 0;
            } else {
                io.ktor.utils.io.internal.l lVar = ((io.ktor.utils.io.internal.j) c41619a._state).f401040b;
                try {
                    if (lVar._availableForRead$internal == 0) {
                        c41619a.B0();
                        c41619a.M0();
                        z12 = false;
                        iH2 = 0;
                    } else {
                        int i15 = bVar.f400878e - bVar.f400876c;
                        iH2 = lVar.h(Math.min(byteBufferG0.remaining(), Math.min(i15, i12)));
                        if (iH2 <= 0) {
                            z12 = false;
                        } else {
                            if (i15 < byteBufferG0.remaining()) {
                                byteBufferG0.limit(byteBufferG0.position() + i15);
                            }
                            int iRemaining = byteBufferG0.remaining();
                            int i16 = bVar.f400876c;
                            int i17 = bVar.f400878e - i16;
                            if (i17 < iRemaining) {
                                throw new InsufficientSpaceException("buffer content", iRemaining, i17);
                            }
                            V31.h.b(byteBufferG0, bVar.f400874a, i16);
                            bVar.a(iRemaining);
                            c41619a.S(byteBufferG0, lVar, iH2);
                            z12 = true;
                        }
                    }
                } finally {
                    c41619a.B0();
                    c41619a.M0();
                }
            }
            i14 += iH2;
            i12 -= iH2;
            if (!z12 || bVar.f400878e <= bVar.f400876c) {
                break;
            }
        } while (((io.ktor.utils.io.internal.j) c41619a._state).f401040b._availableForRead$internal > 0);
        return i14;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object w0(io.ktor.utils.io.C41619a r5, int r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.C
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.C r0 = (io.ktor.utils.io.C) r0
            int r1 = r0.f400571t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400571t = r1
            goto L18
        L13:
            io.ktor.utils.io.C r0 = new io.ktor.utils.io.C
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f400569r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400571t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.StringBuilder r5 = r0.f400568q
            kotlin.C42729a0.b(r7)
            goto L5e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r0.f400568q = r7
            r0.f400571t = r3
            java.lang.Object r2 = r5._state
            io.ktor.utils.io.internal.j r2 = (io.ktor.utils.io.internal.j) r2
            io.ktor.utils.io.internal.j$f r3 = io.ktor.utils.io.internal.j.f.f401051c
            if (r2 != r3) goto L54
            java.lang.Throwable r5 = r5.g()
            if (r5 != 0) goto L53
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            goto L58
        L53:
            throw r5
        L54:
            java.lang.Object r5 = r5.x0(r7, r6, r0)
        L58:
            if (r5 != r1) goto L5b
            return r1
        L5b:
            r4 = r7
            r7 = r5
            r5 = r4
        L5e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 != 0) goto L68
            r5 = 0
            return r5
        L68:
            java.lang.String r5 = r5.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.w0(io.ktor.utils.io.a, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Integer] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x008d -> B:39:0x0090). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.io.W0
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.C41694t
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.t r0 = (io.ktor.utils.io.C41694t) r0
            int r1 = r0.f401301u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401301u = r1
            goto L18
        L13:
            io.ktor.utils.io.t r0 = new io.ktor.utils.io.t
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f401299s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401301u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r2 = r0.f401298r
            io.ktor.utils.io.a r4 = r0.f401297q
            kotlin.C42729a0.b(r10)
            goto L90
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L35:
            kotlin.C42729a0.b(r10)
            r10 = 4
            r4 = r9
            r2 = r10
        L3b:
            kotlin.jvm.internal.l0$h r10 = new kotlin.jvm.internal.l0$h
            r10.<init>()
            java.nio.ByteBuffer r5 = r4.G0()
            r6 = 0
            if (r5 != 0) goto L48
            goto L78
        L48:
            java.lang.Object r7 = r4._state
            io.ktor.utils.io.internal.j r7 = (io.ktor.utils.io.internal.j) r7
            io.ktor.utils.io.internal.l r7 = r7.f401040b
            int r8 = r7._availableForRead$internal     // Catch: java.lang.Throwable -> La7
            if (r8 != 0) goto L59
        L52:
            r4.B0()
            r4.M0()
            goto L78
        L59:
            boolean r8 = r7.i(r2)     // Catch: java.lang.Throwable -> La7
            if (r8 != 0) goto L60
            goto L52
        L60:
            int r6 = r5.remaining()     // Catch: java.lang.Throwable -> La7
            if (r6 >= r2) goto L69
            F0(r2, r5)     // Catch: java.lang.Throwable -> La7
        L69:
            int r6 = r5.getInt()     // Catch: java.lang.Throwable -> La7
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)     // Catch: java.lang.Throwable -> La7
            r10.f406842b = r6     // Catch: java.lang.Throwable -> La7
            r4.S(r5, r7, r2)     // Catch: java.lang.Throwable -> La7
            r6 = r3
            goto L52
        L78:
            if (r6 == 0) goto L83
            T r10 = r10.f406842b
            if (r10 != 0) goto L80
            r10 = 0
            goto L82
        L80:
            java.lang.Number r10 = (java.lang.Number) r10
        L82:
            return r10
        L83:
            r0.f401297q = r4
            r0.f401298r = r2
            r0.f401301u = r3
            java.lang.Object r10 = r4.t0(r2, r0)
            if (r10 != r1) goto L90
            return r1
        L90:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L99
            goto L3b
        L99:
            kotlinx.coroutines.channels.ClosedReceiveChannelException r10 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r0 = "EOF while "
            java.lang.String r1 = " bytes expected"
            java.lang.String r0 = androidx.camera.camera2.internal.G.e(r2, r0, r1)
            r10.<init>(r0)
            throw r10
        La7:
            r10 = move-exception
            r4.B0()
            r4.M0()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.A(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.O1
    @Y61.k
    public final b2 B() {
        return this.f400826g;
    }

    public final void B0() {
        io.ktor.utils.io.internal.j jVarF;
        io.ktor.utils.io.internal.j jVar = null;
        loop0: while (true) {
            Object obj = this._state;
            io.ktor.utils.io.internal.j jVar2 = (io.ktor.utils.io.internal.j) obj;
            j.b bVar = (j.b) jVar;
            if (bVar != null) {
                bVar.f401040b.f();
                E0();
                jVar = null;
            }
            jVarF = jVar2.f();
            if ((jVarF instanceof j.b) && ((io.ktor.utils.io.internal.j) this._state) == jVar2 && jVarF.f401040b.g()) {
                jVarF = j.a.f401041c;
                jVar = jVarF;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f400817l;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, jVarF)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        }
        j.a aVar = j.a.f401041c;
        if (jVarF == aVar) {
            j.b bVar2 = (j.b) jVar;
            if (bVar2 != null) {
                y0(bVar2.f401042c);
            }
            E0();
            return;
        }
        if (jVarF instanceof j.b) {
            io.ktor.utils.io.internal.l lVar = jVarF.f401040b;
            if (lVar._availableForWrite$internal == lVar.f401058a && jVarF.f401040b.g()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f400817l;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, jVarF, aVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != jVarF) {
                        return;
                    }
                }
                jVarF.f401040b.f();
                y0(((j.b) jVarF).f401042c);
                E0();
            }
        }
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object C(long j12, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        long j13 = 0;
        if (j12 < 0) {
            throw new IllegalArgumentException(C21030p.a(j12, "max shouldn't be negative: ").toString());
        }
        ByteBuffer byteBufferG0 = G0();
        if (byteBufferG0 != null) {
            io.ktor.utils.io.internal.l lVar = ((io.ktor.utils.io.internal.j) this._state).f401040b;
            try {
                if (lVar._availableForRead$internal != 0) {
                    int iH2 = lVar.h((int) Math.min(2147483647L, j12));
                    S(byteBufferG0, lVar, iH2);
                    j13 = iH2;
                }
            } finally {
                B0();
                M0();
            }
        }
        long j14 = j13;
        return (j14 == j12 || x()) ? Boxing.boxLong(j14) : Y(j14, j12, continuationImpl);
    }

    public final void C0() {
        io.ktor.utils.io.internal.j jVarG;
        j.b bVar;
        io.ktor.utils.io.internal.j jVar = null;
        loop0: while (true) {
            Object obj = this._state;
            jVarG = ((io.ktor.utils.io.internal.j) obj).g();
            if (jVarG instanceof j.b) {
                io.ktor.utils.io.internal.l lVar = jVarG.f401040b;
                if (lVar._availableForWrite$internal == lVar.f401058a) {
                    jVarG = j.a.f401041c;
                    jVar = jVarG;
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f400817l;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, jVarG)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        }
        if (jVarG != j.a.f401041c || (bVar = (j.b) jVar) == null) {
            return;
        }
        y0(bVar.f401042c);
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Object D(@Y61.k byte[] bArr, int i12, int i13, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        io.ktor.utils.io.internal.g gVar = this.joining;
        if (gVar != null) {
            A0(this, gVar);
        }
        while (i13 > 0) {
            int iQ02 = Q0(i12, i13, bArr);
            if (iQ02 == 0) {
                break;
            }
            i12 += iQ02;
            i13 -= iQ02;
        }
        if (i13 == 0) {
            return kotlin.G0.f406611a;
        }
        Object objX0 = X0(bArr, i12, i13, continuationImpl);
        return objX0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objX0 : kotlin.G0.f406611a;
    }

    public final void D0() {
        Continuation continuation = (Continuation) f400819n.getAndSet(this, null);
        if (continuation != null) {
            io.ktor.utils.io.internal.e eVar = (io.ktor.utils.io.internal.e) this._closed;
            Throwable th2 = eVar != null ? eVar.f401030a : null;
            if (th2 != null) {
                int i12 = kotlin.Z.f406624c;
                continuation.resumeWith(new Z.b(th2));
            } else {
                int i13 = kotlin.Z.f406624c;
                continuation.resumeWith(Boolean.TRUE);
            }
        }
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object E(int i12, @Y61.k Y41.l lVar, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        int i13;
        if (i12 < 0) {
            throw new IllegalArgumentException("min should be positive or zero");
        }
        ByteBuffer byteBufferG0 = G0();
        boolean z12 = false;
        if (byteBufferG0 != null) {
            io.ktor.utils.io.internal.l lVar2 = ((io.ktor.utils.io.internal.j) this._state).f401040b;
            try {
                if (lVar2._availableForRead$internal != 0 && (i13 = lVar2._availableForRead$internal) > 0 && i13 >= i12) {
                    int iPosition = byteBufferG0.position();
                    int iLimit = byteBufferG0.limit();
                    lVar.invoke(byteBufferG0);
                    if (iLimit != byteBufferG0.limit()) {
                        throw new IllegalStateException("Buffer limit modified.");
                    }
                    int iPosition2 = byteBufferG0.position() - iPosition;
                    if (iPosition2 < 0) {
                        throw new IllegalStateException("Position has been moved backward: pushback is not supported.");
                    }
                    if (!lVar2.i(iPosition2)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    S(byteBufferG0, lVar2, iPosition2);
                    z12 = true;
                }
            } finally {
                B0();
                M0();
            }
        }
        if (z12) {
            return kotlin.G0.f406611a;
        }
        if (x() && i12 > 0) {
            throw new EOFException(androidx.camera.camera2.internal.G.e(i12, "Got EOF but at least ", " bytes were expected"));
        }
        Object objM0 = m0(i12, lVar, continuationImpl);
        return objM0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM0 : kotlin.G0.f406611a;
    }

    public final void E0() {
        while (true) {
            Continuation continuation = (Continuation) this._writeOp;
            if (continuation == null) {
                return;
            }
            io.ktor.utils.io.internal.e eVar = (io.ktor.utils.io.internal.e) this._closed;
            if (eVar == null && this.joining != null) {
                io.ktor.utils.io.internal.j jVar = (io.ktor.utils.io.internal.j) this._state;
                if (!(jVar instanceof j.g) && !(jVar instanceof j.e) && jVar != j.f.f401051c) {
                    return;
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f400820o;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, continuation, null)) {
                if (atomicReferenceFieldUpdater.get(this) != continuation) {
                    break;
                }
            }
            if (eVar == null) {
                int i12 = kotlin.Z.f406624c;
                continuation.resumeWith(kotlin.G0.f406611a);
                return;
            } else {
                int i13 = kotlin.Z.f406624c;
                continuation.resumeWith(new Z.b(eVar.a()));
                return;
            }
        }
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    /* renamed from: F, reason: from getter */
    public final boolean getF400978b() {
        return this.f400821b;
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Object G(int i12, @Y61.k Y41.l lVar, @Y61.k ContinuationImpl continuationImpl) {
        return P0(this, 1, lVar, continuationImpl);
    }

    public final ByteBuffer G0() throws Throwable {
        Throwable th2;
        Throwable th3;
        while (true) {
            Object obj = this._state;
            io.ktor.utils.io.internal.j jVar = (io.ktor.utils.io.internal.j) obj;
            if (kotlin.jvm.internal.L.f(jVar, j.f.f401051c) ? true : kotlin.jvm.internal.L.f(jVar, j.a.f401041c)) {
                io.ktor.utils.io.internal.e eVar = (io.ktor.utils.io.internal.e) this._closed;
                if (eVar == null || (th2 = eVar.f401030a) == null) {
                    return null;
                }
                W.a(th2);
                throw null;
            }
            io.ktor.utils.io.internal.e eVar2 = (io.ktor.utils.io.internal.e) this._closed;
            if (eVar2 != null && (th3 = eVar2.f401030a) != null) {
                W.a(th3);
                throw null;
            }
            if (jVar.f401040b._availableForRead$internal == 0) {
                return null;
            }
            io.ktor.utils.io.internal.j jVarD = jVar.d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f400817l;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, jVarD)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ByteBuffer f401044d = jVarD.getF401044d();
            e0(f401044d, this.f400824e, jVarD.f401040b._availableForRead$internal);
            return f401044d;
        }
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object H(@Y61.k byte[] bArr, int i12, int i13, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        int iG02 = g0(i12, i13, bArr);
        if (iG02 == 0 && ((io.ktor.utils.io.internal.e) this._closed) != null) {
            iG02 = ((io.ktor.utils.io.internal.j) this._state).f401040b.c() ? g0(i12, i13, bArr) : -1;
        } else if (iG02 <= 0 && i13 != 0) {
            return k0(bArr, i12, i13, continuationImpl);
        }
        return Boxing.boxInt(iG02);
    }

    @Y61.l
    public final ByteBuffer H0() throws Throwable {
        io.ktor.utils.io.internal.j jVarE;
        j.c cVar;
        Continuation continuation = (Continuation) this._writeOp;
        if (continuation != null) {
            throw new IllegalStateException("Write operation is already in progress: " + continuation);
        }
        j.c cVarS2 = null;
        while (true) {
            Object obj = this._state;
            io.ktor.utils.io.internal.j jVar = (io.ktor.utils.io.internal.j) obj;
            if (this.joining != null) {
                if (cVarS2 != null) {
                    y0(cVarS2);
                }
                return null;
            }
            if (((io.ktor.utils.io.internal.e) this._closed) != null) {
                if (cVarS2 != null) {
                    y0(cVarS2);
                }
                W.a(((io.ktor.utils.io.internal.e) this._closed).a());
                throw null;
            }
            if (jVar == j.a.f401041c) {
                if (cVarS2 == null) {
                    cVarS2 = this.f400822c.S2();
                    cVarS2.f401040b.f();
                }
                jVarE = cVarS2.f401047g;
            } else {
                if (jVar == j.f.f401051c) {
                    if (cVarS2 != null) {
                        y0(cVarS2);
                    }
                    if (this.joining != null) {
                        return null;
                    }
                    W.a(((io.ktor.utils.io.internal.e) this._closed).a());
                    throw null;
                }
                jVarE = jVar.e();
            }
            io.ktor.utils.io.internal.j jVar2 = jVarE;
            cVar = cVarS2;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f400817l;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, jVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (((io.ktor.utils.io.internal.e) this._closed) != null) {
                C0();
                M0();
                W.a(((io.ktor.utils.io.internal.e) this._closed).a());
                throw null;
            }
            ByteBuffer f401043c = jVar2.getF401043c();
            if (cVar != null) {
                if ((jVar != null ? jVar : null) != j.a.f401041c) {
                    y0(cVar);
                }
            }
            e0(f401043c, this.f400825f, jVar2.f401040b._availableForWrite$internal);
            return f401043c;
            cVarS2 = cVar;
        }
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object I(long j12, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        if (!r()) {
            return s0(j12, continuationImpl);
        }
        Throwable thG = g();
        if (thG != null) {
            W.a(thG);
            throw null;
        }
        C41640m c41640m = new C41640m(null, 1, null);
        try {
            io.ktor.utils.io.core.internal.b bVarM = c41640m.m(1);
            while (true) {
                try {
                    if (bVarM.f400878e - bVarM.f400876c > j12) {
                        bVarM.f((int) j12);
                    }
                    j12 -= i0(this, bVarM, 0, 6);
                    if (j12 <= 0 || x()) {
                        break;
                    }
                    bVarM = io.ktor.utils.io.core.internal.i.c(c41640m, 1, bVarM);
                } catch (Throwable th2) {
                    c41640m.a();
                    throw th2;
                }
            }
            c41640m.a();
            return c41640m.y();
        } catch (Throwable th3) {
            c41640m.close();
            throw th3;
        }
    }

    public final boolean I0() {
        return this.joining != null && (((io.ktor.utils.io.internal.j) this._state) == j.a.f401041c || (((io.ktor.utils.io.internal.j) this._state) instanceof j.b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x008e -> B:39:0x0091). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.io.W0
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof io.ktor.utils.io.C41697u
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.u r0 = (io.ktor.utils.io.C41697u) r0
            int r1 = r0.f401311u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401311u = r1
            goto L18
        L13:
            io.ktor.utils.io.u r0 = new io.ktor.utils.io.u
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f401309s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401311u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r2 = r0.f401308r
            io.ktor.utils.io.a r4 = r0.f401307q
            kotlin.C42729a0.b(r11)
            goto L91
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L35:
            kotlin.C42729a0.b(r11)
            r11 = 8
            r4 = r10
            r2 = r11
        L3c:
            kotlin.jvm.internal.l0$h r11 = new kotlin.jvm.internal.l0$h
            r11.<init>()
            java.nio.ByteBuffer r5 = r4.G0()
            r6 = 0
            if (r5 != 0) goto L49
            goto L79
        L49:
            java.lang.Object r7 = r4._state
            io.ktor.utils.io.internal.j r7 = (io.ktor.utils.io.internal.j) r7
            io.ktor.utils.io.internal.l r7 = r7.f401040b
            int r8 = r7._availableForRead$internal     // Catch: java.lang.Throwable -> La8
            if (r8 != 0) goto L5a
        L53:
            r4.B0()
            r4.M0()
            goto L79
        L5a:
            boolean r8 = r7.i(r2)     // Catch: java.lang.Throwable -> La8
            if (r8 != 0) goto L61
            goto L53
        L61:
            int r6 = r5.remaining()     // Catch: java.lang.Throwable -> La8
            if (r6 >= r2) goto L6a
            F0(r2, r5)     // Catch: java.lang.Throwable -> La8
        L6a:
            long r8 = r5.getLong()     // Catch: java.lang.Throwable -> La8
            java.lang.Long r6 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r8)     // Catch: java.lang.Throwable -> La8
            r11.f406842b = r6     // Catch: java.lang.Throwable -> La8
            r4.S(r5, r7, r2)     // Catch: java.lang.Throwable -> La8
            r6 = r3
            goto L53
        L79:
            if (r6 == 0) goto L84
            T r11 = r11.f406842b
            if (r11 != 0) goto L81
            r11 = 0
            goto L83
        L81:
            java.lang.Number r11 = (java.lang.Number) r11
        L83:
            return r11
        L84:
            r0.f401307q = r4
            r0.f401308r = r2
            r0.f401311u = r3
            java.lang.Object r11 = r4.t0(r2, r0)
            if (r11 != r1) goto L91
            return r1
        L91:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L9a
            goto L3c
        L9a:
            kotlinx.coroutines.channels.ClosedReceiveChannelException r11 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r0 = "EOF while "
            java.lang.String r1 = " bytes expected"
            java.lang.String r0 = androidx.camera.camera2.internal.G.e(r2, r0, r1)
            r11.<init>(r0)
            throw r11
        La8:
            r11 = move-exception
            r4.B0()
            r4.M0()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.J(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d3, code lost:
    
        r5 = kotlin.Z.f406624c;
        r6.resumeWith(java.lang.Boolean.TRUE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J0(int r5, kotlin.coroutines.Continuation r6) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.J0(int, kotlin.coroutines.Continuation):void");
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object K(@Y61.k byte[] bArr, int i12, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        int iG02 = g0(0, i12, bArr);
        if (iG02 >= i12) {
            return kotlin.G0.f406611a;
        }
        Object objQ0 = q0(bArr, iG02, i12 - iG02, continuationImpl);
        return objQ0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objQ0 : kotlin.G0.f406611a;
    }

    public final boolean K0(io.ktor.utils.io.internal.g gVar) {
        if (!L0(true)) {
            return false;
        }
        Z(gVar);
        Continuation continuation = (Continuation) f400819n.getAndSet(this, null);
        if (continuation != null) {
            int i12 = kotlin.Z.f406624c;
            continuation.resumeWith(new Z.b(new IllegalStateException("Joining is in progress")));
        }
        E0();
        return true;
    }

    @Override // io.ktor.utils.io.P1
    @Y61.l
    public final k2 L() {
        io.ktor.utils.io.internal.u uVar = this.f400827h;
        uVar.d();
        return uVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean L0(boolean r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r8._state
            r3 = r2
            io.ktor.utils.io.internal.j r3 = (io.ktor.utils.io.internal.j) r3
            java.lang.Object r4 = r8._closed
            io.ktor.utils.io.internal.e r4 = (io.ktor.utils.io.internal.e) r4
            if (r1 == 0) goto L1e
            if (r4 == 0) goto L12
            java.lang.Throwable r5 = r4.f401030a
            goto L13
        L12:
            r5 = r0
        L13:
            if (r5 != 0) goto L1a
            io.ktor.utils.io.internal.l r1 = r1.f401040b
            r1.f()
        L1a:
            r8.E0()
            r1 = r0
        L1e:
            io.ktor.utils.io.internal.j$f r5 = io.ktor.utils.io.internal.j.f.f401051c
            r6 = 1
            if (r3 != r5) goto L24
            return r6
        L24:
            io.ktor.utils.io.internal.j$a r7 = io.ktor.utils.io.internal.j.a.f401041c
            if (r3 != r7) goto L2a
        L28:
            r3 = r1
            goto L63
        L2a:
            r1 = 0
            if (r4 == 0) goto L50
            boolean r7 = r3 instanceof io.ktor.utils.io.internal.j.b
            if (r7 == 0) goto L50
            io.ktor.utils.io.internal.l r7 = r3.f401040b
            boolean r7 = r7.g()
            if (r7 != 0) goto L3d
            java.lang.Throwable r7 = r4.f401030a
            if (r7 == 0) goto L50
        L3d:
            java.lang.Throwable r4 = r4.f401030a
            if (r4 == 0) goto L4b
            io.ktor.utils.io.internal.l r4 = r3.f401040b
            r4.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = io.ktor.utils.io.internal.l.f401056c
            r7.getAndSet(r4, r1)
        L4b:
            io.ktor.utils.io.internal.j$b r3 = (io.ktor.utils.io.internal.j.b) r3
            io.ktor.utils.io.internal.j$c r1 = r3.f401042c
            goto L28
        L50:
            if (r9 == 0) goto L81
            boolean r4 = r3 instanceof io.ktor.utils.io.internal.j.b
            if (r4 == 0) goto L81
            io.ktor.utils.io.internal.l r4 = r3.f401040b
            boolean r4 = r4.g()
            if (r4 == 0) goto L81
            io.ktor.utils.io.internal.j$b r3 = (io.ktor.utils.io.internal.j.b) r3
            io.ktor.utils.io.internal.j$c r1 = r3.f401042c
            goto L28
        L63:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = io.ktor.utils.io.C41619a.f400817l
        L65:
            boolean r1 = r4.compareAndSet(r8, r2, r5)
            if (r1 == 0) goto L79
            if (r3 == 0) goto L78
            java.lang.Object r9 = r8._state
            io.ktor.utils.io.internal.j r9 = (io.ktor.utils.io.internal.j) r9
            io.ktor.utils.io.internal.j$f r0 = io.ktor.utils.io.internal.j.f.f401051c
            if (r9 != r0) goto L78
            r8.y0(r3)
        L78:
            return r6
        L79:
            java.lang.Object r1 = r4.get(r8)
            if (r1 == r2) goto L65
            r1 = r3
            goto L2
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.L0(boolean):boolean");
    }

    public final void M0() {
        if (((io.ktor.utils.io.internal.e) this._closed) == null || !L0(false)) {
            return;
        }
        io.ktor.utils.io.internal.g gVar = this.joining;
        if (gVar != null) {
            Z(gVar);
        }
        D0();
        E0();
    }

    public final int N0(C41641n c41641n) throws Throwable {
        io.ktor.utils.io.internal.g gVar = this.joining;
        if (gVar != null) {
            A0(this, gVar);
        }
        ByteBuffer byteBufferH0 = H0();
        if (byteBufferH0 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.l lVar = ((io.ktor.utils.io.internal.j) this._state).f401040b;
        try {
            io.ktor.utils.io.internal.e eVar = (io.ktor.utils.io.internal.e) this._closed;
            if (eVar != null) {
                W.a(eVar.a());
                throw null;
            }
            int iJ2 = lVar.j((int) Math.min(c41641n.o(), byteBufferH0.remaining()));
            if (iJ2 > 0) {
                byteBufferH0.limit(byteBufferH0.position() + iJ2);
                C41638k.a(c41641n, byteBufferH0);
                if (byteBufferH0.hasRemaining()) {
                    throw new EOFException("Not enough data in packet to fill buffer: " + byteBufferH0.remaining() + " more bytes required");
                }
                T(byteBufferH0, lVar, iJ2);
            }
            if (lVar.d() || this.f400821b) {
                a0(1);
            }
            C0();
            M0();
            return iJ2;
        } catch (Throwable th2) {
            if (lVar.d() || this.f400821b) {
                a0(1);
            }
            C0();
            M0();
            throw th2;
        }
    }

    @Y61.l
    public final Object O0(int i12, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        if (!f1(i12)) {
            io.ktor.utils.io.internal.e eVar = (io.ktor.utils.io.internal.e) this._closed;
            if (eVar == null) {
                return kotlin.G0.f406611a;
            }
            W.a(eVar.a());
            throw null;
        }
        this.writeSuspensionSize = i12;
        if (this.attachedJob != null) {
            Object objInvoke = ((d) this.f400830k).invoke(continuationImpl);
            if (objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuationImpl);
            }
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : kotlin.G0.f406611a;
        }
        io.ktor.utils.io.internal.d<kotlin.G0> dVar = this.f400829j;
        ((d) this.f400830k).invoke(dVar);
        Object objD = dVar.d(IntrinsicsKt.intercepted(continuationImpl));
        if (objD == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : kotlin.G0.f406611a;
    }

    @InterfaceC42830m
    public final void P(@Y61.k kotlinx.coroutines.N0 n02) {
        kotlinx.coroutines.N0 n03 = this.attachedJob;
        if (n03 != null) {
            n03.c(null);
        }
        this.attachedJob = n02;
        n02.Q(true, true, new b());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(int r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.C41622b
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.b r0 = (io.ktor.utils.io.C41622b) r0
            int r1 = r0.f400844t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400844t = r1
            goto L18
        L13:
            io.ktor.utils.io.b r0 = new io.ktor.utils.io.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f400842r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400844t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            io.ktor.utils.io.a r5 = r0.f400841q
            kotlin.C42729a0.b(r6)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r6)
            r0.f400841q = r4
            r0.f400844t = r3
            java.lang.Object r6 = r4.t0(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r5 = r4
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L57
            java.lang.Object r0 = r5._state
            io.ktor.utils.io.internal.j r0 = (io.ktor.utils.io.internal.j) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto L57
            r5.G0()
        L57:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.Q(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final int Q0(int i12, int i13, byte[] bArr) throws Throwable {
        io.ktor.utils.io.internal.g gVar = this.joining;
        if (gVar != null) {
            A0(this, gVar);
        }
        ByteBuffer byteBufferH0 = H0();
        int i14 = 0;
        if (byteBufferH0 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.l lVar = ((io.ktor.utils.io.internal.j) this._state).f401040b;
        try {
            io.ktor.utils.io.internal.e eVar = (io.ktor.utils.io.internal.e) this._closed;
            if (eVar != null) {
                W.a(eVar.a());
                throw null;
            }
            while (true) {
                int iJ2 = lVar.j(Math.min(i13 - i14, byteBufferH0.remaining()));
                if (iJ2 == 0) {
                    T(byteBufferH0, lVar, i14);
                    if (lVar.d() || this.f400821b) {
                        a0(1);
                    }
                    C0();
                    M0();
                    return i14;
                }
                if (iJ2 <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                byteBufferH0.put(bArr, i12 + i14, iJ2);
                i14 += iJ2;
                e0(byteBufferH0, V(this.f400825f + i14, byteBufferH0), lVar._availableForWrite$internal);
            }
        } catch (Throwable th2) {
            if (lVar.d() || this.f400821b) {
                a0(1);
            }
            C0();
            M0();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(int r5, Y41.l r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.C41625c
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.c r0 = (io.ktor.utils.io.C41625c) r0
            int r1 = r0.f400856u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400856u = r1
            goto L18
        L13:
            io.ktor.utils.io.c r0 = new io.ktor.utils.io.c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f400854s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400856u
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 == r3) goto L36
            r5 = 2
            if (r2 != r5) goto L2e
            kotlin.C42729a0.b(r7)
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            Y41.l r5 = r0.f400853r
            Y41.l r5 = (Y41.l) r5
            io.ktor.utils.io.a r5 = r0.f400852q
            kotlin.C42729a0.b(r7)
            goto L53
        L40:
            kotlin.C42729a0.b(r7)
            r0.f400852q = r4
            Y41.l r6 = (Y41.l) r6
            r0.f400853r = r6
            r0.f400856u = r3
            java.lang.Object r5 = r4.d1(r5, r0)
            if (r5 != r1) goto L52
            return r1
        L52:
            r5 = r4
        L53:
            io.ktor.utils.io.internal.g r6 = r5.joining
            if (r6 == 0) goto L5a
            A0(r5, r6)
        L5a:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.R(int, Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final int R0(C41628a c41628a) throws Throwable {
        io.ktor.utils.io.internal.g gVar = this.joining;
        if (gVar != null) {
            A0(this, gVar);
        }
        ByteBuffer byteBufferH0 = H0();
        int i12 = 0;
        if (byteBufferH0 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.l lVar = ((io.ktor.utils.io.internal.j) this._state).f401040b;
        try {
            io.ktor.utils.io.internal.e eVar = (io.ktor.utils.io.internal.e) this._closed;
            if (eVar != null) {
                W.a(eVar.a());
                throw null;
            }
            while (true) {
                int iJ2 = lVar.j(Math.min(c41628a.f400876c - c41628a.f400875b, byteBufferH0.remaining()));
                if (iJ2 == 0) {
                    break;
                }
                C41635h.a(c41628a, byteBufferH0, iJ2);
                i12 += iJ2;
                e0(byteBufferH0, V(this.f400825f + i12, byteBufferH0), lVar._availableForWrite$internal);
            }
            T(byteBufferH0, lVar, i12);
            if (lVar.d() || this.f400821b) {
                a0(1);
            }
            C0();
            M0();
            return i12;
        } catch (Throwable th2) {
            if (lVar.d() || this.f400821b) {
                a0(1);
            }
            C0();
            M0();
            throw th2;
        }
    }

    public final void S(ByteBuffer byteBuffer, io.ktor.utils.io.internal.l lVar, int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f400824e = V(this.f400824e + i12, byteBuffer);
        lVar.a(i12);
        this.totalBytesRead += i12;
        E0();
    }

    public final int S0(ByteBuffer byteBuffer) throws Throwable {
        int iJ2;
        io.ktor.utils.io.internal.g gVar = this.joining;
        if (gVar != null) {
            A0(this, gVar);
        }
        ByteBuffer byteBufferH0 = H0();
        int i12 = 0;
        if (byteBufferH0 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.l lVar = ((io.ktor.utils.io.internal.j) this._state).f401040b;
        try {
            io.ktor.utils.io.internal.e eVar = (io.ktor.utils.io.internal.e) this._closed;
            if (eVar != null) {
                W.a(eVar.a());
                throw null;
            }
            int iLimit = byteBuffer.limit();
            while (true) {
                int iPosition = iLimit - byteBuffer.position();
                if (iPosition == 0 || (iJ2 = lVar.j(Math.min(iPosition, byteBufferH0.remaining()))) == 0) {
                    break;
                }
                if (iJ2 <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                byteBuffer.limit(byteBuffer.position() + iJ2);
                byteBufferH0.put(byteBuffer);
                i12 += iJ2;
                e0(byteBufferH0, V(this.f400825f + i12, byteBufferH0), lVar._availableForWrite$internal);
            }
            byteBuffer.limit(iLimit);
            T(byteBufferH0, lVar, i12);
            if (lVar.d() || this.f400821b) {
                a0(1);
            }
            C0();
            M0();
            return i12;
        } catch (Throwable th2) {
            if (lVar.d() || this.f400821b) {
                a0(1);
            }
            C0();
            M0();
            throw th2;
        }
    }

    public final void T(ByteBuffer byteBuffer, io.ktor.utils.io.internal.l lVar, int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f400825f = V(this.f400825f + i12, byteBuffer);
        lVar.b(i12);
        this.totalBytesWritten += i12;
    }

    public final Object T0(io.ktor.utils.io.core.internal.b bVar, Continuation<? super Integer> continuation) throws Throwable {
        C41619a c41619a;
        Object objT0;
        I i12 = (I) continuation;
        int i13 = i12.f400636u;
        if ((i13 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            i12.f400636u = i13 - BeduinInputModel.MIN_TEXT_VERSION;
        } else {
            i12 = new I(this, continuation);
        }
        Object obj = i12.f400634s;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = i12.f400636u;
        if (i14 == 0) {
            C42729a0.b(obj);
            i12.f400632q = this;
            i12.f400633r = bVar;
            i12.f400636u = 1;
            if (d1(1, i12) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c41619a = this;
        } else {
            if (i14 != 1) {
                if (i14 == 2) {
                    C42729a0.b(obj);
                    return obj;
                }
                if (i14 == 3) {
                    C42729a0.b(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = i12.f400633r;
            c41619a = i12.f400632q;
            C42729a0.b(obj);
        }
        io.ktor.utils.io.internal.g gVar = c41619a.joining;
        if (gVar != null) {
            A0(c41619a, gVar);
        }
        i12.f400632q = null;
        i12.f400633r = null;
        i12.f400636u = 3;
        io.ktor.utils.io.internal.g gVar2 = c41619a.joining;
        if (gVar2 != null) {
            A0(c41619a, gVar2);
        }
        int iR02 = c41619a.R0(bVar);
        if (iR02 > 0) {
            objT0 = Boxing.boxInt(iR02);
        } else {
            io.ktor.utils.io.internal.g gVar3 = c41619a.joining;
            if (gVar3 != null) {
                A0(c41619a, gVar3);
            }
            objT0 = c41619a.T0(bVar, i12);
        }
        obj = objT0;
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }

    public final void U(ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity() - this.f400823d;
        int iPosition = byteBuffer.position();
        for (int i12 = iCapacity; i12 < iPosition; i12++) {
            byteBuffer.put(i12 - iCapacity, byteBuffer.get(i12));
        }
    }

    public final Object U0(ByteBuffer byteBuffer, Continuation<? super Integer> continuation) throws Throwable {
        C41619a c41619a;
        Object objU0;
        H h12 = (H) continuation;
        int i12 = h12.f400623u;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            h12.f400623u = i12 - BeduinInputModel.MIN_TEXT_VERSION;
        } else {
            h12 = new H(this, continuation);
        }
        Object obj = h12.f400621s;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = h12.f400623u;
        if (i13 == 0) {
            C42729a0.b(obj);
            h12.f400619q = this;
            h12.f400620r = byteBuffer;
            h12.f400623u = 1;
            if (d1(1, h12) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c41619a = this;
        } else {
            if (i13 != 1) {
                if (i13 == 2) {
                    C42729a0.b(obj);
                    return obj;
                }
                if (i13 == 3) {
                    C42729a0.b(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteBuffer = h12.f400620r;
            c41619a = h12.f400619q;
            C42729a0.b(obj);
        }
        io.ktor.utils.io.internal.g gVar = c41619a.joining;
        if (gVar != null) {
            A0(c41619a, gVar);
        }
        h12.f400619q = null;
        h12.f400620r = null;
        h12.f400623u = 3;
        io.ktor.utils.io.internal.g gVar2 = c41619a.joining;
        if (gVar2 != null) {
            A0(c41619a, gVar2);
        }
        int iS02 = c41619a.S0(byteBuffer);
        if (iS02 > 0) {
            objU0 = Boxing.boxInt(iS02);
        } else {
            io.ktor.utils.io.internal.g gVar3 = c41619a.joining;
            if (gVar3 != null) {
                A0(c41619a, gVar3);
            }
            objU0 = c41619a.U0(byteBuffer, h12);
        }
        obj = objU0;
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }

    public final int V(int i12, ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity();
        int i13 = this.f400823d;
        return i12 >= iCapacity - i13 ? i12 - (byteBuffer.capacity() - i13) : i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x00fc, code lost:
    
        r0 = r1;
        r4 = r16;
        r6 = r17;
        r7 = r18;
        r8 = r19;
        r5 = r23;
        r16 = r2;
        r2 = r27;
        r27 = r28;
        r29 = r14;
        r14 = r20;
     */
    /* JADX WARN: Path cross not found for [B:132:0x02b7, B:134:0x02bb], limit reached: 226 */
    /* JADX WARN: Path cross not found for [B:134:0x02bb, B:132:0x02b7], limit reached: 226 */
    /* JADX WARN: Path cross not found for [B:143:0x02e8, B:150:0x0303], limit reached: 226 */
    /* JADX WARN: Path cross not found for [B:150:0x0303, B:143:0x02e8], limit reached: 226 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b7 A[Catch: all -> 0x038b, TryCatch #3 {all -> 0x038b, blocks: (B:130:0x02b1, B:132:0x02b7, B:138:0x02c6, B:140:0x02d7, B:136:0x02c1), top: B:206:0x02b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c6 A[Catch: all -> 0x038b, TryCatch #3 {all -> 0x038b, blocks: (B:130:0x02b1, B:132:0x02b7, B:138:0x02c6, B:140:0x02d7, B:136:0x02c1), top: B:206:0x02b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e8 A[Catch: all -> 0x004b, TRY_ENTER, TryCatch #4 {all -> 0x004b, blocks: (B:14:0x003b, B:38:0x00ca, B:40:0x00d0, B:42:0x00d4, B:43:0x00d7, B:143:0x02e8, B:146:0x02f0, B:148:0x02fc, B:150:0x0303, B:152:0x0309, B:154:0x0313, B:158:0x033e, B:161:0x0348, B:171:0x0363, B:173:0x0367, B:165:0x0351, B:46:0x00df, B:183:0x039e, B:185:0x03a4, B:189:0x03ae, B:190:0x03b6, B:191:0x03bc, B:187:0x03a8, B:193:0x03bf, B:194:0x03c3, B:21:0x0062), top: B:208:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0309 A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:14:0x003b, B:38:0x00ca, B:40:0x00d0, B:42:0x00d4, B:43:0x00d7, B:143:0x02e8, B:146:0x02f0, B:148:0x02fc, B:150:0x0303, B:152:0x0309, B:154:0x0313, B:158:0x033e, B:161:0x0348, B:171:0x0363, B:173:0x0367, B:165:0x0351, B:46:0x00df, B:183:0x039e, B:185:0x03a4, B:189:0x03ae, B:190:0x03b6, B:191:0x03bc, B:187:0x03a8, B:193:0x03bf, B:194:0x03c3, B:21:0x0062), top: B:208:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0367 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #4 {all -> 0x004b, blocks: (B:14:0x003b, B:38:0x00ca, B:40:0x00d0, B:42:0x00d4, B:43:0x00d7, B:143:0x02e8, B:146:0x02f0, B:148:0x02fc, B:150:0x0303, B:152:0x0309, B:154:0x0313, B:158:0x033e, B:161:0x0348, B:171:0x0363, B:173:0x0367, B:165:0x0351, B:46:0x00df, B:183:0x039e, B:185:0x03a4, B:189:0x03ae, B:190:0x03b6, B:191:0x03bc, B:187:0x03a8, B:193:0x03bf, B:194:0x03c3, B:21:0x0062), top: B:208:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03a4 A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:14:0x003b, B:38:0x00ca, B:40:0x00d0, B:42:0x00d4, B:43:0x00d7, B:143:0x02e8, B:146:0x02f0, B:148:0x02fc, B:150:0x0303, B:152:0x0309, B:154:0x0313, B:158:0x033e, B:161:0x0348, B:171:0x0363, B:173:0x0367, B:165:0x0351, B:46:0x00df, B:183:0x039e, B:185:0x03a4, B:189:0x03ae, B:190:0x03b6, B:191:0x03bc, B:187:0x03a8, B:193:0x03bf, B:194:0x03c3, B:21:0x0062), top: B:208:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a8 A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:14:0x003b, B:38:0x00ca, B:40:0x00d0, B:42:0x00d4, B:43:0x00d7, B:143:0x02e8, B:146:0x02f0, B:148:0x02fc, B:150:0x0303, B:152:0x0309, B:154:0x0313, B:158:0x033e, B:161:0x0348, B:171:0x0363, B:173:0x0367, B:165:0x0351, B:46:0x00df, B:183:0x039e, B:185:0x03a4, B:189:0x03ae, B:190:0x03b6, B:191:0x03bc, B:187:0x03a8, B:193:0x03bf, B:194:0x03c3, B:21:0x0062), top: B:208:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03ae A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:14:0x003b, B:38:0x00ca, B:40:0x00d0, B:42:0x00d4, B:43:0x00d7, B:143:0x02e8, B:146:0x02f0, B:148:0x02fc, B:150:0x0303, B:152:0x0309, B:154:0x0313, B:158:0x033e, B:161:0x0348, B:171:0x0363, B:173:0x0367, B:165:0x0351, B:46:0x00df, B:183:0x039e, B:185:0x03a4, B:189:0x03ae, B:190:0x03b6, B:191:0x03bc, B:187:0x03a8, B:193:0x03bf, B:194:0x03c3, B:21:0x0062), top: B:208:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03bf A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:14:0x003b, B:38:0x00ca, B:40:0x00d0, B:42:0x00d4, B:43:0x00d7, B:143:0x02e8, B:146:0x02f0, B:148:0x02fc, B:150:0x0303, B:152:0x0309, B:154:0x0313, B:158:0x033e, B:161:0x0348, B:171:0x0363, B:173:0x0367, B:165:0x0351, B:46:0x00df, B:183:0x039e, B:185:0x03a4, B:189:0x03ae, B:190:0x03b6, B:191:0x03bc, B:187:0x03a8, B:193:0x03bf, B:194:0x03c3, B:21:0x0062), top: B:208:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0234 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0 A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:14:0x003b, B:38:0x00ca, B:40:0x00d0, B:42:0x00d4, B:43:0x00d7, B:143:0x02e8, B:146:0x02f0, B:148:0x02fc, B:150:0x0303, B:152:0x0309, B:154:0x0313, B:158:0x033e, B:161:0x0348, B:171:0x0363, B:173:0x0367, B:165:0x0351, B:46:0x00df, B:183:0x039e, B:185:0x03a4, B:189:0x03ae, B:190:0x03b6, B:191:0x03bc, B:187:0x03a8, B:193:0x03bf, B:194:0x03c3, B:21:0x0062), top: B:208:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102 A[Catch: all -> 0x0177, TryCatch #10 {all -> 0x0177, blocks: (B:50:0x00fc, B:52:0x0102, B:54:0x0106), top: B:219:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0147 A[Catch: all -> 0x015c, TRY_LEAVE, TryCatch #13 {all -> 0x015c, blocks: (B:60:0x0143, B:62:0x0147), top: B:225:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x02fc -> B:149:0x02ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x0365 -> B:149:0x02ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x0388 -> B:149:0x02ff). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W(@Y61.k io.ktor.utils.io.C41619a r27, long r28, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.W(io.ktor.utils.io.a, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0052 -> B:24:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W0(io.ktor.utils.io.core.C41628a r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.L
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.L r0 = (io.ktor.utils.io.L) r0
            int r1 = r0.f400669u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400669u = r1
            goto L18
        L13:
            io.ktor.utils.io.L r0 = new io.ktor.utils.io.L
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f400667s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400669u
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 == r3) goto L36
            r6 = 2
            if (r2 != r6) goto L2e
            kotlin.C42729a0.b(r7)
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            io.ktor.utils.io.core.a r6 = r0.f400666r
            io.ktor.utils.io.a r2 = r0.f400665q
            kotlin.C42729a0.b(r7)
            goto L55
        L3e:
            kotlin.C42729a0.b(r7)
            r2 = r5
        L42:
            int r7 = r6.f400876c
            int r4 = r6.f400875b
            if (r7 <= r4) goto L60
            r0.f400665q = r2
            r0.f400666r = r6
            r0.f400669u = r3
            java.lang.Object r7 = r2.O0(r3, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            io.ktor.utils.io.internal.g r7 = r2.joining
            if (r7 == 0) goto L5c
            A0(r2, r7)
        L5c:
            r2.R0(r6)
            goto L42
        L60:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.W0(io.ktor.utils.io.core.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.k
    public final io.ktor.utils.io.internal.j X() {
        return (io.ktor.utils.io.internal.j) this._state;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0062 -> B:26:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X0(byte[] r6, int r7, int r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.M
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.M r0 = (io.ktor.utils.io.M) r0
            int r1 = r0.f400681w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400681w = r1
            goto L18
        L13:
            io.ktor.utils.io.M r0 = new io.ktor.utils.io.M
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f400679u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400681w
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r6 = r0.f400678t
            int r7 = r0.f400677s
            byte[] r8 = r0.f400676r
            io.ktor.utils.io.a r2 = r0.f400675q
            kotlin.C42729a0.b(r9)
            goto L65
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.C42729a0.b(r9)
            r2 = r5
        L3d:
            if (r8 <= 0) goto L71
            r0.f400675q = r2
            r0.f400676r = r6
            r0.f400677s = r7
            r0.f400678t = r8
            r0.f400681w = r3
            io.ktor.utils.io.internal.g r9 = r2.joining
            if (r9 == 0) goto L50
            A0(r2, r9)
        L50:
            int r9 = r2.Q0(r7, r8, r6)
            if (r9 <= 0) goto L5b
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)
            goto L5f
        L5b:
            java.lang.Object r9 = r2.e1(r6, r7, r8, r0)
        L5f:
            if (r9 != r1) goto L62
            return r1
        L62:
            r4 = r8
            r8 = r6
            r6 = r4
        L65:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r7 = r7 + r9
            int r6 = r6 - r9
            r4 = r8
            r8 = r6
            r6 = r4
            goto L3d
        L71:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.X0(byte[], int, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[PHI: r10 r12 r13
  PHI (r10v2 long) = (r10v1 long), (r10v6 long) binds: [B:14:0x0037, B:30:0x007c] A[DONT_GENERATE, DONT_INLINE]
  PHI (r12v2 kotlin.jvm.internal.l0$g) = (r12v1 kotlin.jvm.internal.l0$g), (r12v4 kotlin.jvm.internal.l0$g) binds: [B:14:0x0037, B:30:0x007c] A[DONT_GENERATE, DONT_INLINE]
  PHI (r13v1 io.ktor.utils.io.a) = (r13v0 io.ktor.utils.io.a), (r13v2 io.ktor.utils.io.a) binds: [B:14:0x0037, B:30:0x007c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0073 -> B:29:0x0076). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(long r10, long r12, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r14 instanceof io.ktor.utils.io.C41650e
            if (r0 == 0) goto L13
            r0 = r14
            io.ktor.utils.io.e r0 = (io.ktor.utils.io.C41650e) r0
            int r1 = r0.f400941v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400941v = r1
            goto L18
        L13:
            io.ktor.utils.io.e r0 = new io.ktor.utils.io.e
            r0.<init>(r9, r14)
        L18:
            java.lang.Object r14 = r0.f400939t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400941v
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r10 = r0.f400938s
            kotlin.jvm.internal.l0$g r12 = r0.f400937r
            io.ktor.utils.io.a r13 = r0.f400936q
            kotlin.C42729a0.b(r14)
            goto L76
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            kotlin.C42729a0.b(r14)
            kotlin.jvm.internal.l0$g r14 = new kotlin.jvm.internal.l0$g
            r14.<init>()
            r14.f406841b = r10
            r10 = r12
            r12 = r14
            r13 = r9
        L44:
            long r4 = r12.f406841b
            int r14 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r14 >= 0) goto La7
            java.nio.ByteBuffer r14 = r13.G0()
            if (r14 != 0) goto L51
            goto L61
        L51:
            java.lang.Object r2 = r13._state
            io.ktor.utils.io.internal.j r2 = (io.ktor.utils.io.internal.j) r2
            io.ktor.utils.io.internal.l r2 = r2.f401040b
            int r4 = r2._availableForRead$internal     // Catch: java.lang.Throwable -> L9f
            if (r4 != 0) goto L7f
            r13.B0()
            r13.M0()
        L61:
            boolean r14 = r13.x()
            if (r14 != 0) goto La7
            r0.f400936q = r13
            r0.f400937r = r12
            r0.f400938s = r10
            r0.f400941v = r3
            java.lang.Object r14 = r13.t0(r3, r0)
            if (r14 != r1) goto L76
            return r1
        L76:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L44
            goto La7
        L7f:
            long r4 = r12.f406841b     // Catch: java.lang.Throwable -> L9f
            long r4 = r10 - r4
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = java.lang.Math.min(r6, r4)     // Catch: java.lang.Throwable -> L9f
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L9f
            int r4 = r2.h(r4)     // Catch: java.lang.Throwable -> L9f
            r13.S(r14, r2, r4)     // Catch: java.lang.Throwable -> L9f
            long r5 = r12.f406841b     // Catch: java.lang.Throwable -> L9f
            long r7 = (long) r4     // Catch: java.lang.Throwable -> L9f
            long r5 = r5 + r7
            r12.f406841b = r5     // Catch: java.lang.Throwable -> L9f
            r13.B0()
            r13.M0()
            goto L44
        L9f:
            r10 = move-exception
            r13.B0()
            r13.M0()
            throw r10
        La7:
            long r10 = r12.f406841b
            java.lang.Long r10 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.Y(long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0052 -> B:24:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y0(java.nio.ByteBuffer r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.K
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.K r0 = (io.ktor.utils.io.K) r0
            int r1 = r0.f400658u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400658u = r1
            goto L18
        L13:
            io.ktor.utils.io.K r0 = new io.ktor.utils.io.K
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f400656s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400658u
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 == r3) goto L36
            r5 = 2
            if (r2 != r5) goto L2e
            kotlin.C42729a0.b(r6)
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            java.nio.ByteBuffer r5 = r0.f400655r
            io.ktor.utils.io.a r2 = r0.f400654q
            kotlin.C42729a0.b(r6)
            goto L55
        L3e:
            kotlin.C42729a0.b(r6)
            r2 = r4
        L42:
            boolean r6 = r5.hasRemaining()
            if (r6 == 0) goto L60
            r0.f400654q = r2
            r0.f400655r = r5
            r0.f400658u = r3
            java.lang.Object r6 = r2.O0(r3, r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            io.ktor.utils.io.internal.g r6 = r2.joining
            if (r6 == 0) goto L5c
            A0(r2, r6)
        L5c:
            r2.S0(r5)
            goto L42
        L60:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.Y0(java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void Z(io.ktor.utils.io.internal.g gVar) {
        if (((io.ktor.utils.io.internal.e) this._closed) == null) {
            return;
        }
        this.joining = null;
        gVar.getClass();
        throw null;
    }

    @Override // io.ktor.utils.io.Q1
    public final void a(int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        io.ktor.utils.io.internal.j jVar = (io.ktor.utils.io.internal.j) this._state;
        if (!jVar.f401040b.i(i12)) {
            throw new IllegalStateException(androidx.camera.camera2.internal.G.e(i12, "Unable to consume ", " bytes: not enough available bytes"));
        }
        if (i12 > 0) {
            S(jVar.getF401044d(), jVar.f401040b, i12);
        }
    }

    public final void a0(int i12) {
        io.ktor.utils.io.internal.j jVar;
        j.f fVar;
        do {
            jVar = (io.ktor.utils.io.internal.j) this._state;
            fVar = j.f.f401051c;
            if (jVar == fVar) {
                return;
            } else {
                jVar.f401040b.c();
            }
        } while (jVar != ((io.ktor.utils.io.internal.j) this._state));
        int i13 = jVar.f401040b._availableForWrite$internal;
        if (jVar.f401040b._availableForRead$internal >= 1) {
            D0();
        }
        io.ktor.utils.io.internal.g gVar = this.joining;
        if (i13 >= i12) {
            if (gVar == null || ((io.ktor.utils.io.internal.j) this._state) == fVar) {
                E0();
            }
        }
    }

    @Override // io.ktor.utils.io.T1
    @Y61.l
    public final Object b(int i12, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "atLeast parameter shouldn't be negative: ").toString());
        }
        if (i12 > 4088) {
            throw new IllegalArgumentException(AK.c.g(i12, "atLeast parameter shouldn't be larger than max buffer size of 4088: ").toString());
        }
        if (((io.ktor.utils.io.internal.j) this._state).f401040b._availableForRead$internal < i12) {
            return (((io.ktor.utils.io.internal.j) this._state).a() || (((io.ktor.utils.io.internal.j) this._state) instanceof j.g)) ? Q(i12, continuationImpl) : i12 == 1 ? u0(1, continuationImpl) : t0(i12, continuationImpl);
        }
        if (((io.ktor.utils.io.internal.j) this._state).a() || (((io.ktor.utils.io.internal.j) this._state) instanceof j.g)) {
            G0();
        }
        return Boxing.boxBoolean(true);
    }

    @Y61.l
    /* renamed from: b0, reason: from getter */
    public final io.ktor.utils.io.internal.g getJoining() {
        return this.joining;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:14:0x002c, B:22:0x0043, B:30:0x005e, B:32:0x0062, B:33:0x0065, B:25:0x004b, B:27:0x0051), top: B:39:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:14:0x002c, B:22:0x0043, B:30:0x005e, B:32:0x0062, B:33:0x0065, B:25:0x004b, B:27:0x0051), top: B:39:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x005b -> B:30:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b1(io.ktor.utils.io.core.C41641n r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.P
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.P r0 = (io.ktor.utils.io.P) r0
            int r1 = r0.f400718u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400718u = r1
            goto L18
        L13:
            io.ktor.utils.io.P r0 = new io.ktor.utils.io.P
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f400716s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400718u
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 == r3) goto L3f
            r5 = 2
            if (r2 != r5) goto L37
            io.ktor.utils.io.a r5 = r0.f400714q
            io.ktor.utils.io.core.n r5 = (io.ktor.utils.io.core.C41641n) r5
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Throwable -> L35
            kotlin.G0 r6 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L35
            r5.z()
            return r6
        L35:
            r6 = move-exception
            goto L6f
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            io.ktor.utils.io.core.n r5 = r0.f400715r
            io.ktor.utils.io.a r2 = r0.f400714q
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Throwable -> L35
            goto L5e
        L47:
            kotlin.C42729a0.b(r6)
            r2 = r4
        L4b:
            boolean r6 = r5.m()     // Catch: java.lang.Throwable -> L35
            if (r6 != 0) goto L69
            r0.f400714q = r2     // Catch: java.lang.Throwable -> L35
            r0.f400715r = r5     // Catch: java.lang.Throwable -> L35
            r0.f400718u = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r6 = r2.d1(r3, r0)     // Catch: java.lang.Throwable -> L35
            if (r6 != r1) goto L5e
            return r1
        L5e:
            io.ktor.utils.io.internal.g r6 = r2.joining     // Catch: java.lang.Throwable -> L35
            if (r6 == 0) goto L65
            A0(r2, r6)     // Catch: java.lang.Throwable -> L35
        L65:
            r2.N0(r5)     // Catch: java.lang.Throwable -> L35
            goto L4b
        L69:
            r5.z()
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L6f:
            r5.z()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.b1(io.ktor.utils.io.core.n, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.Q1
    @Y61.l
    public final ByteBuffer c(int i12, int i13) {
        io.ktor.utils.io.internal.j jVar = (io.ktor.utils.io.internal.j) this._state;
        int i14 = jVar.f401040b._availableForRead$internal;
        int i15 = this.f400824e;
        if (i14 < i13 + i12) {
            return null;
        }
        if (jVar.a() || !((jVar instanceof j.d) || (jVar instanceof j.e))) {
            if (G0() == null) {
                return null;
            }
            return c(i12, i13);
        }
        ByteBuffer f401044d = jVar.getF401044d();
        e0(f401044d, V(i15 + i12, f401044d), i14 - i12);
        if (f401044d.remaining() >= i13) {
            return f401044d;
        }
        return null;
    }

    @Override // io.ktor.utils.io.O1
    public final void d() {
        this.f400826g.d();
        io.ktor.utils.io.internal.j jVar = (io.ktor.utils.io.internal.j) this._state;
        if ((jVar instanceof j.d) || (jVar instanceof j.e)) {
            B0();
            M0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d1(int r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.T
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.T r0 = (io.ktor.utils.io.T) r0
            int r1 = r0.f400761u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400761u = r1
            goto L18
        L13:
            io.ktor.utils.io.T r0 = new io.ktor.utils.io.T
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f400759s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400761u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r8 = r0.f400758r
            io.ktor.utils.io.a r2 = r0.f400757q
            kotlin.C42729a0.b(r9)
            goto L39
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.C42729a0.b(r9)
            r2 = r7
        L39:
            boolean r9 = r2.f1(r8)
            r4 = 0
            if (r9 == 0) goto Lc3
            r0.f400757q = r2
            r0.f400758r = r8
            r0.f400761u = r3
            kotlinx.coroutines.r r9 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r9.<init>(r3, r5)
            r9.p()
        L52:
            java.lang.Object r5 = r2._closed
            io.ktor.utils.io.internal.e r5 = (io.ktor.utils.io.internal.e) r5
            if (r5 != 0) goto Lbb
            boolean r5 = r2.f1(r8)
            if (r5 != 0) goto L66
            int r4 = kotlin.Z.f406624c
            kotlin.G0 r4 = kotlin.G0.f406611a
            r9.resumeWith(r4)
            goto L90
        L66:
            java.lang.Object r5 = r2._writeOp
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            if (r5 != 0) goto Lb3
            boolean r5 = r2.f1(r8)
            if (r5 != 0) goto L73
            goto L52
        L73:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = io.ktor.utils.io.C41619a.f400820o
        L75:
            boolean r6 = r5.compareAndSet(r2, r4, r9)
            if (r6 == 0) goto Lac
            boolean r5 = r2.f1(r8)
            if (r5 != 0) goto L90
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = io.ktor.utils.io.C41619a.f400820o
        L83:
            boolean r6 = r5.compareAndSet(r2, r9, r4)
            if (r6 == 0) goto L8a
            goto L52
        L8a:
            java.lang.Object r6 = r5.get(r2)
            if (r6 == r9) goto L83
        L90:
            r2.a0(r8)
            boolean r4 = r2.I0()
            if (r4 == 0) goto L9c
            r2.D0()
        L9c:
            java.lang.Object r9 = r9.o()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r9 != r4) goto La9
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        La9:
            if (r9 != r1) goto L39
            return r1
        Lac:
            java.lang.Object r6 = r5.get(r2)
            if (r6 == 0) goto L75
            goto L66
        Lb3:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Operation is already in progress"
            r8.<init>(r9)
            throw r8
        Lbb:
            java.lang.Throwable r8 = r5.a()
            io.ktor.utils.io.W.a(r8)
            throw r4
        Lc3:
            java.lang.Object r8 = r2._closed
            io.ktor.utils.io.internal.e r8 = (io.ktor.utils.io.internal.e) r8
            if (r8 != 0) goto Lcc
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        Lcc:
            java.lang.Throwable r8 = r8.a()
            io.ktor.utils.io.W.a(r8)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.d1(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.P1
    public final void e(int i12) {
        io.ktor.utils.io.internal.u uVar = this.f400827h;
        uVar.b(i12);
        uVar.e();
    }

    public final void e0(ByteBuffer byteBuffer, int i12, int i13) {
        if (i12 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int iCapacity = byteBuffer.capacity() - this.f400823d;
        int i14 = i13 + i12;
        if (i14 <= iCapacity) {
            iCapacity = i14;
        }
        byteBuffer.limit(iCapacity);
        byteBuffer.position(i12);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0055 -> B:22:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e1(byte[] r6, int r7, int r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.S
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.S r0 = (io.ktor.utils.io.S) r0
            int r1 = r0.f400750w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400750w = r1
            goto L18
        L13:
            io.ktor.utils.io.S r0 = new io.ktor.utils.io.S
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f400748u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400750w
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 == r3) goto L34
            r6 = 2
            if (r2 != r6) goto L2c
            kotlin.C42729a0.b(r9)
            return r9
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r6 = r0.f400747t
            int r7 = r0.f400746s
            byte[] r8 = r0.f400745r
            io.ktor.utils.io.a r2 = r0.f400744q
            kotlin.C42729a0.b(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L58
        L43:
            kotlin.C42729a0.b(r9)
            r2 = r5
        L47:
            r0.f400744q = r2
            r0.f400745r = r6
            r0.f400746s = r7
            r0.f400747t = r8
            r0.f400750w = r3
            java.lang.Object r9 = r2.O0(r3, r0)
            if (r9 != r1) goto L58
            return r1
        L58:
            io.ktor.utils.io.internal.g r9 = r2.joining
            if (r9 == 0) goto L5f
            A0(r2, r9)
        L5f:
            int r9 = r2.Q0(r7, r8, r6)
            if (r9 <= 0) goto L47
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.e1(byte[], int, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.W0
    public final boolean f(@Y61.l Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel has been cancelled");
        }
        return h(th2);
    }

    public final void f0(int i12, @Y61.k ByteBuffer byteBuffer) {
        e0(byteBuffer, this.f400825f, i12);
    }

    public final boolean f1(int i12) {
        io.ktor.utils.io.internal.g gVar = this.joining;
        io.ktor.utils.io.internal.j jVar = (io.ktor.utils.io.internal.j) this._state;
        if (((io.ktor.utils.io.internal.e) this._closed) != null) {
            return false;
        }
        if (gVar == null) {
            if (jVar.f401040b._availableForWrite$internal >= i12 || jVar == j.a.f401041c) {
                return false;
            }
        } else if (jVar == j.f.f401051c || (jVar instanceof j.g) || (jVar instanceof j.e)) {
            return false;
        }
        return true;
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    public final void flush() {
        a0(1);
    }

    @Override // io.ktor.utils.io.W0, io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Throwable g() {
        io.ktor.utils.io.internal.e eVar = (io.ktor.utils.io.internal.e) this._closed;
        if (eVar != null) {
            return eVar.f401030a;
        }
        return null;
    }

    public final int g0(int i12, int i13, byte[] bArr) throws Throwable {
        ByteBuffer byteBufferG0 = G0();
        int i14 = 0;
        if (byteBufferG0 != null) {
            io.ktor.utils.io.internal.l lVar = ((io.ktor.utils.io.internal.j) this._state).f401040b;
            try {
                if (lVar._availableForRead$internal != 0) {
                    int iCapacity = byteBufferG0.capacity() - this.f400823d;
                    while (true) {
                        int i15 = i13 - i14;
                        if (i15 == 0) {
                            break;
                        }
                        int i16 = this.f400824e;
                        int iH2 = lVar.h(Math.min(iCapacity - i16, i15));
                        if (iH2 == 0) {
                            break;
                        }
                        byteBufferG0.limit(i16 + iH2);
                        byteBufferG0.position(i16);
                        byteBufferG0.get(bArr, i12 + i14, iH2);
                        S(byteBufferG0, lVar, iH2);
                        i14 += iH2;
                    }
                }
            } finally {
                B0();
                M0();
            }
        }
        return i14;
    }

    public boolean h(@Y61.l Throwable th2) {
        io.ktor.utils.io.internal.e eVar;
        io.ktor.utils.io.internal.g gVar;
        if (((io.ktor.utils.io.internal.e) this._closed) != null) {
            return false;
        }
        if (th2 == null) {
            io.ktor.utils.io.internal.e.f401028b.getClass();
            eVar = io.ktor.utils.io.internal.e.f401029c;
        } else {
            eVar = new io.ktor.utils.io.internal.e(th2);
        }
        ((io.ktor.utils.io.internal.j) this._state).f401040b.c();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f400818m;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, eVar)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return false;
            }
        }
        ((io.ktor.utils.io.internal.j) this._state).f401040b.c();
        io.ktor.utils.io.internal.l lVar = ((io.ktor.utils.io.internal.j) this._state).f401040b;
        if (lVar._availableForWrite$internal == lVar.f401058a || th2 != null) {
            M0();
        }
        Continuation continuation = (Continuation) f400819n.getAndSet(this, null);
        if (continuation != null) {
            if (th2 != null) {
                int i12 = kotlin.Z.f406624c;
                continuation.resumeWith(new Z.b(th2));
            } else {
                Boolean boolValueOf = Boolean.valueOf(((io.ktor.utils.io.internal.j) this._state).f401040b._availableForRead$internal > 0);
                int i13 = kotlin.Z.f406624c;
                continuation.resumeWith(boolValueOf);
            }
        }
        Continuation continuation2 = (Continuation) f400820o.getAndSet(this, null);
        if (continuation2 != null) {
            int i14 = kotlin.Z.f406624c;
            continuation2.resumeWith(new Z.b(th2 == null ? new ClosedWriteChannelException("Byte channel was closed") : th2));
        }
        if (((io.ktor.utils.io.internal.j) this._state) == j.f.f401051c && (gVar = this.joining) != null) {
            Z(gVar);
        }
        if (th2 == null) {
            this.f400829j.c(new ClosedWriteChannelException("Byte channel was closed"));
            this.f400828i.b(Boolean.valueOf(((io.ktor.utils.io.internal.j) this._state).f401040b.c()));
            return true;
        }
        kotlinx.coroutines.N0 n02 = this.attachedJob;
        if (n02 != null) {
            n02.c(null);
        }
        this.f400828i.c(th2);
        this.f400829j.c(th2);
        return true;
    }

    public final int h0(ByteBuffer byteBuffer) throws Throwable {
        ByteBuffer byteBufferG0 = G0();
        int i12 = 0;
        if (byteBufferG0 != null) {
            io.ktor.utils.io.internal.l lVar = ((io.ktor.utils.io.internal.j) this._state).f401040b;
            try {
                if (lVar._availableForRead$internal != 0) {
                    int iCapacity = byteBufferG0.capacity() - this.f400823d;
                    while (true) {
                        int iRemaining = byteBuffer.remaining();
                        if (iRemaining == 0) {
                            break;
                        }
                        int i13 = this.f400824e;
                        int iH2 = lVar.h(Math.min(iCapacity - i13, iRemaining));
                        if (iH2 == 0) {
                            break;
                        }
                        byteBufferG0.limit(i13 + iH2);
                        byteBufferG0.position(i13);
                        byteBuffer.put(byteBufferG0);
                        S(byteBufferG0, lVar, iH2);
                        i12 += iH2;
                    }
                }
            } finally {
                B0();
                M0();
            }
        }
        return i12;
    }

    public final boolean h1(ByteBuffer byteBuffer, io.ktor.utils.io.internal.l lVar, Y41.l<? super ByteBuffer, Boolean> lVar2) {
        int i12;
        int iCapacity = byteBuffer.capacity() - this.f400823d;
        boolean z12 = true;
        while (z12) {
            while (true) {
                i12 = lVar._availableForWrite$internal;
                if (i12 < 1) {
                    i12 = 0;
                    break;
                }
                if (io.ktor.utils.io.internal.l.f401056c.compareAndSet(lVar, i12, 0)) {
                    break;
                }
            }
            if (i12 == 0) {
                break;
            }
            int i13 = this.f400825f;
            int i14 = i13 + i12;
            if (i14 > iCapacity) {
                i14 = iCapacity;
            }
            byteBuffer.limit(i14);
            byteBuffer.position(i13);
            try {
                boolean zBooleanValue = lVar2.invoke(byteBuffer).booleanValue();
                if (byteBuffer.limit() != i14) {
                    throw new IllegalStateException("Buffer limit modified.");
                }
                int iPosition = byteBuffer.position() - i13;
                if (iPosition < 0) {
                    throw new IllegalStateException("Position has been moved backward: pushback is not supported.");
                }
                T(byteBuffer, lVar, iPosition);
                if (iPosition < i12) {
                    lVar.a(i12 - iPosition);
                }
                z12 = zBooleanValue;
            } catch (Throwable th2) {
                lVar.a(i12);
                throw th2;
            }
        }
        return z12;
    }

    @Override // io.ktor.utils.io.W0
    /* renamed from: i */
    public final int get_availableForRead() {
        return ((io.ktor.utils.io.internal.j) this._state).f401040b._availableForRead$internal;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        if (r6 != null) goto L40;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:16:0x004f, B:33:0x00ab, B:35:0x00af, B:37:0x00b5, B:38:0x00b9, B:30:0x008b), top: B:117:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a8 -> B:33:0x00ab). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i1(Y41.l r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.i1(Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Short] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x008d -> B:39:0x0090). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.io.W0
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.C41709y
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.y r0 = (io.ktor.utils.io.C41709y) r0
            int r1 = r0.f401361u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401361u = r1
            goto L18
        L13:
            io.ktor.utils.io.y r0 = new io.ktor.utils.io.y
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f401359s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401361u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r2 = r0.f401358r
            io.ktor.utils.io.a r4 = r0.f401357q
            kotlin.C42729a0.b(r10)
            goto L90
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L35:
            kotlin.C42729a0.b(r10)
            r10 = 2
            r4 = r9
            r2 = r10
        L3b:
            kotlin.jvm.internal.l0$h r10 = new kotlin.jvm.internal.l0$h
            r10.<init>()
            java.nio.ByteBuffer r5 = r4.G0()
            r6 = 0
            if (r5 != 0) goto L48
            goto L78
        L48:
            java.lang.Object r7 = r4._state
            io.ktor.utils.io.internal.j r7 = (io.ktor.utils.io.internal.j) r7
            io.ktor.utils.io.internal.l r7 = r7.f401040b
            int r8 = r7._availableForRead$internal     // Catch: java.lang.Throwable -> La7
            if (r8 != 0) goto L59
        L52:
            r4.B0()
            r4.M0()
            goto L78
        L59:
            boolean r8 = r7.i(r2)     // Catch: java.lang.Throwable -> La7
            if (r8 != 0) goto L60
            goto L52
        L60:
            int r6 = r5.remaining()     // Catch: java.lang.Throwable -> La7
            if (r6 >= r2) goto L69
            F0(r2, r5)     // Catch: java.lang.Throwable -> La7
        L69:
            short r6 = r5.getShort()     // Catch: java.lang.Throwable -> La7
            java.lang.Short r6 = kotlin.coroutines.jvm.internal.Boxing.boxShort(r6)     // Catch: java.lang.Throwable -> La7
            r10.f406842b = r6     // Catch: java.lang.Throwable -> La7
            r4.S(r5, r7, r2)     // Catch: java.lang.Throwable -> La7
            r6 = r3
            goto L52
        L78:
            if (r6 == 0) goto L83
            T r10 = r10.f406842b
            if (r10 != 0) goto L80
            r10 = 0
            goto L82
        L80:
            java.lang.Number r10 = (java.lang.Number) r10
        L82:
            return r10
        L83:
            r0.f401357q = r4
            r0.f401358r = r2
            r0.f401361u = r3
            java.lang.Object r10 = r4.t0(r2, r0)
            if (r10 != r1) goto L90
            return r1
        L90:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L99
            goto L3b
        L99:
            kotlinx.coroutines.channels.ClosedReceiveChannelException r10 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r0 = "EOF while "
            java.lang.String r1 = " bytes expected"
            java.lang.String r0 = androidx.camera.camera2.internal.G.e(r2, r0, r1)
            r10.<init>(r0)
            throw r10
        La7:
            r10 = move-exception
            r4.B0()
            r4.M0()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.j(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j0(io.ktor.utils.io.core.internal.b r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.C41671l
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.l r0 = (io.ktor.utils.io.C41671l) r0
            int r1 = r0.f401191u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401191u = r1
            goto L18
        L13:
            io.ktor.utils.io.l r0 = new io.ktor.utils.io.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f401189s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401191u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r7)
            goto L69
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            io.ktor.utils.io.core.internal.b r6 = r0.f401188r
            io.ktor.utils.io.a r2 = r0.f401187q
            kotlin.C42729a0.b(r7)
            goto L4d
        L3c:
            kotlin.C42729a0.b(r7)
            r0.f401187q = r5
            r0.f401188r = r6
            r0.f401191u = r4
            java.lang.Object r7 = r5.t0(r4, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5b
            r6 = -1
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            return r6
        L5b:
            r7 = 0
            r0.f401187q = r7
            r0.f401188r = r7
            r0.f401191u = r3
            java.lang.Object r7 = r2.p(r6, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.j0(io.ktor.utils.io.core.internal.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Object k(@Y61.k ByteBuffer byteBuffer, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        io.ktor.utils.io.internal.g gVar = this.joining;
        if (gVar != null) {
            A0(this, gVar);
        }
        S0(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return kotlin.G0.f406611a;
        }
        Object objY0 = Y0(byteBuffer, continuationImpl);
        return objY0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objY0 : kotlin.G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k0(byte[] r6, int r7, int r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.C41665j
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.j r0 = (io.ktor.utils.io.C41665j) r0
            int r1 = r0.f401089w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401089w = r1
            goto L18
        L13:
            io.ktor.utils.io.j r0 = new io.ktor.utils.io.j
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f401087u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401089w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r9)
            goto L71
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r8 = r0.f401086t
            int r7 = r0.f401085s
            byte[] r6 = r0.f401084r
            io.ktor.utils.io.a r2 = r0.f401083q
            kotlin.C42729a0.b(r9)
            goto L55
        L40:
            kotlin.C42729a0.b(r9)
            r0.f401083q = r5
            r0.f401084r = r6
            r0.f401085s = r7
            r0.f401086t = r8
            r0.f401089w = r4
            java.lang.Object r9 = r5.t0(r4, r0)
            if (r9 != r1) goto L54
            return r1
        L54:
            r2 = r5
        L55:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L63
            r6 = -1
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            return r6
        L63:
            r9 = 0
            r0.f401083q = r9
            r0.f401084r = r9
            r0.f401089w = r3
            java.lang.Object r9 = r2.H(r6, r7, r8, r0)
            if (r9 != r1) goto L71
            return r1
        L71:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.k0(byte[], int, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Object l(@Y61.k C41628a c41628a, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        R0(c41628a);
        if (c41628a.f400876c <= c41628a.f400875b) {
            return kotlin.G0.f406611a;
        }
        Object objW0 = W0(c41628a, continuationImpl);
        return objW0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objW0 : kotlin.G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l0(java.nio.ByteBuffer r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.C41668k
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.k r0 = (io.ktor.utils.io.C41668k) r0
            int r1 = r0.f401177u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401177u = r1
            goto L18
        L13:
            io.ktor.utils.io.k r0 = new io.ktor.utils.io.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f401175s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401177u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r7)
            goto L69
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.nio.ByteBuffer r6 = r0.f401174r
            io.ktor.utils.io.a r2 = r0.f401173q
            kotlin.C42729a0.b(r7)
            goto L4d
        L3c:
            kotlin.C42729a0.b(r7)
            r0.f401173q = r5
            r0.f401174r = r6
            r0.f401177u = r4
            java.lang.Object r7 = r5.t0(r4, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5b
            r6 = -1
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            return r6
        L5b:
            r7 = 0
            r0.f401173q = r7
            r0.f401174r = r7
            r0.f401177u = r3
            java.lang.Object r7 = r2.w(r6, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.l0(java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object m(int i12, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        Throwable th2;
        io.ktor.utils.io.internal.e eVar = (io.ktor.utils.io.internal.e) this._closed;
        if (eVar != null && (th2 = eVar.f401030a) != null) {
            W.a(th2);
            throw null;
        }
        if (i12 == 0) {
            C41641n.f400901i.getClass();
            return C41641n.f400902j;
        }
        C41640m c41640m = new C41640m(null, 1, null);
        ByteBuffer byteBufferS2 = io.ktor.utils.io.internal.h.f401033b.S2();
        while (i12 > 0) {
            try {
                byteBufferS2.clear();
                if (byteBufferS2.remaining() > i12) {
                    byteBufferS2.limit(i12);
                }
                int iH02 = h0(byteBufferS2);
                if (iH02 == 0) {
                    break;
                }
                byteBufferS2.flip();
                io.ktor.utils.io.core.F.a(c41640m, byteBufferS2);
                i12 -= iH02;
            } catch (Throwable th3) {
                io.ktor.utils.io.internal.h.f401033b.G4(byteBufferS2);
                c41640m.close();
                throw th3;
            }
        }
        if (i12 != 0) {
            return r0(i12, c41640m, byteBufferS2, continuationImpl);
        }
        io.ktor.utils.io.internal.h.f401033b.G4(byteBufferS2);
        return c41640m.y();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m0(int r6, Y41.l r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.utils.io.C41674m
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.m r0 = (io.ktor.utils.io.C41674m) r0
            int r1 = r0.f401204v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401204v = r1
            goto L18
        L13:
            io.ktor.utils.io.m r0 = new io.ktor.utils.io.m
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f401202t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401204v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r8)
            goto L84
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r6 = r0.f401201s
            Y41.l r7 = r0.f401200r
            Y41.l r7 = (Y41.l) r7
            io.ktor.utils.io.a r2 = r0.f401199q
            kotlin.C42729a0.b(r8)
            goto L5b
        L40:
            kotlin.C42729a0.b(r8)
            if (r6 >= r4) goto L47
            r8 = r4
            goto L48
        L47:
            r8 = r6
        L48:
            r0.f401199q = r5
            r2 = r7
            Y41.l r2 = (Y41.l) r2
            r0.f401200r = r2
            r0.f401201s = r6
            r0.f401204v = r4
            java.lang.Object r8 = r5.t0(r8, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            r2 = r5
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L76
            if (r6 > 0) goto L68
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L68:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r8 = "Got EOF but at least "
            java.lang.String r0 = " bytes were expected"
            java.lang.String r6 = androidx.camera.camera2.internal.G.e(r6, r8, r0)
            r7.<init>(r6)
            throw r7
        L76:
            r8 = 0
            r0.f401199q = r8
            r0.f401200r = r8
            r0.f401204v = r3
            java.lang.Object r6 = r2.E(r6, r7, r0)
            if (r6 != r1) goto L84
            return r1
        L84:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.m0(int, Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Byte] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x008e -> B:39:0x0091). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.io.W0
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(@Y61.k kotlin.coroutines.Continuation<? super java.lang.Byte> r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.C41619a.c
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.a$c r0 = (io.ktor.utils.io.C41619a.c) r0
            int r1 = r0.f400836u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400836u = r1
            goto L1a
        L13:
            io.ktor.utils.io.a$c r0 = new io.ktor.utils.io.a$c
            kotlin.coroutines.jvm.internal.ContinuationImpl r10 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r10
            r0.<init>(r10)
        L1a:
            java.lang.Object r10 = r0.f400834s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400836u
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r2 = r0.f400833r
            io.ktor.utils.io.a r4 = r0.f400832q
            kotlin.C42729a0.b(r10)
            goto L91
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L37:
            kotlin.C42729a0.b(r10)
            r4 = r9
            r2 = r3
        L3c:
            kotlin.jvm.internal.l0$h r10 = new kotlin.jvm.internal.l0$h
            r10.<init>()
            java.nio.ByteBuffer r5 = r4.G0()
            r6 = 0
            if (r5 != 0) goto L49
            goto L79
        L49:
            java.lang.Object r7 = r4._state
            io.ktor.utils.io.internal.j r7 = (io.ktor.utils.io.internal.j) r7
            io.ktor.utils.io.internal.l r7 = r7.f401040b
            int r8 = r7._availableForRead$internal     // Catch: java.lang.Throwable -> La8
            if (r8 != 0) goto L5a
        L53:
            r4.B0()
            r4.M0()
            goto L79
        L5a:
            boolean r8 = r7.i(r2)     // Catch: java.lang.Throwable -> La8
            if (r8 != 0) goto L61
            goto L53
        L61:
            int r6 = r5.remaining()     // Catch: java.lang.Throwable -> La8
            if (r6 >= r2) goto L6a
            F0(r2, r5)     // Catch: java.lang.Throwable -> La8
        L6a:
            byte r6 = r5.get()     // Catch: java.lang.Throwable -> La8
            java.lang.Byte r6 = kotlin.coroutines.jvm.internal.Boxing.boxByte(r6)     // Catch: java.lang.Throwable -> La8
            r10.f406842b = r6     // Catch: java.lang.Throwable -> La8
            r4.S(r5, r7, r2)     // Catch: java.lang.Throwable -> La8
            r6 = r3
            goto L53
        L79:
            if (r6 == 0) goto L84
            T r10 = r10.f406842b
            if (r10 != 0) goto L81
            r10 = 0
            goto L83
        L81:
            java.lang.Number r10 = (java.lang.Number) r10
        L83:
            return r10
        L84:
            r0.f400832q = r4
            r0.f400833r = r2
            r0.f400836u = r3
            java.lang.Object r10 = r4.t0(r2, r0)
            if (r10 != r1) goto L91
            return r1
        L91:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L9a
            goto L3c
        L9a:
            kotlinx.coroutines.channels.ClosedReceiveChannelException r10 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r0 = "EOF while "
            java.lang.String r1 = " bytes expected"
            java.lang.String r0 = androidx.camera.camera2.internal.G.e(r2, r0, r1)
            r10.<init>(r0)
            throw r10
        La8:
            r10 = move-exception
            r4.B0()
            r4.M0()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.n(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x009b -> B:40:0x009e). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n0(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof io.ktor.utils.io.C41680o
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.o r0 = (io.ktor.utils.io.C41680o) r0
            int r1 = r0.f401226u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401226u = r1
            goto L18
        L13:
            io.ktor.utils.io.o r0 = new io.ktor.utils.io.o
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f401224s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401226u
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            int r2 = r0.f401223r
            io.ktor.utils.io.a r4 = r0.f401222q
            kotlin.C42729a0.b(r11)
            goto L9e
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L36:
            kotlin.C42729a0.b(r11)
            r11 = 8
            r4 = r10
            r2 = r11
        L3d:
            kotlin.jvm.internal.l0$h r11 = new kotlin.jvm.internal.l0$h
            r11.<init>()
            java.nio.ByteBuffer r5 = r4.G0()
            r6 = 0
            if (r5 != 0) goto L4a
            goto L7a
        L4a:
            java.lang.Object r7 = r4._state
            io.ktor.utils.io.internal.j r7 = (io.ktor.utils.io.internal.j) r7
            io.ktor.utils.io.internal.l r7 = r7.f401040b
            int r8 = r7._availableForRead$internal     // Catch: java.lang.Throwable -> Lb5
            if (r8 != 0) goto L5b
        L54:
            r4.B0()
            r4.M0()
            goto L7a
        L5b:
            boolean r8 = r7.i(r2)     // Catch: java.lang.Throwable -> Lb5
            if (r8 != 0) goto L62
            goto L54
        L62:
            int r6 = r5.remaining()     // Catch: java.lang.Throwable -> Lb5
            if (r6 >= r2) goto L6b
            F0(r2, r5)     // Catch: java.lang.Throwable -> Lb5
        L6b:
            long r8 = r5.getLong()     // Catch: java.lang.Throwable -> Lb5
            java.lang.Long r6 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r8)     // Catch: java.lang.Throwable -> Lb5
            r11.f406842b = r6     // Catch: java.lang.Throwable -> Lb5
            r4.S(r5, r7, r2)     // Catch: java.lang.Throwable -> Lb5
            r6 = r3
            goto L54
        L7a:
            if (r6 == 0) goto L91
            T r11 = r11.f406842b
            if (r11 != 0) goto L82
            r11 = 0
            goto L84
        L82:
            java.lang.Number r11 = (java.lang.Number) r11
        L84:
            long r0 = r11.longValue()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r11 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r0)
            return r11
        L91:
            r0.f401222q = r4
            r0.f401223r = r2
            r0.f401226u = r3
            java.lang.Object r11 = r4.t0(r2, r0)
            if (r11 != r1) goto L9e
            return r1
        L9e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto La7
            goto L3d
        La7:
            kotlinx.coroutines.channels.ClosedReceiveChannelException r11 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r0 = "EOF while "
            java.lang.String r1 = " bytes expected"
            java.lang.String r0 = androidx.camera.camera2.internal.G.e(r2, r0, r1)
            r11.<init>(r0)
            throw r11
        Lb5:
            r11 = move-exception
            r4.B0()
            r4.M0()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.n0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Object o(int i12, @Y61.k ContinuationImpl continuationImpl) {
        return Z0(this, i12, continuationImpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Integer] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x009a -> B:40:0x009d). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o0(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.C41683p
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.p r0 = (io.ktor.utils.io.C41683p) r0
            int r1 = r0.f401237u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401237u = r1
            goto L18
        L13:
            io.ktor.utils.io.p r0 = new io.ktor.utils.io.p
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f401235s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401237u
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            int r2 = r0.f401234r
            io.ktor.utils.io.a r4 = r0.f401233q
            kotlin.C42729a0.b(r10)
            goto L9d
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L36:
            kotlin.C42729a0.b(r10)
            r10 = 4
            r4 = r9
            r2 = r10
        L3c:
            kotlin.jvm.internal.l0$h r10 = new kotlin.jvm.internal.l0$h
            r10.<init>()
            java.nio.ByteBuffer r5 = r4.G0()
            r6 = 0
            if (r5 != 0) goto L49
            goto L79
        L49:
            java.lang.Object r7 = r4._state
            io.ktor.utils.io.internal.j r7 = (io.ktor.utils.io.internal.j) r7
            io.ktor.utils.io.internal.l r7 = r7.f401040b
            int r8 = r7._availableForRead$internal     // Catch: java.lang.Throwable -> Lb4
            if (r8 != 0) goto L5a
        L53:
            r4.B0()
            r4.M0()
            goto L79
        L5a:
            boolean r8 = r7.i(r2)     // Catch: java.lang.Throwable -> Lb4
            if (r8 != 0) goto L61
            goto L53
        L61:
            int r6 = r5.remaining()     // Catch: java.lang.Throwable -> Lb4
            if (r6 >= r2) goto L6a
            F0(r2, r5)     // Catch: java.lang.Throwable -> Lb4
        L6a:
            int r6 = r5.getInt()     // Catch: java.lang.Throwable -> Lb4
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)     // Catch: java.lang.Throwable -> Lb4
            r10.f406842b = r6     // Catch: java.lang.Throwable -> Lb4
            r4.S(r5, r7, r2)     // Catch: java.lang.Throwable -> Lb4
            r6 = r3
            goto L53
        L79:
            if (r6 == 0) goto L90
            T r10 = r10.f406842b
            if (r10 != 0) goto L81
            r10 = 0
            goto L83
        L81:
            java.lang.Number r10 = (java.lang.Number) r10
        L83:
            int r10 = r10.intValue()
            float r10 = java.lang.Float.intBitsToFloat(r10)
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r10)
            return r10
        L90:
            r0.f401233q = r4
            r0.f401234r = r2
            r0.f401237u = r3
            java.lang.Object r10 = r4.t0(r2, r0)
            if (r10 != r1) goto L9d
            return r1
        L9d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto La6
            goto L3c
        La6:
            kotlinx.coroutines.channels.ClosedReceiveChannelException r10 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r0 = "EOF while "
            java.lang.String r1 = " bytes expected"
            java.lang.String r0 = androidx.camera.camera2.internal.G.e(r2, r0, r1)
            r10.<init>(r0)
            throw r10
        Lb4:
            r10 = move-exception
            r4.B0()
            r4.M0()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.o0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object p(@Y61.k io.ktor.utils.io.core.internal.b bVar, @Y61.k Continuation<? super Integer> continuation) throws Throwable {
        int iI02 = i0(this, bVar, 0, 6);
        if (iI02 == 0 && ((io.ktor.utils.io.internal.e) this._closed) != null) {
            iI02 = ((io.ktor.utils.io.internal.j) this._state).f401040b.c() ? i0(this, bVar, 0, 6) : -1;
        } else if (iI02 <= 0 && bVar.f400878e > bVar.f400876c) {
            return j0(bVar, (ContinuationImpl) continuation);
        }
        return Boxing.boxInt(iI02);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0050 -> B:21:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p0(java.nio.ByteBuffer r6, int r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.utils.io.C41686q
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.q r0 = (io.ktor.utils.io.C41686q) r0
            int r1 = r0.f401260v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401260v = r1
            goto L18
        L13:
            io.ktor.utils.io.q r0 = new io.ktor.utils.io.q
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f401258t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401260v
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r6 = r0.f401257s
            java.nio.ByteBuffer r7 = r0.f401256r
            io.ktor.utils.io.a r2 = r0.f401255q
            kotlin.C42729a0.b(r8)
            goto L53
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.C42729a0.b(r8)
            r2 = r5
        L3b:
            boolean r8 = r6.hasRemaining()
            if (r8 == 0) goto L81
            r0.f401255q = r2
            r0.f401256r = r6
            r0.f401257s = r7
            r0.f401260v = r3
            java.lang.Object r8 = r2.t0(r3, r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            r4 = r7
            r7 = r6
            r6 = r4
        L53:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L64
            int r8 = r2.h0(r7)
            int r6 = r6 + r8
            r4 = r7
            r7 = r6
            r6 = r4
            goto L3b
        L64:
            kotlinx.coroutines.channels.ClosedReceiveChannelException r6 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Unexpected EOF: expected "
            r8.<init>(r0)
            int r7 = r7.remaining()
            r8.append(r7)
            java.lang.String r7 = " more bytes"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L81:
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.p0(java.nio.ByteBuffer, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Object q(byte b12, @Y61.k ContinuationImpl continuationImpl) {
        return V0(this, b12, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0053 -> B:19:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q0(byte[] r8, int r9, int r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof io.ktor.utils.io.C41691s
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.s r0 = (io.ktor.utils.io.C41691s) r0
            int r1 = r0.f401285x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401285x = r1
            goto L18
        L13:
            io.ktor.utils.io.s r0 = new io.ktor.utils.io.s
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.f401283v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401285x
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r8 = r0.f401282u
            int r9 = r0.f401281t
            int r10 = r0.f401280s
            byte[] r2 = r0.f401279r
            io.ktor.utils.io.a r4 = r0.f401278q
            kotlin.C42729a0.b(r11)
            goto L5a
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            kotlin.C42729a0.b(r11)
            r11 = 0
            r4 = r7
        L40:
            r0.f401278q = r4
            r0.f401279r = r8
            r0.f401280s = r9
            r0.f401281t = r10
            r0.f401282u = r11
            r0.f401285x = r3
            java.lang.Object r2 = r4.t0(r3, r0)
            if (r2 != r1) goto L53
            return r1
        L53:
            r5 = r2
            r2 = r8
            r8 = r11
            r11 = r5
            r6 = r10
            r10 = r9
            r9 = r6
        L5a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L72
            int r10 = r10 + r8
            int r8 = r9 - r8
            int r11 = r4.g0(r10, r8, r2)
            if (r11 < r8) goto L6e
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        L6e:
            r9 = r10
            r10 = r8
            r8 = r2
            goto L40
        L72:
            kotlinx.coroutines.channels.ClosedReceiveChannelException r8 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r10 = "Unexpected EOF: expected "
            java.lang.String r11 = " more bytes"
            java.lang.String r9 = androidx.camera.camera2.internal.G.e(r9, r10, r11)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.q0(byte[], int, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.W0
    public final boolean r() {
        return ((io.ktor.utils.io.internal.e) this._closed) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0076, code lost:
    
        if (r10 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: all -> 0x0051, TRY_ENTER, TryCatch #0 {all -> 0x0051, blocks: (B:31:0x0076, B:20:0x0044, B:22:0x004d, B:25:0x0056, B:27:0x006a, B:28:0x006f, B:32:0x0084), top: B:40:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:31:0x0076, B:20:0x0044, B:22:0x004d, B:25:0x0056, B:27:0x006a, B:28:0x006f, B:32:0x0084), top: B:40:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r0(int r7, io.ktor.utils.io.core.C41640m r8, java.nio.ByteBuffer r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.C41700v
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.v r0 = (io.ktor.utils.io.C41700v) r0
            int r1 = r0.f401323w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401323w = r1
            goto L18
        L13:
            io.ktor.utils.io.v r0 = new io.ktor.utils.io.v
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f401321u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401323w
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r7 = r0.f401320t
            java.nio.ByteBuffer r8 = r0.f401319s
            io.ktor.utils.io.core.m r9 = r0.f401318r
            io.ktor.utils.io.a r2 = r0.f401317q
            kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L34
            r5 = r9
            r9 = r8
            r8 = r5
            goto L76
        L34:
            r7 = move-exception
            goto L8e
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            kotlin.C42729a0.b(r10)
            r2 = r6
        L42:
            if (r7 <= 0) goto L84
            r9.clear()     // Catch: java.lang.Throwable -> L51
            int r10 = r9.remaining()     // Catch: java.lang.Throwable -> L51
            if (r10 <= r7) goto L56
            r9.limit(r7)     // Catch: java.lang.Throwable -> L51
            goto L56
        L51:
            r7 = move-exception
            r5 = r9
            r9 = r8
            r8 = r5
            goto L8e
        L56:
            r0.f401317q = r2     // Catch: java.lang.Throwable -> L51
            r0.f401318r = r8     // Catch: java.lang.Throwable -> L51
            r0.f401319s = r9     // Catch: java.lang.Throwable -> L51
            r0.f401320t = r7     // Catch: java.lang.Throwable -> L51
            r0.f401323w = r3     // Catch: java.lang.Throwable -> L51
            int r10 = r2.h0(r9)     // Catch: java.lang.Throwable -> L51
            boolean r4 = r9.hasRemaining()     // Catch: java.lang.Throwable -> L51
            if (r4 != 0) goto L6f
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)     // Catch: java.lang.Throwable -> L51
            goto L73
        L6f:
            java.lang.Object r10 = r2.p0(r9, r10, r0)     // Catch: java.lang.Throwable -> L51
        L73:
            if (r10 != r1) goto L76
            return r1
        L76:
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> L51
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L51
            r9.flip()     // Catch: java.lang.Throwable -> L51
            io.ktor.utils.io.core.F.a(r8, r9)     // Catch: java.lang.Throwable -> L51
            int r7 = r7 - r10
            goto L42
        L84:
            io.ktor.utils.io.core.n r7 = r8.y()     // Catch: java.lang.Throwable -> L51
            io.ktor.utils.io.pool.f r8 = io.ktor.utils.io.internal.h.f401033b
            r8.G4(r9)
            return r7
        L8e:
            r9.close()     // Catch: java.lang.Throwable -> L92
            throw r7     // Catch: java.lang.Throwable -> L92
        L92:
            r7 = move-exception
            io.ktor.utils.io.pool.f r9 = io.ktor.utils.io.internal.h.f401033b
            r9.G4(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.r0(int, io.ktor.utils.io.core.m, java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object s(@Y61.k ByteBuffer byteBuffer, long j12, long j13, long j14, @Y61.k Continuation continuation) {
        return d0(this, byteBuffer, j12, j13, j14, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x0030, B:31:0x0090, B:36:0x009d, B:21:0x0056, B:23:0x0062, B:24:0x0066, B:26:0x0077, B:28:0x007d), top: B:51:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x0030, B:31:0x0090, B:36:0x009d, B:21:0x0056, B:23:0x0062, B:24:0x0066, B:26:0x0077, B:28:0x007d), top: B:51:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x0030, B:31:0x0090, B:36:0x009d, B:21:0x0056, B:23:0x0062, B:24:0x0066, B:26:0x0077, B:28:0x007d), top: B:51:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2 A[Catch: all -> 0x00b0, TRY_ENTER, TryCatch #0 {all -> 0x00b0, blocks: (B:38:0x00a2, B:40:0x00ab, B:44:0x00b3, B:45:0x00b4, B:46:0x00b7, B:12:0x0030, B:31:0x0090, B:36:0x009d, B:21:0x0056, B:23:0x0062, B:24:0x0066, B:26:0x0077, B:28:0x007d), top: B:50:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008d -> B:31:0x0090). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009a -> B:35:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s0(long r12, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof io.ktor.utils.io.C41703w
            if (r0 == 0) goto L13
            r0 = r14
            io.ktor.utils.io.w r0 = (io.ktor.utils.io.C41703w) r0
            int r1 = r0.f401345x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401345x = r1
            goto L18
        L13:
            io.ktor.utils.io.w r0 = new io.ktor.utils.io.w
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f401343v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401345x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 != r4) goto L37
            io.ktor.utils.io.core.internal.b r12 = r0.f401342u
            io.ktor.utils.io.core.E r13 = r0.f401341t
            kotlin.jvm.internal.l0$g r2 = r0.f401340s
            io.ktor.utils.io.core.m r5 = r0.f401339r
            io.ktor.utils.io.a r6 = r0.f401338q
            kotlin.C42729a0.b(r14)     // Catch: java.lang.Throwable -> L34
            goto L90
        L34:
            r12 = move-exception
            goto Lb4
        L37:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3f:
            kotlin.C42729a0.b(r14)
            io.ktor.utils.io.core.m r14 = new io.ktor.utils.io.core.m
            r2 = 0
            r14.<init>(r2, r4, r2)
            kotlin.jvm.internal.l0$g r2 = new kotlin.jvm.internal.l0$g     // Catch: java.lang.Throwable -> Lb8
            r2.<init>()     // Catch: java.lang.Throwable -> Lb8
            r2.f406841b = r12     // Catch: java.lang.Throwable -> Lb8
            io.ktor.utils.io.core.internal.b r12 = r14.m(r4)     // Catch: java.lang.Throwable -> Lb8
            r6 = r11
            r13 = r14
            r5 = r13
        L56:
            int r14 = r12.f400878e     // Catch: java.lang.Throwable -> L34
            int r7 = r12.f400876c     // Catch: java.lang.Throwable -> L34
            int r14 = r14 - r7
            long r7 = (long) r14     // Catch: java.lang.Throwable -> L34
            long r9 = r2.f406841b     // Catch: java.lang.Throwable -> L34
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 <= 0) goto L66
            int r14 = (int) r9     // Catch: java.lang.Throwable -> L34
            r12.f(r14)     // Catch: java.lang.Throwable -> L34
        L66:
            r14 = 6
            int r14 = i0(r6, r12, r3, r14)     // Catch: java.lang.Throwable -> L34
            long r7 = r2.f406841b     // Catch: java.lang.Throwable -> L34
            long r9 = (long) r14     // Catch: java.lang.Throwable -> L34
            long r7 = r7 - r9
            r2.f406841b = r7     // Catch: java.lang.Throwable -> L34
            r9 = 0
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 <= 0) goto L9a
            boolean r14 = r6.x()     // Catch: java.lang.Throwable -> L34
            if (r14 != 0) goto L9a
            r0.f401338q = r6     // Catch: java.lang.Throwable -> L34
            r0.f401339r = r5     // Catch: java.lang.Throwable -> L34
            r0.f401340s = r2     // Catch: java.lang.Throwable -> L34
            r0.f401341t = r13     // Catch: java.lang.Throwable -> L34
            r0.f401342u = r12     // Catch: java.lang.Throwable -> L34
            r0.f401345x = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r14 = r6.t0(r4, r0)     // Catch: java.lang.Throwable -> L34
            if (r14 != r1) goto L90
            return r1
        L90:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> L34
            boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r14 == 0) goto L9a
            r14 = r4
            goto L9b
        L9a:
            r14 = r3
        L9b:
            if (r14 == 0) goto La2
            io.ktor.utils.io.core.internal.b r12 = io.ktor.utils.io.core.internal.i.c(r13, r4, r12)     // Catch: java.lang.Throwable -> L34
            goto L56
        La2:
            r13.a()     // Catch: java.lang.Throwable -> Lb0
            java.lang.Throwable r12 = r6.g()     // Catch: java.lang.Throwable -> Lb0
            if (r12 != 0) goto Lb3
            io.ktor.utils.io.core.n r12 = r5.y()     // Catch: java.lang.Throwable -> Lb0
            return r12
        Lb0:
            r12 = move-exception
            r14 = r5
            goto Lb9
        Lb3:
            throw r12     // Catch: java.lang.Throwable -> Lb0
        Lb4:
            r13.a()     // Catch: java.lang.Throwable -> Lb0
            throw r12     // Catch: java.lang.Throwable -> Lb0
        Lb8:
            r12 = move-exception
        Lb9:
            r14.close()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.s0(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Object t(@Y61.k C41641n c41641n, @Y61.k ContinuationImpl continuationImpl) {
        io.ktor.utils.io.internal.g gVar = this.joining;
        if (gVar != null) {
            A0(this, gVar);
        }
        while (!c41641n.m() && N0(c41641n) != 0) {
            try {
            } catch (Throwable th2) {
                c41641n.z();
                throw th2;
            }
        }
        if (c41641n.o() <= 0) {
            return kotlin.G0.f406611a;
        }
        io.ktor.utils.io.internal.g gVar2 = this.joining;
        if (gVar2 != null) {
            A0(this, gVar2);
        }
        Object objB1 = b1(c41641n, continuationImpl);
        return objB1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB1 : kotlin.G0.f406611a;
    }

    public final Object t0(int i12, ContinuationImpl continuationImpl) throws Throwable {
        if (((io.ktor.utils.io.internal.j) this._state).f401040b._availableForRead$internal >= i12) {
            return Boxing.boxBoolean(true);
        }
        io.ktor.utils.io.internal.e eVar = (io.ktor.utils.io.internal.e) this._closed;
        if (eVar == null) {
            return i12 == 1 ? u0(1, continuationImpl) : v0(i12, continuationImpl);
        }
        Throwable th2 = eVar.f401030a;
        if (th2 != null) {
            W.a(th2);
            throw null;
        }
        io.ktor.utils.io.internal.l lVar = ((io.ktor.utils.io.internal.j) this._state).f401040b;
        boolean z12 = lVar.c() && lVar._availableForRead$internal >= i12;
        if (((Continuation) this._readOp) == null) {
            return Boxing.boxBoolean(z12);
        }
        throw new IllegalStateException("Read operation is already in progress");
    }

    @Y61.k
    public final String toString() {
        return "ByteBufferChannel(" + hashCode() + ", " + ((io.ktor.utils.io.internal.j) this._state) + ')';
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    @InterfaceC42830m
    public final Object u(@Y61.k Y41.p<? super k2, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k Continuation<? super kotlin.G0> continuation) {
        return g1(this, pVar, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u0(int r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.C41712z
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.z r0 = (io.ktor.utils.io.C41712z) r0
            int r1 = r0.f401375t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401375t = r1
            goto L18
        L13:
            io.ktor.utils.io.z r0 = new io.ktor.utils.io.z
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f401373r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401375t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            io.ktor.utils.io.a r5 = r0.f401372q
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L75
        L2b:
            r6 = move-exception
            goto L76
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r6)
            java.lang.Object r6 = r4._state
            io.ktor.utils.io.internal.j r6 = (io.ktor.utils.io.internal.j) r6
            io.ktor.utils.io.internal.l r2 = r6.f401040b
            int r2 = r2._availableForRead$internal
            if (r2 >= r5) goto L7a
            io.ktor.utils.io.internal.g r2 = r4.joining
            if (r2 == 0) goto L54
            java.lang.Object r2 = r4._writeOp
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            if (r2 == 0) goto L54
            io.ktor.utils.io.internal.j$a r2 = io.ktor.utils.io.internal.j.a.f401041c
            if (r6 == r2) goto L7a
            boolean r6 = r6 instanceof io.ktor.utils.io.internal.j.b
            if (r6 != 0) goto L7a
        L54:
            r0.f401372q = r4     // Catch: java.lang.Throwable -> L6f
            r0.f401375t = r3     // Catch: java.lang.Throwable -> L6f
            io.ktor.utils.io.internal.d<java.lang.Boolean> r6 = r4.f400828i     // Catch: java.lang.Throwable -> L6f
            r4.J0(r5, r6)     // Catch: java.lang.Throwable -> L6f
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r6.d(r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L6f
            if (r6 != r5) goto L72
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L6f
            goto L72
        L6f:
            r6 = move-exception
            r5 = r4
            goto L76
        L72:
            if (r6 != r1) goto L75
            return r1
        L75:
            return r6
        L76:
            r0 = 0
            r5._readOp = r0
            throw r6
        L7a:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.u0(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object v(@Y61.k Continuation continuation) {
        return w0(this, Integer.MAX_VALUE, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0086 -> B:39:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v0(int r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.A
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.A r0 = (io.ktor.utils.io.A) r0
            int r1 = r0.f400561u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400561u = r1
            goto L18
        L13:
            io.ktor.utils.io.A r0 = new io.ktor.utils.io.A
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f400559s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400561u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            int r6 = r0.f400558r
            io.ktor.utils.io.a r2 = r0.f400557q
            kotlin.C42729a0.b(r7)
            goto L89
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.C42729a0.b(r7)
            r2 = r5
        L3a:
            java.lang.Object r7 = r2._state
            io.ktor.utils.io.internal.j r7 = (io.ktor.utils.io.internal.j) r7
            io.ktor.utils.io.internal.l r7 = r7.f401040b
            int r7 = r7._availableForRead$internal
            if (r7 < r6) goto L49
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r6
        L49:
            java.lang.Object r7 = r2._closed
            io.ktor.utils.io.internal.e r7 = (io.ktor.utils.io.internal.e) r7
            if (r7 == 0) goto L7c
            java.lang.Throwable r7 = r7.f401030a
            if (r7 != 0) goto L77
            java.lang.Object r7 = r2._state
            io.ktor.utils.io.internal.j r7 = (io.ktor.utils.io.internal.j) r7
            io.ktor.utils.io.internal.l r7 = r7.f401040b
            boolean r0 = r7.c()
            if (r0 == 0) goto L64
            int r7 = r7._availableForRead$internal
            if (r7 < r6) goto L64
            r3 = r4
        L64:
            java.lang.Object r6 = r2._readOp
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            if (r6 != 0) goto L6f
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r6
        L6f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Read operation is already in progress"
            r6.<init>(r7)
            throw r6
        L77:
            io.ktor.utils.io.W.a(r7)
            r6 = 0
            throw r6
        L7c:
            r0.f400557q = r2
            r0.f400558r = r6
            r0.f400561u = r4
            java.lang.Object r7 = r2.u0(r6, r0)
            if (r7 != r1) goto L89
            return r1
        L89:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L3a
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.v0(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object w(@Y61.k ByteBuffer byteBuffer, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        int iH02 = h0(byteBuffer);
        if (iH02 == 0 && ((io.ktor.utils.io.internal.e) this._closed) != null) {
            iH02 = ((io.ktor.utils.io.internal.j) this._state).f401040b.c() ? h0(byteBuffer) : -1;
        } else if (iH02 <= 0 && byteBuffer.hasRemaining()) {
            return l0(byteBuffer, continuationImpl);
        }
        return Boxing.boxInt(iH02);
    }

    @Override // io.ktor.utils.io.W0
    public final boolean x() {
        return ((io.ktor.utils.io.internal.j) this._state) == j.f.f401051c && ((io.ktor.utils.io.internal.e) this._closed) != null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:49:0x0122
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Appendable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0111 -> B:20:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x0(java.lang.StringBuilder r24, int r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C41619a.x0(java.lang.StringBuilder, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Object y(short s5, @Y61.k ContinuationImpl continuationImpl) {
        return c1(this, s5, continuationImpl);
    }

    public final void y0(j.c cVar) {
        this.f400822c.G4(cVar);
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Object z(long j12, @Y61.k ContinuationImpl continuationImpl) {
        return a1(this, j12, continuationImpl);
    }

    @Y61.k
    public final void z0() {
        io.ktor.utils.io.internal.g gVar = this.joining;
        if (gVar != null) {
            A0(this, gVar);
        }
    }

    public C41619a(@Y61.k ByteBuffer byteBuffer) {
        this(false, io.ktor.utils.io.internal.h.f401035d, 0);
        j.c cVar = new j.c(byteBuffer.slice(), 0);
        cVar.f401040b.e();
        this._state = cVar.f401047g;
        C0();
        h(null);
        M0();
    }

    public C41619a(boolean z12, @Y61.k io.ktor.utils.io.pool.h<j.c> hVar, int i12) {
        this.f400821b = z12;
        this.f400822c = hVar;
        this.f400823d = i12;
        this._state = j.a.f401041c;
        this._closed = null;
        this._readOp = null;
        this._writeOp = null;
        this.f400826g = new io.ktor.utils.io.internal.i(this);
        io.ktor.utils.io.internal.u uVar = new io.ktor.utils.io.internal.u();
        z0();
        uVar.f401079b = this;
        io.ktor.utils.io.core.internal.b.f400881j.getClass();
        io.ktor.utils.io.core.internal.b bVar = io.ktor.utils.io.core.internal.b.f400886o;
        uVar.f401080c = bVar.f400874a;
        uVar.f401081d = bVar;
        uVar.f401082e = ((io.ktor.utils.io.internal.j) uVar.f401079b._state).f401040b;
        this.f400827h = uVar;
        this.f400828i = new io.ktor.utils.io.internal.d<>();
        this.f400829j = new io.ktor.utils.io.internal.d<>();
        this.f400830k = new d();
    }
}
