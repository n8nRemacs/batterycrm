package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.o81;
import java.util.logging.Level;

/* loaded from: classes8.dex */
public final class p81 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o81 f388740b;

    public p81(o81 o81Var) {
        this.f388740b = o81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k81 k81VarB;
        long jA2;
        while (true) {
            o81 o81Var = this.f388740b;
            synchronized (o81Var) {
                k81VarB = o81Var.b();
            }
            if (k81VarB == null) {
                return;
            }
            n81 n81VarD = k81VarB.d();
            o81 o81Var2 = this.f388740b;
            o81 o81Var3 = o81.f388458h;
            boolean zIsLoggable = o81.b.a().isLoggable(Level.FINE);
            if (zIsLoggable) {
                jA2 = n81VarD.h().d().a();
                l81.a(k81VarB, n81VarD, "starting");
            } else {
                jA2 = -1;
            }
            try {
                try {
                    o81.a(o81Var2, k81VarB);
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                    if (zIsLoggable) {
                        long jA3 = n81VarD.h().d().a() - jA2;
                        StringBuilder sbA = Cif.a("finished run in ");
                        sbA.append(l81.a(jA3));
                        l81.a(k81VarB, n81VarD, sbA.toString());
                    }
                } finally {
                }
            } catch (Throwable th2) {
                if (zIsLoggable) {
                    long jA4 = n81VarD.h().d().a() - jA2;
                    StringBuilder sbA2 = Cif.a("failed a run in ");
                    sbA2.append(l81.a(jA4));
                    l81.a(k81VarB, n81VarD, sbA2.toString());
                }
                throw th2;
            }
        }
    }
}
