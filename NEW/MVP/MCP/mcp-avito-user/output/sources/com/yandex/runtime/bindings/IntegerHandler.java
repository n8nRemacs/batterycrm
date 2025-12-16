package com.yandex.runtime.bindings;

/* loaded from: classes8.dex */
public class IntegerHandler implements ArchivingHandler<Integer> {
    private final boolean isOptional;

    public IntegerHandler() {
        this(false);
    }

    public IntegerHandler(boolean z12) {
        this.isOptional = z12;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Integer add(Integer num, Archive archive) {
        return archive.add(num, this.isOptional);
    }
}
