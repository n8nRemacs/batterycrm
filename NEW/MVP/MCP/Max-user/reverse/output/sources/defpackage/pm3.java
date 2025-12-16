package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class pm3 {
    public wg7 a;
    public mni b;
    public t95 c;
    public boolean d;
    public boolean e;
    public int f;
    public boolean g;

    public pm3 a() {
        boolean z;
        wg7 wg7Var = this.a;
        mni mniVar = this.b;
        t95 t95Var = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        int i = this.f;
        boolean z4 = this.g && i == 0;
        pm3 pm3Var = new pm3();
        Iterator it = wg7Var.iterator();
        if (it.hasNext()) {
            ((h95) it.next()).getClass();
            z = true;
        } else {
            z = false;
        }
        hsi.a("Composition must have at least one non-looping sequence.", z);
        pm3Var.a = wg7.j(wg7Var);
        pm3Var.b = mniVar;
        pm3Var.c = t95Var;
        pm3Var.d = z2;
        pm3Var.e = z3;
        pm3Var.f = i;
        pm3Var.g = z4;
        return pm3Var;
    }

    public pm3 b() {
        pm3 pm3Var = new pm3();
        pm3Var.a = this.a;
        pm3Var.b = this.b;
        pm3Var.c = this.c;
        pm3Var.d = this.d;
        pm3Var.e = this.e;
        pm3Var.f = this.f;
        pm3Var.g = this.g;
        return pm3Var;
    }
}
