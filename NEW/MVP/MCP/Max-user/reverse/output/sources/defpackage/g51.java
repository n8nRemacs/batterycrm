package defpackage;

import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class g51 extends ConstraintLayout implements jn1, hn1 {
    @Override // defpackage.jn1
    public final void a(boolean z) {
        if (z) {
            nz5 nz5Var = new nz5(lee.g(new at(8, this), zx0.o));
            while (nz5Var.hasNext()) {
                ((jn1) nz5Var.next()).a(z);
            }
        }
    }

    @Override // defpackage.jn1
    public final void c(boolean z) {
        nz5 nz5Var = new nz5(lee.g(new at(8, this), zx0.X));
        while (nz5Var.hasNext()) {
            ((jn1) nz5Var.next()).c(z);
        }
    }

    @Override // defpackage.hn1
    public final void d(RectF rectF, boolean z) {
        nz5 nz5Var = new nz5(lee.g(new at(8, this), zx0.t0));
        while (nz5Var.hasNext()) {
            ((hn1) nz5Var.next()).d(rectF, z);
        }
    }

    @Override // defpackage.hn1
    public final void e(boolean z) {
        nz5 nz5Var = new nz5(lee.g(new at(8, this), zx0.d));
        while (nz5Var.hasNext()) {
            ((hn1) nz5Var.next()).e(z);
        }
    }

    @Override // defpackage.hn1
    public final void f(o98 o98Var, boolean z, long j) {
        nz5 nz5Var = new nz5(lee.g(new at(8, this), zx0.Y));
        while (nz5Var.hasNext()) {
            ((hn1) nz5Var.next()).f(o98Var, z, j);
        }
    }

    @Override // defpackage.jn1
    public final void g(o98 o98Var, boolean z, long j) {
        nz5 nz5Var = new nz5(lee.g(new at(8, this), zx0.Z));
        while (nz5Var.hasNext()) {
            ((jn1) nz5Var.next()).g(o98Var, z, j);
        }
    }

    @Override // defpackage.hn1
    public boolean getShouldScaleMainOpponent() {
        nz5 nz5Var = new nz5(lee.g(new at(8, this), zx0.s0));
        while (nz5Var.hasNext()) {
            if (((hn1) nz5Var.next()).getShouldScaleMainOpponent()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hn1
    public final void o(boolean z) {
        if (z) {
            nz5 nz5Var = new nz5(lee.g(new at(8, this), zx0.c));
            while (nz5Var.hasNext()) {
                ((hn1) nz5Var.next()).o(z);
            }
        }
    }
}
