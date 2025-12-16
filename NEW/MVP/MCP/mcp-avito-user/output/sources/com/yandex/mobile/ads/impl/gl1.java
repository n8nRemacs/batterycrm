package com.yandex.mobile.ads.impl;

import android.util.Pair;

/* loaded from: classes8.dex */
final class gl1 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f385774a;

        /* renamed from: b, reason: collision with root package name */
        public final long f385775b;

        private a(int i12, long j12) {
            this.f385774a = i12;
            this.f385775b = j12;
        }

        public static a a(to toVar, pr0 pr0Var) {
            toVar.b(pr0Var.c(), 0, 8, false);
            pr0Var.e(0);
            return new a(pr0Var.h(), pr0Var.n());
        }
    }

    public static boolean a(to toVar) {
        pr0 pr0Var = new pr0(8);
        int i12 = a.a(toVar, pr0Var).f385774a;
        if (i12 != 1380533830 && i12 != 1380333108) {
            return false;
        }
        toVar.b(pr0Var.c(), 0, 4, false);
        pr0Var.e(0);
        int iH2 = pr0Var.h();
        if (iH2 == 1463899717) {
            return true;
        }
        ka0.b("WavHeaderReader", "Unsupported form type: " + iH2);
        return false;
    }

    public static fl1 b(to toVar) {
        byte[] bArr;
        pr0 pr0Var = new pr0(16);
        a aVarA = a(1718449184, toVar, pr0Var);
        db.b(aVarA.f385775b >= 16);
        toVar.b(pr0Var.c(), 0, 16, false);
        pr0Var.e(0);
        int iO2 = pr0Var.o();
        int iO3 = pr0Var.o();
        int iK2 = pr0Var.k();
        if (iK2 < 0) {
            throw new IllegalStateException(ba.a("Top bit not zero: ", iK2));
        }
        int iK3 = pr0Var.k();
        if (iK3 < 0) {
            throw new IllegalStateException(ba.a("Top bit not zero: ", iK3));
        }
        int iO4 = pr0Var.o();
        int iO5 = pr0Var.o();
        int i12 = ((int) aVarA.f385775b) - 16;
        if (i12 > 0) {
            byte[] bArr2 = new byte[i12];
            toVar.b(bArr2, 0, i12, false);
            bArr = bArr2;
        } else {
            bArr = pc1.f388773f;
        }
        toVar.a((int) (toVar.e() - toVar.getPosition()));
        return new fl1(iO2, iO3, iK2, iO4, iO5, bArr);
    }

    public static Pair c(to toVar) {
        toVar.c();
        a aVarA = a(1684108385, toVar, new pr0(8));
        toVar.a(8);
        return Pair.create(Long.valueOf(toVar.getPosition()), Long.valueOf(aVarA.f385775b));
    }

    private static a a(int i12, to toVar, pr0 pr0Var) throws tr0 {
        a aVarA = a.a(toVar, pr0Var);
        while (aVarA.f385774a != i12) {
            StringBuilder sbA = Cif.a("Ignoring unknown WAV chunk: ");
            sbA.append(aVarA.f385774a);
            ka0.d("WavHeaderReader", sbA.toString());
            long j12 = aVarA.f385775b + 8;
            if (j12 <= 2147483647L) {
                toVar.a((int) j12);
                aVarA = a.a(toVar, pr0Var);
            } else {
                StringBuilder sbA2 = Cif.a("Chunk is too large (~2GB+) to skip; id: ");
                sbA2.append(aVarA.f385774a);
                throw tr0.a(sbA2.toString());
            }
        }
        return aVarA;
    }
}
