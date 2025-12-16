package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes7.dex */
public class Flags implements Serializable {
    private boolean hasAutoRoad;
    private boolean requiresAccessPass;

    public Flags(boolean z12, boolean z13) {
        this.requiresAccessPass = z12;
        this.hasAutoRoad = z13;
    }

    public boolean getHasAutoRoad() {
        return this.hasAutoRoad;
    }

    public boolean getRequiresAccessPass() {
        return this.requiresAccessPass;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.requiresAccessPass = archive.add(this.requiresAccessPass);
        this.hasAutoRoad = archive.add(this.hasAutoRoad);
    }

    public Flags() {
    }
}
