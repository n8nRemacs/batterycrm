package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ykb implements j48, kyd {
    public l48 a;
    public vd b;
    public boolean c;
    public Bundle d;

    public static final void a(ykb ykbVar, c54 c54Var, c54 c54Var2, h54 h54Var, i54 i54Var) {
        if (c54Var != c54Var2 || i54Var.b || !h54Var.d() || c54Var2.getView() == null) {
            return;
        }
        l48 l48Var = ykbVar.a;
        if ((l48Var == null ? null : l48Var).d == l38.o) {
            if (l48Var == null) {
                l48Var = null;
            }
            l48Var.d(k38.ON_PAUSE);
            Bundle bundle = new Bundle();
            ykbVar.d = bundle;
            vd vdVar = ykbVar.b;
            (vdVar != null ? vdVar : null).s(bundle);
            ykbVar.c = true;
        }
    }

    @Override // defpackage.kyd
    public final pn l() {
        vd vdVar = this.b;
        if (vdVar == null) {
            vdVar = null;
        }
        return (pn) vdVar.d;
    }

    @Override // defpackage.j48
    public final l48 p() {
        l48 l48Var = this.a;
        if (l48Var == null) {
            return null;
        }
        return l48Var;
    }
}
