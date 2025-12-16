package com.yandex.runtime.bindings;

/* loaded from: classes8.dex */
public class FloatHandler implements ArchivingHandler<Float> {
    private final boolean isOptional;

    public FloatHandler() {
        this(false);
    }

    public FloatHandler(boolean z12) {
        this.isOptional = z12;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Float add(Float f12, Archive archive) {
        return archive.add(f12, this.isOptional);
    }
}
