package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xj6 implements uj6 {
    public final a84 a;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public md8 k;
    public mkd l;
    public rj6 b = rj6.d;
    public final String c = xj6.class.getName();
    public final bwf g = new bwf(new e44(21, this));
    public final int h = kti.d(120 * vw4.d().getDisplayMetrics().density);
    public final int i = kti.d(146 * vw4.d().getDisplayMetrics().density);
    public final int[] j = new int[2];

    public xj6(k18 k18Var, k18 k18Var2, k18 k18Var3, a84 a84Var) {
        this.a = a84Var;
        this.d = k18Var2;
        this.e = k18Var3;
        this.f = k18Var;
    }

    @Override // defpackage.uj6
    public final boolean a() {
        mkd mkdVar;
        md8 md8Var;
        g2h g2hVar = this.b.a;
        if (g2hVar != null) {
            return !g2hVar.d() ? (mkdVar = this.l) == null || !mkdVar.a() : (md8Var = this.k) == null || !md8Var.a();
        }
        wqi.e(this.c, "You should call init before prepare!", null);
        return false;
    }

    @Override // defpackage.uj6
    public final Object b(long j, Continuation continuation) {
        g2h g2hVar = this.b.a;
        if (g2hVar == null) {
            wqi.e(this.c, "You should call setVideoContent before extractFrame!", null);
            return null;
        }
        if (g2hVar.d()) {
            md8 md8Var = this.k;
            if (md8Var != null) {
                return md8Var.b(j, continuation);
            }
        } else {
            mkd mkdVar = this.l;
            if (mkdVar != null) {
                return mkdVar.b(j, continuation);
            }
        }
        return null;
    }

    @Override // defpackage.uj6
    public final void c(rj6 rj6Var) {
        g2h g2hVar = rj6Var.a;
        if (rj6Var.equals(this.b) || g2hVar == null) {
            return;
        }
        int i = rj6Var.b;
        int i2 = rj6Var.c;
        if (i == 0 || i2 == 0) {
            int width = g2hVar.getWidth();
            int height = g2hVar.getHeight();
            int[] iArr = this.j;
            int i3 = this.h;
            if (width <= 0 || height <= 0) {
                iArr[0] = i3;
                iArr[1] = i3;
            } else if (width < height) {
                nqi.a(i3, i3, width, height, iArr);
            } else {
                int i4 = this.i;
                nqi.a(i4, i4, width, height, iArr);
            }
            this.b = new rj6(g2hVar, iArr[0], iArr[1]);
        } else {
            this.b = rj6Var;
        }
        if (g2hVar.d()) {
            if (this.k == null) {
                this.k = new md8((lzf) this.e.getValue(), (hrb) this.d.getValue(), this.a);
            }
            md8 md8Var = this.k;
            if (md8Var != null) {
                md8Var.a = this.b;
                return;
            }
            return;
        }
        if (this.l == null) {
            this.l = new mkd((df7) this.g.getValue());
        }
        mkd mkdVar = this.l;
        if (mkdVar != null) {
            mkdVar.c = this.b;
        }
    }

    @Override // defpackage.uj6
    public final rj6 getData() {
        return this.b;
    }

    @Override // defpackage.uj6
    public final void prepare() {
        g2h g2hVar = this.b.a;
        String str = this.c;
        if (g2hVar == null) {
            wqi.e(str, "You should call init before prepare!", null);
            return;
        }
        if (!a()) {
            wqi.q(str, "Can't extract video frame", new Object[0]);
            return;
        }
        if (g2hVar.d()) {
            md8 md8Var = this.k;
            if (md8Var != null) {
                md8Var.prepare();
                return;
            }
            return;
        }
        mkd mkdVar = this.l;
        if (mkdVar != null) {
            mkdVar.prepare();
        }
    }
}
