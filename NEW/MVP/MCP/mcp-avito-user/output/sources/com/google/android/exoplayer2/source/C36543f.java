package com.google.android.exoplayer2.source;

/* compiled from: CompositeSequenceableLoader.java */
/* renamed from: com.google.android.exoplayer2.source.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36543f implements N {

    /* renamed from: b, reason: collision with root package name */
    public final N[] f346246b;

    public C36543f(N[] nArr) {
        this.f346246b = nArr;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final boolean continueLoading(long j12) {
        boolean zContinueLoading;
        boolean z12 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                break;
            }
            zContinueLoading = false;
            for (N n12 : this.f346246b) {
                long nextLoadPositionUs2 = n12.getNextLoadPositionUs();
                boolean z13 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j12;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z13) {
                    zContinueLoading |= n12.continueLoading(j12);
                }
            }
            z12 |= zContinueLoading;
        } while (zContinueLoading);
        return z12;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (N n12 : this.f346246b) {
            long bufferedPositionUs = n12.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (N n12 : this.f346246b) {
            long nextLoadPositionUs = n12.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final boolean isLoading() {
        for (N n12 : this.f346246b) {
            if (n12.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final void reevaluateBuffer(long j12) {
        for (N n12 : this.f346246b) {
            n12.reevaluateBuffer(j12);
        }
    }
}
