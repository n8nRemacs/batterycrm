package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.P;

/* loaded from: classes7.dex */
public class ActionMetadata implements Serializable {
    private LeaveRoundaboutMetadata leaveRoundaboutMetadada;
    private UturnMetadata uturnMetadata;

    public ActionMetadata(@P UturnMetadata uturnMetadata, @P LeaveRoundaboutMetadata leaveRoundaboutMetadata) {
        this.uturnMetadata = uturnMetadata;
        this.leaveRoundaboutMetadada = leaveRoundaboutMetadata;
    }

    @P
    public LeaveRoundaboutMetadata getLeaveRoundaboutMetadada() {
        return this.leaveRoundaboutMetadada;
    }

    @P
    public UturnMetadata getUturnMetadata() {
        return this.uturnMetadata;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.uturnMetadata = (UturnMetadata) archive.add((Archive) this.uturnMetadata, true, (Class<Archive>) UturnMetadata.class);
        this.leaveRoundaboutMetadada = (LeaveRoundaboutMetadata) archive.add((Archive) this.leaveRoundaboutMetadada, true, (Class<Archive>) LeaveRoundaboutMetadata.class);
    }

    public ActionMetadata() {
    }
}
