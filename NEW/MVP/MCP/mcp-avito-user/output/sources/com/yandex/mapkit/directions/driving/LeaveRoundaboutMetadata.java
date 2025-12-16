package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes7.dex */
public class LeaveRoundaboutMetadata implements Serializable {
    private int exitNumber;

    public LeaveRoundaboutMetadata(int i12) {
        this.exitNumber = i12;
    }

    public int getExitNumber() {
        return this.exitNumber;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.exitNumber = archive.add(this.exitNumber);
    }

    public LeaveRoundaboutMetadata() {
    }
}
