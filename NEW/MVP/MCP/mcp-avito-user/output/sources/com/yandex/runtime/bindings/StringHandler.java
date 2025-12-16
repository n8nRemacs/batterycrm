package com.yandex.runtime.bindings;

/* loaded from: classes8.dex */
public class StringHandler implements ArchivingHandler<String> {
    private final boolean isOptional;

    public StringHandler() {
        this(false);
    }

    public StringHandler(boolean z12) {
        this.isOptional = z12;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public String add(String str, Archive archive) {
        return archive.add(str, this.isOptional);
    }
}
