package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.iz0;
import com.yandex.mobile.ads.impl.ry0;
import java.util.List;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class lg implements m70 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final em f387463a;

    public lg(@Y61.k em emVar) {
        this.f387463a = emVar;
    }

    @Override // com.yandex.mobile.ads.impl.m70
    @Y61.k
    public final iz0 a(@Y61.k hx0 hx0Var) {
        boolean z12;
        mz0 mz0VarA;
        ry0 ry0VarI = hx0Var.i();
        ry0.a aVarG = ry0VarI.g();
        uy0 uy0VarA = ry0VarI.a();
        if (uy0VarA != null) {
            pd0 pd0VarB = uy0VarA.b();
            if (pd0VarB != null) {
                aVarG.b("Content-Type", pd0VarB.toString());
            }
            long jA2 = uy0VarA.a();
            if (jA2 != -1) {
                aVarG.b("Content-Length", String.valueOf(jA2));
                aVarG.a("Transfer-Encoding");
            } else {
                aVarG.b("Transfer-Encoding", "chunked");
                aVarG.a("Content-Length");
            }
        }
        if (ry0VarI.a("Host") == null) {
            aVarG.b("Host", qc1.a(ry0VarI.h(), false));
        }
        if (ry0VarI.a("Connection") == null) {
            aVarG.b("Connection", "Keep-Alive");
        }
        int i12 = 0;
        if (ry0VarI.a("Accept-Encoding") == null && ry0VarI.a("Range") == null) {
            aVarG.b("Accept-Encoding", "gzip");
            z12 = true;
        } else {
            z12 = false;
        }
        List<cm> listA = this.f387463a.a(ry0VarI.h());
        if (!listA.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : listA) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                cm cmVar = (cm) obj;
                if (i12 > 0) {
                    sb2.append("; ");
                }
                sb2.append(cmVar.e());
                sb2.append('=');
                sb2.append(cmVar.f());
                i12 = i13;
            }
            aVarG.b("Cookie", sb2.toString());
        }
        if (ry0VarI.a("User-Agent") == null) {
            aVarG.b("User-Agent", "okhttp/4.9.3");
        }
        iz0 iz0VarA = hx0Var.a(aVarG.a());
        l10.a(this.f387463a, ry0VarI.h(), iz0VarA.h());
        iz0.a aVarA = iz0VarA.l().a(ry0VarI);
        if (z12 && "gzip".equalsIgnoreCase(iz0.a(iz0VarA, "Content-Encoding")) && l10.a(iz0VarA) && (mz0VarA = iz0VarA.a()) != null) {
            okio.C c12 = new okio.C(mz0VarA.d());
            aVarA.a(iz0VarA.h().b().b("Content-Encoding").b("Content-Length").a());
            aVarA.a(new ix0(iz0.a(iz0VarA, "Content-Type"), -1L, new okio.Y(c12)));
        }
        return aVarA.a();
    }
}
