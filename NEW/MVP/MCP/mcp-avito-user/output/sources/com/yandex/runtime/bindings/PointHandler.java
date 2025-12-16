package com.yandex.runtime.bindings;

import android.graphics.PointF;

/* loaded from: classes8.dex */
public class PointHandler implements ArchivingHandler<PointF> {
    private final boolean isOptional;

    public PointHandler() {
        this(false);
    }

    public PointHandler(boolean z12) {
        this.isOptional = z12;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public PointF add(PointF pointF, Archive archive) {
        return archive.add(pointF, this.isOptional);
    }
}
