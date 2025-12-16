package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.extractor.v;
import com.google.android.exoplayer2.extractor.w;
import com.google.android.exoplayer2.util.C36585a;

/* compiled from: SubtitleExtractor.java */
/* loaded from: classes6.dex */
public class k implements com.google.android.exoplayer2.extractor.j {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.l f346911a;

    /* renamed from: b, reason: collision with root package name */
    public A f346912b;

    /* renamed from: c, reason: collision with root package name */
    public int f346913c;

    /* renamed from: d, reason: collision with root package name */
    public long f346914d;

    @Override // com.google.android.exoplayer2.extractor.j
    public final void a(long j12, long j13) {
        int i12 = this.f346913c;
        C36585a.d((i12 == 0 || i12 == 5) ? false : true);
        this.f346914d = j13;
        if (this.f346913c == 2) {
            this.f346913c = 1;
        }
        if (this.f346913c == 4) {
            this.f346913c = 3;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void b(com.google.android.exoplayer2.extractor.l lVar) {
        C36585a.d(this.f346913c == 0);
        this.f346911a = lVar;
        this.f346912b = lVar.c(0, 3);
        this.f346911a.b();
        this.f346911a.i(new v(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.f346912b.a(null);
        this.f346913c = 1;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final boolean h(com.google.android.exoplayer2.extractor.k kVar) {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final int i(com.google.android.exoplayer2.extractor.k kVar, w wVar) {
        int i12 = this.f346913c;
        C36585a.d((i12 == 0 || i12 == 5) ? false : true);
        int i13 = this.f346913c;
        if (i13 == 1) {
            if (((com.google.android.exoplayer2.extractor.f) kVar).f344494c == -1) {
                throw null;
            }
            com.google.common.primitives.l.b(((com.google.android.exoplayer2.extractor.f) kVar).f344494c);
            throw null;
        }
        if (i13 == 2) {
            throw null;
        }
        if (i13 == 3) {
            if (((com.google.android.exoplayer2.extractor.f) kVar).o(((com.google.android.exoplayer2.extractor.f) kVar).f344494c != -1 ? com.google.common.primitives.l.b(((com.google.android.exoplayer2.extractor.f) kVar).f344494c) : 1024) == -1) {
                C36585a.e(this.f346912b);
                throw null;
            }
        }
        return this.f346913c == 4 ? -1 : 0;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void release() {
        if (this.f346913c != 5) {
            throw null;
        }
    }
}
