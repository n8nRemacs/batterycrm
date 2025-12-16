package com.avito.avcalls.rtc.peer_connection;

import com.avito.avcalls.rtc.media.l;
import com.avito.avcalls.rtc.media.m;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PeerConnectionFactoryLogsWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/rtc/peer_connection/d;", "Lcom/avito/avcalls/utils/logs/b;", "Lcom/avito/avcalls/rtc/peer_connection/b;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d extends com.avito.avcalls.utils.logs.b implements b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f333206b;

    public d(@Y61.k b bVar) {
        this.f333206b = bVar;
        F().b("init", new Object[0]);
    }

    @Override // com.avito.avcalls.rtc.peer_connection.b
    @Y61.k
    public final com.avito.avcalls.rtc.media.a A(@Y61.k com.avito.avcalls.rtc.media.e eVar) {
        F().b("createAudioSource", new Object[0]);
        return this.f333206b.A(eVar);
    }

    @Override // com.avito.avcalls.rtc.peer_connection.b
    @Y61.k
    public final l C(@Y61.k com.avito.avcalls.rtc.media.j jVar) {
        F().b("createVideoTrack", "selfVideo");
        return new m(this.f333206b.C(jVar));
    }

    @Override // com.avito.avcalls.rtc.peer_connection.b
    @Y61.k
    public final a E(@Y61.k String str, @Y61.k com.avito.avcalls.rtc.connecting.b bVar, @Y61.k Y41.l<? super com.avito.avcalls.rtc.connecting.a, G0> lVar) {
        F().b("createPeerConnection", str, bVar);
        return new k(this.f333206b.E(str, bVar, lVar));
    }

    @Override // com.avito.avcalls.utils.logs.b
    @Y61.k
    public final String G() {
        return "PeerConnectionFactory";
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f333206b, ((d) obj).f333206b);
    }

    @Override // com.avito.avcalls.utils.logs.b, com.avito.avcalls.utils.logs.c
    public final Object g() {
        return this.f333206b;
    }

    @Override // com.avito.avcalls.rtc.peer_connection.b
    @Y61.k
    public final com.avito.avcalls.rtc.media.j h() {
        F().b("createVideoSource", new Object[0]);
        return this.f333206b.h();
    }

    public final int hashCode() {
        return this.f333206b.hashCode();
    }

    @Override // com.avito.avcalls.rtc.peer_connection.b
    @Y61.k
    public final com.avito.avcalls.rtc.media.b t(@Y61.k com.avito.avcalls.rtc.media.a aVar) {
        F().b("createAudioTrack", "selfAudio");
        return new com.avito.avcalls.rtc.media.c(this.f333206b.t(aVar));
    }

    @Override // com.avito.avcalls.rtc.peer_connection.b
    @Y61.k
    public final com.avito.avcalls.rtc.media.e x() {
        F().b("createMediaConstraints", new Object[0]);
        return this.f333206b.x();
    }
}
