package com.yandex.runtime.bindings;

/* loaded from: classes8.dex */
public class BooleanHandler implements ArchivingHandler<Boolean> {
    private final boolean isOptional;

    public BooleanHandler() {
        this(false);
    }

    public BooleanHandler(boolean z12) {
        this.isOptional = z12;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Boolean add(Boolean bool, Archive archive) {
        return archive.add(bool, this.isOptional);
    }
}
