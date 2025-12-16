package com.github.luben.zstd;

/* loaded from: classes4.dex */
public class ZstdException extends RuntimeException {
    private long code;

    public ZstdException(long j12) {
        this(Zstd.getErrorCode(j12), Zstd.getErrorName(j12));
    }

    public long getErrorCode() {
        return this.code;
    }

    public ZstdException(long j12, String str) {
        super(str);
        this.code = j12;
    }
}
