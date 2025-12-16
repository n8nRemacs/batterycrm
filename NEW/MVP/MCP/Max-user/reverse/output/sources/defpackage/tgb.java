package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class tgb implements jd {
    public final /* synthetic */ vgb a;

    public tgb(vgb vgbVar) {
        this.a = vgbVar;
    }

    @Override // defpackage.jd
    public final void E(id idVar, String str) {
        this.a.h = str;
    }

    @Override // defpackage.jd
    public final void H(ub8 ub8Var, g19 g19Var) {
        vgb vgbVar = this.a;
        zg6 zg6Var = vgbVar.l;
        ze4 ze4Var = ub8Var.a;
        rgb rgbVarC = c8j.c(ze4Var);
        vsb vsbVar = bf4.a;
        zg6Var.b(vgbVar, rgbVarC, bf4.a(g19Var.a));
        vgbVar.L = ze4Var.a.getHost();
    }

    @Override // defpackage.jd
    public final void K0(id idVar, String str) {
        this.a.g = str;
    }

    @Override // defpackage.jd
    public final void R(ub8 ub8Var, g19 g19Var) {
        hf6 hf6Var = (hf6) g19Var.g;
        int i = g19Var.b;
        if (i != 1 && i == 2 && hf6Var != null) {
            rui.b(hf6Var);
        }
        vgb vgbVar = this.a;
        zg6 zg6Var = vgbVar.l;
        rgb rgbVarC = c8j.c(ub8Var.a);
        vsb vsbVar = bf4.a;
        zg6Var.d(vgbVar, rgbVarC, bf4.a(g19Var.a));
    }

    @Override // defpackage.jd
    public final void d0(id idVar, ub8 ub8Var, g19 g19Var, IOException iOException, boolean z) {
        vgb vgbVar = this.a;
        zg6 zg6Var = vgbVar.l;
        rgb rgbVarC = c8j.c(ub8Var.a);
        vsb vsbVar = bf4.a;
        zg6Var.c(vgbVar, rgbVarC, bf4.a(g19Var.a), iOException);
    }

    @Override // defpackage.jd
    public final void o0(id idVar, String str) {
        this.a.g = null;
    }

    @Override // defpackage.jd
    public final void z(id idVar, String str) {
        this.a.h = null;
    }

    @Override // defpackage.jd
    public final void z0(id idVar, int i, long j, long j2) {
        vgb vgbVar = this.a;
        vgbVar.l.a(vgbVar);
    }
}
