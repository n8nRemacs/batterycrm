package io.ktor.websocket;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.InterfaceC41649d1;
import io.ktor.utils.io.W0;
import io.ktor.websocket.AbstractC41723i;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.P0;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.K0;
import kotlinx.coroutines.channels.M0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: RawWebSocketCommon.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/websocket/p;", "Lio/ktor/websocket/Z;", "a", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.websocket.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41730p implements Z {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final W0 f401589b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41649d1 f401590c;

    /* renamed from: d, reason: collision with root package name */
    public long f401591d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f401592e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C43108m f401593f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C43108m f401594g;

    /* renamed from: h, reason: collision with root package name */
    public int f401595h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f401596i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final N0 f401597j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final N0 f401598k;

    /* compiled from: RawWebSocketCommon.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/websocket/p$a;", "", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.p$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final P0 f401599a;

        public a(@Y61.l N0 n02) {
            this.f401599a = new P0(n02);
        }

        public final void a() {
            P0 p02 = this.f401599a;
            p02.getClass();
            p02.p0(G0.f406611a);
        }
    }

    /* compiled from: RawWebSocketCommon.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommon", f = "RawWebSocketCommon.kt", i = {0, 0}, l = {123, WebSocketProtocol.PAYLOAD_SHORT, 131}, m = "flush", n = {"this", "it"}, s = {"L$0", "L$2"})
    /* renamed from: io.ktor.websocket.p$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Object f401600q;

        /* renamed from: r, reason: collision with root package name */
        public Object f401601r;

        /* renamed from: s, reason: collision with root package name */
        public Object f401602s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f401603t;

        /* renamed from: v, reason: collision with root package name */
        public int f401605v;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f401603t = obj;
            this.f401605v |= BeduinInputModel.MIN_TEXT_VERSION;
            return C41730p.this.G(this);
        }
    }

    public C41730p(W0 w02, InterfaceC41649d1 interfaceC41649d1, long j12, boolean z12, CoroutineContext coroutineContext, int i12, C42822w c42822w) {
        j12 = (i12 & 4) != 0 ? 2147483647L : j12;
        z12 = (i12 & 8) != 0 ? false : z12;
        this.f401589b = w02;
        this.f401590c = interfaceC41649d1;
        this.f401591d = j12;
        this.f401592e = z12;
        P0 p02 = new P0((N0) coroutineContext.get(N0.f410716u2));
        this.f401593f = kotlinx.coroutines.channels.A.a(8, null, null, 6);
        this.f401594g = kotlinx.coroutines.channels.A.a(8, null, null, 6);
        this.f401596i = coroutineContext.plus(p02).plus(new kotlinx.coroutines.S("raw-ws"));
        kotlinx.coroutines.S s5 = new kotlinx.coroutines.S("ws-writer");
        CoroutineStart coroutineStart = CoroutineStart.f410682d;
        this.f401597j = C43259k.c(this, s5, coroutineStart, new r(this, null));
        this.f401598k = C43259k.c(this, new kotlinx.coroutines.S("ws-reader"), coroutineStart, new C41731q(this, null));
        p02.q3();
    }

    @Override // io.ktor.websocket.Z
    @Y61.l
    public final Object B(@Y61.k AbstractC41723i.b bVar, @Y61.k Continuation continuation) {
        Object objSend = j().send(bVar, continuation);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : G0.f406611a;
    }

    @Override // io.ktor.websocket.Z
    @Y61.k
    public final K0<AbstractC41723i> D() {
        return this.f401593f;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, io.ktor.websocket.p$a] */
    @Override // io.ktor.websocket.Z
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof io.ktor.websocket.C41730p.b
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.websocket.p$b r0 = (io.ktor.websocket.C41730p.b) r0
            int r1 = r0.f401605v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401605v = r1
            goto L1a
        L13:
            io.ktor.websocket.p$b r0 = new io.ktor.websocket.p$b
            kotlin.coroutines.jvm.internal.ContinuationImpl r9 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r9
            r0.<init>(r9)
        L1a:
            java.lang.Object r9 = r0.f401603t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401605v
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
            java.lang.Object r2 = r0.f401600q
            io.ktor.websocket.p$a r2 = (io.ktor.websocket.C41730p.a) r2
            kotlin.C42729a0.b(r9)
            goto L96
        L43:
            java.lang.Object r2 = r0.f401602s
            io.ktor.websocket.p$a r2 = (io.ktor.websocket.C41730p.a) r2
            java.lang.Object r5 = r0.f401601r
            io.ktor.websocket.p$a r5 = (io.ktor.websocket.C41730p.a) r5
            java.lang.Object r7 = r0.f401600q
            io.ktor.websocket.p r7 = (io.ktor.websocket.C41730p) r7
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L53 kotlinx.coroutines.channels.ClosedSendChannelException -> L7f
            goto L97
        L53:
            r9 = move-exception
            goto L7b
        L55:
            kotlin.C42729a0.b(r9)
            io.ktor.websocket.p$a r2 = new io.ktor.websocket.p$a
            kotlinx.coroutines.N0$b r9 = kotlinx.coroutines.N0.f410716u2
            kotlin.coroutines.CoroutineContext r7 = r8.f401596i
            kotlin.coroutines.CoroutineContext$Element r9 = r7.get(r9)
            kotlinx.coroutines.N0 r9 = (kotlinx.coroutines.N0) r9
            r2.<init>(r9)
            kotlinx.coroutines.channels.m r9 = r8.f401594g     // Catch: java.lang.Throwable -> L53 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.f401600q = r8     // Catch: java.lang.Throwable -> L53 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.f401601r = r2     // Catch: java.lang.Throwable -> L53 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.f401602s = r2     // Catch: java.lang.Throwable -> L53 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.f401605v = r5     // Catch: java.lang.Throwable -> L53 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
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
            kotlinx.coroutines.N0 r9 = r7.f401597j
            r0.f401600q = r5
            r0.f401601r = r6
            r0.f401602s = r6
            r0.f401605v = r4
            kotlinx.coroutines.V0 r9 = (kotlinx.coroutines.V0) r9
            java.lang.Object r9 = r9.A(r0)
            if (r9 != r1) goto L95
            return r1
        L95:
            r2 = r5
        L96:
            r5 = r2
        L97:
            r0.f401600q = r6
            r0.f401601r = r6
            r0.f401602s = r6
            r0.f401605v = r3
            kotlinx.coroutines.P0 r9 = r5.f401599a
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
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C41730p.G(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF401596i() {
        return this.f401596i;
    }

    @Override // io.ktor.websocket.Z
    @Y61.k
    public final M0<AbstractC41723i> j() {
        return this.f401594g;
    }

    @Override // io.ktor.websocket.Z
    /* renamed from: p, reason: from getter */
    public final long getF401591d() {
        return this.f401591d;
    }

    @Override // io.ktor.websocket.Z
    public final void y(long j12) {
        this.f401591d = j12;
    }
}
