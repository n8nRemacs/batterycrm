package androidx.media3.extractor.ts;

import androidx.media3.common.util.M;
import androidx.media3.extractor.AbstractC23186e;

/* compiled from: PsBinarySearchSeeker.java */
/* loaded from: classes.dex */
final class u extends AbstractC23186e {

    /* compiled from: PsBinarySearchSeeker.java */
    public static final class b implements AbstractC23186e.f {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.util.G f51810a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.media3.common.util.z f51811b = new androidx.media3.common.util.z();

        public b(androidx.media3.common.util.G g12, a aVar) {
            this.f51810a = g12;
        }

        @Override // androidx.media3.extractor.AbstractC23186e.f
        public final void a() {
            byte[] bArr = M.f47891e;
            androidx.media3.common.util.z zVar = this.f51811b;
            zVar.getClass();
            zVar.D(bArr.length, bArr);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0118 A[EDGE_INSN: B:64:0x0118->B:50:0x0118 BREAK  A[LOOP:1: B:36:0x00df->B:49:0x0107], SYNTHETIC] */
        @Override // androidx.media3.extractor.AbstractC23186e.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.media3.extractor.AbstractC23186e.C1850e b(androidx.media3.extractor.C23191j r17, long r18) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.u.b.b(androidx.media3.extractor.j, long):androidx.media3.extractor.e$e");
        }
    }

    public static int d(int i12, byte[] bArr) {
        return (bArr[i12 + 3] & 255) | ((bArr[i12] & 255) << 24) | ((bArr[i12 + 1] & 255) << 16) | ((bArr[i12 + 2] & 255) << 8);
    }
}
