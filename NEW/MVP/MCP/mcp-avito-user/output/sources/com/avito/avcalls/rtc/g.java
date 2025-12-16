package com.avito.avcalls.rtc;

import com.avito.avcalls.rtc.connecting.IceCandidate;
import com.avito.avcalls.rtc.connecting.Sdp;
import com.avito.avcalls.rtc.connecting.SignalingState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: PCSession.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/avcalls/rtc/g;", "Lcom/avito/avcalls/rtc/a;", "Companion", "a", "b", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements a {

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public static final com.avito.avcalls.utils.logs.a f333136t = new com.avito.avcalls.utils.logs.a("PCSession");

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f333137a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.config.h f333138b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f333139c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.rtc.device.video.capturing.i f333140d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CQ0.c f333141e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.rtc.peer_connection.b f333142f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.rtc.media.e f333143g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.rtc.peer_connection.a f333144h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ArrayList<IceCandidate> f333145i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public com.avito.avcalls.rtc.media.b f333146j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public com.avito.avcalls.rtc.media.h f333147k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final b f333148l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final com.avito.avcalls.rtc.media.h f333149m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public SignalingState f333150n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public com.avito.avcalls.rtc.connecting.b f333151o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public com.avito.avcalls.rtc.media.d f333152p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f333153q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final d2<List<IceCandidate>> f333154r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final n2<Boolean> f333155s;

    /* compiled from: PCSession.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/g$b;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.avcalls.rtc.media.l f333156a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final com.avito.avcalls.rtc.media.l f333157b;

        public b(@Y61.k com.avito.avcalls.rtc.media.l lVar, @Y61.l com.avito.avcalls.rtc.media.l lVar2) {
            this.f333156a = lVar;
            this.f333157b = lVar2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f333156a, bVar.f333156a) && L.f(this.f333157b, bVar.f333157b);
        }

        public final int hashCode() {
            int iHashCode = this.f333156a.hashCode() * 31;
            com.avito.avcalls.rtc.media.l lVar = this.f333157b;
            return iHashCode + (lVar == null ? 0 : lVar.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "VideoTracksHolder(local=" + this.f333156a + ", remote=" + this.f333157b + ')';
        }
    }

    /* compiled from: PCSession.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[Sdp.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Sdp.Type.Companion companion = Sdp.Type.INSTANCE;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public g(@Y61.k C43238h c43238h, @Y61.k String str, @Y61.k com.avito.avcalls.config.h hVar, @Y61.k com.avito.avcalls.rtc.peer_connection.e eVar, boolean z12, @Y61.k com.avito.avcalls.rtc.media.k kVar, @Y61.k com.avito.avcalls.rtc.device.video.capturing.i iVar, @Y61.k CQ0.c cVar) {
        this.f333137a = str;
        this.f333138b = hVar;
        this.f333139c = z12;
        this.f333140d = iVar;
        this.f333141e = cVar;
        com.avito.avcalls.rtc.peer_connection.b bVar = (com.avito.avcalls.rtc.peer_connection.b) eVar.f333207a.getValue();
        this.f333142f = bVar;
        this.f333143g = bVar.x();
        this.f333145i = new ArrayList<>();
        this.f333150n = SignalingState.f333086g;
        com.avito.avcalls.rtc.connecting.b.INSTANCE.getClass();
        com.avito.avcalls.rtc.connecting.b bVar2 = new com.avito.avcalls.rtc.connecting.b(C42784z0.f406748b, false, true, true);
        this.f333151o = bVar2;
        Q<com.avito.avcalls.rtc.peer_connection.a, d2<com.avito.avcalls.rtc.connecting.a>> qA2 = com.avito.avcalls.rtc.peer_connection.c.a(bVar, str, bVar2);
        com.avito.avcalls.rtc.peer_connection.a aVar = qA2.f406619b;
        d2<com.avito.avcalls.rtc.connecting.a> d2Var = qA2.f406620c;
        this.f333144h = aVar;
        C43197r1 c43197r1 = new C43197r1(new com.avito.avcalls.rtc.c(2, null), new m(new l(new C43197r1(new com.avito.avcalls.rtc.b(2, null), new j(d2Var)))));
        i2.f411430a.getClass();
        i2 i2Var = i2.a.f411432b;
        this.f333155s = C43175k.U(c43197r1, c43238h, i2Var, Boolean.FALSE);
        this.f333154r = C43175k.S(new C43197r1(new e(2, null), com.avito.avcalls.utils.coroutines.g.a(new n(new C43197r1(new d(2, null), new k(d2Var))), hVar.getF332859j())), c43238h, i2Var, 0);
        C43259k.d(c43238h, null, null, new f(d2Var, this, null), 3);
        if (z12) {
            com.avito.avcalls.rtc.media.l lVarC = bVar.C((com.avito.avcalls.rtc.media.j) kVar.f333189a.getValue());
            this.f333149m = aVar.B(lVarC, C42745f0.j("localMediaStream"));
            this.f333148l = new b(lVarC, aVar.w());
        } else {
            this.f333148l = null;
            this.f333149m = null;
        }
        String id2 = aVar.getId();
        CQ0.c.f2175d.b("registerClient", id2);
        cVar.f2176a.J(id2, aVar);
        cVar.f2178c.put(id2, Boolean.TRUE);
        cVar.b();
    }

    public final void F() {
        if (this.f333146j != null) {
            return;
        }
        com.avito.avcalls.rtc.peer_connection.b bVar = this.f333142f;
        com.avito.avcalls.rtc.media.b bVarT = bVar.t(bVar.A(bVar.x()));
        this.f333147k = this.f333144h.e(bVarT, C42745f0.j("localMediaStream"));
        this.f333146j = bVarT;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(@Y61.k com.avito.avcalls.rtc.connecting.Sdp r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.avito.avcalls.rtc.h
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.avcalls.rtc.h r0 = (com.avito.avcalls.rtc.h) r0
            int r1 = r0.f333161t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f333161t = r1
            goto L18
        L13:
            com.avito.avcalls.rtc.h r0 = new com.avito.avcalls.rtc.h
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f333159r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f333161t
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.f333158q
            com.avito.avcalls.rtc.connecting.Sdp r7 = (com.avito.avcalls.rtc.connecting.Sdp) r7
            kotlin.C42729a0.b(r8)
            goto L98
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            java.lang.Object r7 = r0.f333158q
            com.avito.avcalls.rtc.g r7 = (com.avito.avcalls.rtc.g) r7
            kotlin.C42729a0.b(r8)
            goto L88
        L43:
            java.lang.Object r7 = r0.f333158q
            com.avito.avcalls.rtc.g r7 = (com.avito.avcalls.rtc.g) r7
            kotlin.C42729a0.b(r8)
            goto L5f
        L4b:
            kotlin.C42729a0.b(r8)
            r6.F()
            r0.f333158q = r6
            r0.f333161t = r5
            com.avito.avcalls.rtc.peer_connection.a r8 = r6.f333144h
            java.lang.Object r7 = com.avito.avcalls.rtc.peer_connection.h.c(r8, r7, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            r7 = r6
        L5f:
            com.avito.avcalls.rtc.peer_connection.a r8 = r7.f333144h
            r0.f333158q = r7
            r0.f333161t = r4
            kotlin.coroutines.SafeContinuation r2 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r4)
            com.avito.avcalls.rtc.peer_connection.f r4 = new com.avito.avcalls.rtc.peer_connection.f
            r4.<init>(r2)
            com.avito.avcalls.rtc.media.e r5 = r7.f333143g
            r8.D(r4, r5)
            java.lang.Object r8 = r2.getOrThrow()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r2) goto L85
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L85:
            if (r8 != r1) goto L88
            return r1
        L88:
            com.avito.avcalls.rtc.connecting.Sdp r8 = (com.avito.avcalls.rtc.connecting.Sdp) r8
            com.avito.avcalls.rtc.peer_connection.a r7 = r7.f333144h
            r0.f333158q = r8
            r0.f333161t = r3
            java.lang.Object r7 = com.avito.avcalls.rtc.peer_connection.h.b(r7, r8, r0)
            if (r7 != r1) goto L97
            return r1
        L97:
            r7 = r8
        L98:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.rtc.g.G(com.avito.avcalls.rtc.connecting.Sdp, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.avito.avcalls.rtc.i
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.avcalls.rtc.i r0 = (com.avito.avcalls.rtc.i) r0
            int r1 = r0.f333165t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f333165t = r1
            goto L18
        L13:
            com.avito.avcalls.rtc.i r0 = new com.avito.avcalls.rtc.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f333163r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f333165t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f333162q
            com.avito.avcalls.rtc.connecting.Sdp r0 = (com.avito.avcalls.rtc.connecting.Sdp) r0
            kotlin.C42729a0.b(r7)
            goto L80
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.f333162q
            com.avito.avcalls.rtc.g r2 = (com.avito.avcalls.rtc.g) r2
            kotlin.C42729a0.b(r7)
            goto L70
        L40:
            kotlin.C42729a0.b(r7)
            r6.F()
            r0.f333162q = r6
            r0.f333165t = r4
            kotlin.coroutines.SafeContinuation r7 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r7.<init>(r2)
            com.avito.avcalls.rtc.peer_connection.g r2 = new com.avito.avcalls.rtc.peer_connection.g
            r2.<init>(r7)
            com.avito.avcalls.rtc.peer_connection.a r4 = r6.f333144h
            com.avito.avcalls.rtc.media.e r5 = r6.f333143g
            r4.n(r2, r5)
            java.lang.Object r7 = r7.getOrThrow()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r2) goto L6c
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L6c:
            if (r7 != r1) goto L6f
            return r1
        L6f:
            r2 = r6
        L70:
            com.avito.avcalls.rtc.connecting.Sdp r7 = (com.avito.avcalls.rtc.connecting.Sdp) r7
            com.avito.avcalls.rtc.peer_connection.a r2 = r2.f333144h
            r0.f333162q = r7
            r0.f333165t = r3
            java.lang.Object r0 = com.avito.avcalls.rtc.peer_connection.h.b(r2, r7, r0)
            if (r0 != r1) goto L7f
            return r1
        L7f:
            r0 = r7
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.rtc.g.H(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void L(@Y61.k List<IceCandidate> list) {
        if (this.f333150n == SignalingState.f333081b) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f333144h.l((IceCandidate) it.next());
            }
            return;
        }
        f333136t.c("signalingState=" + this.f333150n + " -> add iceCandidates to queue", "setRemoteIceCandidates", new Object[0]);
        this.f333145i.addAll(list);
    }
}
