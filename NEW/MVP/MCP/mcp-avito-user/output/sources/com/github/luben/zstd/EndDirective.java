package com.github.luben.zstd;

/* loaded from: classes4.dex */
public enum EndDirective {
    CONTINUE(0),
    FLUSH(1),
    END(2);

    private final int value;

    EndDirective(int i12) {
        this.value = i12;
    }

    public int value() {
        return this.value;
    }
}
