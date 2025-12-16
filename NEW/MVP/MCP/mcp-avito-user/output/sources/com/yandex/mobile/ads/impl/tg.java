package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* loaded from: classes8.dex */
public final class tg implements kv0 {

    /* renamed from: a, reason: collision with root package name */
    private final vu f390200a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private ru f390201b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private to f390202c;

    public tg(vu vuVar) {
        this.f390200a = vuVar;
    }

    public final void a(gn gnVar, Uri uri, Map map, long j12, long j13, tu tuVar) throws wb1 {
        boolean z12 = true;
        to toVar = new to(gnVar, j12, j13);
        this.f390202c = toVar;
        if (this.f390201b != null) {
            return;
        }
        ru[] ruVarArrA = this.f390200a.a(uri, map);
        if (ruVarArrA.length == 1) {
            this.f390201b = ruVarArrA[0];
        } else {
            int length = ruVarArrA.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                ru ruVar = ruVarArrA[i12];
                try {
                } catch (EOFException unused) {
                    db.b(this.f390201b != null || toVar.getPosition() == j12);
                    toVar.c();
                } catch (Throwable th2) {
                    if (this.f390201b == null && toVar.getPosition() != j12) {
                        z12 = false;
                    }
                    db.b(z12);
                    toVar.c();
                    throw th2;
                }
                if (ruVar.a(toVar)) {
                    this.f390201b = ruVar;
                    toVar.c();
                    break;
                } else {
                    db.b(this.f390201b != null || toVar.getPosition() == j12);
                    toVar.c();
                    i12++;
                }
            }
            if (this.f390201b == null) {
                StringBuilder sbA = Cif.a("None of the available extractors (");
                int i13 = pc1.f388768a;
                StringBuilder sb2 = new StringBuilder();
                for (int i14 = 0; i14 < ruVarArrA.length; i14++) {
                    sb2.append(ruVarArrA[i14].getClass().getSimpleName());
                    if (i14 < ruVarArrA.length - 1) {
                        sb2.append(", ");
                    }
                }
                sbA.append(sb2.toString());
                sbA.append(") could read the stream.");
                String string = sbA.toString();
                uri.getClass();
                throw new wb1(string);
            }
        }
        this.f390201b.a(tuVar);
    }

    public final long b() {
        to toVar = this.f390202c;
        if (toVar != null) {
            return toVar.getPosition();
        }
        return -1L;
    }

    public final void c() {
        ru ruVar = this.f390201b;
        if (ruVar != null) {
            ruVar.release();
            this.f390201b = null;
        }
        this.f390202c = null;
    }

    public final void a() {
        ru ruVar = this.f390201b;
        if (ruVar instanceof jh0) {
            ((jh0) ruVar).a();
        }
    }

    public final void a(long j12, long j13) {
        ru ruVar = this.f390201b;
        ruVar.getClass();
        ruVar.a(j12, j13);
    }

    public final int a(fu0 fu0Var) {
        ru ruVar = this.f390201b;
        ruVar.getClass();
        to toVar = this.f390202c;
        toVar.getClass();
        return ruVar.a(toVar, fu0Var);
    }
}
