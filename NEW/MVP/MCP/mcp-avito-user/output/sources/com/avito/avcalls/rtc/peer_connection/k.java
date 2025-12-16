package com.avito.avcalls.rtc.peer_connection;

import Y61.l;
import com.avito.avcalls.rtc.connecting.IceCandidate;
import com.avito.avcalls.rtc.connecting.Sdp;
import com.avito.avcalls.rtc.media.m;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PeerConnectionLogsWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/rtc/peer_connection/k;", "Lcom/avito/avcalls/utils/logs/b;", "Lcom/avito/avcalls/rtc/peer_connection/a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class k extends com.avito.avcalls.utils.logs.b implements a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f333214b;

    public k(@Y61.k a aVar) {
        this.f333214b = aVar;
        F().b("init", new Object[0]);
    }

    @Override // com.avito.avcalls.rtc.peer_connection.a
    @l
    public final com.avito.avcalls.rtc.media.h B(@Y61.k com.avito.avcalls.rtc.media.l lVar, @Y61.k ArrayList arrayList) {
        F().b("addVideoTrack", lVar, arrayList);
        com.avito.avcalls.rtc.media.h hVarB = this.f333214b.B(lVar, arrayList);
        if (hVarB != null) {
            return new com.avito.avcalls.rtc.media.i(lVar.getId(), hVarB);
        }
        return null;
    }

    @Override // com.avito.avcalls.rtc.peer_connection.a
    public final void D(@Y61.k com.avito.avcalls.rtc.connecting.c cVar, @Y61.k com.avito.avcalls.rtc.media.e eVar) {
        F().b("createAnswer", new Object[0]);
        this.f333214b.D(new com.avito.avcalls.rtc.connecting.d("createAnswer", cVar), eVar);
    }

    @Override // com.avito.avcalls.utils.logs.b
    @Y61.k
    public final String G() {
        return "PeerConnection";
    }

    @Override // com.avito.avcalls.rtc.peer_connection.a
    public final void c(boolean z12) {
        F().b("setAudioRecordingEnabled", Boolean.valueOf(z12));
        this.f333214b.c(z12);
    }

    @Override // com.avito.avcalls.rtc.peer_connection.a
    public final void close() {
        F().b("close", new Object[0]);
        this.f333214b.close();
    }

    @Override // com.avito.avcalls.rtc.peer_connection.a
    @l
    public final com.avito.avcalls.rtc.media.h e(@Y61.k com.avito.avcalls.rtc.media.b bVar, @Y61.k ArrayList arrayList) {
        F().b("addAudioTrack", bVar, arrayList);
        com.avito.avcalls.rtc.media.h hVarE = this.f333214b.e(bVar, arrayList);
        if (hVarE != null) {
            return new com.avito.avcalls.rtc.media.i(bVar.getId(), hVarE);
        }
        return null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && L.f(this.f333214b, ((k) obj).f333214b);
    }

    @Override // com.avito.avcalls.rtc.peer_connection.a
    public final void f(@Y61.k com.avito.avcalls.rtc.connecting.c cVar, @Y61.k Sdp sdp) {
        F().b("setLocalDescription", sdp);
        this.f333214b.f(new com.avito.avcalls.rtc.connecting.d("setLocalDescription", cVar), sdp);
    }

    @Override // com.avito.avcalls.utils.logs.b, com.avito.avcalls.utils.logs.c
    public final Object g() {
        return this.f333214b;
    }

    @Override // com.avito.avcalls.rtc.peer_connection.a
    @Y61.k
    public final String getId() {
        return this.f333214b.getId();
    }

    public final int hashCode() {
        return this.f333214b.hashCode();
    }

    @Override // com.avito.avcalls.rtc.peer_connection.a
    public final void i(@Y61.k com.avito.avcalls.rtc.connecting.b bVar) {
        F().b("setRTCConfiguration", bVar);
        this.f333214b.i(bVar);
    }

    @Override // com.avito.avcalls.rtc.peer_connection.a
    public final void k(boolean z12) {
        F().b("setAudioPlayoutEnabled", Boolean.valueOf(z12));
        this.f333214b.k(z12);
    }

    @Override // com.avito.avcalls.rtc.peer_connection.a
    public final void l(@Y61.k IceCandidate iceCandidate) {
        F().b("addIceCandidate", iceCandidate);
        this.f333214b.l(iceCandidate);
    }

    @Override // com.avito.avcalls.rtc.peer_connection.a
    public final void n(@Y61.k com.avito.avcalls.rtc.connecting.c cVar, @Y61.k com.avito.avcalls.rtc.media.e eVar) {
        F().b("createOffer", new Object[0]);
        this.f333214b.n(new com.avito.avcalls.rtc.connecting.d("createOffer", cVar), eVar);
    }

    @Override // com.avito.avcalls.rtc.peer_connection.a
    @l
    public final com.avito.avcalls.rtc.media.d q(@Y61.k com.avito.avcalls.rtc.media.b bVar) {
        F().b("getDtmfSender", new Object[0]);
        com.avito.avcalls.rtc.media.d dVarQ = this.f333214b.q(bVar);
        F().c(dVarQ, "getDtmfSender", new Object[0]);
        return dVarQ;
    }

    @Override // com.avito.avcalls.rtc.peer_connection.a
    public final void s(@Y61.k com.avito.avcalls.rtc.connecting.c cVar, @Y61.k Sdp sdp) {
        F().b("setRemoteDescription", sdp);
        this.f333214b.s(new com.avito.avcalls.rtc.connecting.d("setRemoteDescription", cVar), sdp);
    }

    @Override // com.avito.avcalls.rtc.peer_connection.a
    public final void u(@Y61.k Y41.l<? super com.avito.avcalls.stats.a, G0> lVar) {
        F().b("getStatsReport", new Object[0]);
        this.f333214b.u(lVar);
    }

    @Override // com.avito.avcalls.rtc.peer_connection.a
    @l
    public final com.avito.avcalls.rtc.media.l w() {
        F().b("getRemoteVideoTrack", new Object[0]);
        com.avito.avcalls.rtc.media.l lVarW = this.f333214b.w();
        if (lVarW == null) {
            return null;
        }
        m mVar = new m(lVarW);
        F().c(mVar, "getRemoteVideoTrack", new Object[0]);
        return mVar;
    }
}
