package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.C23108t;
import androidx.media3.common.InterfaceC23102m;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.z;
import androidx.media3.extractor.F;
import androidx.media3.extractor.H;
import androidx.media3.extractor.J;
import androidx.media3.extractor.r;
import j.P;

/* compiled from: BundledChunkExtractor.java */
@J
/* loaded from: classes.dex */
public final class d implements r, f {

    /* renamed from: b, reason: collision with root package name */
    public H f49747b;

    /* compiled from: BundledChunkExtractor.java */
    public static final class a implements androidx.media3.extractor.J {

        /* renamed from: a, reason: collision with root package name */
        public androidx.media3.extractor.J f49748a;

        @Override // androidx.media3.extractor.J
        public final void b(C23108t c23108t) {
            throw null;
        }

        @Override // androidx.media3.extractor.J
        public final int c(InterfaceC23102m interfaceC23102m, int i12, boolean z12) {
            androidx.media3.extractor.J j12 = this.f49748a;
            int i13 = M.f47887a;
            return j12.a(interfaceC23102m, i12, z12);
        }

        @Override // androidx.media3.extractor.J
        public final void d(int i12, z zVar) {
            androidx.media3.extractor.J j12 = this.f49748a;
            int i13 = M.f47887a;
            j12.e(i12, zVar);
        }

        @Override // androidx.media3.extractor.J
        public final void f(long j12, int i12, int i13, int i14, @P J.a aVar) {
            if (j12 >= 0) {
                this.f49748a = null;
            }
            androidx.media3.extractor.J j13 = this.f49748a;
            int i15 = M.f47887a;
            j13.f(j12, i12, i13, i14, aVar);
        }
    }

    static {
        new F();
    }

    @Override // androidx.media3.extractor.r
    public final void b() {
        throw null;
    }

    @Override // androidx.media3.extractor.r
    public final androidx.media3.extractor.J c(int i12, int i13) {
        throw null;
    }

    @Override // androidx.media3.extractor.r
    public final void e(H h12) {
        this.f49747b = h12;
    }
}
