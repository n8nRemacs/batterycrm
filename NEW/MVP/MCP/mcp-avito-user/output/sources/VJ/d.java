package vJ;

import Y61.k;
import com.avito.avcalls.signaling.proto.IceServer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import org.webrtc.PeerConnection;

/* compiled from: RtcConfigurationMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvJ/d;", "", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f440674a = new d();

    @k
    public static PeerConnection.RTCConfiguration a(@k com.avito.avcalls.rtc.connecting.b bVar) {
        List<IceServer> list = bVar.f333092a;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (IceServer iceServer : list) {
            c.f440673a.getClass();
            PeerConnection.IceServer.Builder builder = PeerConnection.IceServer.builder(iceServer.f333318a);
            String str = iceServer.f333320c;
            if (str != null) {
                builder.setUsername(str);
            }
            String str2 = iceServer.f333319b;
            if (str2 != null) {
                builder.setPassword(str2);
            }
            arrayList.add(builder.createIceServer());
        }
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(arrayList);
        rTCConfiguration.tcpCandidatePolicy = bVar.f333093b ? PeerConnection.TcpCandidatePolicy.ENABLED : PeerConnection.TcpCandidatePolicy.DISABLED;
        rTCConfiguration.continualGatheringPolicy = bVar.f333094c ? PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY : PeerConnection.ContinualGatheringPolicy.GATHER_ONCE;
        rTCConfiguration.sdpSemantics = bVar.f333095d ? PeerConnection.SdpSemantics.UNIFIED_PLAN : PeerConnection.SdpSemantics.PLAN_B;
        return rTCConfiguration;
    }
}
