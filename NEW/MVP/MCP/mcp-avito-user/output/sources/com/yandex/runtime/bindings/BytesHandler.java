package com.yandex.runtime.bindings;

/* loaded from: classes8.dex */
public class BytesHandler implements ArchivingHandler<byte[]> {
    private final boolean isOptional;

    public BytesHandler() {
        this(false);
    }

    public BytesHandler(boolean z12) {
        this.isOptional = z12;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public byte[] add(byte[] bArr, Archive archive) {
        return archive.add(bArr, this.isOptional);
    }
}
