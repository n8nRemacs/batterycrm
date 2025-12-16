package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.C36515e;

/* compiled from: ConstantBitrateSeeker.java */
/* loaded from: classes6.dex */
final class a extends C36515e implements e {
    @Override // com.google.android.exoplayer2.extractor.mp3.e
    public final long c() {
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.e
    public final long e(long j12) {
        return (Math.max(0L, j12 - this.f344486b) * 8000000) / this.f344489e;
    }
}
