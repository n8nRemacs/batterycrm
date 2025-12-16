package com.github.luben.zstd;

import java.io.IOException;

/* loaded from: classes4.dex */
public class ZstdIOException extends IOException {
    private long code;

    public ZstdIOException(long j12) {
        this(Zstd.getErrorCode(j12), Zstd.getErrorName(j12));
    }

    public long getErrorCode() {
        return this.code;
    }

    public ZstdIOException(long j12, String str) {
        super(str);
        this.code = j12;
    }
}
