package com.avito.avcalls.rtc;

import com.avito.avcalls.call.models.CameraPosition;
import com.avito.avcalls.rtc.connecting.IceCandidate;
import com.avito.avcalls.rtc.connecting.Sdp;
import com.avito.avcalls.rtc.connecting.SignalingState;
import com.avito.avcalls.rtc.g;
import com.avito.avcalls.signaling.proto.IceConfig;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PCSessionLogsWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/rtc/q;", "Lcom/avito/avcalls/utils/logs/b;", "Lcom/avito/avcalls/rtc/a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class q extends com.avito.avcalls.utils.logs.b implements a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g f333215b;

    public q(@Y61.k g gVar) {
        this.f333215b = gVar;
        F().b("init", new Object[0]);
    }

    @Override // com.avito.avcalls.utils.logs.b
    @Y61.k
    public final String G() {
        return "PCSession";
    }

    public final void H(boolean z12, @Y61.k DQ0.a aVar) {
        F().b("attachVideoRenderer", com.avito.android.bxcontent.mvi.entity.f.l("isLocal=", z12), aVar);
        g.b bVar = this.f333215b.f333148l;
        com.avito.avcalls.rtc.media.l lVar = null;
        if (z12) {
            if (bVar != null) {
                lVar = bVar.f333156a;
            }
        } else if (bVar != null) {
            lVar = bVar.f333157b;
        }
        if (lVar != null) {
            lVar.p(aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(@Y61.k com.avito.avcalls.rtc.connecting.Sdp r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.avito.avcalls.rtc.o
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.avcalls.rtc.o r0 = (com.avito.avcalls.rtc.o) r0
            int r1 = r0.f333200t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f333200t = r1
            goto L18
        L13:
            com.avito.avcalls.rtc.o r0 = new com.avito.avcalls.rtc.o
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f333198r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f333200t
            java.lang.String r3 = "createAnswer"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            com.avito.avcalls.rtc.q r6 = r0.f333197q
            kotlin.C42729a0.b(r7)
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.C42729a0.b(r7)
            com.avito.avcalls.utils.logs.a r7 = r5.F()
            java.lang.Object[] r2 = new java.lang.Object[]{r6}
            r7.b(r3, r2)
            r0.f333197q = r5
            r0.f333200t = r4
            com.avito.avcalls.rtc.g r7 = r5.f333215b
            java.lang.Object r7 = r7.G(r6, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r6 = r5
        L51:
            r0 = r7
            com.avito.avcalls.rtc.connecting.Sdp r0 = (com.avito.avcalls.rtc.connecting.Sdp) r0
            com.avito.avcalls.utils.logs.a r6 = r6.F()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r6.c(r0, r3, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.rtc.q.L(com.avito.avcalls.rtc.connecting.Sdp, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.avito.avcalls.rtc.p
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.avcalls.rtc.p r0 = (com.avito.avcalls.rtc.p) r0
            int r1 = r0.f333204t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f333204t = r1
            goto L18
        L13:
            com.avito.avcalls.rtc.p r0 = new com.avito.avcalls.rtc.p
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f333202r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f333204t
            r3 = 0
            java.lang.String r4 = "createOffer"
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2e
            com.avito.avcalls.rtc.q r0 = r0.f333201q
            kotlin.C42729a0.b(r7)
            goto L50
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            kotlin.C42729a0.b(r7)
            com.avito.avcalls.utils.logs.a r7 = r6.F()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r7.b(r4, r2)
            r0.f333201q = r6
            r0.f333204t = r5
            com.avito.avcalls.rtc.g r7 = r6.f333215b
            java.lang.Object r7 = r7.H(r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r0 = r6
        L50:
            r1 = r7
            com.avito.avcalls.rtc.connecting.Sdp r1 = (com.avito.avcalls.rtc.connecting.Sdp) r1
            com.avito.avcalls.utils.logs.a r0 = r0.F()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r0.c(r1, r4, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.rtc.q.M(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void N(boolean z12, @Y61.k DQ0.a aVar) {
        F().b("detachVideoRenderer", com.avito.android.bxcontent.mvi.entity.f.l("isLocal=", z12), aVar);
        g.b bVar = this.f333215b.f333148l;
        com.avito.avcalls.rtc.media.l lVar = null;
        if (z12) {
            if (bVar != null) {
                lVar = bVar.f333156a;
            }
        } else if (bVar != null) {
            lVar = bVar.f333157b;
        }
        if (lVar != null) {
            lVar.o(aVar);
        }
    }

    public final void O(boolean z12, @Y61.k CameraPosition cameraPosition) {
        com.avito.avcalls.rtc.media.l lVar;
        F().b("setCameraEnabled", Boolean.valueOf(z12), cameraPosition);
        com.avito.avcalls.utils.logs.a aVar = g.f333136t;
        g gVar = this.f333215b;
        g.b bVar = gVar.f333148l;
        if (bVar == null || (lVar = bVar.f333156a) == null) {
            aVar.a("setCameraEnabled", "localVideoTrack is null", null);
            return;
        }
        if (lVar.isEnabled() != z12) {
            aVar.a("setCameraEnabled", "localVideoTrack.isEnabled=" + z12, null);
            lVar.setEnabled(z12);
        }
        InterfaceC42726C interfaceC42726C = gVar.f333140d.f333119a;
        String str = gVar.f333137a;
        if (z12) {
            ((com.avito.avcalls.rtc.device.video.capturing.d) interfaceC42726C.getValue()).r(cameraPosition, str);
        } else {
            ((com.avito.avcalls.rtc.device.video.capturing.d) interfaceC42726C.getValue()).b(str);
        }
    }

    public final void P(@Y61.k IceConfig iceConfig) {
        F().b("setIceConfig", iceConfig);
        g gVar = this.f333215b;
        com.avito.avcalls.rtc.connecting.b bVar = gVar.f333151o;
        com.avito.avcalls.rtc.connecting.b bVar2 = new com.avito.avcalls.rtc.connecting.b(iceConfig.f333316a, bVar.f333093b, bVar.f333094c, bVar.f333095d);
        gVar.f333144h.i(bVar2);
        gVar.f333151o = bVar2;
    }

    public final void Q(@Y61.k List<IceCandidate> list) {
        F().b("setRemoteIceCandidates", list);
        this.f333215b.L(list);
    }

    @Y61.l
    public final Object R(@Y61.k Sdp sdp, @Y61.k Continuation<? super G0> continuation) throws Throwable {
        Object objC;
        F().b("setRemoteSdp", sdp);
        g gVar = this.f333215b;
        gVar.getClass();
        int iOrdinal = sdp.f333072a.ordinal();
        if (iOrdinal == 0) {
            throw new UnsupportedOperationException("Unexpected OFFER in setRemoteSdp");
        }
        if (iOrdinal != 1) {
            objC = G0.f406611a;
        } else if (gVar.f333150n == SignalingState.f333082c) {
            objC = com.avito.avcalls.rtc.peer_connection.h.c(gVar.f333144h, sdp, (ContinuationImpl) continuation);
            if (objC != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objC = G0.f406611a;
            }
        } else {
            g.f333136t.c("Skip setting remote SDP due to signalingState=" + gVar.f333150n, "setRemoteSdp", new Object[0]);
            objC = G0.f406611a;
        }
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : G0.f406611a;
    }

    public final void S(boolean z12) {
        com.avito.avcalls.rtc.media.l lVar;
        F().b("setVideoTxEnabled", Boolean.valueOf(z12));
        com.avito.avcalls.utils.logs.a aVar = g.f333136t;
        g gVar = this.f333215b;
        g.b bVar = gVar.f333148l;
        if (bVar == null || (lVar = bVar.f333156a) == null) {
            aVar.a("setVideoTxEnabled", "localVideoTrack is null", null);
            return;
        }
        com.avito.avcalls.rtc.media.h hVar = gVar.f333149m;
        if (hVar == null) {
            aVar.a("setVideoTxEnabled", "localVideoTrackSender is null", null);
        } else {
            hVar.z(z12 ? lVar : null);
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && L.f(this.f333215b, ((q) obj).f333215b);
    }

    @Override // com.avito.avcalls.utils.logs.b, com.avito.avcalls.utils.logs.c
    public final Object g() {
        return this.f333215b;
    }

    public final int hashCode() {
        return this.f333215b.hashCode();
    }
}
