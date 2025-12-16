package zQ0;

import Y61.k;
import com.avito.avcalls.android.rtc.z;
import com.avito.avcalls.android.signaling.proto.IceServer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import org.webrtc.PeerConnection;

/* compiled from: RtcConfigurationMappers.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {
    @k
    public static final PeerConnection.RTCConfiguration a(@k z zVar) {
        List<IceServer> list = zVar.f331984a;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (IceServer iceServer : list) {
            PeerConnection.IceServer.Builder builder = PeerConnection.IceServer.builder(iceServer.f332100a);
            String str = iceServer.f332102c;
            if (str != null) {
                builder.setUsername(str);
            }
            String str2 = iceServer.f332101b;
            if (str2 != null) {
                builder.setPassword(str2);
            }
            arrayList.add(builder.createIceServer());
        }
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(arrayList);
        rTCConfiguration.tcpCandidatePolicy = zVar.f331985b ? PeerConnection.TcpCandidatePolicy.ENABLED : PeerConnection.TcpCandidatePolicy.DISABLED;
        rTCConfiguration.continualGatheringPolicy = zVar.f331986c ? PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY : PeerConnection.ContinualGatheringPolicy.GATHER_ONCE;
        rTCConfiguration.sdpSemantics = zVar.f331987d ? PeerConnection.SdpSemantics.UNIFIED_PLAN : PeerConnection.SdpSemantics.PLAN_B;
        return rTCConfiguration;
    }
}
