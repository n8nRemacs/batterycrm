package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.uf;

/* loaded from: classes8.dex */
final class cb1 extends uf {
    public cb1(o91 o91Var, long j12, long j13, int i12, int i13) {
        super(new uf.b(), new a(i12, o91Var, i13), j12, j12 + 1, 0L, j13, 188L, 940);
    }

    public static final class a implements uf.f {

        /* renamed from: a, reason: collision with root package name */
        private final o91 f384231a;

        /* renamed from: b, reason: collision with root package name */
        private final pr0 f384232b = new pr0();

        /* renamed from: c, reason: collision with root package name */
        private final int f384233c;

        /* renamed from: d, reason: collision with root package name */
        private final int f384234d;

        public a(int i12, o91 o91Var, int i13) {
            this.f384233c = i12;
            this.f384231a = o91Var;
            this.f384234d = i13;
        }

        @Override // com.yandex.mobile.ads.impl.uf.f
        public final uf.e a(to toVar, long j12) {
            long position = toVar.getPosition();
            int iMin = (int) Math.min(this.f384234d, toVar.a() - position);
            this.f384232b.c(iMin);
            toVar.b(this.f384232b.c(), 0, iMin, false);
            pr0 pr0Var = this.f384232b;
            int iE2 = pr0Var.e();
            long j13 = -1;
            long j14 = -1;
            long j15 = -9223372036854775807L;
            while (pr0Var.a() >= 188) {
                byte[] bArrC = pr0Var.c();
                int iD2 = pr0Var.d();
                while (iD2 < iE2 && bArrC[iD2] != 71) {
                    iD2++;
                }
                int i12 = iD2 + 188;
                if (i12 > iE2) {
                    break;
                }
                long jA2 = gb1.a(iD2, this.f384233c, pr0Var);
                if (jA2 != -9223372036854775807L) {
                    long jB2 = this.f384231a.b(jA2);
                    if (jB2 > j12) {
                        return j15 == -9223372036854775807L ? uf.e.a(jB2, position) : uf.e.a(position + j14);
                    }
                    if (100000 + jB2 > j12) {
                        return uf.e.a(position + iD2);
                    }
                    j15 = jB2;
                    j14 = iD2;
                }
                pr0Var.e(i12);
                j13 = i12;
            }
            return j15 != -9223372036854775807L ? uf.e.b(j15, position + j13) : uf.e.f390546d;
        }

        @Override // com.yandex.mobile.ads.impl.uf.f
        public final void a() {
            pr0 pr0Var = this.f384232b;
            byte[] bArr = pc1.f388773f;
            pr0Var.getClass();
            pr0Var.a(bArr.length, bArr);
        }
    }
}
