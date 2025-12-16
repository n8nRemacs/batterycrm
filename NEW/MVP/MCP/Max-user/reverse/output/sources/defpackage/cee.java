package defpackage;

import android.graphics.Bitmap;
import androidx.media3.transformer.ExportException;

/* loaded from: classes.dex */
public final class cee implements au {
    public boolean X;
    public boolean Y;
    public final /* synthetic */ eee Z;
    public final long a;
    public final boolean b;
    public final boolean c;
    public final hf6 d;
    public final hf6 o;

    public cee(eee eeeVar, long j) {
        this.Z = eeeVar;
        this.a = j;
        boolean z = eeeVar.H0;
        this.b = z;
        boolean z2 = eeeVar.I0;
        this.c = z2;
        hsi.g(z || z2);
        ff6 ff6Var = new ff6();
        ff6Var.m = xz9.n("audio/raw");
        this.d = new hf6(ff6Var);
        ff6 ff6Var2 = new ff6();
        ff6Var2.m = xz9.n("audio/raw");
        ff6Var2.F = 44100;
        ff6Var2.E = 2;
        ff6Var2.G = 2;
        this.o = new hf6(ff6Var2);
    }

    public final void a() {
        boolean z = false;
        boolean z2 = true;
        boolean z3 = this.b && !this.X;
        boolean z4 = this.c && !this.Y;
        hsi.g(z3 || z4);
        eee eeeVar = this.Z;
        if (z3) {
            try {
                dee deeVarB = eeeVar.b(this.o);
                if (deeVarB == null) {
                    z = true;
                } else {
                    eee eeeVar2 = deeVarB.d;
                    if (eeeVar2.t0.decrementAndGet() == 0 && !eeeVar2.i()) {
                        eeeVar2.o.d(new bee(1, deeVarB));
                    }
                    this.X = true;
                }
            } catch (ExportException e) {
                eeeVar.c(e);
                return;
            } catch (RuntimeException e2) {
                eeeVar.c(ExportException.a(1000, e2));
                return;
            }
        }
        if (!z4) {
            z2 = z;
        } else if (eeeVar.b(eee.J0) != null) {
            eeeVar.h(Bitmap.createBitmap(new int[]{-16777216}, 1, 1, Bitmap.Config.ARGB_8888));
            this.Y = true;
            z2 = z;
        }
        if (z2) {
            eeeVar.o.a.postDelayed(new bee(0, this), 10L);
        }
    }

    @Override // defpackage.au
    public final int g(l16 l16Var) {
        boolean z = this.b && !this.X;
        boolean z2 = this.c && !this.Y;
        if (z && z2) {
            l16Var.b = 0;
            return 2;
        }
        if (z || z2) {
            l16Var.b = 50;
            return 2;
        }
        l16Var.b = 99;
        return 2;
    }

    @Override // defpackage.au
    public final ah7 j() {
        return ekd.Y;
    }

    @Override // defpackage.au
    public final void release() {
    }

    @Override // defpackage.au
    public final void start() {
        long j = this.a;
        eee eeeVar = this.Z;
        eeeVar.d(j);
        boolean z = this.c;
        boolean z2 = this.b;
        eeeVar.a((z2 && z) ? 2 : 1);
        if (z2) {
            eeeVar.e(2, this.d);
        }
        if (z) {
            eeeVar.e(2, eee.J0);
        }
        a();
    }
}
