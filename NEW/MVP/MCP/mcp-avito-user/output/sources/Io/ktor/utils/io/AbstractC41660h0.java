package io.ktor.utils.io;

import androidx.media3.exoplayer.C23179x;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.core.C41628a;
import io.ktor.utils.io.core.C41636i;
import io.ktor.utils.io.core.C41640m;
import io.ktor.utils.io.core.C41641n;
import java.io.EOFException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C42729a0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ByteChannelSequential.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/h0;", "Lio/ktor/utils/io/X;", "Lio/ktor/utils/io/W0;", "Lio/ktor/utils/io/d1;", "Lio/ktor/utils/io/b2;", "Lio/ktor/utils/io/O1;", "Lio/ktor/utils/io/P1;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.utils.io.h0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC41660h0 implements X, W0, InterfaceC41649d1, b2, O1, P1 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f400973h = AtomicLongFieldUpdater.newUpdater(AbstractC41660h0.class, "_totalBytesRead");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f400974i = AtomicLongFieldUpdater.newUpdater(AbstractC41660h0.class, "_totalBytesWritten");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f400975j = AtomicIntegerFieldUpdater.newUpdater(AbstractC41660h0.class, "_availableForRead");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f400976k = AtomicIntegerFieldUpdater.newUpdater(AbstractC41660h0.class, "channelSize");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f400977l = AtomicReferenceFieldUpdater.newUpdater(AbstractC41660h0.class, Object.class, "_closed");

    @Y61.k
    private volatile /* synthetic */ int _availableForRead;

    @Y61.k
    private volatile /* synthetic */ Object _closed;

    @Y61.k
    private volatile /* synthetic */ Object _lastReadView;

    @Y61.k
    private volatile /* synthetic */ long _totalBytesRead;

    @Y61.k
    private volatile /* synthetic */ long _totalBytesWritten;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f400978b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41640m f400979c;

    @Y61.k
    private volatile /* synthetic */ int channelSize;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C41641n f400980d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.ktor.utils.io.internal.c f400981e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Object f400982f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C41640m f400983g;

    @Y61.k
    private volatile /* synthetic */ int lastReadAvailable$delegate;

    @Y61.k
    private volatile /* synthetic */ Object lastReadView$delegate;

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"io/ktor/utils/io/h0$a", "Lio/ktor/utils/io/k2;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.h0$a */
    public static final class a implements k2 {
        public a() {
        }

        @Override // io.ktor.utils.io.f2
        @Y61.l
        public final io.ktor.utils.io.core.internal.b a(int i12) {
            AbstractC41660h0 abstractC41660h0 = AbstractC41660h0.this;
            if (abstractC41660h0.V() == 0) {
                return null;
            }
            return abstractC41660h0.f400979c.m(i12);
        }

        @Override // io.ktor.utils.io.f2
        public final void b(int i12) throws Throwable {
            AbstractC41660h0 abstractC41660h0 = AbstractC41660h0.this;
            abstractC41660h0.f400979c.a();
            abstractC41660h0.N(i12);
        }

        @Override // io.ktor.utils.io.k2
        @Y61.l
        public final Object c(int i12, @Y61.k ContinuationImpl continuationImpl) {
            AbstractC41660h0 abstractC41660h0 = AbstractC41660h0.this;
            if (abstractC41660h0.V() >= i12) {
                return kotlin.G0.f406611a;
            }
            Object objP = abstractC41660h0.P(i12, continuationImpl);
            return objP == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objP : kotlin.G0.f406611a;
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0}, l = {570, 572}, m = "readBooleanSlow", n = {"this"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.h0$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public AbstractC41660h0 f400985q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f400986r;

        /* renamed from: t, reason: collision with root package name */
        public int f400988t;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f400986r = obj;
            this.f400988t |= BeduinInputModel.MIN_TEXT_VERSION;
            AtomicLongFieldUpdater atomicLongFieldUpdater = AbstractC41660h0.f400973h;
            return AbstractC41660h0.this.a0(this);
        }
    }

    /* compiled from: ByteChannelSequential.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {775, 776}, m = "writeAvailableSuspend", n = {"this", "src"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.h0$c */
    public static final class c extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public AbstractC41660h0 f400989q;

        /* renamed from: r, reason: collision with root package name */
        public io.ktor.utils.io.core.internal.b f400990r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f400991s;

        /* renamed from: u, reason: collision with root package name */
        public int f400993u;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f400991s = obj;
            this.f400993u |= BeduinInputModel.MIN_TEXT_VERSION;
            AtomicLongFieldUpdater atomicLongFieldUpdater = AbstractC41660h0.f400973h;
            return AbstractC41660h0.this.n0(null, this);
        }
    }

    public AbstractC41660h0() {
        throw null;
    }

    public AbstractC41660h0(io.ktor.utils.io.core.internal.b bVar, boolean z12, io.ktor.utils.io.pool.h hVar, int i12, C42822w c42822w) throws Throwable {
        if ((i12 & 4) != 0) {
            io.ktor.utils.io.core.internal.b.f400881j.getClass();
            hVar = io.ktor.utils.io.core.internal.b.f400884m;
        }
        this.f400978b = z12;
        io.ktor.utils.io.core.internal.b.f400881j.getClass();
        io.ktor.utils.io.core.internal.b bVar2 = io.ktor.utils.io.core.internal.b.f400886o;
        this._lastReadView = bVar2;
        this._totalBytesRead = 0L;
        this._totalBytesWritten = 0L;
        this._availableForRead = 0;
        this.channelSize = 0;
        this._closed = null;
        this.f400979c = new C41640m(hVar);
        this.f400980d = new C41641n(bVar, hVar);
        this.lastReadAvailable$delegate = 0;
        this.lastReadView$delegate = bVar2;
        this.f400981e = new io.ktor.utils.io.internal.c();
        this.f400982f = new Object();
        this.f400983g = new C41640m(null, 1, null);
        int iA2 = (int) C41636i.a(bVar);
        N(iA2);
        f400975j.addAndGet(this, iA2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object Z(io.ktor.utils.io.AbstractC41660h0 r4, byte[] r5, int r6, int r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.C41675m0
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.m0 r0 = (io.ktor.utils.io.C41675m0) r0
            int r1 = r0.f401211w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401211w = r1
            goto L18
        L13:
            io.ktor.utils.io.m0 r0 = new io.ktor.utils.io.m0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f401209u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401211w
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r7 = r0.f401208t
            int r6 = r0.f401207s
            byte[] r5 = r0.f401206r
            io.ktor.utils.io.h0 r4 = r0.f401205q
            kotlin.C42729a0.b(r8)
            goto L6f
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.C42729a0.b(r8)
            java.lang.Throwable r8 = r4.g()
            if (r8 != 0) goto L93
            boolean r8 = r4.W()
            if (r8 == 0) goto L52
            int r8 = r4._availableForRead
            if (r8 != 0) goto L52
            r4 = -1
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            return r4
        L52:
            if (r7 != 0) goto L5a
            r4 = 0
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            return r4
        L5a:
            int r8 = r4._availableForRead
            if (r8 != 0) goto L6f
            r0.f401205q = r4
            r0.f401206r = r5
            r0.f401207s = r6
            r0.f401208t = r7
            r0.f401211w = r3
            java.lang.Object r8 = r4.Q(r3, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            io.ktor.utils.io.core.n r8 = r4.f400980d
            boolean r8 = r8.a()
            if (r8 != 0) goto L7a
            r4.X()
        L7a:
            long r7 = (long) r7
            io.ktor.utils.io.core.n r0 = r4.f400980d
            long r0 = r0.o()
            long r7 = java.lang.Math.min(r7, r0)
            int r7 = (int) r7
            io.ktor.utils.io.core.n r8 = r4.f400980d
            io.ktor.utils.io.core.A.c(r8, r5, r6, r7)
            r4.M(r7)
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            return r4
        L93:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.Z(io.ktor.utils.io.h0, byte[], int, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c0(io.ktor.utils.io.AbstractC41660h0 r5, byte[] r6, int r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.C41687q0
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.q0 r0 = (io.ktor.utils.io.C41687q0) r0
            int r1 = r0.f401266v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401266v = r1
            goto L18
        L13:
            io.ktor.utils.io.q0 r0 = new io.ktor.utils.io.q0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f401264t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401266v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r8)
            goto L71
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            int r7 = r0.f401263s
            byte[] r6 = r0.f401262r
            io.ktor.utils.io.h0 r5 = r0.f401261q
            kotlin.C42729a0.b(r8)
            goto L54
        L3e:
            kotlin.C42729a0.b(r8)
            r0.f401261q = r5
            r0.f401262r = r6
            r0.f401263s = r7
            r0.f401266v = r4
            r5.getClass()
            r8 = 0
            java.lang.Object r8 = Z(r5, r6, r8, r7, r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != r7) goto L5f
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L5f:
            r2 = -1
            if (r8 == r2) goto L74
            int r7 = r7 - r8
            r2 = 0
            r0.f401261q = r2
            r0.f401262r = r2
            r0.f401266v = r3
            java.lang.Object r5 = r5.e0(r6, r8, r7, r0)
            if (r5 != r1) goto L71
            return r1
        L71:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L74:
            java.io.EOFException r5 = new java.io.EOFException
            java.lang.String r6 = "Unexpected end of stream"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.c0(io.ktor.utils.io.h0, byte[], int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v0, types: [io.ktor.utils.io.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [io.ktor.utils.io.h0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.G0] */
    @kotlin.InterfaceC42830m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object k0(io.ktor.utils.io.AbstractC41660h0 r4, Y41.p r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.C41710y0
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.y0 r0 = (io.ktor.utils.io.C41710y0) r0
            int r1 = r0.f401365t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401365t = r1
            goto L18
        L13:
            io.ktor.utils.io.y0 r0 = new io.ktor.utils.io.y0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f401363r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401365t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            io.ktor.utils.io.h0 r4 = r0.f401362q
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L45
        L2b:
            r5 = move-exception
            goto L4b
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C42729a0.b(r6)
            r0.f401362q = r4     // Catch: java.lang.Throwable -> L2b
            r0.f401365t = r3     // Catch: java.lang.Throwable -> L2b
            io.ktor.utils.io.k0 r5 = (io.ktor.utils.io.C41669k0) r5     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = r5.invoke(r4, r0)     // Catch: java.lang.Throwable -> L2b
            if (r5 != r1) goto L45
            return r1
        L45:
            r4.S()
            kotlin.G0 r4 = kotlin.G0.f406611a
            return r4
        L4b:
            r4.S()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.k0(io.ktor.utils.io.h0, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object l0(io.ktor.utils.io.AbstractC41660h0 r6, int r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.C41713z0
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.z0 r0 = (io.ktor.utils.io.C41713z0) r0
            int r1 = r0.f401379t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401379t = r1
            goto L18
        L13:
            io.ktor.utils.io.z0 r0 = new io.ktor.utils.io.z0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f401377r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401379t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.StringBuilder r6 = r0.f401376q
            kotlin.C42729a0.b(r8)
            goto L67
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.C42729a0.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r0.f401376q = r8
            r0.f401379t = r4
            boolean r2 = r6.x()
            if (r2 == 0) goto L53
            java.lang.Throwable r6 = r6.g()
            if (r6 != 0) goto L52
            r6 = 0
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            goto L61
        L52:
            throw r6
        L53:
            io.ktor.utils.io.A0 r2 = new io.ktor.utils.io.A0
            r2.<init>(r6, r3)
            io.ktor.utils.io.B0 r4 = new io.ktor.utils.io.B0
            r4.<init>(r6)
            java.lang.Object r6 = io.ktor.utils.io.core.internal.h.a(r8, r7, r2, r4, r0)
        L61:
            if (r6 != r1) goto L64
            return r1
        L64:
            r5 = r8
            r8 = r6
            r6 = r5
        L67:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto L70
            return r3
        L70:
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.l0(io.ktor.utils.io.h0, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object o0(io.ktor.utils.io.AbstractC41660h0 r4, byte r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.D0
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.D0 r0 = (io.ktor.utils.io.D0) r0
            int r1 = r0.f400593u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400593u = r1
            goto L18
        L13:
            io.ktor.utils.io.D0 r0 = new io.ktor.utils.io.D0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f400591s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400593u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            byte r5 = r0.f400590r
            io.ktor.utils.io.h0 r4 = r0.f400589q
            kotlin.C42729a0.b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C42729a0.b(r6)
            r0.f400589q = r4
            r0.f400590r = r5
            r0.f400593u = r3
            java.lang.Object r6 = r4.P(r3, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            io.ktor.utils.io.core.m r6 = r4.f400979c
            byte r5 = (byte) r5
            r6.o(r5)
            r4.N(r3)
            kotlin.G0 r4 = kotlin.G0.f406611a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.o0(io.ktor.utils.io.h0, byte, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object p0(io.ktor.utils.io.AbstractC41660h0 r4, io.ktor.utils.io.core.C41628a r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.G0
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.G0 r0 = (io.ktor.utils.io.G0) r0
            int r1 = r0.f400618u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400618u = r1
            goto L18
        L13:
            io.ktor.utils.io.G0 r0 = new io.ktor.utils.io.G0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f400616s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400618u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            io.ktor.utils.io.core.a r5 = r0.f400615r
            io.ktor.utils.io.h0 r4 = r0.f400614q
            kotlin.C42729a0.b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C42729a0.b(r6)
            r0.f400614q = r4
            r0.f400615r = r5
            r0.f400618u = r3
            java.lang.Object r6 = r4.P(r3, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            int r6 = r5.f400876c
            int r0 = r5.f400875b
            int r6 = r6 - r0
            io.ktor.utils.io.core.m r0 = r4.f400979c
            io.ktor.utils.io.core.G.a(r0, r5, r6)
            r4.N(r6)
            kotlin.G0 r4 = kotlin.G0.f406611a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.p0(io.ktor.utils.io.h0, io.ktor.utils.io.core.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0055 -> B:19:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object q0(io.ktor.utils.io.AbstractC41660h0 r5, byte[] r6, int r7, int r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.H0
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.H0 r0 = (io.ktor.utils.io.H0) r0
            int r1 = r0.f400630w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400630w = r1
            goto L18
        L13:
            io.ktor.utils.io.H0 r0 = new io.ktor.utils.io.H0
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f400628u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400630w
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r5 = r0.f400627t
            int r6 = r0.f400626s
            byte[] r7 = r0.f400625r
            io.ktor.utils.io.h0 r8 = r0.f400624q
            kotlin.C42729a0.b(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L58
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            kotlin.C42729a0.b(r9)
            int r8 = r8 + r7
            r4 = r6
            r6 = r5
            r5 = r8
            r8 = r7
            r7 = r4
        L45:
            if (r8 >= r5) goto L6c
            r0.f400624q = r6
            r0.f400625r = r7
            r0.f400626s = r8
            r0.f400627t = r5
            r0.f400630w = r3
            java.lang.Object r9 = r6.P(r3, r0)
            if (r9 != r1) goto L58
            return r1
        L58:
            int r9 = r6.V()
            int r2 = r5 - r8
            int r9 = java.lang.Math.min(r9, r2)
            io.ktor.utils.io.core.m r2 = r6.f400979c
            io.ktor.utils.io.core.G.b(r2, r7, r8, r9)
            int r8 = r8 + r9
            r6.N(r9)
            goto L45
        L6c:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.q0(io.ktor.utils.io.h0, byte[], int, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object r0(io.ktor.utils.io.AbstractC41660h0 r5, int r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.J0
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.J0 r0 = (io.ktor.utils.io.J0) r0
            int r1 = r0.f400652u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400652u = r1
            goto L18
        L13:
            io.ktor.utils.io.J0 r0 = new io.ktor.utils.io.J0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f400650s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400652u
            r3 = 4
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            int r6 = r0.f400649r
            io.ktor.utils.io.h0 r5 = r0.f400648q
            kotlin.C42729a0.b(r7)
            goto L46
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.C42729a0.b(r7)
            r0.f400648q = r5
            r0.f400649r = r6
            r0.f400652u = r4
            java.lang.Object r7 = r5.P(r3, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            io.ktor.utils.io.core.m r7 = r5.f400979c
            int r0 = r7.f400866f
            int r1 = r7.f400867g
            int r1 = r1 - r0
            if (r1 <= r3) goto L59
            int r1 = r0 + 4
            r7.f400866f = r1
            java.nio.ByteBuffer r7 = r7.f400865e
            r7.putInt(r0, r6)
            goto L6f
        L59:
            io.ktor.utils.io.core.internal.b r0 = r7.m(r3)
            int r1 = r0.f400876c
            int r2 = r0.f400878e
            int r2 = r2 - r1
            if (r2 < r3) goto L75
            java.nio.ByteBuffer r2 = r0.f400874a
            r2.putInt(r1, r6)
            r0.a(r3)
            r7.a()
        L6f:
            r5.N(r3)
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L75:
            io.ktor.utils.io.core.InsufficientSpaceException r5 = new io.ktor.utils.io.core.InsufficientSpaceException
            java.lang.String r6 = "regular integer"
            r5.<init>(r6, r3, r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.r0(io.ktor.utils.io.h0, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object s0(io.ktor.utils.io.AbstractC41660h0 r5, long r6, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.K0
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.K0 r0 = (io.ktor.utils.io.K0) r0
            int r1 = r0.f400663u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400663u = r1
            goto L18
        L13:
            io.ktor.utils.io.K0 r0 = new io.ktor.utils.io.K0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f400661s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400663u
            r3 = 8
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            long r6 = r0.f400660r
            io.ktor.utils.io.h0 r5 = r0.f400659q
            kotlin.C42729a0.b(r8)
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.C42729a0.b(r8)
            r0.f400659q = r5
            r0.f400660r = r6
            r0.f400663u = r4
            java.lang.Object r8 = r5.P(r3, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            io.ktor.utils.io.core.m r8 = r5.f400979c
            int r0 = r8.f400866f
            int r1 = r8.f400867g
            int r1 = r1 - r0
            if (r1 <= r3) goto L5a
            int r1 = r0 + 8
            r8.f400866f = r1
            java.nio.ByteBuffer r8 = r8.f400865e
            r8.putLong(r0, r6)
            goto L70
        L5a:
            io.ktor.utils.io.core.internal.b r0 = r8.m(r3)
            int r1 = r0.f400876c
            int r2 = r0.f400878e
            int r2 = r2 - r1
            if (r2 < r3) goto L76
            java.nio.ByteBuffer r2 = r0.f400874a
            r2.putLong(r1, r6)
            r0.a(r3)
            r8.a()
        L70:
            r5.N(r3)
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L76:
            io.ktor.utils.io.core.InsufficientSpaceException r5 = new io.ktor.utils.io.core.InsufficientSpaceException
            java.lang.String r6 = "long integer"
            r5.<init>(r6, r3, r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.s0(io.ktor.utils.io.h0, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object t0(io.ktor.utils.io.AbstractC41660h0 r4, io.ktor.utils.io.core.C41641n r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.L0
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.L0 r0 = (io.ktor.utils.io.L0) r0
            int r1 = r0.f400674u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400674u = r1
            goto L18
        L13:
            io.ktor.utils.io.L0 r0 = new io.ktor.utils.io.L0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f400672s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400674u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            io.ktor.utils.io.core.n r5 = r0.f400671r
            io.ktor.utils.io.h0 r4 = r0.f400670q
            kotlin.C42729a0.b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C42729a0.b(r6)
            r0.f400670q = r4
            r0.f400671r = r5
            r0.f400674u = r3
            java.lang.Object r6 = r4.P(r3, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            long r0 = r5.o()
            int r6 = (int) r0
            io.ktor.utils.io.core.m r0 = r4.f400979c
            r0.p(r5)
            r4.N(r6)
            kotlin.G0 r4 = kotlin.G0.f406611a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.t0(io.ktor.utils.io.h0, io.ktor.utils.io.core.n, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object u0(io.ktor.utils.io.AbstractC41660h0 r5, short r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.M0
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.M0 r0 = (io.ktor.utils.io.M0) r0
            int r1 = r0.f400686u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400686u = r1
            goto L18
        L13:
            io.ktor.utils.io.M0 r0 = new io.ktor.utils.io.M0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f400684s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400686u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            short r6 = r0.f400683r
            io.ktor.utils.io.h0 r5 = r0.f400682q
            kotlin.C42729a0.b(r7)
            goto L46
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.C42729a0.b(r7)
            r0.f400682q = r5
            r0.f400683r = r6
            r0.f400686u = r4
            java.lang.Object r7 = r5.P(r3, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            io.ktor.utils.io.core.m r7 = r5.f400979c
            short r6 = (short) r6
            io.ktor.utils.io.core.I.a(r7, r6)
            r5.N(r3)
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.u0(io.ktor.utils.io.h0, short, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object A(@Y61.k ContinuationImpl continuationImpl) {
        C41641n c41641n = this.f400980d;
        if (!c41641n.p(4)) {
            return f0(continuationImpl);
        }
        int iA2 = io.ktor.utils.io.core.D.a(c41641n);
        M(4);
        return Boxing.boxInt(iA2);
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object C(long j12, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        long jD2 = this.f400980d.d(j12);
        M((int) jD2);
        if (jD2 != j12 && !x()) {
            return T(j12, jD2, continuationImpl);
        }
        Throwable thG = g();
        if (thG == null) {
            return Boxing.boxLong(jD2);
        }
        throw thG;
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Object D(@Y61.k byte[] bArr, int i12, int i13, @Y61.k ContinuationImpl continuationImpl) {
        return q0(this, bArr, i12, i13, continuationImpl);
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    /* renamed from: F, reason: from getter */
    public final boolean getF400978b() {
        return this.f400978b;
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object H(@Y61.k byte[] bArr, int i12, int i13, @Y61.k ContinuationImpl continuationImpl) {
        return Z(this, bArr, i12, i13, continuationImpl);
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object I(long j12, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        Throwable thG = g();
        if (thG != null) {
            throw thG;
        }
        C41640m c41640m = new C41640m(null, 1, null);
        C41641n c41641n = this.f400980d;
        long jMin = Math.min(j12, c41641n.o());
        c41640m.u(c41641n, jMin);
        M((int) jMin);
        if (j12 - c41640m.k() != 0 && !x()) {
            return i0(c41640m, j12, continuationImpl);
        }
        Throwable thG2 = g();
        if (thG2 == null) {
            return c41640m.y();
        }
        c41640m.close();
        throw thG2;
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object J(@Y61.k ContinuationImpl continuationImpl) {
        C41641n c41641n = this.f400980d;
        if (!c41641n.p(8)) {
            return g0(continuationImpl);
        }
        long jB2 = io.ktor.utils.io.core.D.b(c41641n);
        M(8);
        return Boxing.boxLong(jB2);
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object K(@Y61.k byte[] bArr, int i12, @Y61.k ContinuationImpl continuationImpl) {
        return c0(this, bArr, i12, continuationImpl);
    }

    @Override // io.ktor.utils.io.P1
    @Y61.k
    public final k2 L() {
        return new a();
    }

    public final void M(int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "Can't read negative amount of bytes: ").toString());
        }
        int i13 = -i12;
        f400976k.getAndAdd(this, i13);
        f400973h.addAndGet(this, i12);
        f400975j.getAndAdd(this, i13);
        if (this.channelSize < 0) {
            StringBuilder sb2 = new StringBuilder("Readable bytes count is negative: ");
            C23179x.a(sb2, this._availableForRead, ", ", i12, " in ");
            sb2.append(this);
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (this._availableForRead >= 0) {
            this.f400981e.a();
            return;
        }
        StringBuilder sb3 = new StringBuilder("Readable bytes count is negative: ");
        C23179x.a(sb3, this._availableForRead, ", ", i12, " in ");
        sb3.append(this);
        throw new IllegalStateException(sb3.toString().toString());
    }

    public final void N(int i12) throws Throwable {
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "Can't write negative amount of bytes: ").toString());
        }
        f400976k.getAndAdd(this, i12);
        f400974i.addAndGet(this, i12);
        if (this.channelSize < 0) {
            StringBuilder sb2 = new StringBuilder("Readable bytes count is negative: ");
            C23179x.a(sb2, this.channelSize, ", ", i12, " in ");
            sb2.append(this);
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (W()) {
            this.f400979c.close();
            if (W()) {
                Throwable thG = g();
                if (thG != null) {
                    throw thG;
                }
                throw new ClosedWriteChannelException("Channel " + this + " is already closed");
            }
        }
        if (this.f400978b || V() == 0) {
            U();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(int r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.C41623b0
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.b0 r0 = (io.ktor.utils.io.C41623b0) r0
            int r1 = r0.f400849u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400849u = r1
            goto L18
        L13:
            io.ktor.utils.io.b0 r0 = new io.ktor.utils.io.b0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f400847s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400849u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r6 = r0.f400846r
            io.ktor.utils.io.h0 r2 = r0.f400845q
            kotlin.C42729a0.b(r7)
            goto L39
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.C42729a0.b(r7)
            r2 = r5
        L39:
            int r7 = r2._availableForRead
            if (r7 >= r6) goto L57
            boolean r7 = r2.x()
            if (r7 != 0) goto L57
            io.ktor.utils.io.internal.c r7 = r2.f400981e
            io.ktor.utils.io.c0 r4 = new io.ktor.utils.io.c0
            r4.<init>(r2, r6)
            r0.f400845q = r2
            r0.f400846r = r6
            r0.f400849u = r3
            java.lang.Object r7 = r7.b(r4, r0)
            if (r7 != r1) goto L39
            return r1
        L57:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.O(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(int r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.C41648d0
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.d0 r0 = (io.ktor.utils.io.C41648d0) r0
            int r1 = r0.f400935u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400935u = r1
            goto L18
        L13:
            io.ktor.utils.io.d0 r0 = new io.ktor.utils.io.d0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f400933s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400935u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r6 = r0.f400932r
            io.ktor.utils.io.h0 r2 = r0.f400931q
            kotlin.C42729a0.b(r7)
            goto L39
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.C42729a0.b(r7)
            r2 = r5
        L39:
            int r7 = r2.V()
            if (r7 >= r6) goto L5f
            boolean r7 = r2.W()
            if (r7 != 0) goto L5f
            boolean r7 = r2.U()
            if (r7 != 0) goto L39
            io.ktor.utils.io.e0 r7 = new io.ktor.utils.io.e0
            r7.<init>(r2, r6)
            r0.f400931q = r2
            r0.f400932r = r6
            r0.f400935u = r3
            io.ktor.utils.io.internal.c r4 = r2.f400981e
            java.lang.Object r7 = r4.b(r7, r0)
            if (r7 != r1) goto L39
            return r1
        L5f:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.P(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(int r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.C41657g0
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.g0 r0 = (io.ktor.utils.io.C41657g0) r0
            int r1 = r0.f400963u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400963u = r1
            goto L18
        L13:
            io.ktor.utils.io.g0 r0 = new io.ktor.utils.io.g0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f400961s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400963u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r5 = r0.f400960r
            io.ktor.utils.io.h0 r0 = r0.f400959q
            kotlin.C42729a0.b(r6)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r6)
            if (r5 < 0) goto L63
            r0.f400959q = r4
            r0.f400960r = r5
            r0.f400963u = r3
            java.lang.Object r6 = r4.O(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            r0.X()
            java.lang.Throwable r6 = r0.g()
            if (r6 != 0) goto L62
            boolean r6 = r0.x()
            if (r6 != 0) goto L5c
            int r6 = r0._availableForRead
            if (r6 < r5) goto L5c
            goto L5d
        L5c:
            r3 = 0
        L5d:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r5
        L62:
            throw r6
        L63:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Failed requirement."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.Q(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void R(int i12, C41640m c41640m) throws Throwable {
        Throwable thG = g();
        if (thG != null) {
            if (c41640m == null) {
                throw thG;
            }
            c41640m.close();
            throw thG;
        }
        if (!W() || this._availableForRead >= i12) {
            return;
        }
        if (c41640m != null) {
            c41640m.close();
        }
        throw new EOFException(i12 + " bytes required but EOF reached");
    }

    public final void S() {
        io.ktor.utils.io.core.internal.b bVar = (io.ktor.utils.io.core.internal.b) this.lastReadView$delegate;
        int i12 = this.lastReadAvailable$delegate - (bVar.f400876c - bVar.f400875b);
        io.ktor.utils.io.core.internal.b bVar2 = (io.ktor.utils.io.core.internal.b) this.lastReadView$delegate;
        C41628a.f400873g.getClass();
        if (bVar2 != C41628a.C11424a.a()) {
            io.ktor.utils.io.core.internal.i.a(this.f400980d, (io.ktor.utils.io.core.internal.b) this.lastReadView$delegate);
        }
        if (i12 > 0) {
            M(i12);
        }
        this.lastReadAvailable$delegate = 0;
        io.ktor.utils.io.core.internal.b.f400881j.getClass();
        this.lastReadView$delegate = io.ktor.utils.io.core.internal.b.f400886o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r2.x() == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004a -> B:18:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(long r9, long r11, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r13 instanceof io.ktor.utils.io.C41663i0
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.i0 r0 = (io.ktor.utils.io.C41663i0) r0
            int r1 = r0.f401007v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401007v = r1
            goto L18
        L13:
            io.ktor.utils.io.i0 r0 = new io.ktor.utils.io.i0
            r0.<init>(r8, r13)
        L18:
            java.lang.Object r13 = r0.f401005t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401007v
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            long r9 = r0.f401004s
            long r11 = r0.f401003r
            io.ktor.utils.io.h0 r2 = r0.f401002q
            kotlin.C42729a0.b(r13)
            r6 = r9
            r9 = r11
            r11 = r6
            goto L4d
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            kotlin.C42729a0.b(r13)
            r2 = r8
        L3e:
            r0.f401002q = r2
            r0.f401003r = r9
            r0.f401004s = r11
            r0.f401007v = r3
            java.lang.Object r13 = r2.b(r3, r0)
            if (r13 != r1) goto L4d
            return r1
        L4d:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L6c
            io.ktor.utils.io.core.n r13 = r2.f400980d
            long r4 = r9 - r11
            long r4 = r13.d(r4)
            int r13 = (int) r4
            r2.M(r13)
            long r11 = r11 + r4
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 >= 0) goto L6c
            boolean r13 = r2.x()
            if (r13 == 0) goto L3e
        L6c:
            java.lang.Throwable r9 = r2.g()
            if (r9 != 0) goto L77
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r11)
            return r9
        L77:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.T(long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean U() {
        if (this.f400979c.k() == 0) {
            this.f400981e.a();
            return false;
        }
        synchronized (this.f400982f) {
            int iK2 = this.f400979c.k();
            io.ktor.utils.io.core.internal.b bVarN = this.f400979c.n();
            C41640m c41640m = this.f400983g;
            io.ktor.utils.io.core.internal.b bVar = c41640m.f400864d;
            if (bVar == null) {
                c41640m.f(bVarN);
            } else {
                c41640m.x(bVar, bVarN, c41640m.f400862b);
            }
            f400975j.addAndGet(this, iK2);
        }
        this.f400981e.a();
        return true;
    }

    public final int V() {
        return Math.max(0, 4088 - this.channelSize);
    }

    public final boolean W() {
        return this._closed != null;
    }

    public final void X() {
        synchronized (this.f400982f) {
            io.ktor.utils.io.core.internal.i.d(this.f400980d, this.f400983g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v8, types: [io.ktor.utils.io.core.a] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(@Y61.k io.ktor.utils.io.core.internal.b r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.C41672l0
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.l0 r0 = (io.ktor.utils.io.C41672l0) r0
            int r1 = r0.f401196u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401196u = r1
            goto L18
        L13:
            io.ktor.utils.io.l0 r0 = new io.ktor.utils.io.l0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f401194s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401196u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            io.ktor.utils.io.core.a r6 = r0.f401193r
            io.ktor.utils.io.h0 r0 = r0.f401192q
            kotlin.C42729a0.b(r7)
            goto L6d
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.C42729a0.b(r7)
            java.lang.Throwable r7 = r5.g()
            if (r7 != 0) goto L96
            boolean r7 = r5.W()
            if (r7 == 0) goto L4e
            int r7 = r5._availableForRead
            if (r7 != 0) goto L4e
            r6 = -1
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            return r6
        L4e:
            int r7 = r6.f400878e
            int r2 = r6.f400876c
            int r7 = r7 - r2
            if (r7 != 0) goto L5b
            r6 = 0
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            return r6
        L5b:
            int r7 = r5._availableForRead
            if (r7 != 0) goto L6c
            r0.f401192q = r5
            r0.f401193r = r6
            r0.f401196u = r3
            java.lang.Object r7 = r5.Q(r3, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            r0 = r5
        L6d:
            io.ktor.utils.io.core.n r7 = r0.f400980d
            boolean r7 = r7.a()
            if (r7 != 0) goto L78
            r0.X()
        L78:
            int r7 = r6.f400878e
            int r1 = r6.f400876c
            int r7 = r7 - r1
            long r1 = (long) r7
            io.ktor.utils.io.core.n r7 = r0.f400980d
            long r3 = r7.o()
            long r1 = java.lang.Math.min(r1, r3)
            int r7 = (int) r1
            io.ktor.utils.io.core.n r1 = r0.f400980d
            io.ktor.utils.io.core.A.b(r1, r6, r7)
            r0.M(r7)
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            return r6
        L96:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.Y(io.ktor.utils.io.core.internal.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.U1
    @Y61.l
    public final io.ktor.utils.io.core.internal.b a(int i12) throws Throwable {
        Throwable thG = g();
        if (thG != null) {
            throw thG;
        }
        S();
        return m0(i12);
    }

    public final Object a0(Continuation<? super Boolean> continuation) throws Throwable {
        AbstractC41660h0 abstractC41660h0;
        b bVar = (b) continuation;
        int i12 = bVar.f400988t;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            bVar.f400988t = i12 - BeduinInputModel.MIN_TEXT_VERSION;
        } else {
            bVar = new b(continuation);
        }
        Object objA0 = bVar.f400986r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = bVar.f400988t;
        if (i13 == 0) {
            C42729a0.b(objA0);
            bVar.f400985q = this;
            bVar.f400988t = 1;
            if (Q(1, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            abstractC41660h0 = this;
        } else {
            if (i13 != 1) {
                if (i13 == 2) {
                    C42729a0.b(objA0);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC41660h0 = bVar.f400985q;
            C42729a0.b(objA0);
        }
        abstractC41660h0.R(1, null);
        bVar.f400985q = null;
        bVar.f400988t = 2;
        C41641n c41641n = abstractC41660h0.f400980d;
        if (c41641n.a()) {
            boolean z12 = c41641n.readByte() == 1;
            abstractC41660h0.M(1);
            objA0 = Boxing.boxBoolean(z12);
        } else {
            objA0 = abstractC41660h0.a0(bVar);
        }
        return objA0 == coroutine_suspended ? coroutine_suspended : objA0;
    }

    @Override // io.ktor.utils.io.b2
    @Y61.l
    public final Object b(int i12, @Y61.k ContinuationImpl continuationImpl) {
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "atLeast parameter shouldn't be negative: ").toString());
        }
        long j12 = i12;
        if (j12 > 4088) {
            throw new IllegalArgumentException(AK.c.g(i12, "atLeast parameter shouldn't be larger than max buffer size of 4088: ").toString());
        }
        S();
        return i12 == 0 ? Boxing.boxBoolean(!x()) : this.f400980d.o() >= j12 ? Boxing.boxBoolean(true) : Q(i12, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b0(kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.utils.io.C41678n0
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.n0 r0 = (io.ktor.utils.io.C41678n0) r0
            int r1 = r0.f401219t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401219t = r1
            goto L18
        L13:
            io.ktor.utils.io.n0 r0 = new io.ktor.utils.io.n0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f401217r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401219t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            io.ktor.utils.io.h0 r2 = r0.f401216q
            kotlin.C42729a0.b(r5)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C42729a0.b(r5)
            r2 = r4
        L37:
            r0.f401216q = r2
            r0.f401219t = r3
            java.lang.Object r5 = r2.Q(r3, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            io.ktor.utils.io.core.n r5 = r2.f400980d
            boolean r5 = r5.m()
            if (r5 != 0) goto L5b
            io.ktor.utils.io.core.n r5 = r2.f400980d
            byte r5 = r5.readByte()
            java.lang.Byte r5 = kotlin.coroutines.jvm.internal.Boxing.boxByte(r5)
            r5.getClass()
            r2.M(r3)
            return r5
        L5b:
            r5 = 0
            r2.R(r3, r5)
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.b0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.U1
    public final int c(int i12) throws Throwable {
        Throwable thG = g();
        if (thG != null) {
            throw thG;
        }
        if (i12 == 0) {
            return 0;
        }
        int iC2 = this.f400980d.c(i12);
        M(i12);
        m0(1);
        return iC2;
    }

    @Override // io.ktor.utils.io.O1
    public final void d() {
        S();
    }

    public final Object d0(C41628a c41628a, Continuation continuation) throws Throwable {
        AbstractC41660h0 abstractC41660h0;
        Object objD0;
        C41689r0 c41689r0 = (C41689r0) continuation;
        int i12 = c41689r0.f401275u;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            c41689r0.f401275u = i12 - BeduinInputModel.MIN_TEXT_VERSION;
        } else {
            c41689r0 = new C41689r0(this, continuation);
        }
        Object obj = c41689r0.f401273s;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c41689r0.f401275u;
        if (i13 == 0) {
            C42729a0.b(obj);
            c41689r0.f401271q = this;
            c41689r0.f401272r = c41628a;
            c41689r0.f401275u = 1;
            if (Q(0, c41689r0) == coroutine_suspended) {
                return coroutine_suspended;
            }
            abstractC41660h0 = this;
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return kotlin.G0.f406611a;
            }
            c41628a = c41689r0.f401272r;
            abstractC41660h0 = c41689r0.f401271q;
            C42729a0.b(obj);
        }
        c41689r0.f401271q = null;
        c41689r0.f401272r = null;
        c41689r0.f401275u = 2;
        abstractC41660h0.getClass();
        if (c41628a.f400878e - c41628a.f400876c < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(0, "Not enough space in the destination buffer to write ", " bytes").toString());
        }
        if (abstractC41660h0.g() != null) {
            throw abstractC41660h0.g();
        }
        if (abstractC41660h0.f400980d.o() >= 0) {
            io.ktor.utils.io.core.A.b(abstractC41660h0.f400980d, c41628a, 0);
            kotlin.G0 g02 = kotlin.G0.f406611a;
            abstractC41660h0.M(0);
            objD0 = kotlin.G0.f406611a;
        } else {
            if (abstractC41660h0.W()) {
                throw new EOFException(AK.c.i(abstractC41660h0._availableForRead, " available", androidx.camera.camera2.internal.G.j(0, "Channel is closed and not enough bytes available: required ", " but ")));
            }
            objD0 = abstractC41660h0.d0(c41628a, c41689r0);
            if (objD0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objD0 = kotlin.G0.f406611a;
            }
        }
        if (objD0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.G0.f406611a;
    }

    @Override // io.ktor.utils.io.P1
    public final void e(int i12) throws Throwable {
        this.f400979c.a();
        N(i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0065 -> B:12:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e0(byte[] r8, int r9, int r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof io.ktor.utils.io.C41692s0
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.s0 r0 = (io.ktor.utils.io.C41692s0) r0
            int r1 = r0.f401293x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401293x = r1
            goto L18
        L13:
            io.ktor.utils.io.s0 r0 = new io.ktor.utils.io.s0
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.f401291v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401293x
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            int r8 = r0.f401290u
            int r9 = r0.f401289t
            int r10 = r0.f401288s
            byte[] r2 = r0.f401287r
            io.ktor.utils.io.h0 r4 = r0.f401286q
            kotlin.C42729a0.b(r11)
            r6 = r0
            r0 = r9
            r9 = r2
        L35:
            r2 = r6
            goto L69
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            kotlin.C42729a0.b(r11)
            r11 = 0
            r4 = r7
            r6 = r9
            r9 = r8
            r8 = r11
            r11 = r10
            r10 = r6
        L49:
            if (r8 >= r11) goto L7e
            int r2 = r10 + r8
            int r5 = r11 - r8
            r0.f401286q = r4
            r0.f401287r = r9
            r0.f401288s = r10
            r0.f401289t = r11
            r0.f401290u = r8
            r0.f401293x = r3
            r4.getClass()
            java.lang.Object r2 = Z(r4, r9, r2, r5, r0)
            if (r2 != r1) goto L65
            return r1
        L65:
            r6 = r0
            r0 = r11
            r11 = r2
            goto L35
        L69:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r5 = -1
            if (r11 == r5) goto L76
            int r8 = r8 + r11
            r11 = r0
            r0 = r2
            goto L49
        L76:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.String r9 = "Unexpected end of stream"
            r8.<init>(r9)
            throw r8
        L7e:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.e0(byte[], int, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.W0
    public final boolean f(@Y61.l Throwable th2) {
        if (g() != null || W()) {
            return false;
        }
        if (th2 == null) {
            th2 = new CancellationException("Channel cancelled");
        }
        return h(th2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f0(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.C41695t0
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.t0 r0 = (io.ktor.utils.io.C41695t0) r0
            int r1 = r0.f401305t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401305t = r1
            goto L18
        L13:
            io.ktor.utils.io.t0 r0 = new io.ktor.utils.io.t0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f401303r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401305t
            r3 = 4
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            io.ktor.utils.io.h0 r0 = r0.f401302q
            kotlin.C42729a0.b(r6)
            goto L43
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.C42729a0.b(r6)
            r0.f401302q = r5
            r0.f401305t = r4
            java.lang.Object r6 = r5.Q(r3, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            r0 = r5
        L43:
            io.ktor.utils.io.core.n r6 = r0.f400980d
            int r6 = io.ktor.utils.io.core.D.a(r6)
            r0.M(r3)
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.f0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    public final void flush() {
        U();
    }

    @Override // io.ktor.utils.io.W0, io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Throwable g() {
        C41696t1 c41696t1 = (C41696t1) this._closed;
        if (c41696t1 != null) {
            return c41696t1.f401306a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g0(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.C41698u0
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.u0 r0 = (io.ktor.utils.io.C41698u0) r0
            int r1 = r0.f401315t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401315t = r1
            goto L18
        L13:
            io.ktor.utils.io.u0 r0 = new io.ktor.utils.io.u0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f401313r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401315t
            r3 = 8
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            io.ktor.utils.io.h0 r0 = r0.f401312q
            kotlin.C42729a0.b(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.C42729a0.b(r6)
            r0.f401312q = r5
            r0.f401315t = r4
            java.lang.Object r6 = r5.Q(r3, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r0 = r5
        L44:
            io.ktor.utils.io.core.n r6 = r0.f400980d
            long r1 = io.ktor.utils.io.core.D.b(r6)
            r0.M(r3)
            java.lang.Long r6 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.g0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    public final boolean h(@Y61.l Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C41696t1 c41696t1 = th2 == null ? C41699u1.f401316a : new C41696t1(th2);
        do {
            atomicReferenceFieldUpdater = f400977l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c41696t1)) {
                if (th2 != null) {
                    this.f400980d.z();
                    this.f400979c.close();
                    this.f400983g.close();
                } else {
                    U();
                }
                io.ktor.utils.io.internal.c cVar = this.f400981e;
                cVar.getClass();
                kotlinx.coroutines.C c12 = (kotlinx.coroutines.C) io.ktor.utils.io.internal.c.f401022a.getAndSet(cVar, null);
                if (c12 == null) {
                    return true;
                }
                if (th2 != null) {
                    c12.b(th2);
                    return true;
                }
                c12.q3();
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h0(io.ktor.utils.io.core.C41640m r10, int r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof io.ktor.utils.io.C41701v0
            if (r0 == 0) goto L13
            r0 = r12
            io.ktor.utils.io.v0 r0 = (io.ktor.utils.io.C41701v0) r0
            int r1 = r0.f401329v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401329v = r1
            goto L18
        L13:
            io.ktor.utils.io.v0 r0 = new io.ktor.utils.io.v0
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f401327t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401329v
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r10 = r0.f401326s
            io.ktor.utils.io.core.m r11 = r0.f401325r
            io.ktor.utils.io.h0 r2 = r0.f401324q
            kotlin.C42729a0.b(r12)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L3e
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            kotlin.C42729a0.b(r12)
            r2 = r9
        L3e:
            if (r11 <= 0) goto L69
            long r4 = (long) r11
            io.ktor.utils.io.core.n r12 = r2.f400980d
            long r6 = r12.o()
            long r4 = java.lang.Math.min(r4, r6)
            int r12 = (int) r4
            int r11 = r11 - r12
            io.ktor.utils.io.core.n r4 = r2.f400980d
            r10.q(r4, r12)
            r2.M(r12)
            r2.R(r11, r10)
            if (r11 <= 0) goto L3e
            r0.f401324q = r2
            r0.f401325r = r10
            r0.f401326s = r11
            r0.f401329v = r3
            java.lang.Object r12 = r2.Q(r3, r0)
            if (r12 != r1) goto L3e
            return r1
        L69:
            r2.R(r11, r10)
            io.ktor.utils.io.core.n r10 = r10.y()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.h0(io.ktor.utils.io.core.m, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.W0
    /* renamed from: i, reason: from getter */
    public final int get_availableForRead() {
        return this._availableForRead;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i0(io.ktor.utils.io.core.C41640m r11, long r12, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof io.ktor.utils.io.C41704w0
            if (r0 == 0) goto L13
            r0 = r14
            io.ktor.utils.io.w0 r0 = (io.ktor.utils.io.C41704w0) r0
            int r1 = r0.f401351v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401351v = r1
            goto L18
        L13:
            io.ktor.utils.io.w0 r0 = new io.ktor.utils.io.w0
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f401349t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401351v
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            long r11 = r0.f401348s
            io.ktor.utils.io.core.m r13 = r0.f401347r
            io.ktor.utils.io.h0 r2 = r0.f401346q
            kotlin.C42729a0.b(r14)
            r8 = r11
            r11 = r13
            r12 = r8
            goto L3e
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            kotlin.C42729a0.b(r14)
            r2 = r10
        L3e:
            int r14 = r11.k()
            long r4 = (long) r14
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 >= 0) goto L88
            int r14 = r11.k()
            long r4 = (long) r14
            long r4 = r12 - r4
            io.ktor.utils.io.core.n r14 = r2.f400980d
            long r6 = r14.o()
            long r4 = java.lang.Math.min(r4, r6)
            io.ktor.utils.io.core.n r14 = r2.f400980d
            r11.u(r14, r4)
            int r14 = (int) r4
            r2.M(r14)
            java.lang.Throwable r14 = r2.g()
            if (r14 != 0) goto L84
            boolean r14 = r2.x()
            if (r14 != 0) goto L88
            int r14 = r11.k()
            int r4 = (int) r12
            if (r14 != r4) goto L75
            goto L88
        L75:
            r0.f401346q = r2
            r0.f401347r = r11
            r0.f401348s = r12
            r0.f401351v = r3
            java.lang.Object r14 = r2.Q(r3, r0)
            if (r14 != r1) goto L3e
            return r1
        L84:
            r11.close()
            throw r14
        L88:
            java.lang.Throwable r12 = r2.g()
            if (r12 != 0) goto L93
            io.ktor.utils.io.core.n r11 = r11.y()
            return r11
        L93:
            r11.close()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.i0(io.ktor.utils.io.core.m, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object j(@Y61.k ContinuationImpl continuationImpl) {
        C41641n c41641n = this.f400980d;
        if (!c41641n.p(2)) {
            return j0(continuationImpl);
        }
        short sC2 = io.ktor.utils.io.core.D.c(c41641n);
        M(2);
        return Boxing.boxShort(sC2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j0(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.C41707x0
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.x0 r0 = (io.ktor.utils.io.C41707x0) r0
            int r1 = r0.f401355t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401355t = r1
            goto L18
        L13:
            io.ktor.utils.io.x0 r0 = new io.ktor.utils.io.x0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f401353r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401355t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            io.ktor.utils.io.h0 r0 = r0.f401352q
            kotlin.C42729a0.b(r6)
            goto L43
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.C42729a0.b(r6)
            r0.f401352q = r5
            r0.f401355t = r4
            java.lang.Object r6 = r5.Q(r3, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            r0 = r5
        L43:
            io.ktor.utils.io.core.n r6 = r0.f400980d
            short r6 = io.ktor.utils.io.core.D.c(r6)
            r0.M(r3)
            short r6 = (short) r6
            java.lang.Short r6 = kotlin.coroutines.jvm.internal.Boxing.boxShort(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.j0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Object l(@Y61.k C41628a c41628a, @Y61.k ContinuationImpl continuationImpl) {
        return p0(this, c41628a, continuationImpl);
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object m(int i12, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        R(i12, null);
        C41640m c41640m = new C41640m(null, 1, null);
        C41641n c41641n = this.f400980d;
        int iMin = (int) Math.min(i12, c41641n.o());
        int i13 = i12 - iMin;
        c41640m.q(c41641n, iMin);
        M(iMin);
        R(i13, c41640m);
        return i13 > 0 ? h0(c41640m, i13, continuationImpl) : c41640m.y();
    }

    public final io.ktor.utils.io.core.internal.b m0(int i12) {
        if (this.f400980d.m()) {
            X();
        }
        io.ktor.utils.io.core.internal.b bVarU = this.f400980d.u(i12);
        if (bVarU == null) {
            io.ktor.utils.io.core.internal.b.f400881j.getClass();
            this.lastReadView$delegate = io.ktor.utils.io.core.internal.b.f400886o;
            this.lastReadAvailable$delegate = 0;
        } else {
            this.lastReadView$delegate = bVarU;
            this.lastReadAvailable$delegate = bVarU.f400876c - bVarU.f400875b;
        }
        return bVarU;
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object n(@Y61.k Continuation<? super Byte> continuation) throws EOFException {
        C41641n c41641n = this.f400980d;
        if (c41641n.m()) {
            return b0((ContinuationImpl) continuation);
        }
        byte b12 = c41641n.readByte();
        M(1);
        return Boxing.boxByte(b12);
    }

    public final Object n0(io.ktor.utils.io.core.internal.b bVar, Continuation<? super Integer> continuation) throws Throwable {
        AbstractC41660h0 abstractC41660h0;
        Object objBoxInt;
        c cVar = (c) continuation;
        int i12 = cVar.f400993u;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            cVar.f400993u = i12 - BeduinInputModel.MIN_TEXT_VERSION;
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f400991s;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = cVar.f400993u;
        if (i13 == 0) {
            C42729a0.b(obj);
            cVar.f400989q = this;
            cVar.f400990r = bVar;
            cVar.f400993u = 1;
            if (P(1, cVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            abstractC41660h0 = this;
        } else {
            if (i13 != 1) {
                if (i13 == 2) {
                    C42729a0.b(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = cVar.f400990r;
            abstractC41660h0 = cVar.f400989q;
            C42729a0.b(obj);
        }
        cVar.f400989q = null;
        cVar.f400990r = null;
        cVar.f400993u = 2;
        abstractC41660h0.getClass();
        int i14 = bVar.f400876c - bVar.f400875b;
        if (i14 == 0) {
            objBoxInt = Boxing.boxInt(0);
        } else {
            int iMin = Math.min(i14, abstractC41660h0.V());
            if (iMin == 0) {
                objBoxInt = abstractC41660h0.n0(bVar, cVar);
            } else {
                io.ktor.utils.io.core.G.a(abstractC41660h0.f400979c, bVar, iMin);
                abstractC41660h0.N(iMin);
                objBoxInt = Boxing.boxInt(iMin);
            }
        }
        obj = objBoxInt;
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Object o(int i12, @Y61.k ContinuationImpl continuationImpl) {
        return r0(this, i12, continuationImpl);
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object p(@Y61.k io.ktor.utils.io.core.internal.b bVar, @Y61.k Continuation<? super Integer> continuation) {
        return Y(bVar, (ContinuationImpl) continuation);
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Object q(byte b12, @Y61.k ContinuationImpl continuationImpl) {
        return o0(this, b12, continuationImpl);
    }

    @Override // io.ktor.utils.io.W0
    public final boolean r() {
        return W();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // io.ktor.utils.io.W0
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(@Y61.k java.nio.ByteBuffer r17, long r18, long r20, long r22, @Y61.k kotlin.coroutines.Continuation r24) {
        /*
            r16 = this;
            r0 = r16
            r1 = r24
            boolean r2 = r1 instanceof io.ktor.utils.io.C41666j0
            if (r2 == 0) goto L17
            r2 = r1
            io.ktor.utils.io.j0 r2 = (io.ktor.utils.io.C41666j0) r2
            int r3 = r2.f401093t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f401093t = r3
            goto L1e
        L17:
            io.ktor.utils.io.j0 r2 = new io.ktor.utils.io.j0
            kotlin.coroutines.jvm.internal.ContinuationImpl r1 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r1
            r2.<init>(r0, r1)
        L1e:
            java.lang.Object r1 = r2.f401091r
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f401093t
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            kotlin.jvm.internal.l0$g r2 = r2.f401090q
            kotlin.C42729a0.b(r1)
            goto L5d
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            kotlin.C42729a0.b(r1)
            kotlin.jvm.internal.l0$g r1 = new kotlin.jvm.internal.l0$g
            r1.<init>()
            io.ktor.utils.io.k0 r4 = new io.ktor.utils.io.k0
            r15 = 0
            r6 = r4
            r7 = r20
            r9 = r1
            r10 = r22
            r12 = r17
            r13 = r18
            r6.<init>(r7, r9, r10, r12, r13, r15)
            r2.f401090q = r1
            r2.f401093t = r5
            java.lang.Object r2 = k0(r0, r4, r2)
            if (r2 != r3) goto L5c
            return r3
        L5c:
            r2 = r1
        L5d:
            long r1 = r2.f406841b
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC41660h0.s(java.nio.ByteBuffer, long, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Object t(@Y61.k C41641n c41641n, @Y61.k ContinuationImpl continuationImpl) {
        return t0(this, c41641n, continuationImpl);
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    @InterfaceC42830m
    public final Object u(@Y61.k Y41.p<? super k2, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objInvoke = pVar.invoke(new a(), continuation);
        return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : kotlin.G0.f406611a;
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object v(@Y61.k Continuation continuation) {
        return l0(this, Integer.MAX_VALUE, (ContinuationImpl) continuation);
    }

    @Override // io.ktor.utils.io.W0
    public final boolean x() {
        C41696t1 c41696t1 = (C41696t1) this._closed;
        return (c41696t1 != null ? c41696t1.f401306a : null) != null || (W() && this.channelSize == 0);
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Object y(short s5, @Y61.k ContinuationImpl continuationImpl) {
        return u0(this, s5, continuationImpl);
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Object z(long j12, @Y61.k ContinuationImpl continuationImpl) {
        return s0(this, j12, continuationImpl);
    }

    @Override // io.ktor.utils.io.O1
    @Y61.k
    public final b2 B() {
        return this;
    }
}
