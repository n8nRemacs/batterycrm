package com.yandex.runtime.bindings;

/* loaded from: classes8.dex */
public class LongHandler implements ArchivingHandler<Long> {
    private final boolean isOptional;

    public LongHandler() {
        this(false);
    }

    public LongHandler(boolean z12) {
        this.isOptional = z12;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Long add(Long l12, Archive archive) {
        return archive.add(l12, this.isOptional);
    }
}
