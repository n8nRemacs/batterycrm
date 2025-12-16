package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.iw;
import com.yandex.mobile.ads.impl.uf;
import java.util.Objects;

/* loaded from: classes8.dex */
final class gw extends uf {

    public static final class a implements uf.f {

        /* renamed from: a, reason: collision with root package name */
        private final mw f385845a;

        /* renamed from: b, reason: collision with root package name */
        private final int f385846b;

        /* renamed from: c, reason: collision with root package name */
        private final iw.a f385847c;

        public /* synthetic */ a(mw mwVar, int i12) {
            this(i12, mwVar);
        }

        @Override // com.yandex.mobile.ads.impl.uf.f
        public final uf.e a(to toVar, long j12) {
            long position = toVar.getPosition();
            long jA2 = a(toVar);
            long jE2 = toVar.e();
            toVar.a(false, Math.max(6, this.f385845a.f388100c));
            long jA3 = a(toVar);
            return (jA2 > j12 || jA3 <= j12) ? jA3 <= j12 ? uf.e.b(jA3, toVar.e()) : uf.e.a(jA2, position) : uf.e.a(jE2);
        }

        private a(int i12, mw mwVar) {
            this.f385845a = mwVar;
            this.f385846b = i12;
            this.f385847c = new iw.a();
        }

        private long a(to toVar) {
            boolean zA2;
            int iB2;
            while (toVar.e() < toVar.a() - 6) {
                mw mwVar = this.f385845a;
                int i12 = this.f385846b;
                iw.a aVar = this.f385847c;
                long jE2 = toVar.e();
                byte[] bArr = new byte[2];
                toVar.b(bArr, 0, 2, false);
                if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i12) {
                    toVar.c();
                    toVar.a(false, (int) (jE2 - toVar.getPosition()));
                    zA2 = false;
                } else {
                    pr0 pr0Var = new pr0(16);
                    System.arraycopy(bArr, 0, pr0Var.c(), 0, 2);
                    byte[] bArrC = pr0Var.c();
                    int i13 = 0;
                    for (int i14 = 2; i13 < 14 && (iB2 = toVar.b(bArrC, i14 + i13, 14 - i13)) != -1; i14 = 2) {
                        i13 += iB2;
                    }
                    pr0Var.d(i13);
                    toVar.c();
                    toVar.a(false, (int) (jE2 - toVar.getPosition()));
                    zA2 = iw.a(pr0Var, mwVar, i12, aVar);
                }
                if (zA2) {
                    break;
                }
                toVar.a(false, 1);
            }
            if (toVar.e() >= toVar.a() - 6) {
                toVar.a(false, (int) (toVar.a() - toVar.e()));
                return this.f385845a.f388107j;
            }
            return this.f385847c.f386691a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(mw mwVar, int i12, long j12, long j13) {
        super(new G0(mwVar, 10), new a(mwVar, i12), mwVar.b(), mwVar.f388107j, j12, j13, mwVar.a(), Math.max(6, mwVar.f388100c));
        Objects.requireNonNull(mwVar);
    }
}
