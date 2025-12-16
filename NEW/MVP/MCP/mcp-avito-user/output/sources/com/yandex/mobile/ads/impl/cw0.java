package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.uf;

/* loaded from: classes8.dex */
final class cw0 extends uf {

    public static final class a implements uf.f {

        /* renamed from: a, reason: collision with root package name */
        private final o91 f384467a;

        /* renamed from: b, reason: collision with root package name */
        private final pr0 f384468b;

        public /* synthetic */ a(o91 o91Var, int i12) {
            this(o91Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0123 A[EDGE_INSN: B:63:0x0123->B:49:0x0123 BREAK  A[LOOP:1: B:35:0x00e2->B:48:0x010e], SYNTHETIC] */
        @Override // com.yandex.mobile.ads.impl.uf.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.yandex.mobile.ads.impl.uf.e a(com.yandex.mobile.ads.impl.to r17, long r18) {
            /*
                Method dump skipped, instructions count: 311
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cw0.a.a(com.yandex.mobile.ads.impl.to, long):com.yandex.mobile.ads.impl.uf$e");
        }

        private a(o91 o91Var) {
            this.f384467a = o91Var;
            this.f384468b = new pr0();
        }

        @Override // com.yandex.mobile.ads.impl.uf.f
        public final void a() {
            pr0 pr0Var = this.f384468b;
            byte[] bArr = pc1.f388773f;
            pr0Var.getClass();
            pr0Var.a(bArr.length, bArr);
        }
    }

    public cw0(o91 o91Var, long j12, long j13) {
        super(new uf.b(), new a(o91Var, 0), j12, j12 + 1, 0L, j13, 188L, 1000);
    }

    public static int a(int i12, byte[] bArr) {
        return (bArr[i12 + 3] & 255) | ((bArr[i12] & 255) << 24) | ((bArr[i12 + 1] & 255) << 16) | ((bArr[i12 + 2] & 255) << 8);
    }
}
