package com.yandex.mobile.ads.impl;

import com.avito.android.remote.model.search.InlineFilterValue;
import com.yandex.mobile.ads.impl.ry0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.text.C43059p;

/* loaded from: classes8.dex */
public final class wz0 implements m70 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final bq0 f391513a;

    public wz0(@Y61.k bq0 bq0Var) {
        this.f391513a = bq0Var;
    }

    @Override // com.yandex.mobile.ads.impl.m70
    @Y61.k
    public final iz0 a(@Y61.k hx0 hx0Var) {
        dt dtVarG;
        ry0 ry0VarA;
        ry0 ry0VarF = hx0Var.f();
        bx0 bx0VarB = hx0Var.b();
        List listI0 = C42784z0.f406748b;
        boolean z12 = true;
        int i12 = 0;
        iz0 iz0Var = null;
        while (true) {
            bx0VarB.a(ry0VarF, z12);
            try {
                if (bx0VarB.j()) {
                    throw new IOException("Canceled");
                }
                try {
                    iz0 iz0VarA = hx0Var.a(ry0VarF);
                    if (iz0Var != null) {
                        iz0VarA = iz0VarA.l().c(iz0Var.l().a((mz0) null).a()).a();
                    }
                    iz0Var = iz0VarA;
                    dtVarG = bx0VarB.g();
                    ry0VarA = a(iz0Var, dtVarG);
                } catch (y01 e12) {
                    if (!a(e12.b(), bx0VarB, ry0VarF, false)) {
                        throw qc1.a(e12.a(), listI0);
                    }
                    listI0 = C42745f0.i0(e12.a(), listI0);
                    bx0VarB.a(true);
                    z12 = false;
                } catch (IOException e13) {
                    if (!a(e13, bx0VarB, ry0VarF, !(e13 instanceof hl))) {
                        throw qc1.a(e13, listI0);
                    }
                    listI0 = C42745f0.i0(e13, listI0);
                    bx0VarB.a(true);
                    z12 = false;
                }
                if (ry0VarA == null) {
                    if (dtVarG != null && dtVarG.j()) {
                        bx0VarB.n();
                    }
                    bx0VarB.a(false);
                    return iz0Var;
                }
                mz0 mz0VarA = iz0Var.a();
                if (mz0VarA != null) {
                    qc1.a(mz0VarA);
                }
                i12++;
                if (i12 > 20) {
                    throw new ProtocolException("Too many follow-up requests: " + i12);
                }
                bx0VarB.a(true);
                ry0VarF = ry0VarA;
                z12 = true;
            } catch (Throwable th2) {
                bx0VarB.a(true);
                throw th2;
            }
        }
    }

    private final boolean a(IOException iOException, bx0 bx0Var, ry0 ry0Var, boolean z12) {
        if (this.f391513a.v()) {
            return !(z12 && (iOException instanceof FileNotFoundException)) && !(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) : !((iOException instanceof SocketTimeoutException) && !z12)) && bx0Var.m();
        }
        return false;
    }

    private final ry0 a(iz0 iz0Var, dt dtVar) throws ProtocolException {
        String strA;
        s10 s10VarB;
        cx0 cx0VarF;
        w01 w01VarK = (dtVar == null || (cx0VarF = dtVar.f()) == null) ? null : cx0VarF.k();
        int iE2 = iz0Var.e();
        String strF = iz0Var.p().f();
        if (iE2 != 307 && iE2 != 308) {
            if (iE2 == 401) {
                return this.f391513a.c().a(w01VarK, iz0Var);
            }
            if (iE2 == 421) {
                iz0Var.p().getClass();
                if (dtVar == null || !dtVar.i()) {
                    return null;
                }
                dtVar.f().i();
                return iz0Var.p();
            }
            int iIntValue = Integer.MAX_VALUE;
            if (iE2 == 503) {
                iz0 iz0VarM = iz0Var.m();
                if (iz0VarM != null && iz0VarM.e() == 503) {
                    return null;
                }
                String strA2 = iz0.a(iz0Var, "Retry-After");
                if (strA2 != null && new C43059p(InlineFilterValue.InlineFilterDateRangeValue.NUMERIC_ID_REGEX_PATTERN).e(strA2)) {
                    iIntValue = Integer.valueOf(strA2).intValue();
                }
                if (iIntValue == 0) {
                    return iz0Var.p();
                }
                return null;
            }
            if (iE2 == 407) {
                if (w01VarK.b().type() == Proxy.Type.HTTP) {
                    return this.f391513a.s().a(w01VarK, iz0Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iE2 == 408) {
                if (!this.f391513a.v()) {
                    return null;
                }
                iz0Var.p().getClass();
                iz0 iz0VarM2 = iz0Var.m();
                if (iz0VarM2 != null && iz0VarM2.e() == 408) {
                    return null;
                }
                String strA3 = iz0.a(iz0Var, "Retry-After");
                if (strA3 != null) {
                    iIntValue = new C43059p(InlineFilterValue.InlineFilterDateRangeValue.NUMERIC_ID_REGEX_PATTERN).e(strA3) ? Integer.valueOf(strA3).intValue() : Integer.MAX_VALUE;
                }
                if (iIntValue > 0) {
                    return null;
                }
                return iz0Var.p();
            }
            switch (iE2) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f391513a.l() || (strA = iz0.a(iz0Var, "Location")) == null || (s10VarB = iz0Var.p().h().b(strA)) == null) {
            return null;
        }
        if (!kotlin.jvm.internal.L.f(s10VarB.l(), iz0Var.p().h().l()) && !this.f391513a.m()) {
            return null;
        }
        ry0.a aVarG = iz0Var.p().g();
        if (m10.a(strF)) {
            int iE3 = iz0Var.e();
            iIntValue = (m10.c(strF) || iE3 == 308 || iE3 == 307) ? 1 : 0;
            if (m10.b(strF) && iE3 != 308 && iE3 != 307) {
                aVarG.a("GET", (uy0) null);
            } else {
                aVarG.a(strF, iIntValue != 0 ? iz0Var.p().a() : null);
            }
            if (iIntValue == 0) {
                aVarG.a("Transfer-Encoding");
                aVarG.a("Content-Length");
                aVarG.a("Content-Type");
            }
        }
        if (!qc1.a(iz0Var.p().h(), s10VarB)) {
            aVarG.a("Authorization");
        }
        return aVarG.a(s10VarB).a();
    }
}
