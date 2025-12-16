package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class ood implements Closeable {
    public final j17 X;
    public final qod Y;
    public final ood Z;
    public final zmd a;
    public final epc b;
    public final String c;
    public final int d;
    public final f07 o;
    public final ood s0;
    public final ood t0;
    public final long u0;
    public final long v0;
    public final gge w0;

    public ood(zmd zmdVar, epc epcVar, String str, int i, f07 f07Var, j17 j17Var, qod qodVar, ood oodVar, ood oodVar2, ood oodVar3, long j, long j2, gge ggeVar) {
        this.a = zmdVar;
        this.b = epcVar;
        this.c = str;
        this.d = i;
        this.o = f07Var;
        this.X = j17Var;
        this.Y = qodVar;
        this.Z = oodVar;
        this.s0 = oodVar2;
        this.t0 = oodVar3;
        this.u0 = j;
        this.v0 = j2;
        this.w0 = ggeVar;
    }

    public static String c(ood oodVar, String str) {
        String strA = oodVar.X.a(str);
        if (strA != null) {
            return strA;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qod qodVar = this.Y;
        if (qodVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        qodVar.close();
    }

    public final boolean l() {
        int i = this.d;
        return 200 <= i && 299 >= i;
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.b + '}';
    }

    public final nod w() {
        nod nodVar = new nod();
        nodVar.a = this.a;
        nodVar.b = this.b;
        nodVar.c = this.d;
        nodVar.d = this.c;
        nodVar.e = this.o;
        nodVar.f = this.X.c();
        nodVar.g = this.Y;
        nodVar.h = this.Z;
        nodVar.i = this.s0;
        nodVar.j = this.t0;
        nodVar.k = this.u0;
        nodVar.l = this.v0;
        nodVar.m = this.w0;
        return nodVar;
    }
}
