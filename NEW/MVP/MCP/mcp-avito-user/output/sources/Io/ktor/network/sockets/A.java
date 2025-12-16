package io.ktor.network.sockets;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.network.selector.SelectInterest;
import io.ktor.utils.io.core.C41638k;
import io.ktor.utils.io.core.C41641n;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.atomicfu.AtomicBoolean;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicRef;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.M0;

/* compiled from: DatagramSendChannel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lio/ktor/network/sockets/A;", "Lkotlinx/coroutines/channels/M0;", "Lio/ktor/network/sockets/w;", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class A implements M0<C41580w> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DatagramChannel f400188b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final F f400189c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AtomicRef<Y41.l<Throwable, G0>> f400190d = AtomicFU.atomic((Object) null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f400191e = AtomicFU.atomic(false);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AtomicRef<Throwable> f400192f = AtomicFU.atomic((Object) null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.sync.d f400193g = kotlinx.coroutines.sync.j.a();

    /* compiled from: DatagramSendChannel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "io.ktor.network.sockets.DatagramSendChannel", f = "DatagramSendChannel.kt", i = {0, 0, 0, 1}, l = {160, 76}, m = "send", n = {"this", "element", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Object f400194q;

        /* renamed from: r, reason: collision with root package name */
        public C41580w f400195r;

        /* renamed from: s, reason: collision with root package name */
        public kotlinx.coroutines.sync.d f400196s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f400197t;

        /* renamed from: v, reason: collision with root package name */
        public int f400199v;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f400197t = obj;
            this.f400199v |= BeduinInputModel.MIN_TEXT_VERSION;
            return A.this.send(null, this);
        }
    }

    /* compiled from: DatagramSendChannel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "io.ktor.network.sockets.DatagramSendChannel$send$2$1", f = "DatagramSendChannel.kt", i = {0, 0}, l = {86}, m = "invokeSuspend", n = {"$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1"})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public io.ktor.utils.io.pool.d f400200q;

        /* renamed from: r, reason: collision with root package name */
        public Object f400201r;

        /* renamed from: s, reason: collision with root package name */
        public int f400202s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C41580w f400203t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ A f400204u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C41580w c41580w, A a12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f400203t = c41580w;
            this.f400204u = a12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f400203t, this.f400204u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
            io.ktor.utils.io.pool.d dVar;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f400202s;
            if (i12 == 0) {
                C42729a0.b(obj);
                dVar = io.ktor.network.util.b.f400275a;
                C41580w c41580w = this.f400203t;
                A a12 = this.f400204u;
                Object objS2 = dVar.S2();
                try {
                    ByteBuffer byteBuffer = (ByteBuffer) objS2;
                    Y41.l<Throwable, G0> lVar = C.f400211a;
                    C41641n c41641n = c41580w.f400273a;
                    U u12 = c41580w.f400274b;
                    C41638k.a(c41641n, byteBuffer);
                    byteBuffer.flip();
                    if (a12.f400188b.send(byteBuffer, u12.getF400272a()) != 0) {
                        a12.f400189c.O0(SelectInterest.WRITE, false);
                    } else {
                        this.f400200q = dVar;
                        this.f400201r = objS2;
                        this.f400202s = 1;
                        if (A.a(a12, byteBuffer, u12, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    obj2 = objS2;
                } catch (Throwable th2) {
                    th = th2;
                    obj2 = objS2;
                    dVar.G4(obj2);
                    throw th;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f400201r;
                dVar = this.f400200q;
                try {
                    C42729a0.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    dVar.G4(obj2);
                    throw th;
                }
            }
            G0 g02 = G0.f406611a;
            dVar.G4(obj2);
            return G0.f406611a;
        }
    }

    public A(@Y61.k DatagramChannel datagramChannel, @Y61.k F f12) {
        this.f400188b = datagramChannel;
        this.f400189c = f12;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0055 -> B:18:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(io.ktor.network.sockets.A r6, java.nio.ByteBuffer r7, io.ktor.network.sockets.U r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof io.ktor.network.sockets.B
            if (r0 == 0) goto L16
            r0 = r9
            io.ktor.network.sockets.B r0 = (io.ktor.network.sockets.B) r0
            int r1 = r0.f400210v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f400210v = r1
            goto L1b
        L16:
            io.ktor.network.sockets.B r0 = new io.ktor.network.sockets.B
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.f400208t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400210v
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            io.ktor.network.sockets.U r6 = r0.f400207s
            java.nio.ByteBuffer r7 = r0.f400206r
            io.ktor.network.sockets.A r8 = r0.f400205q
            kotlin.C42729a0.b(r9)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L58
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            kotlin.C42729a0.b(r9)
        L40:
            io.ktor.network.selector.SelectInterest r9 = io.ktor.network.selector.SelectInterest.WRITE
            io.ktor.network.sockets.F r2 = r6.f400189c
            r2.O0(r9, r3)
            r0.f400205q = r6
            r0.f400206r = r7
            r0.f400207s = r8
            r0.f400210v = r3
            io.ktor.network.selector.k r4 = r2.f400230g
            java.lang.Object r9 = r4.c1(r2, r9, r0)
            if (r9 != r1) goto L58
            goto L6e
        L58:
            java.nio.channels.DatagramChannel r9 = r6.f400188b
            java.net.SocketAddress r2 = r8.getF400272a()
            int r9 = r9.send(r7, r2)
            if (r9 == 0) goto L40
            io.ktor.network.selector.SelectInterest r7 = io.ktor.network.selector.SelectInterest.WRITE
            r8 = 0
            io.ktor.network.sockets.F r6 = r6.f400189c
            r6.O0(r7, r8)
            kotlin.G0 r1 = kotlin.G0.f406611a
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.A.a(io.ktor.network.sockets.A, java.nio.ByteBuffer, io.ktor.network.sockets.U, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b() {
        do {
            Y41.l lVar = (Y41.l) this.f400190d.getValue();
            if (lVar == C.f400212b) {
                return;
            }
            if (lVar != null) {
                if (!this.f400190d.compareAndSet(lVar, C.f400212b)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                lVar.invoke(this.f400192f.getValue());
                return;
            }
        } while (!this.f400190d.compareAndSet((Object) null, C.f400211a));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.channels.M0
    @Y61.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object send(@Y61.k io.ktor.network.sockets.C41580w r9, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.ktor.network.sockets.A.a
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.network.sockets.A$a r0 = (io.ktor.network.sockets.A.a) r0
            int r1 = r0.f400199v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400199v = r1
            goto L18
        L13:
            io.ktor.network.sockets.A$a r0 = new io.ktor.network.sockets.A$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f400197t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400199v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.f400194q
            kotlinx.coroutines.sync.a r9 = (kotlinx.coroutines.sync.a) r9
            kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L31
            goto L75
        L31:
            r10 = move-exception
            goto L81
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            kotlinx.coroutines.sync.d r9 = r0.f400196s
            io.ktor.network.sockets.w r2 = r0.f400195r
            java.lang.Object r4 = r0.f400194q
            io.ktor.network.sockets.A r4 = (io.ktor.network.sockets.A) r4
            kotlin.C42729a0.b(r10)
            r10 = r9
            r9 = r2
            goto L5e
        L49:
            kotlin.C42729a0.b(r10)
            kotlinx.coroutines.sync.d r10 = r8.f400193g
            r0.f400194q = r8
            r0.f400195r = r9
            r0.f400196s = r10
            r0.f400199v = r4
            java.lang.Object r2 = r10.b(r0)
            if (r2 != r1) goto L5d
            return r1
        L5d:
            r4 = r8
        L5e:
            kotlinx.coroutines.scheduling.b r2 = kotlinx.coroutines.C43262l0.f411947c     // Catch: java.lang.Throwable -> L7d
            io.ktor.network.sockets.A$b r6 = new io.ktor.network.sockets.A$b     // Catch: java.lang.Throwable -> L7d
            r6.<init>(r9, r4, r5)     // Catch: java.lang.Throwable -> L7d
            r0.f400194q = r10     // Catch: java.lang.Throwable -> L7d
            r0.f400195r = r5     // Catch: java.lang.Throwable -> L7d
            r0.f400196s = r5     // Catch: java.lang.Throwable -> L7d
            r0.f400199v = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r9 = kotlinx.coroutines.C43259k.g(r2, r6, r0)     // Catch: java.lang.Throwable -> L7d
            if (r9 != r1) goto L74
            return r1
        L74:
            r9 = r10
        L75:
            kotlin.G0 r10 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L31
            r9.d(r5)
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        L7d:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L81:
            r9.d(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.A.send(io.ktor.network.sockets.w, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.M0
    @B0
    public final void g(@Y61.k Y41.l<? super Throwable, G0> lVar) {
        if (this.f400190d.compareAndSet((Object) null, lVar)) {
            return;
        }
        if (this.f400190d.getValue() != C.f400211a) {
            C.a((Y41.l) this.f400190d.getValue());
            throw null;
        }
        if (!this.f400190d.compareAndSet(C.f400211a, C.f400212b)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        lVar.invoke(this.f400192f.getValue());
    }

    @Override // kotlinx.coroutines.channels.M0
    public final boolean h(@Y61.l Throwable th2) {
        if (!this.f400191e.compareAndSet(false, true)) {
            return false;
        }
        this.f400192f.setValue(th2);
        F f12 = this.f400189c;
        if (!f12.isClosed()) {
            f12.close();
        }
        b();
        return true;
    }

    @Override // kotlinx.coroutines.channels.M0
    public final boolean l() {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.M0
    public final Object w(C41580w c41580w) {
        C41580w c41580w2 = c41580w;
        C41641n c41641n = c41580w2.f400273a;
        kotlinx.coroutines.sync.d dVar = this.f400193g;
        if (!dVar.f()) {
            kotlinx.coroutines.channels.B.f410772b.getClass();
            return kotlinx.coroutines.channels.B.f410773c;
        }
        try {
            io.ktor.utils.io.pool.f fVar = io.ktor.network.util.b.f400275a;
            ByteBuffer byteBufferS2 = fVar.S2();
            try {
                ByteBuffer byteBuffer = byteBufferS2;
                C41638k.a(c41641n.G(), byteBuffer);
                boolean z12 = this.f400188b.send(byteBuffer, c41580w2.f400274b.getF400272a()) == 0;
                G0 g02 = G0.f406611a;
                if (z12) {
                    c41641n.z();
                }
                B.b bVar = kotlinx.coroutines.channels.B.f410772b;
                G0 g03 = G0.f406611a;
                bVar.getClass();
                return g03;
            } finally {
                fVar.G4(byteBufferS2);
            }
        } finally {
            dVar.d(null);
        }
    }
}
