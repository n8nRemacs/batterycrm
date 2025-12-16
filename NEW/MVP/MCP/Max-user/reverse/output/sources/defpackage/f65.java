package defpackage;

import androidx.media3.transformer.ExportException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class f65 implements ba5 {
    public long a;
    public int c;
    public int e;
    public String f;
    public int h;
    public int i;
    public int j;
    public String l;
    public Object n;
    public Object p;
    public Object q;
    public int d = 0;
    public long b = -9223372036854775807L;
    public Object o = new AtomicInteger();
    public int k = -1;
    public int m = -1;
    public String g = "video/mp2t";

    public f65(String str, int i, int i2) {
        this.n = new umb(new byte[i2]);
        this.f = str;
        this.c = i;
    }

    @Override // defpackage.ba5
    public void a() {
        this.d = 0;
        this.e = 0;
        this.h = 0;
        this.b = -9223372036854775807L;
        ((AtomicInteger) this.o).set(0);
    }

    public nn5 b() {
        return new nn5(((tg7) this.n).i(), this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (gf3) this.o, this.i, this.j, this.k, this.l, (String) this.p, this.m, (ExportException) this.q);
    }

    public boolean c(umb umbVar, byte[] bArr, int i) {
        int iMin = Math.min(umbVar.a(), i - this.e);
        umbVar.h(this.e, bArr, iMin);
        int i2 = this.e + iMin;
        this.e = i2;
        return i2 == i;
    }

    public void d() {
        this.n = new tg7(4);
        this.a = -9223372036854775807L;
        this.b = -1L;
        this.c = -2147483647;
        this.d = -1;
        this.e = -2147483647;
        this.f = null;
        this.h = -2147483647;
        this.o = null;
        this.i = -1;
        this.j = -1;
        this.k = 0;
        this.l = null;
        this.m = 0;
        this.q = null;
    }

    @Override // defpackage.ba5
    public void e(int i, long j) {
        this.b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04d9  */
    @Override // defpackage.ba5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(defpackage.umb r41) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f65.f(umb):void");
    }

    public void g(d dVar) {
        int i = dVar.a;
        String str = dVar.c;
        int i2 = dVar.b;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        hf6 hf6Var = (hf6) this.q;
        if (hf6Var != null && i2 == hf6Var.F && i == hf6Var.G && str.equals(hf6Var.n)) {
            return;
        }
        hf6 hf6Var2 = (hf6) this.q;
        ff6 ff6Var = hf6Var2 == null ? new ff6() : hf6Var2.a();
        ff6Var.a = this.l;
        ff6Var.l = xz9.n(this.g);
        ff6Var.m = xz9.n(str);
        ff6Var.E = i2;
        ff6Var.F = i;
        ff6Var.d = this.f;
        ff6Var.f = this.c;
        hf6 hf6Var3 = new hf6(ff6Var);
        this.q = hf6Var3;
        ((sfg) this.p).d(hf6Var3);
    }

    @Override // defpackage.ba5
    public void h(boolean z) {
    }

    @Override // defpackage.ba5
    public void i(kp5 kp5Var, mjg mjgVar) {
        mjgVar.a();
        mjgVar.b();
        this.l = mjgVar.f;
        mjgVar.b();
        this.p = kp5Var.mo163B(mjgVar.e, 1);
    }
}
