package androidx.media3.extractor.mp3;

import androidx.media3.extractor.C23190i;

/* compiled from: ConstantBitrateSeeker.java */
/* loaded from: classes.dex */
final class a extends C23190i implements e {
    @Override // androidx.media3.extractor.mp3.e
    public final long c() {
        return -1L;
    }

    @Override // androidx.media3.extractor.mp3.e
    public final long e(long j12) {
        return (Math.max(0L, j12 - this.f50574b) * 8000000) / this.f50577e;
    }
}
