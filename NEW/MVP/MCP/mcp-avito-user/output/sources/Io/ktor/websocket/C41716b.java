package io.ktor.websocket;

import com.avito.android.remote.model.AdvertStatus;
import io.ktor.websocket.AbstractC41723i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.E1;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.InterfaceC43314z;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.P0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.K0;
import kotlinx.coroutines.channels.M0;

/* compiled from: DefaultWebSocketSession.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/websocket/b;", "Lio/ktor/websocket/a;", "Lio/ktor/websocket/Z;", "a", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.websocket.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41716b implements InterfaceC41715a, Z {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f401473l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f401474m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f401475n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final AbstractC41723i.e f401476o;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z f401477b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43314z<CloseReason> f401478c;

    @Y61.k
    private volatile /* synthetic */ int closed;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43108m f401479d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C43108m f401480e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final P0 f401481f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ArrayList f401482g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f401483h;

    /* renamed from: i, reason: collision with root package name */
    public final long f401484i;

    /* renamed from: j, reason: collision with root package name */
    public final long f401485j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43076a0<CloseReason> f401486k;

    @Y61.k
    volatile /* synthetic */ Object pinger = null;

    @Y61.k
    private volatile /* synthetic */ int started;

    /* compiled from: DefaultWebSocketSession.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/websocket/b$a;", "", "<init>", "()V", "Lio/ktor/websocket/i$e;", "EmptyPong", "Lio/ktor/websocket/i$e;", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DefaultWebSocketSession.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/websocket/CloseReason;", "it", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/websocket/CloseReason;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1", f = "DefaultWebSocketSession.kt", i = {}, l = {301}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.websocket.b$b, reason: collision with other inner class name */
    public static final class C11431b extends SuspendLambda implements Y41.p<CloseReason, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f401487q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f401488r;

        public C11431b(Continuation<? super C11431b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C11431b c11431b = C41716b.this.new C11431b(continuation);
            c11431b.f401488r = obj;
            return c11431b;
        }

        @Override // Y41.p
        public final Object invoke(CloseReason closeReason, Continuation<? super G0> continuation) {
            return ((C11431b) create(closeReason, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f401487q;
            if (i12 == 0) {
                C42729a0.b(obj);
                CloseReason closeReason = (CloseReason) this.f401488r;
                IOException iOException = new IOException("Ping timeout");
                this.f401487q = 1;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41716b.f401473l;
                if (C41716b.this.f(closeReason, iOException, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
        f401476o = new AbstractC41723i.e(new byte[0], C41725k.f401565b);
        f401473l = AtomicReferenceFieldUpdater.newUpdater(C41716b.class, Object.class, "pinger");
        f401474m = AtomicIntegerFieldUpdater.newUpdater(C41716b.class, AdvertStatus.CLOSED);
        f401475n = AtomicIntegerFieldUpdater.newUpdater(C41716b.class, "started");
    }

    public C41716b(@Y61.k Z z12, long j12, long j13) {
        this.f401477b = z12;
        InterfaceC43314z<CloseReason> interfaceC43314zA = kotlinx.coroutines.B.a();
        this.f401478c = interfaceC43314zA;
        this.f401479d = kotlinx.coroutines.channels.A.a(8, null, null, 6);
        String property = System.getProperty("io.ktor.websocket.outgoingChannelCapacity");
        this.f401480e = kotlinx.coroutines.channels.A.a(property != null ? Integer.parseInt(property) : 8, null, null, 6);
        this.closed = 0;
        P0 p02 = new P0((N0) z12.getF401483h().get(N0.f410716u2));
        this.f401481f = p02;
        this.f401482g = new ArrayList();
        this.started = 0;
        this.f401483h = z12.getF401483h().plus(p02).plus(new kotlinx.coroutines.S("ws-default"));
        this.f401484i = j12;
        this.f401485j = j13;
        this.f401486k = interfaceC43314zA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(io.ktor.websocket.C41716b r8, io.ktor.utils.io.core.C41640m r9, io.ktor.websocket.AbstractC41723i r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws io.ktor.websocket.FrameTooBigException {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof io.ktor.websocket.C41717c
            if (r0 == 0) goto L16
            r0 = r11
            io.ktor.websocket.c r0 = (io.ktor.websocket.C41717c) r0
            int r1 = r0.f401493t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f401493t = r1
            goto L1b
        L16:
            io.ktor.websocket.c r0 = new io.ktor.websocket.c
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.f401491r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401493t
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 == r3) goto L30
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            int r8 = r0.f401490q
            kotlin.C42729a0.b(r11)
            goto L7b
        L36:
            kotlin.C42729a0.b(r11)
            byte[] r10 = r10.f401559c
            int r10 = r10.length
            if (r9 == 0) goto L43
            int r11 = r9.k()
            goto L44
        L43:
            r11 = 0
        L44:
            int r10 = r10 + r11
            long r4 = (long) r10
            io.ktor.websocket.Z r11 = r8.f401477b
            long r6 = r11.p()
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L82
            if (r9 == 0) goto L55
            r9.close()
        L55:
            io.ktor.websocket.CloseReason r9 = new io.ktor.websocket.CloseReason
            io.ktor.websocket.CloseReason$Codes r2 = io.ktor.websocket.CloseReason.Codes.TOO_BIG
            java.lang.String r4 = "Frame is too big: "
            java.lang.String r5 = ". Max size is "
            java.lang.StringBuilder r4 = androidx.camera.camera2.internal.G.j(r10, r4, r5)
            long r5 = r11.p()
            r4.append(r5)
            java.lang.String r11 = r4.toString()
            r9.<init>(r2, r11)
            r0.f401490q = r10
            r0.f401493t = r3
            java.lang.Object r8 = io.ktor.websocket.b0.a(r8, r9, r0)
            if (r8 != r1) goto L7a
            goto L84
        L7a:
            r8 = r10
        L7b:
            io.ktor.websocket.FrameTooBigException r9 = new io.ktor.websocket.FrameTooBigException
            long r10 = (long) r8
            r9.<init>(r10)
            throw r9
        L82:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C41716b.b(io.ktor.websocket.b, io.ktor.utils.io.core.m, io.ktor.websocket.i, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00da -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(io.ktor.websocket.C41716b r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C41716b.c(io.ktor.websocket.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.websocket.Z
    @Y61.l
    public final Object B(@Y61.k AbstractC41723i.b bVar, @Y61.k Continuation continuation) {
        Object objSend = j().send(bVar, continuation);
        if (objSend != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objSend = G0.f406611a;
        }
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : G0.f406611a;
    }

    @Override // io.ktor.websocket.Z
    @Y61.k
    public final K0<AbstractC41723i> D() {
        return this.f401479d;
    }

    @Override // io.ktor.websocket.Z
    @Y61.l
    public final Object G(@Y61.k Continuation<? super G0> continuation) {
        Object objG = this.f401477b.G(continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    @Override // io.ktor.websocket.InterfaceC41715a
    public final void P(@Y61.k List<? extends L<?>> list) {
        if (!f401475n.compareAndSet(this, 0, 1)) {
            throw new IllegalStateException(("WebSocket session " + this + " is already started.").toString());
        }
        C41722h.f401551a.e("Starting default WebSocketSession(" + this + ") with negotiated extensions: " + C42745f0.O(list, null, null, null, null, 63));
        this.f401482g.addAll(list);
        e();
        kotlinx.coroutines.S s5 = C41729o.f401587a;
        C43108m c43108mA = kotlinx.coroutines.channels.A.a(5, null, null, 6);
        C43259k.d(this, C41729o.f401587a, null, new C41728n(c43108mA, this.f401480e, null), 2);
        kotlinx.coroutines.S s12 = C41722h.f401552b;
        E1 e12 = C43262l0.f411946b;
        C43259k.d(this, s12.plus(e12), null, new C41719e(this, c43108mA, null), 2);
        C43259k.c(this, C41722h.f401553c.plus(e12), CoroutineStart.f410683e, new C41720f(this, null));
    }

    public final void e() {
        C43108m c43108mA;
        long j12 = this.f401484i;
        if (this.closed == 0 && j12 > 0) {
            M0<AbstractC41723i> m0J = this.f401477b.j();
            long j13 = this.f401485j;
            C11431b c11431b = new C11431b(null);
            kotlinx.coroutines.S s5 = C41729o.f401587a;
            P0 p0A = Q0.a();
            c43108mA = kotlinx.coroutines.channels.A.a(Integer.MAX_VALUE, null, null, 6);
            C43259k.d(this, CoroutineContext.Element.DefaultImpls.plus(p0A, C41729o.f401588b), null, new C41726l(j12, j13, c11431b, c43108mA, m0J, null), 2);
            ((N0) this.f401483h.get(N0.f410716u2)).k(new C41727m(p0A));
        } else {
            c43108mA = null;
        }
        M0 m02 = (M0) f401473l.getAndSet(this, c43108mA);
        if (m02 != null) {
            m02.h(null);
        }
        if (c43108mA != null) {
            Object objW = c43108mA.w(f401476o);
            B.b bVar = kotlinx.coroutines.channels.B.f410772b;
            boolean z12 = objW instanceof B.c;
        }
        if (this.closed == 0 || c43108mA == null) {
            return;
        }
        e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v5, types: [kotlinx.coroutines.channels.M0, kotlinx.coroutines.channels.m] */
    /* JADX WARN: Type inference failed for: r6v6, types: [kotlinx.coroutines.channels.M0, kotlinx.coroutines.channels.m] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.io.IOException, java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(io.ktor.websocket.CloseReason r6, java.io.IOException r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.websocket.C41721g
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.websocket.g r0 = (io.ktor.websocket.C41721g) r0
            int r1 = r0.f401550v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401550v = r1
            goto L18
        L13:
            io.ktor.websocket.g r0 = new io.ktor.websocket.g
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f401548t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401550v
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            io.ktor.websocket.CloseReason r6 = r0.f401547s
            java.lang.Throwable r7 = r0.f401546r
            io.ktor.websocket.b r0 = r0.f401545q
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Throwable -> L30
            goto La6
        L30:
            r8 = move-exception
            goto Lba
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.C42729a0.b(r8)
            r8 = 0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = io.ktor.websocket.C41716b.f401474m
            boolean r8 = r2.compareAndSet(r5, r8, r3)
            if (r8 != 0) goto L4a
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L4a:
            org.slf4j.a r8 = io.ktor.websocket.C41722h.f401551a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Sending Close Sequence for session "
            r2.<init>(r4)
            r2.append(r5)
            java.lang.String r4 = " with reason "
            r2.append(r4)
            r2.append(r6)
            java.lang.String r4 = " and exception "
            r2.append(r4)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r8.e(r2)
            kotlinx.coroutines.P0 r8 = r5.f401481f
            r8.q3()
            if (r6 != 0) goto L7d
            io.ktor.websocket.CloseReason r6 = new io.ktor.websocket.CloseReason
            io.ktor.websocket.CloseReason$Codes r8 = io.ktor.websocket.CloseReason.Codes.NORMAL
            java.lang.String r2 = ""
            r6.<init>(r8, r2)
        L7d:
            r5.e()     // Catch: java.lang.Throwable -> La2
            short r8 = r6.f401388a     // Catch: java.lang.Throwable -> La2
            io.ktor.websocket.CloseReason$Codes$a r2 = io.ktor.websocket.CloseReason.Codes.f401390c     // Catch: java.lang.Throwable -> La2
            r2 = 1006(0x3ee, float:1.41E-42)
            if (r8 == r2) goto La5
            io.ktor.websocket.Z r8 = r5.f401477b     // Catch: java.lang.Throwable -> La2
            kotlinx.coroutines.channels.M0 r8 = r8.j()     // Catch: java.lang.Throwable -> La2
            io.ktor.websocket.i$b r2 = new io.ktor.websocket.i$b     // Catch: java.lang.Throwable -> La2
            r2.<init>(r6)     // Catch: java.lang.Throwable -> La2
            r0.f401545q = r5     // Catch: java.lang.Throwable -> La2
            r0.f401546r = r7     // Catch: java.lang.Throwable -> La2
            r0.f401547s = r6     // Catch: java.lang.Throwable -> La2
            r0.f401550v = r3     // Catch: java.lang.Throwable -> La2
            java.lang.Object r8 = r8.send(r2, r0)     // Catch: java.lang.Throwable -> La2
            if (r8 != r1) goto La5
            return r1
        La2:
            r8 = move-exception
            r0 = r5
            goto Lba
        La5:
            r0 = r5
        La6:
            kotlinx.coroutines.z<io.ktor.websocket.CloseReason> r8 = r0.f401478c
            r8.n(r6)
            if (r7 == 0) goto Lb7
            kotlinx.coroutines.channels.m r6 = r0.f401480e
            r6.h(r7)
            kotlinx.coroutines.channels.m r6 = r0.f401479d
            r6.h(r7)
        Lb7:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        Lba:
            kotlinx.coroutines.z<io.ktor.websocket.CloseReason> r1 = r0.f401478c
            r1.n(r6)
            if (r7 == 0) goto Lcb
            kotlinx.coroutines.channels.m r6 = r0.f401480e
            r6.h(r7)
            kotlinx.coroutines.channels.m r6 = r0.f401479d
            r6.h(r7)
        Lcb:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C41716b.f(io.ktor.websocket.CloseReason, java.io.IOException, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF401483h() {
        return this.f401483h;
    }

    @Override // io.ktor.websocket.Z
    @Y61.k
    public final M0<AbstractC41723i> j() {
        return this.f401480e;
    }

    @Override // io.ktor.websocket.Z
    public final long p() {
        return this.f401477b.p();
    }

    @Override // io.ktor.websocket.Z
    public final void y(long j12) {
        this.f401477b.y(j12);
    }
}
