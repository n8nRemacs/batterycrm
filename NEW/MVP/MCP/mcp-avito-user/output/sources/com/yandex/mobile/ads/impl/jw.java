package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.flac.PictureFrame;
import com.yandex.mobile.ads.impl.mw;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class jw {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public mw f386984a;

        public a(@j.P mw mwVar) {
            this.f386984a = mwVar;
        }
    }

    public static boolean a(to toVar, a aVar) {
        toVar.c();
        or0 or0Var = new or0(4, new byte[4]);
        toVar.b(or0Var.f388623a, 0, 4, false);
        boolean zF2 = or0Var.f();
        int iB2 = or0Var.b(7);
        int iB3 = or0Var.b(24) + 4;
        if (iB2 == 0) {
            byte[] bArr = new byte[38];
            toVar.a(bArr, 0, 38, false);
            aVar.f386984a = new mw(4, bArr);
        } else {
            mw mwVar = aVar.f386984a;
            if (mwVar == null) {
                throw new IllegalArgumentException();
            }
            if (iB2 == 3) {
                pr0 pr0Var = new pr0(iB3);
                toVar.a(pr0Var.c(), 0, iB3, false);
                aVar.f386984a = mwVar.a(a(pr0Var));
            } else if (iB2 == 4) {
                pr0 pr0Var2 = new pr0(iB3);
                toVar.a(pr0Var2.c(), 0, iB3, false);
                pr0Var2.f(4);
                aVar.f386984a = mwVar.b(Arrays.asList(zk1.a(pr0Var2, false, false).f392277a));
            } else if (iB2 == 6) {
                pr0 pr0Var3 = new pr0(iB3);
                toVar.a(pr0Var3.c(), 0, iB3, false);
                pr0Var3.f(4);
                int iH2 = pr0Var3.h();
                String strA = pr0Var3.a(pr0Var3.h(), oi.f388552a);
                String strA2 = pr0Var3.a(pr0Var3.h(), oi.f388554c);
                int iH3 = pr0Var3.h();
                int iH4 = pr0Var3.h();
                int iH5 = pr0Var3.h();
                int iH6 = pr0Var3.h();
                int iH7 = pr0Var3.h();
                byte[] bArr2 = new byte[iH7];
                pr0Var3.a(bArr2, 0, iH7);
                aVar.f386984a = mwVar.a(com.yandex.mobile.ads.embedded.guava.collect.p.a(new PictureFrame(iH2, strA, strA2, iH3, iH4, iH5, iH6, bArr2)));
            } else {
                toVar.a(iB3);
            }
        }
        return zF2;
    }

    public static mw.a a(pr0 pr0Var) {
        pr0Var.f(1);
        int iW2 = pr0Var.w();
        long jD2 = pr0Var.d() + iW2;
        int i12 = iW2 / 18;
        long[] jArrCopyOf = new long[i12];
        long[] jArrCopyOf2 = new long[i12];
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            long jP2 = pr0Var.p();
            if (jP2 == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i13);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i13);
                break;
            }
            jArrCopyOf[i13] = jP2;
            jArrCopyOf2[i13] = pr0Var.p();
            pr0Var.f(2);
            i13++;
        }
        pr0Var.f((int) (jD2 - pr0Var.d()));
        return new mw.a(jArrCopyOf, jArrCopyOf2);
    }
}
