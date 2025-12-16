package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.upstream.J;

/* compiled from: ContainerMediaChunk.java */
/* loaded from: classes6.dex */
public class j extends a {

    /* renamed from: k, reason: collision with root package name */
    public long f346227k;

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void load() {
        com.google.android.exoplayer2.upstream.p pVar = this.f346219b;
        J j12 = this.f346226i;
        long j13 = this.f346227k;
        if (j13 == 0) {
            throw null;
        }
        try {
            long j14 = pVar.f347935g;
            long j15 = -1;
            if (j14 != -1) {
                j15 = j14 - j13;
            }
            com.google.android.exoplayer2.upstream.p pVarB = pVar.b(j13, j15);
            long j16 = pVarB.f347934f;
            j12.e(pVarB);
            this.f346227k = j16 - pVar.f347934f;
        } finally {
            com.google.android.exoplayer2.upstream.o.a(j12);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void a() {
    }
}
