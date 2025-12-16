package androidx.media3.exoplayer.source;

/* compiled from: CompositeSequenceableLoader.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.source.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23155f implements Q {

    /* renamed from: b, reason: collision with root package name */
    public final Q[] f49762b;

    public C23155f(Q[] qArr) {
        this.f49762b = qArr;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final boolean continueLoading(long j12) {
        boolean zContinueLoading;
        boolean z12 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                break;
            }
            zContinueLoading = false;
            for (Q q12 : this.f49762b) {
                long nextLoadPositionUs2 = q12.getNextLoadPositionUs();
                boolean z13 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j12;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z13) {
                    zContinueLoading |= q12.continueLoading(j12);
                }
            }
            z12 |= zContinueLoading;
        } while (zContinueLoading);
        return z12;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (Q q12 : this.f49762b) {
            long bufferedPositionUs = q12.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (Q q12 : this.f49762b) {
            long nextLoadPositionUs = q12.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final boolean isLoading() {
        for (Q q12 : this.f49762b) {
            if (q12.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final void reevaluateBuffer(long j12) {
        for (Q q12 : this.f49762b) {
            q12.reevaluateBuffer(j12);
        }
    }
}
