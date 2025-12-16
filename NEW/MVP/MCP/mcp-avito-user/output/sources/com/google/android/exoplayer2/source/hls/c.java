package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.extractor.ts.C;
import com.google.android.exoplayer2.extractor.ts.C36516a;
import com.google.android.exoplayer2.extractor.ts.C36518c;
import com.google.android.exoplayer2.extractor.ts.C36520e;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.O;
import j.k0;

/* compiled from: BundledHlsMediaChunkExtractor.java */
/* loaded from: classes6.dex */
public final class c implements m {

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.android.exoplayer2.extractor.w f346285d = new com.google.android.exoplayer2.extractor.w();

    /* renamed from: a, reason: collision with root package name */
    @k0
    public final com.google.android.exoplayer2.extractor.j f346286a;

    /* renamed from: b, reason: collision with root package name */
    public final I f346287b;

    /* renamed from: c, reason: collision with root package name */
    public final O f346288c;

    public c(com.google.android.exoplayer2.extractor.j jVar, I i12, O o12) {
        this.f346286a = jVar;
        this.f346287b = i12;
        this.f346288c = o12;
    }

    @Override // com.google.android.exoplayer2.source.hls.m
    public final boolean a(com.google.android.exoplayer2.extractor.f fVar) {
        return this.f346286a.i(fVar, f346285d) == 0;
    }

    @Override // com.google.android.exoplayer2.source.hls.m
    public final void b(com.google.android.exoplayer2.extractor.l lVar) {
        this.f346286a.b(lVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.m
    public final boolean c() {
        com.google.android.exoplayer2.extractor.j jVar = this.f346286a;
        return (jVar instanceof C) || (jVar instanceof com.google.android.exoplayer2.extractor.mp4.e);
    }

    @Override // com.google.android.exoplayer2.source.hls.m
    public final boolean d() {
        com.google.android.exoplayer2.extractor.j jVar = this.f346286a;
        return (jVar instanceof C36520e) || (jVar instanceof C36516a) || (jVar instanceof C36518c) || (jVar instanceof com.google.android.exoplayer2.extractor.mp3.d);
    }

    @Override // com.google.android.exoplayer2.source.hls.m
    public final m e() {
        com.google.android.exoplayer2.extractor.j dVar;
        C36585a.d(!c());
        com.google.android.exoplayer2.extractor.j jVar = this.f346286a;
        boolean z12 = jVar instanceof v;
        O o12 = this.f346288c;
        I i12 = this.f346287b;
        if (z12) {
            dVar = new v(i12.f343467d, o12);
        } else if (jVar instanceof C36520e) {
            dVar = new C36520e();
        } else if (jVar instanceof C36516a) {
            dVar = new C36516a();
        } else if (jVar instanceof C36518c) {
            dVar = new C36518c();
        } else {
            if (!(jVar instanceof com.google.android.exoplayer2.extractor.mp3.d)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(jVar.getClass().getSimpleName()));
            }
            dVar = new com.google.android.exoplayer2.extractor.mp3.d();
        }
        return new c(dVar, i12, o12);
    }

    @Override // com.google.android.exoplayer2.source.hls.m
    public final void f() {
        this.f346286a.a(0L, 0L);
    }
}
