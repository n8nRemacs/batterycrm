package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import com.yandex.mobile.ads.impl.hp0;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class lf implements uo0 {

    /* renamed from: a, reason: collision with root package name */
    private final af f387455a;

    /* renamed from: b, reason: collision with root package name */
    protected final vg f387456b;

    public lf(r10 r10Var) {
        this(r10Var, new vg());
    }

    public final zo0 a(qy0<?> qy0Var) throws ok1, IOException {
        byte[] bArr;
        hp0.a aVar;
        int iK2;
        o10 o10VarA;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            o10 o10Var = null;
            int i12 = 0;
            try {
                o10VarA = this.f387455a.a(qy0Var, j10.a(qy0Var.d()));
            } catch (IOException e12) {
                e = e12;
                bArr = null;
            }
            try {
                int iD2 = o10VarA.d();
                List<dz> listC = o10VarA.c();
                if (iD2 == 304) {
                    return hp0.a(qy0Var, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                }
                InputStream inputStreamA = o10VarA.a();
                byte[] bArrA = inputStreamA != null ? hp0.a(inputStreamA, o10VarA.b(), this.f387456b) : new byte[0];
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (pk1.f388875a || jElapsedRealtime2 > 3000) {
                    qy0Var.i().getClass();
                }
                if (iD2 < 200 || iD2 > 299) {
                    throw new IOException();
                }
                return new zo0(iD2, bArrA, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
            } catch (IOException e13) {
                e = e13;
                bArr = null;
                o10Var = o10VarA;
                if (e instanceof SocketTimeoutException) {
                    aVar = new hp0.a("socket", new k91(), i12);
                } else {
                    if (e instanceof MalformedURLException) {
                        StringBuilder sbA = Cif.a("Bad URL ");
                        sbA.append(qy0Var.m());
                        throw new RuntimeException(sbA.toString(), e);
                    }
                    if (o10Var == null) {
                        throw new np0(e);
                    }
                    int iD3 = o10Var.d();
                    qy0Var.m();
                    boolean z12 = pk1.f388875a;
                    if (bArr != null) {
                        zo0 zo0Var = new zo0(iD3, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, o10Var.c());
                        if (iD3 != 401 && iD3 != 403) {
                            if (iD3 < 400 || iD3 > 499) {
                                throw new h31(zo0Var);
                            }
                            throw new ej(zo0Var);
                        }
                        aVar = new hp0.a("auth", new uc(zo0Var), i12);
                    } else {
                        aVar = new hp0.a("network", new wo0(), i12);
                    }
                }
                hp hpVarI = qy0Var.i();
                iK2 = qy0Var.k();
                try {
                    hpVarI.a(aVar.f386202b);
                    qy0Var.a(aVar.f386201a + "-retry [timeout=" + iK2 + "]");
                } catch (ok1 e14) {
                    qy0Var.a(aVar.f386201a + "-timeout-giveup [timeout=" + iK2 + "]");
                    throw e14;
                }
            }
            qy0Var.a(aVar.f386201a + "-retry [timeout=" + iK2 + "]");
        }
    }

    public lf(r10 r10Var, vg vgVar) {
        this.f387455a = r10Var;
        this.f387456b = vgVar;
    }
}
