package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.y;

/* compiled from: Seeker.java */
/* loaded from: classes6.dex */
interface e extends y {

    /* compiled from: Seeker.java */
    public static class a extends y.b implements e {
        public a() {
            super(-9223372036854775807L);
        }

        @Override // com.google.android.exoplayer2.extractor.mp3.e
        public final long c() {
            return -1L;
        }

        @Override // com.google.android.exoplayer2.extractor.mp3.e
        public final long e(long j12) {
            return 0L;
        }
    }

    long c();

    long e(long j12);
}
