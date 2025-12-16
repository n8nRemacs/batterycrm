package com.avito.avcalls.android.rtc;

import com.avito.avcalls.android.stats.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.Z;
import kotlin.collections.P0;
import kotlin.coroutines.SafeContinuation;
import org.webrtc.RTCStats;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;

/* compiled from: PeerConnection.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/webrtc/RTCStatsReport;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onStatsDelivered", "(Lorg/webrtc/RTCStatsReport;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class s implements RTCStatsCollectorCallback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SafeContinuation f331973b;

    public s(SafeContinuation safeContinuation) {
        this.f331973b = safeContinuation;
    }

    @Override // org.webrtc.RTCStatsCollectorCallback
    public final void onStatsDelivered(RTCStatsReport rTCStatsReport) {
        int i12 = Z.f406624c;
        Map linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, RTCStats> entry : rTCStatsReport.getStatsMap().entrySet()) {
            String key = entry.getKey();
            RTCStats value = entry.getValue();
            String id2 = value.getId();
            String type = value.getType();
            double timestampUs = value.getTimestampUs() / 1000;
            Map<String, Object> members = value.getMembers();
            if (!(members instanceof Map)) {
                members = null;
            }
            if (members == null) {
                members = P0.c();
            }
            linkedHashMap = P0.l(linkedHashMap, new Q(key, new a.C10325a(id2, type, timestampUs, members)));
        }
        this.f331973b.resumeWith(new com.avito.avcalls.android.stats.a(rTCStatsReport.getTimestampUs() / 1000, linkedHashMap));
    }
}
