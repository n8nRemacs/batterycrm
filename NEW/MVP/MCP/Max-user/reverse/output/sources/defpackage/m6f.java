package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m6f implements Comparable {
    public boolean a;
    public float o;
    public int v0;
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public boolean X = false;
    public final float[] Y = new float[9];
    public final float[] Z = new float[9];
    public ws[] s0 = new ws[16];
    public int t0 = 0;
    public int u0 = 0;

    public m6f(int i) {
        this.v0 = i;
    }

    public final void a(ws wsVar) {
        int i = 0;
        while (true) {
            int i2 = this.t0;
            if (i >= i2) {
                ws[] wsVarArr = this.s0;
                if (i2 >= wsVarArr.length) {
                    this.s0 = (ws[]) Arrays.copyOf(wsVarArr, wsVarArr.length * 2);
                }
                ws[] wsVarArr2 = this.s0;
                int i3 = this.t0;
                wsVarArr2[i3] = wsVar;
                this.t0 = i3 + 1;
                return;
            }
            if (this.s0[i] == wsVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void c(ws wsVar) {
        int i = this.t0;
        int i2 = 0;
        while (i2 < i) {
            if (this.s0[i2] == wsVar) {
                while (i2 < i - 1) {
                    ws[] wsVarArr = this.s0;
                    int i3 = i2 + 1;
                    wsVarArr[i2] = wsVarArr[i3];
                    i2 = i3;
                }
                this.t0--;
                return;
            }
            i2++;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((m6f) obj).b;
    }

    public final void d() {
        this.v0 = 5;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.o = 0.0f;
        this.X = false;
        int i = this.t0;
        for (int i2 = 0; i2 < i; i2++) {
            this.s0[i2] = null;
        }
        this.t0 = 0;
        this.u0 = 0;
        this.a = false;
        Arrays.fill(this.Z, 0.0f);
    }

    public final void e(d58 d58Var, float f) {
        this.o = f;
        this.X = true;
        int i = this.t0;
        this.c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.s0[i2].h(d58Var, this, false);
        }
        this.t0 = 0;
    }

    public final void g(d58 d58Var, ws wsVar) {
        int i = this.t0;
        for (int i2 = 0; i2 < i; i2++) {
            this.s0[i2].i(d58Var, wsVar, false);
        }
        this.t0 = 0;
    }

    public final String toString() {
        return "" + this.b;
    }
}
