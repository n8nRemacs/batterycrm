package com.yandex.mapkit.navigation;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class JamTypeColor implements Serializable {
    private int jamColor;
    private JamType jamType;

    public JamTypeColor(@N JamType jamType, int i12) {
        if (jamType == null) {
            throw new IllegalArgumentException("Required field \"jamType\" cannot be null");
        }
        this.jamType = jamType;
        this.jamColor = i12;
    }

    public int getJamColor() {
        return this.jamColor;
    }

    @N
    public JamType getJamType() {
        return this.jamType;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.jamType = (JamType) archive.add((Archive) this.jamType, false, (Class<Archive>) JamType.class);
        this.jamColor = archive.add(this.jamColor);
    }

    public JamTypeColor() {
    }
}
