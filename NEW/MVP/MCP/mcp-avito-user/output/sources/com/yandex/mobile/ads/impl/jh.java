package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gz;
import com.yandex.mobile.ads.impl.iz0;
import com.yandex.mobile.ads.impl.mh;
import java.io.IOException;
import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class jh implements m70 {

    public static final class a {
        public /* synthetic */ a(int i12) {
            this();
        }

        public static final iz0 a(iz0 iz0Var) {
            if ((iz0Var != null ? iz0Var.a() : null) == null) {
                return iz0Var;
            }
            iz0Var.getClass();
            return new iz0.a(iz0Var).a((mz0) null).a();
        }

        private a() {
        }

        public static final gz a(gz gzVar, gz gzVar2) {
            gz.a aVar = new gz.a();
            int size = gzVar.size();
            for (int i12 = 0; i12 < size; i12++) {
                String strA = gzVar.a(i12);
                String strB = gzVar.b(i12);
                if ((!"Warning".equalsIgnoreCase(strA) || !C43066x.h0(strB, "1", false)) && ("Content-Length".equalsIgnoreCase(strA) || "Content-Encoding".equalsIgnoreCase(strA) || "Content-Type".equalsIgnoreCase(strA) || !a(strA) || gzVar2.a(strA) == null)) {
                    aVar.b(strA, strB);
                }
            }
            int size2 = gzVar2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                String strA2 = gzVar2.a(i13);
                if (!"Content-Length".equalsIgnoreCase(strA2) && !"Content-Encoding".equalsIgnoreCase(strA2) && !"Content-Type".equalsIgnoreCase(strA2) && a(strA2)) {
                    aVar.b(strA2, gzVar2.b(i13));
                }
            }
            return aVar.a();
        }

        private static boolean a(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }
    }

    static {
        new a(0);
    }

    @Override // com.yandex.mobile.ads.impl.m70
    @Y61.k
    public final iz0 a(@Y61.k hx0 hx0Var) throws IOException {
        zs zsVarE;
        bx0 bx0VarA = hx0Var.a();
        mh mhVarA = new mh.b(System.currentTimeMillis(), hx0Var.i()).a();
        ry0 ry0VarB = mhVarA.b();
        iz0 iz0VarA = mhVarA.a();
        bx0 bx0Var = bx0VarA != null ? bx0VarA : null;
        if (bx0Var == null || (zsVarE = bx0Var.e()) == null) {
            zsVarE = zs.f392345a;
        }
        if (ry0VarB == null && iz0VarA == null) {
            iz0 iz0VarA2 = new iz0.a().a(hx0Var.i()).a(sv0.f390034c).a(504).b("Unsatisfiable Request (only-if-cached)").a(qc1.f389145c).b(-1L).a(System.currentTimeMillis()).a();
            zsVarE.getClass();
            zs.c(bx0VarA, iz0VarA2);
            return iz0VarA2;
        }
        if (ry0VarB == null) {
            iz0 iz0VarA3 = iz0VarA.l().a(a.a(iz0VarA)).a();
            zsVarE.getClass();
            zs.b(bx0VarA, iz0VarA3);
            return iz0VarA3;
        }
        if (iz0VarA != null) {
            zsVarE.getClass();
            zs.a((th) bx0VarA, iz0VarA);
        }
        iz0 iz0VarA4 = hx0Var.a(ry0VarB);
        if (iz0VarA != null) {
            if (iz0VarA4.e() == 304) {
                iz0VarA.l().a(a.a(iz0VarA.h(), iz0VarA4.h())).b(iz0VarA4.q()).a(iz0VarA4.o()).a(a.a(iz0VarA)).b(a.a(iz0VarA4)).a();
                iz0VarA4.a().close();
                throw null;
            }
            mz0 mz0VarA = iz0VarA.a();
            if (mz0VarA != null) {
                qc1.a(mz0VarA);
            }
        }
        return iz0VarA4.l().a(a.a(iz0VarA)).b(a.a(iz0VarA4)).a();
    }
}
