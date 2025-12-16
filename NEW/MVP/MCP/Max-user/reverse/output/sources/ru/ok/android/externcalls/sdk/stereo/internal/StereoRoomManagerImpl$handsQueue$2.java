package ru.ok.android.externcalls.sdk.stereo.internal;

import defpackage.em6;
import defpackage.hn6;
import defpackage.ti1;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class StereoRoomManagerImpl$handsQueue$2 extends hn6 implements em6 {
    public StereoRoomManagerImpl$handsQueue$2(Object obj) {
        super(1, 0, StereoRoomManagerImpl.class, obj, "getExternalId", "getExternalId(Lru/ok/android/webrtc/participant/CallParticipant$ParticipantId;)Lru/ok/android/externcalls/sdk/id/ParticipantId;");
    }

    @Override // defpackage.em6
    public final ParticipantId invoke(ti1 ti1Var) {
        return ((StereoRoomManagerImpl) this.receiver).getExternalId(ti1Var);
    }
}
