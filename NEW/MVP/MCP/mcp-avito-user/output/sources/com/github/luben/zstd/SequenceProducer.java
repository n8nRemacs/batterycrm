package com.github.luben.zstd;

/* loaded from: classes4.dex */
public interface SequenceProducer {
    long createState();

    void freeState(long j12);

    long getFunctionPointer();
}
