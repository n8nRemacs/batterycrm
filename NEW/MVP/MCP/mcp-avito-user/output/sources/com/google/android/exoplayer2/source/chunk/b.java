package com.google.android.exoplayer2.source.chunk;

/* compiled from: BaseMediaChunkIterator.java */
/* loaded from: classes6.dex */
public abstract class b implements n {

    /* renamed from: b, reason: collision with root package name */
    public final long f346214b;

    /* renamed from: c, reason: collision with root package name */
    public long f346215c = -1;

    public b(long j12) {
        this.f346214b = j12;
    }

    @Override // com.google.android.exoplayer2.source.chunk.n
    public final boolean next() {
        long j12 = this.f346215c + 1;
        this.f346215c = j12;
        return !(j12 > this.f346214b);
    }
}
