package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.s;
import com.google.android.exoplayer2.util.C36585a;

/* compiled from: StartOffsetExtractorInput.java */
/* loaded from: classes6.dex */
final class c extends s {

    /* renamed from: b, reason: collision with root package name */
    public final long f344567b;

    public c(com.google.android.exoplayer2.extractor.f fVar, long j12) {
        super(fVar);
        C36585a.b(fVar.f344495d >= j12);
        this.f344567b = j12;
    }

    @Override // com.google.android.exoplayer2.extractor.s, com.google.android.exoplayer2.extractor.k
    public final long g() {
        return super.g() - this.f344567b;
    }

    @Override // com.google.android.exoplayer2.extractor.s, com.google.android.exoplayer2.extractor.k
    public final long getLength() {
        return super.getLength() - this.f344567b;
    }

    @Override // com.google.android.exoplayer2.extractor.s, com.google.android.exoplayer2.extractor.k
    public final long getPosition() {
        return super.getPosition() - this.f344567b;
    }
}
