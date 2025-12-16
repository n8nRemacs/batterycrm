package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.AbstractC36511a;
import com.google.android.exoplayer2.util.O;
import com.google.android.exoplayer2.util.U;

/* compiled from: PsBinarySearchSeeker.java */
/* loaded from: classes6.dex */
final class u extends AbstractC36511a {

    /* compiled from: PsBinarySearchSeeker.java */
    public static final class b implements AbstractC36511a.f {

        /* renamed from: a, reason: collision with root package name */
        public final O f345306a;

        /* renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.util.F f345307b = new com.google.android.exoplayer2.util.F();

        public b(O o12, a aVar) {
            this.f345306a = o12;
        }

        @Override // com.google.android.exoplayer2.extractor.AbstractC36511a.f
        public final void a() {
            byte[] bArr = U.f348110e;
            com.google.android.exoplayer2.util.F f12 = this.f345307b;
            f12.getClass();
            f12.z(bArr.length, bArr);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0118 A[EDGE_INSN: B:64:0x0118->B:50:0x0118 BREAK  A[LOOP:1: B:36:0x00df->B:49:0x0107], SYNTHETIC] */
        @Override // com.google.android.exoplayer2.extractor.AbstractC36511a.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.google.android.exoplayer2.extractor.AbstractC36511a.e b(com.google.android.exoplayer2.extractor.f r17, long r18) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ts.u.b.b(com.google.android.exoplayer2.extractor.f, long):com.google.android.exoplayer2.extractor.a$e");
        }
    }

    public static int d(int i12, byte[] bArr) {
        return (bArr[i12 + 3] & 255) | ((bArr[i12] & 255) << 24) | ((bArr[i12 + 1] & 255) << 16) | ((bArr[i12 + 2] & 255) << 8);
    }
}
