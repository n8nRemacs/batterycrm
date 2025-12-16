package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.iz0;
import java.net.ProtocolException;

/* loaded from: classes8.dex */
public final class uh implements m70 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f390561a;

    public uh(boolean z12) {
        this.f390561a = z12;
    }

    @Override // com.yandex.mobile.ads.impl.m70
    @Y61.k
    public final iz0 a(@Y61.k hx0 hx0Var) throws Throwable {
        iz0.a aVarA;
        dt dtVarD = hx0Var.d();
        ry0 ry0VarF = hx0Var.f();
        uy0 uy0VarA = ry0VarF.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        dtVarD.b(ry0VarF);
        boolean z12 = true;
        if (!m10.a(ry0VarF.f()) || uy0VarA == null) {
            dtVarD.l();
            aVarA = null;
        } else {
            if ("100-continue".equalsIgnoreCase(ry0VarF.a("Expect"))) {
                dtVarD.d();
                aVarA = dtVarD.a(true);
                dtVarD.m();
                z12 = false;
            } else {
                aVarA = null;
            }
            if (aVarA == null) {
                okio.X x12 = new okio.X(dtVarD.a(ry0VarF));
                uy0VarA.a(x12);
                x12.close();
            } else {
                dtVarD.l();
                if (!dtVarD.f().h()) {
                    dtVarD.k();
                }
            }
        }
        dtVarD.c();
        if (aVarA == null) {
            aVarA = dtVarD.a(false);
            if (z12) {
                dtVarD.m();
                z12 = false;
            }
        }
        iz0 iz0VarA = aVarA.a(ry0VarF).a(dtVarD.f().f()).b(jCurrentTimeMillis).a(System.currentTimeMillis()).a();
        int iE2 = iz0VarA.e();
        if (iE2 == 100) {
            iz0.a aVarA2 = dtVarD.a(false);
            if (z12) {
                dtVarD.m();
            }
            iz0VarA = aVarA2.a(ry0VarF).a(dtVarD.f().f()).b(jCurrentTimeMillis).a(System.currentTimeMillis()).a();
            iE2 = iz0VarA.e();
        }
        dtVarD.b(iz0VarA);
        iz0 iz0VarA2 = (this.f390561a && iE2 == 101) ? iz0VarA.l().a(qc1.f389145c).a() : iz0VarA.l().a(dtVarD.a(iz0VarA)).a();
        if ("close".equalsIgnoreCase(iz0VarA2.p().a("Connection")) || "close".equalsIgnoreCase(iz0.a(iz0VarA2, "Connection"))) {
            dtVarD.k();
        }
        if (iE2 == 204 || iE2 == 205) {
            mz0 mz0VarA = iz0VarA2.a();
            if ((mz0VarA != null ? mz0VarA.b() : -1L) > 0) {
                StringBuilder sbJ = androidx.camera.camera2.internal.G.j(iE2, "HTTP ", " had non-zero Content-Length: ");
                mz0 mz0VarA2 = iz0VarA2.a();
                sbJ.append(mz0VarA2 != null ? Long.valueOf(mz0VarA2.b()) : null);
                throw new ProtocolException(sbJ.toString());
            }
        }
        return iz0VarA2;
    }
}
