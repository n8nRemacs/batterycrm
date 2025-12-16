package com.yandex.runtime.bindings;

/* loaded from: classes8.dex */
public class DoubleHandler implements ArchivingHandler<Double> {
    private final boolean isOptional;

    public DoubleHandler() {
        this(false);
    }

    public DoubleHandler(boolean z12) {
        this.isOptional = z12;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Double add(Double d12, Archive archive) {
        return archive.add(d12, this.isOptional);
    }
}
