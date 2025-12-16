package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.extractor.z;

/* compiled from: StartOffsetExtractorOutput.java */
/* loaded from: classes6.dex */
public final class d implements l {

    /* renamed from: b, reason: collision with root package name */
    public final long f344568b;

    /* renamed from: c, reason: collision with root package name */
    public final l f344569c;

    /* compiled from: StartOffsetExtractorOutput.java */
    public class a implements y {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y f344570a;

        public a(y yVar) {
            this.f344570a = yVar;
        }

        @Override // com.google.android.exoplayer2.extractor.y
        public final long d() {
            return this.f344570a.d();
        }

        @Override // com.google.android.exoplayer2.extractor.y
        public final y.a f(long j12) {
            y.a aVarF = this.f344570a.f(j12);
            z zVar = aVarF.f345389a;
            long j13 = zVar.f345394a;
            long j14 = zVar.f345395b;
            long j15 = d.this.f344568b;
            z zVar2 = new z(j13, j14 + j15);
            z zVar3 = aVarF.f345390b;
            return new y.a(zVar2, new z(zVar3.f345394a, zVar3.f345395b + j15));
        }

        @Override // com.google.android.exoplayer2.extractor.y
        public final boolean g() {
            return this.f344570a.g();
        }
    }

    public d(long j12, l lVar) {
        this.f344568b = j12;
        this.f344569c = lVar;
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public final void b() {
        this.f344569c.b();
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public final A c(int i12, int i13) {
        return this.f344569c.c(i12, i13);
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public final void i(y yVar) {
        this.f344569c.i(new a(yVar));
    }
}
