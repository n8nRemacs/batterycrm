package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class kf8 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final long m;
    public final long n;
    public final boolean o;

    public kf8(jf8 jf8Var) {
        this.a = jf8Var.a;
        this.b = jf8Var.b;
        this.c = jf8Var.c;
        this.d = jf8Var.d;
        this.e = jf8Var.e;
        this.f = jf8Var.f;
        this.g = jf8Var.g;
        this.h = jf8Var.h;
        this.i = jf8Var.i;
        this.j = jf8Var.j;
        this.k = jf8Var.k;
        this.l = jf8Var.l;
        this.m = jf8Var.m;
        this.n = jf8Var.n;
        this.o = jf8Var.o;
    }

    public final kp8 a(ArrayList arrayList) {
        kp8 kp8Var;
        long j = this.e;
        if (j != -1) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                kp8Var = (kp8) it.next();
                if (kp8Var.c == j) {
                    break;
                }
            }
            kp8Var = null;
        } else {
            kp8Var = null;
        }
        return (kp8Var == null && arrayList.size() == 1) ? (kp8) arrayList.get(0) : kp8Var;
    }
}
