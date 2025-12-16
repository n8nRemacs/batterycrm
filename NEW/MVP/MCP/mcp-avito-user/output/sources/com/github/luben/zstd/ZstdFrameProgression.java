package com.github.luben.zstd;

/* loaded from: classes4.dex */
public class ZstdFrameProgression {
    private long consumed;
    private int currentJobID;
    private long flushed;
    private long ingested;
    private int nbActiveWorkers;
    private long produced;

    public ZstdFrameProgression(long j12, long j13, long j14, long j15, int i12, int i13) {
        this.ingested = j12;
        this.consumed = j13;
        this.produced = j14;
        this.flushed = j15;
        this.currentJobID = i12;
        this.nbActiveWorkers = i13;
    }

    public long getConsumed() {
        return this.consumed;
    }

    public int getCurrentJobID() {
        return this.currentJobID;
    }

    public long getFlushed() {
        return this.flushed;
    }

    public long getIngested() {
        return this.ingested;
    }

    public int getNbActiveWorkers() {
        return this.nbActiveWorkers;
    }

    public long getProduced() {
        return this.produced;
    }
}
