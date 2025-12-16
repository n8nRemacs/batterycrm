package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.extractor.w;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.upstream.InterfaceC36580j;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import j.P;

/* compiled from: BundledChunkExtractor.java */
/* loaded from: classes6.dex */
public final class d implements com.google.android.exoplayer2.extractor.l, f {

    /* renamed from: b, reason: collision with root package name */
    public y f346216b;

    /* compiled from: BundledChunkExtractor.java */
    public static final class a implements A {

        /* renamed from: a, reason: collision with root package name */
        public A f346217a;

        @Override // com.google.android.exoplayer2.extractor.A
        public final void a(I i12) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.extractor.A
        public final int d(InterfaceC36580j interfaceC36580j, int i12, boolean z12) {
            A a12 = this.f346217a;
            int i13 = U.f348106a;
            return a12.b(interfaceC36580j, i12, z12);
        }

        @Override // com.google.android.exoplayer2.extractor.A
        public final void e(int i12, F f12) {
            A a12 = this.f346217a;
            int i13 = U.f348106a;
            a12.c(i12, f12);
        }

        @Override // com.google.android.exoplayer2.extractor.A
        public final void f(long j12, int i12, int i13, int i14, @P A.a aVar) {
            if (j12 >= 0) {
                this.f346217a = null;
            }
            A a12 = this.f346217a;
            int i15 = U.f348106a;
            a12.f(j12, i12, i13, i14, aVar);
        }
    }

    static {
        new w();
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public final void b() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public final A c(int i12, int i13) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public final void i(y yVar) {
        this.f346216b = yVar;
    }
}
