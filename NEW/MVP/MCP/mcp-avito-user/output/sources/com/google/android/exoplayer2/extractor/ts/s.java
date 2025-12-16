package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.extractor.ts.D;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.O;
import com.google.android.exoplayer2.util.U;

/* compiled from: PassthroughSectionPayloadReader.java */
/* loaded from: classes6.dex */
public final class s implements x {

    /* renamed from: a, reason: collision with root package name */
    public I f345291a;

    /* renamed from: b, reason: collision with root package name */
    public O f345292b;

    /* renamed from: c, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.A f345293c;

    public s(String str) {
        I.b bVar = new I.b();
        bVar.f343504k = str;
        this.f345291a = bVar.a();
    }

    @Override // com.google.android.exoplayer2.extractor.ts.x
    public final void b(O o12, com.google.android.exoplayer2.extractor.l lVar, D.e eVar) {
        this.f345292b = o12;
        eVar.a();
        eVar.b();
        com.google.android.exoplayer2.extractor.A aC2 = lVar.c(eVar.f345039d, 5);
        this.f345293c = aC2;
        aC2.a(this.f345291a);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.x
    public final void c(com.google.android.exoplayer2.util.F f12) {
        long jC2;
        long j12;
        C36585a.e(this.f345292b);
        int i12 = U.f348106a;
        O o12 = this.f345292b;
        synchronized (o12) {
            try {
                long j13 = o12.f348101c;
                jC2 = j13 != -9223372036854775807L ? j13 + o12.f348100b : o12.c();
            } finally {
            }
        }
        O o13 = this.f345292b;
        synchronized (o13) {
            j12 = o13.f348100b;
        }
        if (jC2 == -9223372036854775807L || j12 == -9223372036854775807L) {
            return;
        }
        I i13 = this.f345291a;
        if (j12 != i13.f343480q) {
            I.b bVarA = i13.a();
            bVarA.f343508o = j12;
            I iA2 = bVarA.a();
            this.f345291a = iA2;
            this.f345293c.a(iA2);
        }
        int iA3 = f12.a();
        this.f345293c.c(iA3, f12);
        this.f345293c.f(jC2, 1, iA3, 0, null);
    }
}
