package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class us8 {
    public final ecf a;
    public final y8g b;
    public final y6d c;
    public long d;
    public final ss8 e;
    public zpb f;
    public int g;
    public ps8 h;
    public final CopyOnWriteArrayList i;

    public us8(ecf ecfVar, ss8 ss8Var, y8g y8gVar, y6d y6dVar) {
        this.a = ecfVar;
        this.b = y8gVar;
        this.c = y6dVar;
        ss8Var = ss8Var == null ? new ss8() : ss8Var;
        this.e = ss8Var;
        this.g = 1;
        this.h = new ps8(0.0d, 0.0d);
        this.i = new CopyOnWriteArrayList();
        y6dVar.log("MediaAdaptation", "Media adaptation control enabled. Configuration is " + ss8Var);
        CopyOnWriteArrayList copyOnWriteArrayList = ecfVar.j;
        if (copyOnWriteArrayList.contains(this)) {
            return;
        }
        copyOnWriteArrayList.add(this);
    }

    public final zpb a(int i) {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        bqb bqbVar;
        zpb zpbVar = this.f;
        if (zpbVar == null) {
            i2 = 1280;
            i3 = 1280;
            str = "maintain-framerate";
            i4 = 1000;
            i5 = 30;
            bqbVar = null;
        } else {
            int i6 = zpbVar.a;
            int i7 = zpbVar.b;
            int i8 = zpbVar.c;
            int i9 = zpbVar.d;
            bqb bqbVar2 = zpbVar.f;
            String str2 = zpbVar.e;
            str = str2 == null ? "maintain-framerate" : str2;
            i2 = i6;
            i3 = i7;
            i4 = i8;
            i5 = i9;
            bqbVar = bqbVar2;
        }
        int i10 = ts8.$EnumSwitchMapping$0[az1.v(i)];
        ss8 ss8Var = this.e;
        if (i10 == 1) {
            qs8 qs8Var = ss8Var.a;
            return new zpb(i2, i3, i4, i5, str, bqbVar, 2, 2, ho7.s(i));
        }
        if (i10 != 2) {
            zpb zpbVar2 = this.f;
            return zpbVar2 == null ? new zpb(i2, i3, i4, i5, str, bqbVar, 1, 0, ho7.s(i)) : new zpb(zpbVar2.a, zpbVar2.b, zpbVar2.c, zpbVar2.d, "maintain-framerate", zpbVar2.f, 1, zpbVar2.h, ho7.s(i));
        }
        qs8 qs8Var2 = ss8Var.a;
        return new zpb(i2, i3, i4, i5, str, bqbVar, 4, 3, ho7.s(i));
    }

    public final void b(int i, ps8 ps8Var) {
        this.c.log("MediaAdaptation", "Update network condition. Current condition is " + ho7.t(this.g) + ", new one is " + ho7.t(i) + ", state is " + ps8Var);
        this.g = i;
        this.h = ps8Var;
        c();
    }

    public final void c() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ns8 ns8Var = (ns8) it.next();
            int i = this.g;
            ps8 ps8Var = this.h;
            zpb zpbVarA = a(i);
            boolean z = true;
            if (this.g != 1) {
                qs8 qs8Var = this.e.a;
            } else {
                z = false;
            }
            ns8Var.n(new os8(i, ps8Var, zpbVarA, z));
        }
    }
}
