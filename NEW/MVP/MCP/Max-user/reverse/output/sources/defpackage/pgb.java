package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class pgb implements wgg {
    public final /* synthetic */ qgb a;

    public pgb(qgb qgbVar) {
        this.a = qgbVar;
    }

    @Override // defpackage.wgg
    public final void c(se4 se4Var, ze4 ze4Var, boolean z) {
        qgb qgbVar = this.a;
        hn5 hn5Var = qgbVar.a;
        if (hn5Var == null) {
            hn5Var = null;
        }
        if (hn5Var != null) {
            hn5Var.c(se4Var, ze4Var, z);
        }
        Iterator it = qgbVar.b.iterator();
        while (it.hasNext()) {
            ((wgg) it.next()).c(se4Var, ze4Var, z);
        }
    }

    @Override // defpackage.wgg
    public final void d(se4 se4Var, ze4 ze4Var, boolean z, int i) {
        qgb qgbVar = this.a;
        hn5 hn5Var = qgbVar.a;
        if (hn5Var == null) {
            hn5Var = null;
        }
        if (hn5Var != null) {
            hn5Var.d(se4Var, ze4Var, z, i);
        }
        Iterator it = qgbVar.b.iterator();
        while (it.hasNext()) {
            ((wgg) it.next()).d(se4Var, ze4Var, z, i);
        }
    }

    @Override // defpackage.wgg
    public final void h(se4 se4Var, ze4 ze4Var, boolean z) {
        qgb qgbVar = this.a;
        hn5 hn5Var = qgbVar.a;
        if (hn5Var == null) {
            hn5Var = null;
        }
        if (hn5Var != null) {
            hn5Var.h(se4Var, ze4Var, z);
        }
        Iterator it = qgbVar.b.iterator();
        while (it.hasNext()) {
            ((wgg) it.next()).h(se4Var, ze4Var, z);
        }
    }

    @Override // defpackage.wgg
    public final void i(se4 se4Var, ze4 ze4Var, boolean z) {
        qgb qgbVar = this.a;
        hn5 hn5Var = qgbVar.a;
        if (hn5Var == null) {
            hn5Var = null;
        }
        if (hn5Var != null) {
            hn5Var.i(se4Var, ze4Var, z);
        }
        Iterator it = qgbVar.b.iterator();
        while (it.hasNext()) {
            ((wgg) it.next()).i(se4Var, ze4Var, z);
        }
    }
}
